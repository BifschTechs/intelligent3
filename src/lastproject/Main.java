package lastproject;

import java.util.Scanner;

public class Main extends GroceryList{
//    Create one method to print the following instructions



    public void printMenu() {
        System.out.println("\t 0 - To Print Grocery Menu. ");
        System.out.println("\t 1 - To print choice options. ");
        System.out.println("\t 2 - To print the list of grocery items. ");
        System.out.println("\t 3 - To add an item to the list. ");
        System.out.println("\t 4 - To modify an item in the list. ");
        System.out.println("\t 5 - To remove an item from the list. ");
        System.out.println("\t 6 - To search for an item in the list. ");
        System.out.println("\t 7 - To check out the cart");
        System.out.println("\t 8 - To Payment");
        System.out.println("\t 9 - To quit the application.");
    }

//    Create one method to print all grocery items which is available on the market.

    public void printAllGrocery(){

        printFruits();
        printVegetables();
        printProducts();





    }



//    Create one method to add the item to the list. The method will not take parameter. Call the
//    method which we have created on the GroceryList class and give the parameter value from the
//            scanner class.


    Scanner scanner = new Scanner(System.in);
    GroceryList object=new GroceryList();


    public void addItemNoParameter(){

        object.shoppingList(scanner.nextLine());

    }


//    Create one method to modify the item. The method will not take the parameter. Call the method
//    from GroceryList class and give the parameters using scanner class. Also add the correct
//    description to the user to give the values. Like → System.out.print(); and please enter
//    replacement item.

    public void modifyingItem(){

    }
}