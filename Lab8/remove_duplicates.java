import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class remove_duplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements of the list separated by spaces:");
        String input = scanner.nextLine();

        List<String> inputList = Arrays.asList(input.split("\\s+"));

        System.out.println("Original List: " + inputList);

        List<String> uniqueList = removeDuplicates(inputList);

        System.out.println("List with Duplicates Removed: " + uniqueList);

        scanner.close();
    }

    public static <T> List<T> removeDuplicates(List<T> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }
}
