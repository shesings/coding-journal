class ArrayFindNumberEvenDigits {
    public int findNumbers(int[] nums) {
        int countEvens = 0;
        for(int n : nums) {
            if(n > 9 && n < 100) {
                countEvens++;
            } else if (n > 999 && n < 10000) {
                countEvens++;
            } else if (n > 99999 && n < 1000000) {
                countEvens++;
            }
        }
        return countEvens;
    }
}