package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.*;

import java.util.Scanner;

public class IceCreamApp {
    public static void main(String[] args) throws NoMoreIcecreamException {

        PriceList priceList = new PriceList(3, 4.5, 6);
        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList);
        Cone.Flavor[] flavors = {
                Cone.Flavor.PISTACHE,
                Cone.Flavor.STRACIATELLA,
                Cone.Flavor.VANILLA
        };

        Eatable[] order = {
                iceCreamSalon.orderIceRocket(),
                iceCreamSalon.orderCone(flavors),
                iceCreamSalon.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE)
        };
        System.out.println("Your order: ");
        for (Eatable eatable : order) {
            eatable.eat();

        }
        System.out.println("Profit of the Shop: ");
        iceCreamSalon.getProfit();



    }
}
