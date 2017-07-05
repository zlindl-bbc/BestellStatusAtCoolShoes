package ch.it.bzz.coolshoes.view;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import ch.it.bzz.coolshoes.view.ButtonRenderer;
import ch.it.bzz.coolshoes.view.ButtonEditor;
import ch.it.bzz.coolshoes.view.ComboBoxTableCellRenderer;;

public class MainView extends JFrame {

	public MainView() {
		super("JButtonTable Example");

		DefaultTableModel dm = new DefaultTableModel();
		dm.setDataVector(new Object[][] { { "split", "foo" }, { "split", "bar" } },
				new Object[] { "Button", "String" });

		JTable table = new JTable(new TableModel());
//		table.getColumn("Button").setCellRenderer(new ButtonRenderer());
//		table.getColumn("Button").setCellEditor(new ButtonEditor(new JCheckBox()));
		JScrollPane scroll = new JScrollPane(table);
		getContentPane().add(scroll);
		setSize(400, 300);
		setVisible(false);
	}

	public void initGUI() {

		MainView Mainframe = new MainView();
		Mainframe.setVisible(true);
	}

	public void setUpStatusColumn(JTable table, TableColumn statusColumn) {
		// Set up the editor for the sport cells.
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Bestellt");
		comboBox.addItem("In Bearbeitung");
		comboBox.addItem("Bereit f�r Lieferung");
		comboBox.addItem("Lieferung");
		comboBox.addItem("Abgeschlossen");
		comboBox.addItem("None of the above");
		statusColumn.setCellEditor(new DefaultCellEditor(comboBox));

		// Set up tool tips for the sport cells.
		DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
		renderer.setToolTipText("Click for combo box");
		statusColumn.setCellRenderer(renderer);
	}
}