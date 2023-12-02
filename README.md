# Coin_Toss_Simulation_Visualization
 
This is a program that provides a visualization of a coin toss simulation, more specifically tossing 2 separate coins counts as a trial. When the program is ran, the user will be asked to input a number representing how many trials should occur.

Before running the program, compile the necessary files using the command: javac *.java

Once compilation is complete, run the program by using the command: java CoinSimViewer.java

The startercode folder includes all of the java files that I used as foundation to create the coin toss simulation viewer.


**Notes**:
- Bugs appeared during the process of completing the assignment. However, my whole program works free of any known bugs. Some bugs that I ran into during the process of completing this project had to do a lot with the graphical aspect of this project. Bugs occurred specifically in the CoinSimComponent.java file. Much of it just had to do with my scaling component as well as figuring out the position of both the bar and the label itself.

- As the number of trials increase in number, you can notice that the probabilities of each outcome begin to converge. The probabilities of two heads is ~25% (1/4), two tails ~25% (1/4), and one head & one tail is ~50% (1/2). One head & one tail is roughly 50% because of the following math:
There are two instances where we increase the denomination count of one head & one tail: (1) Head & Tail OR (2) Tail & Head. For (1), the probability of getting heads is 1/2 and the probability of getting tails is 1/2, which comes out to a probability of 1/4 to get the result of (1). Similarly for (2), the probability of getting tails is 1/2 and the probability of getting heads is 1/2, which comes to a probability of 1/4 to get the result of (2). Then, we add them up (1/4 + 1/4) = 1/2 for the total probability result of this denomination.

- For my program, roughly 5000 trials are necessary to mostly get results within 1% of these probabilities.

- The largest value of trials I did before an overflow error is roughly 2.14 billion. I tried the maximum number that can be represented as an int, specifically 2147483647; this ended up running for my program without running into any bugs. Then, I tried 2147483648 (1 more than the maximum) to which I got an overflow error. 