package com.shenjiafa.theory.design_patterns.factory;

import com.shenjiafa.theory.design_patterns.factory.base.Computer;
import com.shenjiafa.theory.design_patterns.factory.model.Mac;
import com.shenjiafa.theory.design_patterns.factory.model.PC;

/**
 * Function: Computer factory
 *
 * @author ShenJiaFa
 * @since 2022/6/22
 */
public class ComputerFactory {

    /**
     * Get computer instance
     *
     * @param computerName Computer name
     * @return Computer instance
     */
    public static Computer getComputer(String computerName) {
        switch (computerName) {
            case "Mac":
                return new Mac("MacBook Pro 2022", 19999.0);
            case "PC":
                return new PC("Surface Pro 2022", 15999.0);
            default:
                return null;
        }
    }
}
