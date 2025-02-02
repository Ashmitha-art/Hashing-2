// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * We store 0,1 in map first to avoid missing any edge cases. 
 * We have a running sum and check if the (running sum - target) is present in our map. 
 * If present, we increment count, else we simply add it to the map with the frequency of the occurance. 
 * 
 */
class subArray {
    public int subArray(int[] nums, int k) {
        int rsum = 0; 
        int count =0; 
        HashMap<Integer, Integer> map= new HashMap<>();
        map.put(0,1);
        for(int i=0; i < nums.length; i++){
            rsum +=nums[i];
            if(map.containsKey(rsum-k)){
                count+=map.get(rsum-k);
            }
            if(!map.containsKey(rsum))
            map.put(rsum,0);
            map.put(rsum,map.get(rsum)+1);
        }
        return count; 
    }
}