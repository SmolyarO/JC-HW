package runner;

import math.Mathematics;

import javax.sound.midi.Soundbank;


/**
 * Created by ostap.smoliar on 2/18/2015.
 */
public class Main {

    public static void main(String... args) {

        Mathematics mat = new Mathematics();

        long fibResult = mat.fibonachi(8);
        System.out.println(fibResult);

        fibResult = mat.fibonachi(0);
        System.out.println(fibResult);

        fibResult = mat.fibonachi(-8);
        System.out.println(fibResult);


        int oddSumm = mat.oddCount(new int[]{1, 3, 5, 3, 6,});
        System.out.println(oddSumm);


        int round = mat.round(23.53);
        System.out.println(round);

        round = mat.round(23.33);
        System.out.println(round);

        round = mat.round(-25.51);
        System.out.println(round);

    }


}
