import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class PrintOddNumbers extends Thread {
    private final int limit;

    public PrintOddNumbers(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 1; i <= limit; i += 2) {
            synchronized (System.out) {
                System.out.println("Odd Number: " + i);
            }
            try {
                Thread.sleep(500); // Sleep for half a second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class PrintEvenNumbers extends Thread {
    private final int limit;

    public PrintEvenNumbers(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 2; i <= limit; i += 2) {
            synchronized (System.out) {
                System.out.println("Even Number: " + i);
            }
            try {
                Thread.sleep(500); // Sleep for half a second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class PrintDateTime extends Thread {
    @Override
    public void run() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        while (true) {
            synchronized (System.out) {
                LocalDateTime now = LocalDateTime.now();
                System.out.println("Current Date and Time: " + dtf.format(now));
            }
            try {
                Thread.sleep(1000); // Sleep for one second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultithreadedExample {
    public static void main(String[] args) {
        int limit = 20; // Set the limit for odd and even number printing

        PrintOddNumbers oddThread = new PrintOddNumbers(limit);
        PrintEvenNumbers evenThread = new PrintEvenNumbers(limit);
        PrintDateTime dateTimeThread = new PrintDateTime();

        oddThread.start();
        evenThread.start();
        dateTimeThread.start();
    }
}
