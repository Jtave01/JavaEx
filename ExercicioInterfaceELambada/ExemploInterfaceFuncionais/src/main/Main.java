package main;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;


public class Main {
		private static Iterable<User> user;

		public static void main(String [] agrs) {
				List<User> users = List.of(new User("maria", 21), new User("joao",  32),
				new User("eduardo",  40), new User("ana",  19));
				
				users.forEach(user -> System.out.println(user));
				users.forEach(System.out::println);
				printStringValue(user -> String.valueOf(user.age()) , users);
				printStringValue(Record::toString , users);
				
		}
		
		
		private static void printStringValue(Function<User, String> callback, List<User> users) {
			users.forEach(u-> System.out.println(callback.apply(u)));
		}
		
		
		
}
		

