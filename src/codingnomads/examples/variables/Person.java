package codingnomads.examples.variables;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Person {

    String name;
    int age;
    static int numPersonsCreated;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        numPersonsCreated++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", numPersonsCreated=" + numPersonsCreated +
                '}';
    }
}
