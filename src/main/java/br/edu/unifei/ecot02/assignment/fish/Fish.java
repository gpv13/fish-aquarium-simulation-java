package br.edu.unifei.ecot02.assignment.fish;

public abstract class Fish {
    private float size;
    private float weight;
    private String species;
    private float price;
    public abstract boolean accept(FishVisitor v);
    public float getSize() {
        return size;
    }
    public void setSize(float size) {
        this.size = size;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    
}
