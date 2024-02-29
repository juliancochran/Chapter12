public class Cow extends Animal {
    private String breed;

    public Cow(String breed) {
        // super is called implicitly
        this.breed = breed;
    }

    public Cow(int numLegs, boolean isFemale, String color, boolean isMammal, String breed) {
        super(numLegs, isFemale, color, isMammal);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String speak()   {   return "moo";   }
}
