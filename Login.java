import java.awt.*;
class Login
{
   public static void main(String args[])
   {
	Frame f=new Frame();
	f.setSize(500,1500);
	f.setLayout(new FlowLayout());
	f.setVisible(true);
	f.setTitle("Login Page");
	f.setBackground(Color.blue);
	
	Label a1=new Label("User Name");
	Label a2=new Label("PASSWORd");
	
	TextField t1=new TextField(20);
	TextField t2=new TextField(20);
	t2.setEchoChar('*');
	Button b=new Button("Log In");
	
	f.add(a1);
	f.add(t1);
	f.add(a2);
	f.add(t2);
	f.add(b);
  }
} 

	
	
	