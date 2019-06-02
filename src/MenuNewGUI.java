import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MenuNewGUI extends PokemonReader {

	public JFrame frame;
	private JTextField textField;
	
 

	
	public MenuNewGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JButton btnCreate = new JButton("Create");
		springLayout.putConstraint(SpringLayout.SOUTH, btnCreate, -10, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnCreate, -10, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(btnCreate);
		
		btnCreate.addActionListener(new ActionListener( ) {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				CreateNewFile();		
				frame.dispose();
			}
			
		});
		
		JLabel lblSetfilename = new JLabel("SetFileName");
		frame.getContentPane().add(lblSetfilename);
		
		textField = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblSetfilename, 3, SpringLayout.NORTH, textField);
		springLayout.putConstraint(SpringLayout.EAST, lblSetfilename, -20, SpringLayout.WEST, textField);
		springLayout.putConstraint(SpringLayout.WEST, textField, 106, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, textField, -23, SpringLayout.NORTH, btnCreate);
		springLayout.putConstraint(SpringLayout.EAST, textField, -33, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCreateNewWild = new JLabel("Create New Wild Spawn XML File");
		springLayout.putConstraint(SpringLayout.SOUTH, lblCreateNewWild, -15, SpringLayout.NORTH, textField);
		springLayout.putConstraint(SpringLayout.EAST, lblCreateNewWild, -56, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(lblCreateNewWild);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 286, 164);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
		
		
		
	}
	
	private void CreateNewFile() {
		String path = ".\\src\\assets\\data\\spawnFiles\\"+textField.getText()+".xml";
		setInputFile(new File(path));
		  try {
			  
	            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
	 
	            DocumentBuilder documentBuilder  = documentFactory.newDocumentBuilder();
	            
	            Document document = documentBuilder.newDocument();					
	            
	            // root element
	            Element root = document.createElement("pokemons");
	            document.appendChild(root);
	            
	            TransformerFactory transformerFactory = TransformerFactory.newInstance();
	            Transformer transformer = transformerFactory.newTransformer();
	            DOMSource domSource = new DOMSource(document);
	            StreamResult streamResult = new StreamResult(new File(path));	
	            
	            try {
					transformer.transform(domSource, streamResult);
				} catch (TransformerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	            System.out.println("File Created at"+path);
	            
		 } catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}
}
