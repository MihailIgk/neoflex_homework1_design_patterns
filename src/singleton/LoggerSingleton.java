package singleton;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedList;

public class LoggerSingleton {
    private LinkedList<String> log = new LinkedList<>();
    private static volatile LoggerSingleton instance;
    private LoggerSingleton() { }
    public static LoggerSingleton getInstance() {
        LoggerSingleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized(LoggerSingleton.class) {
            if (instance == null) {
                instance = new LoggerSingleton();
            }
            return instance;
        }
    }
    public LoggerSingleton add(Object obj) {
        Class objClass = obj.getClass();
        Method[] classMethods = objClass.getDeclaredMethods();
        String classData = "Class " + objClass.getName();
        for (Method method : classMethods) {
            classData += "; Method - " + method.getName()
                    + ", returns type: " + method.getReturnType()
                    + ", parameter types: " + Arrays.toString(method.getParameterTypes());
        }
        log.add(classData);
        return this;
    }
    public void show() {
        log.forEach(System.out::println);
    }
}
