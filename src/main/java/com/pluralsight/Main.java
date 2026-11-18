package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Vehicle hovercraft = new Hovercraft();
        hovercraft.setColor("pink");
        hovercraft.setCargoCapacity(3);
        System.out.println("hovercraft color is: " +

                hovercraft.getColor() + " " + "it can hold: "+ hovercraft.getCargoCapacity());
    }


}
