package hust.soict.globalICT.garbage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Program Files\\webDriver\\chromedriver.exe";
        byte[] inputBytes = { 0 };
        long startTime = System.currentTimeMillis(), endTime;
        inputBytes = Files.readAllBytes(Paths.get(filename));
        String outputString = "";
        for(byte b: inputBytes) {
            outputString += (char)b;
        }
//        StringBuilder outputStringBuilder = new StringBuilder();
//        for(byte b: inputBytes) {
//            outputStringBuilder.append((char) b);
//        }
//        System.out.println("String buffer time: ");
//        System.out.println(System.currentTimeMillis() - startTime);
//        startTime = System.currentTimeMillis();
//        StringBuffer outputStringBuffer = new StringBuffer();
//        for(byte b: inputBytes) {
//            outputStringBuffer.append((char) b);
//        }
//        System.out.println("String buffer time: ");
//        System.out.println(System.currentTimeMillis() - startTime);
    }
}
