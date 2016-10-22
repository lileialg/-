package com.designpattern.singleton;

public class HungrySingleton {
	
	/**
	 * �ŵ㣺û�м�����ִ��Ч�ʻ���ߡ�
		ȱ�㣺�����ʱ�ͳ�ʼ�����˷��ڴ�
	 */

	private static HungrySingleton instance = new HungrySingleton();
	
	private HungrySingleton(){}
	
	public static HungrySingleton getInstance(){
		return instance;
	}

}
