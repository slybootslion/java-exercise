package d2;

public class Demo01_ArrayMax {
    public static void main(String[] args) {
        int[] arr = {12, 45, 98, 73, 60};
        int maxNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(maxNum < arr[i]){
                maxNum = arr[i];
            }
        }
        System.out.println("最大值为：" + maxNum);
    }
}
