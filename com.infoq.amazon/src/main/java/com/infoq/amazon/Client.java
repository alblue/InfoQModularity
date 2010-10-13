package com.infoq.amazon;
import org.osgi.framework.*;
import com.infoq.templater.api.*;
import java.util.*;
public class Client implements BundleActivator {
  public void start(BundleContext context) {
    Map data = new HashMap();
    data.put("tld", "co.uk"); // or "com" or "de" or ...
    data.put("isbn", "1411609255"); // or "1586033115" or ...
    System.out.println( "Starting\n" + 
        TemplaterFactory.getTemplater().template(
        "http://www.amazon.{tld}/dp/{isbn}/", data));
  }
  public void stop(BundleContext context) {
  }
}
