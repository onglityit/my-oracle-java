package carrental;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Car {
    int seats;
    int speed;
    String safetyFeatures;     
    public Car( int seat1, int speed1, String safetyFeatures1)
    {
        seats = seat1;
        speed = speed1;
        safetyFeatures = safetyFeatures1;
    }
    public void showSpecs()
    {
        System.out.println("Stats: "+ seats +", Speed: "+ speed+", Safety features:" + safetyFeatures);
    }
}











