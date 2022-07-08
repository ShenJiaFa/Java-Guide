package com.shenjiafa.practice.orient_object.check_methods;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * Function: Run check
 *
 * @author ShenJiaFa
 * @since 2022/7/7
 */
public class RunCheck {
    public static void main(String[] args) throws IOException {

        Class clazz = Calculator.class;
        Method[] methods = clazz.getMethods();

        int count = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/shenjiafa/practice/orient_object/check_methods/check_result/Check_Result.txt"));

        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)) {
                try {
                    method.invoke(clazz.newInstance());
                } catch (Exception e) {
                    count++;
                    bw.write(method.getName() + " method has an exception!");
                    bw.newLine();
                    bw.write("Exception name:"+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("Exception reason:"+e.getCause().getMessage());
                    bw.newLine();
                    bw.write("--------------------------");
                    bw.newLine();
                }
            }
        }

        bw.write("Total number of exceptions:"+count);
        bw.flush();
        bw.close();

    }
}
