package math;

public class MyMath {

    static double roundX(double x,int n){
        x=x*Math.pow(10,n);
        return Math.round(x)/Math.pow(10,n);
    }
    static double round100(double x){
        x=x/100;
        return Math.round(x)*100;
    }

    static double floorX(double x, int n){
        x=x*Math.pow(10, n);
        return Math.floor(x)/Math.pow(10,n);
    }

    static double floor100(double x){
        x=x/100;
        return Math.floor(x)*100;
    }

    static double ceilX(double x, int n){
        x=x*Math.pow(10, n);
        return Math.ceil(x)/Math.pow(10,n);
    }

    static double ceil100(double x){
        x=x/100;
        return Math.ceil(x)*100;
    }

}
