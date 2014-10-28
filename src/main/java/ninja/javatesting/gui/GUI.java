package ninja.javatesting.gui;

import ninja.javatesting.reference.Reference;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

/*@author ViolentNinjaD

  Licensed under LGPL V3

*/
public class GUI extends JComponent
{
    public static JFrame frame = new JFrame(Reference.guiName);
    public static void showGUI()
    {
        JPanel panel = null;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel emptyLabel = new JLabel("");
        emptyLabel.setPreferredSize(new Dimension(Reference.guiWidth, Reference.guiHeight));

        //frame.getContentPane().add(background, BorderLayout.CENTER);
        try
        {
            frame.setContentPane(panel = new JPanel()
            {
                BufferedImage image = ImageIO.read(new File(Reference.APPDATA + "\\JavaTesting_BackgroundImage.png"));
                public void paintComponent(Graphics g)
                {
                    super.paintComponent(g);
                    g.drawImage(image, 0, 0, null);
                }
            });
        }catch(Exception e){
            e.printStackTrace();
        }
        frame.setPreferredSize(new Dimension(Reference.guiWidth, Reference.guiHeight));
        frame.pack();

        String iconDir = Reference.APPDATA + "\\JavaTesting_GUIimage.png";
        System.out.println(iconDir);
        File guiIcon = new File(iconDir);
        ImageIcon imgIcon = new ImageIcon(iconDir);
        frame.setIconImage(imgIcon.getImage());

        frame.setVisible(true);

        //frame.add(panel);
        JButton closeButton = new JButton();
        frame.add(closeButton, BorderLayout.SOUTH);
        closeButton.addActionListener(new ActionListeners.ActionClose());
        closeButton.setBounds(325, 475, 150, 25);
        closeButton.setPreferredSize(new Dimension(150, 25));
        closeButton.setLayout(null);

        String closeIconDir = Reference.APPDATA + "\\JavaTesting_CloseButtonIcon.png";
        closeButton.setIcon(new ImageIcon(closeIconDir));
    }
}
