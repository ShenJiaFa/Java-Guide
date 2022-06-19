package com.shenjiafa.theory.design_patterns.proxy;

/**
 * Function: Use proxy
 *
 * @author ShenJiaFa
 * @since 2022/6/2
 */
public class UseProxy {
    public static void main(String[] args) {

        Star jack = new Star("Jack");
        Skill starAgent =StarAgentProxy.getAgentProxy(jack);
        starAgent.dance();
        starAgent.sing();

    }
}
