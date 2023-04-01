import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List <Waterfowl> waterfowls = new ArrayList<>();
    
    public void addWaterfowl (Waterfowl newWaterfowl){
        this.waterfowls.add(newWaterfowl);
    }

    public void showAll (){
        for (Waterfowl waterfowl: this.waterfowls) {
            System.out.println(waterfowl);
        }
    }

    public void aquariumVolume (){
        int volume = 0;
        for (Waterfowl waterfowl: this.waterfowls) {
            volume += waterfowl.size();
        }
        volume = volume + 5;
        System.out.printf("Для выбранных обитателей требуется аквариум объемом %sл", volume);
    }
 
   
}
