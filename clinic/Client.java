/**
  * клиент
  * @auhtor alexey
  * &since 16.07.2015
  */
  public class Client {
	private  String id;
	private final Pet pet;
	
	public Client(String id, Pet pet){
		this.id = id;
		this.pet = pet;
	}
	public Pet getPet(){
		return this.pet;
	}
	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}
  }