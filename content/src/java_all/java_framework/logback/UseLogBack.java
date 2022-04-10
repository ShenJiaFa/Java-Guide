package java_all.java_framework.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Function: Use logback
 *
 * @author: ShenJiaFa
 * @since: 2022/4/8
 */
public class UseLogBack {

    public static final Logger LOG = LoggerFactory.getLogger(UseLogBack.class);
    public static void main(String[] args) {

        while (true) {
            try {
                LOG.debug("Main start");
                LOG.info("Start performing division");
                int a=10;
                int b=0;
                LOG.trace("a="+a);
                LOG.trace("b="+b);
                System.out.println(a/b);
            } catch (Exception e) {
                e.printStackTrace();
                LOG.error("Abnormal function "+e);
            }
        }

    }
}
