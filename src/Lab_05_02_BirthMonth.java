public class Lab_05_02_BirthMonth {

    /*
    Pseudocode:

    class BirthMonth
     main()
          num birthMonth
          output “Insert your birth month please”
          input birthMonth
          if birthMonth >= 1 && birthMonth <= 12 then
               output “Your birth month is: ” + birthMonth
          else
               output “You entered an incorrect month value: ” + birthMonth
          end if
     return
    end class
     */

    public static void main(String[] args) {
        int birthMonth;

        System.out.println("Insert your birth month please"); //Output's question to user
        birthMonth = 24;

        if(birthMonth >= 1 && birthMonth <= 12){//The input is valid, so it outputs the birthmonth given
            System.out.println("Your birth month is: " + birthMonth);
        } else { //The input is obsolete, so it gives a statement to try again
            System.out.println("You entered an incorrect month value: " +  birthMonth + ". Please try again!");
        }
    }
}
