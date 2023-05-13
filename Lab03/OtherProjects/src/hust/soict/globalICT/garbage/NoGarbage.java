package hust.soict.globalICT.garbage;

import java.io.IOException;

public class NoGarbage {
    private static final long MAX_TIME = 5000;
    public static void main(String[] args) throws IOException, InterruptedException {
        long start = System.currentTimeMillis();
        Process process = Runtime.getRuntime().exec("java GarbageCreator");

        while (true) {
            if (System.currentTimeMillis() - start > MAX_TIME) {
                process.destroy();
                System.out.println("Program timed out");
                return;
            }
            if (process.waitFor() == 0) {
                System.out.println("Program completed");
                return;
            }
        }
    }
}