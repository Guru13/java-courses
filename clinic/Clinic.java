
/**
  * класс описывает клинику
  * @auhtor alexey
  * &since 16.07.2015
  */
  public class Clinic{
	/**
	  * Список клиентов
	  */
	private final Client[] clients;
	
	public Clinic (final int size){
		this.clients = new Client[size];
	}
	
	public void createClient(){
		
	}
	/**
	  * добавить клиента
	  * @param позиция
	  * &param клиент
	  */
	  public void addClient(final int position, final Client client){
		while (clients[position] != null){
			System.out.println("Position " + position + " is already exist. Please, enter other position");
		}
		this.clients[position] = client;
	  }
	/**
	  * удалить клиента по id
	  * @param позиция
	  */
	  public void removeClientById(final int position){
		clients[position] = null;
	  }
	/**
	  * удалить клиента по имени
	  * @param позиция
	  */
	  public void removeClientByName(final String name){	
		int j = 0;
		for (int i = 0; i < clients.length; i++){
			if (clients[i] != null && clients[i].getId().equals(name)){
				clients[i] = null;
				j = j + 1;
			}
		}
		if (j != 0){
			System.out.println("Удаление клинета прошло успешно");
		}else {
			System.out.println("Такого клиента нет в базе");
		}
	  }
	/**
	  * найти клиентов по имени животного
	  * @param имя животного
	  */
	  public Client[] findClientsByPetName(final String name){
		Client[] foundedClients = new Client[clients.length];
		for (int i = 0; i < clients.length; i++){
			if(clients[i] != null && clients[i].getPet().getName().equals(name)){
				foundedClients[i] = clients[i];
			}
		}
		return foundedClients;
	  }
	/**
	  * печать клиентов, найденных по имени животного
	  * @param имя животинки
	  */
	  public void printClientsByPetName(final String name){
		Client[] foundedClients = findClientsByPetName(name);
		int j = 0;
			for (int i = 0; i < foundedClients.length; i++){
				if(foundedClients[i] != null){
					System.out.println(foundedClients[i].getId());
					j = j + 1;
				}
		}
		if (j == 0){
			System.out.println("Такого животного не обнаружено");
		}
	  }
	/**
	  * найти животных по имени клиента
	  * @param имя клиента
	  */
	  public Pet[] findPetsByClient(final String client){
		Pet[] foundedPets = new Pet[clients.length];
		for (int i = 0; i < clients.length; i++){
			if(clients[i] != null && clients[i].getId().equals(client)){
				foundedPets[i] = clients[i].getPet();
			}
		}
		return foundedPets;
	  }
	/**
	  * печать всех животных по имени клиента
	  * @param имя клиента
	  */
	  public void printPetsByClient(final String client){
		Pet[] foundedPets = findPetsByClient(client);
		int j = 0;
		for (int i = 0; i < foundedPets.length; i++){
			if(foundedPets[i] != null){
				System.out.println(foundedPets[i].getName());
				j = j + 1;
			}
		}
		if (j == 0){
			System.out.println("Такого клиента не обнаружено");
		}
	  }
	/**
	  * печать всех клиентов клиники и их домашних животных
	  */
	  public void printAllClients(){		
		for (int i = 0; i < clients.length; i++){
			if(clients[i] != null){
				System.out.println(clients[i].getId() + " - " + clients[i].getPet().getName());
			}
		}
	  }
  }