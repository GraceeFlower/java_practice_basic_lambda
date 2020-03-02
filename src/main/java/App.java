import Interfaces.AddSymbol;
import Interfaces.CalculateSquare;

import java.util.function.Consumer;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        addAsterisk();
        addAsteriskByConsumer();
        System.out.println(getSquare());
        System.out.println(getSquareByFunction());
    }

    private static void addAsterisk() {
        AddSymbol addSymbol = (str, symbol) -> System.out.println(symbol + str + symbol);
        addSymbol.printCompleteString("test", "*");
    }

    private static void addAsteriskByConsumer() {
        Consumer<String> consumer = str -> System.out.println("*" + str + "*");
        consumer.accept("consumerTest");
    }

    private static int getSquare() {
        CalculateSquare calculator = num -> num * num;
        return calculator.getSquare(6);
    }

    private static int getSquareByFunction() {
        Function<Integer, Integer> function = num -> num * num;
        return function.apply(8);
    }

}
