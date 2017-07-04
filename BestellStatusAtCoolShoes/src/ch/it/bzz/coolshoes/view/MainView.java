package ch.it.bzz.coolshoes.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MainView extends JFrame{
	
	Object rowData[][] = { { "Row1-Column1", "Row1-Column2", "Row1-Column3"},
			{ "Row2-Column1", "Row2-Column2", "Row2-Column3" } };
	Object columnNames[] = { "ColumnOne", "Column Two", "Column Three" };
	JTable table = new JTable(rowData, columnNames);
	 
//	public MainView(){
//		initGui();
//	}
	
	public void initGui(){
		JFrame frame = new JFrame();
		JScrollPane scrollPane = new JScrollPane(table);
		
		frame.add(scrollPane, BorderLayout.CENTER);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
	
	

}
