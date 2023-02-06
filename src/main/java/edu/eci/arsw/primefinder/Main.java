package edu.eci.arsw.primefinder;

import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Control control = Control.newControl();
        
        control.start();


        // contar 5s
        long startTime = System.nanoTime();
        TimeUnit.SECONDS.sleep(2);
        long endTime = System.nanoTime();
        long timeElapse = endTime-startTime;

        //
        control.esperar();

        //
        Scanner scanner = new Scanner(System.in);
        System.out.println("Presiona enter para continuar");
        String input = scanner.nextLine();

        if(Objects.equals(input, "")){
            control.reanudar();
        }




    }
	
}
