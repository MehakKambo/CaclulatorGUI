package calcGUI;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGUI {

	//Global variables
	private JFrame frame;
	private JTextField textField;	
	double firstNumber;
	double secondNumber;
	double result;
	String operator;
	String answer;

	public static void main(String[] args) {
		CalculatorGUI calc = new CalculatorGUI();
		calc.frame.setVisible(true);
	}


	public CalculatorGUI() {
		startCalculator();
	}

	// Initialize the contents of the frame.
	private void startCalculator() {

		//Setting the frame
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 18));
		frame.setBounds(100, 100, 252, 373);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		//Setting up the textField
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 218, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setEditable(false);

		/*
		 * Row 1 of the calculator
		 * Buttons: ←(Backspace), AC(All Clear), ±(Plus-Minus), ÷(Division) 
		 */

		//Creating the buttons for row 1
		JButton backsapceBtn = new JButton("←");
		JButton allClearBtn = new JButton("AC");
		JButton plusMinusBtn = new JButton("±");
		JButton divisionBtn = new JButton("÷");

		//Font for the buttons in row 1
		backsapceBtn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		plusMinusBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		divisionBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));

		//Bounds for the buttons in row 1
		backsapceBtn.setBounds(10, 54, 50, 50);
		allClearBtn.setBounds(66, 53, 50, 50);
		plusMinusBtn.setBounds(122, 54, 50, 50);
		divisionBtn.setBounds(178, 54, 50, 50);

		//Adding the buttons to in row 1
		frame.getContentPane().add(backsapceBtn);
		frame.getContentPane().add(allClearBtn);
		frame.getContentPane().add(plusMinusBtn);
		frame.getContentPane().add(divisionBtn);

		//Adding the action to the buttons in row 1
		backsapceBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length() - 1);
					backspace = strB.toString();
					textField.setText(backspace);
				} 
			}
		});

		allClearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});

		plusMinusBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});

		divisionBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "/";
			}
		});


		/*
		 * Row 2 of the calculator
		 * Buttons: 7, 8, 9, X(Multiplication) 
		 */

		//Creating the buttons for row 2
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton multiplicationBtn = new JButton("x");

		//Font for the buttons in row 2
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		multiplicationBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));


		//Bounds for the buttons in row 2
		btn7.setBounds(10, 110, 50, 50);
		btn8.setBounds(66, 110, 50, 50);
		btn9.setBounds(122, 110, 50, 50);
		multiplicationBtn.setBounds(178, 110, 50, 50);


		//Adding the buttons to in row 2
		frame.getContentPane().add(btn7);
		frame.getContentPane().add(btn8);
		frame.getContentPane().add(btn9);
		frame.getContentPane().add(multiplicationBtn);


		//Adding the action to the buttons in row 2
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + 7);
			}
		});

		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + 8);
			}
		});

		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + 9);
			}
		});

		multiplicationBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "x";
			}
		});


		/*
		 * Row 3 of the calculator
		 * Buttons: 4, 5, 6, - (Subtraction) 
		 */

		//Creating the buttons for row 3
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton subtractionBtn = new JButton("-");

		//Font for the buttons in row 3
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		subtractionBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));

		//Bounds for the buttons in row 3
		btn4.setBounds(10, 166, 50, 50);
		btn5.setBounds(66, 166, 50, 50);
		btn6.setBounds(122, 166, 50, 50);
		subtractionBtn.setBounds(178, 166, 50, 50);

		//Adding the buttons to in row 3
		frame.getContentPane().add(btn4);
		frame.getContentPane().add(btn5);
		frame.getContentPane().add(btn6);
		frame.getContentPane().add(subtractionBtn);

		//Adding the action to the buttons in row 3
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + 4);
			}
		});		

		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + 5);
			}
		});

		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + 6);
			}
		});

		subtractionBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "-";
			}
		});


		/*
		 * Row 4 of the calculator
		 * Buttons: 1, 2, 3, +(Addition) 
		 */

		//Creating the buttons for row 4
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton additionBtn = new JButton("+");

		//Font for the buttons in row 4
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		additionBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));

		//Bounds for the buttons in row 4
		btn1.setBounds(10, 222, 50, 50);
		btn2.setBounds(66, 222, 50, 50);
		btn3.setBounds(122, 222, 50, 50);
		additionBtn.setBounds(178, 222, 50, 50);
		additionBtn.setBounds(178, 222, 50, 50);

		//Adding the buttons to in row 4
		frame.getContentPane().add(btn1);
		frame.getContentPane().add(btn2);
		frame.getContentPane().add(btn3);
		frame.getContentPane().add(additionBtn);

		//Adding the action to the buttons in row 4
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + 1);
			}
		});

		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + 2);
			}
		});

		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + 3);
			}
		});

		additionBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "+";
			}
		});


		/*
		 * Row 5 of the calculator
		 * Buttons: 0, .(Decimal), %(Percentage), =(Equals) 
		 */

		//Creating the buttons for row 5
		JButton btn0 = new JButton("0");
		JButton decimalBtn = new JButton(".");
		JButton percentageBtn = new JButton("%");
		JButton equalsBtn = new JButton("=");


		//Font for the buttons in row 5
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		decimalBtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		percentageBtn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		equalsBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));


		//Bounds for the buttons in row 5
		btn0.setBounds(10, 278, 50, 50);
		decimalBtn.setBounds(66, 278, 50, 50);
		percentageBtn.setBounds(122, 279, 50, 50);
		equalsBtn.setBounds(178, 278, 50, 50);


		//Adding the buttons to in row 5
		frame.getContentPane().add(btn0);
		frame.getContentPane().add(decimalBtn);
		frame.getContentPane().add(percentageBtn);
		frame.getContentPane().add(equalsBtn);


		//Adding the action to the buttons in row 5	
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + 0);
			}
		});

		decimalBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!textField.getText().contains(".")) {
					textField.setText(textField.getText() + decimalBtn.getText());
				}
			}
		});

		percentageBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNumber = Double.parseDouble(textField.getText());
				textField.setText("");
				operator = "%";
			}
		});

		equalsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondNumber = Double.parseDouble(textField.getText());
				switch(operator) {
				case "+":
					result = firstNumber + secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					break;
				case "-":
					result = firstNumber - secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					break;
				case "x":
					result = firstNumber * secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					break;
				case "/":
					result = firstNumber / secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					break;
				case "%":
					result = firstNumber % secondNumber;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					break;
				default:
					break;
				}
			}
		});
	}
}
