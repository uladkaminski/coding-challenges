package com.uladkaminski.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeConversion {

    static String timeConversion(String s) {
        LocalTime time = LocalTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa"));
        return time.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
