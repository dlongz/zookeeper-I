public class Gorilla extends Mammal{
    
    public Gorilla(){}
    public String throwSomthing(){
        energyLevel = energyLevel - 5;
        return "Picked up something and throws it. (-5 Energy)";
    }

    public String eatBananas(){
        energyLevel = energyLevel + 10;
        return "Sits and Eats all the Bannas. (+10 Energy)";
    }

    public String climb(){
        energyLevel = energyLevel - 10;
        return "Clibs the tree to the top. (-10 Energy)";
    }
}
