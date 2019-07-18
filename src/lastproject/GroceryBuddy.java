package lastproject;


public class GroceryBuddy extends CheckOut {

    String[] fruit = {"Apple", "Orange", "Watermelon", "Banana", "Pineapple", "Grape",
            "Mango", "Strawberry", "Peach", "Cherry"};

    String[] Vegetables = {"Carrots", "Broccoli", "Onion", "Potato", "Tomato", "Cucumber",
            "Corn", "Bean", "Spinach", "Pepper"};


    String[] product = {"Milk", "Bread", "Beef", "Eggs", "Chicken", "Sugar", "Salt",
            "Coffee", "Rice", "Pasta"};


    double[] priceofFruit = {1.99, 2.29, 1.59, 2.99, 6.99, 2.49, 3.39, 4.29, 2.89, 1.79};
    double[] priceVegetables = {2.99, 3.29, 1.99, 2.99, 3.99, 9.99, 4.49, 6.79, 7.89, 5.89};
    double[] productPrice = {6.99, 3.69, 6.99, 2.89, 8.99, 12.99, 4.49, 3.79, 7.49, 3.99};


//	Create the method to print the Fruits.
//	Create the method to print the Vegetables.
//	Create the method to print the Other products.

    public void printFruits() {
        for (String printFruits : fruit)
            System.out.println(printFruits);
    }

    public void printVegetables() {
        for (String printVegetables : Vegetables)
            System.out.println(printVegetables);
    }

    public void printProducts() {
        for (String printProducts : product)
            System.out.println(printProducts);
    }


//	Create the method to get the item prices. This method will take the parameter as the name of
//	the product and return the prices of product which you store to the array.


    //apple
    public double getItemPrice(String name) {

        for (int i = 0; i < fruit.length; i++) {
            if (fruit[i].equalsIgnoreCase(name)) {

                return priceofFruit[i];
            }

        }
        for (int i = 0; i < Vegetables.length; i++) {
            if (Vegetables[i].equalsIgnoreCase(name)) {

                return priceVegetables[i];
            }

        }

        for (int i = 0; i < product.length; i++) {
            if (product[i].equalsIgnoreCase(name)) {

                return productPrice[i];
            }

        }


        return 0;


    }

}



