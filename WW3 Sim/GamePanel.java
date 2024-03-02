import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
public class GamePanel extends JPanel implements Runnable{
    final int originalTileSize = 16;
    final int scale = 3;
    final int tileSize = 48;
    final int maxColumn = 16;
    final int maxRow = 12;
    final int width = 48 * 16;
    final int height = 48 * 12;
    int FPS = 5;
    Thread wwtThread;

    public void startGameThread(){
        wwtThread = new Thread(this);
        wwtThread.start();
    }
    public GamePanel(){
        this.setPreferredSize(new Dimension(width, height));
        this.setBackground(Color.blue);
        this.setDoubleBuffered(true);
    }
    public void run(){
        while(wwtThread != null){
            double drawInterval = 1.0;
            double nextDrawTime = drawInterval;
            update();
            repaint();
            try {
                Thread.sleep(1000);
                nextDrawTime += drawInterval;
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public void update(){

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.white);
        g2.fillOval(500,500, 20,20);
        g2.fillRect(100,100,16,16);
        g2.dispose();
    }
}
