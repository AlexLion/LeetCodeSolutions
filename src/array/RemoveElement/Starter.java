package array.RemoveElement;

public class Starter {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {3,2,2,3};
        int target = 3;
        print(array);
        int res = solution.removeElement(array, target);
        System.out.println("res = " + res);
        print(array);

        int[] array2 = {3,6,8,9,9,9,4,1,7,7};
        target = 9;
        print(array2);
        res = solution.removeElement(array2, target);
        System.out.println("res = " + res);
        print(array2);
    }

    private static void print(int[] array){
        System.out.print("[");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + (i != (array.length -1) ? "," : ""));
        }
        System.out.println("]");
    }
}
