/*package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Formatter;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.FriendDao;
import test.dto.FriendDto;

public class FriendFrame extends JFrame implements ActionListener, PropertyChangeListener{
		
	JTextField inputName, inputPhone, inputBirth;
	DefaultTableModel model;
	JTable table;
	
	public FriendFrame() {
		setLayout(new BorderLayout());
		
		JLabel label1=new JLabel("이름");
	    inputName=new JTextField(10);
	      
	    JLabel label2=new JLabel("전화번호");
	    inputPhone=new JTextField(15);
	    
	    JLabel label3=new JLabel("생일");
	    inputBirth=new JTextField(15);
	      
	    JButton saveBtn=new JButton("저장");
	    saveBtn.setActionCommand("save");
	    
	    JButton deleteBtn=new JButton("삭제");
	    deleteBtn.setActionCommand("delete");
	    
	    JPanel panel=new JPanel();
	    panel.add(label1);
	    panel.add(inputName);
	    panel.add(label2);
	    panel.add(inputPhone);
	    panel.add(label3);
	    panel.add(inputBirth);
	    panel.add(saveBtn);
	    panel.add(deleteBtn);

	    add(panel, BorderLayout.NORTH);
	    
	    table=new JTable();

	    String[] colNames= {"번호", "이름", "전화번호", "생일"};

	    model=new DefaultTableModel(colNames, 0) {
	    	@Override
	    	public boolean isCellEditable(int row, int column) {
	    	
	    		if(column==0) {
	    			return false;
	    		}else { 
	    			return true;
	    		}
	    	}
	    };
	    
	    
	    table.setModel(model);
	    
	    JScrollPane scroll=new JScrollPane(table);
	    
	    add(scroll, BorderLayout.CENTER);
	    
	    saveBtn.addActionListener(this);
	    deleteBtn.addActionListener(this);
	    
	    displayFriend();
	    
	    table.addPropertyChangeListener(this);	    
	}
	//테이블에 친구목록 출력메소드
	public void displayFriend() {
		model.setRowCount(0);
		
		List<FriendDto> list=new FriendDao().getList();
		for(FriendDto tmp:list) {
			Object[] row= {tmp.getNum(),tmp.getName(),tmp.getPhone(),tmp.getBirth()};
			
			model.addRow(row);
		}
	}
	
	public static void main(String[] args) {
		FriendFrame f=new FriendFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 800, 500);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command=e.getActionCommand();
		//SimpleDateFormat formatter= new SimpleDateFormat("yyyy년 MM월 dd일");
		if(command.equals("save")) {
			String name=inputName.getText();
			String phone=inputPhone.getText();
			String birth=inputBirth.getText();
			FriendDto dto=new FriendDto();
			dto.setName(name);
			dto.setPhone(phone);
			dto.setBirth(birth);
			boolean isSuccess = new FriendDao().insert(dto);
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, name+" 의 정보를 추가했습니다.");
				displayFriend();
			}else {
				JOptionPane.showMessageDialog(this, "실패 했습니다.");
			}
		}else if(command.equals("delete")) {
			int rowIndex=table.getSelectedRow();
			if(rowIndex == -1) {
				JOptionPane.showMessageDialog(this, "삭제할 row를 선택하세요.");
				return;
			}
			
			int result=JOptionPane.showConfirmDialog(this, "선택된 row 를 삭제 하시겠습니까?");
			if(result == JOptionPane.YES_OPTION) {
				
				int num=(int)model.getValueAt(rowIndex, 0);
				
				new FriendDao().delete(num);
				
				displayFriend();
			}
		}
		
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		System.out.println("property chane!");
		System.out.println("property name:"+evt.getPropertyName());
		
		System.out.println("isEditing:"+table.isEditing());
		
		
		if(evt.getPropertyName().equals("tableCellEditor") && table.isEditing()) {
			
			int selectedIndex = table.getSelectedRow();
			int num=(int)model.getValueAt(selectedIndex, 0);
			String name=(String)model.getValueAt(selectedIndex, 1);
			String phone=(String)model.getValueAt(selectedIndex, 2);
			String birth=(String)model.getValueAt(selectedIndex, 3);
			
			FriendDto dto=new FriendDto(num, name, phone, birth);
			
			new FriendDao().update(dto);
			
			table.clearSelection();
		}
	}
}
*/
