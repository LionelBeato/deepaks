package deepaks;

import java.util.ArrayList;

public class EmployeeBuild extends Employee{
	private Employee newEmployee = new Employee();
	private ArrayList<String> employeeAtt = new ArrayList<>();

	
	EmployeeBuild employeeBuild(String deptInput, String idInput, String userName, String password, String firstName){
		
		newEmployee.setEmployeeDept(deptInput);
		newEmployee.setEmployeeID(idInput);
		newEmployee.setUserName(userName);
		newEmployee.setFirstName(firstName);
		newEmployee.setPassword(password);
		
		employeeAtt.add(getEmployeeDept());
		employeeAtt.add(getEmployeeID());
		employeeAtt.add(getUserName());
		employeeAtt.add(getFirstName());
		employeeAtt.add(getPassword());

		
		
		
		
		
		
		return null;
		
	}
	
	public ArrayList<String> getEmployee(){
		return employeeAtt;

	}

	public ArrayList<String> getEmployeeAtt() {
		return employeeAtt;
	}


}
