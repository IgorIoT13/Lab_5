package ua.lviv.iot.algo.part1.lab5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        FilterText filterText = new FilterText();
        Scanner scanner = new Scanner(System.in);
        int scanInt = scanner.nextInt();
        filterText.Filter(scanInt);
        System.out.println(filterText.outInfoMethod());
    }
}
