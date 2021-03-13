public class RecursionPractice {
    public static void main(String[] args) {
        //just a simple recursive program to add up everything
        int[] numbers = {1,2,10,6,7,8,9};
        System.out.println(addition(numbers, 0));
        System.out.println(findBig(numbers, 0));
    }

    public static int addition(int[] list, int n) {
        if (n == list.length - 1){
            return list[n];
        }
        return list[n] + addition(list, n+1);
    }

    public static int findBig(int[] list, int iteration){
        if (iteration == list.length - 1){
            return list[iteration];
        }
        if (list[iteration] > list[iteration + 1]){
            list[iteration + 1] = list[iteration];
        }
        return findBig(list, iteration++);

    }
}


