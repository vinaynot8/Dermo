package com.example.Demo;

interface GamingConsole{
	void right();
	void left();
	void up();
	void down();
}
public class ViceCity implements GamingConsole {
	public void right() {System.out.println("ViceCity right");}
	public void left() {System.out.println("ViceCity right");}
	public void up() {System.out.println("ViceCity right");}
	public void down() {System.out.println("ViceCity right");}
}