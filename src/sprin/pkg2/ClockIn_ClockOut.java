/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprin.pkg2;

/**
 *
 * @author wongc
 */
public class ClockIn_ClockOut extends ClockIn_ClockOutInterface{

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
        private String clockInTime;
        private String clockOutTime;

    
        
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

    public String getClockInTime() {
        return clockInTime;
    }

    public void setClockInTime(String category) {
        this.clockInTime = clockInTime;
    }

    public String getClockOutTime() {
        return clockOutTime;
    }

    public void setClockOutTime(String prepareTime) {
        this.clockOutTime = clockOutTime;
    }
    
}
