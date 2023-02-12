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
        System.out.println("Insert the first number");
        int1 = 19;
        System.out.println("Insert the second number");
        int2 = 19;

        if(int1 == int2){
            System.out.println("The two numbers are equal");
        } else if (int1 < int2) {
            System.out.println("The first number is less than the second number");
        } else if(int2 < int1) {
            System.out.println("The second number is less than the first number");
        } else{
            System.out.println("The inputted numbers are not valid. Please try again!");
        }

    }
}
