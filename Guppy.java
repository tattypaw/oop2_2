public class Guppy extends Waterfowl{
    public Guppy(String name) {
        super(name);
    }
    
    @Override
    public String feed(){
        return "сухой и живой корм";
    }

    @Override
    public String swimDepth(){
        return "средние и верхние слои";
    } 

    @Override
    public int size(){
        return 4;
    }
}
