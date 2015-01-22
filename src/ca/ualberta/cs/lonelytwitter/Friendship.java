package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class Friendship extends User implements Friends
{

	private ArrayList<String> friendList = new ArrayList<String>();
	protected String username;

	public ArrayList<String> getFriendList()
	{

		return friendList;
	}

	public void setFriend(String user)
	{

		this.friendList.add(user);
	}

	public void deleteFriend(String user)
	{

		this.friendList.remove(user);
	}

	public void setFriendList(ArrayList<String> friendList)
	{

		this.friendList = friendList;
	}

	public String getUsername()
	{

		return this.username;
	}

	public void setUsername(String username)
	{

		this.username = username;
	}

	public Friendship()
	{

		super();
		this.username = "anonymous";
		this.friendList = new ArrayList<String>();
	}

	public Friendship(String username, ArrayList<String> usersList)
	{

		super();
		this.username = username;
		this.friendList = usersList;
		// TODO Auto-generated constructor stub
	}

}