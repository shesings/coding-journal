class ArrayMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCounter = 0;
        int currentCounter = 0;
        for(int n : nums) {
            if(n == 1){
                currentCounter++;
                if(currentCounter > maxCounter) {
                    maxCounter = currentCounter;
                }
            } else { // n = 0
                if(currentCounter > maxCounter) {
                    maxCounter = currentCounter;
                }
                currentCounter = 0;
            }
        }
        return maxCounter;
    }
}