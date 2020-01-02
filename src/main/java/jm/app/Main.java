package jm.app;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static final long DEFAULT_SLEEP_TIME = 5000L;

    public static final SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        while (true) {
            System.out.println("[Heartbeat] " + dateFormatter.format(new Date()));
            try {
                Thread.sleep(DEFAULT_SLEEP_TIME);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
