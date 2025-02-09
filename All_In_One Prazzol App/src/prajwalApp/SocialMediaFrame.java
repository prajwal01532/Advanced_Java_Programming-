package prajwalApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

public class SocialMediaFrame extends JFrame {

    public SocialMediaFrame() {
        // Set the title of the frame
        setTitle("MediaJam");

        // Set the layout manager to BorderLayout for proper positioning
        setLayout(new BorderLayout());

        // Create a panel for the grid icons
        JPanel iconPanel = new JPanel();
        iconPanel.setLayout(new GridLayout(4, 3, 0, 0)); // 4 rows, 3 columns, no gap between components

        // Load and resize the logos to 150x150
        ImageIcon youtubeIcon = new ImageIcon(new ImageIcon("youtube.png").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        ImageIcon facebookIcon = new ImageIcon(new ImageIcon("facebook.png").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        ImageIcon instaIcon = new ImageIcon(new ImageIcon("instagram.png").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        ImageIcon snapchatIcon = new ImageIcon(new ImageIcon("snapchat.png").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        ImageIcon telegramIcon = new ImageIcon(new ImageIcon("telegram.jpeg").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        ImageIcon whatsappIcon = new ImageIcon(new ImageIcon("whatsapp.png").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        ImageIcon linkedinIcon = new ImageIcon(new ImageIcon("linkedin.jpeg").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        ImageIcon messengerIcon = new ImageIcon(new ImageIcon("messenger.png").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
       // ImageIcon twitterIcon = new ImageIcon(new ImageIcon("snapchat.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        ImageIcon discordIcon = new ImageIcon(new ImageIcon("discord.png").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        ImageIcon quoraIcon = new ImageIcon(new ImageIcon("quora.jpeg").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        ImageIcon threadsIcon = new ImageIcon(new ImageIcon("threads.jpg").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));
        ImageIcon githubIcon = new ImageIcon(new ImageIcon("github.png").getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH));

        // Create labels with the icons
        JLabel youtubeLabel = new JLabel(youtubeIcon);
        JLabel facebookLabel = new JLabel(facebookIcon);
        JLabel instaLabel = new JLabel(instaIcon);
        JLabel snapLabel = new JLabel(snapchatIcon);
        JLabel telegramLabel = new JLabel(telegramIcon);
        JLabel whatsappLabel = new JLabel(whatsappIcon);
        JLabel linkedinLabel = new JLabel(linkedinIcon);
        JLabel messengerLabel = new JLabel(messengerIcon);
       // JLabel twitterLabel = new JLabel(twitterIcon);
        JLabel discordLabel = new JLabel(discordIcon);
        JLabel quoraLabel = new JLabel(quoraIcon);
        JLabel threadsLabel = new JLabel(threadsIcon);
        JLabel githubLabel = new JLabel(githubIcon);

        // Add mouse click listeners to open websites
        youtubeLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openWebsite("https://www.youtube.com");
            }
        });

        facebookLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openWebsite("https://www.facebook.com");
            }
        });

        instaLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openWebsite("https://www.instagram.com");
            }
        });

        snapLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openWebsite("https://www.snapchat.com");
            }
        });

        telegramLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openWebsite("https://www.telegram.com");
            }
        });

        whatsappLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openWebsite("https://www.whatsapp.com");
            }
        });

        linkedinLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openWebsite("https://www.LinkedIn.com");
            }
        });

        messengerLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openWebsite("https://www.messenger.com");
            }
        });

        /*snapchatLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openWebsite("https://www.snapchat.com");
            }
        });*/

        discordLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openWebsite("https://www.discord.com");
            }
        });

        quoraLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openWebsite("https://www.quora.com");
            }
        });

        threadsLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openWebsite("https://www.threads.com");
            }
        });

        githubLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                openWebsite("https://www.github.com");
            }
        });

        // Add the labels to the iconPanel
        iconPanel.add(youtubeLabel);
        iconPanel.add(facebookLabel);
        iconPanel.add(instaLabel);
        iconPanel.add(threadsLabel);
        iconPanel.add(whatsappLabel);
        iconPanel.add(snapLabel);
        iconPanel.add(telegramLabel);
        iconPanel.add(messengerLabel);
        iconPanel.add(discordLabel);
        iconPanel.add(linkedinLabel);
        iconPanel.add(githubLabel);
        iconPanel.add(quoraLabel);

        // Add iconPanel to the center of the frame
        add(iconPanel, BorderLayout.CENTER);

        // Create a label for the copyright notice
        JLabel copyrightLabel = new JLabel("© Copyright Prazzol Pokhrel.", JLabel.CENTER);
        copyrightLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        copyrightLabel.setForeground(Color.GRAY);

        // Add the copyright label to the bottom of the frame
        add(copyrightLabel, BorderLayout.SOUTH);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the frame to fit the grid and copyright label
        setSize(500, 700);

        // Center the frame on the screen
        setLocationRelativeTo(null);

        // Make the frame visible
        setVisible(true);
    }

    // Method to open a website in the default browser
    private void openWebsite(String url) {
        try {
            Desktop.getDesktop().browse(new URI(url));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Run the application
        SwingUtilities.invokeLater(SocialMediaFrame::new);
    }
}
