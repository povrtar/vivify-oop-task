package com.mypractice.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AbsenceService {
	
private static  List<Absence> absences;
private static final AbsenceService instance=new AbsenceService();
private AbsenceService() {
	absences=new ArrayList<>();
}
public static AbsenceService getInstance() {
	return instance;
}

private static List<Absence> getAbsencesByWorker(Worker worker){
	List<Absence> workerAbsences=new ArrayList<>();
	for(Absence absence:absences) {
		if(absence.getWorker().equals(worker)) {
			workerAbsences.add(absence);
			
		}
	}
	return workerAbsences;
}
static int getHolidayDays(Worker worker,LocalDate date) {
	int counter=0;

	for(Absence absence:getAbsencesByWorker(worker)) {
		for(int i=0;i<absence.getDays();i++) {
			
			if((absence.getDate().plusDays(i)).getMonth().equals(date.getMonth())) {
				counter++;
			}
		}
	}
	System.out.println("Days on holiday "+counter);
	return counter;
}
public void addAbsence(Absence absence) {
	absences.add(absence);
	
}
public List<Absence> getAbsences() {
	return absences;
}
}
