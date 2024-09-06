package videoplayer;

import uk.co.caprica.vlcj.factory.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;

import javax.swing.*;
import java.awt.*;

public class VideoPlayerPanel extends JPanel {
    private EmbeddedMediaPlayer mediaPlayer;

    public VideoPlayerPanel() {
        setLayout(new BorderLayout());

        Canvas videoCanvas = new Canvas();
        add(videoCanvas, BorderLayout.CENTER);

        MediaPlayerFactory mediaPlayerFactory = new MediaPlayerFactory();
        mediaPlayer = mediaPlayerFactory.mediaPlayers().newEmbeddedMediaPlayer();
        mediaPlayer.videoSurface().set(mediaPlayerFactory.videoSurfaces().newVideoSurface(videoCanvas));

        JButton openButton = new JButton("Open Video");
        openButton.addActionListener(e -> openVideoFile());
        add(openButton, BorderLayout.SOUTH);
    }

    private void openVideoFile() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();
            mediaPlayer.media().play(filePath);
        }
    }
}
