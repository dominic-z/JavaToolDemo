package jvm.invokedynamic;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;

/**
 * @author dominiczhu
 * @version 1.0
 * @title InvokeExtact
 * @date 2021/8/18 上午11:17
 */
public class MethodLookupInvoke {
    public static void bar(Object o) {
        new Exception().printStackTrace();
    }

    private Integer getInt(String s) {
        System.out.println(s);
        return 10;
    }

    public static void main(String[] args) throws Throwable {
        MethodHandles.Lookup l = MethodHandles.lookup();
        MethodType barType = MethodType.methodType(void.class, Object.class);
        MethodHandle bar = l.findStatic(MethodLookupInvoke.class, "bar", barType);

        bar.invokeExact(new Object());
        bar.invoke("");

        MethodType getIntType = MethodType.methodType(Integer.class, String.class);
        MethodHandle getInt = l.findVirtual(MethodLookupInvoke.class, "getInt", getIntType);
        Integer intValue = (Integer) getInt.invoke(new MethodLookupInvoke(), "ssss");
        System.out.println("getInt res: " + intValue);

        Field lambdaFormField = MethodHandle.class.getDeclaredField("form");
        lambdaFormField.setAccessible(true);

        Object barForm = lambdaFormField.get(bar);
        System.out.println("barForm: " + barForm.toString());

        Object getIntForm = lambdaFormField.get(getInt);
        System.out.println("getIntForm: " + getIntForm.toString());

    }
}
