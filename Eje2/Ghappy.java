package Eje2;

public class Ghappy {
    public boolean gHappy(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                boolean leftHappy = (i > 0 && str.charAt(i - 1) == 'g');
                boolean rightHappy = (i < str.length() - 1 && str.charAt(i + 1) == 'g');

                if (!leftHappy && !rightHappy) {
                    return false; // Si una "g" no está acompañada, retorna falso
                }
            }
        }
        return true; // Si todas las "g" están acompañadas, retorna verdadero
    }
}