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
import java.util.Map.Entry;
import java.util.SortedMap;

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
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

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
	private JLabel lblItemDrop;
	private JTextField txtDropchance;
	private JCheckBox chckbxFishing;
	private JCheckBox chckbxNotcatchable;
	private JCheckBox chckbxCannotrun;
	private JCheckBox chckbxSrAnnouncement;

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
	
		JComboBox comboBox_1 = new JComboBox();
		PokemonDatabaseReader db = new PokemonDatabaseReader();
		SortedMap<String,String> Items = db.getItemMap();
		
		for(Entry<String, String> itemNames : Items.entrySet())
		{
			System.out.println("hello");
			System.out.println("itemvalues : "+itemNames.getValue());
			comboBox_1.addItem(itemNames.getValue());			
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
		
		
		
		
		
		txtDropchance = new JTextField();
		txtDropchance.setText("dropChance");
		txtDropchance.setColumns(10);
		
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
		
		
		
		btnAdd.addActionListener(new ActionListener() {
			
			
			
			private String announcement;

			@Override
			public void actionPerformed(ActionEvent event) {				
				String ItemID = "false";
				
				
				
				for(Entry<String, String> itemNames : Items.entrySet())
				{
					
					if(comboBox_1.getSelectedItem().equals(itemNames.getValue())) {
						ItemID = itemNames.getKey();
					}
					
				}				
				
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
						textField_2.getText(),
						txtDropchance.getText(),
						ItemID,
						textField_3.getText(),
						textField_4.getText(),
						textField_5.getText(),
						textField_6.getText(),
						txtLevel.getText(),
						txtLevel_1.getText(),
						txtLevel_2.getText(),
						txtLevel_3.getText()
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
		
		
		
		JLabel lblCaughtmoves = new JLabel("Caught-Moves");
		
		JLabel lblPokemondata = new JLabel("Pokemon-Data");
		
		JLabel lblLevelRange = new JLabel("Pokemon Level Range");
		
		
		lblItemDrop = new JLabel("Item Drop");
		
		JCheckBox chckbxHoney = new JCheckBox("Honey");
		
		chckbxFishing = new JCheckBox("Fishing");
		
		chckbxNotcatchable = new JCheckBox("notCatchable");
		
		chckbxCannotrun = new JCheckBox("cannotRun");
		
		chckbxSrAnnouncement = new JCheckBox("SR announcement");
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
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(172)
							.addComponent(lblCaughtmoves))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(10)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPokemondata)
								.addComponent(txtId, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtName, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
									.addComponent(txtChances, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
								.addComponent(comboBoxAI, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBoxBuild, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtGrass, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(5)
									.addComponent(lblInbattleMoves))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(txtMove, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblItemDrop)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(172)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(172)
							.addComponent(txtDropchance, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(401)
							.addComponent(btnAdd, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(btnCancel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(10)
									.addComponent(lblPokemonimage, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
									.addGap(6)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(10)
											.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblLevelRange)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(txtLevelup, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
											.addComponent(txtLeveldown, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
										.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(txtLevel)
												.addComponent(txtLevel_2))
											.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addGroup(groupLayout.createSequentialGroup()
													.addGap(10)
													.addComponent(txtLevel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
													.addGap(10)
													.addComponent(txtLevel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(172)
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(10)
									.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(25)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxGlobalAnnouncement)
								.addComponent(chckbxHoney, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
								.addComponent(chckbxFishing)
								.addComponent(chckbxNotcatchable)
								.addComponent(chckbxCannotrun)
								.addComponent(chckbxSrAnnouncement))))
					.addGap(68))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(11)
					.addComponent(lblCaughtmoves)
					.addGap(6)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(chckbxGlobalAnnouncement)))
					.addGap(5)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPokemonimage, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(1)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(41)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtLevel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtLevel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtLevel_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtLevel_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addComponent(lblLevelRange)
							.addGap(6)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtLevelup, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtLeveldown, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(chckbxHoney)
							.addGap(5)
							.addComponent(chckbxFishing)
							.addGap(3)
							.addComponent(chckbxNotcatchable)
							.addGap(3)
							.addComponent(chckbxCannotrun)
							.addGap(3)
							.addComponent(chckbxSrAnnouncement)))
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblPokemondata)
							.addGap(6)
							.addComponent(txtId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(1)
									.addComponent(txtChances, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(11)
							.addComponent(comboBoxAI, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(comboBoxBuild, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(txtGrass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(3)
							.addComponent(lblInbattleMoves)
							.addGap(3)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(txtMove, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(11)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addComponent(lblItemDrop)))
					.addGap(3)
					.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(txtDropchance, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAdd)
						.addComponent(btnCancel)))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 623, 659);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setResizable(false);
	}

	protected void AddPokemon(String name, String id, String chances, String ai, String build, String grass, String announce,String time,String levelDown,String levelUp,String Move1,String Move2, String Move3,String Move4,String dropChance,String itemID,String caughtMove1,String caughtMove2,String caughtMove3,String caughtMove4,String caughtLevel1,String caughtLevel2,String caughtLevel3,String caughtLevel4) {
		
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
			
			
			
			Element dropChances = document.createElement("drop");
			pokemon.appendChild(dropChances);
			
			Attr dropchancesAttr  = document.createAttribute("chances");
			dropchancesAttr.setValue(dropChance);
			dropChances.setAttributeNode(dropchancesAttr);
			Attr  itemIDAttr = document.createAttribute("id");
			itemIDAttr.setValue(itemID);
			dropChances.setAttributeNode(itemIDAttr);
						
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
			
			Element caughtMoves = document.createElement("caught-moves");
			pokemon.appendChild(caughtMoves);
			
			Element caughtMove1Ele = document.createElement("move");
			caughtMoves.appendChild(caughtMove1Ele);
			Element caughtMove2Ele = document.createElement("move");
			caughtMoves.appendChild(caughtMove2Ele);
			Element caughtMove3Ele = document.createElement("move");
			caughtMoves.appendChild(caughtMove3Ele);
			Element caughtMove4Ele = document.createElement("move");
			caughtMoves.appendChild(caughtMove4Ele);
			
					
				if(caughtMove1 != "Move_1") {
				Attr caughtMove1Attr = document.createAttribute("name");
				caughtMove1Attr.setValue(Move1);
				caughtMove1Ele.setAttributeNode(caughtMove1Attr);				
					if(caughtLevel1 != "Level_1") {
						Attr caughtLevel1Attr = document.createAttribute("level");
						caughtLevel1Attr.setValue(caughtLevel1);
						caughtMove1Ele.setAttributeNode(caughtLevel1Attr);			
					}
				}
				if(caughtMove2 != "Move_2") {
				Attr caughtMove2Attr = document.createAttribute("name");
				caughtMove2Attr.setValue(caughtMove2);
				caughtMove2Ele.setAttributeNode(caughtMove2Attr);
					if(caughtLevel2 != "Level_2") {
						Attr caughtLevel2Attr = document.createAttribute("level");
						caughtLevel2Attr.setValue(caughtLevel2);
						caughtMove2Ele.setAttributeNode(caughtLevel2Attr);		
					}
				}
				if(caughtMove3 != "Move_3") {
				Attr caughtMove3Attr = document.createAttribute("name");
				caughtMove3Attr.setValue(caughtMove3);
				caughtMove3Ele.setAttributeNode(caughtMove3Attr);
				if(caughtLevel3 != "Level_3") {
					Attr caughtLevel3Attr = document.createAttribute("level");
					caughtLevel3Attr.setValue(caughtLevel3);
					caughtMove3Ele.setAttributeNode(caughtLevel3Attr);		
				}
				}
				if(caughtMove4 != "Move_4") {
				Attr caughtMove4Attr = document.createAttribute("name");
				caughtMove4Attr.setValue(Move4);
				caughtMove4Ele.setAttributeNode(caughtMove4Attr);
				if(caughtLevel3 != "Level_4") {
					Attr caughtLevel4Attr = document.createAttribute("level");
					caughtLevel4Attr.setValue(caughtLevel4);
					caughtMove4Ele.setAttributeNode(caughtLevel4Attr);		
				}				
			}		
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
