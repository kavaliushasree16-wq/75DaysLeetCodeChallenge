class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list=new ArrayList<>();
       
        for(int num: nums1){
            for(int numb: nums2){
                int result=num^numb;
                if(list.contains(num)){
                    continue;
                }
               if(result==0){
                list.add(num);
               }
            }
        }

        int size=list.size();
        int ans[]=new int[size];

        for(int i=0;i<size;i++){
            ans[i]=list.get(i);
        }

        return ans;
    }
}