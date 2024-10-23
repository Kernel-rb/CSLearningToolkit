package com.kernel.singleton;

public class OnlyMe {
    private OnlyMe(){
    }
    private static  OnlyMe obj;

    public static OnlyMe getObj(){
        if(obj == null){
            obj = new OnlyMe();
        }
        return  obj;
    }
}
