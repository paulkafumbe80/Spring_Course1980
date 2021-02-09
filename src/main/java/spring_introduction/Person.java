package spring_introduction;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {


@Autowired
@Qualifier("dog")
    private Pet pet;
@Value("${person.surname}")
    private String surname;
@Value("${person.age}")
    private int age;




//@Autowired

   //public Person(@Qualifier("dog") Pet pet) {
    //  System.out.println("Person bean is created");
     // this.pet = pet;
 // }


    //public Person() {
       // System.out.println("Person is created");

   // }

   // @Autowired
    public void setPet(Pet pet) {
        System.out.println("Class Person: set pet");
        this.pet = pet;
    }

    public String getSurname() {
        System.out.println("Class Person: set surname");
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public void callYourPet(){
        System.out.println("Hello my lovely pet!");
        pet.sound();
    }
}
