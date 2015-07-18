package by.guru13.clinic;

import java.util.Scanner;

/**
 * класс запускает клинику
 *
 * @auhtor alexey
 * @since 16.07.2015
 */
public class ClinicRunner {
    Scanner reader = new Scanner(System.in);
    Clinic clinic = new Clinic(10);
    public String exit = "";

    /**
     * заполняет клинику клиентами
     */
    public void fillClinic() {
        clinic.addClient(0, new Client("Gogol", new Cat("Vaska")));
        clinic.addClient(1, new Client("Pushkin", new Parot("Gosha")));
        clinic.addClient(2, new Client("Turgenev", new Dog("Mu-mu")));
    }

    /**
     * устанавливает выход из программы
     */
    public void setExit() {
        System.out.println("Exit: y/n");
        exit = reader.next();
        while (!"y".equals(exit) && !"n".equals(exit)) {
            System.out.println("You should enter y or n");
            exit = reader.next();
        }
    }

    /**
     * запуск
     */
    public void go() {
        fillClinic();
        try {
            while (!exit.equals("y")) {
                chooseOperation();
                setExit();
            }
        } finally {
            reader.close();
        }
    }

    /**
     * Выбор операции
     */
    public void chooseOperation() {
        System.out.println("Выберите операцию, которую вы хотите совершить:" +
                "\n поиск клиента по кличке животного(sCl)," +
                "\n поиск животного по имени клиента(sPet)," +
                "\n печать всех клиентов(print)," +
                "\n удаление клиента(rem)");
        String operation = reader.next();
        while (!operation.equals("sCl") && !operation.equals("sPet") && !operation.equals("print") && !operation.equals("rem")) {
            System.out.println("You shoud enter sCl/sPet/print/rem");
            operation = reader.next();
        }
        if ("sCl".equals(operation)) {
            System.out.println("Введите кличку животного:");
            String petName = reader.next();
            System.out.print("Найденный клиент: ");
            clinic.printClientsByPetName(petName);
        }
        if ("sPet".equals(operation)) {
            System.out.println("Введите имя клиента:");
            String name = reader.next();
            System.out.print("Найденное животное: ");
            clinic.printPetsByClient(name);
        }
        if ("print".equals(operation)) {
            System.out.println("Вывод всех клиентов:");
            clinic.printAllClients();
        }
        if ("rem".equals(operation)) {
            System.out.println("Введите имя клиента:");
            String name = reader.next();
            clinic.removeClientByName(name);
        }
    }


    public static void main(String[] args) {
        ClinicRunner cr = new ClinicRunner();
        cr.go();
    }
}