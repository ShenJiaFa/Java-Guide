package judges_score;

/**
 * function: Judges score
 * <p>
 * Author: ShenJiaFa
 * Since: 2022/3/13-13:07
 */
public class JudgeScore {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 4};
        System.out.println(score(nums));
    }

    /**
     * Judges score
     *
     * @param nums Array to be calculated
     * @return Average score
     */
    private static double score(int[] nums) {
        int maxScore = nums[0];
        int minScore = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            //Find the maximum value first
            if (nums[i] > maxScore) {
                maxScore = nums[i];
            }
            //Find the minimum value again
            if (nums[i] < minScore) {
                minScore = nums[i];
            }
            sum += nums[i];
        }
        return (sum - maxScore - minScore) / (nums.length - 2.0);
    }
}