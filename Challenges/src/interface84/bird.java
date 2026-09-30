package interface84;

public abstract class bird implements flyable {
    private final String breed;

    public String getBreed() {
        return breed;
    }

    public bird(String breed) {
        this.breed = breed;
    }
}
