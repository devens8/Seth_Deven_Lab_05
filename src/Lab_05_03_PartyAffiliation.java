public class Lab_05_03_PartyAffiliation {
    /*
    Pseudocode:

    class PartyAffiliation
     main()
          String partyAffiliation
          output “Insert your party affiliation Please(D = Democrat, R = Republican, I = Independent, O = Other): ”
          input partyAffiliation
          if partyAffiliation  == “Democrat” then
               output “You get a Democratic Donkey.”
          else if partyAffiliation  == “Republican” then
               output “You get a Republican Elephant.”
          else if partyAffiliation  == “Independent” then
               output “You get a Independent Man.”
          end if
     return
end class
     */
    public static void main(String[] args) {

        String partyAffiliation;
        System.out.println("Insert your party affiliation Please(D = Democrat, R = Republican, I = Independent):");
        partyAffiliation = "D";

        if(partyAffiliation  == "D"){
            System.out.println("You get a Democratic Donkey.");
        } else if (partyAffiliation  == "R") {
            System.out.println("You get a  Republican Elephant.");
        }else if (partyAffiliation  == "I") {
            System.out.println("You get a  Independant Man.");
        }else {
            System.out.println("You get something else.");
        }

    }
}
