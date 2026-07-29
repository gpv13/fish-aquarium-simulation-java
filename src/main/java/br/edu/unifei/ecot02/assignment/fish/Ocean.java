package br.edu.unifei.ecot02.assignment.fish;

import java.util.ArrayList;
import java.util.Collections;

public class Ocean extends BodyOfWater <SaltWaterFish>{

    private Ocean(){
        setSuitableForFishing(true);
    }

    private ArrayList<SaltWaterFish> fish = new ArrayList<>();
    private static Ocean instance = new Ocean();

    public static Ocean getInstance(){
        return instance;
    }

    public boolean reproductionSeason(FishVisitor v){
        if(fish.size() == 0) return false;
        Collections.shuffle(fish);
        SaltWaterFish f = fish.get(0);
        if(f.accept(v)){
            fish.add(f);
            return true;
        }
        return false;
    }

    public ArrayList<SaltWaterFish> getFish() {
        return fish;
    }

    public void setFish(ArrayList<SaltWaterFish> fish) {
        this.fish = fish;
    }

    public static void setInstance(Ocean instance) {
        Ocean.instance = instance;
    }

    
}
