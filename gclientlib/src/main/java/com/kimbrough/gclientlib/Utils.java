package com.kimbrough.gclientlib;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author Rofaeil Ashaiaa
 *         Created on 19/02/18.
 */

public class Utils {

    /**
     * Get a diff between two dates
     * reference link:
     * https://stackoverflow.com/questions/1555262/calculating-the-difference-between-two-java-date-instances
     *
     * @param date1 the oldest date
     * @param date2 the newest date
     * @param timeUnit the unit in which you want the diff
     * @return the diff value, in the provided unit
     */
    public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
        long diffInMillies = date2.getTime() - date1.getTime();
        return timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS);
    }

}
