public class Accounting {
	
	public void addCost(Cost cost) {
		//to implement
	}

	public Cost getCost() {
		//to implement
	return new Cost(5,"ab");
	}

	public static void main(String[] args) {
		Accounting acc = new Accounting();
		acc.addCost(new Grocery(50000, "meat"));
		acc.addCost(new Health(100000, 1, "CalMagZink capsule"));
		acc.addCost(new HomeAppliance(4000000, "TV"));
		acc.addCost(new Health(60000, 4, "yearly check up"));
		acc.addCost(new Grocery(4000, "pancake powder"));
		acc.addCost(new HomeAppliance(600000, "pot"));
		
		System.out.println(acc.getCost());
		System.out.println(acc.getCost());
		System.out.println(acc.getCost());
		System.out.println(acc.getCost());
		System.out.println(acc.getCost());
		System.out.println(acc.getCost());
		System.out.println(acc.getCost());
	}

}
