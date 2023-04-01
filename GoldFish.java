public class GoldFish extends Waterfowl{
    public GoldFish(String name) {
        super(name);
    }
    
    @Override
    public String feed(){
        return "всеядная";
    }

    @Override
    public String swimDepth(){
        return "средние слои";
    } 

    @Override
    public int size(){
        return 10;
    } 

}
