package com.swingy;

import javax.swing.JFrame;

public class MainCode {

	public static void main(String[] args) {

		FirstWindow win = new FirstWindow();
		
		win.setVisible(true);
		//Terminate Program after closing appliation
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}  

}
