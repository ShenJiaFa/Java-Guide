package com.shenjiafa.theory.design_patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Function: Generate star agent object
 *
 * @author ShenJiaFa
 * @since 2022/6/19
 */
public class StarAgentProxy {

    public static Skill getAgentProxy(Star obj) {

        return (Skill) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("Charge performance fee!");
                method.invoke(obj, args);
                System.out.println("The performance is over, the star goes home");
                return null;
            }
        });
    }

}
