package br.edu.unifei.ecot02.assignment.fish;

public class FreshWaterFish extends Fish{
    private boolean edible;

    public boolean accept(FishVisitor v){
        return v.visit(this);
    }

    public boolean isEdible() {
        return edible;
    }

    public void setEdible(boolean edible) {
        this.edible = edible;
    }
    
}
