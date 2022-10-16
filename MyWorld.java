import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(583, 533, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    public void prepare()
    {
        //cuadrado
        MuroParado muroParado = new MuroParado();
        addObject(muroParado,563,266);
        Muro muro = new Muro();
        addObject(muro,273,513);
        MuroParado muroParado2 = new MuroParado();
        addObject(muroParado2,20,266);
        muro.setLocation(202,505);
        Muro muro2 = new Muro();
        addObject(muro2,290,20);
        muro.setLocation(222,516);
        removeObject(muro);
        Muro muro3 = new Muro();
        addObject(muro3,291,514);
        
        //personajes :v
        FantasmaH fantasmaH = new FantasmaH();
        addObject(fantasmaH,67,364);
        FantasmaH fantasmaH2 = new FantasmaH();
        addObject(fantasmaH2,349,186);
        FantasmaH fantasmaH3 = new FantasmaH();
        addObject(fantasmaH3,294,276);
        fantasmaH2.setLocation(135,204);
        PacMan pacMan = new PacMan();
        addObject(pacMan,72,468);
        Manzana manzana = new Manzana();
        addObject(manzana,512,459);
        Fresa fresa = new Fresa();
        addObject(fresa,69,75);
        Platano platano = new Platano();
        addObject(platano,498,74);
        //cuadritos

        Cubo cubo = new Cubo();
        addObject(cubo,249,365);
        Cubo cubo2 = new Cubo();
        addObject(cubo2,415,199);
        FantasmaV fantasmaV = new FantasmaV();
        addObject(fantasmaV,417,465);
        FantasmaV fantasmaV2 = new FantasmaV();
        addObject(fantasmaV2,245,323);
        
        fantasmaV.setRotation(90);
        fantasmaV2.setRotation(90);
    }
  
}
