package d10;

public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket sellTicket = new SellTicket();
        Thread w1 = new Thread(sellTicket, "窗口1");
        Thread w2 = new Thread(sellTicket, "窗口2");
        Thread w3 = new Thread(sellTicket, "窗口3");

        w3.start();
        w1.start();
        w2.start();
    }
}
