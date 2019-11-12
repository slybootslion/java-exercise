package d1;

public class zhuMuLangMaFeng {
    public static void main(String[] args) {
        int c = 0;
        int zf = 8844430;
        double paper = 0.1;

        while (paper < zf) {
            paper *= 2;
            c++;
        }

        System.out.println("折叠" + c + "次之后，纸张厚度超过珠峰");
    }
}
