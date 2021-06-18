/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.problem_java;

import java.util.Date;

public class Payment {
    private String number;
    private Date data = new Date();
    private String user;
    private double sum;
    private String worker;
    
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
    
    public String getWorker(){
        return worker;
    }
    public void setWorker(String worker) {
        this.worker = worker;
    }
}
