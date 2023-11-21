package vPRG1;

class ChineseWhispers {
    public static void main(String[] args) {
        final int TOTAL_TIME = 120;
        int lydia = 0;

        for (int minute = 0; minute <= TOTAL_TIME; minute++) {
            System.out.println("Ludoteca PRG1 - minuto " + minute);
            if (childArrives()) {
                lydia++;
                System.out.println("> Llego un niño. Ahora Lydia tiene en cola [" + lydia + "]");
            }
        }
    }

    static boolean childArrives() {
        final double ARRIVAL_PROBABILITY = 0.3;
        return Math.random() < ARRIVAL_PROBABILITY;
    }
}