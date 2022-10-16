import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FantasmaV here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FantasmaV extends Actor
{
    /**
     * Act - do whatever the FantasmaV wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      public void act()
    {
          move(4); 
          
       if(isTouching(Cubo.class)||isTouching(MuroParado.class)){
        turn(180);
        }
        
        // Add your action code here.
    }
}
