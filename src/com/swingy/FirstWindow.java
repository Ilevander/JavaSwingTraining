package com.swingy;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FirstWindow extends JFrame implements ActionListener{
 
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JPanel pannel1;
	JPanel pannel2;     
	private static final long serialVersionUID = 1L;

		/**Create Constuctor:*/
			
				public FirstWindow()
				{
		           //setSize(300,150);//use (0,0) i7datiyatt
					setBounds(100,100,400,200);//Decalle with 500 columns and 40 lines and after start tracing the ourJPanel.
					setTitle("My First Swing Window");
					setVisible(true);
					pannel1 = new JPanel(new BorderLayout());
					pannel2 = new JPanel();
					pannel1.setBackground(Color.red);
					pannel2.setBackground(Color.green);
//					addMouseListener(this);
					button1 = new JButton("button 1");
					button2 = new JButton("button 2");
					button3 = new JButton("button 3");
					button4 = new JButton("button 4");
					pannel2.add(button3);
					pannel2.add(button4);
     				button1.addActionListener(this);
					button2.addActionListener(this);
					pannel1.add(button1,BorderLayout.NORTH);
					pannel1.add(button2,BorderLayout.WEST);
					pannel1.add(pannel2,BorderLayout.SOUTH);
					setContentPane(pannel1);
				}
  
//		@Override 
//		public void mouseClicked(MouseEvent e) {
//			// TODO Auto-generated method stub  
//			System.out.println("This is a Click event");
//		}
//
//		@Override
//		public void mousePressed(MouseEvent e) {
//			// TODO Auto-generated method stub
//			System.out.println("This is a Mouse Pressed	 event");
//		}
//
//		@Override
//		public void mouseReleased(MouseEvent e) {
//			// TODO Auto-generated method stub
//			System.out.println("This is a Mouse Released event");
//		}
//
//		@Override
//		public void mouseEntered(MouseEvent e) {
//			// TODO Auto-generated method stub
//			System.out.println("This is a Enter event");
//		}
//
//		@Override
//		public void mouseExited(MouseEvent e) {
//			// TODO Auto-generated method stub
//		}
	     @Override
		 public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button1)
                System.out.println("Im the button 1");
			 if (e.getSource()==button2)
				System.out.println("Im the button 2");
		}
				
	

}

