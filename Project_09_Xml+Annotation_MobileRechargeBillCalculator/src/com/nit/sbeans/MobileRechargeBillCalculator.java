package com.nit.sbeans;


//@Component("mRechargeBill")
public class MobileRechargeBillCalculator {
	
	double planAmount;
	double extraDataUesedGB;
	double costPerGB;
	
	
//	@Autowired
//	public MobileRechargeBillCalculator() {
//		
//		System.out.println("MobileRechargeBillCalculator 0 ParamContructor()");
//	}


	
	public MobileRechargeBillCalculator(double planAmount, double extraDataUesedGB, double costPerGB) {
		
		this.planAmount = planAmount;
		this.extraDataUesedGB = extraDataUesedGB;
		this.costPerGB = costPerGB;
	}
	
	
	public double generateReachargeBill()
	{
		return planAmount+(extraDataUesedGB*costPerGB);
	}
	
	

}
