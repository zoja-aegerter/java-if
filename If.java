import java.util.Scanner;



public class If {
    public static void main(String[] args) {
        /* 
        int score = 4000;

        if (score == 5000) {
            System.out.println("Herzlichen Glückwunsch, neuer Rekord!");
        } else {
            System.out.println("Schade, dein Score reicht leider nicht");
        }

        int lebenPlayer = 3;

        if (lebenPlayer == 0) {
            System.out.println("Spiel verloren");
        }

        
        boolean gegnerHit = true;
        int highscore = 0;

        if (gegnerHit == true) {
            System.out.println("Gegner getroffen");
            highscore += 10;
            System.out.println("Highscore " + highscore);
        } else {
            System.out.println("Daneben");
        }

        

        int i =-3;
        if (i == 1) {
            System.out.println("Zahl in i ist: " + i);
        } else if (i >= 1) {
            System.out.println("Zahl in i ist: " + i);
        } else if (i <= 1) {
            System.out.println("Zahl in i ist: " + i);
        } else {
            System.out.println("Zahl unbekannt");
        }
       

        int score = 7000;
        int lebenPlayer = 3;

        if (score == 1000) {
            System.out.println("Du hast 1 Stern von 3 Sternen erhalten");
        } else if (score == 5000) {
            System.out.println("Du hast 2 Sterne von 3 Sternen erhalten");
        } else if (score > 5000) {
            System.out.println("Du hast 3 Sternen von 3 Sterenen erhalten");
            lebenPlayer += 1;
            System.out.println(" Deine Leben betragen: " + lebenPlayer);
        }

         */

         // Verzweigung

         System.out.println("Wie viele Budesländer hat Deutschland?");
         System.out.println("15 oder 3 oder 16 oder 30");

         Scanner scan = new Scanner(System.in);
         int eingabeUser = scan.nextInt();

         if (eingabeUser == 15) {
            System.out.println("Das ist falsch");
         } else if (eingabeUser == 3) {
            System.out.println("Das ist falsch");
         } else if (eingabeUser == 16) {
            System.out.println("Das ist richtig!!");
            System.out.println("Wie heisst der Bundespräsident?");
         } else if (eingabeUser == 30) {
            System.out.println("Das ist falsch");
         } else {
            System.out.println("Drücken Sie bitte eine Zahl");
         }





    }
}
