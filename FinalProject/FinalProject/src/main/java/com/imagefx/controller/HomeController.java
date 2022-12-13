package com.imagefx.controller;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;

import javax.imageio.ImageIO;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * HomeController class
 */
public class HomeController {
    /**
     * method that converts image to different formats png, jpeg, jpg
     */
    public boolean saveImageToFile(Image image, File file, String formatName) {
        BufferedImage bImage = SwingFXUtils.fromFXImage(image, null);
        try {
            ImageIO.write(bImage, formatName, file);
            return true;
        }
        catch (IOException e) {
            return false;
        }
    }
}
