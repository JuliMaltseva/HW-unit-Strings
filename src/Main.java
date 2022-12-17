public class Main {
    public static void main(String[] args) {
//Задание 1
        System.out.println("Задание 1");
        //“ФИО сотрудника — ….”
        String firstName = "Ivan"; //имя
        String middleName = "Ivanovich"; //отчество
        String lastName = "Ivanov"; //фамилия
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

//Задание 2
        System.out.println("Задание 2");
        //”Данные ФИО сотрудника для заполнения отчета — …”
        //верхним регистром
        String fullNameToUpperCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameToUpperCase);

//Задание 3
        System.out.println("Задание 3");
        //символ “ё” на символ “е”.
        //”Данные ФИО сотрудника — ...”
        fullName = fullName.replace("Ivanovich", "Семёнович"); //порядок замен важен
        fullName = fullName.replace("Ivanov", "Иванов");
        fullName = fullName.replace("Ivan", "Семён");
        fullName = fullName.replace("ё", "е");

        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}