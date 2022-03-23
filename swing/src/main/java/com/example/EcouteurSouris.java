package swing.src.main.java.com.example;

import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class EcouteurSouris extends MouseAdapter {

    @Override
    public void mouseEntered(MouseEvent e) {
        JFrame fenSource = (JFrame) (e.getSource());
        fenSource.getContentPane().setBackground(Color.pink);
        fenSource.repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        JFrame fenSource = (JFrame) (e.getSource());
        fenSource.getContentPane().setBackground(Color.green);
        fenSource.repaint();
    }
    
}
