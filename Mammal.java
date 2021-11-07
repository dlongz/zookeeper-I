import javax.swing.text.html.HTMLDocument.RunElement;

public class Mammal {
    private int energyLevel;

    public Mammal(){this(100);};
    public Mammal(int energyLevel){
        this.energyLevel = energyLevel;
    }

    // Methods
    public int displayEnergyLevel(){
        System.out.println(this.energyLevel);
        return this.energyLevel;
    }
}
