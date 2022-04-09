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
        LOG.debug("Main方法开始执行");
    }
}
