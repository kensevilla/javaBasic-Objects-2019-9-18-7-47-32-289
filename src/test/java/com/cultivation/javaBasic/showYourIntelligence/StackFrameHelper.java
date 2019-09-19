package com.cultivation.javaBasic.showYourIntelligence;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class StackFrameHelper {
    public static String getCurrentMethodName(){
        // TODO: please modify the following code to pass the test
        // <--start
        Exception e = new Exception();
        return e.getStackTrace()[1].getClassName() + "." + e.getStackTrace()[1].getMethodName();
        // --end-->
    }
}
