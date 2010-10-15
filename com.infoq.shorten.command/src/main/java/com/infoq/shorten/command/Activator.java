package com.infoq.shorten.command;

import java.util.Dictionary;
import java.util.Hashtable;

import org.apache.felix.shell.Command;
import org.eclipse.osgi.framework.console.CommandProvider;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	public void start(BundleContext context) throws Exception {
		boolean registered = false;
		try {
			// Felix 2.0
			context.registerService(Command.class.getName(), new FelixShortenCommand(context),null);
			registered = true;
		} catch(Error e) {
		}
		try {
			// Equinox 3.1+
			context.registerService(CommandProvider.class.getName(), new EquinoxShortenCommand(context),null);
			registered = true;
		} catch(Error e) {
		}
		try {
			// Felix 3.0
			Dictionary props = new Hashtable();
			props.put("osgi.command.scope","shorten");
			props.put("osgi.command.function", new String[] { "shorten" } );
			context.registerService(FelixGogoShortenCommand.class.getName(), new FelixGogoShortenCommand(context),props);
			registered = true;
		} catch(Error e) {
		}
		if (!registered)
			throw new Exception("Cannot register any command service");
	}

	public void stop(BundleContext context) throws Exception {		
	}
}
