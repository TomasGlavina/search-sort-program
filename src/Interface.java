import java.util.Scanner;

public class Interface {
        private Scanner sc;
        private Search search;
        private Sort sort;

        public Interface(){
            sc =  new Scanner(System.in);
            search = new Search(this.sc);
            sort = new Sort();
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
            case "1" -> this.search.start(1);
            case "2" -> this.search.start(2);
            case "3" -> this.sort.start(1, "insertion");
            case "4" -> this.sort.start(2, "quicksort");
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
