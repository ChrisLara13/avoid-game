import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AvoiderWorld extends World
{
    private GreenfootSound bkgMusic;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public AvoiderWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        //initialize the music
        bkgMusic = new GreenfootSound("sounds/UFO_T-Balt.mp3");
        bkgMusic.playLoop();
    }
    
    public void act()
    {
        if(Greenfoot.getRandomNumber(100) < 2)
        {
            Enemy e = new Enemy();
            int x = Greenfoot.getRandomNumber(getWidth()-20) + 10;
            int y = -20;
            super.addObject(e, x, y);
        }
    }
    
    public void endGame()
    {
        AvoiderGameOverWorld go = new AvoiderGameOverWorld();
        Greenfoot.setWorld(go);
    }
}
