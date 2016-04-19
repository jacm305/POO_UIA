import javax.swing.*;
import java.awt.event.*;
class JForm1 extends JFrame{
		JButton B1;
		JLabel L1;
	public JForm1(){   //este es el constructor
		super("SICADI constructores");
		this.setBounds(100,100,300,200);
		this.setVisible(true);
		this.load();
	}
	public void load(){ //este es el metodo de carga de los eventos
		B1 = new JButton("Aceptar");
		B1.setBounds(150,150,100,150);
		B1.setActionCommand("B1");
		this.add(B1);
		L1 = new JLabel("\t\t\tBienvenido a nuestro Programa"+"\n nuestro objetivo es ayudarte a calcular el presupuesto de tus obras"+"\n de construccion");
		L1.setBounds(125,100,100,150);
		this.add(L1);
	}
}
class Ventanas{
	public static void main(String[] args) {
		JForm1 prueba1 = new JForm1();


	}
}