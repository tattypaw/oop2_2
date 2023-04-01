public abstract class Waterfowl implements Swimmable{
    private String name;
    
    public abstract String feed();
    public abstract int size();

    public Waterfowl(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("Вид: %s\n", this.name))
                .append(String.format("Размер (см): %s\n", size()))
                .append(String.format("Корм: %s\n", feed()))
                .append(String.format("Глубина обитания: %s\n", swimDepth()));

        return res.toString();

    }
}