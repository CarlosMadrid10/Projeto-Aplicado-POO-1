package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PrincipalUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrincipalUI frame = new PrincipalUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrincipalUI() {
		setTitle("SISTEMA DE CONTROLE DE ELEIÇÕES");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 612, 454);
		
		JMenuBar jbPrincipal = new JMenuBar();
		setJMenuBar(jbPrincipal);
		
		JMenu mnCadastros = new JMenu("Cadastros");
		jbPrincipal.add(mnCadastros);
		
		JMenuItem mntmCandidato = new JMenuItem("Candidato");
		mntmCandidato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroCandidatoUI cadCandidato = new CadastroCandidatoUI();
				cadCandidato.setVisible(true);
				contentPane.add(cadCandidato, 0);
			}
		});
		mnCadastros.add(mntmCandidato);
		
		JMenuItem mntmPesquisa = new JMenuItem("Pesquisa");
		mnCadastros.add(mntmPesquisa);
		
		JMenu mnConsultas = new JMenu("Consultas");
		jbPrincipal.add(mnConsultas);
		
		JMenuItem mntmCandidatos = new JMenuItem("Candidatos");
		mnConsultas.add(mntmCandidatos);
		
		JMenuItem mntmPesquisas = new JMenuItem("Pesquisas");
		mnConsultas.add(mntmPesquisas);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 424, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 251, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
	}

}
