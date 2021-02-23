package LineDrawing;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class MakeButton {
    private JButton controlButton;
    boolean isStopped = true;
    public AnimateLines drawingLines;

    public MakeButton(AnimateLines animate){
        drawingLines = animate;
        getButton().addActionListener(this::actionPerformed);
    }

    public JButton getButton(){
        return controlButton;
    }

    public void actionPerformed(ActionEvent e) {

        if (!isStopped) {
            isStopped = true;
            controlButton.setText("Resume");
            drawingLines.setStop(true);

        } else {
            isStopped = false;
            controlButton.setText("Stop");
            drawingLines.setStop(false);
        }
    }

}
