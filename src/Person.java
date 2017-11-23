/**
 * Created by ZXJ on 2017/11/23.
 */
public class Person {
    private String  name;
    private int age;
    Person (){
        super();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
