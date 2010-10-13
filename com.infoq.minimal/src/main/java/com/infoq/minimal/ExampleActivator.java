package com.infoq.minimal;
import org.osgi.framework.*;
public class ExampleActivator implements BundleActivator {
  public void start(BundleContext context) {
    System.out.println("Started");
  }
  public void stop(BundleContext context) {
    System.out.println("Stopped");
  }
}
