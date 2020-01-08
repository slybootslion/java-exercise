package d10;

public class Producer implements Runnable {
    private Box b;

    public Producer(Box box) {
        this.b = box;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            b.put(i + 1);
        }
    }
}
