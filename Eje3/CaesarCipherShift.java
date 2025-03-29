package Eje3;

public class CaesarCipherShift {
    public String encrypt(String message, int shift) {
        if (!message.matches("[a-z ]+")) {
            return "inválido";
        }

        StringBuilder result = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (c == ' ') {
                result.append(' ');
            } else {
                char shifted = (char) ('a' + (c - 'a' + shift) % 26);
                if (shifted < 'a') {
                    shifted += 26; // Ajustar si es negativo
                }
                result.append(shifted);
            }
        }
        return result.toString();
    }
}
