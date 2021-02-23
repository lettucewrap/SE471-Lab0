package LineDrawing;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class LineDrawingTest{

    public static void main(String[] args) {
        LiningPanel panel = new LiningPanel();
        AnimateLines animatePanel = new AnimateLines(panel);
        Thread thread = new Thread(animatePanel);

        MakeButton button = new MakeButton(animatePanel);
        button.getButton();

        JFrame application = new JFrame();
        JPanel topPanel = new JPanel(new BorderLayout());
        JPanel bottomPanel = new JPanel(new BorderLayout());

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        topPanel.add(button.getButton());
        application.getContentPane().add(topPanel, "North");   // Add Button to North

        bottomPanel.add(panel);
        application.getContentPane().add(bottomPanel);   // Add Lines Panel

        application.setTitle("Lining Art");
        application.setSize(300, 300);
        application.setVisible(true);

        thread.start();


    }
}
