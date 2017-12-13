package sprin3;

import java.util.ArrayList;

public class checkStatus extends checkStatusInterface{

    public void deliveryMan() {
       
       ArrayList<deliveryMan> list = new ArrayList<deliveryMan>();
       deliveryMan d = new deliveryMan();
       d.setName("BP Pang");
       d.setStatus("avelable");
       list.add(d);
       
       d.setName("CK Wong");
       d.setStatus("not avelable");
       list.add(d);
       
       d.setName("James Tai");
       d.setStatus("delivering");
       list.add(d);
       
    }
    
    public void deliveryManStatus(){
        
    }
}
