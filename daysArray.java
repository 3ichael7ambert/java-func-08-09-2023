package Java.java-func-08-09-2023;

import java.util.Scanner;
class daysArray{
    public static void main(String[] args) {

        //fix the declaration of array
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        //do not change this code
        Scanner scanner = new Scanner(System.in);
        int  number = scanner.nextInt();
        System.out.println(days[number]);
    }
}