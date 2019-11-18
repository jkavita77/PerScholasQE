package com.perscholas.inheritance_abstract;


	public  abstract class Product {

		
			private String name;
			private Double price;
			private String description;
			private Integer quantity;
			
			
			public Product() {}
			public Product(String name, Double price, String description) {
				this.name = name;
				this.price = price;
				this.description = description;
			}
			
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public Double getPrice() {
				return price;
			}
			public void setPrice(Double price) {
				this.price = price;
			}
			public String getDescription() {
				return description;
			}
			public void setDescription(String description) {
				this.description = description;
			}
			public Integer getQuantity() {
				return quantity;
			}
			public void setQuantity(Integer quantity) {
				this.quantity = quantity;
			}
			
			public abstract Double calculateProductTotal(); 
				
			
		}

			
		

	



