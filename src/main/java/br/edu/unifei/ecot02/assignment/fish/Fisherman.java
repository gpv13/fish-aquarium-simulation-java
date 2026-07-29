package br.edu.unifei.ecot02.assignment.fish;

import java.util.Collections;

public class Fisherman<T extends Fish> extends Human{
    private int yearsOfExperience;
    private float money;
    private int rodLevel = 1;
    private BodyOfWater<T> workplace; 

    public boolean goFishing(int amount){
        if(workplace == null || !workplace.isSuitableForFishing() || workplace.getFish().size() < amount)return false;
    
        Collections.shuffle(workplace.getFish());
        for(int i=0;i<amount;i++)
            money+= (workplace.getFish().get(i).getPrice() * rodLevel);
        workplace.getFish().subList(0, amount).clear();
        return true;
    }

    protected void upgradeRod(float price){
        money-=price;
        rodLevel++;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public int getRodLevel() {
        return rodLevel;
    }

    public void setRodLevel(int rodLevel) {
        this.rodLevel = rodLevel;
    }

    public BodyOfWater<T> getWorkplace() {
        return workplace;
    }

    public void setWorkplace(BodyOfWater<T> workplace) {
        this.workplace = workplace;
    }
    
}
