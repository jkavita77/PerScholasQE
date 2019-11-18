package com.platform;

public class MaximumQuantityExceededException  extends Exception {
	
		private static final long serialVersionUID = 1L;
		
		public MaximumQuantityExceededException() {};
		public MaximumQuantityExceededException(String message) {
			super(message);
		}
	}

