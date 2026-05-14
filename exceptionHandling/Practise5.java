import java.io.FileReader;

class Practise5 {
    static void filereader () throws Exception {
        FileReader file = new FileReader("test.txt");
    }

        public static void main(String[] args) {
            try {
                filereader();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
}