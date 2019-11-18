package com.Perscholas.JavaSBAProject_01;

public class SbaQuestion10 {

	public class Furniture  {
		int productId;
		Double price;
		String name;
		String color;
		int Quantity;
		// Subclass
		public class Chair {
			String shape;
			int length;
			Boolean CustomColor;
			}
		public class Table {
			String shape;
			int length;
		}
		//no-arg constructor and a constructor 
		Chair(){
			
		}
		chair(String  shape, int length, Boolean CustomColor) {
			this.shape = shape;
			this.lenght = Lenght;
			this.CustomColor = CustomColor;
					}
		
		
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public int getQuantity() {
			return Quantity;
		}
		public void setQuantity(int quantity) {
			Quantity = quantity;
		}
		
		
		
		
		}
	}


