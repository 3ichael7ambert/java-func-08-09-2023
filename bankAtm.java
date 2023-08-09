package Java.java-func-08-09-2023;

import java.util.Scanner;

public class bankAtm{
   public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            number = scanner.nextInt();
            if (number==1) {System.out.println("Language selection");}
            	if (number==2) {System.out.println("Customer support");}
            	if (number==3) {System.out.println("Check the balance");}
				if (number==0) {System.out.println("Exit");break;}
            
        }
        while(number != 0);
   }
}
