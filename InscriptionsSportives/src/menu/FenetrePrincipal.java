package menu;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FenetrePrincipal extends JFrame implements ActionListener{
	
	JButton BoutonCompet = new JButton("Gestion Competition");
	JButton BoutonEquipe = new JButton("Gestion Equipe");
	JButton BoutonPersonne = new JButton("Gestion Personne");
		
	public FenetrePrincipal()
	{
		this.setTitle("Menu Principal");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());

		JPanel panneau1 = new JPanel();
		
		panneau1.setLayout(new FlowLayout());

		panneau1.add(BoutonCompet);
		panneau1.add(BoutonEquipe);
		panneau1.add(BoutonPersonne);
		
		this.add(panneau1, BorderLayout.NORTH);
		
		BoutonCompet.addActionListener(this);
		BoutonEquipe.addActionListener(this);
		BoutonPersonne.addActionListener(this);
		
		this.setBounds(10, 10, 500, 400);
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == BoutonCompet);
	}
	
	public static void main(String [] args)
	{
		FenetrePrincipal fenetre = new FenetrePrincipal();
	}
}
