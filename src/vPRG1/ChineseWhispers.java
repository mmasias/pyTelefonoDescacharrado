package vPRG1;

class ChineseWhispers {
    public static void main(String[] args) {
        final int TOTAL_TIME = 120;

        for (int minute = 0; minute <= TOTAL_TIME; minute++) {
            System.out.println("Ludoteca PRG1 - minuto " + minute);
            if (llegaNiño()) {
                System.out.println("> Llego un niño!");
            }
        }
    }

    static boolean llegaNiño() {
        final double PROBABILIDAD_LLEGADA = 0.3;
        return Math.random() < PROBABILIDAD_LLEGADA;
    }
}