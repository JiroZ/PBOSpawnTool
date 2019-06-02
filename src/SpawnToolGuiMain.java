import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.Component;
import javax.swing.Box;

public class SpawnToolGuiMain {

	JFrame frame;
	
	private JLabel lblNamestring = new JLabel("Name_String");
	
	private JLabel lblChancesstring = new JLabel("Chances_String");
	
	private JLabel lblTimestring = new JLabel("Time_String");
	
	private JLabel lblBuildstring = new JLabel("Build_String");
	
	private JLabel lblGrassstring = new JLabel("Grass_String");
	
	private JLabel lblAistring = new JLabel("AI_String");
	
	private JLabel lblIdstring = new JLabel("ID_String");
	
	private static JScrollPane scrollPane = new JScrollPane();

	public static String filename;
	
	private static JFileChooser fc = new JFileChooser();
	
	public static File Open = null ;		


	
	public SpawnToolGuiMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("PBO's Wild Spawn Tool Designed By Jiro");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 186, 159, 299);
		frame.getContentPane().add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		list = new JList();		
		
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		list.setVisibleRowCount(-1);	
		
		
		JLabel lblPokemons = new JLabel("Pokemons");
		scrollPane.setColumnHeaderView(lblPokemons);
		
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(420, 462, 57, 23);
		frame.getContentPane().add(btnAdd);		
		btnAdd.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
						
				
				try {
					SpawnToolAddGui addGUI = new SpawnToolAddGui();
					addGUI.frame.setVisible(true);
				} catch (Exception addexception) {
					addexception.printStackTrace();
				}				
			}			
		});
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(349, 462, 67, 23);
		frame.getContentPane().add(btnSave);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(285, 462, 57, 23);		
		frame.getContentPane().add(btnEdit);
		
		JLabel lblPokemonimage = new JLabel("Pokemon_Image");
		lblPokemonimage.setBounds(10, 11, 159, 164);
		frame.getContentPane().add(lblPokemonimage);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(179, 11, 46, 14);
		frame.getContentPane().add(lblName);
		
		
		lblNamestring.setBounds(235, 11, 107, 14);
		frame.getContentPane().add(lblNamestring);
		
		JLabel lblChances = new JLabel("Chances");
		lblChances.setBounds(179, 36, 57, 14);
		frame.getContentPane().add(lblChances);
		
		
		lblChancesstring.setBounds(235, 36, 125, 14);
		frame.getContentPane().add(lblChancesstring);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setBounds(179, 61, 46, 14);
		frame.getContentPane().add(lblTime);
		
	
		lblTimestring.setBounds(235, 61, 107, 14);
		frame.getContentPane().add(lblTimestring);
		
		JLabel lblBuild = new JLabel("Build");
		lblBuild.setBounds(179, 86, 46, 14);
		frame.getContentPane().add(lblBuild);
		
		lblBuildstring.setBounds(235, 86, 80, 14);
		frame.getContentPane().add(lblBuildstring);
		
		JLabel lblGrass = new JLabel("Grass");
		lblGrass.setBounds(179, 111, 46, 14);
		frame.getContentPane().add(lblGrass);
		

		lblGrassstring.setBounds(235, 111, 80, 14);
		frame.getContentPane().add(lblGrassstring);
		
		JLabel lblAi = new JLabel("AI");
		lblAi.setBounds(179, 136, 46, 14);
		frame.getContentPane().add(lblAi);
		

		lblAistring.setBounds(235, 136, 181, 14);
		frame.getContentPane().add(lblAistring);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(179, 161, 46, 14);
		frame.getContentPane().add(lblId);
		

		lblIdstring.setBounds(235, 161, 80, 14);
		frame.getContentPane().add(lblIdstring);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(0, 317, 20, 1);
		frame.getContentPane().add(horizontalStrut);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalGlue.setBounds(10, 74, 1, 1);
		frame.getContentPane().add(horizontalGlue);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(224, 0, 1, 20);
		frame.getContentPane().add(verticalStrut);
		btnEdit.addActionListener(new ActionListener() {
			
			 public void actionPerformed(ActionEvent e) {
					try {
					SpawnToolEditGui editGUI = new SpawnToolEditGui();
					editGUI.frame.setVisible(true);
				} catch (Exception editexception) {
					editexception.printStackTrace();
				}

			  }
			});
		
		frame.setBounds(100, 100, 503, 557);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mnFile.add(mntmNew);
		
		mntmNew.addActionListener(new ActionListener( ) {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							MenuNewGUI window = new MenuNewGUI();
							window.frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});				
			}			
		});
			
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mnFile.add(mntmOpen);
		mntmOpen.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {		
				
								
				fc.setCurrentDirectory(new java.io.File(".\\src\\assets\\data\\spawnFiles"));
				fc.setDialogTitle("choosertitle");
				fc.setAcceptAllFileFilterUsed(true);

				if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
				  System.out.println("Selected File : " + fc.getSelectedFile());
				  Open = fc.getSelectedFile();

				} else {
				  System.out.println("No Selection");
				}	
				
				setfileOpenLocation(Open);		
				
				if(Open != null) {
					btnAdd.setEnabled(true);
					btnEdit.setEnabled(true);
					btnSave.setEnabled(true);					

					PokemonListData data = new PokemonListData();					
					JList list = new JList(data.pokemonNameModel());					
					scrollPane.setViewportView(list);	
					
					list.addListSelectionListener(new ListSelectionListener() {						
						@Override
							public void valueChanged(ListSelectionEvent event) {
							if(!event.getValueIsAdjusting())
							lblNamestring.setText(list
									.getSelectedValue()
									.toString());
							lblChancesstring.setText(data
									.pokemonChanceModel()
									.getElementAt(list
											.getSelectedIndex())
									.toString());
							lblTimestring.setText(data
									.pokemonTimeModel()
									.getElementAt(list
											.getSelectedIndex())
									.toString());
							lblBuildstring.setText(data
									.pokemonBuildModel()
									.getElementAt(list
											.getSelectedIndex())
									.toString());
							lblGrassstring.setText(data
									.pokemonGrassModel()
									.getElementAt(list
											.getSelectedIndex())
									.toString());
							lblAistring.setText(data
									.pokemonAIModel()
									.getElementAt(list
											.getSelectedIndex())
									.toString());
							lblIdstring.setText(data
									.pokemonIDModel()
									.getElementAt(list
											.getSelectedIndex())
									.toString());;
							
						}
						
					});
					
				}	
				
			}					
		});	
		
		
		
		
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);		
		
	}	
	
	
	public void setfileOpenLocation(File Open) {
		this.Open = Open;
		System.out.println(Open);
		
	}		
	
	public String getfileOpenLocation() {		
						
		String OpenFileLocation = this.Open.toString();
		
		OpenFileLocation = OpenFileLocation.replace("\\", "\\\\");
				
		return OpenFileLocation;
	}
}
