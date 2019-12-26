package d8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPicDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fileTest/dirOne/arcticfox.jpg");
        FileOutputStream fos = new FileOutputStream("fileTest/dirTwo/arcticfox.jpg");

        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys, 0, len);
        }

        fis.close();
        fos.close();
    }
}
