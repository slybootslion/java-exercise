package d8;

public class DiGuiDemo {
    public static void main(String[] args) {
        System.out.println(jc(5));
    }

    private static int jc(int n) {
        return n == 1 ? 1 : n * jc(n -1);
    }
}
