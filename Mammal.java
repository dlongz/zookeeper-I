import javax.swing.text.html.HTMLDocument.RunElement;

public class Mammal {
    protected int energyLevel;

    
    public Mammal(){
        this.energyLevel = 100;
    }

    // Methods
    public int displayEnergyLevel(){
        System.out.printf("Current Energy: %d\n",this.energyLevel);
        return this.energyLevel;
    }
}
