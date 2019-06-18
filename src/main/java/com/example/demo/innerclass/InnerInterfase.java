package com.example.demo.innerclass;

public interface InnerInterfase {
    void print(String msg);

}

class InnerInterfaseImpl implements InnerInterfase {

    @Override
    public void print(String msg) {
        System.out.println("msg = [" + msg + "]");
    }
}
