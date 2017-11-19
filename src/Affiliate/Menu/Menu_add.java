/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Affiliate.Menu;

/**
 *
 * @author wongc
 */
public class Menu_add extends Menu_addInterface{

    /**
     * @param args the command line arguments
     */
        private String itemID;

    public String getCustID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }
        private String name;
        private String category;
        private double price;
        private String prepareTime;

    
        
//     public String toString()
//     {
//         return;
//     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPrepareTime() {
        return prepareTime;
    }

    public void setPrepareTime(String prepareTime) {
        this.prepareTime = prepareTime;
    }
    
}
