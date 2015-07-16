/**
  * класс запускает клинику
  * @auhtor alexey
  * &since 16.07.2015
  */
  public class ClinicRunner{
	public static void main(String[] args){
		final Clinic clinic = new Clinic(10);
		clinic.addClient(0, new Client("Gogol",new Cat("Vaska")));
		clinic.addClient(1, new Client("Pushkin",new Parot("Gosha")));
		clinic.addClient(2, new Client("Turgenev",new Dog("Mu-mu")));
		clinic.printAllClients();
		
	}
  }