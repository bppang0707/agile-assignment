/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduledorder;

/**
 *
 * @author Andy
 */
public interface ScheduledInterface {
    
    public void setTime (int time);
    public int getTime ();
    
    public ScheduledInterface addSchedule(ScheduledInterface time);
    
}
