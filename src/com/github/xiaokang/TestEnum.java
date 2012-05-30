package com.github.xiaokang;

public class TestEnum {

	public enum Color{
		BLUE,
		RED,
		YELLOW
	}
	
	public String getRed(){
		return Color.RED.toString();
	}
	
	/**
	 * 
	 * ����Ŀ�ģ�ȷ����һ������ͬһ��enum��.name() .toString()�Ƿ����Ƿ���ͬһ������String��������������ͬ���½�String
	 * 
	 * ���ۣ����ȫΪtrue��˵��Color.BLUE���ص���ͬһ������String
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String name1 = Color.BLUE.name();
		String name2 = Color.BLUE.name();
		String string1 = Color.BLUE.toString();
		String string2 = Color.BLUE.toString();
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));
		System.out.println(string1 == string2);
		System.out.println(string1.equals(string2));
		System.out.println(string1 == name1);
		System.out.println(string1.equals(name1));
	}

}
