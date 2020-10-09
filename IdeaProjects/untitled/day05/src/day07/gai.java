package day07;
import java.awt.*;
import javax.swing.JFrame;
public class gai extends JFrame{
    private static final int WIDTH=500;
    private static final int HEIGHT=500;
    private static int WINDOW_WIDTH=Toolkit.getDefaultToolkit().getScreenSize().width;
    private static int WINDOW_HEIGHT=Toolkit.getDefaultToolkit().getScreenSize().height;
    public gai(){
        super("我爱盖德龙");
        this.setBackground(Color.BLACK);
        this.setLocation((WINDOW_WIDTH-WIDTH)/2,(WINDOW_HEIGHT-HEIGHT)/2);
        this.setSize(WIDTH,HEIGHT);
        this.setLayout(getLayout());
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public void paint(Graphics g){
        double x,y,r;
        Image image=this.createImage(WIDTH,HEIGHT);
        Graphics pic=image.getGraphics();
        for(int i=-2;i<90;i++){
            for(int j=-2;j<90;j++){
                r=Math.PI/45+Math.PI/45*i*(1-Math.sin(Math.PI/45*j))*18;
                x=r*Math.cos(Math.PI/45*j)*Math.sin(Math.PI/45*i)+WIDTH/2;
                y=-r*Math.sin(Math.PI/45*j)+HEIGHT/3;
                pic.setColor(Color.MAGENTA);
                pic.fillOval((int)x,(int)y,2,2);
            }
            g.drawImage(image,0,0,this);
        }

    }public static void main(String[] args){
        new gai();
    }
}
