package io.gui;

import javax.swing.*;
import java.awt.*;

public class MultiResolutionImageDemo {
    private static class ImageCanvas extends JComponent {
        private final String name;
        public ImageCanvas(final String name) {
            this.name = name;
        }
        @Override
        public void paint(final Graphics g) {
            final Image image = Toolkit.getDefaultToolkit()
                    .getImage(
                            MultiResolutionImageDemo.class
                                    .getResource(String.format("/home/g/Yandex.Disk/MY/WallPapers/", this.name)));
            g.drawImage(image, 10, 10, this);
            g.dispose();
        }
    }
    public static void main(final String[] args) {
        final JFrame frame = new JFrame();
        frame.setTitle("Multi-resolution images");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        final ImageCanvas canvas = new ImageCanvas("ZPKx3nx.png");
        frame.add("Center", canvas);
        frame.setSize(360, 300);
        frame.setVisible(true);
    }
}