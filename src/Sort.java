import java.util.Random;

public class Sort {
    private int[] numbers;
    private final int ARRAY_SIZE = 10;
    private Random rand;

    public Sort()
    {
        this.numbers =  new int[ARRAY_SIZE];
        this.rand = new Random();
    }

    public void shuffle(){
        for(int i = 0; i < 10; i++)
            numbers[i] = rand.nextInt(-100,100);
    }
    public void insertion(){
        for(int i = 1; i < ARRAY_SIZE; i++){
            //save the key in a temp variable
            int key = numbers[i];
            // getting the left index of the key
            int j = i-1;
            //looping through the array until reach the correct position for key
            while(j>=0 && numbers[j] > key){
                numbers[j+1] = numbers[j];
                j=j-1;
            }
            numbers[j+1] = key;
        }

    }

    public void quicksort(int low, int high){
        if (low < high){
            int partIndex = partition(low, high);
            quicksort(low, partIndex-1);
            quicksort(partIndex + 1, high);
        }
    }

    public int partition(int low, int high) {
        int pivot = numbers[high];
        int i = low -1 ;
        for (int j = low; j <= high -1 ; j++) {
            if(numbers[j] < pivot) {
                i++;
                swap(i, j);
            }
        }
        swap(i+1, high);
        return (i+1);
    }

    public void swap(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public void printArray() {
        for(int num: numbers)
            System.out.print(num + " ");
        System.out.println("\n");
    }

    public void start(int option, String type){
        shuffle();
        System.out.println("Data set before " + type + " sorting:");
        printArray();

        switch (option) {
            case 1 -> insertion();
            case 2 -> quicksort(0, ARRAY_SIZE - 1);
        }

        System.out.println("Data set after "  + type + " sorting:");
        printArray();
    }
}
