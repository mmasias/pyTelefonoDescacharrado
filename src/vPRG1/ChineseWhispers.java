package vPRG1;

class ChineseWhispers {
    public static void main(String[] args) {
        final int TOTAL_TIME = 120;
        final int MINIMAL_CHILDS = 5;
        int lydia = 0;
        int aisha = 0;
        boolean isPlaying = false;

        for (int minute = 0; minute <= TOTAL_TIME; minute++) {
            System.out.println("Ludoteca PRG1 - minuto " + minute);
            if (childArrives()) {
                lydia++;
                System.out.println("> Llego un niño. Ahora Lydia tiene en cola [" + lydia + "]");
            }
            if (!isPlaying) {
                aisha = aisha + lydia;
                lydia = 0;
                System.out.println("> No están jugando. Aysha tiene en cola [" + aisha + "] y Lydia tiene en cola ["
                        + lydia + "] niños");
            }
            if (aisha >= MINIMAL_CHILDS && !isPlaying) {
                System.out.println("> Aysha empieza a jugar!!!");
            }            
        }
    }

    static boolean childArrives() {
        final double ARRIVAL_PROBABILITY = 0.3;
        return Math.random() < ARRIVAL_PROBABILITY;
    }
}