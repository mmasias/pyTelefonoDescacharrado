package vPRG1;
import java.util.Scanner;
class ChineseWhispers {
    public static void main(String[] args) {
        final int TOTAL_TIME = 120;
        final int MINIMAL_CHILDS = 5;
        int lydia = 0;
        int aisha = 0;
        boolean isPlaying = false;
        String theMessage = "";
        int childTurn = 0;

        for (int minute = 0; minute <= TOTAL_TIME; minute++) {
            System.out.println("=".repeat(30));
            System.out.println("Ludoteca PRG1 - minuto " + minute);
            if (childArrives()) {
                lydia++;
                System.out.println("Llegó un niño");
            }
            if (!isPlaying) {
                aisha = aisha + lydia;
                lydia = 0;
            }
            if (aisha >= MINIMAL_CHILDS && !isPlaying) {
                isPlaying = true;
                theMessage = "Dicen que el examen estará difícil. ¡Pásalo!";
                System.out.println("Aisha empieza a jugar pasando este mensaje: " + theMessage);
                childTurn = 1;
            } else if (isPlaying) {
                theMessage = alteredMessage(theMessage);
                System.out.println("El niño [" + childTurn + "] pasa este mensaje: " + theMessage);
                childTurn++;
                isPlaying = childTurn <= aisha;
            }
            showQueue("Lydia", lydia);
            showQueue("Aisha", aisha);
            new Scanner(System.in).nextLine();
        }
    }

    static String alteredMessage(String theMessage) {
        return theMessage + "X";
    }

    static boolean childArrives() {
        final double ARRIVAL_PROBABILITY = 0.3;
        return Math.random() < ARRIVAL_PROBABILITY;
    }

    static void showQueue(String responsible, int numberOfChildren) {
        System.out.println(responsible + " tiene " + numberOfChildren + " niños en cola.");
    }
}