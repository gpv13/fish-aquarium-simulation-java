package br.edu.unifei.ecot02.assignment.fish;

public class SaltWaterFish extends Fish{
    private boolean strongColors;

    public boolean accept(FishVisitor v){
        return v.visit(this);
    }

    public boolean isStrongColors() {
        return strongColors;
    }

    public void setStrongColors(boolean strongColors) {
        this.strongColors = strongColors;
    }
    
}
