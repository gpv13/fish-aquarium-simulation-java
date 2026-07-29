package br.edu.unifei.ecot02.assignment.fish;

public class CageSpecialist extends FishingEngineer<Cage, SaltWaterFish>{

    public Cage buildStructure(){
        Cage b = new Cage();
        setStructuresBuilt(getStructuresBuilt()+1);
        return b;
    }

}
