package br.edu.unifei.ecot02.assignment.fish;

import java.util.ArrayList;
import java.util.Collections;

public class Aquarium extends BodyOfWater <Fish>{

    private ArrayList<Fish> fish = new ArrayList<>();
    protected Aquarium(){
        setSuitableForFishing(false);
    }
    public boolean reproductionSeason(FishVisitor v){
        if(fish.size() == 0) return false;
        Collections.shuffle(fish);
        Fish f = fish.get(0);
        if(f.accept(v)){
            fish.add(f);
            return true;
        }
        return false;
    }
    public ArrayList<Fish> getFish() {
        return fish;
    }
    public void setFish(ArrayList<Fish> fish) {
        this.fish = fish;
    }
    
}
