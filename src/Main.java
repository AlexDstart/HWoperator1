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
        if (age>=24){
            System.out.println(" Человек ходит на работу ");
        }
    }
}
