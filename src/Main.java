import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String partyChoice = "";
        String partyMenu = "D- Democrat\tR- Republican\tI- Independent\tO- Other";

        System.out.println(partyMenu);
        partyChoice = in.nextLine();

        if(partyChoice.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic donkey");
        }
        else if(partyChoice.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican elephant");
        }
        else if(partyChoice.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent person");
        }
        else if(partyChoice.equalsIgnoreCase("O"))
        {
            System.out.println("You get an Other");
        }
    }
}