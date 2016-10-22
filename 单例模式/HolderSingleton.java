package com.designpattern.singleton;

public class HolderSingleton {

	/**
	 * �ڲ���ֻ�����ⲿ�౻���òż��أ�����SINGLETONʵ�����ֲ��ü�����
	 * ��ģʽ����������ģʽ���ŵ㣬���������ǵ�ȱ�㣬����õĵ���ģʽ��
	 */

	private HolderSingleton() {
	}

	public static HolderSingleton getInstance() {
		return Holder.instance;
	}

	private static class Holder {
		private static final HolderSingleton instance = new HolderSingleton();
	}

}
