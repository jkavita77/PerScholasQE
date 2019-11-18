package com.perscholas.inheritance_abstract;

public class Expresso extends Product{
	private Boolean extraShot ;
    private Boolean macchiato ;
    
    public Expresso() {
    	super();
    	this.setName("Expresso");
    	this.setPrice(2.99);
    	this.setDescription("Delicious Drink");
    }
  
   
    public Expresso(String name, Double price, String description, Boolean extraShot, Boolean macchiato) {
    	this.extraShot = extraShot;
    	this.macchiato = macchiato;
    }
    
	public Boolean getExtraShot() {
		return extraShot;
	}


	public void setExtraShot(Boolean extraShot) {
		this.extraShot = extraShot;
	}


	public Boolean getMacchiato() {
		return macchiato;
	}


	public void setMacchiato(Boolean macchiato) {
		this.macchiato = macchiato;
	}


	@Override
	public Double calculateProductTotal() {
		if(extraShot) {
			this.setPrice(this.getPrice() + 2);
		}
		if(macchiato) {
			this.setPrice(this.getPrice() + 1);
		}
		return this.getPrice() * this.getQuantity();
	}

}
