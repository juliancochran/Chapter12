public class Sheep extends Animal {
    private String breed;

    public Sheep(String breed) {
        this.breed = breed;
    }

    public Sheep(int numLegs, boolean isFemale, String color, boolean isMammal, String breed) {
        super(numLegs, isFemale, color, isMammal);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String speak()   {
        return "baa";
    }
}
