package exam03;

import exam02.Calclulator;

public class RecCalculator implements Calclulator {


    @Override
    public long factorial(long num) {
        if (num < 1L) {
            return 1L;
        }
        return num * factorial(num - 1L);
    }
}
