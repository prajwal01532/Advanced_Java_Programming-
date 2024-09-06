package snakegameusingjava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.URISyntaxException;
import java.util.Random;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SnakeGame extends JFrame {

    private static final int BOARD_WIDTH = 600;
    private static final int BOARD_HEIGHT = 600;
    private static final int UNIT_SIZE = 25;
    private static final int DELAY = 140;
    private static final int ALL_UNITS = (BOARD_WIDTH * BOARD_HEIGHT) / (UNIT_SIZE * UNIT_SIZE);

    private final int x[] = new int[ALL_UNITS];
    private final int y[] = new int[ALL_UNITS];

    private int snakeLength;
    private int appleX;
    private int appleY;
    private char direction = 'R';
    private boolean running = false;
    private Timer timer;
    private Random random;

    public SnakeGame() {
        random = new Random();
        setTitle("Snake Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(BOARD_WIDTH, BOARD_HEIGHT);
        setLocationRelativeTo(null);

        // Initialize the game panel and add it to the frame
        GamePanel gamePanel = new GamePanel();
        add(gamePanel);

        setVisible(true);
        startGame();
    }

    private void startGame() {
        snakeLength = 6;
        for (int i = 0; i < snakeLength; i++) {
            x[i] = 100 - i * UNIT_SIZE;
            y[i] = 100;
        }
        spawnApple();
        running = true;
        timer = new Timer(DELAY, new GameCycle());
        timer.start();
    }

    private void spawnApple() {
        appleX = random.nextInt((int) (BOARD_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
        appleY = random.nextInt((int) (BOARD_HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
    }

    private void move() {
        for (int i = snakeLength; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }

        switch (direction) {
            case 'U' -> y[0] -= UNIT_SIZE;
            case 'D' -> y[0] += UNIT_SIZE;
            case 'L' -> x[0] -= UNIT_SIZE;
            case 'R' -> x[0] += UNIT_SIZE;
        }
    }

    private void checkApple() {
        if ((x[0] == appleX) && (y[0] == appleY)) {
            snakeLength++;
            spawnApple();
        }
    }

    private void checkCollision() {
        // Check if snake hits its body
        for (int i = snakeLength; i > 0; i--) {
            if ((x[0] == x[i]) && (y[0] == y[i])) {
                running = false;
            }
        }

        // Check if snake hits the wall
//        if (x[0] < 0 || x[0] >= BOARD_WIDTH || y[0] < 0 || y[0] >= BOARD_HEIGHT) {
//            running = true;
//        }
        

if (x[0] < 0) {
    x[0] = BOARD_WIDTH;
}
if (x[0] >= BOARD_WIDTH) {
    x[0] = 0;
}
if (y[0] < 0) {
    y[0] = BOARD_HEIGHT;
}
if (y[0] >= BOARD_HEIGHT) {
    y[0] = 0;
}
        

        if (!running) {
            timer.stop();
            playSound("game_over.wav");
        }
    }

    private void playSound(String soundFileName) {
        try {
            File soundFile = new File(getClass().getResource(soundFileName).toURI());
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(soundFile));
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class GameCycle implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (running) {
                checkApple();
                checkCollision();
                move();
            }
            repaint(); // Trigger repaint to update the GamePanel
        }
    }

    private class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();

            if ((key == KeyEvent.VK_LEFT) && (direction != 'R')) {
                direction = 'L';
            }

            if ((key == KeyEvent.VK_RIGHT) && (direction != 'L')) {
                direction = 'R';
            }

            if ((key == KeyEvent.VK_UP) && (direction != 'D')) {
                direction = 'U';
            }

            if ((key == KeyEvent.VK_DOWN) && (direction != 'U')) {
                direction = 'D';
            }
        }
    }

    private class GamePanel extends JPanel {

        public GamePanel() {
            setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
            setBackground(Color.BLACK);
            setFocusable(true);
            addKeyListener(new MyKeyAdapter());
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (running) {
                draw(g);
            } else {
                gameOver(g);
            }
        }

        private void draw(Graphics g) {
            g.setColor(Color.RED);
            g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

            for (int i = 0; i < snakeLength; i++) {
                if (i == 0) {
                    g.setColor(Color.GREEN);
                } else {
                    g.setColor(Color.BLUE);
                }
                g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
            }
        }

        private void gameOver(Graphics g) {
            String message = "Game Over";
            Font font = new Font("Helvetica", Font.BOLD, 48);
            FontMetrics metrics = getFontMetrics(font);

            g.setColor(Color.RED);
            g.setFont(font);
            g.drawString(message, (BOARD_WIDTH - metrics.stringWidth(message)) / 2, BOARD_HEIGHT / 2);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SnakeGame::new);
        
    }
}
