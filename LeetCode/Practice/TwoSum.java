class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        //System.out.println(nums.length); // returns 4
        //System.out.println(nums[0]);
        int nextCheck = 1;
        for (int z = 0; z < nums.length; z++) {
            // System.out.println("currently on: " + z);
            for (int i = nextCheck; i < nums.length; i++) {
                //System.out.println("checking: " + nums[z] + " and " + nums[i]);

                if (nums[z] + nums[i] == target){
                    solution[0] = z;
                    solution[1] = i;
                }
            }
            nextCheck++;
        }
        return solution;
    }
}