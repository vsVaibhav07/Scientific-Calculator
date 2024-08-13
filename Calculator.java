package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Dialog", Font.PLAIN, 22));
		frame.setBounds(100, 100, 334, 395);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		lblNewLabel.setBounds(0, 0, 318, 30);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setBounds(10, 41, 298, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton root = new JButton("√");
		root.setEnabled(false);
		root.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		root.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		root.setBounds(10, 104, 58, 30);
		frame.getContentPane().add(root);
		
		JButton oneUponX = new JButton("1/x");
		oneUponX.setEnabled(false);
		oneUponX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		oneUponX.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		oneUponX.setBounds(10, 136, 58, 30);
		frame.getContentPane().add(oneUponX);
		
		JButton XPowY = new JButton("x^y");
		XPowY.setEnabled(false);
		XPowY.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="x^y";
			}
		});
		XPowY.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		XPowY.setBounds(10, 168, 58, 30);
		frame.getContentPane().add(XPowY);
		
		JButton xPow3 = new JButton("x^3");
		xPow3.setEnabled(false);
		xPow3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		xPow3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		xPow3.setBounds(10, 200, 58, 30);
		frame.getContentPane().add(xPow3);
		
		JButton xPow2 = new JButton("x^2");
		xPow2.setEnabled(false);
		xPow2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		xPow2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		xPow2.setBounds(10, 233, 58, 30);
		frame.getContentPane().add(xPow2);
		
		JButton factN = new JButton("n!");
		factN.setEnabled(false);
		factN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double fact=1;
				while(a!=0) {
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
			}
		});
		factN.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		factN.setBounds(10, 266, 58, 30);
		frame.getContentPane().add(factN);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setEnabled(false);
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnPlusMinus.setBounds(10, 301, 78, 30);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton e_pow_x = new JButton("e^x");
		e_pow_x.setEnabled(false);
		e_pow_x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		e_pow_x.setHorizontalAlignment(SwingConstants.RIGHT);
		e_pow_x.setVerticalAlignment(SwingConstants.BOTTOM);
		e_pow_x.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		e_pow_x.setBounds(71, 103, 59, 30);
		frame.getContentPane().add(e_pow_x);
		
		JButton log = new JButton("log");
		log.setEnabled(false);
		log.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		log.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		log.setBounds(71, 135, 59, 30);
		frame.getContentPane().add(log);
		
		JButton percent = new JButton("%");
		percent.setEnabled(false);
		percent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		percent.setFont(new Font("Tahoma", Font.BOLD, 16));
		percent.setBounds(71, 167, 59, 30);
		frame.getContentPane().add(percent);
		
		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(71, 199, 59, 30);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(71, 232, 59, 30);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(71, 265, 59, 30);
		frame.getContentPane().add(btn1);
		
		JButton sin = new JButton("sin");
		sin.setEnabled(false);
		sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		sin.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		sin.setBounds(130, 103, 54, 30);
		frame.getContentPane().add(sin);
		
		JButton sinh = new JButton("sinh");
		sinh.setEnabled(false);
		sinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		sinh.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		sinh.setBounds(130, 135, 54, 30);
		frame.getContentPane().add(sinh);
		
		JButton clear = new JButton("C");
		clear.setEnabled(false);
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		clear.setFont(new Font("Tahoma", Font.BOLD, 18));
		clear.setBounds(130, 167, 54, 30);
		frame.getContentPane().add(clear);
		
		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(130, 199, 54, 30);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(130, 232, 54, 30);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(130, 265, 54, 30);
		frame.getContentPane().add(btn2);
		
		JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(98, 300, 85, 30);
		frame.getContentPane().add(btn0);
		
		JButton cos = new JButton("cos");
		cos.setEnabled(false);
		cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		cos.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		cos.setBounds(186, 104, 55, 30);
		frame.getContentPane().add(cos);
		
		JButton cosh = new JButton("cosh");
		cosh.setEnabled(false);
		cosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		cosh.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		cosh.setBounds(186, 136, 55, 30);
		frame.getContentPane().add(cosh);
		
		JButton delete = new JButton("←");
		delete.setEnabled(false);
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				
				if(textField.getText().length()>0){
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		delete.setFont(new Font("Tahoma", Font.BOLD, 18));
		delete.setBounds(186, 168, 55, 30);
		frame.getContentPane().add(delete);
		
		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(186, 200, 55, 30);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(186, 233, 55, 30);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(186, 266, 55, 30);
		frame.getContentPane().add(btn3);
		
		JButton dot = new JButton(".");
		dot.setEnabled(false);
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+dot.getText();
				textField.setText(number);
			}
		});
		dot.setFont(new Font("Tahoma", Font.BOLD, 18));
		dot.setBounds(186, 300, 55, 30);
		frame.getContentPane().add(dot);
		
		JButton tan = new JButton("tan");
		tan.setEnabled(false);
		tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		tan.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		tan.setBounds(244, 104, 64, 30);
		frame.getContentPane().add(tan);
		
		JButton tanh = new JButton("tanh");
		tanh.setEnabled(false);
		tanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		tanh.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		tanh.setBounds(244, 136, 64, 30);
		frame.getContentPane().add(tanh);
		
		JButton minus = new JButton("-");
		minus.setEnabled(false);
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		minus.setFont(new Font("Tahoma", Font.BOLD, 18));
		minus.setBounds(244, 200, 64, 30);
		frame.getContentPane().add(minus);
		
		JButton multiply = new JButton("*");
		multiply.setEnabled(false);
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		multiply.setFont(new Font("Tahoma", Font.BOLD, 18));
		multiply.setBounds(244, 233, 64, 30);
		frame.getContentPane().add(multiply);
		
		JButton division = new JButton("/");
		division.setEnabled(false);
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		division.setFont(new Font("Tahoma", Font.BOLD, 16));
		division.setBounds(244, 266, 64, 30);
		frame.getContentPane().add(division);
		
		JButton equal = new JButton("=");
		equal.setEnabled(false);
		equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second= Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/") {
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%") {
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="x^y") {
					double resultt=1;
					for(int i=0;i<second;i++) {
						resultt=first*resultt;
					}
					answer=String.format("%.2f", resultt);
					textField.setText(answer);
				}
				
			}
		});
		equal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		equal.setBounds(244, 301, 64, 30);
		frame.getContentPane().add(equal);
		
		JButton plus = new JButton("+");
		plus.setEnabled(false);
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first= Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		plus.setFont(new Font("Tahoma", Font.BOLD, 14));
		plus.setBounds(244, 168, 64, 30);
		frame.getContentPane().add(plus);
		
		JRadioButton on = new JRadioButton("on");
		on.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setEnabled(true);
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btn0.setEnabled(true);
				factN.setEnabled(true);
				XPowY.setEnabled(true);
				xPow2.setEnabled(true);
				xPow3.setEnabled(true);
				plus.setEnabled(true);
				minus.setEnabled(true);
				multiply.setEnabled(true);
				equal.setEnabled(true);
				percent.setEnabled(true);
				clear.setEnabled(true);
				delete.setEnabled(true);
				sin.setEnabled(true);
				cos.setEnabled(true);
				tan.setEnabled(true);
				sinh.setEnabled(true);
				cosh.setEnabled(true);
				tanh.setEnabled(true);
				dot.setEnabled(true);
				log.setEnabled(true);
				division.setEnabled(true);
				oneUponX.setEnabled(true);
				root.setEnabled(true);
				btnPlusMinus.setEnabled(true);
				e_pow_x.setEnabled(true);
			}
		});
		buttonGroup.add(on);
		on.setFont(new Font("Tahoma", Font.PLAIN, 14));
		on.setBounds(15, 74, 46, 23);
		frame.getContentPane().add(on);
		
		JRadioButton off = new JRadioButton("off");
		off.setSelected(true);
		off.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setEnabled(false);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btn0.setEnabled(false);
				factN.setEnabled(false);
				XPowY.setEnabled(false);
				xPow2.setEnabled(false);
				xPow3.setEnabled(false);
				plus.setEnabled(false);
				minus.setEnabled(false);
				multiply.setEnabled(false);
				equal.setEnabled(false);
				percent.setEnabled(false);
				clear.setEnabled(false);
				delete.setEnabled(false);
				sin.setEnabled(false);
				cos.setEnabled(false);
				tan.setEnabled(false);
				sinh.setEnabled(false);
				cosh.setEnabled(false);
				tanh.setEnabled(false);
				dot.setEnabled(false);
				log.setEnabled(false);
				division.setEnabled(false);
				oneUponX.setEnabled(false);
				root.setEnabled(false);
				btnPlusMinus.setEnabled(false);
				e_pow_x.setEnabled(false);
				
				

			}
		});
		buttonGroup.add(off);
		off.setFont(new Font("Tahoma", Font.PLAIN, 14));
		off.setBounds(65, 74, 46, 23);
		frame.getContentPane().add(off);
		
		
	}
}
