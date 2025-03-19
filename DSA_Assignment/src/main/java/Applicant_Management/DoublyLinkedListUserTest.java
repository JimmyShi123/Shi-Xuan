/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Applicant_Management;
import java.util.Scanner;
import adt.*;

/**
 * A test program that lets the user input to test the Doubly Linked List ADT.
 * 
 * @author PC
 */
public class DoublyLinkedListUserTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedListInterface<String> list = new DoublyLinkedList<>();

        int choice;
        do {
            System.out.println("\n--- Doubly Linked List Menu ---");
            System.out.println("1. Add Element");
            System.out.println("2. Add Element at Position");
            System.out.println("3. Remove Element at Position");
            System.out.println("4. Replace Element at Position");
            System.out.println("5. Display List");
            System.out.println("6. Check if List Contains Element");
            System.out.println("7. Clear List");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter element to add: ");
                    String data = scanner.nextLine();
                    list.add(data);
                    System.out.println(data + " added.");
                }
                case 2 -> {
                    System.out.print("Enter position to insert: ");
                    int pos = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter element to add: ");
                    String data = scanner.nextLine();
                    if (list.add(pos, data)) {
                        System.out.println(data + " added at position " + pos + ".");
                    } else {
                        System.out.println("Invalid position!");
                    }
                }
                case 3 -> {
                    System.out.print("Enter position to remove: ");
                    int pos = Integer.parseInt(scanner.nextLine());
                    String removed = list.remove(pos);
                    if (removed != null) {
                        System.out.println(removed + " removed.");
                    } else {
                        System.out.println("Invalid position!");
                    }
                }
                case 4 -> {
                    System.out.print("Enter position to replace: ");
                    int pos = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter new element: ");
                    String newData = scanner.nextLine();
                    if (list.replace(pos, newData)) {
                        System.out.println("Replaced successfully.");
                    } else {
                        System.out.println("Invalid position!");
                    }
                }
                case 5 -> displayList(list);
                case 6 -> {
                    System.out.print("Enter element to search: ");
                    String search = scanner.nextLine();
                    if (list.contains(search)) {
                        System.out.println(search + " is in the list.");
                    } else {
                        System.out.println(search + " not found.");
                    }
                }
                case 7 -> {
                    list.clear();
                    System.out.println("List cleared.");
                }
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        scanner.close();
    }

    /**
     * Display all elements in the list.
     */
    private static void displayList(DoublyLinkedListInterface<String> list) {
        if (list.isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }
        System.out.print("List content: ");
        for (int i = 1; i <= list.size(); i++) {
            System.out.print(list.getEntry(i) + " <-> ");
        }
        System.out.println("null");
    }
}
