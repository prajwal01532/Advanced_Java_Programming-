package videoplayer;

import javazoom.jl.decoder.Bitstream;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MP3PlayerPanel extends JPanel {
    private AdvancedPlayer player;
    private Thread playerThread;

    public MP3PlayerPanel() {
        JButton openButton = new JButton("Open MP3");
        openButton.addActionListener(e -> openMP3File());
        add(openButton);
    }

    private void openMP3File() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();
            playMP3(filePath);
        }
    }

    private void playMP3(String filePath) {
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            player = new AdvancedPlayer(fileInputStream);
            playerThread = new Thread(() -> {
                try {
                    player.play();
                } catch (JavaLayerException e) {
                    e.printStackTrace();
                }
            });
            playerThread.start();
        } catch (FileNotFoundException | JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

