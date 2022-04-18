package pl.edu.pw.mini.zpoif.task4a.solution;

import pl.edu.pw.mini.zpoif.task4a.MyLovelySittingRoom;
import pl.edu.pw.mini.zpoif.task4a.SittingRoom;

import javax.print.DocFlavor;
import java.awt.*;
import java.lang.annotation.Annotation;
import java.lang.invoke.TypeDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Demonstrator extends Solution{

    @Override
    protected MyLovelySittingRoom task1() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class clazz = Class.forName("pl.edu.pw.mini.zpoif.task4a.MyLovelySittingRoom");
        MyLovelySittingRoom myLovelySittingRoom = (MyLovelySittingRoom) clazz.newInstance();
        return myLovelySittingRoom;
    }

    @Override
    protected void task2() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class clazz = Class.forName("pl.edu.pw.mini.zpoif.task4a.MyLovelySittingRoom");
        Object roomlabel = clazz.getField("ROOM_LABEL").get(null);
        System.out.println("Room Label = " + roomlabel);
    }

    @Override
    protected void task3(Object object) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        // Class clazz = Class.forName("pl.edu.pw.mini.zpoif.task4a.MyLovelySittingRoom");
        // MyLovelySittingRoom myLovelySittingRoom = (MyLovelySittingRoom) clazz.newInstance();
        Class clazz = object.getClass();
        Integer people = (Integer) clazz.getField("PEOPLE_LIVING").get(null);
        Field f = clazz.getDeclaredField("PEOPLE_LIVING");
        f.setAccessible(true);
        f.set(object, people + 1);
        f.setAccessible(false);
    }

    @Override
    protected SittingRoom task4(Object object) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // Class clazz = Class.forName("pl.edu.pw.mini.zpoif.task4a.MyLovelySittingRoom");
        Class clazz = object.getClass();
        Class superClazz = clazz.getSuperclass();
        MyLovelySittingRoom myLovelySittingRoom = (MyLovelySittingRoom) superClazz.newInstance();
        return myLovelySittingRoom;
    }

    @Override
    protected void task5(Object object) throws ClassNotFoundException {
        // Class clazz = Class.forName("pl.edu.pw.mini.zpoif.task4a.MyLovelySittingRoom");
        Class clazz = object.getClass();
        Stream
                .of(clazz.getMethods())
                .filter(m -> m.getParameterCount() < 2)
                .map(m -> m.getName() + ":" + m)
                .forEach(System.out::println);
    }

    @Override
    protected void task6(Object object) {
        // Class clazz = Class.forName("pl.edu.pw.mini.zpoif.task4a.MyLovelySittingRoom");
        Class clazz = object.getClass();
        Method[] temp1 = clazz.getMethods();
        int x;
        for (int i = 0; i < temp1.length; i++) {
            Class<?>[] temp2 = temp1[i].getParameterTypes();
            for (int j = 0; j < temp2.length; j++) {
                if (temp2[j].getName().equals("String")) {
                     x = i;
                     break;
                }
            }
        }
        temp1[x]("hello");
    }

    @Override
    protected MyLovelySittingRoom task7(Object object) {
        // Class clazz = Class.forName("pl.edu.pw.mini.zpoif.task4a.MyLovelySittingRoom");
        Class clazz = object.getClass();
        return null;
    }

    @Override
    protected void task8(Object object) {
        // Class clazz = Class.forName("pl.edu.pw.mini.zpoif.task4a.MyLovelySittingRoom");
        Class clazz = object.getClass();
        Class superClazz = clazz.getSuperclass();
        Method f = superClazz.getDeclaredMethod(calculateVolume);
        System.out.println(f);
    }

    @Override
    protected void task9(Object object) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchFieldException {
        // Class clazz = Class.forName("pl.edu.pw.mini.zpoif.task4a.MyLovelySittingRoom");
        Class clazz = object.getClass();
        Class[] allclasses = clazz.getClasses();
        Optional<? extends Class<? extends Stream>> result = Stream
                .of(Arrays.stream(allclasses).getClass())
                .filter(m -> m.getName() == "Table").findFirst();
        Class clazz2;
        clazz2 = (result) clazz.newInstance();
        Class clazz3 = Class.forName("pl.edu.pw.mini.zpoif.task4a.MyLovelySittingRoom");
        MyLovelySittingRoom myLovelySittingRoom = (MyLovelySittingRoom) clazz3.newInstance();
        Field f = clazz3.getDeclaredField("MyLovelyTable");
        f.setAccessible(true);
        f.set(myLovelySittingRoom, clazz2);
        f.setAccessible(false);
    }
}
