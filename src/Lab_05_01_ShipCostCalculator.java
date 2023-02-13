public class Lab_05_01_ShipCostCalculator {

    /*
    Pseudocode:
        class ShippingCostCalculator
            main()
                num itemPrice
                num totalPrice
                num shippingCost
                num totalCost
                do
                    output “What is the price of the item? Enter 0 if no more items”
                    input itemPrice
                    totalPrice += itemPrice
                while itemPrice != 0
                if totalPrice < 100
                    totalCost = itemPrice + itemPrice*0.02
                    output “The total price of all the items is $” + itemPrice + “ and the shipping cost is $” + shippingCost + “ . The total cost is $” + totalCost

                else
                    output “The total price of all the items is $” + itemPrice + “ and the shipping is free. The total cost is $” + totalCost
            return
        end class
     */

    public static void main(String[] args) {
        //Variable Declarations
        double itemPrice;
        double shippingCost;
        double totalCost;

        do{
            //This loop outputs a question for the price, until the user is done entering items
            System.out.println("What is the price of the item? Enter 0 if no more items");
            itemPrice = 99;
            break;
        } while (itemPrice != 0);

        if(itemPrice < 100){ // This if statement adds a 2% shipping cost because the price is less than 100
            shippingCost = itemPrice*0.02;
            totalCost = itemPrice + shippingCost;
            System.out.println("The total price of all the items is $" + itemPrice + " and the shipping cost is $" + shippingCost + ". The total cost is $" + totalCost); // Prints item price and shipping cost
        }
        else{ // Prints item price and free shipping because the item price is more than 100
            totalCost = itemPrice;
            System.out.println("The total price of all the items is $" + itemPrice + " and the shipping is free. The total cost is $" + totalCost); // prints item price. Shipping is free
        }


    }
}