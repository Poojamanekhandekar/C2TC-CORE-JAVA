package com.cg.core;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
ArrayList l=new ArrayList();
l.add("Pooja");
l.add(28);
l.add(50);
l.add("B+");
System.out.println(l);
l.remove(2);
System.out.println(l);
l.add(0,"Mrs");
System.out.println(l);
	}

}