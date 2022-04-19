/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Soha
 */
import Model.InvoiceHeadr;

public class InvoiceLine {

    private String product;
    private double price;
    private int count;
    private double lineTotal;
    private InvoiceHeadr invoice;

    public InvoiceLine(String product, double price, int count, InvoiceHeadr invoice) {
        this.product = product;
        this.price = price;
        this.count = count;
        this.invoice = invoice;
        this.setLineTotal(this.count*this.price);
    }

    public InvoiceHeadr getInvoice() {
        return invoice;
    }

    public void setInvoice(InvoiceHeadr invoice) {
        this.invoice = invoice;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(double lineTotal) {
        this.lineTotal = lineTotal;
    }

}