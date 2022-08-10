
public class AccountingApp {
	
	public static double ValueOfSupply = 10000.0; // 공급가액
	public static double vatRate = 0.1; // 부가가치세율

	public static double getVAT() {
		return ValueOfSupply * vatRate;
	}
	
	public static double getTotal() {
		return ValueOfSupply + getVAT();
		}

	

	public static void main(String[] args) { // Double.parseDouble(args[0]);

		double expenseRate = 0.3;

		// double vat = ValueOfSupply * vatRate; //부가세
		//double vat = getVAT();	변수를 지정해줄필요가 없다
		
		//double total = ValueOfSupply + vat; // 합계(판매가)
		//double total = getTotal();
		
		double expense = ValueOfSupply * expenseRate;
		double income = ValueOfSupply - expense;
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;

		System.out.println("Value of supply : " + ValueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());
		System.out.println("Expense :" + expense);
		System.out.println("Income :" + income);
		System.out.println("dividend 1: " + dividend1);
		System.out.println("dividend 2: " + dividend2);
		System.out.println("dividend 3: " + dividend3);
	}
}
