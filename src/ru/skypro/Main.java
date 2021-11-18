package ru.skypro;

public class Main {
    public static final Employee[] employees = new Employee[10];


    public static void main(String[] args) {

        Employee employee = new Employee("Петров И.В.", 1, 35000, 1);
        Employee employee1 = new Employee("Сидоров А.М.", 1, 35500, 2);
        Employee employee2 = new Employee("Иванов В.Ю.", 2, 35200, 3);
        Employee employee3 = new Employee("Новиков С.А. ", 3, 37000, 4);
        Employee employee4 = new Employee("Тихонов П.В.", 4, 34800, 5);
        Employee employee5 = new Employee("Миронова Т.Б.", 4, 35600, 6);
        Employee employee6 = new Employee("Игнатова И.К.", 2, 35500, 7);
        Employee employee7 = new Employee("Коротков Р.И.", 5, 36200, 8);
        Employee employee8 = new Employee("Петракова Ю.С.", 5, 35600, 9);
        Employee employee9 = new Employee("Павлов И.Н.", 3, 35300, 10);


        employees[0] = employee;
        employees[1] = employee1;
        employees[2] = employee2;
        employees[3] = employee3;
        employees[4] = employee4;
        employees[5] = employee5;
        employees[6] = employee6;
        employees[7] = employee7;
        employees[8] = employee8;
        employees[9] = employee9;



        sumWages();
        maxWages();
        minWages();
        averageWages();
        printEmployees(employees);

    }

    public static void printEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                System.out.println(employees[i]);
        }

    }

    public static void sumWages() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getWages();
            }
        }
        System.out.println("Затраты на зарплату: " + sum);

    }

    public static void averageWages() {
        int employeeNumber = 10;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getWages();
            }
        }
        System.out.println("Среднее значение зарплаты: " + sum / (double) employeeNumber);

    }

    private static void maxWages() {
        int max = 0;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getWages() > max) {
                max = employees[i].getWages();
            }
        }
        System.out.println("Максимальная зарплата:" + max);
    }

    private static void minWages() {
        int minWages = employees[0].getWages();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getWages() < minWages) {
                minWages = employees[i].getWages();
            }
        }
        System.out.println("Минимальная зарплата:" + minWages);
    }

}


