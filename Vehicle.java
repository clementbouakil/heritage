public abstract class Vehicle {

    // attributs
    private String brand;
    private int kilometers;


    // constructeur
    public Vehicle(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }
    
    /* Liste des getters */

    public String getBrand() {
        return this.brand;
    }

    public int getKilometers() {
        return this.kilometers;
    }

    /* Liste des setters */

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setKilometers(int kilometers){
        this.kilometers = kilometers;
    }

    // Méthode abstraite
    public abstract String doStuff();




}