package com.bsl.javacore.thread2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadTest {

	public static void main(String[] args) {
		Account account = new Account("123456", 1000);
		DrawMoneyRunnable drawMoneyRunnable = new DrawMoneyRunnable(account, 700);
		Thread myThread1 = new Thread(drawMoneyRunnable);
		Thread myThread2 = new Thread(drawMoneyRunnable);
		myThread1.setName("自己人"); // 设置线程1的名称
		myThread2.setName("不是自己人");// 设置线程2的名称
		myThread1.start();
		myThread2.start();
	}

}

class DrawMoneyRunnable implements Runnable {

	private Account account;
	private double drawAmount;

	public DrawMoneyRunnable(Account account, double drawAmount) {
		super();
		this.account = account;
		this.drawAmount = drawAmount;
	}

	private final Lock lock = new ReentrantLock(); // 定义lock同步锁对象，此对象与共享资源具有一对一关系

	public void run() {
		lock.lock();// 加锁
		// 需要进行线程安全同步的代码
		if (account.getBalance() >= drawAmount) {

			System.out.println(Thread.currentThread().getName() + ":取钱成功， 取出钱数为：" + drawAmount);
			double balance = account.getBalance() - drawAmount;
			account.setBalance(balance);
			System.out.println("余额为：" + balance);
		} else {
			System.out.println(Thread.currentThread().getName() + ":余额不足！");
		}
		// 释放lock锁
		lock.unlock();
	}
}

class Account {
	private String accountNo;
	private double balance;

	public Account() {

	}

	public Account(String accountNo, double balance) {
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}