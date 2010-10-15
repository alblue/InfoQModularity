package com.infoq.shorten;

import java.io.IOException;

public interface IShorten {
	public String shorten(String url) throws IllegalArgumentException, IOException;
}
