package board;

//ini harusnya jadi menu game pas mulai
import mainWIndow.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameBoardFrameMedium extends JFrame {
    private GameBoardPanelMedium boardPanel;

    public  GameBoardFrameMedium(){
        setVisible(true);
        setTitle("Space Mania");
        setSize(1366, 768);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        GameBoardPanelMedium panel = new GameBoardPanelMedium();
        add(panel);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                panel.start();
            }
        });
    }

}
