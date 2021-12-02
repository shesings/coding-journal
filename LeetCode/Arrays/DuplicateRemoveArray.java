class Solution {
    public int removeDuplicates(int[] nums) {
        int currentNumber;
        int[] newNum = new int[nums.length];
        for (int n : nums) {
            System.out.println(n);
        }
        System.out.println("nums.length = " + nums.length);
        for(int i = 0; i < nums.length; i++) {
            currentNumber = nums[i];
            System.out.println("i = " + i);
            if(i==0) {
                newNum[i] = nums[i];
            }
            if(i+1 == nums.length) {

            }
            else if(nums[i+1] != currentNumber) { // this means that next index number is a duplicate
                newNum[i] = nums[i+1];
            }
            System.out.println("newNum[" + i + "] = " + newNum[i]);
        }

        for (int z = 0; z < newNum.length; z++) {
            nums[z] = newNum[z];
        }

        for (int n : nums) {
            System.out.println(n);
        }
        return 0;
    }
}