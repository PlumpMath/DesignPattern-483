package com.gmail.bbfeechen;
import java.io.*;

public class HTMLBuilder extends Builder {
	private String filename;
	private PrintWriter writer;
	
	@Override
	public void makeTitle(String title) {
		filename = title + ".html";
		try {
			writer = new PrintWriter(new FileWriter(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
		writer.println("<html><head><title>" + title + "</title></head><body>");
		writer.println("<hl>" + title + "</hl>");
	}

	@Override
	public void makeString(String str) {
		writer.println("<p>" + str + "</p>");
	}

	@Override
	public void makeItems(String[] items) {
		writer.println("<ul>");
		for (int i = 0; i < items.length; i++) {
			writer.println("<li>" + items[i] + "</li>");
		}
		writer.println("</ul>");
	}

	@Override
	public void close() {
		writer.println("</body></html>");
		writer.close();
	}
	
	public String getResult() {
		return filename;
	}
}
