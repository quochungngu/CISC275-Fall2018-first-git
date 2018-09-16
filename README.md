# CISC275-Fall2018-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?

Three dogs, an ArrayList<Dog>, and a Comparator<Animal>.

3. Can you spot the comparator constructor call? Where is the class definition for the comparator?

The comparator call is below the between the first 2 println(dogs). The class definition is in Collections.sort(dogs, new [class definition]) call itself. You made an anonymous class that follows the Comparator interface.