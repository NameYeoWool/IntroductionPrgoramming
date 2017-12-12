package kr.jaen.cms;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
/** AWT 를 이용하여 주소록에 등록/수정/삭제 기능을 구현해 본다.*/

public class CustomerMain implements ActionListener,ItemListener{
	Frame f=new Frame("Address Book");
	Label custl=new Label("Address Book",Label.CENTER);
	Label numl=new Label("번 호",Label.CENTER);
	Label namel=new Label("이  름",Label.CENTER);
	Label addressl=new Label("주 소",Label.CENTER);
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
		md=new MessageDialog(f,"경  고");//Dialog 생성(owner,title)
		createGUI();
		addEvent();
		showList();
	}
/** GUI 를 생성한다.*/
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
/** 이벤트를 등록 또는 처리한다. */
	public void addEvent(){

		f.addWindowListener(new WindowAdapter(){  // 화면 x버튼 클릭시 프로그램 종료 이벤트 처리
			public void windowClosing(WindowEvent e){
							dao.close();
							System.exit(0);
			} 
		});
		insertb.addActionListener(this);  //insert 버튼 클릭시 아래 this.actionPerformed()를 호출한다.
		deleteb.addActionListener(this);
		updateb.addActionListener(this);
		searchb.addActionListener(this);
		clearb.addActionListener(this);
		exitb.addActionListener(this);
		li.addItemListener(this);	
	}
/** 버튼이 눌리거나 클릭되어 ActionEvent가 발생했을 때 실행된다. 
ActionListener 의 actionPerformed method Overrinding*/
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
/** TextField의 내용을 지운다. */
	public void clearText(){
		numtf.setText("");
		addresstf.setText("");
		nametf.setText("");
	}
/** Insert Button이 눌렸을 때 ActionPerformed Method에 의해 호출된다.*/
	public void insertRecord(){
		String n=numtf.getText().trim();
		String name=nametf.getText().trim();
		String address=addresstf.getText().trim();//trim()...문자열의 공백 제거
		if(address.equals("")||name.equals("")||n.equals("")){
			md.show("비어있는 항목이 있습니다");
			return;
		}
		int num=Integer.parseInt(n);
		if(dao.search(num)!=null){ 
			md.show("이미 있는 번호입니다.");
			return;
		}
		dao.addCust(num, name,address);
		showList();
		clearText();
	}
/** Delete Button이 눌렸을 때 ActionPerformed Method에 의해 호출된다.*/
	public void deleteRecord(){		
		String n=numtf.getText().trim();
		String name=nametf.getText().trim();

		if(name.equals("")&& n.equals("")){
			md.show("이름이나 번호를 입력 해 주세요.");
			return;
		}
		if(!name.equals("")){
			if(dao.search(name)==null){
				md.show("존재하지 않는 이름입니다.");
				return;
			}else{
				dao.delete(name);
			}
		}else{
			int num=Integer.parseInt(n);
			if(dao.search(num)==null){
				md.show("존재 하지 않는 번호입니다.");
				return;
			}else{
				dao.delete(num);
			}
		}
		showList();
		clearText();
	}
/** Update Button이 눌렸을 때 ActionPerformed Method에 의해 호출된다.*/
	public void updateRecord(){
		String n=numtf.getText().trim();
		String name=nametf.getText().trim();
		String address=addresstf.getText().trim();
		if(address.equals("")||name.equals("")||n.equals("")){
			md.show("비어있는 항목이 있습니다");
			return;
		}
		int num=Integer.parseInt(n);
		if(dao.search(num)== null){
			md.show("존재하는 번호가 없습니다.");
			return;
		}
		dao.updateCust (num, name, address);
		showList();
		clearText();
	}
/** Search Button이 눌렸을 때 ActionPerformed Method에 의해 호출된다.*/
	public void searchRecord(){
		Customer c=null;
		String n=numtf.getText().trim();
		String name=nametf.getText().trim();
		if(!(name.equals(""))){
			c=dao.search(name);
		}else if(!(n.equals(""))){
			c=dao.search(Integer.parseInt(n));
		}else {
			md.show("선택이 잘못되었습니다");
			return;
		}
		if(c==null){
			md.show("찾을 수 없습니다");
			return;
		}
		addresstf.setText(c.getAddress());
		nametf.setText(c.getName());
		numtf.setText(c.getNum()+"");//String<=int
	}
/** ArrayList에 있는 데이타를 List 에 표시한다.*/
	public void showList(){
		Customer[] result=dao.allCust();
		li.removeAll();
		for(Customer cv:result){
			li.add(cv.toString());
		}
	}
/** List의 항목이 선택(클릭)되어 ItemEvent가 발생 했을 때 실행된다. 
ItemListener 의 itemStateChanged method Overrinding */
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
