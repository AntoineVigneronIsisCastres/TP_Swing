package swing.src.main.java.com.example;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import org.w3c.dom.events.MouseEvent;

public class MaFrame extends JFrame implements MouseListener {

    public MaFrame(){
        setSize(500,300);
        setTitle("Voilà une fenêtre");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("souris cliquée ds la fenetre");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("souris pressee ds la fenetre");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("souris relachée ds la fenetre");
    }

    public void mouseEntered(MouseEvent e) {
        this.getContentPane().setBackground(Color.pink);
    }

    public void mouseExited(MouseEvent e) {
        this.getContentPane().setBackground(Color.green);
    }

    public void actionPerformed(MouseEvent e) {
        System.out.println("Bouton pressé hé hé hé");
    }
    
    
}
