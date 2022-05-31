package com.shenjiafa.practice.orient_object.print_info.framework;

import java.lang.reflect.Field;

/**
 * Function: Print info util
 *
 * @author ShenJiaFa
 * @since 2022/5/30
 */
public class PrintInfoUtil {
    public static void save(Object o) {

        Class oClass = o.getClass();
        System.out.println("======" + oClass.getSimpleName() + "======");
        Field[] fields = oClass.getDeclaredFields();

        for (Field field : fields) {
            try {
                field.setAccessible(true);
                System.out.println(field.getName() + " : " + field.get(o));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

    }
}
