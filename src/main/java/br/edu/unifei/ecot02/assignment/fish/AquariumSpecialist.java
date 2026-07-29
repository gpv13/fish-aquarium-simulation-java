package br.edu.unifei.ecot02.assignment.fish;

public class AquariumSpecialist extends FishingEngineer<Aquarium, Fish>{
    public Aquarium buildStructure(){
        Aquarium b = new Aquarium();
        setStructuresBuilt(getStructuresBuilt()+1);
        return b;
    }
}
