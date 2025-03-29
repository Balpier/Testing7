package Eje3;

import org.junit.jupiter.api.Test;

public class CaesarCipherShiftTest {

    @Test
    public void testEncryption() {
        CaesarCipherShift cipher = new CaesarCipherShift();

        System.out.println("Test 1: " + cipher.encrypt("abc", 3));      // def
        System.out.println("Test 2: " + cipher.encrypt("uvw", 3));      //  xyz
        System.out.println("Test 3: " + cipher.encrypt("xyz", 3));      // abc

        System.out.println("Test 4: " + cipher.encrypt("def", -3));     // abc
        System.out.println("Test 5: " + cipher.encrypt("xyz", -3));     // uvw
        System.out.println("Test 6: " + cipher.encrypt("abc", -3));     // xyz

        System.out.println("Test 7: " + cipher.encrypt("abc def", 1));  // espacios bcd efg
        System.out.println("Test 8: " + cipher.encrypt("abc123", 3));   // inválido
        System.out.println("Test 9: " + cipher.encrypt("Hello", 3));    // Mayuscula inválido
    }
}
