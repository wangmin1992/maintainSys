package com.zillion.gui.utils;

import java.util.Vector;

import javax.swing.table.AbstractTableModel;

/**
 * 自定义TableModul工具类。
 * @author wangmin
 * @since 2017年6月24日-上午9:47:36
 * @version V1.0
 *
 */
public class BaseTableModel extends AbstractTableModel{

	private static final long serialVersionUID = 1L;

	/**定义行*/
	@SuppressWarnings("rawtypes")
	Vector<Vector> rows;
	/**定义列*/
	Vector<String> colums;
	
	/**
	 * 无参构造函数。
	 */
	public BaseTableModel() {
		
	}
	
	/**
	 * 有参构造函数，初始化定义的行与列。
	 * @param params
	 * @param vector
	 */
	@SuppressWarnings("rawtypes")
	public BaseTableModel(String[] params, Vector<Vector> vector){
		this.rows = vector;
		this.colums = new Vector<String>();
		for (String param : params){
			colums.add(param);
		}
	}
	
	@Override
	public String getColumnName(int column) {
		return this.colums.get(column);
	}
	
	@Override
	public int getRowCount() {
		return this.rows.size();
	}

	@Override
	public int getColumnCount() {
		return this.colums.size();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Vector<Vector> v = rows.get(rowIndex);
		return v.get(columnIndex);
	}

}
