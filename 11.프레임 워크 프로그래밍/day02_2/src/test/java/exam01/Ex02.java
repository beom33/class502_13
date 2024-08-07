package exam01;

import exam02.CalculatorHandler;
import exam02.RecCalculator;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

public class Ex02 {

    @Test
    void test1() {
        Object obj = Proxy.newProxyInstance(
                Calclulator.class.getClassLoader(),
                new Class[] {Calclulator.class},
                new CalculatorHandler(new ImplCalculator())
        );

        Calclulator cal = (Calclulator) obj;
       long result = cal.factorial(10L);
        System.out.println(result);

        System.out.println(cal);
    }
}
