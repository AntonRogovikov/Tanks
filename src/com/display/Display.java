package com.display;

import javax.swing.JFrame;
import java.awt.*;

/**
 * Created by Anton Rogovikov on 15.07.2017.
 */
public abstract class Display {
    private static boolean created = false;
    private static JFrame window;
    private static Canvas content;

    public static void create(int width, int heigth, String title){

        if(created) return;

        window = new JFrame(title);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        content = new Canvas(); // холст
        Dimension size = new Dimension(width, heigth);
        content.setPreferredSize(size); // задание размера холста
        window.getContentPane().add(content); // добавление контента в окно
        window.pack();
        window.setLocationRelativeTo(null); // окно по середине экрана
        window.setVisible(true);
        created = true;

    }
}
