package com.uladkaminski.lintcode;

import java.util.List;

public class CanAttendMeetings {

    public boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals.size() > 0) {
            int max = intervals.stream().mapToInt(i -> i.end).max().getAsInt();
            boolean[] slots = new boolean[max + 1];
            for (Interval interval : intervals) {
                for (int j = interval.start; j < interval.end; ++j) {
                    if (slots[j]) {
                        return false;
                    }
                    slots[j] = true;
                }
            }
        }

        return true;
    }

}

class Interval {
    int start, end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}