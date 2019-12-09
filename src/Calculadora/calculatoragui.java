package Calculadora;
// Java program to create frames 
// using association
 
import javax.swing.*;

import java.awt.Frame;
import java.awt.event.*;

public class calculatoragui extends Frame implements ActionListener
{
    JFrame frame;
    JTextField textField = new JTextField();
    JButton button,button1,button2,button3,button4,button5,button6,button7,button8,button9,
    button10,button11,button12,button13,button14,button16,button17,button18,button19;
    
    String input ;
    int operacion;
    static double resultado ,a ,b;
    
	calculatoragui()
    {
        // creating instance of JFrame with name "first way"
        frame=new JFrame("IVHCALCULATOR2018");
    
         
        // creates instance of JButton
      
        
        
         button =  new JButton("0");
         button1 = new JButton(".");
         button2 = new JButton("=");
         button3 = new JButton("1");
         button4 = new JButton("2");
         button5 = new JButton("3");
         button6 = new JButton("+");
        
         button7 = new JButton("4");
         button8 = new JButton("5");
         button9 = new JButton("6");
         button10 = new JButton("-");
        
         button11 = new JButton("7");
         button12 = new JButton("8");
         button13 = new JButton("9");
         button14 = new JButton("x");
        
     
         button16 = new JButton("÷");
         button17 = new JButton("<=");
         button18 = new JButton("C");
         button19 = new JButton("√  ");
 
        button.setBounds(5, 275, 200, 50);
        button1.setBounds(205, 275, 99, 50);
        button2.setBounds(305, 275, 150, 50);
        
        button3.setBounds(5, 225, 99, 50);
        button4.setBounds(105, 225, 99, 50);
        button5.setBounds(205, 225, 99, 50);
        button6.setBounds(305, 225, 150, 50);
        
        button7.setBounds(5, 175, 99, 50);
        button8.setBounds(105, 175, 99, 50);
        button9.setBounds(205, 175, 99, 50);
        button10.setBounds(305, 175, 150, 50);

        button11.setBounds(5, 125, 99, 50);
        button12.setBounds(105, 125, 99, 50);
        button13.setBounds(205, 125, 99, 50);
        button14.setBounds(305, 125, 150, 50);
        
      
        button16.setBounds(305, 75, 150, 50);
        button17.setBounds(205, 75, 99, 50);
        button18.setBounds(105, 75, 99, 50);
        button19.setBounds(5, 75, 99, 50);
        
        textField.setBounds(5,5,450,70);
        
        
        
         
        // setting close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
 

        frame.add(textField);  
        frame.add(button);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3); 
        frame.add(button4); 
        frame.add(button5); 
        frame.add(button6); 
        frame.add(button7); 
        frame.add(button8);
        frame.add(button9);
        frame.add(button10); 
        frame.add(button11);
        frame.add(button12);
        frame.add(button13);
        frame.add(button14);
        frame.add(button16);
        frame.add(button17);
        frame.add(button18);
        frame.add(button19);
        
        
        frame.setSize(460, 350);
        frame.setLayout(null);
        frame.setVisible(true);
        
        button.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button9.addActionListener(this);
        button10.addActionListener(this);
        button11.addActionListener(this);
        button12.addActionListener(this);
        button13.addActionListener(this);
        button14.addActionListener(this);
        button16.addActionListener(this);
        button17.addActionListener(this);
        button18.addActionListener(this);
        button19.addActionListener(this);

    }
    
	public void actionPerformed(ActionEvent e)
    {
		
		
        if(e.getSource()==button) {
        	   textField.setText(textField.getText().concat("0"));
        }
        
        if(e.getSource()==button1) {
           textField.setText(textField.getText().concat("."));
        }
        
     
        if(e.getSource()==button3) {
        	    textField.setText(textField.getText().concat("1"));
        }
        
         if(e.getSource()==button4) {
        	 textField.setText(textField.getText().concat("2"));
        }
         
         if(e.getSource()==button5) {
        	 textField.setText(textField.getText().concat("3"));	
         }
         
         if(e.getSource()==button6) {   // SUMA
        	 a = Double.parseDouble(textField.getText());
             operacion=1;
             textField.setText("");
        	 
         }
         
         if(e.getSource()==button7) {
        	 textField.setText(textField.getText().concat("4"));
         }
         
         if(e.getSource()==button8) {
        	 textField.setText(textField.getText().concat("5"));
         }
         
         if(e.getSource()==button9) {
        	 textField.setText(textField.getText().concat("6"));
         }
         
         if(e.getSource()==button10) { //RESTA
         	   a=Double.parseDouble(textField.getText());
               operacion=2;
               textField.setText("");
        	 
         }
         
         if(e.getSource()==button11) {
        	 textField.setText(textField.getText().concat("7"));
         }
         
         if(e.getSource()==button12) {
        	 textField.setText(textField.getText().concat("8"));
         }
         
         if(e.getSource()==button13) {
        	 textField.setText(textField.getText().concat("9"));
         }
            
         if(e.getSource()==button14) { // Multiplicacion
          	  a=Double.parseDouble(textField.getText());
              operacion=3;
        
              textField.setText("");
         }
         
         if(e.getSource()==button16) { // Division
        	      a=Double.parseDouble(textField.getText());
              operacion=4;
              textField.setText("");
         }
         
         
         if(e.getSource()==button17) {  // Borrar
        	 
        	 String s=textField.getText();
             textField.setText("");
             for(int i=0;i<s.length()-1;i++)
             textField.setText(textField.getText()+s.charAt(i));
         	
         }
         
         if(e.getSource()==button18) {  // Clear
        	        textField.setText("");
         }
         
         if(e.getSource()==button19) {
           	
         }
         
         if(e.getSource()==button2) {   // ==    
              	b=Double.parseDouble(textField.getText());
             
                switch(operacion)
                {
                    case 1: 
                    	       resultado = a+b;
                        break;
            
                    case 2: 
                    	        resultado = a-b;
                        break;
            
                    case 3:
                    	        resultado = a*b;
                        break;
            
                    case 4: 
                    	        resultado = a/b;
                        break;
                        
                    case 5: 
            	                resultado = a/b;
                        break;
            
                    default: resultado = 0;
                }
            
                textField.setText(" "+resultado);
            	
            }
        
       
    }
    	
    	
    	
    
    
     
  
}