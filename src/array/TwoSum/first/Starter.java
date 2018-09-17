package array.TwoSum.first;

public class Starter {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = {1,3,5,7};

        int target = 4;
        int[] res = solution.twoSum(array, target);
        System.out.println("target = " + target + ", result = [" + res[0] + ", " + res[1] + "]");

        target = 6;
        res = solution.twoSum(array, target);
        System.out.println("target = " + target + ", result = [" + res[0] + ", " + res[1] + "]");

        target = 8;
        res = solution.twoSum(array, target);
        System.out.println("target = " + target + ", result = [" + res[0] + ", " + res[1] + "]");

        target = 10;
        res = solution.twoSum(array, target);
        System.out.println("target = " + target + ", result = [" + res[0] + ", " + res[1] + "]");
    }
}
