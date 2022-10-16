import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PacMan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacMan extends Actor
{
    /**
     * Act - do whatever the PacMan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int offsetY=0;
    int offsetX=0;
    int delayMount=0;
    int OFFSET=1;
    int score=0;
    public void act()
    {
        moveMount();
        teclado();
        moveIfNoCollision(offsetX,offsetY);
        comerFruta();
        contador();
        comerFantasma();
    }
    public void comerFantasma()
    {
        FantasmaH fan=(FantasmaH)getOneIntersectingObject(FantasmaH.class);
        FantasmaV fan2=(FantasmaV)getOneIntersectingObject(FantasmaV.class);
        if(fan!=null||fan2!=null){
           setLocation(72,468);
            offsetX=0;
            offsetY=0;
            setRotation(0);
        }
       
    }
    public void contador()
    {
        
        getWorld().showText(String.format("Score : %d",score),530,10); 
    }
    private void comerFruta(){
        Item fruta=(Item)getOneIntersectingObject(Item.class);
    
        if(fruta!=null){
            score += fruta.getScore();
            getWorld().removeObject(fruta);
        }
    }
    private void teclado(){
        if(Greenfoot.isKeyDown("Up")){
        offsetX=0;
        offsetY=-OFFSET;
        setRotation(-90);
        }
        if(Greenfoot.isKeyDown("Down")){
        offsetX=0;
        offsetY=OFFSET;
        setRotation(90);
        }
        if(Greenfoot.isKeyDown("Right")){
        offsetX=OFFSET;
        offsetY=0;
        setRotation(0);
        }
        if(Greenfoot.isKeyDown("Left")){
        offsetX=-OFFSET; 
        offsetY=0;
        setRotation(180);
        }
    }
    private void moveIfNoCollision(int dx,int dy){
        
        if(this.getOneObjectAtOffset(dx,dy,Cubo.class)==null){
         setLocation(getX()+dx,getY()+dy);
        }
        
    }

    private void moveMount(){
        delayMount++;
        if(delayMount==20){
            setImage("PacDerechaAbierto.jpg");
            delayMount=0;
        }
        if(delayMount==10){
            setImage("pacderecha.jpg");
        }
    }
    
    
}
