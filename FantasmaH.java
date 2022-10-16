import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FantasmaH here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FantasmaH extends Actor
{
    /**
     * Act - do whatever the FantasmaH wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
          move(1); 
          
       if(isTouching(Cubo.class)||isTouching(MuroParado.class)){
        turn(180);
        }
        
        // Add your action code here.
    }
}
