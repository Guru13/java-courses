package by.guru13.clinic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ASUS on 17.07.2015.
 */

/**
 * Тестируем клинику
 * @author Alexey
 * @date 18.07.2015
 */
public class ClinicTest {
    Client client;
    Clinic clinic;

    /**
     * инициализация клиента и клиники перед запуском каждого метода
     */
    @Before
    public void init(){
        client = new Client("testClient", new Cat("testCat"));
        clinic = new Clinic(20);
    }

    /**
     * проверяем добавление клиента в клинику
     * @throws Exception
     */
    @Test
    public void testAddClient() throws Exception {
        clinic.addClient(0, client);
        assertTrue("clients[0] shouldn't be null", clinic.getClients()[0] != null);
        String name = clinic.getClients()[0].getId();
        assertEquals("testClient", name);

    }

    /**
     * проверяем удаление клиента из клиники по номеру в списке
     * @throws Exception
     */
    @Test
    public void testRemoveClientById() throws Exception {
        clinic.addClient(1, client);
        clinic.removeClientById(1);
        assertTrue("clients[1] should be null", clinic.getClients()[1] == null);

    }

    /**
     * проверяем удаление клиента по его имени
     * @throws Exception
     */
    @Test
    public void testRemoveClientByName() throws Exception {
        clinic.addClient(2,client);
        clinic.removeClientByName("testClient");
        assertTrue("clients[2] should be null", clinic.getClients()[2] == null);
    }

    /**
     * проверяем поиск клиента по кличке животного
     * @throws Exception
     */
    @Test
    public void testFindClientsByPetName() throws Exception {
        clinic.addClient(3, client);
        Client[] clients = clinic.findClientsByPetName("testCat");
        assertTrue("clients[0].getPet().getName()  should be testCat", clients[0].getPet().getName().equals("testCat"));

    }

    /**
     * проверяем поиск животного по имени клиента
     * @throws Exception
     */
    @Test
    public void testFindPetsByClient() throws Exception {
        clinic.addClient(4, client);
        Pet[] pets = clinic.findPetsByClient("testClient");
        assertTrue("pets[0].getName() should be testCat", pets[0].getName().equals("testCat"));
    }
}