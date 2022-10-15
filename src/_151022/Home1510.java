package _151022;

import java.util.Arrays;
import java.util.Random;

public class Home1510 {
    static void getChars(char[]chars) {

    }


    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[22];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = random.nextInt(500);
        }
        System.out.println(Arrays.toString(arr));
    }
}

