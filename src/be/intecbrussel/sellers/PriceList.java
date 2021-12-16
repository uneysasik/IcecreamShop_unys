package be.intecbrussel.sellers;

public class PriceList {
    private double ballPrice;
    private double rocketPrice;
    private double magnumStandartPrice;
    public PriceList() {
    this(0.50, 0.80, 1);
    }


    public PriceList(double ballPrice, double rocketPrice, double magnumStandartPrice) {
    this.ballPrice=ballPrice;
    this.rocketPrice=rocketPrice;
    this.magnumStandartPrice=magnumStandartPrice;
    }

    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public double getMagnumStandartPrice() {
        return magnumStandartPrice;
    }

    public void setMagnumStandartPrice(double magnumStandartPrice) {
        this.magnumStandartPrice = magnumStandartPrice;
    }
}
