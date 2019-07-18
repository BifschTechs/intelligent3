package lastproject;


import java.util.ArrayList;
import java.util.List;

public class GroceryList extends GroceryBuddy {

    ArrayList<String> productBuyed = new ArrayList<>();

//	Create one method to store the product of which the user shopping. This method will store the
//	product purchased by the user to the ArrayList which created. This method will print an error
//	message if the product is not on the store.


    public void shoppingList(String item) {

        for (int i = 0; i < fruit.length; i++) {
            if (item.equalsIgnoreCase(fruit[i]) || item.equalsIgnoreCase(Vegetables[i]) || item.equalsIgnoreCase(product[i])) {

                productBuyed.add(item);


            }else{
                System.out.println("The product is not on the store");
            }

        }

    }


//	Create a method which returns the ArrayList of the purchased list.

    public ArrayList purchasedArrayList() {

        return productBuyed;
    }


//	Create method returns the double, total price of the purchased product. If the total price is more
//	than 50 make a 10 percent discount. If the total price is more than 100 make 15 percent
//	discount for total purchased and return the discounted value and print the total price.


    public double totalPrice() {

        double sum = 0.0;
        double discount = 0.0;
        for (int i = 0; i < productBuyed.size(); i++) {


            getItemPrice(productBuyed.get(i));//peresmotri i vnikni

        }

        if (sum < 50 && sum > 100) {
            return discount = sum - (sum / 10);

        } else if (sum >= 100) {
            return discount = sum - (sum / 15);
        }

        return 0.0;

    }
//	Create a method to modify the list. If the user wanna change the product which purchased use
//	this method. The method takes two parameters int position and String newItem and modifies the
//	ArrayList with the new item.

    public void modifyList(int position, String newItem) {

//        productBuyed.set(position, newItem);
        productBuyed.add(position, newItem);


    }
//	Create a method to remove the item from the ArrayList. Takes one parameter as a String and
//	removes the item from the list.


    public void removeItem(String removingItemName) {
        for (int i = 0; i < productBuyed.size(); i++) {
            if (removingItemName.equalsIgnoreCase(productBuyed.get(i))) {
                productBuyed.remove(removingItemName);

            } else {
                System.out.println("This is not in the list");
            }
        }
    }
//    Create one method to find the item on the List. Takes one parameter as a String and return the
//    int position of the product on the list. Basically this method help user to check his/her list after
//    shopping to make sure he/she take the product or not.

    public int findItem(String checkItem) {

        for (int i = 0; i < productBuyed.size(); i++) {

            if (checkItem.equalsIgnoreCase(productBuyed.get(i))) {

                return productBuyed.indexOf(checkItem);
            }

        }

        return 0;

    }


//
//    Create one method to modify your list. This method takes two parameters as a String one for
//    currentItem one for newItem and replaces the current item with a new item from the list.

    public void modifyMyList(String currentItem, String newItem){

        for(int i=0; i<productBuyed.size();i++){
            if(currentItem.equalsIgnoreCase(productBuyed.get(i))){
                    productBuyed.remove(currentItem);
                    productBuyed.add(newItem);

            }
        }
    }


}
