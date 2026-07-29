package br.edu.unifei.ecot02.assignment.fish;

public class PondSpecialist extends FishingEngineer<FishPond, FreshWaterFish>{

    public FishPond buildStructure(){
        FishPond b = new FishPond();
        setStructuresBuilt(getStructuresBuilt()+1);
        return b;
    }

}
