
public class Main {
    public static void main(String[] args) {
        ///Task1\\\
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + " то возраст совершеннолетия еще не наступил, нужно немного подождать");
        }

        ///Task2\\\

        int temperature = 5;
        if (temperature <= 4) {
            System.out.println("На улице температура " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице температура " + temperature + " градусов, можно идти без шапки");
        }

        ///Task3\\\

        int speed = 61;
        if (speed >= 60) {
            System.out.println("Если скорость автомобиля " + speed + " км/ч, то придётся заплатить штраф");
        } else {
            System.out.println("Если скорость автомобиля " + speed + " км/ч можно ездить спокойно");
        }

        ///Task4\\\

        int ageHuman = 18;
        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в детский сад");
        }
        if (ageHuman >= 7 && ageHuman <= 17) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в школу");
        }
        if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в университет");
        }
        if (ageHuman > 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить на работу");
        }

        ///Task5\\\

        int ageChild = 14;
        if (ageChild < 5) {
            System.out.println("Если возраст ребёнка равен " + ageChild + ", то ему нельзя кататься на аттракционе");
        }
        if (ageChild >= 5 && ageChild <= 14) {
            System.out.println("Если возраст ребёнка равен " + ageChild + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (ageChild >= 15) {
            System.out.println("Если возраст ребёнка равен " + ageChild + ", то ему можно кататься на аттракционе без сопровождения взрослого ");
        }

        ///Task6\\\

        int remainingSeats  = 12;              // занятых мест
        int maxRemainingSeats = 102;          // всего мест
        int seatingPositions = 60;            // сидячих мест
        int standingPlaces = maxRemainingSeats - seatingPositions; // стоячих мест = 42
        int freeSeats = maxRemainingSeats - remainingSeats;           // оставшиеся свободные места
            System.out.println("В вагоне осталось количество мест " + freeSeats);

            if (remainingSeats < seatingPositions) {
                System.out.println("В вагоне есть сидячие места.");
            } else if (remainingSeats < maxRemainingSeats) {
                System.out.println("Сидячих мест нет, но есть стоячие.");
            } else {
                System.out.println("Вагон полностью забит.");
        }

            ///Task7\\\

        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one > three) {
            System.out.println("Наибольшее число: one = " + one);
        } else if (two > one && two > three) {
            System.out.println("Наибольшее число: two = " + two);
        } else if (three > one && three > two) {
            System.out.println("Наибольшее число: three = " + three);
        }
            }
        }