package com.test;

import java.util.List;

public class MenuOne {
		private int id;
		private String name;
	  	public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		private List<MenuTwo> MenuTwo;
	    public void setMenuTwo(List<MenuTwo> MenuTwo){
	        this.MenuTwo = MenuTwo;
	    }
	    public List<MenuTwo> getMenuTwo(){
	        return this.MenuTwo;
	    }
}
