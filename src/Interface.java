import java.util.Scanner;

public class Interface {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
        optionHandling();

    }

    public static void menu() {

        System.out.println("Menu of Searching and Sorting Testbed.\n");
        System.out.println("""
                1)\tLinear searching
                2)\tBinary searching
                3)\tO(n^2) type of sorting
                4)\tO(n*log(n)) type of sorting
                5)\tSorting performance

                q/Q) Quit
                """);
    }

    public static void optionHandling() {
        switch (optionScanning()) {
            case "1" -> System.out.println("1");
            case "2" -> System.out.println("2");
            case "3" -> System.out.println("3");
            case "4" -> System.out.println("4");
            case "5" -> System.out.println("5");
            case "q", "Q" -> System.exit(0);
            default -> {
                System.out.println("Wrong input, try again.");
                optionHandling();
            }
        }
    }
    public static String optionScanning() {
        System.out.print("Your choice: ");
        return sc.nextLine();
    }
}
