/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduledorders;

/**
 *
 * @author Andy
 */
public class Scheduled implements ScheduledInterface{
    private int time;

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    
    public ScheduledInterface addSchedule(ScheduledInterface time){
        Scheduled add = new Scheduled();
        
        
        
        return add;
    }
}
