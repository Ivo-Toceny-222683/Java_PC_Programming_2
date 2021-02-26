package School;

public class Test {

	public static void main(String[] args)
	{		
		BPC1 pc1 = new BPC1();
		BPC2 pc2 = new BPC2();
		BPIS pis = new BPIS();
		
		Support.doBPC1(pc1);		
		Support.doBPC2(pc2);
		Support.doBPIS(pis);
			
		Support.doResult(pc1, pc2, pis);
	}

}
