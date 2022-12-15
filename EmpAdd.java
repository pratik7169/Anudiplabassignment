package com.anudip;

import javax.persistence.Embeddable;

	@Embeddable
	public class EmpAdd {
		
		public String getHname() {
			return hname; //getter of hname
		}
		public void setHname(String hname) {
			this.hname = hname; //setter of hname
		}
		public String getArea() {
			return area;  //get of area
		}
		public void setArea(String area) {
			this.area = area;  //set of area
		}
		public int getPincode() {
			return pincode;   //get of pincode
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;  //set of pincode
		}
		private String hname;   //initilize hname
		private String area;    //iniitilize area
		private int pincode;    //initilize pincode
		

	}


