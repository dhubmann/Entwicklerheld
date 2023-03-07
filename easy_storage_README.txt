SUMMARY
Jane is annoyed. She can't remember her repositories for all the items she stored. It would be very cool to have some kind of noticable aid to remember where she stored her items. But paper is very uncool and gets lost easily. So she wants a program for this purpose. Help her to get such a program.

SCENARIO 1: Store the items
First things first, we need a method to store the relationships between an item and its repository. Items are unique so you don't care about multiple units from one item. For internal saving use the HashMap-type from Java's Collection framework.
Implement the store function which has the input parameters item and repository.

	store("Glasses", "Bookshelf") should result in [{Glasses=Bookshelf}].

The storage variable should be private.
Think also about illegal values, which should be handeled with a IllegalArgumentException and NullPointerException.
Your algorithm should work with other values as well.

SCENARIO 2: Get all associations
Next we need an output for all the stored data. This is easy, you only need to return your Map.
Implement getAllData().
The function should return all associations between items and repositorys as HashMap.
Your algorithm should work with other values as well.

SCENARIO 3: Get a concrete association
Finally we need a way to search a thing and get its repository and the other way round. So you must implement two functions one to get the repository of a item, which should return a single string and the second function to get the things stored in a repository. This function should return a Set<String> which is also part of the Java's Collection framework.
Implement getRepository(String) method, wich should return the repository of an item as String. If there is no repository for this Item or the Items doesn't exist in your Storage HashMap return null.
Given is the Item Glasses and the function should return Bookshelf.
Implement the getItem(String) method wich should return a Set<String>.
For the getItems("Bookshelf") the function should return the Set {"Glasses"}.
Your Implementaion should work for other data as well.
