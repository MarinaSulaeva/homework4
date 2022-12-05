public class Main {
    public static void main(String[] args) {

        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();

        }
        public static void task1 () {
        int age = 19;
        if (age >=18) {
            System.out.println("Если возраст человека равен "+age+" ,то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен "+age+" ,то он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2 () {
        int temperature = 9;
        if (temperature >=5) {
            System.out.println("На улице "+temperature+" градусов, сегодня тепло, можно идти без шапки");
        }
        else {
            System.out.println("На улице "+temperature+" градусов, на улице холодно, нужно надеть шапку");
        }
    }
    public static void task3 () {
        int speed = 67;
        if (speed >=60) {
            System.out.println("Если скорость "+speed+" км/ч, то скорость превышена, придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость "+speed+" км/ч, то превышения скорости нет, можно ехать спокойно");
        }
    }
    public static void task4 () {
        int age = 20;
        if (age >=2 && age <=6) {
            System.out.println("Если возраст человека равен "+age+" , то ему нужно ходить в детский сад");
        }
        else if (age >=7 && age <=18) {
            System.out.println("Если возраст человека равен "+age+" , то ему нужно ходить в школу");
        }
        else if (age >18 && age <=24) {
            System.out.println("Если возраст человека равен "+age+" , то ему нужно ходить в университет");
        }
        else if (age >24) {
            System.out.println("Если возраст человека равен "+age+" , то ему нужно ходить на работу");
        }
        else {
            System.out.println("Если возраст человека равен "+age+ " , то ему никуда ходить не нужно");
        }
    }
    public static void task5 () {
        int age = 4;
        if (age >=5 && age <14) {
            System.out.println("Если возраст ребенка равен "+age+" , то ему можно кататься на аттракционе только в сопровождении взрослого");
        }
        else if (age >=14) {
            System.out.println("Если возраст ребенка равен "+age+" , то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        else {
            System.out.println("Если возраст ребенка равен "+age+" , то ему нельзя кататься на аттракционе");
        }
    }
    public static void task6 () {
        int cabCapacity = 102;
        int sittingPlaces = 60;
        int occupiedPlaces = 45;
        int freePlaces = cabCapacity - occupiedPlaces;
        if (occupiedPlaces<sittingPlaces){
            System.out.println("В вагоне "+freePlaces+" свободных мест, в том числе свободны сидячие места");
        }
        else if (occupiedPlaces>=sittingPlaces && occupiedPlaces<cabCapacity){
            System.out.println("В вагоне "+freePlaces+" свободных стоячих мест");
        }
        else {
            System.out.println("Вагон полностью забит");
        }
    }
    public static void task7 () {
        int one = 4;
        int two = 10;
        int three = 1;
        if (one>two && one>three){
            System.out.println(one);
        }
        else if (two>one && two>three) {
            System.out.println(two);
        }
        else {
            System.out.println(three);
        }
    }
}