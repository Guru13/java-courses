
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
	/**
	  * добавить клиента
	  * @param позиция
	  * &param клиент
	  */
	  public void addClient(final int position, final Client client){
		this.clients[position] = client;
	  }
	  public Client[] findClientsByPetName(final String name){
		Client[] foundedClient = new Client[20];
		for (int i = 0; i < clients.length; i++){
			if(clients[i].getPet().equals(name)){
				
			}
		}
		return foundedClient;
	  }
	  public void printAllClients(){
		
		for (int i = 0; i < clients.length; i++){
			if(clients[i] != null){
				System.out.println(clients[i].getId() + " - " + clients[i].getPet().getName());
			}
		}
	  }
  }