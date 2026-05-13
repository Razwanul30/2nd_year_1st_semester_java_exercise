import java.util.*;

public class WithoutThreadExample {

    public static void main(String[] args) {
        List<String> logs = generateLogs(1_000_000);

        int suspiciousCount = 0;

        long start = System.currentTimeMillis();

        for (String log : logs) {
            if (isSuspicious(log)) {
                suspiciousCount++;
            }
        }

        long end = System.currentTimeMillis();

        System.out.println("Suspicious count: " + suspiciousCount);
        System.out.println("Time: " + (end - start) + " ms");
    }

    static boolean isSuspicious(String log) {
        return log.contains("FAILED") && log.contains("LOGIN");
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