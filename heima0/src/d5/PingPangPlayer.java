package d5;

public class PingPangPlayer extends Player implements SpeakEnglish {
    public PingPangPlayer() {
    }

    public PingPangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("乒乓球运动员打乒乓球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃羊肉");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球运动员说英语");
    }
}
