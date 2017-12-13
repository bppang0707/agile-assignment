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
public class Menu_Update {
    public static void main(String args[]) throws IOException {
        File fileName = new File("Menu.txt");
        ArrayList mList = new ArrayList();
        String menu = " ";
        
        while (!menu.isEmpty()){
            menu = JOptionPane.showInputDialog("Name a friend");
            if (!menu.isEmpty()) mList.add(menu);
        }
        
        try {
            FileWriter fw = new FileWriter(fileName);
            Writer output = new BufferedWriter(fw);
            int sz = mList.size();
            for (int i = 0;i < sz; i++){
                output. write(mList.get(i).toString()+"\n");
            }
            output.close();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "I cannot create that file");
        }
    }
}
