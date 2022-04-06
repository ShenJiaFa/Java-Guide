package java_all.java_se.practice.complex_practice.simulate_race.util;

import java.util.Random;

/**
 * Function: Generate speed util class
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class SpeedUtil {

    /**
     * Generate speed method
     *
     * @param FlatSpeed     Flat road speed
     * @param SandSpeed     Sand road speed
     * @param MountainSpeed Mountain road speed
     * @return Speed Array
     */
    public static double[] generateSpeed(float FlatSpeed, float SandSpeed, float MountainSpeed) {
        FlatSpeed += new Random().nextInt(20);
        SandSpeed += new Random().nextInt(20);
        MountainSpeed += new Random().nextInt(20);
        double[] speeds = {FlatSpeed, SandSpeed, MountainSpeed};
        return speeds;
    }
}
