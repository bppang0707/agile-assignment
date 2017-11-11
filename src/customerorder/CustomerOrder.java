/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerOrder;

/**
 *
 * @author wongc
 */
public class CustomerOrder extends customerOrderInterface{

    /**
     * @param args the command line arguments
     */
        private String custID;

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }
        private String Restaurant;
        private String Menu;
        private int quantity;

    public String getRestaurant() {
        return Restaurant;
    }

    public void setRestaurant(String Restaurant) {
        this.Restaurant = Restaurant;
    }

    public String getMenu() {
        return Menu;
    }

    public void setMenu(String Menu) {
        this.Menu = Menu;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
        
//     public String toString()
//     {
//         return;
//     }
    
}
