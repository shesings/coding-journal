class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        double total = 0.0;
        double median = 0.0;

        for(int i = 0; i < nums1.length; i++) {
            //System.out.println("nums1[i] = " + nums1[i] + " and i = " + i);
            total += nums1[i];
            //System.out.println("total = " + total);
        }
        for(int j = 0; j < nums2.length; j++) {
            //System.out.println("nums2[j] = " + nums2[j] + " and j = " + j);
            total += nums2[j];
            //System.out.println("total = " + total);
        }

        //System.out.println("final total = " + total);
        //System.out.println("total length of both lists: " + (nums1.length+nums2.length));
        median = total/(nums1.length+nums2.length);
        return median;
        // TODO: partially done, some cases give wrong answer such as:
        // [1,3]
        // [2,7]
    }
}