package com.library.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.library.User;

public class MainApp {

	
	public static void main(String[] args) {
		
		
		User user1 = new User("milad", "arianfar", 24);
		User user2 = new User("john" , "Doe" , 30);
		User user3 = new User("chad" , "darby" , 40);
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		
		boolean temp = true;
		
		do {
			
			System.out.println("1) Add User \n 2) Show User \n 3) Edit User \n 4) Delete User \n 5) Show Users \n 6) Exit");
			int n = s.nextInt();
			
			switch(n) {
				case 1 :
					addUser();
					break;
				case 2 :
					showUser();
					break;
				case 3 :
					editUser();
					break;
				case 4 : 
					deleteUser();
					break;
				case 5 :
					showUsers();
					break;
				case 6 :
					System.out.println("***GoodBye***");
					temp = false;
			}
			
			
		}while(temp);
		
		
	}
	
	
	static List<User> users = new ArrayList<User>(); 
	static Scanner s = new Scanner(System.in);
	
	
	//write method here
	
	public static void addUser() {
		
		User user = add();
		users.add(user);
		int id = users.indexOf(user);
		
		System.out.println("**User added**");
		System.out.println("Your id number : " + id);
	}
	
	
	public static void showUser() {
		
		User user = getUser();
		
		if(user != null) {
			System.out.println("First name : " + user.getFirstName() + "\n Last name : " + user.getLastName() + "\n Age : " + user.getAge());
		}else {
			System.out.println("your id number not found...");
		}
		
	}
	
	
	public static void showUsers() {
		
		for(User u : users) {
			int id = users.indexOf(u);
			System.out.println("First name : " + u.getFirstName() + "\n Last name : " + u.getLastName() + "\n Age : " + u.getAge() + "\n Id : " + id);
			System.out.println("----------------------------");
		}
		
	}
	
	
	public static void editUser() {
		
		System.out.println("Enter your id number : ");
		int id = s.nextInt();
		
		User user = users.get(id);
		
		if(user != null) {
			
			user.toString();
			
			System.out.println("Enter new information...");
			
			User newUser = add();
			
			users.set(id, newUser);
			
			System.out.println("**User edited**");
			
		}else {
			System.out.println("your id number not found...");
		}
		
	}
	
	
	public static void deleteUser() {
		
		User user = getUser();
		
		if(user != null) {
			
			users.remove(user);
			
			System.out.println("**User deleted**");
			
		}else {
			System.out.println("your id number not found...");
		}
		
		
	}
	
	
	public static User getUser() {
		
		System.out.println("Enter your id number : ");
		int id = s.nextInt();
		
		User user = users.get(id);
		
		return user;
	}
	
	
	public static User add() {
		
		System.out.println("Enter your firstname : ");
		String firstName = s.next();
		System.out.println("Enter your lastname : ");
		String lastName = s.next();
		System.out.println("Enter your age : ");
		int age = s.nextInt();
		
		User user = new User(firstName, lastName, age);
		
		return user;
		
	}
	
	
	
	
	
}
