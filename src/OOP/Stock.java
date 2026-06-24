package OOP;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    Stock(String symbol, String name){
        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol(){
        return this.symbol;
    }

    public String getName(){
        return this.name;
    }
    public double getPreviousClosingPrice(){
        return this.previousClosingPrice;
    }

    public double getCurrentPrice(){
        return this.currentPrice;
    }
    public void setPreviousClosingPrice(double previousClosingPrice){
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }

    public double getChangePercentage(){
        return ((currentPrice - previousClosingPrice)/previousClosingPrice) * 100;

    }

    public void showResult(){
        System.out.println("Symbol: " + getSymbol());
        System.out.println("Name: " + getName());
        System.out.println("PreviousClosingPrice: " + getPreviousClosingPrice());
        System.out.println("Current Price: " + getCurrentPrice());
        System.out.println("Change Percentage: " + getChangePercentage() + "%");
    }

}
