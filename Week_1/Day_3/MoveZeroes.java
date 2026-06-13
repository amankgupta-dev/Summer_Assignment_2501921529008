class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        // Pehle saare non-zero elements aage le aao
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Baaki jagah 0 fill kar do
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}
