package by.guru13.clinic;

/**
 * класс описывает клинику
 *
 * @auhtor alexey
 * @since 16.07.2015
 */
public class Clinic {

    /**
     * Список клиентов
     */
    private final Client[] clients;

    /**
     * конструктор
     *
     * @param size количество возможных клиентов
     */
    public Clinic(final int size) {
        this.clients = new Client[size];
    }

    /**
     * @return массив клиентов
     */
    public Client[] getClients() {
        return clients;
    }

    /**
     * добавить клиента
     *
     * @param position позиция в списке
     * @param client   клиент
     */
    public void addClient(final int position, final Client client) {
        while (clients[position] != null) {
            System.out.println("Position " + position + " is already exist. Please, enter other position");
        }
        this.clients[position] = client;
    }

    /**
     * удалить клиента по id
     *
     * @param position позиция
     */
    public void removeClientById(final int position) {
        clients[position] = null;
    }

    /**
     * удалить клиента по имени
     *
     * @param name позиция
     */
    public void removeClientByName(final String name) {
        int j = 0;
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] != null && clients[i].getId().equals(name)) {
                clients[i] = null;
                j = j + 1;
            }
        }
        if (j != 0) {
            System.out.println("Удаление клинета прошло успешно");
        } else {
            System.out.println("Такого клиента нет в базе");
        }
    }

    /**
     * найти клиентов по имени животного
     *
     * @param name имя животного
     */
    public Client[] findClientsByPetName(final String name) {
        Client[] foundedClients = new Client[clients.length];
        int i = 0;
        for (Client client : clients) {
            if (client != null && client.getPet().getName().equals(name)) {
                foundedClients[i] = client;
                i++;
            }
        }
        return foundedClients;
    }

    /**
     * печать клиентов, найденных по имени животного
     *
     * @param name имя животинки
     */
    public void printClientsByPetName(final String name) {
        Client[] foundedClients = findClientsByPetName(name);
        int j = 0;
        for (Client client : foundedClients) {
            if (client != null) {
                System.out.println(client.getId());
                j = j + 1;
            }
        }
        if (j == 0) {
            System.out.println("Клиента с таким животным не обнаружено");
        }
    }

    /**
     * найти животных по имени клиента
     *
     * @param client имя клиента
     */
    public Pet[] findPetsByClient(final String client) {
        Pet[] foundedPets = new Pet[clients.length];
        int i = 0;
        for (Client clientId : clients) {
            if (clientId != null && clientId.getId().equals(client)) {
                foundedPets[i] = clientId.getPet();
                i++;
            }
        }
        return foundedPets;
    }

    /**
     * печать всех животных по имени клиента
     *
     * @param client имя клиента
     */
    public void printPetsByClient(final String client) {
        Pet[] foundedPets = findPetsByClient(client);
        int j = 0;
        for (Pet pet : foundedPets) {
            if (pet != null) {
                System.out.println(pet.getName() + "   " + pet.getClass().getSimpleName());
                j = j + 1;
            }
        }
        if (j == 0) {
            System.out.println("Клиента с таким животным не обнаружено");
        }
    }

    /**
     * печать всех клиентов клиники и их домашних животных
     */
    public void printAllClients() {
        for (int i = 0; i < clients.length; i++) {
            if (clients[i] != null) {
                System.out.println(clients[i].getId() + " - " + clients[i].getPet().getName());
            }
        }
    }
}