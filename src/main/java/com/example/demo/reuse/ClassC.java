package com.example.demo.reuse;

public class ClassC extends ClassA {
    private ClassB[] classB = new ClassB[3];

    public ClassC() {
//        classB = new ClassB(1);
    }


    @Override
    public void testA() {
        super.testA();
    }
}
