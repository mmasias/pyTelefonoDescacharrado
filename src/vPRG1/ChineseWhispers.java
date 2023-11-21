package vPRG1;

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
            System.out.println("Ludoteca PRG1 - minuto " + minute);
            if (childArrives()) {
                lydia++;
                System.out.println("> Llego un niño. Ahora Lydia tiene en cola [" + lydia + "]");
            }
            if (!isPlaying) {
                aisha = aisha + lydia;
                lydia = 0;
                System.out.println("> No están jugando. Aisha tiene en cola [" + aisha + "] y Lydia tiene en cola ["
                        + lydia + "] niños");
            }
            if (aisha >= MINIMAL_CHILDS && !isPlaying) {
                isPlaying = true;
                theMessage = "Dicen que el examen estará difícil. ¡Pásalo!";
                childTurn = 1;
            } else if (isPlaying) {
                theMessage = alteredMessage(theMessage);
                System.out.println("El niño [" + childTurn + "] pasa este mensaje: " + theMessage);
                childTurn++;
                isPlaying = childTurn <= aisha;
            }
        }
    }

    private static String alteredMessage(String theMessage) {
        return theMessage + "X";
    }

    static boolean childArrives() {
        final double ARRIVAL_PROBABILITY = 0.3;
        return Math.random() < ARRIVAL_PROBABILITY;
    }
}