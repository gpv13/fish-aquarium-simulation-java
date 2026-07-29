package br.edu.unifei.ecot02.assignment.fish;

public class Algae implements FishVisitor{
    public boolean visit(FreshWaterFish fish){
        return true;
    }
    public boolean visit(SaltWaterFish fish){
        return true;
    }
}
