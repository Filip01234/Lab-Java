import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortListWithStreams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements of the list separated by spaces:");
        String input = scanner.nextLine();
        List<Integer> numberList = Arrays.stream(input.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        // ordine crescatoare
        List<Integer> ascendingOrderList = sortListAscending(numberList);
        System.out.println("Sorted List (Ascending): " + ascendingOrderList);

        // ordine descrescatoare
        List<Integer> descendingOrderList = sortListDescending(numberList);
        System.out.println("Sorted List (Descending): " + descendingOrderList);

        scanner.close();
    }

    public static List<Integer> sortListAscending(List<Integer> list) {
        return list.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<Integer> sortListDescending(List<Integer> list) {
        return list.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
    }
}
