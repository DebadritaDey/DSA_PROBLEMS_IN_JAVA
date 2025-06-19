class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = firstoccurance(nums,target);
        arr[1] = lastoccurance(nums,target);
        return arr;
    }
    public static int firstoccurance(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                res = mid;
                end = mid - 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }

    public static int lastoccurance(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                res = mid;
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }

}