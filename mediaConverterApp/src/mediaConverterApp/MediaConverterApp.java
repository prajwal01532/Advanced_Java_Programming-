package mediaConverterApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class MediaConverterApp {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MediaConverterApp::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Media Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        panel.setBackground(Color.CYAN);

        JLabel urlLabel = new JLabel("URL:");
        JTextField urlField = new JTextField();
        JButton downloadButton = new JButton("Download and Convert");
        JButton convertImageButton = new JButton("Convert Image");

        panel.add(urlLabel);
        panel.add(urlField);
        panel.add(downloadButton);
        panel.add(convertImageButton);

        frame.add(panel, BorderLayout.CENTER);

        downloadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = urlField.getText();
                // Call a method to handle downloading and conversion
                try {
                    downloadAndConvertMedia(url);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
                }
            }
        });

        convertImageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    // Call a method to handle image conversion
                    try {
                        convertImageFormat(file.getAbsolutePath(), "output.jpg");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
                    }
                }
            }
        });

        frame.setVisible(true);
    }

    private static void downloadAndConvertMedia(String url) throws IOException {
        // Example implementation using FFmpeg for conversion
        // Replace with actual download and conversion logic
        System.out.println("Downloading and converting media from: " + url);
        // For demonstration, we'll assume the media file is "input.mp4" and we convert it to "output.mp3"
        String videoFilePath = "input.mp4";
        String outputFilePath = "output.mp3";
        convertVideoToMp3(videoFilePath, outputFilePath);
    }

    private static void convertVideoToMp3(String videoFilePath, String outputFilePath) throws IOException {
        String command = String.format("ffmpeg -i %s -q:a 0 -map a %s", videoFilePath, outputFilePath);
        Process process = Runtime.getRuntime().exec(command);
        // Handle process output/error streams as needed
        System.out.println("Video converted to MP3");
    }

    private static void convertImageFormat(String inputFilePath, String outputFilePath) throws IOException {
        // Use a library like TwelveMonkeys for actual image format conversion
        // This is a placeholder for actual implementation
        System.out.println("Converting image from " + inputFilePath + " to " + outputFilePath);
    }
}

