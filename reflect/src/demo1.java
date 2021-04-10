import java.lang.reflect.Field;

/**
 * @author hutao
 */
public class demo1 {
    public static void main(String[] args) throws Exception {
        Class person = Class.forName("Person");
        System.out.println(person.getName());

        Field f = person.getDeclaredField("name");
        f.setAccessible(true);
        System.out.println(f.toString());
        Person p = new Person();
        p.setName("张三");
        System.out.println(f.get(p));
    }
}
