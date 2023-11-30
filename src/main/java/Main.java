import java.util.Scanner;
/**
 * @author Nenad Jovanovic
 * Main Class that contains the main method to run CRUD operations on the Task Class (Entity)
 */
public class Main {
    /**
     * This is the Main method that runs instance of ToDoList class
     * @param args
     */
    public static void main(String[] args){
        Task toDo = new Task();
        Scanner scan = new Scanner(System.in);
        int choice;
        boolean inProgress = true;

        while(inProgress){
            toDo.printInstructions();
            choice = scan.nextInt();
            // switch statements that follow instructions from ToDoList class
            switch(choice){
                case 0:
                    inProgress=false;
                    break;
                case 1:
                    toDo.showItems();
                    break;
                case 2:
                    System.out.println("Please add an item:");
                    scan.nextLine();
                    toDo.addItem(scan.nextLine());
                    toDo.showItems();
                    break;
                case 3:
                    toDo.showItems();
                    System.out.println("Enter Item ID to be removed:");
                    toDo.removeItem(scan.nextInt());
                    toDo.showItems();
                    break;
            }
        }
    }
}
