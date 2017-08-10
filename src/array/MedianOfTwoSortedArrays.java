package array;

public class MedianOfTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		int[] res = new int[m+n];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < m || j < n) {
			if (i == m) {
				res[k++] = nums2[j++];
			} else if (j == n) {
				res[k++] = nums1[i++];
			} else {
				res[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
			}
		}
		
		return (m+n)%2 == 0 ? (double)(res[(m+n)/2-1] + res[(m+n)/2])/2 : res[(m+n)/2];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
