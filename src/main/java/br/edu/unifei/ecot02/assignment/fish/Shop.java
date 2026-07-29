package br.edu.unifei.ecot02.assignment.fish;

public class Shop{

    private Shop(){}
    private float price;
    private static Shop instance = new Shop();

    public boolean buyUpgrade(Fisherman<?> f){
        if(f.getMoney() < price)
            return false;
        f.upgradeRod(price);
        return true;
    }

    public static Shop getInstance(){
        return instance;
    }

    public float getPrice() {
        return price;
    }


    public void setPrice(float price) {
        this.price = price;
    }

    
}
