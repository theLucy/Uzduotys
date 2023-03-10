package main;

import javax.swing.*;
import java.awt.*;
import java.util.Map;
import java.util.Random;

public class App {

    public static Map<Integer, Integer> strongerThan = Map.of(
            1, 3,
            2, 1,
            3, 2
    );
    public static void main(String[] args) {

        JFrame frame = new JFrame("Rock Paper Scissors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 300);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        try {UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");} catch(Exception ignored) {}

        Font customFont = frame.getContentPane().getFont().deriveFont(Font.BOLD, 50);

        frame.getContentPane().setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new FlowLayout());
        JPanel centerPanel = new JPanel(new FlowLayout());

        RPSButton rockButton = new RPSButton("Rock", 1);
        RPSButton paperButton = new RPSButton("Paper", 2);
        RPSButton scissorsButton = new RPSButton("Scissors", 3);
        rockButton.setFont(customFont);
        paperButton.setFont(customFont);
        scissorsButton.setFont(customFont);

        topPanel.add(rockButton);
        topPanel.add(paperButton);
        topPanel.add(scissorsButton);

        JLabel label = new JLabel();
        label.setFont(customFont);
        centerPanel.add(label);

        frame.getContentPane().add(BorderLayout.NORTH, topPanel);
        frame.getContentPane().add(BorderLayout.CENTER, centerPanel);

        rockButton.addActionListener(e -> label.setText(metimas(rockButton.getSign())));
        paperButton.addActionListener(e -> label.setText(metimas(paperButton.getSign())));
        scissorsButton.addActionListener(e -> label.setText(metimas(scissorsButton.getSign())));

        frame.setVisible(true);
    }

    public static int cpuChoice() {
        return new Random().nextInt(1,4);
    }

    public static String metimas(int sign) {
        int kompiuteris = cpuChoice();

        if (kompiuteris == sign) return "Draw!";
        else if(strongerThan.get(kompiuteris) == sign) return "You Won!";
        else return "You Lost!";
    }
}