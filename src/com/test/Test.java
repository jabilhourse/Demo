package com.test;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Root root=new Root();
		List<MenuOne> one=root.getMenuOne();
		MenuTwo two=new MenuTwo();
		List<MenuTwo> twoList=new ArrayList<MenuTwo>();
		for(MenuTwo mentTwo:twoList){
		}
		System.out.println(one.toString());
	}
}
