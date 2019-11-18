package com.perscholas.inheritance_abstract;

public class Coffee extends Product{
    private Boolean sugar;
    private Boolean milk;
    
    public Coffee() {
    	super();
    	this.setName("Coffee");
    	this.setPrice (1.99);
    	this.setDescription("Delicious Drink");
    }
    
  	public Coffee(String name, Double price, String description, Boolean Sugar, Boolean milk) {
    	super(name, price, description);
    	this.milk = milk;
    	this.sugar = sugar;
    	
    
    }

	 public Boolean getSugar() {
			return sugar;
		}

		public void setSugar(Boolean sugar) {
			this.sugar = sugar;
		}

		public Boolean getMilk() {
			return milk;
		}

		public void setMilk(Boolean milk) {
			this.milk = milk;
		}
  
	@Override
	public Double calculateProductTotal() {
	return this.getPrice() * this.getQuantity();
	}
	}
