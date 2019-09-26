public class Ruler2 {
    private static void drawRuler(int nInches, int majorLength) {
        drawLine(majorLength, 0);
        for (int i = 1; i < nInches; i++) {
            drawInterval(majorLength - 1);
            drawLine(majorLength, i);
        }
    }   
    private static void drawInterval(int centralLength) {
        if (centralLength >=1 ) {
            drawInterval(centralLength - 1);
            drawLine(centralLength);
            drawInterval(centralLength - 1);
        }
    }
    private static void drawLine(int tickLength, int tickLabel) {
        for (int i = 0; i < tickLength; i++) {
            System.out.print("-");
        }
        if (tickLabel >= 0) {
            System.out.print(" " + tickLabel);
        }
        System.out.println();
    }
    private static void drawLine(int tickLength) {
        drawLine(tickLength, -1);
    }
    public static void main(String[] args) {
        drawRuler(5, 3);
    }
}