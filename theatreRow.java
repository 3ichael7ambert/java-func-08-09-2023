package Java.java-func-08-09-2023;

import java.util.Scanner;

public class theatreRow {
    
    public static void main(String[] args) {


        int[][] seats = {
        {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
        {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
        {0, 1, 1, 1, 0, 0, 0, 1, 1, 1}
        };
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        	int y = sc.nextInt();
        	if (seats[x][y]==0) {
        		System.out.println("Free");
        	} else {
        		System.out.println("Sold");
        	}
        

    }

}