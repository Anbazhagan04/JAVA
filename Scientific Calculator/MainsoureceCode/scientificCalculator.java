package New;
import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;


public class scientificCalculator extends trigonometry{
	private JFrame frame;
	
	private JTextField txtTeam;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					scientificCalculator window = new scientificCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public scientificCalculator() {
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setTitle("Scientific Calculator");
		frame.getContentPane().setFont(new Font("Arial", Font.PLAIN, 14));
		frame.setBounds(100, 100, 580, 663);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setForeground(Color.WHITE);
		textField.setBackground(Color.DARK_GRAY);
		textField.setFont(new Font("Cambria Math", Font.PLAIN, 16));
		textField.setBounds(34, 103, 501, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JRadioButton btrad = new JRadioButton("rad");
		btrad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				angle="radian";
			
			}
		});
		btrad.setEnabled(false);
		btrad.setSelected(true);
		btrad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		buttonGroup_2.add(btrad);
		btrad.setBounds(34, 254, 63, 44);
		frame.getContentPane().add(btrad);
		
		JRadioButton btdeg = new JRadioButton("deg");
		btdeg.setSelected(true);
		btdeg.setEnabled(false);
		buttonGroup_2.add(btdeg);
		btdeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			angle= "degree";
				
			}
		});
		btdeg.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btdeg.setBounds(34, 313, 63, 44);
		frame.getContentPane().add(btdeg);
		
		JButton bt9 = new JButton("9");
		bt9.setEnabled(false);
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+bt9.getText();
				textField.setText(num);
			}
		});
		bt9.setFont(new Font("Cambria", Font.BOLD, 20));
		bt9.setBounds(253, 373, 63, 49);
		frame.getContentPane().add(bt9);
		
		JButton bt8 = new JButton("8");
		bt8.setEnabled(false);
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+bt8.getText();
				textField.setText(num);
			}
		});
		bt8.setFont(new Font("Cambria", Font.BOLD, 20));
		bt8.setBounds(326, 373, 63, 49);
		frame.getContentPane().add(bt8);
		
		JButton bt7 = new JButton("7");
		bt7.setEnabled(false);
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+bt7.getText();
				textField.setText(num);
			}
		});
		bt7.setFont(new Font("Cambria", Font.BOLD, 20));
		bt7.setBounds(399, 373, 63, 49);
		frame.getContentPane().add(bt7);
		
		JButton bt6 = new JButton("6");
		bt6.setEnabled(false);
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+bt6.getText();
				textField.setText(num);
			}
		});
		bt6.setFont(new Font("Cambria", Font.BOLD, 20));
		bt6.setBounds(253, 433, 63, 49);
		frame.getContentPane().add(bt6);
		
		JButton bt5 = new JButton("5");
		bt5.setEnabled(false);
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+bt5.getText();
				textField.setText(num);
			}
		});
		bt5.setFont(new Font("Cambria", Font.BOLD, 20));
		bt5.setBounds(326, 433, 63, 49);
		frame.getContentPane().add(bt5);
		
		JButton bt4 = new JButton("4");
		bt4.setEnabled(false);
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+bt4.getText();
				textField.setText(num);
			}
		});
		bt4.setFont(new Font("Cambria", Font.BOLD, 20));
		bt4.setBounds(399, 433, 63, 49);
		frame.getContentPane().add(bt4);
		
		JButton bt3 = new JButton("3");
		bt3.setEnabled(false);
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+bt3.getText();
				textField.setText(num);
			}
		});
		bt3.setFont(new Font("Cambria", Font.BOLD, 20));
		bt3.setBounds(253, 493, 63, 49);
		frame.getContentPane().add(bt3);
		
		JButton bt2 = new JButton("2");
		bt2.setEnabled(false);
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+bt2.getText();
				textField.setText(num);
			}
		});
		bt2.setFont(new Font("Cambria", Font.BOLD, 20));
		bt2.setBounds(326, 493, 63, 49);
		frame.getContentPane().add(bt2);
		
		JButton bt1 = new JButton("1");
		bt1.setEnabled(false);
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+bt1.getText();
				textField.setText(num);
			}
		});
		bt1.setFont(new Font("Cambria", Font.BOLD, 20));
		bt1.setBounds(399, 493, 63, 49);
		frame.getContentPane().add(bt1);
		
		JButton bt0 = new JButton("0");
		bt0.setEnabled(false);
		bt0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText()+bt0.getText();
				textField.setText(num);
			}
		});
		bt0.setFont(new Font("Cambria", Font.BOLD, 20));
		bt0.setBounds(253, 553, 136, 49);
		frame.getContentPane().add(bt0);
		
		JButton bt_dot = new JButton(".");
		bt_dot.setEnabled(false);
		bt_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNumber(bt_dot);
			}
		});
		bt_dot.setFont(new Font("Cambria", Font.PLAIN, 20));
		bt_dot.setBounds(399, 553, 63, 49);
		frame.getContentPane().add(bt_dot);
		
		JButton bt_mul = new JButton("\u00D7");
		bt_mul.setEnabled(false);
		bt_mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				op=bt_mul;
			}
		});
		bt_mul.setFont(new Font("Cambria", Font.PLAIN, 28));
		bt_mul.setBounds(472, 373, 63, 49);
		frame.getContentPane().add(bt_mul);
		
		JButton bt_sub = new JButton("\u2013");
		bt_sub.setEnabled(false);
		bt_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				op=bt_sub;
			}
		});
		bt_sub.setFont(new Font("Cambria", Font.PLAIN, 28));
		bt_sub.setBounds(472, 433, 63, 49);
		frame.getContentPane().add(bt_sub);
		
		JButton bt_add = new JButton("+");
		bt_add.setEnabled(false);
		bt_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				op=bt_add;
			
			}
		});
		bt_add.setFont(new Font("Cambria", Font.PLAIN, 28));
		bt_add.setBounds(472, 493, 63, 49);
		frame.getContentPane().add(bt_add);
		
		JButton bt_eq = new JButton("=");
		bt_eq.setEnabled(false);
		bt_eq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (op==null) {
					textField.setText(String.valueOf(result));
				}
				else {
					secondNum=getNum();
				    doOperation(op);
				}   
				trigonometry obj = new trigonometry();
				
				 if(f==r1)
			{
				textview.setText(operator1+" = "+result);
				
			}
			else if(r=="log\u2090x")
			{
				int d =(int)secondNum;
				 textview.setText("log"+String.valueOf((d+" ( "+firstNum+" )")+" = "+result));
				 textField.setText(String.valueOf(result));
				 op=null;
			}
			else if(f==r2)
			{
					textview.setText(operator2+" = "+result);
					textField.setText(String.valueOf(result));
			}
			
			else if(f==r3)
			{
				textview.setText(operator3+" = "+result);
				
			}
			
			else
			{
				textview.setText("SYNTAX ERROR");
			}
			}
		});
		bt_eq.setFont(new Font("Cambria", Font.PLAIN, 28));
		bt_eq.setBounds(472, 553, 63, 49);
		frame.getContentPane().add(bt_eq);
		
		JButton bt_divide = new JButton("\u00F7");
		bt_divide.setEnabled(false);
		bt_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				op=bt_divide;
			}
		});
		bt_divide.setFont(new Font("Cambria", Font.PLAIN, 28));
		bt_divide.setBounds(472, 313, 63, 49);
		frame.getContentPane().add(bt_divide);
		
		JButton btbackspace = new JButton("\uF0E7");
		btbackspace.setEnabled(false);
		btbackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btbackspace.setFont(new Font("Wingdings", Font.PLAIN, 15));
		btbackspace.setBounds(399, 313, 63, 49);
		frame.getContentPane().add(btbackspace);
		
		JButton btdel = new JButton("del");
		btdel.setEnabled(false);
		btdel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Operation o = new Operation();
				
				
				
				
				textField.setText(null);
				firstNum=0;
				secondNum=0;
				previousNum.clear();
				result=0;
				operator=null;
				op=null;
				opNow.clear();
				angle="radian";
				type="";
				
			}
		});
		btdel.setFont(new Font("Cambria", Font.PLAIN, 20));
		btdel.setBounds(326, 313, 63, 49);
		frame.getContentPane().add(btdel);
		
		JButton bt_mod = new JButton("%");
		bt_mod.setEnabled(false);
		bt_mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				op=bt_mod;
			}
		});
		bt_mod.setFont(new Font("Cambria", Font.PLAIN, 20));
		bt_mod.setBounds(253, 313, 63, 49);
		frame.getContentPane().add(bt_mod);
		
		JButton btln = new JButton("ln");
		btln.setEnabled(false);
		btln.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("ln");
			}
		});
		btln.setFont(new Font("Cambria", Font.PLAIN, 20));
		btln.setBounds(107, 252, 63, 49);
		frame.getContentPane().add(btln);
		
		JButton btsqrt = new JButton("\u221A");
		btsqrt.setEnabled(false);
		btsqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("sqrt");
			}
		});
		btsqrt.setFont(new Font("Cambria", Font.PLAIN, 20));
		btsqrt.setBounds(180, 313, 63, 49);
		frame.getContentPane().add(btsqrt);
		
		JButton btlog = new JButton("log");
		btlog.setEnabled(false);
		btlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("log");
			}
		});
		btlog.setFont(new Font("Cambria", Font.PLAIN, 18));
		btlog.setBounds(107, 313, 63, 49);
		frame.getContentPane().add(btlog);
		
		JButton btsqr = new JButton("x\u00B2");
		btsqr.setEnabled(false);
		btsqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("x^2");
			}
		});
		btsqr.setFont(new Font("Cambria", Font.PLAIN, 20));
		btsqr.setBounds(180, 373, 63, 49);
		frame.getContentPane().add(btsqr);
		
		JButton btloga = new JButton("log\u2090x");
		btloga.setEnabled(false);
		btloga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				op=btloga;
			}
		});
		btloga.setFont(new Font("Cambria", Font.PLAIN, 13));
		btloga.setBounds(107, 373, 63, 49);
		frame.getContentPane().add(btloga);
		
		JButton btcube = new JButton("x\u00B3");
		btcube.setEnabled(false);
		btcube.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("x^3");
			}
		});
		btcube.setFont(new Font("Cambria", Font.PLAIN, 20));
		btcube.setBounds(180, 433, 63, 49);
		frame.getContentPane().add(btcube);
		
		JButton btex = new JButton("e\u02E3");
		btex.setEnabled(false);
		btex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("exp");
			}
		});
		btex.setFont(new Font("Cambria", Font.PLAIN, 20));
		btex.setBounds(107, 433, 63, 49);
		frame.getContentPane().add(btex);
		
		JButton btpower = new JButton("x\u02B8");
		btpower.setEnabled(false);
		btpower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				op=btpower;
			}
		});
		btpower.setFont(new Font("Cambria", Font.PLAIN, 20));
		btpower.setBounds(180, 493, 63, 49);
		frame.getContentPane().add(btpower);
		
		JButton btp2 = new JButton("2\u02E3");
		btp2.setEnabled(false);
		btp2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("2^x");
			}
		});
		btp2.setFont(new Font("Cambria", Font.PLAIN, 20));
		btp2.setBounds(107, 553, 63, 49);
		frame.getContentPane().add(btp2);
		
		JButton bt_fac = new JButton("x!");
		bt_fac.setEnabled(false);
		bt_fac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("xfact");
			}
		});
		bt_fac.setFont(new Font("Cambria", Font.PLAIN, 20));
		bt_fac.setBounds(180, 553, 63, 49);
		frame.getContentPane().add(bt_fac);
		
		JButton bt_plusmin = new JButton("\u00B1");
		bt_plusmin.setEnabled(false);
		bt_plusmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doOperation("plusmin");
			}
		});
		bt_plusmin.setFont(new Font("Cambria", Font.PLAIN, 24));
		bt_plusmin.setBounds(326, 193, 63, 49);
		frame.getContentPane().add(bt_plusmin);
		
		JButton btpi = new JButton("\u03C0");
		btpi.setEnabled(false);
		btpi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (textField.getText()==null) {
					firstNum=1;
				}
				else 
				{
					firstNum=getNum();  
				}   
				doOperation("pi");
				
			}

			
		});
		btpi.setFont(new Font("Cambria", Font.PLAIN, 20));
		btpi.setBounds(472, 192, 63, 49);
		frame.getContentPane().add(btpi);
		
		JButton bt_modulus = new JButton("|x|");
		bt_modulus.setEnabled(false);
		bt_modulus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("modulus");
			}
		});
		bt_modulus.setFont(new Font("Cambria", Font.PLAIN, 20));
		bt_modulus.setBounds(399, 252, 63, 49);
		frame.getContentPane().add(bt_modulus);
		
		JButton btinv = new JButton("inv");
		btinv.setEnabled(false);
		btinv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("inverse");
			}
		});
		btinv.setFont(new Font("Cambria", Font.PLAIN, 20));
		btinv.setBounds(472, 252, 63, 49);
		frame.getContentPane().add(btinv);
		
		JButton bt_e = new JButton("e");
		bt_e.setEnabled(false);
		bt_e.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText()==null) 
				{
					firstNum=1;
				}
				else 
				{
					firstNum=getNum();  
				}   
				doOperation("e");
				
			}
		});
		bt_e.setFont(new Font("Cambria", Font.PLAIN, 20));
		bt_e.setBounds(399, 192, 63, 49);
		frame.getContentPane().add(bt_e);
		
		JButton btp10 = new JButton("10\u02E3");
		btp10.setEnabled(false);
		btp10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("10^x");
			}
		});
		btp10.setFont(new Font("Cambria", Font.PLAIN, 20));
		btp10.setBounds(107, 493, 63, 49);
		frame.getContentPane().add(btp10);
		
		JButton bt_close = new JButton(")");
		bt_close.setEnabled(false);
		bt_close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i>=0) {
					if (i==previousNum.size()) {}
					else {
						firstNum=Double.parseDouble(previousNum.get(i));
						secondNum=getNum();
						doOperation(opNow.get(i));
					}
					i-=1;
				}
				else {
					previousNum.clear();
					opNow.clear();
				}
			}
		});
		bt_close.setFont(new Font("Cambria", Font.PLAIN, 20));
		bt_close.setBounds(326, 252, 63, 49);
		frame.getContentPane().add(bt_close);
		
		JButton bt_open = new JButton("(");
		bt_open.setEnabled(false);
		bt_open.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(op==null) 
					opNow.add(bt_add);
				else 
					opNow.add(op);
				previousNum.add(String.valueOf(firstNum));
				i=previousNum.size();
			}
		});
		bt_open.setFont(new Font("Cambria", Font.PLAIN, 20));
		bt_open.setBounds(253, 252, 63, 49);
		frame.getContentPane().add(bt_open);
		
		JButton bt_sin = new JButton("sin");
		bt_sin.setEnabled(false);
		bt_sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				
				if (angle=="degree")
				{
					if (type.equals("hyperbole"))
						doOperation("sindh");
					else
						doOperation("sind");
				}
				else {
					if (type=="hyperbole") 
						doOperation("sinh");
					else
						doOperation("sin");
				}
			
				type="";
			}
		});
		bt_sin.setFont(new Font("Cambria", Font.PLAIN, 20));
		bt_sin.setBounds(34, 433, 63, 49);
		frame.getContentPane().add(bt_sin);
		
		JButton bt_cos = new JButton("cos");
		bt_cos.setEnabled(false);
		bt_cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				if (angle=="degree") {
					if (type.equals("hyperbole")) {
						doOperation("cosdh");
					}
					else
						doOperation("cosd");
				}
				else {
					if (type=="hyperbole") {
						doOperation("cosh");
					}
					else
						doOperation("cos");
				}	
				
				type="";
			}
		});
		bt_cos.setFont(new Font("Cambria", Font.PLAIN, 20));
		bt_cos.setBounds(34, 493, 63, 49);
		frame.getContentPane().add(bt_cos);
		
		JButton bt_tan = new JButton("tan");
		bt_tan.setEnabled(false);
		bt_tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				if (angle=="degree") {
					if (type.equals("hyperbole")) {
						doOperation("tandh");
					}
					else
						doOperation("tand");
				}
				else {
					if (type=="hyperbole") 
					{
						doOperation("tanh");
					}
					else
						doOperation("tan");
				}	
				
				type="";
			}
		});
		bt_tan.setFont(new Font("Cambria", Font.PLAIN, 20));
		bt_tan.setBounds(34, 553, 63, 49);
		frame.getContentPane().add(bt_tan);
		
		JButton bt_hyp = new JButton("hyp");
		bt_hyp.setEnabled(false);
		bt_hyp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				type="hyperbole";
			}
		});
		bt_hyp.setFont(new Font("Cambria", Font.PLAIN, 18));
		bt_hyp.setBounds(34, 373, 63, 49);
		frame.getContentPane().add(bt_hyp);
		
		JButton btgr = new JButton("[x]");
		btgr.setEnabled(false);
		btgr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=getNum();
				doOperation("floor");
			}
		});
		btgr.setFont(new Font("Cambria", Font.PLAIN, 18));
		btgr.setBounds(180, 252, 63, 49);
		frame.getContentPane().add(btgr);
		
		JButton bt_mr = new JButton("MR");
		bt_mr.setEnabled(false);
		bt_mr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(String.valueOf(memory));
			}
		});
		bt_mr.setFont(new Font("Cambria", Font.PLAIN, 18));
		bt_mr.setBounds(107, 193, 63, 49);
		frame.getContentPane().add(bt_mr);
		
		JButton bt_m1 = new JButton("M+");
		bt_m1.setEnabled(false);
		bt_m1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(textField.getText());
				memory+=firstNum;
			}
		});
		bt_m1.setFont(new Font("Cambria", Font.PLAIN, 18));
		bt_m1.setBounds(180, 192, 63, 49);
		frame.getContentPane().add(bt_m1);
		
		JButton bt_m2 = new JButton("M-");
		bt_m2.setEnabled(false);
		bt_m2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum=Double.parseDouble(textField.getText());
				memory-=firstNum;
			}
		});
		bt_m2.setFont(new Font("Cambria", Font.PLAIN, 18));
		bt_m2.setBounds(253, 192, 63, 49);
		frame.getContentPane().add(bt_m2);

		JButton btclr = new JButton(" Clear All");
		btclr.setEnabled(false);
		btclr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				textField.setText(null);
				textview.setText(null);
			}
		});
		btclr.setBounds(162, 157, 124, 25);
		frame.getContentPane().add(btclr);
		
		
		JButton bt_mc = new JButton("MC");
		bt_mc.setEnabled(false);
		bt_mc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				memory=0;
				textField.setText(null);
			}
		});
		bt_mc.setFont(new Font("Cambria", Font.PLAIN, 18));
		bt_mc.setBounds(34, 192, 63, 49);
		frame.getContentPane().add(bt_mc);
	
		
		
		

	
		
		txtTeam = new JTextField();
		txtTeam.setEditable(false);
		txtTeam.setFont(new Font("Tahoma", Font.BOLD, 18));
		txtTeam.setText("TEAM - 1");
		txtTeam.setHorizontalAlignment(SwingConstants.CENTER);
		txtTeam.setBounds(162, 0, 227, 49);
		frame.getContentPane().add(txtTeam);
		txtTeam.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					 
				    btcube.setEnabled(true);
			        bt_open.setEnabled(true);
				    bt_close.setEnabled(true);
				    btinv.setEnabled(true);
					btrad.setEnabled(true);
					bt_mc.setEnabled(true);
					bt_mr.setEnabled(true);
					btdeg.setEnabled(true);
					bt_tan.setEnabled(true);
					bt_plusmin.setEnabled(true);
					bt_hyp.setEnabled(true);
					bt_cos.setEnabled(true);
					btln.setEnabled(true);
					bt_sin.setEnabled(true);
					bt_fac.setEnabled(true);
					btlog.setEnabled(true);
					btpi.setEnabled(true);
					btpower.setEnabled(true);
					bt_mod.setEnabled(true);
					btsqr.setEnabled(true);
					btsqrt.setEnabled(true);
					bt_divide.setEnabled(true);
					bt_eq.setEnabled(true);
					bt_add.setEnabled(true);
					bt_mul.setEnabled(true);
					bt_sub.setEnabled(true);
					btbackspace.setEnabled(true);
					btdel.setEnabled(true);
					bt_e.setEnabled(true);
					bt_dot.setEnabled(true);
					btp2.setEnabled(true);
					bt_m1.setEnabled(true);
					bt_m2.setEnabled(true);
					btp10.setEnabled(true);
					btex.setEnabled(true);
					btloga.setEnabled(true);
					btgr.setEnabled(true);
					bt_modulus.setEnabled(true);
					bt0.setEnabled(true);
					bt1.setEnabled(true);
					bt2.setEnabled(true);
					bt3.setEnabled(true);
					bt4.setEnabled(true);
					bt5.setEnabled(true);
					bt6.setEnabled(true);
					bt7.setEnabled(true);
					bt8.setEnabled(true);
					bt9.setEnabled(true);
					btclr.setEnabled(true);
			
			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(34, 157, 51, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("OFF");
		rdbtnNewRadioButton_1.setSelected(true);
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textview.setText(null);
				btclr.setEnabled(false);
				btcube.setEnabled(false);
				bt_open.setEnabled(false);
				bt_close.setEnabled(false);
			    btinv.setEnabled(false);
				bt_tan.setEnabled(false);
				bt_cos.setEnabled(false);
				btln.setEnabled(false);
				bt_sin.setEnabled(false);
				bt_fac.setEnabled(false);
				btlog.setEnabled(false);
				btpi.setEnabled(false);
				btpower.setEnabled(false);
				bt_mod.setEnabled(false);
				btsqr.setEnabled(false);
				btsqrt.setEnabled(false);
				bt_divide.setEnabled(false);
				bt_eq.setEnabled(false);
				bt_add.setEnabled(false);
				bt_mul.setEnabled(false);
				bt_sub.setEnabled(false);
				btbackspace.setEnabled(false);
				btdel.setEnabled(false);
				bt_e.setEnabled(false);
				bt_dot.setEnabled(false);
				bt0.setEnabled(false);
				bt1.setEnabled(false);
				bt2.setEnabled(false);
				bt3.setEnabled(false);
				bt4.setEnabled(false);
				bt5.setEnabled(false);
				bt6.setEnabled(false);
				bt7.setEnabled(false);
				bt8.setEnabled(false);
				bt9.setEnabled(false);
				btrad.setEnabled(false);
				bt_mc.setEnabled(false);
				bt_mr.setEnabled(false);
				btdeg.setEnabled(false);
				bt_plusmin.setEnabled(false);
				bt_hyp.setEnabled(false);
				btp2.setEnabled(false);
				bt_m1.setEnabled(false);
				bt_m2.setEnabled(false);
				btp10.setEnabled(false);
				btex.setEnabled(false);
				btloga.setEnabled(false);
				btgr.setEnabled(false);
				bt_modulus.setEnabled(false);

				
			}
		});
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(89, 157, 51, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		textview = new JTextField();
		textview.setHorizontalAlignment(SwingConstants.RIGHT);
		textview.setBackground(Color.GRAY);
		textview.setForeground(Color.WHITE);
		textview.setBounds(34, 56, 501, 49);
		frame.getContentPane().add(textview);
		textview.setColumns(10);
		textview.setEnabled(false);
		textview.setEditable(false);
		textview.setFont(new Font("Cambria Math", Font.PLAIN, 18));
		textview.setColumns(8);
	
	}
}
