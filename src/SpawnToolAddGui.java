import javax.swing.JFrame;
import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JPanel;
import javax.swing.JList;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JCheckBox;

public class SpawnToolAddGui extends PokemonListData {

	public JFrame frame;
	private JTextField txtPokemonSearch;
	private JTextField txtName;
	private JTextField txtId;
	private JTextField txtChances;
	private JTextField txtGrass;
	private JTextField txtMove;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField txtLeveldown;
	private JTextField txtLevelup;

//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SpawnToolAddGui window = new SpawnToolAddGui();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
//
//	/**
//	 * Create the application.
//	 */
	public SpawnToolAddGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {				
				
				frame.dispose();
				
			}
			
		});
		
		JCheckBox chckbxGlobalAnnouncement = new JCheckBox("Global Announcement");
		
		
		//FOR POKEMON IMAGE
		ImageIcon keyImage = new ImageIcon(".\\src\\Assets\\data\\Images\\pokeball.png");    

		JLabel lblPokemonimage = new JLabel("PokemonImage");
		lblPokemonimage.getBaselineResizeBehavior();
		lblPokemonimage.setIcon(keyImage);
		
		JPanel panel = new JPanel();
		
		txtName = new JTextField();
		txtName.setText("Name");
		txtName.setColumns(10);
		
		txtId = new JTextField();
		txtId.setText("ID");
		txtId.setColumns(10);
		
		txtChances = new JTextField();
		txtChances.setText("Chances");
		txtChances.setColumns(10);
		//DropDown Box for AI options
		final JComboBox comboBoxAI = new JComboBox();
		String[] aiSet = {"StatChangingMoveGenerator","MostEffectiveMoveGenerator"};
		for(int i = 0 ; i < aiSet.length; i++) {
		comboBoxAI.addItem(aiSet[i]);
		}
		//comboBox for Build Options
		final JComboBox comboBoxBuild = new JComboBox();
		
		String[] buildSet = {"OP","BS"};
		for(int i = 0 ; i < buildSet.length; i++) {
			comboBoxBuild.addItem(buildSet[i]);
			}
		final JComboBox comboBox = new JComboBox();
		String[] timeSet = {"day","night"};
		for(int i = 0 ; i < timeSet.length; i++) {
			comboBox.addItem(timeSet[i]);
		}
		
		txtGrass = new JTextField();
		txtGrass.setText("Grass");
		txtGrass.setColumns(10);

		JButton btnAdd = new JButton("Add");
		

		txtLeveldown = new JTextField();
		txtLeveldown.setText("LevelDown");
		txtLeveldown.setColumns(10);
		
		txtLevelup = new JTextField();
		txtLevelup.setText("LevelUp");
		txtLevelup.setColumns(10);
		
		btnAdd.addActionListener(new ActionListener() {
			
			
			private String announcement;

			@Override
			public void actionPerformed(ActionEvent event) {				
				
				if(chckbxGlobalAnnouncement.isSelected()) {
					announcement = "true";
				}
				else {
					announcement = "false";
				}
				
				AddPokemon(txtName.getText(),
						txtId.getText(),
						txtChances.getText(),
						comboBoxAI.getSelectedItem().toString(),
						comboBoxBuild.getSelectedItem().toString(),
						txtGrass.getText(),
						this.announcement,
						comboBox.getSelectedItem().toString()
						);
				
				System.out.println(txtName.getText());
				System.out.println(txtId.getText());
				System.out.println(txtChances.getText());
				System.out.println(comboBoxAI.getSelectedItem().toString());
				System.out.println(comboBoxBuild.getSelectedItem().toString());
				System.out.println(txtGrass.getText());
				frame.dispose();
				
			}
			
		});
		
		
		txtMove = new JTextField();
		txtMove.setText("Move_1");
		txtMove.setColumns(10);
		
		textField = new JTextField();
		textField.setText("Move_2");
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("Move_3");
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setText("Move_4");
		textField_2.setColumns(10);
		
		JLabel lblInbattleMoves = new JLabel("In-Battle Moves");
		
		textField_3 = new JTextField();
		textField_3.setText("Move_1");
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setText("Move_2");
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setText("Move_3");
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setText("Move_4");
		textField_6.setColumns(10);
		
		JLabel lblCaughtmoves = new JLabel("Caught-Moves");
		
		JLabel lblPokemondata = new JLabel("Pokemon-Data");
		
		JLabel lblLevelRange = new JLabel("Level Range");
		
		
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblPokemonimage, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPokemondata)
								.addComponent(lblLevelRange)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblCaughtmoves)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(txtLeveldown)
										.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(txtLevelup)
										.addComponent(textField_6, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)))))
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnCancel))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
									.addGroup(groupLayout.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(txtChances))
											.addComponent(comboBoxAI, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(comboBoxBuild, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(txtGrass)
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(txtMove, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(textField, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
											.addGroup(groupLayout.createSequentialGroup()
												.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED)
												.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
											.addComponent(lblInbattleMoves)
											.addComponent(txtName, GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
											.addComponent(txtId)))
									.addGroup(groupLayout.createSequentialGroup()
										.addGap(40)
										.addComponent(chckbxGlobalAnnouncement))))))
					.addContainerGap(36, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(65)
									.addComponent(lblLevelRange)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtLeveldown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtLevelup, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblPokemondata))
								.addComponent(lblPokemonimage, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(10)
									.addComponent(txtId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtChances, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(comboBoxAI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(comboBoxBuild, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtGrass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(2)
									.addComponent(lblInbattleMoves)
									.addGap(2)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtMove, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(chckbxGlobalAnnouncement)
									.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnCancel)
										.addComponent(btnAdd)))
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblCaughtmoves)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		panel.setLayout(new BorderLayout(0, 0));
		
		PokemonListData data = new PokemonListData();
		DefaultListModel dbnameList = data.dbNameListModel();
		
		JLabel lblPokemons = new JLabel("Pokemons");
		panel.add(lblPokemons, BorderLayout.NORTH);
		
		txtPokemonSearch = new JTextField();
		txtPokemonSearch.setText("Search");
		
		panel.add(txtPokemonSearch, BorderLayout.SOUTH);
		txtPokemonSearch.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
	
		
		final JList list = new JList(dbnameList);
		scrollPane.setViewportView(list);
		
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		list.getInsets();
		list.setVisibleRowCount(-1);
		list.addListSelectionListener(new ListSelectionListener() {
			
			
			// Grab the last segment
				
		
			@Override
			public void valueChanged(ListSelectionEvent event) {
				if(!event.getValueIsAdjusting()) {
					int split = list.getSelectedValue().toString().indexOf(":");
					int end = list.getSelectedValue().toString().length();				
					
					if(split != -1) {
						txtId.setText(list.getSelectedValue().toString().substring(0, split));						
						txtName.setText(list.getSelectedValue().toString().substring(split+1, end));						
					}
					
				}
				
			}
			
		});
		
		frame.setTitle("Add Pokemon");
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 428, 530);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
	}

	protected void AddPokemon(String name, String id, String chances, String ai, String build, String grass, String announce,String time) {
		
		File path = PokemonReader.InputFile;	
		try {
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document document = dBuilder.parse(path);
		document.getDocumentElement().normalize();
		
		String RootElementName = document.getDocumentElement().getNodeName();
		
		if(RootElementName == "pokemons") {
			
			Node pokemons = document.getFirstChild();
			
			Element pokemon = document.createElement("pokemon");
			pokemons.appendChild(pokemon);		
			
			
			Attr nameAttr = document.createAttribute("name");
			nameAttr.setValue(name);
			pokemon.setAttributeNode(nameAttr);
			Attr idAttr = document.createAttribute("id") ;
			idAttr.setValue(id);
			pokemon.setAttributeNode(idAttr);
			Attr chancesAttr = document.createAttribute("chances");
			chancesAttr.setValue(chances);
			pokemon.setAttributeNode(chancesAttr);
			Attr aiAttr = document.createAttribute("ai");
			aiAttr.setValue(ai);
			pokemon.setAttributeNode(aiAttr);
			Attr buildAttr = document.createAttribute("build");
			buildAttr.setValue(build);
			pokemon.setAttributeNode(buildAttr);
			Attr grassAttr = document.createAttribute("grass"); 
			grassAttr.setValue(grass);
			pokemon.setAttributeNode(grassAttr);
			Attr timeAttr = document.createAttribute("time");
			timeAttr.setValue(time);
			
			if (announce == "true") {
				Attr announceAttr = document.createAttribute("announce");
				announceAttr.setValue("");
				pokemon.setAttributeNode(announceAttr);
			}
			
		}
		else {
			
			//return a error message file doesnt have root node of pokemons
			
		}
		
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
	    Transformer transformer = transformerFactory.newTransformer();
	    DOMSource source = new DOMSource(document);
	    StreamResult result = new StreamResult(new File(path.toString()));
	    transformer.transform(source, result);
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
