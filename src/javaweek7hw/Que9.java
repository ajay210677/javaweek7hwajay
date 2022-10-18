package javaweek7hw;

import java.util.Scanner;

public class Que9 {
    static char city;
    public static void main(String[] args) {
        getCityName();
    }

    public static void cityInitialSelection() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Initial of city A to F || a to f to get city name: ");
        city = sc.next().charAt(0);
    }

    public static void getCityName() {
        cityInitialSelection();
        switch (city) {
            case 'A' -> System.out.println("Ahmedabad");
            case 'a' -> System.out.println("Ahmedabad");
            case 'B' -> System.out.println("Surat");
            case 'b' -> System.out.println("surat");
            case 'C' -> System.out.println("Mumbai");
            case 'c' -> System.out.println("Mumbai");
            case 'D' -> System.out.println("Valsad");
            case 'd' -> System.out.println("Valsad");
            case 'E' -> System.out.println("England");
            case 'e' -> System.out.println("England");
            case 'F' -> System.out.println("Germany");
            case 'f' -> System.out.println("Germany");
            default -> System.out.println("Enter valid Initial of city");
        }
    }

}
