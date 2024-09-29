package com.kernel.singleton;

public class Main {

    public static void main(String[] args) {
        // OnlyMe obj = new OnlyMe() =>  we can't create an obj cuz private ;

        OnlyMe obj = OnlyMe.getObj();
        OnlyMe obj2 = OnlyMe.getObj();
        // 2 ref -> 1 obj
    }
}
