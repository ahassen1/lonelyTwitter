package ca.ualberta.cs.lonelytwitter;

public abstract class User implements UserLite
{

	// protected can be used by class and subclasses
	// ____ is default, can be accessed anywhere within package
	// within 301 use private or protected
	// static final says attrib is shared by all of such class and is never
	// written
	protected String username;

	public String getUsername()
	{

		return username;
	}

	public abstract void setUsername(String username);

	public User(String username)
	{

		// super() calls construcor of superclass
		super();
		this.username = username;
	}

	public User()
	{

		// super() calls construcor of superclass
		super();
		this.username = "anonymous";
	}

}
