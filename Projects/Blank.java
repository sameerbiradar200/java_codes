package Projects;

import java.util.Arrays;

public class Blank {
    public static void main(String[] args) {
        String Aa ="my name is sameer biradar";
        System.out.println(Aa);
        String[] Words = Aa.split(" ");
        System.out.println(Arrays.toString(Words));
        String reversed = "";
        for (int i = Words.length - 1; i >= 0; i--) {
            reversed += Words[i] + " ";
            System.out.println(reversed);
        }
        System.out.println(reversed);
    }
}
