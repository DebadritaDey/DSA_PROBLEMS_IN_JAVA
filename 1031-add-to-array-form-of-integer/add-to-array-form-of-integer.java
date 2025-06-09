class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> answer = new ArrayList<>();
        int i = num.length - 1; // Start from the last digit of num
        int carry = 0; // Initialize carry

        // Continue as long as there are digits in num, or k has digits, or there's a carry
        while (i >= 0 || k > 0 || carry > 0) {
            int digitNum = 0;
            if (i >= 0) {
                digitNum = num[i];
            }

            int digitK = k % 10;
            k /= 10; // Move to the next digit of k

            int sum = digitNum + digitK + carry;
            answer.add(sum % 10); // Add the current digit of the sum
            carry = sum / 10; // Calculate the new carry

            i--; // Move to the next digit of num (to the left)
        }

        Collections.reverse(answer); // Reverse the list to get the correct order
        return answer;
    }
}