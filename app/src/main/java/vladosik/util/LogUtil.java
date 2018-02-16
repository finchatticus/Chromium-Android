package vladosik.util;

/**
 * Created by android on 16.02.18.
 */

public class LogUtil {

    public static String getLogTag(Class c) {
        return "VLADOSIK_" + c.getSimpleName();
    }

}
