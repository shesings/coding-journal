class Solution {
    // sortedSquares: int[] --> int[]
    // Takes the squares of all the elemtns in the
    // array and sorts the array from least to greatest
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int square = nums[i]*nums[i];
            nums[i] = square;
        }
        for (int x = 0; x < nums.length; x++) {
            int smallestNum = nums[x];
            //System.out.println("set smallestNum to: " + smallestNum);
            for(int y = x+1; y < nums.length; y++) {
                if(smallestNum > nums[y]) {
                    //System.out.println("current smallestNum = " + smallestNum);
                    nums[x] = nums[y];
                    nums[y] = smallestNum;
                    smallestNum = nums[x];
                }
            }
           
        }
        return nums;
    }
}