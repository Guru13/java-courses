import java.util.Scanner;
/**
  * класс запускает клинику
  * @auhtor alexey
  * &since 16.07.2015
  */
  public class ClinicRunner{
  Scanner reader = new Scanner(System.in);
  Clinic clinic = new Clinic(10);
  public  String exit = "";
  
  public void fillClinic(){
	clinic.addClient(0, new Client("Gogol",new Cat("Vaska")));
	clinic.addClient(1, new Client("Pushkin",new Parot("Gosha")));
	clinic.addClient(2, new Client("Turgenev",new Dog("Mu-mu")));
  }
  	public void setExit(){
		System.out.println("Exit: y/n");
		exit = reader.next();
		while (!"y".equals(exit) && !"n".equals(exit)){
			System.out.println("You should enter y or n");
			exit = reader.next();
		}
	}
  public void go(){
	fillClinic();
		try{
			while(!exit.equals("y")){
				System.out.println("¬ыберите операцию, которую вы хотите совершить: поиск клиента по кличке животного(sCl),поиск животного по имени клиента(sPet), печать всех клиентов(print), удаление клиента(rem)");
				String operation = reader.next();
				if ("sCl".equals(operation)){
					System.out.println("¬ведите кличку животного:");
					String petName = reader.next();
					System.out.print("Ќайденный клиент: ");
					clinic.printClientsByPetName(petName);
					
				}
				if ("sPet".equals(operation)){
					System.out.println("¬ведите им€ клиента:");
					String name = reader.next();
					System.out.print("Ќайденное животное: ");
					clinic.printPetsByClient(name);
				}
				if ("print".equals(operation)){
					System.out.println("¬ывод всех клиентов:");
					clinic.printAllClients();
				}
				if ("rem".equals(operation)){
					System.out.println("¬ведите им€ клиента:");
					String name = reader.next();
					clinic.removeClientByName(name);
				}
			setExit();
			}
		}finally{
			reader.close();
		}
    }
   

	public static void main(String[] args){
		ClinicRunner cr = new ClinicRunner();
		cr.go();
	}
  }