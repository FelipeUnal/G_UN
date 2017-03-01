/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Estudiante
 */
public class A {
    
    private B[] bs;
    private int Con;
   
    
    public A(int b){
        this.bs = new B[5];
        this.bs[0] = new B(5);
        this.bs[1] = new B(5);
        this.bs[2] = new B(5);
        this.bs[3] = new B(5);
        this.bs[4] = new B(5);
        Con =5;
    }
    
    public void addB(int b){
        if(this.Con<5){
            this.bs[Con] = new B(b);
            Con++;
        }
    }
    
    public static void main(String[] args){
        B b1 = new B(5);
        A a = new A();
        //B existe antes de que exista A
        a.addB(b1);
        
        
        
    }
    
}