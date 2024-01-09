package ch00.armstrong;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

public class Logger {
    private final Date startDate = new Date();
    private final Map<Integer, Long> results = new TreeMap<>();
    public static boolean show = false;

    public void log(int value) {
        results.putIfAbsent(value, new Date().getTime() - startDate.getTime());
    }

    public void print() {
        if (show) {
            for (Map.Entry<Integer, Long> entry : results.entrySet()) {
                System.out.println(entry.getValue() + " found armstrong number: " + entry.getKey());
            }
        }
    }
}
