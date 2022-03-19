package paper_fold;

/**
 * Function: Calculate the fold times
 *
 * Author: ShenJiaFa
 * Since: 2022/3/13-12:07
 */
public class PaperFold {
    public static void main(String[] args) {
        double height = 0.1;
        int count = 0;
        while (height < 8848860) {
            count++;
            height *= 2;
        }
        System.out.println(count);
    }
}
