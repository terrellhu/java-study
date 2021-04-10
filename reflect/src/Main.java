public class Main {
    public static void main(String[] args) throws Exception {
        Class person = Class.forName("Person");
        System.out.println(person.getName());

        Class person1 = Person.class;
        System.out.println(person1.getName());

        Person p = new Person();
        Class person2 = p.getClass();
        System.out.println(person2.getName());
    }
}
