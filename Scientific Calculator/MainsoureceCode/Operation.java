package New;


import java.awt.Font;

import javax.swing.JButton;

 class Operation extends basicValues {   

	
	
	public static String f= operator;
	public static String d,d1 ,r,r1,r2,r3;
	
	
//Sub class 1
 final void doOperation(JButton operator) 
 {		r1=operator.getText();
		switch(r1) {
		
		case "+":
			result=firstNum+secondNum;
			operator1=firstNum+" + "+ secondNum;
			f=r1;
			break;
		case "–":
			operator1=firstNum+" – "+ secondNum;
			result=firstNum-secondNum;
			f=r1;
			break;
		case "×":
			operator1=firstNum+" × "+ secondNum;
			result=firstNum*secondNum;
			f=r1;
			break;
		case "÷":
			operator1=firstNum+" ÷ "+ secondNum;
			result=firstNum/secondNum;
			f=r1;
			break;
		case "%":
			operator1=firstNum+" % "+ secondNum;
			result=firstNum%secondNum;
			f=r1;
			break;
		case "x\u02B8":                                            //for doing x power y operation
			operator1=firstNum+" ^ "+ secondNum;
			result=Math.pow(firstNum,secondNum);
			f=r1;
			break;    
		case "log\u2090x":     
			
			r=String.valueOf("log\u2090x");
			result=Math.log10(firstNum)/Math.log10(secondNum);
			
		    break;
		}
	
	
		if(r1=="log\u2090x")
		{
			
			 textview.setText("log");
			  d =textview.getText();
		    	
			 textview.setFont(new Font("Mangal", Font.PLAIN, 1));
			 int a = (int)secondNum;
			 textview.setText(d+String.valueOf(a+"  "));
			d1= textview.getText();
			
			 textview.setFont(new Font("Cambria", Font.PLAIN, 20));
			 textview.setText(d1 +String.valueOf(("( "+firstNum+" )")));
			 textField.setText(String.valueOf(result));
			 op=null;
		}
		else
		{
			 textview.setText(operator1+" = "+result);
			textField.setText(String.valueOf(result));
			op=null;
		}
	}
 

	 void doOperation(String operator)
	 {    
		r2=operator;
			switch(operator) {
			case "sqrt":
				f=r2;
				operator2="\u221A"+firstNum;
				result=Math.sqrt(firstNum);
				
				break;
			case "exp":
				operator2="e ^ "+String.valueOf(firstNum);
				result=Math.exp(firstNum);
				f=r2;
				break;
			case "x^2":
				operator2=String.valueOf(firstNum)+" ²";
				result=Math.pow(firstNum,2);
				f=r2;
				break;
			case "x^3":
				operator2=String.valueOf(firstNum)+" ³";
				result=Math.pow(firstNum,3);
				f=r2;
				break;
			case "10^x":
				operator2="10 ^ "+String.valueOf(firstNum);
				result=Math.pow(10,firstNum);
				f=r2;
				break;
			case "2^x":
				operator2="2 ^ "+String.valueOf(firstNum);
				result=Math.pow(2,firstNum);
				f=r2;
				break;
			case "log":
				operator2="log "+String.valueOf(firstNum);
				result=Math.log10(firstNum);
				f=r2;
				break;
			case "ln":
				operator2="ln "+String.valueOf(firstNum);
				result=Math.log(firstNum);
				f=r2;
				break;
			case "inverse":
				operator2=String.valueOf(firstNum)+" ¯¹";
				result=1/firstNum;
				f=r2;
				break;
			case "modulus":
				operator2="| "+String.valueOf(firstNum)+" |";
				result=Math.abs(firstNum);
				f=r2;
				break;
			case "plusmin":
				operator2=String.valueOf(firstNum) ;
				result=-Double.parseDouble(textField.getText());
				f=r2;
				break;
			case "floor":
				operator2="[ "+String.valueOf(firstNum)+" ]";
				result=Math.round(firstNum);
				f=r2;
				break;
			case "xfact":
				operator2=String.valueOf(firstNum)+" !";
				double fact=1;
				for(double i=firstNum; i>0; i--) {
					fact*=i;				
				}
				result=fact;
				f=r2;
				break;
			case "e":
					textview.setText("e");
					operator2 = "e = ";
					result= firstNum*(Math.E);
					textField.setText(String.valueOf(result));
				f=r2;
				break;
			case "pi":
				
					textview.setText("π");
					result= firstNum*(Math.PI);
					operator2 = " π = ";
					textField.setText(String.valueOf(result));
				f=r2;
				break;
				
			}
		
			
			op=null;
		}
 
}
