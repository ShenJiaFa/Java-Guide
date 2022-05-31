package com.shenjiafa.practice.orient_object.print_info;

import com.shenjiafa.practice.orient_object.print_info.framework.PrintInfoUtil;
import com.shenjiafa.practice.orient_object.print_info.model.Student;
import com.shenjiafa.practice.orient_object.print_info.model.Teacher;

/**
 * Function: Run store info
 *
 * @author ShenJiaFa
 * @since 2022/5/31
 */
public class RunPrintInfo {
    public static void main(String[] args) {

        // Store Student's info
        PrintInfoUtil.save(new Student());
        PrintInfoUtil.save(new Student("Jack",'M',18,"Class One","Football"));

        // Store Teacher's info
        PrintInfoUtil.save(new Teacher());
        PrintInfoUtil.save(new Teacher("Jack",'M',28800));

    }
}
