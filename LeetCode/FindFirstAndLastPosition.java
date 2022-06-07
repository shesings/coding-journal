class Solution {

    public int findFirst(int[] arr, int low, int high, int x, int n) {

        if(high >= low) {
            int mid = low+(high-low)/2;
            if ((mid == 0 || x > arr[mid-1]) && arr[mid] == x)
                return mid;
            else if (x > arr[mid])
                return findFirst(arr, (mid+1), high, x, n);
            else
                return findFirst(arr, low, (mid-1), x, n);

        } else
            return -1;

    }

    public int findLast(int[] arr, int low, int high, int x, int n) {

        if(high >= low) {
            int mid = low+(high-low)/2;
            if((mid == n-1 || x < arr[mid+1]) && arr[mid] == x)
                return mid;
            else if (arr[mid] > x)
                return findLast(arr, low, (mid-1), x, n);
            else
                return findLast(arr, (mid+1), high, x, n);
        } else
            return -1;

    }

    public int[] searchRange(int[] nums, int target) {

        int n = nums.length;
        int[] position = new int[2];
        position[0] = findFirst(nums, 0, n-1, target, n);
        position[1] = findLast(nums, 0, n-1, target, n);
        return position;
    }
}