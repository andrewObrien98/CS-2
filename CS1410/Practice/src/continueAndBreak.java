public class continueAndBreak {
    public static void main(String[] args) {
        int[] listOfNumbers = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for (int count : listOfNumbers){
            if ((count % 2) == 0){
                continue;
            }
            sum = sum + count;
        }
        System.out.println(sum);
    }
}
