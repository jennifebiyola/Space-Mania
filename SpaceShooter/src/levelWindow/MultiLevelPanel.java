package levelWindow;

import board.*;
import otherWindow.StartGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiLevelPanel extends JComponent implements ActionListener {
    private JButton level[];
    private String levelNames[];
    private MultiLevel levelWindow;

    public MultiLevelPanel(MultiLevel levelWindow) {
        this.setLayout(null);
        this.levelNames = new String[]{"/image/easybutton.png", "/image/mediumbutton.png", "/image/hardbutton.png", "/image/backbutton.png"};
        this.level = new JButton[4];
        this.setFocusable(false);
        this.levelWindow = levelWindow;
        this.configureButton();
    }

    private void configureButton() {
        for (int i = 0; i < level.length; i++) {
            ImageIcon im = new ImageIcon(this.getClass().getResource(levelNames[i]));
            level[i] = new JButton(im);
            level[i].setBounds(225, 100 + i * 55, 130, 40);
            level[i].addActionListener(this);
            this.add(level[i]);
        }
    }


    //pr tambahin gameboardpanel scnd player
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == level[0]){
            GameBoardFrameMulti gb = new GameBoardFrameMulti();
            levelWindow.setVisible(false);
            levelWindow.dispose();
        }
        else if(e.getSource() == level[1]){
            GameBoardFrameMultiMedium gb = new GameBoardFrameMultiMedium();
            levelWindow.setVisible(false);
            levelWindow.dispose();
        }
        else if(e.getSource() == level[2]){
            GameBoardFrameMultiHard gb = new GameBoardFrameMultiHard();
            levelWindow.setVisible(false);
            levelWindow.dispose();
        }
        else if(e.getSource() == level[3]) {
            StartGame sg = new StartGame();
            levelWindow.setVisible(false);
            levelWindow.dispose();
        }
    }
}
