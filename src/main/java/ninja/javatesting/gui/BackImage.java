package ninja.javatesting.gui;

import javax.swing.*;
import java.awt.*;

/*@author ViolentNinjaD

  Licensed under LGPL V3

*/
public class BackImage extends JComponent
{
    private Image image;
    public BackImage(Image image)
    {
        this.image = image;
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        g.drawImage(image, 0, 0, null);
    }
}
