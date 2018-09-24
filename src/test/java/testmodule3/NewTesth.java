package testmodule3;

import org.testng.annotations.Test;

public class NewTesth {

	String a ;
	
	public NewTesth() {
		System.out.println("CONSTRUCTOR");
		//this.a = SuiteDriverListner.a;
	}
	
  @Test
  public void f() {
	  System.out.println(a);
  }
}
