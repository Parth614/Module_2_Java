import java.util.*;

public class Code5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        List<String> strings = new ArrayList<>();
        
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings.add(scanner.nextLine());
        }
        
        // Sort in descending order using lambda
        Collections.sort(strings, (s1, s2) -> s2.compareTo(s1));
        
        System.out.println("\nSorted in descending order:");
        strings.forEach(System.out::println);
        
        scanner.close();
    }
}