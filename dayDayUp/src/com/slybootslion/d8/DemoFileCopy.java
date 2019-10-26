package com.slybootslion.d8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFileCopy {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();

        File dir = new File("dir/dir.html");
        File absoluteFile = dir.getAbsoluteFile();

        File dir2 = new File("dir/a/dir.html");
        File absoluteFile2 = dir2.getAbsoluteFile();

        FileInputStream fis = new FileInputStream(absoluteFile);
        FileOutputStream fos = new FileOutputStream(absoluteFile2);

        byte[] b = new byte[10];
        int c = 0;
        while ((c = fis.read(b)) != -1) {
            fos.write(b, 0, c);
        }

        fos.close();
        fis.close();

        long e = System.currentTimeMillis();
        System.out.println("文件复制耗时：" + (e - s) + "毫秒");
    }
}
