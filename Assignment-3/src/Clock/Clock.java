package Clock;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");

    public static void main(String[] args) {
        Thread updateTimeThread = new Thread(() -> {
            while (true) {
                Date now = new Date();
                System.out.println("Updating time: " + sdf.format(now));
                try {
                    Thread.sleep(1000); // Update every second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread displayTimeThread = new Thread(() -> {
            while (true) {
                Date now = new Date();
                System.out.println("Current time: " + sdf.format(now));
                try {
                    Thread.sleep(1000); // Update every second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        displayTimeThread.setPriority(Thread.MAX_PRIORITY); // Display thread has higher priority
        updateTimeThread.setPriority(Thread.MIN_PRIORITY); // Update thread has lower priority

        updateTimeThread.start();
        displayTimeThread.start();
    }
}
