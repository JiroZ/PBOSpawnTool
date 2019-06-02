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
	private JTextField txtLevel;
	private JTextField txtLevel_1;
	private JTextField txtLevel_2;
	private JTextField txtLevel_3;

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
						comboBox.getSelectedItem().toString(),
						txtLeveldown.getText(),
						txtLevelup.getText(),
						txtMove.getText(),
						textField.getText(),
						textField_1.getText(),
						textField_2.getText()
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
		
		JLabel lblLevelRange = new JLabel("Pokemon Level Range");
		
		txtLevel = new JTextField();
		txtLevel.setText("Level_1");
		txtLevel.setColumns(10);
		
		txtLevel_1 = new JTextField();
		txtLevel_1.setText("Level_2");
		txtLevel_1.setColumns(10);
		
		txtLevel_2 = new JTextField();
		txtLevel_2.setText("Level_3");
		txtLevel_2.setColumns(10);
		
		txtLevel_3 = new JTextField();
		txtLevel_3.setText("Level_4");
		txtLevel_3.setColumns(10);
		
		
		
		
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblPokemonimage, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblCaughtmoves)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(textField_5, Alignment.LEADING)
										.addComponent(textField_3, Alignment.LEADING))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textField_4)
										.addComponent(textField_6)))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(4)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblLevelRange)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(txtLevelup, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(txtLeveldown, 99, 99, 99))))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(txtLevel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtLevel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(txtLevel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtLevel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
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
									.addComponent(txtId)
									.addComponent(lblPokemondata)))
							.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(chckbxGlobalAnnouncement)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnCancel)))
								.addPreferredGap(ComponentPlacement.RELATED))))
					.addGap(75))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap(23, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(49)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtLevel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtLevel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtLevel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtLevel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblLevelRange)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtLevelup, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(txtLeveldown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addComponent(lblPokemonimage, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblPokemondata)
									.addPreferredGap(ComponentPlacement.RELATED)
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
									.addGap(18)
									.addComponent(chckbxGlobalAnnouncement)
									.addPreferredGap(ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnAdd)
										.addComponent(btnCancel)))
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
		frame.setBounds(100, 100, 454, 611);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
	}

	protected void AddPokemon(String name, String id, String chances, String ai, String build, String grass, String announce,String time,String levelDown,String levelUp,String Move1,String Move2, String Move3,String Move4) {
		
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
			
			Element stats = document.createElement("stats");
			pokemon.appendChild(stats);
			
			Attr levelDownAttr = document.createAttribute("levelDown");
			levelDownAttr.setValue(levelDown);
			stats.setAttributeNode(levelDownAttr);
			Attr levelUpAttr = document.createAttribute("levelUp");
			levelUpAttr.setValue(levelUp);			
			stats.setAttributeNode(levelUpAttr);
			
			Element moves = document.createElement("moves");
			pokemon.appendChild(moves);
			
			Element move1 = document.createElement("move");
			moves.appendChild(move1);
			Element move2 = document.createElement("move");
			moves.appendChild(move2);
			Element move3 = document.createElement("move");
			moves.appendChild(move3);
			Element move4 = document.createElement("move");
			moves.appendChild(move4);
						
			if(Move1 != "Move_1") {
			Attr move1Attr = document.createAttribute("name");
			move1Attr.setValue(Move1);
			move1.setAttributeNode(move1Attr);}
			if(Move2 != "Move_2") {
			Attr move2Attr = document.createAttribute("name");
			move2Attr.setValue(Move2);
			move2.setAttributeNode(move2Attr);}
			if(Move3 != "Move_3") {
			Attr move3Attr = document.createAttribute("name");
			move3Attr.setValue(Move3);
			move3.setAttributeNode(move3Attr);}
			if(Move4 != "Move_4") {
			Attr move4Attr = document.createAttribute("name");
			move4Attr.setValue(Move4);
			move4.setAttributeNode(move4Attr);}
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
