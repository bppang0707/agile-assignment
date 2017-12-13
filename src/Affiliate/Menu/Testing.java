/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Affiliate.Menu;
import java.io.*;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author HP
 */
public class Testing {
    public static void main(String args[]) throws IOException {
        String fileName = "Menu.txt";
        String line;
        ArrayList aList = new ArrayList();
        
        try{
            FileReader fr = new FileReader(fileName);
            BufferedReader input = new BufferedReader(fr);
            if (!input.ready()){
                throw new IOException();
            }
            while((line = input.readLine())!= null){
                aList.add(line);
            }
            input.close();
        }catch (IOException e){
            System.out.println(e);
        }
        
        int sz = aList.size();
        for(int i=0; i<sz;i++){
            System.out.println(aList.get(i).toString());
    }
}
    
}
