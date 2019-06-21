package deepaks;

import java.util.ArrayList;

public class Workforce  {
	
	private ArrayList<Object> workForceArray = new ArrayList<>();
	
	public void buildWork() {
		
	
	EmployeeBuild emChris = new EmployeeBuild().employeeBuild("Sales", "S412", "ChrisM", "letmein", "Chris");
	workForceArray.add(emChris);
	EmployeeBuild emAmanda = new EmployeeBuild().employeeBuild("Finance","F234", "AmandaD", "123456", "Amanda");
	workForceArray.add(emAmanda);
	EmployeeBuild emJeremy = new EmployeeBuild().employeeBuild("Front Desk", "R342", "JeremyV", "hello!!", "Jeremy");
	workForceArray.add(emJeremy);
	EmployeeBuild emIsaac = new EmployeeBuild().employeeBuild("Leasing", "L0949", "XxBrimStoneKingxX", "binding", "Isaac");
	workForceArray.add(emIsaac);	
	EmployeeBuild emEddy = new EmployeeBuild().employeeBuild("Front Desk", "R888", "EddyE", "654321", "Eddy");
	workForceArray.add(emEddy);

	
	}
	

	
	public void workForceArray() {
	
	}
	
	public ArrayList<Object> getArray(){
		return workForceArray;
		
	}
	
	public static void main (String[] args) {
		Workforce newWorkforce = new Workforce();
		System.out.println(newWorkforce.emChris);
	}
	

}
