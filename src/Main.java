public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание 1 ");
        int age = 25;
        if (age >= 18) {
            System.out.println(" Поздравляем с совершеннолетием ");
        }
        if (age < 18) {
            System.out.println(" Взраст соверщеннолетия еще не наступил нужно подождать ");
        }
        System.out.println(" Задание 2 ");
        if (age >= 7 && age < 18) {
            System.out.println(" Ребенок ходит в школу ");
        }
        if (age >= 18 && age < 24) {
            System.out.println(" Человек ходит в университет ");
        }
        if (age >= 24) {
            System.out.println(" Человек ходит на работу ");
        }


        int cappacity = 102;
        int seatsCount = 62;
        int standingCount = cappacity - seatsCount;
        int seatsUsed = 62;
        int standingUsed = 40;
        if (seatsUsed < seatsCount) {

            System.out.println(" Есть еще " + (seatsCount - seatsUsed) + " сидячих мест ");
        }
        if (standingUsed < standingCount) {

            System.out.println(" Есть еще " + (standingCount - standingUsed) + " Стоячих мест ");
        }
        if (standingUsed == standingCount) {
            System.out.println(" Стоячих мест нет ");
        }
        if (seatsUsed == seatsCount) {
            System.out.println(" Сидячих мест нет ");
        }
    }
}
