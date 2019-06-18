package com.example.demo.innerclass;

public class DotThis {
    public String name = "wucc";
    void f() {
        System.out.println("f()");
    }

    public class Inner {
        public String name = "123";
        public DotThis outer() {
            return DotThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        System.out.println(dt.name);
        DotThis.Inner dti = dt.new Inner();
        dti.outer().f();
    }
}

class test {

}
