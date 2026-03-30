/*
Task : mini game have 3 characters (warrior, mage, archer) 
all characters have attack ->
warrior -> attack with sword
archer -> attack with arrow
mage -> attack with magic
one common reference (name_)
    */

import java.util.*;
abstract class character{
	String name;
	character(String name){
		this.name=name;
	}
	abstract public void attack();
}
class warrior extends character{
	warrior(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void attack() {
		System.out.println(name+"Attack with sword");
	}
}
class archer extends character{
	archer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void attack() {
		System.out.println(name+"Attack with arrow");
	}
}
class mage extends character{
	mage(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void attack() {
		System.out.println(name+"Attack with magic");
	}
}
public class task {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
		if(n==1) {
			character c= new warrior("warrior");
			c.attack();
		}
		else if(n==2) {
			character c= new archer("archer");
			c.attack();
		}
		else  {
			character c= new mage("mage");
			c.attack();
		}
	}

}
