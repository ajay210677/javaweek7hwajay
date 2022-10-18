package javaweek7hw;

import java.util.Scanner;

public class Que2 {
static int a;

    public static void main(String[] args) {
myMethod();
    }
    public static void myMethod(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        a = sc.nextInt();
        if(a%4==0){
            System.out.println(a + "is a Leap Year");
        } else if (a % 400 == 0){
            System.out.println("is a Leap Year");
        }else{
            System.out.println("is not a Leap Year");


        }
    }
}
