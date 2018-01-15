package main;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction   extends ActionSupport
{

	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;
	public String execute() throws  Exception
	{
		if (username==null||password==null) 
		{
			System.out.println("error");
			return ERROR;
			
		}
		
		if (username.equals("zengxuan")&&password.equals("123"))
		{
			System.out.println("error3");
			return SUCCESS;
			
		}
		else 
		{
		
			
			System.out.println("error2");
			return ERROR;
		}
		
	}
	
}
