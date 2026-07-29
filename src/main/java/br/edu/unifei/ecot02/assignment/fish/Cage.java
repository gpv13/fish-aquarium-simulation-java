package br.edu.unifei.ecot02.assignment.fish;

import java.util.ArrayList;
import java.util.Collections;

public class Cage extends BodyOfWater <SaltWaterFish>{

    private ArrayList<SaltWaterFish> fish = new ArrayList<>();

    protected Cage(){
        setSuitableForFishing(true);
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
    
}
