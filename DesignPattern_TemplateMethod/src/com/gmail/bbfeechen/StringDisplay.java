package com.gmail.bbfeechen;

public class StringDisplay extends AbstractDisplay {
	private String string;
	public int width;
	
	public StringDisplay(String string) {
		this.string = string;
		this.width = string.getBytes().length;
	}

	@Override
	public void open() {
		printLine();
		System.out.print("\n");
	}

	@Override
	public void print() {
		System.out.println("|" + string + "|");
	}

	@Override
	public void close() {
		printLine();
		System.out.print("\n");
	}
	
	private void printLine() {
		System.out.print("+");
		for(int i = 0; i < width; i++) {
			System.out.print("-");
		}
		System.out.print("+");
	}

}
