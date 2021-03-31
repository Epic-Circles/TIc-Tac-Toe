import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

public class Main extends JFrame implements ActionListener {

    boolean[] hasClicked = {false , false , false , false , false , false , false , false , false};

    String turn;

    JButton[] buttons = { new JButton(), new JButton(), new JButton(), new JButton(), new JButton(), new JButton(),
            new JButton(), new JButton(), new JButton() };

    JPanel panel;
    JPanel scorePanel;
    JLabel turnLabel;

    public Main() {

        turn = "X";

        turnLabel = new JLabel("turn : " + turn);

        panel = new JPanel();
        scorePanel = new JPanel();

        panel.setLayout(new GridLayout(3, 3, 10, 10));
        scorePanel.setBounds(0, 0, 550, 70);
        panel.setBounds(0, 80, 530, 469);

        scorePanel.setBackground(Color.CYAN);

        scorePanel.add(turnLabel);
        turnLabel.setFont(new Font("ComicSans" , Font.PLAIN , 32));

        for (int i = 0; i < buttons.length; i++) {
            panel.add(buttons[i]);
        }
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].addActionListener(this);
        }
        for(int i = 0;i < hasClicked.length;i++) {
            hasClicked[i] = false;
        }

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 600);
        setResizable(true);
        setLayout(null);
        add(scorePanel);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        // panel.setBackground(Color.GREEN);
        // getContentPane().setBackground(Color.BLUE);

    if(buttons[0].getText() == "X" && buttons[1].getText() == "X" && buttons[2].getText() == "X")
    {
        turn = "XWon";
    }
    if(buttons[3].getText() == "X" && buttons[4].getText() == "X" && buttons[5].getText() == "X")
    {
        turn = "XWon";
    }
    if(buttons[6].getText() == "X" && buttons[7].getText() == "X" && buttons[8].getText() == "X")
    {
        turn = "XWon";
    }
    if(buttons[0].getText() == "X" && buttons[3].getText() == "X" && buttons[6].getText() == "X")
    {
        turn = "XWon";
    }
    if(buttons[1].getText() == "X" && buttons[4].getText() == "X" && buttons[7].getText() == "X")
    {
        turn = "XWon";
    }
    if(buttons[2].getText() == "X" && buttons[5].getText() == "X" && buttons[8].getText() == "X")
    {
        turn = "XWon";
    }
    if(buttons[0].getText() == "X" && buttons[4].getText() == "X" && buttons[8].getText() == "X")
    {
        turn = "XWon";
    }
    if(buttons[2].getText() == "X" && buttons[4].getText() == "X" && buttons[6].getText() == "X")
    {
        turn = "XWon";
    }

    if(buttons[0].getText() == "O" && buttons[1].getText() == "O" && buttons[2].getText() == "O")
    {
        turn = "OWon";
    }
    if(buttons[3].getText() == "O" && buttons[4].getText() == "O" && buttons[5].getText() == "O")
    {
        turn = "OWon";
    }
    if(buttons[6].getText() == "O" && buttons[7].getText() == "O" && buttons[8].getText() == "0")
    {
        turn = "OWon";
    }
    if(buttons[0].getText() == "O" && buttons[3].getText() == "O" && buttons[6].getText() == "O")
    {
        turn = "OWon";
    }
    if(buttons[1].getText() == "O" && buttons[4].getText() == "O" && buttons[7].getText() == "O")
    {
        turn = "OWon";
    }
    if(buttons[2].getText() == "O" && buttons[5].getText() == "O" && buttons[8].getText() == "O")
    {
        turn = "OWon";
    }
    if(buttons[0].getText() == "O" && buttons[4].getText() == "O" && buttons[8].getText() == "O")
    {
        turn = "OWon";
    }
    if(buttons[2].getText() == "O" && buttons[4].getText() == "O" && buttons[6].getText() == "O")
    {
        turn = "OWon";
    }


    



    

    
    

    if(turn == "X"){

        if(e.getSource() == buttons[0] && !hasClicked[0])
        {
            buttons[0].setText("X");
            hasClicked[0] = true;
            turn = "O";
        }
        if(e.getSource() == buttons[1] && !hasClicked[1])
        {
            buttons[1].setText("X");
            hasClicked[1] = true;
            turn = "O";
        }
        if(e.getSource() == buttons[2] && !hasClicked[2])
        {
            buttons[2].setText("X");
            hasClicked[2] = true;
            turn = "O";
        }
        if(e.getSource() == buttons[3] && !hasClicked[3])
        {
            buttons[3].setText("X");
            hasClicked[3] = true;
            turn = "O";
        }
        if(e.getSource() == buttons[4] && !hasClicked[4])
        {
            buttons[4].setText("X");
            hasClicked[4] = true;
            turn = "O";
        }
        if(e.getSource() == buttons[5] && !hasClicked[5])
        {
            buttons[5].setText("X");
            hasClicked[5] = true;
            turn = "O";
        }
        if(e.getSource() == buttons[6] && !hasClicked[6])
        {
            buttons[6].setText("X");
            hasClicked[6] = true;
            turn = "O";
        }
        if(e.getSource() == buttons[7] && !hasClicked[7])
        {
            buttons[7].setText("X");
            hasClicked[7] = true;
            turn = "O";
        }
        if(e.getSource() == buttons[8] && !hasClicked[8])
        {
            buttons[8].setText("X");
            hasClicked[8] = true;
            turn = "O";
        }

    }

    if(turn == "O")
    {
        if(e.getSource() == buttons[0] && !hasClicked[0])
        {
            buttons[0].setText("O");
            hasClicked[0] = true;
            turn = "X";
        }
        if(e.getSource() == buttons[1] && !hasClicked[1])
        {
            buttons[1].setText("O");
            hasClicked[1] = true;
            turn = "X";
        }
        if(e.getSource() == buttons[2] && !hasClicked[2])
        {
            buttons[2].setText("O");
            hasClicked[2] = true;
            turn = "X";
        }
        if(e.getSource() == buttons[3] && !hasClicked[3])
        {
            buttons[3].setText("O");
            hasClicked[3] = true;
            turn = "X";
        }
        if(e.getSource() == buttons[4] && !hasClicked[4])
        {
            buttons[4].setText("O");
            hasClicked[4] = true;
            turn = "X";
        }
        if(e.getSource() == buttons[5] && !hasClicked[5])
        {
            buttons[5].setText("O");
            hasClicked[5] = true;
            turn = "X";
        }
        if(e.getSource() == buttons[6] && !hasClicked[6])
        {
            buttons[6].setText("O");
            hasClicked[6] = true;
            turn = "X";
        }
        if(e.getSource() == buttons[7] && !hasClicked[7])
        {
            buttons[7].setText("O");
            hasClicked[7] = true;
            turn = "X";
        }
        if(e.getSource() == buttons[8] && !hasClicked[8])
        {
            buttons[8].setText("O");
            hasClicked[8] = true;
            turn = "X";
        }
    }

    if(turn == "XWon"){
        System.out.println("X has won");
    }
    if(turn == "OWon"){
        System.out.println("O has won");
    }

    turnLabel.setText("turn : " + turn);

    }
}