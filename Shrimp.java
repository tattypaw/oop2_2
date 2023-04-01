public class Shrimp extends Waterfowl{
    public Shrimp(String name) {
        super(name);
    }
    
    @Override
    public String feed(){
        return "растительный корм";
    }

    @Override
    public String swimDepth(){
        return "придонный житель";
    } 

    @Override
    public int size(){
        return 7;
    }

}