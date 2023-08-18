package pweb.desafios;

import java.util.HashMap;
import java.util.Map;

abstract public class Datas {
  public static Map<String, String> domainIps = new HashMap<>();

  static {
    domainIps.put("example1.com", "192.168.1.1");
    domainIps.put("example2.com", "192.168.1.2");
    domainIps.put("example3.com", "192.168.1.3");
    domainIps.put("example4.com", "192.168.1.4");
    domainIps.put("example5.com", "192.168.1.5");
    domainIps.put("example6.com", "192.168.1.6");
    domainIps.put("example7.com", "192.168.1.7");
    domainIps.put("example8.com", "192.168.1.8");
    domainIps.put("example9.com", "192.168.1.9");
    domainIps.put("example10.com", "192.168.1.10");
  }

}