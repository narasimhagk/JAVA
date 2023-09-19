//package com.mario;
class Instanceo {
	int speed;
	 Instanceo(){
		System.out.println(speed);
	}
	{speed=100;}

	public static void main(String[] args) {
		Instanceo b=new Instanceo();
		Instanceo b1=new Instanceo();
	}
}
