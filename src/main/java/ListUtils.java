import java.util.List;

public class ListUtils {

    static void printLimitValues(List<Integer> numbersList) {
        int biggestNumber = numbersList.get(0);
        int smallestNumber = biggestNumber;

        for (int number : numbersList) {
            if (biggestNumber < number) {
                biggestNumber = number;
            } else if (smallestNumber > number) {
                smallestNumber = number;
            }
        }

        System.out.println("Najmniejsza liczba w liście to " + smallestNumber);
        System.out.println("Największa liczba w liście to " + biggestNumber);
    }

    static void printSumOfNumbers(List<Integer> numbersList) {
        boolean firstSymbolPrinted = false;
        int sum = 0;
        int number;

        for (Integer integer : numbersList) {
            if (firstSymbolPrinted) {
                System.out.print(" + ");
            }
            firstSymbolPrinted = true;
            number = integer;
            System.out.print(number);
            sum += number;
        }
        System.out.println(" = " + sum);
    }

    static void printNumbersInReverse(List<Integer> numbersList) {
        boolean firstSymbolPrinted = false;
        for (int i = numbersList.size() - 1; i >= 0; i--) {
            if (firstSymbolPrinted) {
                System.out.print(", ");
            }
            firstSymbolPrinted = true;
            System.out.print(numbersList.get(i));
        }
        System.out.println();
    }
}
