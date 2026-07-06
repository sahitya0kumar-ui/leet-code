class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int original = x;
        int d = 0;
        while(x > 0){
            x = x / 10;
            d++;
        }
        x = original;
        int[] nums = new int[d];
        for(int i = 0; i < d; i++){
            nums[i] = x % 10;
            x = x / 10;
        }
        for(int j = 0; j < d / 2; j++){
            if(nums[j] != nums[d - 1 - j]){
                return false;
            }
        }
        return true;
    }
}