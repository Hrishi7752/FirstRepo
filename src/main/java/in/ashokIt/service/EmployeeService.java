package in.ashokIt.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokIt.entity.Address;
import in.ashokIt.entity.Employee;
import in.ashokIt.repo.AddressRepo;
import in.ashokIt.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;
	
	@Autowired
	private AddressRepo addRepo;
	
	public void saveEmp() {
		Employee e = new Employee();
		e.setEmpName("Hrishi");
		e.setPhno("7507149134");
		
		Address a1 = new Address();
		a1.setHouseNo(54);
		a1.setCity("Parbhani");
		a1.setState("Maharashtra");
		a1.setCountry("India");
		a1.setAddressType("Permanent");
		
		Address a2 = new Address();
		a1.setHouseNo(1108);
		a1.setCity("Pune");
		a1.setState("Maharashtra");
		a1.setCountry("India");
		a1.setAddressType("Present");
		
		e.setAddress(Arrays.asList(a1,a2));
		
		a1.setEmp(e);
		a2.setEmp(e);
		
		empRepo.save(e);
	}
}
