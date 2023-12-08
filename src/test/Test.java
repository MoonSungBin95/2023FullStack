package test;
import java.util.*;
public class Test {
public static void main(String[] args) {
   HashSet set = new HashSet();

   set.add("abc");
   set.add("abc");
   set.add(new Person2("David", 11));
   set.add(new Person2("David", 11));
   
   Person2 a = new Person2("David", 11);
   Person2 b = new Person2("David", 11);
   
   boolean c = a.equals(b);
   boolean d = a instanceof Person2;
   boolean e = b instanceof Person2;
   
   Iterator it = set.iterator();
   
   while(it.hasNext()) {
      Object b1 = it.next();
      int a1=b1.hashCode();
      System.out.println(a1);
   }
   
   
   System.out.println(set);
   System.out.println(e);
   System.out.println(c);
   System.out.println(set);
}
}


class Person2 {
   String name;
   int age;
   
   
   
   Person2(String name, int age) {
      
      this.name = name;
      this.age = age;
   }

   @Override
   public String toString() {
      return "[name=" + name + ", age=" + age + "]";
   }


   @Override
   public boolean equals(Object o) {
      
      if(o instanceof Person2) {
	      Person2 tmp = (Person2)o;
	      return name.equals(tmp.name)&& age==tmp.age;
      }
         //      return name == ((Person2) o).getName() && age == ((Person2) o).getAge(); 
//      }else
      return false;
   }
   
   public int hashCode() {
      return (name+age).hashCode();
   }
   
}