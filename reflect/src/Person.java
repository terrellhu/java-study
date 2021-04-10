/**
 * @author hutao
 */
public class Person {
    private String name;
    private int age;

    public void eat(){
        System.out.println("eat...");
    }

    public void eat(String food){
        System.out.println("eat..." + food);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
