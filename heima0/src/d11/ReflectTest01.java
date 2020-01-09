package d11;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);

        Class<? extends ArrayList> aClass = al.getClass();
        Method add = aClass.getMethod("add", Object.class);
        add.invoke(al, "hello");
        add.invoke(al, "java");

        System.out.println(al);
    }
}
