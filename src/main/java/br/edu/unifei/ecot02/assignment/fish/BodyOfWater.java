package br.edu.unifei.ecot02.assignment.fish;

import java.util.ArrayList;

public abstract class BodyOfWater <T extends Fish>{
    private boolean suitableForFishing;

    public abstract boolean reproductionSeason(FishVisitor v);

    public boolean isSuitableForFishing() {
        return suitableForFishing;
    }

    public void setSuitableForFishing(boolean suitableForFishing) {
        this.suitableForFishing = suitableForFishing;
    }
    public abstract ArrayList<T> getFish();
}
