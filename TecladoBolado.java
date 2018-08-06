import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TecladoBolado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TecladoBolado extends Actor
{
    String opcao;
    boolean pause = true;
    /**
     * Act - do whatever the TecladoBolado wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if  (Greenfoot.isKeyDown("q")){
            GreenfootImage image = new GreenfootImage("bt1.png");
            setImage(image);
            GreenfootSound sound = new GreenfootSound("pianoUm.wav");
            sound.play();
            boolean pause = false;
            if (pause == false && Greenfoot.isKeyDown("q")){
                sound.stop();
            }
        }
         if  (Greenfoot.isKeyDown("w")){
            GreenfootSound sound = new GreenfootSound("pianoDois.wav");
            sound.play();
        }
         if  (Greenfoot.isKeyDown("e")){
            GreenfootSound sound = new GreenfootSound("pianoTres.wav");
            sound.play();
        }
         if  (Greenfoot.isKeyDown("r")){
            GreenfootSound sound = new GreenfootSound("pianoQuatro.wav");
            sound.play();
        }
         if  (Greenfoot.isKeyDown("t")){
            GreenfootSound sound = new GreenfootSound("pianoCinco.wav");
            sound.play();
        }
         if  (Greenfoot.isKeyDown("y")){
            GreenfootSound sound = new GreenfootSound("pianoSeis.wav");
            sound.play();
        }
         if  (Greenfoot.isKeyDown("u")){
            GreenfootSound sound = new GreenfootSound("pianoSete.wav");
            sound.play();
        }
         if  (Greenfoot.isKeyDown("i")){
            GreenfootSound sound = new GreenfootSound("pianoOito.wav");
            sound.play();
        }
         if  (Greenfoot.isKeyDown("o")){
            GreenfootSound sound = new GreenfootSound("pianoNove.wav");
            sound.play();
        }
         if  (Greenfoot.isKeyDown("p")){
            GreenfootSound sound = new GreenfootSound("pianoDez.wav");
            sound.play();
        }
        if  (Greenfoot.isKeyDown("a")){
            GreenfootSound sound = new GreenfootSound("pianoOnze.wav");
            sound.play();
        }
         if  (Greenfoot.isKeyDown("s")){
            GreenfootSound sound = new GreenfootSound("pianoDoze.wav");
            sound.play();
        }
         if  (Greenfoot.isKeyDown("d")){
            GreenfootSound sound = new GreenfootSound("pianoTreze.wav");
            sound.play();
        }
         if  (Greenfoot.isKeyDown("f")){
            GreenfootSound sound = new GreenfootSound("pianoQuatorze.wav");
            sound.play();
        }
         if  (Greenfoot.isKeyDown("g")){
            GreenfootSound sound = new GreenfootSound("piano15.wav");
            sound.play();
        }
         if  (Greenfoot.isKeyDown("h")){
            GreenfootSound sound = new GreenfootSound("piano16.wav");
            sound.play();
        }
         if  (Greenfoot.isKeyDown("j")){
            GreenfootSound sound = new GreenfootSound("piano17.wav");
            sound.play();
        }
         if  (Greenfoot.isKeyDown("k")){
            GreenfootSound sound = new GreenfootSound("piano19.wav");
            sound.play();
        }
         if  (Greenfoot.isKeyDown("l")){
            GreenfootSound sound = new GreenfootSound("piano20.wav");
            sound.play();
        }
         if  (Greenfoot.isKeyDown("z")){
            GreenfootSound sound = new GreenfootSound("piano21.wav");
            sound.play();
        }
         if  (Greenfoot.isKeyDown("x")){
            GreenfootSound sound = new GreenfootSound("piano22.wav");
            sound.play();
        }
         if  (Greenfoot.isKeyDown("c")){
            GreenfootSound sound = new GreenfootSound("26.wav");
            sound.play();
        }
         if  (Greenfoot.isKeyDown("v")){
            GreenfootSound sound = new GreenfootSound("charliedoiss.wav");
            sound.play();
        }
         if  (Greenfoot.isKeyDown("b")){
            GreenfootSound sound = new GreenfootSound("charlieee.wav");
            sound.play();
        }
         if  (Greenfoot.isKeyDown("n")){
            GreenfootSound sound = new GreenfootSound("charlieetress.wav");
            sound.play();
        }
         if  (Greenfoot.isKeyDown("m")){
            GreenfootSound sound = new GreenfootSound("mercy.wav");
            sound.play();
        }
         if  (Greenfoot.isKeyDown("space")){
            GreenfootSound sound = new GreenfootSound("batidinha.wav");
            sound.play();
        }
      
        
        //batida();
    }
    
    // public void batida(){
        // switch (opcao){
            // case "space":
                // GreenfootSound sound = new GreenfootSound("batidinha.wav");
                // sound.play();
                 // boolean pause = false;
            // if (pause == false && Greenfoot.isKeyDown("space")){
                // sound.stop();
            // }
        // }
    // }
}
