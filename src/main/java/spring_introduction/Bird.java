package spring_introduction;

public class Bird implements Pet{
    public Bird() {
        System.out.println("Bird bean is created");
    }

    @Override
    public void sound() {
        System.out.println("koko-liko");

    }
}
