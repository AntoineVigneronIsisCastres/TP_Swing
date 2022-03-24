package com.example;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseListener;

import javax.swing.*;

public class PremiereInterface {
    public static void main(String[] args) {
        JFrame fen = new MaFrame();
        
        JLabel j11 = new JLabel("Superbe Etiquette");
        JLabel j12 = new JLabel("Magnifique Etiquette");
        
        JButton jb1 = new JButton("B1");
        JButton jb2 = new JButton("B2");
        JButton jb3 = new JButton("B3");

        fen.addMouseListener( (MouseListener) fen);
        jb1.addActionListener((ActionListener) fen);

        Container fenCont = fen.getContentPane();
        fenCont.setLayout(new BorderLayout());
        
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(1,3));
        jp.add(j11); jp.add(jb1); jp.add(jb2); jp.add(jb3); jp.add(j12);
        fen.getContentPane().add(jp);
        
        fenCont.add(j11, BorderLayout.NORTH);
        fenCont.add(jp, BorderLayout.CENTER);
        fenCont.add(j12, BorderLayout.SOUTH);
        fen.setVisible(true);
    }
}