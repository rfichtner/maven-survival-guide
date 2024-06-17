package com.xdevsoftware;

import java.io.FileOutputStream;
import java.io.IOException;

public class Write {
    public void writeToFile() throws IOException {
        String str = "Hello";
        FileOutputStream outputStream = new FileOutputStream("file.data");
        byte[] strToBytes = str.getBytes();
        outputStream.write(strToBytes);

        outputStream.close();
        System.out.println("done writing");
    }
}
