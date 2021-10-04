import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Area extends JFrame{
	
	Area() {
		setTitle("원 넓이 구하기 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container content = getContentPane();
		content.setLayout(new FlowLayout());
		
		JComboBox comboBox= new JComboBox();
		
		comboBox.addItem("red");
		comboBox.addItem("blue");
		
		
		
		JButton cal =new JButton("계산");
		JButton reset = new JButton("리셋");
		JTextField r = new JTextField(11);
		JTextField area = new JTextField(11);
		JTextArea result = new JTextArea(5,18);
		area.setEnabled(false);
		
		String color = (String)comboBox.getSelectedItem();
		if(color == "red") {
			result.setForeground(Color.RED);
		}
		else {
			result.setForeground(Color.BLUE);
		}
		cal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(r.getText().isEmpty()) {
					result.setText("원 반지름을 입력해주세요");
				}
				else {
					double textr= Double.parseDouble(r.getText()); 
					double pi = Math.round(Math.PI*100)/100.0;
					double ans = textr*textr*pi;
					String answer=textr+"*"+textr+"*"+pi+"="+ans;
//					System.out.println(answer);
					result.setText(answer);
					area.setText(Double.toString(ans));
				}
			}
			
		});
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				r.setText("");
				area.setText("");
				result.setText("");
				r.requestFocus();
			}
			
		});
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String color = (String)comboBox.getSelectedItem();
				if(color == "red") {
					result.setForeground(Color.RED);
				}
				else {
					result.setForeground(Color.BLUE);
				}
			}
			
		});
	
		content.add(new JLabel("원의 반지름"));
		content.add(r);
		content.add(new JLabel("원의 넓이"));
		content.add(area);
		content.add(result);
		content.add(cal);
		content.add(comboBox);
		content.add(reset);
		
		setSize(260,220);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area circle = new Area();
	}
	

}
