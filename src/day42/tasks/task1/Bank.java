package day42.tasks.task1;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {
        Account account1 = new Account(Currency.USD);
        account1.setNumber("12929494");
        account1.setBalance(1000.0);
        System.out.println(account1);

        Account account2 = new Account(Currency.EU);
        account2.setNumber("1883028503");
        account2.setBalance(9000.0);
        System.out.println(account2);


        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
    }
}