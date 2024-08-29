package todoappproject;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDo {
    private String title;
    private String description;
    private String startDate;
    private String finishDate;
    private int checkStatus;
    private String note;
    
    public static Scanner scanner = new Scanner(System.in);
    
    private ArrayList<ToDo> data = new ArrayList<ToDo>();
    
    public ToDo() {
        this.data = new ArrayList<ToDo>();
    }

    public ToDo(String title, String description, String startDate, String finishDate, int checkStatus, String note) {
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.checkStatus = checkStatus;
        this.note = note;
    }
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    public int getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(int checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    public void add() {
        System.out.print("Enter title : ");
        String title = scanner.nextLine();
        System.out.print("Enter description : ");
        String description = scanner.nextLine();
        System.out.print("Enter start date : ");
        String startDate = scanner.nextLine();
        System.out.print("Enter deadline : ");
        String finishDate = scanner.nextLine();
        System.out.print("Enter status : ");
        int status = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your note : ");
        String note = scanner.nextLine();
        ToDo td = new ToDo(title, description, startDate, finishDate, checkStatus, note);
        this.data.add(td);
    }
    
    public void remove(String title) {
        for(ToDo td : data) {
            if(td.getTitle().equalsIgnoreCase(title)) {
                this.data.remove(td);
                break;
            }
        }
    }
    
    public void edit(String toDoNeedEdit) {
        for(ToDo td : this.data) {
            if(td.getTitle().equalsIgnoreCase(toDoNeedEdit)) {
                System.out.print("Enter new title : ");
                td.title = scanner.nextLine();
                System.out.print("Enter new description : ");
                td.description = scanner.nextLine();
                System.out.print("Enter new start date : ");
                td.startDate = scanner.nextLine();
                System.out.print("Enter new dealine : ");
                td.finishDate = scanner.nextLine();
                break;
            }
        } 
    }
    

}
