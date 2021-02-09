package spring_introduction;


import org.springframework.stereotype.Component;


@Component

public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override


    public void sound(){
        System.out.println("bow wow");}

        public void init(){
            System.out.println("Class Dog: init method");
        }
        public void destroy(){
            System.out.println("Class Dog: destroy method");
        }

}
