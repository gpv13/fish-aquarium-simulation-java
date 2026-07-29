package br.edu.unifei.ecot02.assignment.fish;

public abstract class FishingEngineer <T extends BodyOfWater<Y>, Y extends Fish> extends Human{

    private int structuresBuilt = 0;

    public abstract T buildStructure();

    public int getStructuresBuilt() {
        return structuresBuilt;
    }

    public void setStructuresBuilt(int structuresBuilt) {
        this.structuresBuilt = structuresBuilt;
    }

}
