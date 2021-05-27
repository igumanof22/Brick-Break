import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level3 extends World
{

    /**
     * Constructor for objects of class level3.
     * 
     */
    public Player player = new Player();
    public level3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        showText("Level 3", 50, 580);
        prepare();
    }
    
    public void prepare()
    {
        getBackground().setColor(Color.BLACK);
        getBackground().fill();

        addObject(player, 300, 550);
        for(int i = 0; i < 7; i++)
            for(int j = 7; j > i; j--)
                    addObject(new Block(), 60 + 70 * i, 1 + 30 * j);
        for(int i = 7; i > 0; i--)
            for(int j = 0; j < i; j++)
                    addObject(new Block(), 60 + 70 * i, 261 + 30 * j);
        Ball3 ball = new Ball3(player, this);
        addObject(ball,300, 450);
    }
}
