class Solution 
{
  public long maximumValueSum(int[] nums, int k, int[][] edges) 
  {
    long baseSum = 0;
    List<Integer> gains = new ArrayList<>();
    for (int num : nums) 
    {
      int xorVal = num ^ k;
      int gain = xorVal - num;
      baseSum += num;
      gains.add(gain);
    }
    gains.sort(Collections.reverseOrder());
    long maxGain = 0, currentGain = 0;
    int count = 0;
    for (int g : gains) 
    {
      currentGain += g;
      count++;
      if (count % 2 == 0) 
      {
        maxGain = Math.max(maxGain, currentGain);
      }
    }
    return baseSum + maxGain;
  }
}