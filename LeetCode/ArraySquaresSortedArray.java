public class ArraySquaresSortedArray {
    //import java.lang.Math;

    public int[] sortedSquares(int[] nums) {
        // take squares of all the items in the array
        for (int i = 0; i < nums.length-1; i++) {
            int square = nums[i]*nums[i];
            nums[i] = square;
            System.out.println("nums[" + i + "] is: " + nums[i]);
        }
        // sort array
        for (int x = 0; x < nums.length-1; x++) {
            // find smallest number and set it to the index we are currently at
            int smallestNum = 10000;
            for(int y = 0; y < x; y++) {
                // i have to do a switch once i find the smallest one
                if(num < smallestNum){
                    smallestNum = num;
                }
            }
            nums[x] = smallestNum
        }
        
        return nums;
    }

}
