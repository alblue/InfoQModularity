package com.infoq.templater.api;
import com.infoq.templater.internal.*;
public class TemplaterFactory {
  public static ITemplater getTemplater() {
    return new Templater();
  }
}
