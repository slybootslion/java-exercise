package d5;

public class BasketBallPlayer extends Player {
    public BasketBallPlayer() {
    }

    public BasketBallPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("篮球运动员打篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃牛肉");
    }
}
