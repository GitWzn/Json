package com.wzn.fastJson;

public class Money {
	private int RMB;
	private int US;

	public Money(int rMB, int uS) {
		super();
		RMB = rMB;
		US = uS;
	}

	public int getRMB11() {
		return RMB;
	}

	public void setRMB11(int rMB) {
		RMB = rMB;
	}

	public int getUS() {
		return US;
	}

	public void setUS(int uS) {
		US = uS;
	}

	@Override
	public String toString() {
		return "Money [RMB=" + RMB + ", US=" + US + "]";
	};
}
