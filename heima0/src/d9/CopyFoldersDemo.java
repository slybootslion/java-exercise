package d9;

import java.io.*;

public class CopyFoldersDemo {
    public static void main(String[] args) throws IOException {
        // 创建目标文件夹的对象
        File srcFile = new File("fileTest/dirCopy");
        // 创建复制目的地文件夹的对象
        File destFile = new File("fileTest/toCopy");
        copyFolder(srcFile, destFile);
    }

    // 复制文件夹的方法
    private static void copyFolder(File srcFile, File destFile) throws IOException {
        // 判断是不是文件夹
        if (srcFile.isDirectory()) {
            // 是文件夹 创建并递归调用
            File newFolder = getNewFile(destFile, srcFile);
            if (!newFolder.exists()) {
                newFolder.mkdir();
            }

            File[] fileList = srcFile.listFiles();

            for (File file : fileList) {
                copyFolder(file, newFolder);
            }
        } else {
            // 不是文件夹， 复制文件
            File newFile = getNewFile(destFile, srcFile);
            copyFile(srcFile, newFile);
        }
    }

    // 获取新文件、文件夹路径
    // 其实没有必要这么写 反而复杂了
    private static File getNewFile(File destFile, File srcFile) {
        return new File(destFile, srcFile.getName());
    }


    // 复制文件的方法
    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }

        bos.close();
        bis.close();
    }


}
