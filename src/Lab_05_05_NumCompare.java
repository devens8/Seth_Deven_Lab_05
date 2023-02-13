public class Lab_05_05_NumCompare {
    /*
    Pseudocode:

    class Task6
     main()
          num int1
          num int2
          output “Insert the first number”
          input int1
          output “Insert the second number”
          input int2
          if int1 == int2 then
               output “The two numbers are equal”
          else if int1 < int 2 then
               output “The first number is less than the second number”
          else
               output “The second number is less than the first number”
          end if
     return
    end class
     */
    public static void main(String[] args) {

        double int1;
        double int2;
        System.out.println("Insert the first number"); // Prompts user to insert first number
        int1 = 19; //input
        System.out.println("Insert the second number"); // Prompts user to insert second number
        int2 = 19; //input

        if(int1 == int2){
            System.out.println("The two numbers are equal");
        } else if (int1 < int2) { //Checks if int1 is less than int 2, and outputs true/false
            System.out.println("The first number is less than the second number");
        } else if(int2 < int1) { //Checks if int2 is less than int 1, and outputs true/false
            System.out.println("The second number is less than the first number");
        } else{ //if the input is not an int, then it will output error
            System.out.println("The inputted numbers are not valid. Please try again!");
        }

    }
}
