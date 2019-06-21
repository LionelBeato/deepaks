package deepaks;

public class EmployeeBuild {
	
	void employeeBuild(String deptInput, String idInput, String userName, String password, String firstName){
		Employee newEmployee = new Employee();
		
		newEmployee.setEmployeeDept(deptInput);
		newEmployee.setEmployeeID(idInput);
		newEmployee.setUserName(userName);
		newEmployee.setFirstName(firstName);
		newEmployee.setPassword(password);
		
	}

}
