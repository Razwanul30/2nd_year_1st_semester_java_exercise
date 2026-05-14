import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

class LogAnalyzerTask implements Runnable {

    private List<String> logs;
    private AtomicInteger currentIndex;
    private AtomicInteger suspiciousCount;

    public LogAnalyzerTask(List<String> logs,
                           AtomicInteger currentIndex,
                           AtomicInteger suspiciousCount) {
        this.logs = logs;
        this.currentIndex = currentIndex;
        this.suspiciousCount = suspiciousCount;
    }

    @Override
    public void run() {
        while (true) {
                int index = currentIndex.getAndIncrement();

                if (index >= logs.size()) {
                    break;
                }

                String log = logs.get(index);

                String threadName = Thread.currentThread().getName();

                System.out.println(threadName + " processing log index " + index + ": " + log);

                if (isSuspicious(log)) {
                    suspiciousCount.incrementAndGet();
                }
            }

    }

    private boolean isSuspicious(String log) {
        return log.contains("FAILED") && log.contains("LOGIN");
    }
}

public class WithThreadExample {

    public static void main(String[] args) throws InterruptedException {
        List<String> logs = generateLogs(1_000_000);

        AtomicInteger currentIndex = new AtomicInteger(0);
        AtomicInteger suspiciousCount = new AtomicInteger(0);

        LogAnalyzerTask task = new LogAnalyzerTask(
                logs,
                currentIndex,
                suspiciousCount
        );

        Thread t1 = new Thread(task,  "Worker-1");
        Thread t2 = new Thread(task,  "Worker-2");
        Thread t3 = new Thread(task,  "Worker-3");
        Thread t4 = new Thread(task,  "Worker-4");

        long start = System.currentTimeMillis();

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();

        long end = System.currentTimeMillis();

        System.out.println("Suspicious count: " + suspiciousCount.get());
        System.out.println("Time: " + (end - start) + " ms");
    }

    static List<String> generateLogs(int size) {
        List<String> logs = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            if (i % 10 == 0)
                logs.add("USER_" + i + " LOGIN FAILED");
            else
                logs.add("USER_" + i + " LOGIN SUCCESS");
        }

        return logs;
    }
}