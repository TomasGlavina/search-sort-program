import java.util.Scanner;

public class Interface {
        private Scanner sc;
        private LinearSearch linear;

        public Interface(){
            sc =  new Scanner(System.in);
            linear = new LinearSearch(this.sc);
        }
        public void start(){
            while(true) menu();
        }

    public void menu() {

        System.out.println("Menu of Searching and Sorting Testbed.\n");
        System.out.println("""
                1)\tLinear searching
                2)\tBinary searching
                3)\tO(n^2) type of sorting
                4)\tO(n*log(n)) type of sorting
                5)\tSorting performance

                q/Q) Quit
                """);
        this.optionHandling();
    }

    public void optionHandling() {
        switch (optionScanning()) {
            case "1" -> this.linear.start();
            case "2" -> System.out.println("Choice 2 not implemented.\n");
            case "3" -> System.out.println("Choice 3 not implemented.\n");
            case "4" -> System.out.println("Choice 4 not implemented.\n");
            case "5" -> System.out.println("Choice 5 not implemented.\n");
            case "q", "Q" -> System.exit(0);
            default -> {
                System.out.println("Wrong input, try again.\n");
                optionHandling();
            }
        }
    }
    public String optionScanning() {
        System.out.print("Your choice: ");
        return sc.nextLine();
    }
}
