import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class world here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class world extends World
{

    /**
     * Constructor for objects of class world.
     * 
     */
    public world()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        watering watering = new watering();
        addObject(watering, 47, 151);
        bibit bibit = new bibit();
        addObject(bibit, 47,212);
        cangkul cangkul = new cangkul();
        addObject(cangkul, 47, 89);
        cangkul.setLocation(47, 89);
        watering.setLocation(47, 151);
        bibit.setLocation(47, 212);
        Counter counter = new Counter();
        addObject(counter, 553, 75);
        tanah1 tanah1 = new tanah1(counter);
        addObject(tanah1, 302, 218);
        tanah1.setLocation(252, 222);
        tanah1.setLocation(169, 208);
        Temperature temperature = new Temperature();
        addObject(temperature, 197, 52);
        Temperature temperature2 = new Temperature();
        addObject(temperature2, 197, 49);
        PapanScore papanscore = new PapanScore();
        addObject(papanscore, 68, 28);
        papanscore.setLocation(72, 34);
        tanah1.setLocation(304, 205);
        temperature2.setLocation(189, 43);
        removeObject(temperature);
        counter.setLocation(561, 42);
        pagar1 pagar1 = new pagar1();
        addObject(pagar1, 311, 131);
        pagar2 pagar2 = new pagar2();
        addObject(pagar2, 421, 232);
        pagar1.setLocation(306, 113);
        pagar2.setLocation(411, 209);
        pagar2 pagar22 = new pagar2();
        addObject(pagar22, 211, 217);
        pagar22.setLocation(204, 209);
        pagar1 pagar12 = new pagar1();
        addObject(pagar12, 312, 278);
        pagar12.setLocation(306, 272);
        pagar1.setLocation(303, 124);
        pagar2.setLocation(409, 218);
        pagar22.setLocation(202, 218);
        pagar12.setLocation(306, 279);
        counter.setLocation(51, 278);
        temperature2.setLocation(72, 359);
        papanscore.setLocation(196, 365);
        ant ant = new ant();
        addObject(ant, 357, 45);
        ant ant2 = new ant();
        addObject(ant2, 535, 247);
        ant ant3 = new ant();
        addObject(ant3, 298, 198);
        ant ant4 = new ant();
        addObject(ant4, 112, 150);
        ant ant5 = new ant();
        addObject(ant5, 437, 356);
        ant ant6 = new ant();
        addObject(ant6, 526, 72);
        ant ant7 = new ant();
        addObject(ant7, 120, 298);
        ant ant8 = new ant();
        addObject(ant8, 211, 48);
        ant ant9 = new ant();
        addObject(ant9, 324, 324);
        ant ant10 = new ant();
        addObject(ant10, 449, 170);
        matahari matahari = new matahari();
        addObject(matahari, 569, 37);
        matahari.setLocation(567, 28);
        SplashScreen splashscreen = new SplashScreen();
        addObject(splashscreen, 220, 229);
        splashscreen.setLocation(220, 220);
        splashscreen.setLocation(294, 212);
        splashscreen.setLocation(294, 212);
        splashscreen.setLocation(294, 212);
        splashscreen.setLocation(294, 212);
        splashscreen.setLocation(294, 212);
        splashscreen.setLocation(294, 212);
        splashscreen.setLocation(294, 212);
        splashscreen.setLocation(294, 212);
        splashscreen.setLocation(294, 212);
        splashscreen.setLocation(294, 212);
        splashscreen.setLocation(294, 212);
        removeObject(splashscreen);
    }
}
