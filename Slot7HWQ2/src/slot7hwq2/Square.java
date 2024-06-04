/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slot7hwq2;

/**
 *
 * @author quyet
 */
public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        super.setWidth(side);
        super.setLength(side);
    }

    public double getSide() {
        return this.getLength();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" + super.toString() + '}';
    }

}
