public class Boat extends Vehicle {

    // constructeur
    public Boat(String brand, int kilometers) {
        super(brand, kilometers); // peut appeler tous les paramètres de la classe parente
    }

    @Override // terme pour spécifier que la classe est héritée = ** polymorphisme **
    public String doStuff() {  
        return "Je suis " + this.getBrand() + " et je fais glou glou !";  
    }

}