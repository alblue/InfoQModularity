package com.infoq.templater.internal;
import com.infoq.templater.api.*;
import java.util.*;
public class Templater implements ITemplater {
  public String template(String uri, Map data) {
    String[] elements = uri.split("\\{|\\}");
    StringBuffer buf = new StringBuffer();
    for(int i=0;i<elements.length;i++)
        buf.append(i%2 == 0 ? elements[i] : data.get(elements[i]));
    return buf.toString();
  }
}
