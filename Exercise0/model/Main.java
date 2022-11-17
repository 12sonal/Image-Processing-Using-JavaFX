package model;

import Exercise0.model.Charger;
import Exercise0.model.MobilePhone;
import Exercise0.model.AirConditioner;
import Exercise0.model.Mirror;
import Exercise0.model.Glass;
import Exercise0.model.Laptop;
import Exercise0.model.Bag;
import Exercise0.model.Clock;
import Exercise0.model.Book;
import Exercise0.model.Car;



public class Main {
    public static void main(String[] args) {

        //Class1
        AirConditioner airConditioner1 = new AirConditioner("1", "AC1", "Company1", "black", true, 2, 31.0, 27.0);
        AirConditioner airConditioner2 = new AirConditioner("2", "AC2", "Company2", "blue", false, 2, 36.9, 16.0);
        AirConditioner airConditioner3 = new AirConditioner("3", "AC3", "Company3", "white", true, 2, 27.0, 25.0);

        //Class2
        Bag bag1 = new Bag(1, "Bag1", "Company1", "blue", 2, 90, 90, 200);
        Bag bag2 = new Bag(2, "Bag2", "Company2", "green", 3, 20, 910, 789);
        Bag bag3 = new Bag(3, "Bag3", "Company3", "yellow", 2, 40, 600, 3678);

        //Class 3
        Book book1 = new Book(1, "book1", "Author1", 2019, 4, 200, 910, "USD");
        Book book2 = new Book(2, "book2", "Author2", 2020, 400, 410, 648, "INR");
        Book book3 = new Book(3, "book3", "Author3", 2021, 4000, 29, 233, "JPY");

        //Class 4
        Car car1 = new Car(1, "car1", "2010", "M1", "company1", 90, 2, 4);
        Car car2 = new Car(2, "car2", "2011", "M2", "company2", 60, 4, 4);
        Car car3 = new Car(3, "car3", "2012", "M3", "company3", 0, 4, 5);

        //Nested Class1
        Car.Engine engine1= car1.new Engine("Type1", 34,45,45);
        Car.Engine engine2= car1.new Engine("Type2", 44,50,55);
        Car.Engine engine3= car1.new Engine("Type3", 54,60,35);

        //Nested Class2
        Car.Battery battery1= car1.new Battery("Type1",  40,40,40);
        Car.Battery battery2= car1.new Battery("Type2",  50,30,40);
        Car.Battery battery3= car1.new Battery("Type3", 60,20,40);

        //Class 5
        Charger charger1 = new Charger(1, "charger1", "m1", "ma1", "australia", "white", 2, 9);
        Charger charger2 = new Charger(2, "charger2", "m1", "ma2", "japan", "pink", 2, 9);
        Charger charger3 = new Charger(3, "charger3", "m1", "ma3", "uk", "orange", 3, 9);

        //Class 6
        Clock clock1 = new Clock("1", "clock1", "2000", "m1", "672.3", 2, 3, 4);
        Clock clock2 = new Clock("2", "clock2", "2001", "m2", "672.3", 2, 3, 4);
        Clock clock3 = new Clock("3", "clock3", "2002", "m3", "672.3", 2, 3, 4);

        //Class 7
        Glass glass1 = new Glass("1", "glass1", 2, 4, 5, true, false, false);
        Glass glass2 = new Glass("2", "glass2", 2, 4, 5, true, false, false);
        Glass glass3 = new Glass("3", "glass3", 2, 4, 5, true, false, false);

        //Class 8
        Laptop laptop1 = new Laptop(1, "laptop1", "m1", "2022", "blue", 90, 4, 200);
        Laptop laptop2 = new Laptop(2, "laptop2", "m1", "2022", "blue", 90, 4, 200);
        Laptop laptop3 = new Laptop(3, "laptop3", "m1", "2022", "blue", 90, 4, 200);

        //Class 9
        Mirror mirror1 = new Mirror(1, "mirror1", false, 30, 90, "dhg", false, 80);
        Mirror mirror2 = new Mirror(2, "mirror2", false, 30, 90, "dhg", false, 80);
        Mirror mirror3 = new Mirror(3, "mirror3", false, 30, 90, "dhg", false, 80);

        //Class 10
        MobilePhone mobilePhone1 = new MobilePhone(1, "mp1", "he", 1, 90, "890", 8, 2);
        MobilePhone mobilePhone2 = new MobilePhone(2, "mp2", "he", 1, 90, "890", 8, 2);
        MobilePhone mobilePhone3 = new MobilePhone(3, "mp3", "he", 1, 90, "890", 8, 2);
    }
}