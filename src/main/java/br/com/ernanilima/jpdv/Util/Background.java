package br.com.ernanilima.jpdv.Util;

import com.towel.swing.img.JImagePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import static com.towel.swing.img.JImagePanel.FillType.*;

/**
 * Classe utilizada para definir backgrounds direto no jPanel
 * utilizando o projeto towel
 *
 * @author Ernani Lima
 */
public class Background {

    /**
     * Metodo que retorna um JImagePanel para ser usado como background.
     * @param inputStream InputStream - Caminho da imagem de background
     * @return JImagePanel - Imagem de background lado a lado
     */
    public static JImagePanel getBackgroundSideBySide(InputStream inputStream) {
        return backgroundSideBySide(inputStream, SIDE_BY_SIDE);
    }

    /**
     * Metodo que retorna um JImagePanel para ser usado como background.
     * @param inputStream InputStream - Caminho da imagem de background
     * @return JImagePanel - Imagem de background centralizada
     */
    public static JImagePanel getBackgroundCenter(InputStream inputStream) {
        return backgroundSideBySide(inputStream, CENTER);
    }

    /**
     * Metodo que retorna um JImagePanel para ser usado como background.
     * @param inputStream InputStream - Caminho da imagem de background
     * @return JImagePanel - Imagem de background redimensionada
     */
    public static JImagePanel getBackgroundResize(InputStream inputStream) {
        return backgroundSideBySide(inputStream, RESIZE);
    }

    /**
     * Metodo que retorna um JImagePanel para ser usado como background
     * de acordo com o caminho da imagem informada no parametro.
     * @param inputStream InputStream - Caminho da imagem de background
     * @param fillType JImagePanel.FillType - Redimensionamento da imagem que vai retornar
     * @return JImagePanel - Imagem de background
     */
    private static JImagePanel backgroundSideBySide(InputStream inputStream, JImagePanel.FillType fillType) {
        try {
            BufferedImage imgBuffer = ImageIO.read(inputStream);
            JImagePanel background = new JImagePanel(imgBuffer);
            Rectangle rect = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
            background.setSize((int) rect.getWidth(), (int) rect.getHeight());
            background.setFillType(fillType);
            return background;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
