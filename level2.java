import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2 extends World
{

    /**
     * Constructor for objects of class level2.
     * 
     */
    public Player player = new Player();
    public level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        showText("Level 2", 50, 580);
        prepare();
    }
    
    public void prepare()
    {
        getBackground().setColor(Color.BLACK);
        getBackground().fill();

        addObject(player, 300, 550);
        for(int i = 0; i < 8; i++)
            for(int j = 8; j > i; j--)
                    addObject(new Block(), 60 + 70 * i, 20 + 30 * j);
        Ball2 ball = new Ball2(player, this);
        addObject(ball,300, 450);
    }
}