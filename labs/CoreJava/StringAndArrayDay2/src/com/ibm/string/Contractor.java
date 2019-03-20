package com.ibm.string;

public class Contractor {
	private int contractorId;
	private int duration;
	private int cost;
    int d;
	public Contractor() {

	}

	public Contractor(int contractorId, int duration, int cost) {
		super();
		this.contractorId = contractorId;
		this.duration = duration;
		this.cost = cost;
	}
	public int getContractorId() {
		return contractorId;
	}
public void setContractorId(int contractorId) {
		this.contractorId = contractorId;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	public void showContractorDetails() {
		System.out.println("Contractor details are :");
		System.out.println("Contarctor Id "+contractorId);
		System.out.println("Contarctor duration "+duration);
		System.out.println("Contarctor cost "+cost);
		System.out.println();
		
	}

}
