package com.data.apollographql.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.data.apollographql.view.MockDataView;
import com.data.apollographql.view.Prescriptions;
import com.data.apollographql.view.Provider;

@RestController
@RequestMapping("/graphql")
public class GraphqlController {

	@GetMapping("/getPatientList")
	public List<MockDataView> getPatientList() {

		List<MockDataView> patientList = new ArrayList<>();
		MockDataView mockDataView = new MockDataView();

		mockDataView.setId(1);
		mockDataView.setFirstName("Short");
		mockDataView.setLastName("Dahlia");
		mockDataView.setEmailId("Dahlia@gmail.com");
		mockDataView.setState("ACTIVE");
		
		List<Prescriptions> list = new ArrayList<>();
		Prescriptions prescriptions = new Prescriptions();
		prescriptions.setId(1);
		prescriptions.setName("Azithromycin");
		prescriptions.setPrescribedDate("10/10/2022");
		prescriptions.setState("ACTIVE");
		prescriptions.setQuantity(20);
		prescriptions.setDaySuppy(10);
		list.add(prescriptions);
		
		
		Prescriptions prescriptions2 = new Prescriptions();
		prescriptions2.setId(2);
		prescriptions2.setName("Amoxicillin");
		prescriptions2.setPrescribedDate("02/05/2022");
		prescriptions2.setState("ACTIVE");
		prescriptions2.setQuantity(25);
		prescriptions2.setDaySuppy(5);
		list.add(prescriptions2);
		
		mockDataView.setPrescriptions(list);
		
		MockDataView mockDataView2 = new MockDataView();

		mockDataView2.setId(2);
		mockDataView2.setFirstName("Brenton");
		mockDataView2.setLastName("Thompson");
		mockDataView2.setEmailId("Brenton@gmail.com");
		mockDataView2.setState("ACTIVE");
		
		List<Prescriptions> list2 = new ArrayList<>();
		Prescriptions prescriptions3 = new Prescriptions();
		prescriptions3.setId(1);
		prescriptions3.setName("Ativan");
		prescriptions3.setPrescribedDate("11/11/2022");
		prescriptions3.setState("INACTIVE");
		prescriptions3.setQuantity(30);
		prescriptions3.setDaySuppy(15);
		list2.add(prescriptions3);
		
		
		Prescriptions prescriptions4 = new Prescriptions();
		prescriptions4.setId(2);
		prescriptions4.setName("Adderall");
		prescriptions4.setPrescribedDate("09/07/2022");
		prescriptions4.setState("ACTIVE");
		prescriptions4.setQuantity(15);
		prescriptions4.setDaySuppy(5);
		list2.add(prescriptions4);
		
		mockDataView2.setPrescriptions(list2);
		
		MockDataView mockDataView3 = new MockDataView();

		mockDataView3.setId(3);
		mockDataView3.setFirstName("Maxim");
		mockDataView3.setLastName("Hutchinson");
		mockDataView3.setEmailId("Maxim@gmail.com");
		mockDataView3.setState("ACTIVE");
		
		List<Prescriptions> list3 = new ArrayList<>();
		Prescriptions prescriptions5 = new Prescriptions();
		prescriptions5.setId(1);
		prescriptions5.setName("Atorvastatin");
		prescriptions5.setPrescribedDate("01/03/2023");
		prescriptions5.setState("DONE");
		prescriptions5.setQuantity(12);
		prescriptions5.setDaySuppy(4);
		list3.add(prescriptions5);
		
		
		mockDataView3.setPrescriptions(list3);
		

		patientList.add(mockDataView);
		patientList.add(mockDataView2);
		patientList.add(mockDataView3);
		System.out.println("called");
		return patientList;
	}
	
	@GetMapping("/getProviderList")
	public List<Provider> getProviderList() {
		
		List<Provider> list = new ArrayList<>();

		Provider provider = new Provider();
		provider.setFirstName("Juliana");
		provider.setLastName("Reynolds");
		provider.setNpi("65364563546");
		provider.setState("ACTIVE");
		list.add(provider);
		
		return list;
	}

}
