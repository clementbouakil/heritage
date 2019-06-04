public class Hangar {

    public static void main(String[] args) {
        
        Boat bateau = new Boat("Titanic", 100);
        Car voiture = new Car("Toyota", 400);

        voiture.setBrand("Audio");
        bateau.setKilometers(500);

        System.out.println(bateau.doStuff() + " Et a " + bateau.getKilometers() + " kilomètres");
        System.out.println(voiture.doStuff() + " Et a " + voiture.getKilometers() + " kilomètres");

    }
}