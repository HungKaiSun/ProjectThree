import java.util.Scanner;

/**
 * @author  Hung-Kai Sun
 *
 *Overview:
 * this is the driver class
 * includes menu to have the differnt choices
 */

public class Demo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Key_Value hashTable = new Key_Value();

        int decision, choice;

        //print the choice list
        do{
            System.out.println("\nEnter your choice: ");
            System.out.println("Enter 1 to add a number: ");
            System.out.println("Enter 2 to search for a number: ");
            System.out.println("Enter 3 to delete a number: ");
            System.out.println("Enter 4 to print the table: ");
            System.out.println("Enter 0 to quit: ");

            //test if it is an integer
            while(!input.hasNextInt()){
                input.nextLine();
                System.out.println("Please enter a integer ");
            }

            decision = input.nextInt();
            switch (decision){
                //quit
                case 0:
                    break;
                    //ask user to input the number
                case 1:
                    System.out.println("Enter the number you want to add: ");
                    while(!input.hasNextInt()){
                        input.nextLine();
                        System.out.println("Please enter a integer ");
                    }
                    choice = input.nextInt();
                    hashTable.hashing(choice);
                    break;
                    //search the num in index
                case 2:
                    System.out.println("Enter the index you want to search: ");
                    while(!input.hasNextInt()){
                        input.nextLine();
                        System.out.println("Please enter a integer ");
                    }
                    choice = input.nextInt();
                    hashTable.search(choice);
                    break;
                    //delete the number in the index
                case 3:
                    System.out.println("Enter the index you want to delete: ");
                    while(!input.hasNextInt()){
                        input.nextLine();
                        System.out.println("Please enter a integer ");
                    }
                    choice = input.nextInt();
                    hashTable.delete(choice);
                    break;
                    //print the table
                case 4:
                    hashTable.printTable();
                    break;
                default:
                    continue;
            }

        }while(decision != 0);

    }

}
