/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt1;

/**
 *
 * @author quyetdx16
 */
public class Motor {

// attribute
    protected int number;
    protected String symbol;
    protected String fullname;
    protected float weight;

//    contructor
    public Motor() {
    }

    public Motor(int number, String symbol, String fullname, float weight) {
        this.number = number;
        this.symbol = symbol;
        this.fullname = fullname;
        this.weight = weight;
    }

//    get set 
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

//    toString
    @Override
    public String toString() {
        return "Motor{" + "number=" + number + ", symbol=" + symbol + ", fullname=" + fullname + ", weight=" + weight + '}';
    }

//    method display
    public void display() {
        System.out.println("number=" + number + ", symbol=" + symbol + ", fullname=" + fullname + ", weight=" + weight);
    }

}
