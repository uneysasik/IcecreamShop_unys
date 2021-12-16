package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;


public class IceCreamSalon implements IceCreamSeller {

    private PriceList priceList;

    private double totalProfit = 0;

    public IceCreamSalon() {
        this(new PriceList());
    }

    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavor) {
        Cone cone = new Cone(flavor);

        totalProfit = totalProfit + priceList.getBallPrice() * flavor.length;
        return cone;
    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket iceRocket = new IceRocket();
        totalProfit = totalProfit + priceList.getRocketPrice();
        return iceRocket;
    }


    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        return null;
    }

    @Override
    public String toString() {
        return "TotalProfit of IceCreamSalon :" + totalProfit;
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }
}
