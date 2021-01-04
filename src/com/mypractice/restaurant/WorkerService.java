package com.mypractice.restaurant;

import java.util.ArrayList;
import java.util.List;

public class WorkerService {
public static void main (String[] args) {
	List<Employer> employers=new ArrayList<>();
	List<EmployedWorker> workers=new ArrayList<>();
	for (int i=0;i<4;i++) {
		Employer employer=new Employer("Employer "+i);
		employers.add(employer);
	}
	for(int i=0;i<20;i++) {
		EmployedWorker student=new StudentServicer("Student "+i);
				student.setProffesion(Proffesion.STUDENT);;
		workers.add(student);
		if(i<5) {
			employers.get(0).addWorker(student);
		}
		if(i>4&&i<10) {
			employers.get(1).addWorker(student);
		}
	}
	for(int i=0;i<10;i++) {
		EmployedWorker doctor=new Doctor("Doctor "+i);
		doctor.setProffesion(Proffesion.DOCTOR);
		workers.add(doctor);
		
		EmployedWorker developer=new Developer("Developer "+i);
		developer.setProffesion(Proffesion.DEVELOPER);
		if(i<5) {
			employers.get(2).addWorker(doctor);
			employers.get(3).addWorker(developer);
		}
		workers.add(developer);
	}
	
	for(EmployedWorker worker:workers) {
		if(worker.getProffesion()==Proffesion.STUDENT){
			worker.setBusy(false);
		}
	}
	//izmena struke po enum vrednosti
	//na ovaj nacin se ne menja clasa radnika, samo polje
	int i=0;
	for(EmployedWorker worker:workers) {
		if(worker.getProffesion()==Proffesion.STUDENT) {
			if(i%2!=0) {
				worker.setProffesion(Proffesion.DEVELOPER);
			}else {
				worker.setProffesion(Proffesion.DOCTOR);
			}
			i++;
		}
	}
	
	//izmena postojeceg objekt sa novim objektom koji je instanciran od studentServicer objekt
	
	for(EmployedWorker worker:workers) {
		if(worker instanceof StudentServicer) {
			EmployedWorker newWorker;
			if(i%2!=0) {
			newWorker=new StudentServicer(worker.getName());
			
			}else {
			 newWorker=new Doctor(worker.getName());
			}
			newWorker.setAddress(worker.getAddress());
			i++;
			worker=newWorker;
		}
	}
}
}
