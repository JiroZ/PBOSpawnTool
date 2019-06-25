import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class SpawnToolEditGui {

	public JFrame frame;
	private JTextField txtMove;
	private JTextField txtMove_1;
	private JTextField txtLevel;
	private JTextField txtLevel_1;
	private JTextField txtMove_2;
	private JTextField txtMove_3;
	private JTextField txtLevel_2;
	private JTextField txtLevel_3;
	private JTextField txtLeveldown;
	private JTextField txtLevelup;
	private JTextField txtId;
	private JTextField txtName;
	private JTextField txtChances;
	private JTextField txtGrass;
	private JTextField txtMove_4;
	private JTextField txtMove_5;
	private JTextField txtMove_6;
	private JTextField txtMove_7;
	private JTextField txtDropchance;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SpawnToolEditGui window = new SpawnToolEditGui();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public SpawnToolEditGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCaughtmoves = new JLabel("Caught-Moves");
		lblCaughtmoves.setBounds(10, 11, 102, 14);
		frame.getContentPane().add(lblCaughtmoves);
		
		txtMove = new JTextField();
		txtMove.setText("Move_1");
		txtMove.setBounds(10, 36, 86, 20);
		frame.getContentPane().add(txtMove);
		txtMove.setColumns(10);
		
		txtMove_1 = new JTextField();
		txtMove_1.setText("Move_2");
		txtMove_1.setBounds(106, 36, 86, 20);
		frame.getContentPane().add(txtMove_1);
		txtMove_1.setColumns(10);
		
		txtLevel = new JTextField();
		txtLevel.setText("Level_1");
		txtLevel.setBounds(10, 67, 86, 20);
		frame.getContentPane().add(txtLevel);
		txtLevel.setColumns(10);
		
		txtLevel_1 = new JTextField();
		txtLevel_1.setText("Level_2");
		txtLevel_1.setBounds(106, 67, 86, 20);
		frame.getContentPane().add(txtLevel_1);
		txtLevel_1.setColumns(10);
		
		txtMove_2 = new JTextField();
		txtMove_2.setText("Move_3");
		txtMove_2.setBounds(10, 98, 86, 20);
		frame.getContentPane().add(txtMove_2);
		txtMove_2.setColumns(10);
		
		txtMove_3 = new JTextField();
		txtMove_3.setText("Move_4");
		txtMove_3.setBounds(106, 98, 86, 20);
		frame.getContentPane().add(txtMove_3);
		txtMove_3.setColumns(10);
		
		txtLevel_2 = new JTextField();
		txtLevel_2.setText("Level_3");
		txtLevel_2.setBounds(10, 129, 86, 20);
		frame.getContentPane().add(txtLevel_2);
		txtLevel_2.setColumns(10);
		
		txtLevel_3 = new JTextField();
		txtLevel_3.setText("Level_4");
		txtLevel_3.setBounds(106, 129, 86, 20);
		frame.getContentPane().add(txtLevel_3);
		txtLevel_3.setColumns(10);
		
		JCheckBox chckbxGlobalAnnouncement = new JCheckBox("Global Announcement");
		chckbxGlobalAnnouncement.setBounds(198, 35, 146, 23);
		frame.getContentPane().add(chckbxGlobalAnnouncement);
		
		JCheckBox chckbxHoney = new JCheckBox("Honey");
		chckbxHoney.setBounds(198, 66, 146, 23);
		frame.getContentPane().add(chckbxHoney);
		
		JCheckBox chckbxFishing = new JCheckBox("Fishing");
		chckbxFishing.setBounds(198, 97, 146, 23);
		frame.getContentPane().add(chckbxFishing);
		
		JCheckBox chckbxNotcatchable = new JCheckBox("notCatchable");
		chckbxNotcatchable.setBounds(198, 128, 146, 23);
		frame.getContentPane().add(chckbxNotcatchable);
		
		JCheckBox chckbxCannotrun = new JCheckBox("cannotRun");
		chckbxCannotrun.setBounds(346, 35, 115, 23);
		frame.getContentPane().add(chckbxCannotrun);
		
		JCheckBox chckbxSrAnnoucement = new JCheckBox("SR Annoucement");
		chckbxSrAnnoucement.setBounds(346, 66, 115, 23);
		frame.getContentPane().add(chckbxSrAnnoucement);
		
		JLabel lblLevelrange = new JLabel("Level-Range");
		lblLevelrange.setBounds(10, 160, 86, 14);
		frame.getContentPane().add(lblLevelrange);
		
		txtLeveldown = new JTextField();
		txtLeveldown.setText("Level_down");
		txtLeveldown.setBounds(10, 181, 86, 20);
		frame.getContentPane().add(txtLeveldown);
		txtLeveldown.setColumns(10);
		
		txtLevelup = new JTextField();
		txtLevelup.setText("Level_up");
		txtLevelup.setBounds(106, 181, 86, 20);
		frame.getContentPane().add(txtLevelup);
		txtLevelup.setColumns(10);
		
		JLabel lblPokemondata = new JLabel("Pokemon-Data");
		lblPokemondata.setBounds(10, 212, 86, 14);
		frame.getContentPane().add(lblPokemondata);
		
		txtId = new JTextField();
		txtId.setText("ID");
		txtId.setBounds(10, 237, 86, 20);
		frame.getContentPane().add(txtId);
		txtId.setColumns(10);
		
		txtName = new JTextField();
		txtName.setText("Name");
		txtName.setBounds(106, 237, 86, 20);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 268, 86, 22);
		frame.getContentPane().add(comboBox);
		
		txtChances = new JTextField();
		txtChances.setText("Chances");
		txtChances.setBounds(106, 269, 86, 20);
		frame.getContentPane().add(txtChances);
		txtChances.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(10, 301, 182, 22);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(10, 334, 182, 22);
		frame.getContentPane().add(comboBox_2);
		
		txtGrass = new JTextField();
		txtGrass.setText("Grass");
		txtGrass.setBounds(10, 367, 86, 20);
		frame.getContentPane().add(txtGrass);
		txtGrass.setColumns(10);
		
		JLabel lblInbattleMoves = new JLabel("In-Battle Moves");
		lblInbattleMoves.setBounds(10, 398, 86, 14);
		frame.getContentPane().add(lblInbattleMoves);
		
		txtMove_4 = new JTextField();
		txtMove_4.setText("Move_1");
		txtMove_4.setBounds(10, 423, 86, 20);
		frame.getContentPane().add(txtMove_4);
		txtMove_4.setColumns(10);
		
		txtMove_5 = new JTextField();
		txtMove_5.setText("Move_2");
		txtMove_5.setBounds(106, 423, 86, 20);
		frame.getContentPane().add(txtMove_5);
		txtMove_5.setColumns(10);
		
		txtMove_6 = new JTextField();
		txtMove_6.setText("Move_3");
		txtMove_6.setBounds(10, 454, 86, 20);
		frame.getContentPane().add(txtMove_6);
		txtMove_6.setColumns(10);
		
		txtMove_7 = new JTextField();
		txtMove_7.setText("Move_4");
		txtMove_7.setBounds(106, 454, 86, 20);
		frame.getContentPane().add(txtMove_7);
		txtMove_7.setColumns(10);
		
		JLabel lblItemdrop = new JLabel("Item-Drop");
		lblItemdrop.setBounds(10, 485, 72, 14);
		frame.getContentPane().add(lblItemdrop);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(10, 510, 182, 22);
		frame.getContentPane().add(comboBox_3);
		
		txtDropchance = new JTextField();
		txtDropchance.setText("Drop_Chance");
		txtDropchance.setBounds(10, 543, 86, 20);
		frame.getContentPane().add(txtDropchance);
		txtDropchance.setColumns(10);
		frame.setBounds(100, 100, 483, 642);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
