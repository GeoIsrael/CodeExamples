package io.gui;

import javax.swing.*;
import java.awt.*;

public class QuitHandlerDemo {
    private static final int YES_OPTION = 1;
    private static final int YES_NO_OPTION = 0;

    private static class MainFrame extends JFrame {
        public MainFrame() throws HeadlessException {
            setTitle("Quit Handler");
            setSize(400, 300);
            setVisible(true);
        }
    }
    public static void main(final String[] args) {
        final MainFrame frame = new MainFrame();
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        final Desktop desktop = Desktop.getDesktop();
        desktop.setQuitHandler((e, response) -> {
            final int result = JOptionPane
                    .showConfirmDialog(frame, "Quit the app?", "Quit?", YES_NO_OPTION);
            if (result == YES_OPTION) {
                response.performQuit();
            } else {
                response.cancelQuit();
            }
        });
    }
}