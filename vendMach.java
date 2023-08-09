package Java.java-func-08-09-2023;

import  java.util.Scanner;

public class vendMach {
    public static void main(String[] args) {
        String[] menu = {"Tea", "Espresso", "Americano", "Water", "Hot Chocolate"};
        Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
if (num>=0 && num<5) {
 System.out.println(menu[num]);
        }
        else {
        	System.out.println("Invalid");
        }
    }

}