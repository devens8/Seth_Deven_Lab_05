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
        System.out.println("Insert your age please");
        age = 50;
        if (age >= 21){
            System.out.println("Your get a wristband!");
        }
    }
}

