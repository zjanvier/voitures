/**
 * @author : jzagabe
 * @Description : Classe permettant de regrouper toutes les méthodes pour la gestion des voitures
 * @created : 2024-04-23, Tuesday
 **/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CarManager {
    private ArrayList<Car> cars = new ArrayList<>();
// Ajout de voiture
    public void addCar(Car car) {
        cars.add(car);
    }
// Recherche de voiture par année
    public ArrayList<Car> searchCarsByYear(int year) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() == year) {
                result.add(car);
            }
        }
        return result;
    }
// Affichage des voitures au dessus d'une année donnée
    public ArrayList<Car> searchCarsAboveYear(int threshold) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() > threshold) {
                result.add(car);
            }
        }
        return result;
    }
// affichage de toutes les voitures (de la collection)
    public void displayAllCars() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
/*
Méthode permettant lÈaffichage des voitures dont l'année de fabrication
se trouve entre deux valeurs données
 */
    public void displayCarsByYearRange(int minYear, int maxYear) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() >= minYear && car.getYear() <= maxYear) {
                result.add(car);
            }
        }
        System.out.println("Les voitures fabriquées entre " + minYear + " et " + maxYear + ":");
        for (Car car : result) {
            System.out.println(car);
        }
    }

    /*
     *    Utilisation de la méthode sort pour pouvoir organiser les voitures
     *    selon l'année de fabrication : Ici on utilise une expression lamba
      */

    public void sortByYear() {
        Collections.sort(cars, (s1, s2) -> Integer.compare(s1.getYear(), s2.getYear()));
    }

// method reference
    /*
    public void sortByYear() {
       Collections.sort(cars, Comparator.comparing(Car::getMarks));
    }

     */
     /* Classe anonyme
    public void sortByYear() {
    Collections.sort(cars, new Comparator<Car>() {
        @Override
        public int compare(Car s1, Car s2) {
            return Integer.compare(s1.getYear(), s2.getYear());
        }
    });
}

     */
}

