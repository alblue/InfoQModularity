package com.infoq.shorten.command;

import java.io.PrintStream;

import org.osgi.framework.BundleContext;
import org.apache.felix.service.command.Descriptor;

public class FelixGogoShortenCommand extends ShortenCommand {

	public FelixGogoShortenCommand(BundleContext context) {
		super(context);
	}

	@Descriptor("shorten a URL")
	public String shorten(
		@Descriptor("url)") String url) {
		String result = "";
		try {
			result = super.shorten(url);
			if(result == null)
				System.err.println("Unable to shorten; service unavailable");
			else
				return(result);
		} catch (Exception e) {
			e.printStackTrace(System.err);
		}
		return result;
	}
}
