package ninja.javatesting.gui;

import ninja.javatesting.reference.Reference;

import javax.swing.*;
import java.awt.*;
import java.io.File;

/*@author ViolentNinjaD

  Licensed under LGPL V3

*/
public class GUI 
{
    public static JFrame frame = new JFrame(Reference.guiName);
    public static void showGUI()
    {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(Reference.guiWidth, Reference.guiHeight));
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        frame.pack();

        String iconDir = Reference.APPDATA + "\\JavaTesting_GUIimage.png";
        System.out.println(iconDir);
        File guiIcon = new File(iconDir);
        ImageIcon imgIcon = new ImageIcon(iconDir);
        frame.setIconImage(imgIcon.getImage());

        frame.setVisible(true);

        JPanel panel = new JPanel();
        frame.add(panel);
        JButton closeButton = new JButton();
        panel.setLayout(null);
        panel.add(closeButton, BorderLayout.SOUTH);
        closeButton.addActionListener(new ActionListeners.ActionClose());
        closeButton.setBounds(325, 475, 150, 25);

        String closeIconDir = Reference.APPDATA + "\\JavaTesting_CloseButtonIcon.png";
        closeButton.setIcon(new ImageIcon(closeIconDir));
    }
}
