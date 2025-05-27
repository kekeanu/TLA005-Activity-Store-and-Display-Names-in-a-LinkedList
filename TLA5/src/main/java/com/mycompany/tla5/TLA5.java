/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tla5;
import java.util.Scanner;
import java.util.LinkedList;
/**
 *
 * @author Student's Account
 */
public class TLA5 {
        private static LinkedList<String> names = new LinkedList<>();
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("------------------------------------");
            System.out.println("                MENU                ");
            System.out.println("------------------------------------");
            System.out.println("\n1. View Name");
            System.out.println("2. Add Name");
            System.out.println("3. Remove Name");
            System.out.println("4. Exit");
            System.out.print("\nEnter Choice: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    viewName();
                    break;
                case 2:
                    addName();
                    break;
                case 3:
                    removeName();
                    break;
                case 4:
                    System.out.println("------------------------------------");
                    System.out.println("Exit Program.");
                    System.exit(0);
                default:
                    System.out.println("------------------------------------");
                    System.out.println("Invalid");

            }
        }
    }

    public static void viewName() {
        if (names.isEmpty()) {
            System.out.println("------------------------------------");
            System.out.println("Name List is empty.");
        } else {
            System.out.println("------------------------------------");
            System.out.println("             STORED NAME            ");
            System.out.println("------------------------------------");
            for (String n : names) {
                System.out.println(n);
            }
        }
    }

    public static void addName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------");
        System.out.println("              ADD NAME              ");
        System.out.println("------------------------------------");
        System.out.print("Enter Name: ");
        String addName = scanner.nextLine();

        if (!names.contains(addName)) {
            names.add(addName);
            System.out.println("Name successfully added.");
        } else {
            System.out.println("Name is already added.");
        }
    }

    public static void removeName() {
        Scanner scanner = new Scanner(System.in);

        if (names.isEmpty()) {
            System.out.println("------------------------------------");
            System.out.println("Nothing to Delete.");
        } else {
            System.out.println("------------------------------------");
            System.out.println("             REMOVE NAME             ");
            System.out.println("------------------------------------");
            System.out.print("Enter Name: ");
            String rName = scanner.nextLine();

            if (names.contains(rName)) {
                names.remove(rName);
                System.out.println("Name successfully removed.");
            } else {
                System.out.println("Name not found in the list.");
            }
        }
    }
}
    

