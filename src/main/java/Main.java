import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run(new Scanner(System.in));
    }

    public void run(Scanner scanner) {

        List<Integer> numbersList = new ArrayList<>();
        int number = 0;

        while (number >= 0) {
            System.out.println("Proszę o wprowadzenie liczby całkowitej: ");
            try {
                number = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono błędne dane, proszę o podanie liczby całkowitej");
            }
            if (number >= 0) {
                numbersList.add(number);
            }
        }

        ListUtils.printNumbersInReverse(numbersList);
        ListUtils.printSumOfNumbers(numbersList);
        ListUtils.printLimitValues(numbersList);
    }

}
