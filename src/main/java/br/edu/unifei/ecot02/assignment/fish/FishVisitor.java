package br.edu.unifei.ecot02.assignment.fish;

public interface FishVisitor {
    public boolean visit(FreshWaterFish fish);
    public boolean visit(SaltWaterFish fish);
}
