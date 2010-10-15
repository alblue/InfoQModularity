package com.infoq.shorten.command;

import java.io.PrintStream;

import org.apache.felix.shell.Command;
import org.osgi.framework.BundleContext;


public class FelixShortenCommand extends ShortenCommand implements Command {

	public FelixShortenCommand(BundleContext context) {
		super(context);
	}

	public void execute(String url, PrintStream out, PrintStream err) {
		try {
			String result = shorten(url.substring(8));
			if(result == null)
				err.println("Unable to shorten; service unavailable");
			else
				out.println(result);
		} catch (Exception e) {
			e.printStackTrace(err);
		}
	}

	public String getName() {
		return "shorten";
	}

	public String getShortDescription() {
		return "Shorterns a URL given a long name";
	}

	public String getUsage() {
		return "shorten http://www.infoq.com";
	}

}
