package videoplayer;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Media Viewer");

        JTabbedPane tabbedPane = new JTabbedPane();

        // Add the panels to the tabs
        tabbedPane.addTab("Video Player", new VideoPlayerPanel());
        tabbedPane.addTab("Image Viewer", new ImageViewerPanel());
        tabbedPane.addTab("MP3 Player", new MP3PlayerPanel());

        frame.add(tabbedPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
