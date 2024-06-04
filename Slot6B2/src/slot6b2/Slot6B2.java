/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package slot6b2;

/**
 *
 * @author quyet
 */
public class Slot6B2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        InvoiceItem invoiceItem = new InvoiceItem("12", "desc 1", 50, 0.2);
        System.out.println("id : " + invoiceItem.getId());
        System.out.println("desc : " + invoiceItem.getDesc());
        System.out.println("qty : " + invoiceItem.getQty());
        System.out.println("unit price : " + invoiceItem.getUnitPrice());
        invoiceItem.setQty(15);
        invoiceItem.setUnitPrice(0.3);
        System.out.println("to String : " + invoiceItem);
        System.out.println("total : " + invoiceItem.getTotal());
        
        System.out.println(-23%7);
    }

}
