package LineDrawing;

public class AnimateLines implements Runnable{
    private LiningPanel drawingPanel;
    private boolean stop = true;

    public AnimateLines (LiningPanel linePanel){
        drawingPanel = linePanel;
    }

    @Override
    public void run() {
        while(true){
            if (!isStopped()) {
                drawingPanel.repaint();
                drawingPanel.countingUp();
            }
            try {Thread.sleep(300);}
            catch (Exception e) {}
        }
    }

    public boolean isStopped(){
        return stop;
    }
    public void setStop(boolean stopper){
        this.stop = stopper;
    }
}
