package com.github.xiaokang;

import com.github.xiaokang.TestEnum.Color;

public class TestEnum2 {

	/**
	 * ����Ŀ�ģ����Բ�ͬ�������Ƿ���ͬ
	 * 
	 * ���ۣ����ȫΪtrue��˵����ͬ
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TestEnum e = new TestEnum();
		System.out.println(e.getRed() == Color.RED.toString());
		System.out.println(e.getRed() == Color.RED.name());
	}

}
