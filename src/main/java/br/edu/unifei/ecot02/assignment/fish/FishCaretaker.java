package br.edu.unifei.ecot02.assignment.fish;

public class FishCaretaker extends Human{
    private Algae algae = new Algae();
    private SaltWaterFishPellets pellets = new SaltWaterFishPellets();
    private FreshWaterFishFlakes flakes = new FreshWaterFishFlakes();

    public boolean feedWithAlgae(BodyOfWater<? extends Fish> b){
        return b.reproductionSeason(algae);
    }
    public boolean feedWithPellets(BodyOfWater<? extends Fish> b){
        return b.reproductionSeason(pellets);
    }
    public boolean feedWithFlakes(BodyOfWater<? extends Fish> b){
        return b.reproductionSeason(flakes);
    }
    public Algae getAlgae() {
        return algae;
    }
    public void setAlgae(Algae algae) {
        this.algae = algae;
    }
    public SaltWaterFishPellets getPellets() {
        return pellets;
    }
    public void setPellets(SaltWaterFishPellets pellets) {
        this.pellets = pellets;
    }
    public FreshWaterFishFlakes getFlakes() {
        return flakes;
    }
    public void setFlakes(FreshWaterFishFlakes flakes) {
        this.flakes = flakes;
    }
    
}
