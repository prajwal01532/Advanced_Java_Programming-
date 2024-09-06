package chessGAme;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChessGame extends JFrame {
    private JButton[][] boardSquares = new JButton[8][8];
    private JPanel boardPanel;

    // Unicode symbols for chess pieces
    private final String[][] initialBoard = {
        {"\u265C", "\u265E", "\u265D", "\u265B", "\u265A", "\u265D", "\u265E", "\u265C"},
        {"\u265F", "\u265F", "\u265F", "\u265F", "\u265F", "\u265F", "\u265F", "\u265F"},
        {"", "", "", "", "", "", "", ""},
        {"", "", "", "", "", "", "", ""},
        {"", "", "", "", "", "", "", ""},
        {"", "", "", "", "", "", "", ""},
        {"\u2659", "\u2659", "\u2659", "\u2659", "\u2659", "\u2659", "\u2659", "\u2659"},
        {"\u2656", "\u2658", "\u2657", "\u2655", "\u2654", "\u2657", "\u2658", "\u2656"},
    };

    private String currentPlayer = "White";

    public ChessGame() {
        setTitle("Chess Game");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Initialize the board
        boardPanel = new JPanel(new GridLayout(8, 8));
        initializeBoard();
        add(boardPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private void initializeBoard() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                boardSquares[row][col] = new JButton(initialBoard[row][col]);
                boardSquares[row][col].setFont(new Font("Arial", Font.PLAIN, 40));
                boardSquares[row][col].setBackground((row + col) % 2 == 0 ? Color.WHITE : Color.GRAY);
                boardSquares[row][col].setActionCommand(row + "," + col);
                boardSquares[row][col].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        handleClick(e);
                    }
                });
                boardPanel.add(boardSquares[row][col]);
            }
        }
    }

    private void handleClick(ActionEvent e) {
        String[] coords = e.getActionCommand().split(",");
        int row = Integer.parseInt(coords[0]);
        int col = Integer.parseInt(coords[1]);
        System.out.println("Clicked on: " + row + ", " + col);

        JButton clickedButton = boardSquares[row][col];

        // Placeholder for actual move logic
        if (!clickedButton.getText().isEmpty()) {
            System.out.println("Piece at (" + row + ", " + col + "): " + clickedButton.getText());
        }

        // Toggle current player (just a simple example)
        currentPlayer = currentPlayer.equals("White") ? "Black" : "White";
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ChessGame());
    }
}

