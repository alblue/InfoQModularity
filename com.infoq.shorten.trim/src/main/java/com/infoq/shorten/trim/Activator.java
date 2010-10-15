package com.infoq.shorten.trim;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import com.infoq.shorten.IShorten;

public class Activator implements BundleActivator {
	public void start(BundleContext context) {
		context.registerService(IShorten.class.getName(), new Trim(), null);
	}

	public void stop(BundleContext context) throws Exception {
	}
}