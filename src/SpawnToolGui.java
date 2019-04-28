import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class SpawnToolGui  {

	JFrame frame;
	
	public static File openFile;
	
	public static JButton btnSave = new JButton("Save");

	public static JScrollPane scrollPane = new JScrollPane();
	
	public static JProgressBar progressBar = new JProgressBar();
	
	public static JProgressBar progressBar_1 = new JProgressBar();
	
	public static JProgressBar progressBar_2 = new JProgressBar();
	
	public static JProgressBar progressBar_3 = new JProgressBar();
	
	public static JProgressBar progressBar_4 = new JProgressBar();
	
	public static JProgressBar progressBar_5 = new JProgressBar();

	public static String filename;
	
	public static JFileChooser fc = new JFileChooser();
	
	public static File Open ;	
	
	public static String ID = "ID_String";
	
	
	public SpawnToolGui() {
		initialize();
	}

	@SuppressWarnings("null")
	private void initialize()  {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		
		JButton btnEdit = new JButton("Edit");
		
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
		
		JButton btnAdd = new JButton("Add");
		
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
		
		JLabel lblPokemon = new JLabel("Pokemon");
		
		JLabel lblHp = new JLabel("HP");
		
		JLabel lblAttack = new JLabel("Attack");
		
		JLabel lblDefense = new JLabel("Defense");
		
		JLabel lblSpdef = new JLabel("SpDef");
		
		JLabel lblSpatk = new JLabel("SpAtk");
		
		JLabel lblSpeed = new JLabel("Speed");
		
		JLabel lblId = new JLabel("ID");
		
		JLabel lblRate = new JLabel("Rate");
		
		JLabel lblTime = new JLabel("Time");
		
		JLabel lblAiType = new JLabel("AI Type");
		
		JLabel lblName = new JLabel("Name");
		
		
		
		JLabel lblIdstring = new JLabel(ID);
		
		JLabel lblNamestring = new JLabel("Name_String");
		
		JLabel lblRatestring = new JLabel("Rate_String");
		
		JLabel lblTimestring = new JLabel("Time_String");
		
		JLabel lblAitypestring = new JLabel("AI_TypeString");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPokemon, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(progressBar_5, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
								.addComponent(progressBar_4, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(127)
									.addComponent(btnSave)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnEdit)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnAdd, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(58)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblHp)
										.addComponent(lblAiType)
										.addComponent(lblTime)
										.addComponent(lblRate)
										.addComponent(lblName)
										.addComponent(lblId))
									.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblAitypestring)
										.addComponent(lblTimestring)
										.addComponent(lblRatestring)
										.addComponent(lblNamestring)
										.addComponent(lblIdstring)
										.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblAttack)
									.addPreferredGap(ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
									.addComponent(progressBar_1, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblDefense)
									.addPreferredGap(ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
									.addComponent(progressBar_2, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblSpdef)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
											.addComponent(lblSpeed)
											.addComponent(lblSpatk)))
									.addPreferredGap(ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
									.addComponent(progressBar_3, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)))))
					.addGap(42))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(43)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblPokemon, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
							.addGap(26)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE)
							.addGap(7))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblId)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblName)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblRate)
									.addGap(11)
									.addComponent(lblTime)
									.addGap(17)
									.addComponent(lblAiType))
								.addGroup(groupLayout.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblIdstring)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblNamestring)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblRatestring)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblTimestring)
									.addGap(18)
									.addComponent(lblAitypestring)))
							.addGap(60)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(progressBar, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblHp, Alignment.TRAILING))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(progressBar_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAttack))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(progressBar_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDefense))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(progressBar_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSpdef))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(progressBar_4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSpatk))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(progressBar_5, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSpeed))
							.addGap(35)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnAdd)
								.addComponent(btnEdit)
								.addComponent(btnSave))))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		//Action for Getting the file location
		JMenuItem mntmOpen = new JMenuItem("Open");
		mnFile.add(mntmOpen);
		mntmOpen.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {		
				
				OpenMenuActionListener OpenMenuActions = new OpenMenuActionListener();
				
				fc.setCurrentDirectory(new java.io.File(".\\src\\assets\\data\\spawnFiles"));
				fc.setDialogTitle("choosertitle");
				fc.setAcceptAllFileFilterUsed(true);

				if (fc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
				  System.out.println("Selected File : " + fc.getSelectedFile());
				  Open = fc.getSelectedFile();

				} else {
				  System.out.println("No Selection ");
				}	
				
				setfileOpenLocation(Open);					
			}					
		});	
		
		// Added name list pokemonListData now i need to find out why its printing 0 in SpawnToolGui also check if names a still being added to PokemonListData



		
		JList<String> list = new JList<String>();
		list = new JList<String>();
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		list.setVisibleRowCount(-1);
		list.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				// TODO Auto-generated method stub
				
			}}
		);
		
		scrollPane.setViewportView(list);
		
		JLabel lblPokemons = new JLabel("Pokemons");
		scrollPane.setColumnHeaderView(lblPokemons);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 544, 596);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		
		mnFile.add(mntmExit);
		
		mntmExit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			}			
		});		
	}
	
	public void setfileOpenLocation(File Open) {
		SpawnToolGui.Open = Open;
		System.out.println(Open);
		
	}		
	
	public String getfileOpenLocation() {		
		
		System.out.println("in getFileOpen"+SpawnToolGui.Open);
		
		String OpenFileLocation = SpawnToolGui.Open.toString();
		
		OpenFileLocation = OpenFileLocation.replace("\\", "\\\\");
		
		
		System.out.println("OpenFileLocation : " + OpenFileLocation);		
		
		return OpenFileLocation;
	}
}


