package cn.zrcx;

import java.rmi.RemoteException;

public class t {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoProxy d=new DemoProxy();
		try {
			System.out.print(d.f((float)2,(float)7.8));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
