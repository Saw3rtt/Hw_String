public class StringHw {
    public static void main(String[] args) {
        //task1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastname = "Ivanov";
        String initials = lastname + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + initials);
        //task2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + initials.toUpperCase());
        //task3
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
}
