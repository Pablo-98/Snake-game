import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random; 



public  class gamePanel extends JPanel implements ActionListener{

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_WIDTH *SCREEN_HEIGHT)/UNIT_SIZE;
    static final int DELAY = 75;
    //holds all x coordinates of snake 
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];

    int bodyParts = 6;
    int applesEaten;
    int appleX;
    int appleY;

    char direction = 'R';
    
    boolean running = false;

    Timer timer;

    Random random;

//constructor for game panel 
    GamePanel() {
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable
            
    }
    //lets create a method called start game 

    public void startGame() {

    }
    public void paintComponent(Graphics g) {

    }
    public void draw(Graphics g) {

    }

    public void move() {

    }

    //snake eats apples we need a method for that

    public void checkApple() {

    }

    public void checkCollisions() {

    }

    public void gameOver (Graphicss g) {

    }

   
   
   
   
    @Override
    public void actionPerformed(ActionEvent e) {
        
    
        // TODO Auto-generated method stub
    }

    public class myKeyAdaptor extends KeyAdapter{
        @Override
        public void keyPressed(keyEvent e) {

        }
    }
    
}
