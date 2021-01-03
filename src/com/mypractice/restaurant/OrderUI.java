package com.mypractice.restaurant;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderUI {
	 static Map <Integer,Table> tables=new HashMap<>();
	 static Map<Integer,Product> products=new HashMap<>();
			 static List<Add> adds=new ArrayList<>();
 static List<OrderList> orderLists=new ArrayList<>();
	 static final int NUMBER_OF_TABLES=6;
	 
	 public static void init(){
	System.out.println("throw init");
	products.clear();
	for(int i=1;i<=NUMBER_OF_TABLES;i++) {
	tables.put(i,new Table(i));
	}
	products.put(1,new Pizza(1,"capricioza",550.00));
	products.put(2,new Pasta(2,"carbonare",650.00));
	products.put(3,new Juice(3,"Orange", 150.00, 250));
	products.put(4,new CarbonatedDrink(4,"Fanta", 170.00, 250));
	adds.add(new Add(1,"Ketchup"));
	adds.add(new Add (2,"Mayonaise"));
	adds.add(new Add(3,"Extra chees"));
	adds.add(new Add(4,"Extra mushrooms"));
}

static void writeProducts() {
	
	for(Product product:products.values()) {
		System.out.println("\t "+product.getId()+" "+product.getName()+"......price..."+product.getPrice());
	
	}
	System.out.println("\t 0 -Go to main menu!");
	System.out.println("\t 99 - Issue an invoice!");
	}
static void addProduct(int tableId) {
	
	writeProducts();
	int productId=-1;
	Table table=tables.get(tableId);
	if(table.getOrderList()!=null) {
		writeOrderList(table.getOrderList());
	}
	table.setBusy(true);
	OrderList orderList;
List<Product> orderedProducts;
	while(productId!=0) {
	System.out.println("Option?");
	 productId=PomocnaKlasa.ocitajCeoBroj();
	
	
	 if(!(products.containsKey(productId))&&productId!=99) {
		 System.out.println("There is no Product with Id "+productId+" !");
		 continue;
}
	 Product  product=(Product) deepClone( products.get(productId)); 
	 if(product instanceof Food) {
		addingAdds(product);
	 }
	
	if(table.getOrderList()==null) {
		orderedProducts=new ArrayList<>();
	 orderList=new OrderList(orderedProducts);
       }else {
	orderList=table.getOrderList();
	orderedProducts=table.getOrderList().getProducts();
			}
	if(productId==99) {
		completeOrderList(table);
		break;
	}
	if (productId==0) {
		System.out.println("Going to main menu!");
		break;
	}
	orderedProducts.add(product);
	orderList.setProducts(orderedProducts);
	table.setOrderList(orderList);
	writeOrderList(orderList);
	
	}
}
public static void writeOrderList(OrderList orderList) {	
	double tempTotal=0.00;
	for(Product product:orderList.getProducts()) {
		System.out.println(product.toString());
		tempTotal+=product.getPrice();	
		 }
	System.out.println();
	System.out.println("Total = "+tempTotal);
}
public static void chooseTableNumber() {
	int tableId=-1;
	System.out.print("Input table id !:");
	tableId = PomocnaKlasa.ocitajCeoBroj();
	if(!tables.containsKey(tableId)){
		System.out.println("There is no table with id "+tableId);	
	}else {
	if(tables.get(tableId).isBusy()) {
		System.out.println("Table "+tableId+" is busy now!");
		
	}
	tables.get(tableId).setBusy(true);
addProduct(tableId);
	}
}

public static void writeAllLists() {
	for(OrderList list:orderLists) {
		writeOrderList(list);
	}	
}
private static void  addingAdds(Product product) {
	 
		
	 List<Add> tempAdds=new ArrayList<>();
	 for (Add add:adds) {
		 System.out.println(add.getId()+" "+add.getName()); 
	 }
	 int addId=-1;
	 while(addId!=0) {
		 System.out.println("If you want some of adds just input id number!");
		 System.out.println("For exit input 0!");
		 addId=PomocnaKlasa.ocitajCeoBroj();
		 if(addId==0) {
				System.out.println("Exit");
				break;
			}
		 if(addId>adds.size()) {
			 System.out.println("Wrong input!");
			 continue ;
		 }
		else {
			 tempAdds.add(adds.get(addId-1));
			 System.out.println("Yout just added "+adds.get(addId-1).getName());
			  ((Food) product).setAdds(tempAdds);
		 }
	 }System.out.println("Product Id "+product.getId());
	 System.out.println("addId "+addId);
	
}
private static void completeOrderList(Table table) {
	System.out.println("Charge "+table.getTotal());
	OrderList last;
	last=(OrderList) deepClone(table.getOrderList());
	orderLists.add(last);
	table.setBusy(false);
	table.getOrderList().getProducts().clear();
	table.setOrderList(null);
}
public static Object deepClone(Object object) {
    try {
        ByteArrayOutputStream baOs = new ByteArrayOutputStream();
        ObjectOutputStream oOs = new ObjectOutputStream(baOs);
        oOs.writeObject(object);
        ByteArrayInputStream baIs = new ByteArrayInputStream(baOs.toByteArray());
        ObjectInputStream oIs = new ObjectInputStream(baIs);
        return oIs.readObject();
    }
    catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}

}
