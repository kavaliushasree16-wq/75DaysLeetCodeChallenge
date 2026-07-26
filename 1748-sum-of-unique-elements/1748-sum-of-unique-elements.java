class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        for(int num:nums){
            if(map.containsKey(num)){
                    map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }

       for(int i=0;i<nums.length;i++){
         if(map.get(nums[i])==1){
            sum=sum+nums[i];
        }
       }
        return sum;
    }
}