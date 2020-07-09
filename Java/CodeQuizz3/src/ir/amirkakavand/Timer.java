package ir.amirkakavand;

public class Timer {
    public static void main(String[] args) {
        Number n = new Number();
        while (true)
            n.run();
    }
}

class Number extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
