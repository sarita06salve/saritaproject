package com.corejavaexa;

public class Laptop implements Comparable<Laptop>
{
	private int lId;
	private String lapBrnd;
	private String ramSize;
	
	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	public String getLapBrnd() {
		return lapBrnd;
	}

	public void setLapBrnd(String lapBrnd) {
		this.lapBrnd = lapBrnd;
	}

	public String getRamSize() {
		return ramSize;
	}

	public void setRamSize(String ramSize) {
		this.ramSize = ramSize;
	}	

	public Laptop(int lId, String lapBrnd, String ramSize) {
		super();
		this.lId = lId;
		this.lapBrnd = lapBrnd;
		this.ramSize = ramSize;
	}

	@Override
	public String toString() {
		return "Laptop [lId=" + lId + ", lapBrnd=" + lapBrnd + ", ramSize=" + ramSize + "]";
	}

	@Override
	public int compareTo(Laptop o) 
	{
		if(this.lId == o.lId)
		{
			return 0;
		}
		else if(this.lId > o.lId)
		{
			return 1;
		}
		else 
		{
			return -1;
		}	
	}

}
