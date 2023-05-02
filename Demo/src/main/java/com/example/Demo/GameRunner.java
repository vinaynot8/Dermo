package com.example.Demo;

public class GameRunner {
	GamingConsole obj;
	
	GameRunner(GamingConsole obj) {
	   this.obj=obj;
	   obj.right();
	   obj.left();
	   obj.up();
	   obj.down();
	}
}
