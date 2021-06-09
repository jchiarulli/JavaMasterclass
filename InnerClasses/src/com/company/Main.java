package com.company;

public class Main {

    public static void main(String[] args) {
        // if Gear is public inner class
//      Gearbox mcLaren = new Gearbox(6);
//      Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
//      System.out.println(first.driveSpeed(1000));

        // if Gear is private inner class
        Gearbox mcLaren = new Gearbox(6);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));
    }
}
