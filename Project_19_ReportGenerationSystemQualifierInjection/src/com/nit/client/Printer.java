package com.nit.client;


	
	public interface Printer {
	    
	    void page(); // Interface methods are public and abstract by default

	    public static Printer getPrinter() {
	        return new Printer() { // Note the parentheses ()
	            @Override
	            public void page() {
	                System.out.println("Printing a page...");
	            }
	        }; // This semicolon is required to end the return statement
	    }
	}
	



