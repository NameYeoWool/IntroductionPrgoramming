package edu.skku.bank;

public class Account {
	String num;
	long balance;
	
	public void deposit(int money){
		balance += money;
	}
	
	public void withdraw(int pw, int money){
		//비밀번호
		//잔액체크
		//출금처리
	}
	
	public void transfer(int otherNum,int pw,int money){
		withdraw(pw,money);
		//다른 통장으로 입금
	}

}
