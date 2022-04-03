package spike_activity;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Function: Judge whether the spike was successful
 *
 * @author: ShenJiaFa
 * @since: 2022/4/3
 */
public class SpikeActivity {
    public static void main(String[] args) throws ParseException {

        String dateChen = "2020年11月11日0：03：47";
        String dateZhou = "2020年11月11日0：10：11";

        String startDate = "2020年11月11日0：00：00";
        String endDate = "2020年11月11日0：10：00";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH：mm：ss");

        System.out.println(getSpikeResult(dateChen, startDate, endDate, sdf));
        System.out.println(getSpikeResult(dateZhou, startDate, endDate, sdf));
    }

    /**
     * Get spike activity result
     *
     * @param userDateStr  User date
     * @param startDateStr Start date
     * @param endDateStr   End Date
     * @param sdf          SimpleDateFormat object
     * @return Spike activity result
     * @throws ParseException
     */
    private static String getSpikeResult(String userDateStr, String startDateStr, String endDateStr, SimpleDateFormat sdf) throws ParseException {
        long userDate = sdf.parse(userDateStr).getTime();
        long startDate = sdf.parse(userDateStr).getTime();
        long endDate = sdf.parse(endDateStr).getTime();
        return userDate >= startDate && userDate <= endDate ? "Spike success!" : "Spike fail!";
    }
}
