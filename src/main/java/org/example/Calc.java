package org.example;

public class Calc {
   public int summ(int a, int b){
       int result = a + b;
       System.out.println("Сумма " + a + " и " + b + " равно " + result);
       //System.out.printf("Сумма %d и %d равна %d ", a, b, result);
       return result;
   }

    public int subt (int a, int b){
        int resultSubt = a - b;
        System.out.println ("Разница " + a + " и " + b + " равно " + resultSubt);
        //System.out.printf("Сумма %d и %d равна %d ", a, b, result);
        return resultSubt;
    }
}

