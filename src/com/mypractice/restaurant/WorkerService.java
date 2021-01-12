package com.mypractice.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WorkerService {
	
public static void main (String[] args) {
	AbsenceService absenceService=AbsenceService.getInstance();
	List<Employer> employers=new ArrayList<>();
	List<Worker> workers=new ArrayList<>();
	EmployerFactory employerFactory=new EmployerFactory();
	for (int i=0;i<4;i++) {
		Employer employer=new Employer("Employer "+i);
		employers.add(employer);
	}
	for(int i=0;i<20;i++) {
		Worker student=employerFactory.getEmployer("Student","Employer "+i);
				student.setProffesion(Proffesion.STUDENT);
				
			
		workers.add(student);
		if(i<5) {
			employers.get(0).addWorker(student);
			student.setEmployer(employers.get(0));
			absenceService.addAbsence(new Absence(LocalDate.now(),10,student));	
		}
		if(i>4&&i<10) {
			employers.get(1).addWorker(student);
			student.setEmployer(employers.get(1));
			absenceService.addAbsence(new Absence(LocalDate.now(),10,student));	
		}
		System.out.println(student.toString());
	}
	for(int i=0;i<10;i++) {
		Worker doctor=employerFactory.getEmployer("Doctor","Employer "+i);
		doctor.setProffesion(Proffesion.DOCTOR);			
		workers.add(doctor);	
		Worker developer=employerFactory.getEmployer("Developer","Employer "+i);
		developer.setProffesion(Proffesion.DEVELOPER);		
		workers.add(developer);
		
		if(i<5) {
			employers.get(2).addWorker(doctor);
			doctor.setEmployer(employers.get(2));
			employers.get(3).addWorker(developer);
			developer.setEmployer(employers.get(3));
			absenceService.addAbsence(new Absence(LocalDate.now(),10,doctor));
			absenceService.addAbsence(new Absence(LocalDate.now(),30,developer));
		}
		System.out.println(doctor.toString());
		System.out.println(developer.toString());
	}
	
	for(Worker worker:workers) {
		if(worker.getProffesion()==Proffesion.STUDENT){
			worker.setBusy(false);
		}
	}
	//izmena struke po enum vrednosti
	//na ovaj nacin se ne menja clasa radnika, samo polje
	int i=0;
	/*
	for(Worker worker:workers) {
		if(worker.getProffesion()==Proffesion.STUDENT) {
			if(i%2!=0) {
				worker.setProffesion(Proffesion.DEVELOPER);
			}else {
				worker.setProffesion(Proffesion.DOCTOR);
			}
			i++;
		}
	}
	*/
	//izmena postojeceg objekt sa novim objektom koji je instanca Doctor ili Developer klase
	System.out.println("Students to developers and doctors");
	for(Worker worker:workers) {
		if(worker instanceof Student) {
			Worker newWorker;
			if(i%2!=0) {
			newWorker=new Developer(worker.getName());
			newWorker.setProffesion(Proffesion.DEVELOPER);
			
			}else {
			 newWorker=new Doctor(worker.getName());
				newWorker.setProffesion(Proffesion.DOCTOR);
			}
			newWorker.setSurname(worker.getSurname());
			newWorker.setAddress(worker.getAddress());
			i++;
			worker=newWorker;
			
			System.out.println(worker.toString());
		}
	}
	for(Absence absence:absenceService.getAbsences()) {
		System.out.println(absence.toString());
	}

for(Employer employer:employers) {
	
	employer.pay(LocalDate.now());
}
}
}