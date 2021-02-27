package New;
class trigonometry extends Operation {                     
	
	

	void doOperation(String operator3) {                     //Method Overriding
		super.doOperation(operator3); 
		
		r3=operator3;
		switch(r3) {
		 
		case "sin":
			r="sin";
			f=r3;
			operator2="sin "+String.valueOf(firstNum);
			result=Math.sin(firstNum);
			
			break;
		case "cos":
			r="cos";
			result=Math.cos(firstNum);
			operator2="cos "+firstNum;
			f=r3;
			break;
		case "tan":
			r="tan";
			result=Math.tan(firstNum);
	    	operator2="tan "+firstNum;
	    	f=r3;
			break;
		case "sind":
			r="sind";
			result=Math.sin(firstNum*pi/180);
			operator2="sin "+firstNum+"º";
			f=r3;
			break;
		case "cosd":
			r="cosd";
			result=Math.sin(firstNum*pi/180);
			operator2="cos "+firstNum+"º";
			f=r3;
			break;
		case "tand":
			r="tand";
			result=Math.sin(firstNum*pi/180);
			operator2="tan "+firstNum+"º";
			f=r3;
			break;
		case "sinh":
			r="sinh";
			result=Math.sinh(firstNum);
			operator2="sinh "+firstNum;
			f=r3;
			break;
		case "cosh":
			r="cosh";
			result=Math.cosh(firstNum);
			operator2="cosh "+firstNum;
			f=r3;
			break;
		case "tanh":
			r="tanh";
			result=Math.tanh(firstNum);
			operator2="tanh "+firstNum;
			f=r3;
			break;
		case "sindh":
			r="sindh";
			result=Math.sinh(firstNum*pi/180);
			operator2="sinh "+firstNum +"º";
			f=r3;
			break;
		case "cosdh":
			r="cosdh";
			result=Math.cosh(firstNum*pi/180);
			operator2="cosh "+firstNum +"º";
			f=r3;
			break;
		case "tandh":
			r="tandh";
			result=Math.tanh(firstNum*pi/180);
			operator2="tanh "+firstNum +"º";
			f=r3;
			break;
				
		}	
		
		textField.setText(String.valueOf(result));
		op = null;
	}
}