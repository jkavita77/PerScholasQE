package com_PerScholas_firstexample;

public class ExcNingth {

	public static void main(String[] args) {
		Double Coffee = 3.0;
		Double Tea = 4.0;
		Double Juice = 3.5;
		Double SubTotal;
		Double TotalSales;
		Double sales_Tax = 0.85;
	/*
		SubTotal = ( 3*Coffee + 4*Tea + 2* Juice);
			System.out.println( "Subtotal of the order: "+  SubTotal);
		sales_Tax=  8/ SubTotal;
			System.out.println( "Taxes " + sales_Tax);
		TotalSales = SubTotal + sales_Tax;
		System.out.println( "Totalsales :" + TotalSales);
		*/
		System.out.println("Coffee:" + "$ " + Coffee );
		System.out.println("Tea:" + "$ " + Tea );
		System.out.println("Juice:" + "$ " + Juice );
		SubTotal = ( 3*Coffee + 4*Tea + 2* Juice);
		System.out.println( "Subtotal of the order: "+ "$"+ SubTotal);
		TotalSales = SubTotal + sales_Tax;
		System.out.println( "Totalsales :" +"$"+ TotalSales);
	}

}
