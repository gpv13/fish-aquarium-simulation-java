package br.edu.unifei.ecot02.assignment.fish;

import java.util.ArrayList;
import java.util.Collections;

public class FishPond extends BodyOfWater <FreshWaterFish>{

    private ArrayList<FreshWaterFish> fish = new ArrayList<>();
        
    protected FishPond(){
        setSuitableForFishing(true);
    }
        
    public boolean reproductionSeason(FishVisitor v){
        if(fish.size() == 0) return false;
        Collections.shuffle(fish);
        FreshWaterFish f = fish.get(0);
        if(f.accept(v)){
            fish.add(f);
            return true;
        }
        return false;
    }

    public ArrayList<FreshWaterFish> getFish() {
        return fish;
    }

    public void setFish(ArrayList<FreshWaterFish> fish) {
        this.fish = fish;
    }


    
}
