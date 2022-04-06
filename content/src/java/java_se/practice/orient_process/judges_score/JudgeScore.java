package java.java_se.practice.orient_process.judges_score;

/**
 * Function: Judges score
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
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
