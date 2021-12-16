package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.NoMoreIcecreamException;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamAppV2 {
    public static void main(String[] args) {
        PriceList priceList = new PriceList(0.60, 0.80, 1.0);
        Stock stock = new Stock();
        stock.setBalls(10);
        stock.setCones(16);
        stock.setMagnum(11);
        stock.setIceRockets(4);
        IceCreamCar iceCreamCar = new IceCreamCar(priceList, stock);

        try {
            iceCreamCar.orderMagnum(Magnum.MagnumType.MILKCHOCOLATE);
        } catch (NoMoreIcecreamException e) {
            System.out.println(e);
        }
        try {
            Cone.Flavor[] flavors = {Cone.Flavor.LEMON,
                    Cone.Flavor.PISTACHE,
                    Cone.Flavor.MOKKA};
            iceCreamCar.orderCone(flavors);


        } catch (NoMoreIcecreamException e) {
            System.out.println(e);
        }
        try {
            iceCreamCar.orderIceRocket();
        } catch (NoMoreIcecreamException e) {
            System.out.println(e);
        }

        System.out.println("Total profit: " + iceCreamCar.getProfit());
    }
}
