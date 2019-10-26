package com.slybootslion.d8;

import java.io.File;

public class DemoRecurisonFile {

    public static void main(String[] args) {
        File dir = new File("dir");
        File absoluteFile = dir.getAbsoluteFile();
        getAllFile(absoluteFile);
    }

    private static void getAllFile(File dir) {
//        System.out.println(dir); 打印要遍历的目录
        File[] f = dir.listFiles();
        for (File file : f) {
            if (file.isDirectory()) {
                getAllFile(file);
            } else {
//                System.out.println(file); // 打印目录中的文件
                /*
                 * 只打印以.html结尾的文件
                 * */
                // 获取文件名 转小写 判断是否包含对应文字
                if (file.getName().toLowerCase().endsWith(".html")) {
                    System.out.println(file);
                }
            }
        }
    }
}

