import java.util.Scanner;

public class LinearSearch {
    private final int[] array;
    private boolean found;
    private Scanner sc;
    public LinearSearch(Scanner sc){
        array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        found = false;
        this.sc = sc;
    }

    public boolean isFound() {
        return found;
    }

    public void start(){
        int input;
        System.out.print("In the list are values 0, ..., 9; which value would you like to search with linear search? ");
        while (!sc.hasNextInt()) {
            System.out.println("That's not a number!");
            sc.next();
            System.out.print("In the list are values 0, ..., 9; which value would you like to search with linear search? ");
        }
        input = sc.nextInt();
        System.out.println(input);
        search(input);
        sc.nextLine();

    }

    public void search(int input) {
        for(int x: array)
            if (input == x) {
                found = true;
                break;
            }
        if(isFound()) System.out.println("\nFound\n");
        else System.out.println("\nNot found\n");

        found = false;
    }
}
