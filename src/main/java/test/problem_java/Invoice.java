/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.problem_java;
import java.util.Date;

public class Invoice {
    private String number;
    private Date data;
    private String user;
    private double sum;
    private String value;
    private double courseValue;
    private String item;
    private double count;
    
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
    
    public String getItem(){
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }
    
    public double getCount(){
        return count;
    }
    public void setCount(double count) {
        this.count = count;
    }
}
