
import java.util.*;
class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int arr[]=new int[2],index=0;

        for(int num: nums){
            if(set.contains(num)){
                arr[index++]=num;
            }else{
            set.add(num);
            }
        }
    for(int i=1;i<=nums.length;i++){

        if(!set.contains(i)){
            arr[index++]=i;
        }
    }
return arr;
    }
}