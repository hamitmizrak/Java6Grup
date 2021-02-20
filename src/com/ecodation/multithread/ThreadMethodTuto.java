package com.ecodation.multithread;

//thread method
class ThreadExtends {
	public void denemeThread() {
		Thread thread = new Thread(new Runnable() {// Anonymous thread
			@Override
			public void run() {
			}
		});
	}
}

// thread implements
class ThreadInterface implements Runnable {// interface thread
	@Override
	public void run() {
	}
}

// thread extends
public class ThreadMethodTuto extends Thread { // kalıtım thread
	@Override
	public void run() {
	}
}
