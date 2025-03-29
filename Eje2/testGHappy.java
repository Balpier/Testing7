package Eje2;

import org.junit.jupiter.api.Test;

public class testGHappy {

    @Test
    public void testGHappy() {
        Ghappy gh = new Ghappy();

        System.out.println("Test 1: " + gh.gHappy("xxggxx"));
        System.out.println("Test 2: " + gh.gHappy("xxgxx"));
        System.out.println("Test 3: " + gh.gHappy("xxggyygxx"));
        System.out.println("Test 4: " + gh.gHappy("gggg"));
        System.out.println("Test 5: " + gh.gHappy("g"));
        System.out.println("Test 6: " + gh.gHappy("ggggg"));
    }
}
