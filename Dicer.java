package com.company;
import java.util.Random;

public class Dicer {
    private int numberOfCubes;


    public Dicer(int numberOfCubes) {
        this.numberOfCubes = numberOfCubes;
    }


    public void ThrowCubes(){
        int x;
        int i = 0;
        while(i<numberOfCubes) {
            x = (int)Math.floor(( Math.random() * 6) + 1);
            System.out.println(x);
            i++;
        }

        StringBuilder stringBuilder = new StringBuilder("{");
        Random random = new Random();
        for(int j =0; j<numberOfCubes; j++){
            stringBuilder.append( random.nextInt(6)+1).append(",");
        }
        stringBuilder.delete(stringBuilder.lastIndexOf(","), stringBuilder.length());
        stringBuilder.append("}");
        System.out.println(stringBuilder.toString());
    }
}
