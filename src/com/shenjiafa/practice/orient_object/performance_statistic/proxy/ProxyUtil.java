package com.shenjiafa.practice.orient_object.performance_statistic.proxy;

import com.shenjiafa.practice.orient_object.performance_statistic.origin.UserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Function: ProxyUtil
 *
 * @author ShenJiaFa
 * @since 2022/6/19
 */
public class ProxyUtil {
    public static UserService getProxy(UserService obj) {
        return (UserService) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                long startTime = System.currentTimeMillis();
                Object rs = method.invoke(obj, args);
                long endTime = System.currentTimeMillis();
                System.out.println(method.getName() + (endTime - startTime) / 1000.0 + "s");
                return rs;
            }
        });
    }
}
