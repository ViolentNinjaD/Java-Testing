package ninja.javatesting;

import ninja.javatesting.gui.GUI;

import javax.swing.*;
import java.awt.*;

/*@author ViolentNinjaD

  Licensed under LGPL V3

*/
public class JavaTesting 
{
    public static void main(String[] args)
    {
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                GUI.showGUI();
            }
        });
    }
}
