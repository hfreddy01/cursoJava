package cursoJava.ejerciciosResueltos.recursividad.otroEjercicios;

/**
 * cursoJava
 * 
 * DESARROLLAR UN PROGRAMA QUE PERMITA RECORRER UN LABERINTO E INDIQUE SI TIENE SALIDA O NO. PARA RESOLVER ESTE
 * PROBLEMA AL LABERINTO LOS REPRESENTAMOS CON UNA MATRIZ DE 10+10 'JLabel' EL VALOR:
 * "0"	Representa pasillo  "1", Representa pared "9",	Persona "s"	Salida ALA SALIDA EN LA FILA 0 Y
 * COLUNNA 0 LOS CEROS Y UNOS DISPONERLOS EN FORMA ALEATORIA (CON LA FUNCION random)

 */

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Laberinto extends JFrame implements ActionListener {
	// ATRIBUTOS DE LA CLASE.
	JLabel[][] l;
	JButton b1;
	JButton b2;
	boolean salida;
	// METODO CONSTRUCTOR.
	Laberinto() {
		setLayout(null);
		l = new JLabel[10][10];
		// VALIDAMOS
		for (int f = 0; f < 10; f++) {
			// VALIDAMOS
			for (int c = 0; c < 10; c++) {
				l[f][c] = new JLabel();
				l[f][c].setBounds(20 + c * 20, 50 + f * 20, 20, 20);
				add(l[f][c]);
			}
		}
		b1 = new JButton("Recorrer");
		b1.setBounds(10, 300, 100, 25);
		add(b1);
		b1.addActionListener(this);
		b2 = new JButton("Crear");
		b2.setBounds(120, 300, 100, 25);
		add(b2);
		b2.addActionListener(this);
		crear();
	}
	// METODO QUE PERMITE CREAR LABERINTO
	public void crear() {
		// VALIDAMOS
		for (int f = 0; f < 10; f++) {
			// VALIDAMOS
			for (int c = 0; c < 10; c++) {
				int a = (int) (Math.random() * 4);
				l[f][c].setForeground(Color.black);
				// VALIDAMOS
				if (a == 0)
					l[f][c].setText("1");
				else
					l[f][c].setText("0");
			}
		}
		l[9][9].setText("s");
		l[0][0].setText("0");
	}

	// METODO QUE PERMITE RECORRER UN LABERINTO
	public void recorrer(int fil, int col) {
		// VALIDAMOS
		if (fil >= 0 && fil < 10 && col >= 0 && col < 10 && salida == false) {
			// VALIDAMOS
			if (l[fil][col].getText().equals("s"))
				salida = true;
			else if (l[fil][col].getText().equals("0")) {
				l[fil][col].setText("9");
				l[fil][col].setForeground(Color.red);
				recorrer(fil, col + 1);
				recorrer(fil + 1, col);
				recorrer(fil - 1, col);
				recorrer(fil, col - 1);
			}
		}
	}

	public void actionPerformed(ActionEvent e) {
		// VALIDAMOS
		if (e.getSource() == b1) {
			salida = false;
			recorrer(0, 0);
			if (salida)
				setTitle("tiene salida");
			else
				setTitle("no tiene salida");
		}
		if (e.getSource() == b2)
			crear();
	}

	// METODO PRINCIPAL DE LA CLASE.
	public static void main(String[] ar) {
		// CREAMOS EL OBETO DE LA CLASE.
		Laberinto l = new Laberinto();
		l.setBounds(0, 0, 300, 400);
		l.setVisible(true);
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}