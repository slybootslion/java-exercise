package d8;

import java.io.File;

public class DiGuiDemo2 {
    public static void main(String[] args) {
        File srcFile = new File("../heima0/fileTest");
        getAllFilePath(srcFile);
    }

    private static void getAllFilePath(File srcFile) {
        // 获取指定目录下的所有文件和目录数组
        File[] files = srcFile.listFiles();
        if (files != null) {
            for (File file : files) {
                // 如果是目录，递归调用
                if (file.isDirectory()) {
                    getAllFilePath(file);
                } else {
                    // 如果是文件 打印绝对路径
                    System.out.println(file.getAbsolutePath());
                }
            }
        }

    }
}
