package main;

import javax.swing.*;

public class RPSButton extends JButton {
    private int sign;

    public RPSButton(String text, int sign) {
        super(text);
        this.sign = sign;
    }

    public int getSign() {
        return sign;
    }
}
