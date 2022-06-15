package packageb;

import packagea.ClassA;

public class ClassB {

    public static void main(String[] args) {
        ClassA.hello();
        System.out.println("Now hello from ClassB");
    }

}
