package todoappproject;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ToDoAppProject {
    public static ToDo data = new ToDo();
    public static Scanner scanner = new Scanner(System.in);
    public static void menu() {
        System.out.println("Welcome--------");
        System.out.println("1 : List activities.");
        System.out.println("2 : Add an activity.");
        System.out.println("3 : Remove an activity.");
        System.out.println("4 : Edit an activity.");
        System.out.println("5 : Search an activity.");
    }
    public static void main(String[] args) throws FileNotFoundException, IOException{
        data.loadFromFile();
        do {            
            menu();
            System.out.print("Enter your choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if(choice == 1) {
                data.list();
            } else if(choice == 2) {
                data.add();
            } else if(choice == 3) {
                System.out.print("Enter title to delete : ");
                String title = scanner.nextLine();
                data.remove(title);
            } else if(choice == 4) {
                System.out.print("Enter title to edit : ");
                String toDoNeedEdit = scanner.nextLine();
                data.edit(toDoNeedEdit);
            } else if(choice == 5) {
                System.out.print("Enter title to search : ");
                String search = scanner.nextLine();
                System.out.println(data.searchToDO(search));
            } 
        } while (true);
    }
    
}
