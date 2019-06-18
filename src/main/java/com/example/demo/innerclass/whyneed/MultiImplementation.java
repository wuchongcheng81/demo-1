package com.example.demo.innerclass.whyneed;

class D {}
abstract class E {}
//当实现多继承时，如果继承的类的类型不同（比如抽象类），只能使用内部类实现多重继承
class Z extends D {
    E makeE() {
        return new E() {};
    }
}

public class MultiImplementation {

}
