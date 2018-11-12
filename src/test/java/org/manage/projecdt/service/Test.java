package org.manage.projecdt.service;

public class Test {

    public static void main(String[] args){
        double t=1.0038461538461538;
        double sum=330.0000000000000;
        for(int i=0;i<676;i++){
            sum=(sum*t+330);
        }
        System.out.print(sum);
    }
}
