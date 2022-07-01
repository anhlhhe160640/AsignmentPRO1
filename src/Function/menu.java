/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;
import Information.book;
import Validation.inputValidation;
/**
 *
 * @author admin
 */
public class menu {
    public static Boolean isExit = false;

    public static void menu() {
        System.out.println("1.	Input & add book(s) to the end.");
        System.out.println(" 2.	Display all books.");
        System.out.println(" 3.	Search book by code.");
        System.out.println("4.	Update the book’s price for given code.");
        System.out.println("5.	Find the (first) max price value.");
        System.out.println("6.	Sort the list ascendingly by code.");
        System.out.println("7.	Remove the book having given code.");
        System.out.println("8.	Load data from file.");
        System.out.println("9.	Save data to file.");
        System.out.println("0.	Exit");
        System.out.println("==========================================================");
        System.out.println("Enter your choice: ");
    }
    public static int getChoice() {
        return inputValidation.Int();
    }
    public static void run(int choice) {
        

        switch (choice) {
            case 1:
           menuFunction.addmanyBook();
            break;
            case 2:
            menuFunction.showBook();
            break;
            case 3:
            menuFunction.searchbycode(inputValidation.string());
            break;
            case 4:
            menuFunction.updateBook();
            break;
            case 5:
            menuFunction.maxPrice();
            break;
            case 6:
            menuFunction.sortByCode();;
            break;
            case 7:
            menuFunction.removeBook();
            break;
            case 8:
            menuFunction.loadData();
            break;
            case 9:
            menuFunction.saveData();
            break;
            case 0:
            isExit = true;
            break;
            default:
            System.out.println("Invalid choice. Please try again.");
        }
    }
    

}
