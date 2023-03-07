SUMMARY
On Halloween night you thought you had a great idea. You went to the office to continue working on your project undisturbed. 
But what you didn't expect - the new intern Phil is also there! He is a beginner programmer and is just about to learn JavaScript. 
He stumbled upon some strange things and now asks you to help him.

OBJECTIVE
In our Halloween Challenge this year you have to find common bugs in JavaScript. Use the code that is given and try to make as few changes as possible. 

SCENARIO 1: Just a small mistake
Phil describes that a JSON file is given with a recipe of a cake. With this JSON he tries to do some more or less useful things.
The howLongDoesItTake method takes all given times per step and add it to get the total time, the cake need to be ready.
But the result is much smaller than expected. Where is the mistake?

SCENARIO 2: Grandma's advice
Phil's grandma told him to add one egg to the recipe. This will lead to a better consistence of the cake. In this method, in which he wants to return the quantity of a single ingredient from the cake (we ignore the buttercream here), he adds a condition to take into account the advice of his grandmother.
So he implemented a condition in getQuantityOfIngredient which add one egg and returns the total amount of eggs for a certain amount of cakes.
This sounds easy but the method returns way to many eggs! Why?

SCENARIO 3: Purchase List
Basically there are 2 recipes, one for the cake, one for the buttercream. However, since there are ingredients that appear in both recipes, Phil wants to create an ingredient list that summarizes everything. You look at its code and wonder how a beginner can write such code. Apparently he was browsing a forum, but he missed a little something.
The method getPurchaseList stores the respective ingredients with their quantity in an object.
For this purpose, it is tested whether an ingredient is present in both ingredient lists (of the cake and the buttercream) and then their quantities are added.
But something is wrong. The wrong object is returned with only one entry.

SCENARIO 4: Difficult or not?
Next, Phil wants to design some kind of difficulty level for the cake. For this he uses the object times, which indicates the respective time for a step. This object contains a list of times for each of the 2 recipes, which are in the same order as the steps.
Depending on the time, the individual steps are divided into super easy, easy, medium, difficult and hard.
The result in calculateDifficulty is almost correct, but not quite!
