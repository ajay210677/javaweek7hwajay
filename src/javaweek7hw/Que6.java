package javaweek7hw;

import java.util.Scanner;

public class Que6 {
    static Scanner sc = new Scanner(System.in);
    static int a;
    public static void main(String[] args) {
        oddEven();
    }

    public static void oddEven() {
        System.out.print("Enter any number: ");
        a = sc.nextInt();
        if(a%2==0){
            System.out.println("Entered number is EVEN");
        }else{
            System.out.println("Entered number is ODD");
        }
    }
}
