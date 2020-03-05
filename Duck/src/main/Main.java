package main;
import attack.*;
import defense.*;
import fly.*;
import sound.*;
public class Main
{
	public static void main(String[] args) 
	{
		System.out.println("Super Duck Behaviour");
		Duck sdb = new Duck(new ArrowAttack() , new ShieldDefense() , new RocketFly() , new ToaSound());
		sdb.fly();
		sdb.sound();
		sdb.attack();
		sdb.defense();
		System.out.println("");
		System.out.println("Noob Duck Behaviour");
		Duck ndb = new Duck(new SwordAttack() , new ArmorDefense() , new WingFly() , new NormalSound());
		ndb.fly();
		ndb.sound();
		ndb.attack();
		ndb.defense();
		System.out.println("");
		System.out.println("Super Duck Change Fly Behaviour");
		sdb = new Duck(new ArrowAttack() , new ShieldDefense() , new PlaneFly() , new ToaSound());
		sdb.fly();
		sdb.sound();
		sdb.attack();
		sdb.defense();
	}
}