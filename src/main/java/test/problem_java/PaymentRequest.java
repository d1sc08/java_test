/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.problem_java;

import java.util.Date;

public class PaymentRequest {
    private String number;
    private Date data;
    private String user;
    private String counterparty;
    private double sum;
    private String value;
    private double courseValue;
    private double change;
    
    public String getNum(){
        return number;
    }
    public void setNum(String number) {
        this.number = number;
    }
    
    public Date getData(){
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    
    public String getUser(){
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    
    public double getSum(){
        return sum;
    }
    public void setSum(double sum) {
        this.sum = sum;
    }
    
    public String getValue(){
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    
    public double getcValue(){
        return courseValue;
    }
    public void setcValue(double courseValue) {
        this.courseValue = courseValue;
    }
    
    public String getContr(){
        return counterparty;
    }
    public void setContr(String counterparty) {
        this.counterparty = counterparty;
    }
    
    public double getChange(){
        return change;
    }
    public void setChange(double change) {
        this.change = change;
    }
}
