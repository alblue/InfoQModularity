package com.infoq.shorten.tinyurl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import com.infoq.shorten.IShorten;

public class TinyURL implements IShorten {

	private static final String lookup = "http://tinyurl.com/api-create.php?url=";
	
	public String shorten(String url) throws IllegalArgumentException, IOException {
		String line = new BufferedReader(new InputStreamReader(new URL(lookup + url).openStream())).readLine();
		if(line == null)
			throw new IllegalArgumentException( "Could not shorten " + url);
		return line;
	}
}
