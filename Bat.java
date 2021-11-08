public class Bat extends Mammal {
    
    public Bat(){
        this.energyLevel = 300;
    }

    public String fly(){
        energyLevel = energyLevel - 50;
        return "EEEEKKKKKKKKK (-50 Energy";
    }
    
    public String eatHumans(){
        energyLevel = energyLevel + 25;
        return "So-well, never mind, just increased its energy.(+25)";
    }
    
    public String attackTown() {
        energyLevel = energyLevel - 25;
        return "Ahhhhh, help we are buring!!!! HELP!\n[explostion, buildings falling].(-25)";
    }
}
