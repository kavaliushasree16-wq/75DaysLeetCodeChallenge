class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int diff=Math.abs(requests[0]-0);
        int count=0;
        count+=diff;
        for(int i=1;i<requests.length;i++){
            diff=Math.abs(requests[i]-requests[i-1]);
            count+=diff;
        }
        return count;
    }
}