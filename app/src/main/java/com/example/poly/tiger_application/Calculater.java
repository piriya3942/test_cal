package com.example.poly.tiger_application;
public class Calculater {
    int plus(int x,int y){
        return x+y;
    }
    int minus(int x,int y){
        return x-y;
    }
    int muliply(int x,int y){
        return x*y;
    }
    int drivid(int x,int y){
        if(y==0)
            return 0;
        else
            return x/y;
    }
}
