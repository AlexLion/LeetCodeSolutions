package array.RemoveDuplicates;

public class Starter {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {1,1,1,1,3,4,5,5,5,5,5,5,7,8,8,8};
        print(array);
        int res = solution.removeDuplicates(array);
        System.out.println("res = " + res);
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
