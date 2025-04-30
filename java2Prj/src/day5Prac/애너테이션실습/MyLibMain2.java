package day5Prac.애너테이션실습;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyLibMain2 {

   public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, InvocationTargetException {
      // TODO Auto-generated method stub
      
      MyLib lib = new MyLib();
      
      //lib.printStar2(15);
      
      Class clazz = lib.getClass();
      
      Method m = clazz.getDeclaredMethod("printStar2", int.class);
      
      Before anno = m.getAnnotation(Before.class);
      String before = anno.before();
      
      System.out.println(before);
      m.invoke(lib, 3);
      
      
   }

}
