public class singleDimensionalArrays {
    public static void main(String[] args) {
        int[] andrew = {1,2,3,4,55,6};
        int[] mccall = new int[6];
        System.arraycopy(andrew,0, mccall,0, andrew.length);
        for(int i : mccall){
            System.out.println(i);
        }
    }
}
