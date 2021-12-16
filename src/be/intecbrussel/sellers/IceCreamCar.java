package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller {

    private PriceList priceList;

    private Stock stock;

    private double profit = 0;

    public IceCreamCar() {
        this(new PriceList(), new Stock());
    }

    public IceCreamCar(PriceList priceList, Stock stock) throws NoMoreIcecreamException {
        this.priceList = priceList;
        this.stock = stock;
    }

    @Override
    public Cone orderCone(
            Cone.Flavor[] flavors) throws NoMoreIcecreamException {
        try {
            return prepareCone(flavors);
        } catch (NoMoreIcecreamException noMore) {
            System.out.println("Out of stock: " );
            return null;
        }
    }

    private Cone prepareCone(Cone.Flavor[] flavors) {
    if (stock.getCones() >0) {
        return new Cone(flavors);
    }else{
        throw new NoMoreIcecreamException("Out of stock: Cones ");
    }
    }


    public IceRocket orderIceRocket() {
    return this.prepareRocket();
    }

    private IceRocket prepareRocket() {

        return new IceRocket();

    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
    return this.prepareMagnum(magnumType);
    }

    private Magnum prepareMagnum(Magnum.MagnumType magnumType) {
        return new Magnum(magnumType);
    }


    @Override
    public double getProfit() {
        return profit;
    }
}

