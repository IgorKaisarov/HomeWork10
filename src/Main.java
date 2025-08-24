
public class Main {
    public static void main(String[] args) {

        System.out.printf("Home Work 10!");

        // Task 1
        System.out.println(" Task 1 ");


        String firstName = "Ivanov";
        String secondName = "Ivan";
        String lastName = "Ivanovich";
        System.out.println("Ф.И.О. сотрудника - " + firstName + " " + secondName + " " + lastName);

        // Task 2
        System.out.println(" Task 2 ");

        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
//        fullName = "IVANOV IVAN IVANOVICH";
//        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName);

        // Task 3
        System.out.println(" Task 3 ");

        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName1);


    }
}