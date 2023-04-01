public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        aquarium.addWaterfowl(new Shrimp("креветка красная"));
        aquarium.addWaterfowl(new Guppy("гуппи королевская"));
        aquarium.addWaterfowl(new Diskus("дискус золотой"));
        aquarium.addWaterfowl(new Diskus("дискус голубой"));
        aquarium.addWaterfowl(new Guppy("гуппи красная"));
        aquarium.addWaterfowl(new Shrimp("креветка зеленая"));
        aquarium.addWaterfowl(new GoldFish("Комета"));

        aquarium.showAll();
        aquarium.aquariumVolume();
    }

}
