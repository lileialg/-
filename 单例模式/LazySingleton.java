package com.designpattern.singleton;

public class LazySingleton {
	
	/**
	 * �ŵ㣺��һ�ε��òų�ʼ���������ڴ��˷ѡ�
	     ȱ�㣺�������synchronized ���ܱ�֤������
		����������߳�ͬʱ����getInstance��������chuxia����������Ӱ��Ч�ʡ�
	 */

	private static LazySingleton instance;
	
	private LazySingleton(){}
	
	public static synchronized LazySingleton getInstance(){
		
		if (instance == null)
			instance = new LazySingleton();
		
		return instance;
		
	}
	
}
