package videoplayer;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class ImageViewerPanel extends JPanel {
    private JLabel imageLabel;

    public ImageViewerPanel() {
        setLayout(new BorderLayout());

        imageLabel = new JLabel("", SwingConstants.CENTER);
        add(imageLabel, BorderLayout.CENTER);

        JButton openButton = new JButton("Open Image");
        openButton.addActionListener(e -> openImageFile());
        add(openButton, BorderLayout.SOUTH);
    }

    private void openImageFile() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();
            ImageIcon imageIcon = new ImageIcon(filePath);
            imageLabel.setIcon(imageIcon);
        }
    }
}
