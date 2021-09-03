package cz.martin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        //int number = sc.nextInt();
        float n;
        float sum = 0;
        System.out.println("Zadej číslo:");

        while(true) {
            try {
                n = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Toto není číslo. Zkus to znovu.");
            }
        }


        for (int i = 1; i <= n; i++) {
            System.out.println("1/"+i+" => "+ 1f/i);
            sum+=1f/i;
        }

        System.out.println("Celkem => "+sum);
    }
}
