public class Diskus extends Waterfowl{
    public Diskus(String name) {
        super(name);
    }
    
    @Override
    public String feed(){
        return "растительный корм";
    }

    @Override
    public String swimDepth(){
        return "средние слои";
    } 

    @Override
    public int size(){
        return 12;
    }
}