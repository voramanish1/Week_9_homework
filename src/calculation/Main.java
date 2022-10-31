package calculation;

import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {
        int a, b;
        char symbol, repeat;
        Main obj = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        a = sc.nextInt();
        System.out.print("Enter number 2: ");
        b = sc.nextInt();
        System.out.println("Select any operator from '+'|'-'|'/'|'*' to get calculation ");
        symbol = sc.next().charAt(0);
        obj.calculateResult(a, b, symbol);

        System.out.print("Calculate again! 'Y||y' for Yes ,'N||n' for No ");
        while (sc.hasNext()) {
            repeat = sc.next().charAt(0);
            if (repeat == 'y' || repeat == 'Y') {
                System.out.print("Enter number 1: ");
                a = sc.nextInt();
                System.out.print("Enter number 2: ");
                b = sc.nextInt();
                System.out.println("Select any operator from '+'|'-'|'/'|'*' to get calculation ");
                symbol = sc.next().charAt(0);
                obj.calculateResult(a, b, symbol);
                System.out.print("Calculate again! 'Y||y' for Yes ,'N||n' for No ");
            } else {
                System.out.println("Program Terminated ");
            }
        }
    }
}