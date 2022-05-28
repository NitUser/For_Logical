package com.app.demo;

public class DoubleCheckingForSingletone {
    private static volatile DoubleCheckingForSingletone _instance=null;

    private DoubleCheckingForSingletone() {

    }
    
    public static DoubleCheckingForSingletone get_instance(){
        if(_instance==null){  //first checking
            synchronized (DoubleCheckingForSingletone.class){
                if(_instance==null){   //second checking
                    _instance=new DoubleCheckingForSingletone();
                }
            }
        }
        return _instance;
    }
}
