/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt1;

/**
 *
 * @author quyetdx16
 */
//ke thua
public class IMotor extends Motor {

//    attribute
    private int price;

//    constructer
    public IMotor() {
    }

    public IMotor(int price, int number, String symbol, String fullname, float weight) {
        super(number, symbol, fullname, weight);
        this.price = price;
    }
    
//    get set method

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
//    override display

    @Override
    public void display() {
        super.display();
    }

}
