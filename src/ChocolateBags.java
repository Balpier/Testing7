public class ChocolateBags {
    public int calculate(int small, int big, int total) {
        int maxBigBoxes = total / 5;
        int bigBoxesWeCanUse = Math.min(maxBigBoxes, big);
        total -= (bigBoxesWeCanUse * 5);

        if (small < total)
            return -1;  // No hay suficientes barras pequeñas
        return total;   //cantidad de barras pequeñas necesarias
    }
}
