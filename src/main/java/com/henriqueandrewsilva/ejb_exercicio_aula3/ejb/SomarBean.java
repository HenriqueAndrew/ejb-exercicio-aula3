package com.henriqueandrewsilva.ejb_exercicio_aula3.ejb;

import java.util.Scanner;
import javax.ejb.Stateless;

//@author Henrique Andrew da Silva

@Stateless
public class SomarBean {

    private int num1;
    private int num2;
    private int soma;

    public SomarBean() {
    }
    
    public SomarBean(int num1, int num2, int soma){
        this.num1 = num1;
        this.num2 = num2;
        this.soma = soma;
        
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }
        
    public String calcular(){
        num1 = 3;
        num2 = 5;        
        soma = num1 + num2;         
        return Integer.toString(soma);        
    }
    
}
