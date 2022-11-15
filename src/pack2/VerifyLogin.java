package pack2;

import org.testng.annotations.Test;

import pack1.HomePomclass;

public class VerifyLogin extends TestBaseClass
{
	@Test
	public void verifyLogingFunctionality() 
	{
	HomePomclass hp=new HomePomclass(driver);
	hp.clickoncompose();
	hp.sendto();
	hp.sendsubject();
	hp.sendMessage();
	hp.clickonsend();
	
	

}}
