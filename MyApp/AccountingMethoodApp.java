
public class AccountingMethoodApp {
	public static double ValueOfSupply;
	public static double vatRate;
	private static double expenseRate;
	
	public static void main(String[] args) {
		
		ValueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
		
//		double vat = getVAT();			//System.out.println("vat : "+vat);
//		double total = getTotal();
//		double expense = getExpense();
//		double income = getIncome();
//		double dividend1 = getDiviend1();
//		double dividend2 = getDiviend2();
//		double dividend3 = getDiviend3();
		
		print();
	}

	private static void print() {
		System.out.println("Value of supply : " +ValueOfSupply);
		System.out.println("VAT : " +getVAT());
		System.out.println("Total : " +getTotal());
		System.out.println("Expense :" +expenseRate);
		System.out.println("Income :" +getIncome());
		System.out.println("dividend 1: "+getDiviend1());
		System.out.println("dividend 2: "+getDiviend2());
		System.out.println("dividend 3: "+getDiviend3());
	}

	private static double getDiviend1() {
		return getIncome() *0.5;
	}
	
	private static double getDiviend2() {
		return getIncome() *0.3;
	}
	
	private static double getDiviend3() {
		return getIncome() *0.2;
	}

	private static double getIncome() {
		return ValueOfSupply - getExpense();
	}

	private static double getExpense() {
		return ValueOfSupply * expenseRate;
	}

	private static double getTotal() {
		return ValueOfSupply + getVAT();
	}

	private static double getVAT() {
		return ValueOfSupply * vatRate;
	}
}
