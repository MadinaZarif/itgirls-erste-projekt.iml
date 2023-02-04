import java.io.PrintStream;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.SplittableRandom;

public class HelloItGirls {


    public static void main(String[] args) {
        //
        Programmer anna = new Programmer("Natalia", 40);

        //
        Programmer natalia = new Programmer("Anna", 25);

        //
        System.out.println("В компании работает программист " + anna.name + ". Возраст: " + anna.age + " и программист " + natalia.name + ". Возраст: " + natalia.age + ".");
        System.out.println("Сейчас: " + anna.name + " " + anna.write("статью"));

        System.out.println("Сейчас:" +
                " " + natalia.name + " " + natalia.drink("чай"));
    }
}
