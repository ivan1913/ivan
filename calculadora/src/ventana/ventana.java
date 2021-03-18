package ventana;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class ventana extends JFrame{
	
	private JPanel panel;
	private JButton boton;
	
	public ventana() {
		crearPanel();
		for (int i = 0; i <= 9;i++) {
			añadirBoton(i);
		}
		this.setVisible(true);
	}
	
	private void añadirBoton(int n) {
		boton = new JButton (String.valueOf(n));
		int f;
		int c;
		
		switch ((n+2)/3){
			case 1: 
				f=3;
				break;
			case 2:
				f=2;
				break;
			case 3:
				f=1;
				break;
			default:
				f=4;
				break;
		}
		
		if (n == 0) {
			c=1;
		} else {
			c = (n+2)%3;
		}
		
		c *= 50;
		c += 70;
		f *= 50;
		
		boton.setBounds(c, f, 50, 50);
		panel.add(boton);
		
	}
	
	private void crearPanel() {
		
		this.setSize(300, 300);
		this.setTitle("Calculadora");
		this.setLocationRelativeTo(null);
		panel = new JPanel();
		panel.setLayout(null);
		this.getContentPane().add(panel);
	}

}
