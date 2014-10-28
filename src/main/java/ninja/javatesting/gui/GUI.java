package ninja.javatesting.gui;

import ninja.javatesting.reference.Reference;

import javax.swing.*;
import java.awt.*;

/*@author ViolentNinjaD

  Licensed under LGPL V3

*/
public class GUI 
{
    public static void showGUI()
    {
        JFrame frame = new JFrame(Reference.guiName);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(Reference.guiWidth, Reference.guiHeight));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        frame.pack();
        frame.setVisible(true);
    }
}
