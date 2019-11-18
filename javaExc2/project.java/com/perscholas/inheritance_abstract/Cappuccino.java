package com.perscholas.inheritance_abstract;

public class Cappuccino extends Product {
	 private Boolean peppermint ;
	 private Boolean whippedCream ;
	    
	    public Cappuccino() {
	    	super();
	    	this.setName("Cappuccino");
	    	this.setPrice (2.99);
	    	this.setDescription("Delicious Drink");
	    }
	    public Cappuccino(String name, Double price, String description, Boolean peppermint, Boolean whippedCream) {
	    	this.peppermint = peppermint;
	    	this.whippedCream = whippedCream;
	    }    
	    
	public Boolean getPeppermint() {
			return peppermint;
		}
		public void setPeppermint(Boolean peppermint) {
			this.peppermint = peppermint;
		}
		public Boolean getWhippedCream() {
			return whippedCream;
		}
		public void setWhippedCream(Boolean whippedCream) {
			this.whippedCream = whippedCream;
		}
	@Override
	public Double calculateProductTotal() {
		if(peppermint) {
			this.setPrice(this.getPrice() + 2);
		}
		if(whippedCream) {
			this.setPrice(this.getPrice() + 1);
		}
		
		
			
			return this.getPrice() * this.getQuantity();
		}
	}


