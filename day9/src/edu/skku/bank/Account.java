package edu.skku.bank;

public class Account {
	String num;
	long balance;
	
	public void deposit(int money){
		balance += money;
	}
	
	public void withdraw(int pw, int money){
		//��й�ȣ
		//�ܾ�üũ
		//���ó��
	}
	
	public void transfer(int otherNum,int pw,int money){
		withdraw(pw,money);
		//�ٸ� �������� �Ա�
	}

}
