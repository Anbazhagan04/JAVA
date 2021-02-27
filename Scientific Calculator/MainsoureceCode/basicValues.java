package New;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.util.ArrayList;

abstract class basicValues {                                     //Super class
	static protected JTextField textField;
	static protected JTextField textview;
	static double firstNum=0;
	static double secondNum=0;
	static ArrayList<String> previousNum = new ArrayList<String>();
	static double result=0;
	static protected String operator=null,operator1=null,operator2=null,operator3=null;
	static protected JButton op=null;
	static ArrayList<JButton> opNow = new ArrayList<JButton>(); 
	static protected double memory=0;
	static String angle="radian";
	static String type="";
	static int i=-1;
	final double pi=Math.PI;                           //constants
	
	

	
	static public double getNum() {
	
		
		double num;
		if (textField.getText().equals(""))
			num=0;
		else
			num=Double.parseDouble(textField.getText());
		textField.setText("");
	
		return num;
	}
	
	static void setNumber(JButton name) {
		String number=textField.getText()+name.getText();
		textField.setText(number);
	}
	
	abstract void doOperation(String operator);
	abstract void doOperation(JButton operator);
}