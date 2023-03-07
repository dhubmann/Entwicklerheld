Summary
The elevator is broken again and Holly has to take the stairs to get to her office on the seventh floor. 
While she climbs the stairs, a nice task for her colleagues' lunch break comes to her mind: A staircase with n steps is to be climbed to the top by one person. 
The person may take either one or two steps at a time. How many different ways are there to get to the top?

Scenario 1: Look at the core of the problem
At first you should be aware that both a negative number of stairs and none stairs result in 0 ways.
Let's move on and look at a small number of stairs. Given is numberOfStairs = 1.
You just can take the one stair, so the result of your function should be 1.
Now given is numberOfStairs = 2.
Either you go both steps at once or one at a time. So your function should return 2.

Scenario 2: More stairs!

Given is numberOfStairs = 3.
As you can see on the image, there are 3 different ways to reach the top. So your function should return 3. 
This should work with other numbers as well.