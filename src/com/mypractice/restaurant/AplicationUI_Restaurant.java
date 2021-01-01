package com.mypractice.restaurant;

import java.io.IOException;

public class AplicationUI_Restaurant {
	public static void ispisiTekstOsnovneOpcije(){	
		System.out.println("Fast food basic options:");
		System.out.println("\t 1 - work with food");
		System.out.println("\t 2 - Work with drinks");
		System.out.println("\t 3 - work with orders");
		System.out.println("\t 4 - get Ordered Lists");
		System.out.println("\t 0 - EXIT");	
	}
	
	public static void main(String[] args) throws IOException {
OrderUI.init();
		int odluka = -1;
		while(odluka!= 0){
			ispisiTekstOsnovneOpcije();
			System.out.print("opcija:");
			odluka = PomocnaKlasa.ocitajCeoBroj();
			switch (odluka) {
				case 0:	
					System.out.println("Izlaz iz programa");	
					break;
				case 1:
					//FoodUI.menuFoodUI();
					break;
				case 2:
				//	DrinkUI.menuDrinkUI();
					break;
				case 3:			
					OrderUI.chooseTableNumber();
					break;
				case 4:
					OrderUI.writeAllLists();
					break;
				default:
					System.out.println("Unknown");
					break;
			}
		}
		
		
		System.out.print("Program izvrsen");
	}
}
