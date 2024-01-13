class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        int n=nums.length;

        HashMap<Integer,Integer> numMap=new HashMap<>();
        int[] result=new int[2];

        for(int i=0;i<n;i++){
            if(numMap.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=numMap.get(target-nums[i]);
                return result;
            }
            numMap.put(nums[i],i);
        }

        return result;
    }
}