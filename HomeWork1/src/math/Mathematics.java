package math;

/**
 * Created by ostap.smoliar on 2/18/2015.
 */
public class Mathematics {

    /*public Mathematics() {

    }*/
    public long fibonachi(int fib) {
        if (fib == 0) {
            return 0;
        } else if ((fib == -1) || (fib == 1)) {
            return 1;
        } else if (fib > 0) {
            return fibonachi(fib - 1) + fibonachi(fib - 2);
        } else {
            return fibonachi(fib + 2) - fibonachi(fib + 1);
        }
    }

    public int oddCount(int[] arr) {
        int summ = 0;
        for (int i = 1; i < arr.length; i += 2) {
            summ += arr[i];
        }
        return summ;
    }

    public int round(double n) {
        int result;
        if ((n % 1) >= 0.5) {
            result = (int) n + 1;
        } else if ((n % 1) <= -0.5) {
            result = (int) n - 1;
        } else result = (int) n;
        return result;
    }

}
