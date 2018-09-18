package array.RotateArray;

public class Starter {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {1,2,3,4,5,6,7};
        int target = 3;
        print(array);
        solution.rotate(array, target);
        print(array);
    }

    private static void print(int[] array){
        System.out.print("[");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + (i != (array.length -1) ? "," : ""));
        }
        System.out.println("]");
    }
}
