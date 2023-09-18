import java.awt.*;
import java.awt.event.*;
import java.applet.*;
{
Label label1 label2; 
TextField tf1, tf2;
Button b1, b2;
String whichButtonClk;	//This String object will tells us which button is pressed

public void init
{
System.out.println("Initializing an applet");

label1 = new Label("Number1");
tf1= new TextField();

label2 = new Label("Number2");
tf2= new TextField();

b1 = new Button("Add");
b2 = new Button("Multiply");

add(label1);
add(tf1);

add(label2);
add(tf2);

add(b1);
add(b2);

tf1.addActionListener(this); 	//Applet5 class registering to listen to first textfield event
tf2.addActionListener(this); 	//Applet5 class registering to listen to second textfield event
b1.addActionListener(this);	//Applet5 class registering to listen to first button event
b2.addActionListener(this);	//Applet5 class registering to listen to second button event
}

public void actionPerformed 
{
if(ae.getActionCommand().equals("Add") || ae.getActionCommand().equals("Multiply"))// checking if an event of clicking the add/subtract/multiply/divide button is generated
{
whichButtonClk=ae.getActionCommand(); //initializing whichButtonClk to a String value of Button which is clicked
repaint();
}
}

public void paint
{	
g.drawString("Please enter two numbers to perform math operations", ,);

if(tf1.getText().equals("") && tf2.getText().equals("")) //if the add button is clicked when textfields are empty
{	
}	
else
{
	Integer i1=  new Integer(tf1.getText());
	Integer i2= new Integer(tf2.getText());	
	int sum = i1+i2;
	int multiply=i1*i2;
	
	if(whichButtonClk.equals("Add"))
		g.drawString("Your sum is "+ sum);
	
	if(whichButtonClk.equals("Multiply"))
		g.drawString("Your multiply is "+ multiply);
	
}
}

/*
<applet code="Applet6.java" width="400" height="400">
</applet>
*/