/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author Soha
 */

import Model.InvoiceHeadr;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class headerController extends DefaultTableModel {

    private String[] cloNames = {"INV Num", "Customer Name", "Inv Date", "Total"};
    private ArrayList<InvoiceHeadr> invoices;

    public headerController(ArrayList<InvoiceHeadr> invoices) {
        this.cloNames = cloNames;
        this.invoices = invoices;
    }

    @Override
    public int getRowCount() {
        if(this.invoices ==null){
         invoices=new  ArrayList<>();
        }
        return invoices.size();
    }

    @Override
    public int getColumnCount() {
        return cloNames.length;
    }

    @Override
    public void removeRow(int row) {
    invoices.remove(row);
    }
    

    @Override
    public Object getValueAt(int row, int cloume) {

        InvoiceHeadr inv = invoices.get(row);
        switch (cloume) {
            case 0:
                return inv.getNum();
            case 1:
                return inv.getCusName();
            case 2:
                return inv.getDate();
            case 3:
                return inv.getInvTotal();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return cloNames[column];
    }

    public ArrayList<InvoiceHeadr> getInvoices() {
        return invoices;
    }

}