import java.util.Scanner;

public class Search {
    private final int[] array;
    private boolean found;
    private Scanner sc;
    public Search(Scanner sc){
        array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        found = false;
        this.sc = sc;
    }

    public boolean getFound() {
        return found;
    }

    public void isFound(){
        if(getFound()) System.out.println("\nFound\n");
        else System.out.println("\nNot found\n");
    }

    public void setFound(boolean found) {
        this.found = found;
    }

    public void start(int option){
        int input;
        System.out.print("In the list are values 0, ..., 9; which value would you like to search with linear search? ");
        while (!sc.hasNextInt()) {
            System.out.println("That's not a number!");
            sc.next();
            System.out.print("In the list are values 0, ..., 9; which value would you like to search with linear search? ");
        }
        input = sc.nextInt();
        System.out.println(input);
        switch (option) {
            case 1 -> {
                linear(input);
                isFound();
                setFound(false);
            }
            case 2 -> {
                binary(input, 0, array.length - 1);
                isFound();
                setFound(false);
            }
        }
        sc.nextLine();

    }

    public void linear(int toFind) {
        for(int x: array)
            if (toFind == x) {
                found = true;
                break;
            }
    }

    public void binary(int toFind, int left, int right){
        int mid = (int) Math.floor((left + right) >> 1);

        if (array[mid] == toFind) found = true;

        if(left > right) found = false;
        else {
            if (toFind > array[mid]) binary(toFind, mid + 1, right);
            if (toFind < array[mid]) binary(toFind, left, mid - 1);
        }
    }
}
