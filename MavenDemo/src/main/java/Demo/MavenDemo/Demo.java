package Demo.MavenDemo;
import java.util.*;
public class Demo {
  public static void main(String[] args) {
	  TreeMap<String,String> tm = new TreeMap<String,String>();
	  tm.put("Maven","project1");
	  tm.put("Sonar", "Project2");
	  System.out.println(tm);
  }
}
