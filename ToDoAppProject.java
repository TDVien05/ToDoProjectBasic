package todoappproject;

import java.util.Scanner;

public class ToDoAppProject {
    public static Scanner scanner = new Scanner(System.in);
    public static void menu() {
        System.out.println("Welcome--------");
        System.out.println("1 : Add an activity.");
        System.out.println("1 : Remove an activity.");
        System.out.println("1 : Edit an activity.");
    }
    public static void main(String[] args) {
        ToDo data = new ToDo();
        do {            
            menu();
            System.out.print("Enter your choice : ");
            int choice = scanner.nextInt();
            if(choice == 1) {
                data.add();
            } else if(choice == 2) {
                System.out.print("Enter title to delete : ");
                String title = scanner.nextLine();
                data.remove(title);
            } else if(choice == 3) {
                System.out.print("Enter title to edit : ");
                String toDoNeedEdit = scanner.nextLine();
                data.edit(toDoNeedEdit);
            }
        } while (true);
    }
    
}
