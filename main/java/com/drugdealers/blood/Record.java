package com.drugdealers.blood;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by johnwang on 5/30/18.
 */

public class Record {
    private int high;
    private int low;

    private static List<Record> single;

    public static List<Record> get() {
        if (single == null) {
            single = new ArrayList<>();
        }

        return single;
    }


    public Record(int high, int low) {
        this.high = high;
        this.low = low;
    }

    public Record(String high, String low) {
        this.high = Integer.parseInt(high);
        this.low = Integer.parseInt(low);
    }


    public int getHigh() {
        return high;
    }

    public int getLow() {
        return low;
    }

    @Override
    public String toString() {
        return "Record{" +
                "high=" + high +
                ", low=" + low +
                '}';
    }
}
