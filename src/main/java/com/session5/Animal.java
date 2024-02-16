package main.java.com.session5;

/*abstract class Animal
Attributes: name and age
Concrete methods: get info - prints the attributes
Abstract methods: sleep and make sound
 */
public abstract class Animal {
    //attributes
    String name;
    int age;

    //concrete methods
    public void getInfo(){
        System.out.println("The animal's name is :" + name + "and age :" + age);
    }

    //abstract methods
    public abstract void sleep();
    public abstract void makeSound();
}
