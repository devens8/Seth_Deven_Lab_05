public class Lab_05_04_TheaterKiosk {
    /*
    Pseudocode
    class TheaterKiosk
     main()
          num age
          output “Insert your age please”
          input age
          if age >= 21 then
               output “You get a wristband”
          end if
     return
    end class
     */

    public static void main(String[] args) {

        int age;
        System.out.println("Insert your age please"); //Prompts the user to insert age
        age = 50; //input
        if (age >= 21){ //if the age is greater than 21, then give output
            System.out.println("Your get a wristband!");
        }
    }
}

