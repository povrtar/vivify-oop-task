package com.mypractice.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AbsenceService {
	
private static List<Absence> absences;
private static final AbsenceService instance=new AbsenceService();
private AbsenceService() {
	absences=new ArrayList<>();
}
public static AbsenceService getInstance() {
	return instance;
}
public int  getAbsencesByWorkerAndDate(Worker worker,LocalDate date){
List<Absence> workerAbsences=new ArrayList<>();
for(Absence absence:absences) {
	if(absence.getWorker().equals(worker)) {
		workerAbsences.add(absence);
		
	}
}
return getHolidayDays(workerAbsences,date);
}
static int getHolidayDays(List<Absence> absences,LocalDate date) {
	int counter=0;

	for(Absence absence:absences) {
		for(int i=0;i<absence.getDays();i++) {
			if(absence.getDate().plusDays(i).getMonth().equals(date.getMonth())) {
				counter++;
			}
		}
	}
	return counter;
}
public void addAbsence(Absence absence) {
	absences.add(absence);
	
}
public List<Absence> getAbsences() {
	return absences;
}
}
