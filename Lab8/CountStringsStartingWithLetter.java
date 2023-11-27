import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CountStringsStartingWithLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements of the list separated by spaces:");
        String input = scanner.nextLine();
        List<String> stringList = Arrays.asList(input.split("\\s+"));

        System.out.println("Enter the target letter:");
        char targetLetter = scanner.next().charAt(0);

        long count = countStringsStartingWithLetter(stringList, targetLetter);

        System.out.println("Number of strings starting with '" + targetLetter + "': " + count);

        scanner.close();
    }

    public static long countStringsStartingWithLetter(List<String> list, char startingLetter) {
        return list.stream()
                .filter(s -> s.startsWith(String.valueOf(startingLetter)))
                .count();
    }
}
