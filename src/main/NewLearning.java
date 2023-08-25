package main;

import model.Human;
public class NewLearning {

    public static void main(String[] args) {
        Human human1 = new Human();
        human1.firstName = "Aram";
        human1.lastName = "Aramyan";
        human1.gender = 'm';
        human1.isArmenian = true;
        human1.year = 2000;

        Human human2 = new Human();
        human2.firstName = "Anna";
        human2.lastName = "Grigoryan";
        human2.gender = 'w';
        human2.isArmenian = true;
        human2.year = 2001;

human1.sayHello();
human2.printFullName();
    }
}




    


