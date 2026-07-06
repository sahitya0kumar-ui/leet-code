var twoSum = function(nums, target) {
    n=nums.length;
    for(i=0;i<n;i++){
        for(j=0;j<n;j++){
            if(i==j){
                continue;
            }
            if(nums[i]+nums[j]==target)
            return([i,j]);
        }
    }
};