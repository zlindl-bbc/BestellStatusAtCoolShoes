package ch.it.bzz.coolshoes.controller;

import java.awt.Component;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 * @author Lukas Aschmann
 * @date 2017-07-04
 * @version 1.0
 */
public class ComboBoxTableCellRenderer extends JComboBox<Object> implements TableCellRenderer {

  private static final long serialVersionUID = 1489589955869092721L;

  /**
   * Render's the combobox and get a Component back
   */
  @Override
  public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
      boolean hasFocus, int row, int column) {
    setSelectedItem(value);
    return this;
  }

}
