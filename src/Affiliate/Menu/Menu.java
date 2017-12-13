/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Affiliate.Menu;

/**
 *
 * @author HP
 */
public class Menu {
    
        public String name = "";
        public String category = "";
        public String prepareTime = "";
        public double price = 0;

    public Menu(String name, String category, String prepareTime, double price) {
            this.name = name;
            this.category = category;
            this.prepareTime = prepareTime;
            this.price = price;
        }
        
        
        

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getPrepareTime() {
        return prepareTime;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrepareTime(String prepareTime) {
        this.prepareTime = prepareTime;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Menu{" + "name=" + name + ", category=" + category + ", prepareTime=" + prepareTime + ", price=" + price + '}';
    }
        
        
}
