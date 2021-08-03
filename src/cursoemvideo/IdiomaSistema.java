/*
 * Created by JFormDesigner on Tue Jul 20 09:24:24 BRT 2021
 */

package cursoemvideo;

import java.awt.*;
import java.awt.event.*;
import java.util.Locale;

import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author lucas
 */
public class IdiomaSistema extends JFrame {
	public IdiomaSistema() {
		initComponents();
	}

	private void btnCliqueActionPerformed(ActionEvent e) {
		String idioma =Locale.getDefault().getDisplayLanguage();
		lblIdioma.setText(idioma);
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - lucas
		label1 = new JLabel();
		label2 = new JLabel();
		lblIdioma = new JLabel();
		btnClique = new JButton();

		//======== this ========
		Container contentPane = getContentPane();
		contentPane.setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]" +
			"[fill]",
			// rows
			"[]" +
			"[]" +
			"[]" +
			"[]" +
			"[]"));

		//---- label1 ----
		label1.setIcon(new ImageIcon(getClass().getResource("/imagens/internacionalizacao.png")));
		contentPane.add(label1, "cell 0 0 2 4");

		//---- label2 ----
		label2.setText("Idioma do sistema:");
		contentPane.add(label2, "cell 5 2");

		//---- lblIdioma ----
		lblIdioma.setText("Clique para descobrir o idioma");
		contentPane.add(lblIdioma, "cell 5 3");

		//---- btnClique ----
		btnClique.setText("Clique aqui");
		btnClique.addActionListener(e -> btnCliqueActionPerformed(e));
		contentPane.add(btnClique, "cell 5 4");
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - lucas
	private JLabel label1;
	private JLabel label2;
	private JLabel lblIdioma;
	private JButton btnClique;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
	public static void main(String[] args ) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                 IdiomaSistema GUI = new IdiomaSistema();
                 GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 GUI.setVisible(true);
            }
        });
}
}
