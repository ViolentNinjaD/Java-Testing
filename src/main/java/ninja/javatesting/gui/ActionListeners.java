package ninja.javatesting.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*@author ViolentNinjaD

  Licensed under LGPL V3

*/
public class ActionListeners 
{
    public static class ActionClose implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            GUI.frame.dispose();
            System.out.println("[JavaTesting]==Closed==");
        }
    }
}
