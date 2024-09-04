package arrays.deleting;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
 * The relative order of the elements should be kept the same.
 * Then return the number of unique elements in nums.
 *
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 *
 *     Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
 *     Return k.
 */
public class RemovingDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;

        for (int i = 1; i < length; i++) {
            if (nums[i] == nums[i - 1]) {

                for (int j = i; j < length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                length--;// Decrease the length because we removed one element
                i--;// Stay at the same index to check for duplicate elements from the same position
            }
        }
        return length;
    }
}
