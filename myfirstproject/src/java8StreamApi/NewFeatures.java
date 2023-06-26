package java8StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NewFeatures {

	public static void main(String[] args) {
		List <User> users = new ArrayList<>();
		users.add(new User(1,"Aleyna"));
		users.add(new User(2,"Ahmet"));
		users.add(new User(3,"Mehmet"));
		users.add(new User(4,"Zehra"));
		users.add(new User(5,"Cem"));
		users.add(new User(6,"Murat"));
		users.add(new User(7,"Hakan"));
		users.add(new User(8,"Leyla"));
		
		
		users.stream()
		.forEach(user -> 
		{
			System.out.println("Java8");
			System.out.println(user.toString());}  // {} icerisine aynı bir method gibi, istediginiz islemleri verebiliyoruz.
		);
		System.out.println("----------------------------------");
		users.stream().forEach(user ->  user.talk());
		
		System.out.println("----------------------------------");
		users.stream().forEach(User::talk); // User class'i icerisindeki talk methodunu cagırıyoruz -> method reference
		
		System.out.println("----------------------------------");
		System.out.println(users.stream().filter(user -> user.id>5).count());
		
		System.out.println("----------------------------------");
		List<User> filteredList = users.stream().filter(user -> user.id<5).collect(Collectors.toList());
		filteredList.stream().forEach(User::talk);
		
		System.out.println("----------------------------------");
		List<User> mappedList = users.stream().map(user -> new User(user.id+100, user.name)).collect(Collectors.toList());
		mappedList.stream().forEach(user -> System.out.println(user.toString()));
		
		System.out.println("----------------------------------");
		
		Map<Integer, String> userMap = users.stream().collect(Collectors.toMap(user -> user.id, user -> user.name));
		userMap.forEach((key, value) -> System.out.println(key + ": " + value ));
		
		

	}

}

class User {
	
	int id;
	String name;
	
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	public void talk() {
		
		System.out.println("Hi, I am " + this.name);
	}
	
}
