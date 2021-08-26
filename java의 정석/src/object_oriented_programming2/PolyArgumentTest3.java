package object_oriented_programming2;

import java.util.Vector;

class Product2{
	int price;
	int bonusPoint;
	
	Product2(int price){
		this.price = price;
		bonusPoint =(int)(price/10.0);
	}
	Product2() {
		price =0;
		bonusPoint = 0;
	}
}

class Tv4 extends Product2{
	Tv4() {super(100); }
	
	public String toString() {return "Tv";}
}

class Computer2 extends Product2{
	Computer2() {super(200);}
	public String toString() {return "Computer";}
}

class Audio2 extends Product2{
	Audio2() {super(50);}
	public String toString() {return "Audio";}
}


class Buyer2{
	int money = 1000;
	int bounusPoint = 0;
	Vector item = new Vector();
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ ��� �����ϴ�.");
			return;
		}
		money -= p.price;
		bounusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
	}
	
	void refund(Product2 p) {
		if(item.remove(p)) {
			money += p.price;
			bounusPoint -= p.bonusPoint;
			System.out.println(p+ "��/�� ��ǰ�Ͽ����ϴ�.");
		}else {
			System.out.println("�����Ͻ� ��ǰ�� �ش� ��ǰ�� �����ϴ�.");
		}
	}
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		
		for(int i=0; i<item.size(); i++) {
			Product2 p = (Product2)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", "+p;
		}
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� "+sum+"�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� "+itemList+"�Դϴ�.");
	}
}

public class PolyArgumentTest3 {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		Tv4 tv = new Tv4();
		Computer2 com = new Computer2();
		Audio2 audio = new Audio2();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
		
	}

}
