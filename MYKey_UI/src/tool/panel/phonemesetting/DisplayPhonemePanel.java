package tool.panel.phonemesetting;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

import tool.manager.MYKeyManager;


public class DisplayPhonemePanel extends JPanel {
	private JLabel phonemeLabel;
	private JInternalFrame parent;
	
	public DisplayPhonemePanel(JInternalFrame parent){
		this.parent = parent;
		Dimension tmpDi = parent.getPreferredSize();
		int width = (int) (tmpDi.getWidth());
		int height = (int) (tmpDi.getHeight()/6);
		setPreferredSize(new Dimension(width, height));
		
		setLayout(new GridLayout(1,3));
		
		
		phonemeLabel = new JLabel();
		Font ft = new Font("?��?��고딕", Font.PLAIN, 30);
		phonemeLabel.setFont(ft);
		phonemeLabel.setOpaque(true);
		phonemeLabel.setBackground(Color.white);
		phonemeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		TitledBorder topBorder = BorderFactory.createTitledBorder("Phoneme");
		topBorder.setTitlePosition(TitledBorder.TOP);
		TitledBorder doubleBorder = new TitledBorder(topBorder, "Selected", TitledBorder.RIGHT , TitledBorder.BOTTOM);
		phonemeLabel.setBorder(doubleBorder);
		phonemeLabel.setOpaque(false);
		
		MYKeyManager.getManager().setDisplayPhonemePanel(this);
		
		this.add(phonemeLabel);
		this.add(new JLabel());				//Dummy1
		this.add(new JLabel());				//Dummy2
		this.setOpaque(false);
	}
	
	
	
	public void setText(String text){
		phonemeLabel.setText(text);
	}
	
	public void initText(){
		phonemeLabel.setText("");
	}
	
}