/**
 * Assignment 4 for CS 1410
 * This program evaluates the linear and binary searching, along
 * with comparing performance difference between the selection sort
 * and the built-in java.util.Arrays.sort.
 *
 * @author James Dean Mathias
 */
public class EvaluationDriver {
    static final int MAX_VALUE = 1_000_000;
    static final int MAX_ARRAY_SIZE = 100_000;
    static final int ARRAY_INCREMENT = 20_000;
    static final int NUMBER_SEARCHES = 50_000;

    public static void main(String[] args) {

        demoLinearSearchUnsorted();
        demoLinearSearchSorted();
        demoBinarySearchSelectionSort();
        demoBinarySearchFastSort();
    }
    public static int[] generateNumbers(int howMany, int maxValue){
        if(howMany > 0){
            int[] randomArray = new int[howMany];
            for(int i = 0; i < howMany; i++){
                double randomNumber = Math.random() * maxValue;
                int randomNumberInt = (int)randomNumber;
                randomArray[i] = Math.round(randomNumberInt);
            }
            return randomArray;
        }
        return null;
    }

    public static boolean linearSearch(int[] data, int search){
        for(int e : data){
            if(e == search){
                return true;
            }
        }
        return false;
    }
    public static boolean binarySearch(int [] data, int search){
        int low = 0;
        int high = data.length - 1;

        while (high >= low){
            int mid = (low + high) / 2;
            if(search < data[mid]){
                high = mid - 1;
            }
            else if (search == data[mid]){
                return true;
            }
            else{
                low = mid + 1;
            }
        }
        return false;
    }
    public static void selectionSort(int[] data){
        for (int i = 0; i < data.length - 1; i++){
            int currentMin = data[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < data.length; j++){
                if (currentMin > data[j]){
                    currentMin = data[j];
                    currentMinIndex = j;

                }
            }
            if (currentMinIndex != i){
                data[currentMinIndex] = data[i];
                data[i] = currentMin;
            }
        }
    }
    public static void writing(int items, int found, long time){
        String word1 = "Number of items";
        System.out.printf("%-21s : ", word1);
        System.out.println(items);

        String word2 = "Times value was found";
        System.out.printf("%-21s : ", word2);
        System.out.println(found);

        String word3 = "Total search time";
        System.out.printf("%-21s : ", word3);
        System.out.println(time + " ms\n");
    }
    public static void demoLinearSearchUnsorted(){
        System.out.println("--- Linear Search Timing (unsorted) ---");
        for(int i = ARRAY_INCREMENT; i <= MAX_ARRAY_SIZE; i += ARRAY_INCREMENT){
            int[] list = generateNumbers(i, MAX_VALUE);
            long time = System.currentTimeMillis();
            int found = 0;
            for(int j = 0; j < NUMBER_SEARCHES; j++){
                int ranNumber = (int)(Math.random() * MAX_VALUE);
                boolean value = linearSearch(list, ranNumber);
                if(value){
                    found += 1;
                }
            }
            long time2 = System.currentTimeMillis() - time;
            writing(i, found, time2);
        }
    }
    public static void demoLinearSearchSorted(){
        System.out.println("--- Linear Search Timing (Selection Sort) ---");
        for(int i = ARRAY_INCREMENT; i <= MAX_ARRAY_SIZE; i += ARRAY_INCREMENT){
            int[] list = generateNumbers(i, MAX_VALUE);
            long time = System.currentTimeMillis();
            selectionSort(list);
            int found = 0;
            for(int j = 0; j < NUMBER_SEARCHES; j++){
                int ranNumber = (int)(Math.random() * MAX_VALUE);
                boolean value = linearSearch(list, ranNumber);
                if(value){
                    found += 1;
                }
            }
            long time2 = System.currentTimeMillis() - time;
            writing(i, found, time2);
        }
    }
    public static void demoBinarySearchSelectionSort(){
        System.out.println("--- Binary Search Timing (Selection Sort) ---");
        for(int i = ARRAY_INCREMENT; i <= MAX_ARRAY_SIZE; i += ARRAY_INCREMENT){
            int[] list = generateNumbers(i, MAX_VALUE);
            long time = System.currentTimeMillis();
            selectionSort(list);
            int found = 0;
            for(int j = 0; j < NUMBER_SEARCHES; j++){
                int ranNumber = (int)(Math.random() * MAX_VALUE);
                boolean value = binarySearch(list, ranNumber);
                if(value){
                    found += 1;
                }
            }
            long time2 = System.currentTimeMillis() - time;
            writing(i, found, time2);
        }
    }
    public static void demoBinarySearchFastSort(){
        System.out.println("--- Binary Search Timing (Arrays.sort) ---");
        for(int i = ARRAY_INCREMENT; i <= MAX_ARRAY_SIZE; i += ARRAY_INCREMENT) {
            int[] list = generateNumbers(i, MAX_VALUE);
            long time = System.currentTimeMillis();
            java.util.Arrays.sort(list);
            int found = 0;
            for (int j = 0; j < NUMBER_SEARCHES; j++) {
                int ranNumber = (int) (Math.random() * MAX_VALUE);
                boolean value = binarySearch(list, ranNumber);
                if (value) {
                    found += 1;
                }
            }
            long time2 = System.currentTimeMillis() - time;
            writing(i, found, time2);
        }
    }
}
