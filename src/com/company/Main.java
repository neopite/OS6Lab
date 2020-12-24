package com.company;

public class Main {

    public static void main(String[] args) {
        new Main().notOptimized();
        //new Main().optimazed();

    }

    public void notOptimized(){
        System.out.println("\n Inside main()\n");
        String typeOfShape = "dog";
        int i = 0;
        for(;i<0xffffff;i++);
        switch(typeOfShape){
            case "dog":
                drawDog();
                break;
            case "cat":
                drawCat();
                break;
        }

        System.out.println("End");
    }

    static void drawCat()
    {
        for(int i = 0; i < 100000000; i++)
        {
            //process of drawing
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return;
    }

    static void drawDog()
    {
        for(int i = 0; i < 1000000000; i++)
        {
            //process of drawing
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return;
    }


    public void optimazed(){
        System.out.println("\n Inside main()\n");
        String typeOfShape = "dog";
        int i = 0;
        for(;i<0xffffff;i++);
        switch(typeOfShape){
            case "dog":
                drawDogOptimized();
                break;
            case "cat":
                drawCatOptimized();
                break;
        }

        System.out.println("End");
    }


    static void drawCatOptimized()
    {
        for(int i = 0; i < 100000000; i++)
        {
            //process of drawing

        }

        return;
    }

    static void drawDogOptimized()
    {
        for(int i = 0; i < 1000000000; i++)
        {
            //process of drawing

        }
        return;
    }


}
