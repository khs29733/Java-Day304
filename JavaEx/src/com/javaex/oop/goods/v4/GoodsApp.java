package com.javaex.oop.goods.v4;
		
public class GoodsApp {
	public static void main(String[] arg) {
			//Goods notebook = new Goods();
		Goods notebook = new Goods("LG Gram", 150000);
		Goods smartphone = new Goods("iPhone SE", 650000);
		
	//	notebook.setPrice(15000);
		notebook.showInfo();
		
		//������ ������ �Ǽ���
		/*
		 *
		 *
		 */
		 
		
	//	smartphone.setName("iphone SE");
		//smartphone.setPrice(650000);
		
		System.out.printf("%s,%d��%n",
				notebook.getName(), notebook.getPrice());
		smartphone.showInfo();
		
		System.out.printf("%s, %d��%n",
				smartphone.getName(), smartphone.getPrice());
		smartphone.showInfo();
	}

}
