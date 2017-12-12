package kr.jaen.cms;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
/** AWT �� �̿��Ͽ� �ּҷϿ� ���/����/���� ����� ������ ����.*/

public class CustomerMain implements ActionListener,ItemListener{
	Frame f=new Frame("Address Book");
	Label custl=new Label("Address Book",Label.CENTER);
	Label numl=new Label("�� ȣ",Label.CENTER);
	Label namel=new Label("��  ��",Label.CENTER);
	Label addressl=new Label("�� ��",Label.CENTER);
	Button insertb=new Button("INSERT");
	Button deleteb=new Button("DELETE");
	Button updateb=new Button("UPDATE");
	Button searchb=new Button("SEARCH");
	Button clearb=new Button("CLEAR");
	Button exitb=new Button("EXIT");
	List li=new List();
	TextField numtf=new TextField();
	TextField nametf=new TextField();
	TextField addresstf=new TextField();
	Panel p1=new Panel();
	Panel p2=new Panel();
	Panel p2n=new Panel();
	Panel p2c=new Panel();
	Panel p2s=new Panel();
	CustomerDAO dao;
	MessageDialog md;
	public CustomerMain(){
		dao=new CustomerDAO();
		md=new MessageDialog(f,"��  ��");//Dialog ����(owner,title)
		createGUI();
		addEvent();
		showList();
	}
/** GUI �� �����Ѵ�.*/
	public void createGUI(){
		f.setLayout(new GridLayout(2,1,5,5));
		p1.setLayout(new BorderLayout());
		p2.setLayout(new BorderLayout());

		p1.add(custl,BorderLayout.NORTH);
		p1.add(li);

		p2n.add(insertb);
		p2n.add(deleteb);
		p2n.add(updateb);
		p2n.add(searchb);

		p2c.setLayout(new GridLayout(3,2,5,7));
		p2c.add(numl);
		p2c.add(numtf);
		p2c.add(namel);
		p2c.add(nametf);
		p2c.add(addressl);
		p2c.add(addresstf);
		
		p2s.add(clearb);
		p2s.add(exitb);

		p2.add(p2n,"North");
		p2.add(p2c);
		p2.add(p2s,"South");

		f.add(p1);
		f.add(p2);
		
		f.setSize(350,350);
		f.setVisible(true);
	}
/** �̺�Ʈ�� ��� �Ǵ� ó���Ѵ�. */
	public void addEvent(){

		f.addWindowListener(new WindowAdapter(){  // ȭ�� x��ư Ŭ���� ���α׷� ���� �̺�Ʈ ó��
			public void windowClosing(WindowEvent e){
							dao.close();
							System.exit(0);
			} 
		});
		insertb.addActionListener(this);  //insert ��ư Ŭ���� �Ʒ� this.actionPerformed()�� ȣ���Ѵ�.
		deleteb.addActionListener(this);
		updateb.addActionListener(this);
		searchb.addActionListener(this);
		clearb.addActionListener(this);
		exitb.addActionListener(this);
		li.addItemListener(this);	
	}
/** ��ư�� �����ų� Ŭ���Ǿ� ActionEvent�� �߻����� �� ����ȴ�. 
ActionListener �� actionPerformed method Overrinding*/
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==insertb){
				insertRecord();
		}else if(e.getSource()==deleteb){
				deleteRecord();
		}else if(e.getSource()==updateb){
				updateRecord();
		}else if(e.getSource()==searchb){
				searchRecord();
		}else if(e.getSource()==clearb){
				clearText();
		}else {
				dao.close();
				System.exit(0);
		}
	}
/** TextField�� ������ �����. */
	public void clearText(){
		numtf.setText("");
		addresstf.setText("");
		nametf.setText("");
	}
/** Insert Button�� ������ �� ActionPerformed Method�� ���� ȣ��ȴ�.*/
	public void insertRecord(){
		String n=numtf.getText().trim();
		String name=nametf.getText().trim();
		String address=addresstf.getText().trim();//trim()...���ڿ��� ���� ����
		if(address.equals("")||name.equals("")||n.equals("")){
			md.show("����ִ� �׸��� �ֽ��ϴ�");
			return;
		}
		int num=Integer.parseInt(n);
		if(dao.search(num)!=null){ 
			md.show("�̹� �ִ� ��ȣ�Դϴ�.");
			return;
		}
		dao.addCust(num, name,address);
		showList();
		clearText();
	}
/** Delete Button�� ������ �� ActionPerformed Method�� ���� ȣ��ȴ�.*/
	public void deleteRecord(){		
		String n=numtf.getText().trim();
		String name=nametf.getText().trim();

		if(name.equals("")&& n.equals("")){
			md.show("�̸��̳� ��ȣ�� �Է� �� �ּ���.");
			return;
		}
		if(!name.equals("")){
			if(dao.search(name)==null){
				md.show("�������� �ʴ� �̸��Դϴ�.");
				return;
			}else{
				dao.delete(name);
			}
		}else{
			int num=Integer.parseInt(n);
			if(dao.search(num)==null){
				md.show("���� ���� �ʴ� ��ȣ�Դϴ�.");
				return;
			}else{
				dao.delete(num);
			}
		}
		showList();
		clearText();
	}
/** Update Button�� ������ �� ActionPerformed Method�� ���� ȣ��ȴ�.*/
	public void updateRecord(){
		String n=numtf.getText().trim();
		String name=nametf.getText().trim();
		String address=addresstf.getText().trim();
		if(address.equals("")||name.equals("")||n.equals("")){
			md.show("����ִ� �׸��� �ֽ��ϴ�");
			return;
		}
		int num=Integer.parseInt(n);
		if(dao.search(num)== null){
			md.show("�����ϴ� ��ȣ�� �����ϴ�.");
			return;
		}
		dao.updateCust (num, name, address);
		showList();
		clearText();
	}
/** Search Button�� ������ �� ActionPerformed Method�� ���� ȣ��ȴ�.*/
	public void searchRecord(){
		Customer c=null;
		String n=numtf.getText().trim();
		String name=nametf.getText().trim();
		if(!(name.equals(""))){
			c=dao.search(name);
		}else if(!(n.equals(""))){
			c=dao.search(Integer.parseInt(n));
		}else {
			md.show("������ �߸��Ǿ����ϴ�");
			return;
		}
		if(c==null){
			md.show("ã�� �� �����ϴ�");
			return;
		}
		addresstf.setText(c.getAddress());
		nametf.setText(c.getName());
		numtf.setText(c.getNum()+"");//String<=int
	}
/** ArrayList�� �ִ� ����Ÿ�� List �� ǥ���Ѵ�.*/
	public void showList(){
		Customer[] result=dao.allCust();
		li.removeAll();
		for(Customer cv:result){
			li.add(cv.toString());
		}
	}
/** List�� �׸��� ����(Ŭ��)�Ǿ� ItemEvent�� �߻� ���� �� ����ȴ�. 
ItemListener �� itemStateChanged method Overrinding */
	public void itemStateChanged(ItemEvent e){
			String str=li.getSelectedItem();
			String[] ss=str.split("   ");
			numtf.setText(ss[0]);
			nametf.setText(ss[1]);
			addresstf.setText(ss[2]);

	}
	public static void main(String[] args){
		new CustomerMain();
	}
}
