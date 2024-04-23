import java.util.ArrayList;

/**
 * @author : jzagabe
 * @Description : Classe pour exécuter les différentes méthodes. Pour chacune des méthodes définies
 *                dans CarManager, on peut faire un appel et afficher les résultats
 * @created : 2024-04-23, Tuesday
 **/
public class Main
{
    public static void main(String[] args)
    {
        //Ajouter une série de voitures
        CarManager carManager=new CarManager();
        carManager.addCar(new Car(231,"Volkswagen","Jetta",2011));
        carManager.addCar(new Car(452,"Chevrolet","Ventura",2010));
        carManager.addCar(new Car(367,"Acura","Integra",2011));
        carManager.addCar(new Car(949,"Hyundai","Santa Fe",2019));
        carManager.addCar(new Car(556,"Chevrolet","Ventura",2021));
        carManager.addCar(new Car(736,"Honda","Civic",2020));
        carManager.addCar(new Car(435,"Toyota","Camry",2020));
        carManager.addCar(new Car(898,"Hyundai","Elantra",2018));
        carManager.addCar(new Car(23,"Hyundai","Palisade",2020));
        carManager.addCar(new Car(190,"Toyota","Corolla",2019));


    // Afficher toutes les voitures
        System.out.println("Afficher toutes les voitures:");
        carManager.displayAllCars();
//Rechercher les voitures pour une année donnée
        System.out.println("\nVoitures construites en 2011:");
        ArrayList<Car> searchResult = carManager.searchCarsByYear(2011);
        for (Car car : searchResult)
        {
            System.out.println(car);
        }
//Voitures construites après une année
        System.out.println("\nRechercher les voitures construites après 2010:");
        ArrayList<Car> aboveThreshold = carManager.searchCarsAboveYear(2020);
        for (Car car : aboveThreshold)
        {
            System.out.println(car);
        }

// Afficher les voitures par ordre d'année
        System.out.println("Afficher les voitures par ordre d'année");
        carManager.sortByYear();
        carManager.displayAllCars();
    // afficher les voitures construites entre deux années données

        carManager.displayCarsByYearRange(2020,2023);



    }


}
