package d5;

/**
 * 测试类
 */
public class PlayerDemo {
    public static void main(String[] args) {
        PingPangPlayer ppp = new PingPangPlayer("张继科", 30);
        System.out.println(ppp.getName() + "," + ppp.getAge());
        ppp.eat();
        ppp.speak();

        System.out.println("***************");

        BasketBallPlayer bp = new BasketBallPlayer("姚明", 33);
        System.out.println(bp.getName() + "," + bp.getAge());
        bp.eat();
    }
}
