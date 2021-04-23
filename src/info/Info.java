package info;

public class Info {
	public static String getPaper() {
		return "<html> <h2> Findings </h2> <h3> League of Legends Statistics </h3> <h3> Tom Olandt and Kyle Sacco </h3> <p> For our project, we investigated statistics of and relating to League of Legends and when possible, the eSports team 100 Thieves. Throughout we investigate stats from LCS (League of Legends Championship Series) Spring 2021 and of mechanics for season 11. This can relate to what type rift each map can be, dragon spawns, jungle pathing and 100T performance over the 18 games of statistics that we pulled. We compiled statistics this split from gol.gg and basic information from lol.fandom.com to aid us in creating a program that summarizes all the data and utilizes content learned from each section gone over in class. This project can be found at https://github.com/Dual-Exhaust/StatsFinal. \r\n"
				+ "From Chapter One, we looked at gold, kills and towers taken per game by 100 Thieves. The most seen range of gold was between 55.4 thousand and 59.4 thousand gold at 18% of games. Just under half of the games saw a gold range between 51.4 thousand and 63.4 thousand gold. For the same games, the mean number of kills is 13.2222 with standard deviation 6.4402. With towers taken, the mean is 6.6111 with a variance of 18.2516 and standard deviation 4.2721. Demonstrated in the project is a relative frequency histogram for total gold earned by 100 Thieves which shows the information best.\r\n"
				+ "With Chapter Two, many different topics of statistics were covered. We used set notation and discrete samples as well as conditional probabilities to discuss probabilities relating to dragon spawns. There are 24 total events within the discrete sample space of the first three dragon spawns. We only looked at the first three because the third dragon to spawn decides which type of rift the current game will have. These specific statistics matter because some team compositions will benefit more with certain types of dragon rotations and rifts. It was proven that any given dragon has an equal chance of spawning first at 25%, and the probability that any two dragons A and B spawn in the order of dragon A before dragon B is also 25%. Given that a specific dragon spawned already though, the probability of a specific rift occurring is only 33.33%. Suppose 100 Thieves is playing a team composition that benefits from an early cloud drake and then a mountain soul buff or mountain rift. Using the multiplicative law of probability, we know that the chance of this happening is 8.25%. On top of this, using the additive law of probability we can calculate that the odds of the first dragon being a cloud drake or the third dragon being a mountain drake to be 41.75%. 100 Thieves can use this data to help develop their game plan going into any given match. Additionally, the Law of Total Probability can be used to find how likely 100 Thieves is to kill the first dragon based off the data from the LCS Spring 2021 split, which is approximately 73%. Knowing this, we can apply Bayes’ Rule to find out the probability of the first dragon being any specific dragon if we already know that 100 Thieves killed it. The probability that this occurs is 31%.\r\n"
				+ "We also used the Event-Composition Method to determine the probability that 100 Thieves would win a match using data from the Spring split. Side selection for LCS games is determined by one of the two teams. This is a powerful choice because it decides who gets the first/last pick of champions which can be a powerful tool. In the Spring split each team will pick sides once per opponent, and each opponent will choose sides in the other match. When given side selection this split, 100T always chose Blue side. Their opponents this split gave 100T Blue side 22.22% of the games. Using this information, it was found that 100 Thieves is 39% likely to get red side if the team to pick side selection was determined randomly with equal probability. Knowing this, we can use the win rate data from the split to help determine the likeliness that 100 Thieves will win any given game. On blue side, they won, 54.54% of games while on red side they won 71.42% of their games played. Given that the team with side selection is chosen randomly, and using the above data, it was found that the probability of 100 Thieves winning any game is about 61%. For the Spring split, 100 Thieves won 11 out of 18 games, which is 61.11%. This data matches because 100 Thieves chose sides 9 times and their opponents chose sides 9 times.\r\n"
				+ "Chapter Three discusses many different types of probability distributions that utilize discrete random variables. Again, we looked at dragon spawn data, and the likelihood that 100 Thieves will kill the first dragon. A cloud drake has the possibility of spawning first, second, third or not at all. All positions have an equal chance at 25%. Knowing this we created Y’s probability distribution where Y is the position at which the cloud drake spawns. Using the distribution, we were able to solve for the variance of Y, which is 1.25 with a mean of 1.5.\r\n"
				+ "Out of all 18 games that 100 Thieves played this split, they took first dragon 13 times. We created a binomial probability distribution, where either 100 Thieves gets the first dragon, or they don’t. Using this sample, we then solved for an estimate of the general probability p that 100 Thieves takes the first dragon in any match. This was found to be about 72.22% of the time. Using this information, we utilized a geometric probability distribution to figure out the probability that in a series of games with size n, where n >= 3, the first time 100 Thieves slays the first dragon of the match occurs in match 3. This has a 37.66% chance of happening, which is low. The odds of killing the first dragon for the first time in match 1 is about 72% and for match two it is about 52%. Killing the first dragon of the match can significantly put a team ahead of their opponent - if 100 Thieves has a higher probability of taking the first drake than their opponent, then they will have a better chance at winning the match.\r\n"
				+ "Another factor that can significantly influence the outcome of a match is the amount of farm that a team can get. A jungler's route is very important to get right. All jungle camps respawn 2 minutes after being taken last, so the goal of the jungler is to minimize uptime of each camp. Using a Poisson Probability Distribution, we found that in a two-minute time period, if the average times a jungler visits a camp is 1 time, there is a 36.8% chance that the jungler will not visits any given jungle camp. This is extremely important to know because if you know the general whereabouts of your opponent jungler, then you can combine that in game knowledge with this probability to infer which enemy camps are still up or not. From there you can make an educated decision on which camps to take on your own side (or in the enemy jungle) and change your pathing accordingly.\r\n"
				+ "In addition, the more kills a team can get, the more gold they will gain, and the better items they can buy. Teams that get a lot of kills in proportion to their opponent will have a much easier time in trying to win the game. As mentioned earlier, the number of kills per game by 100 Thieves has mean 13.2222 and standard deviation 6.4402. We can use this data in combination with Tchebysheff’s Theorem to find the minimum probability that the number of kills gotten by 100 Thieves in any game is between 6.2222 and 20.2222. This probability is at least 15.35%. \r\n"
				+ "For hypergeometric probability distributions, we could not find a set of data or mechanic within the 100 Thieves Spring 2021 dataset to model a hypergeometric probability distribution, so we used the random champion selection mechanic of League's ARAM game mode. Using this, we calculated the probability of the game selecting 10 marksman champions for the players from the total 28 marksman in the game, if all 155 champions have a potential to be picked. This came out to be a probability of 8.002*10^(-9). Basically, this is such a small possibility that it will most likely never occur. The expected number of marksmen to show up in an ARAM draft is 1.81 if every champion has an equal chance of getting drafted.\r\n"
				+ " As far as Chapter 4 goes, we could not find any relevant topics that could be modeled by a uniform probability distribution from our dataset, or league of legends in general, as most things are based on performance, not probability, or are discrete occurrences.\r\n"
				+ "This paper is merely a summary of all the work put into this project. It is not all inclusive, as the project itself is, but it is a good reference for our findings while investigating League of Legends and the eSports team 100 Thieves. All images, graphs, equations, and explanations of the data created for and used in the project can be found inside the project itself.\r\n"
				+ " This paper is being compiled into the project itself for ease of reference." + "</p> </html>";
	}

	public static String getGeneralInfo() {
		return "<html> <h2> General Information </h2> <p> In the process of creating this project, statistics of and relating to League of Legends are investigated."
				+ " When an eSports Team's statistics is viewed, it will be that of 100 Theives for the LCS Spring 2021 season. As for general game statistics, such"
				+ " as dragon spawns, the mechanics analyzed will be those included for and as they functioned in Season 11. Some sections have more in depth explanations"
				+ " on the right hand side of the screen to explain more about about the mechanics and how they work within the scope of what we are investigating. We used <a href='https://gol.gg/teams/team-matchlist/1127/split-ALL/tournament-LCS%20Spring%202021/'>gol.gg</a> "
				+ "and <a href='https://lol.fandom.com/wiki/100_Thieves/Match_History'>lol.fandom.com</a> as main sources for this project. We also used general information that we already knew about the game, considering that we both are degenerates and play this game too much. </p> </html>";
	}

	// Chapter One Info
	// =================================================================================
	public static String getChapterOneIntro() {
		return "<html> <h2> Introduction </h2> <p> In Chapter One we covered a few different basic aspects of statistics. In our examples we used a relative frequency"
				+ " histogram to display average gold per game, and also display data about mean, standard deviation and variance with regards to kills per game and "
				+ "towers taken per game. </p> </html>";
	}

	public static String getChapterOneTwo() {
		return "<html> <h2>1.2 Characterizing a Set of Measurements: Graphical Methods </h2> <p> To the left is a relative frequency histogram displaying gold per "
				+ "game earned, including playoff games. It is noted that about 18% of games the gold earned by 100 Thieves is between 55.4K and 59.4K. Just under "
				+ "half of the games played, gold earned was between 51.4K and 63.4K. </p> </html>";
	}

	public static String getChapterOneThree() {
		return "<html> <h2>1.3 Characterizing a Set of Measurements: Numerical Methods </h2> <p> We covered basic statics concepts such as mean, standard devation "
				+ "and variation. We used both formulas (calculating them by hand) and also the built in functions included with Google Sheets. The number of towers"
				+ " taken per game is 6.6111 on average with a variance of 18.2516 and a standard deviation of 4.2721. The mean amount of kills per game is 13.2222."
				+ "To the left is the data used for these calculations - (Function) refers to a Google Sheets function being used where (Calculation) refers to the "
				+ "hand calculation instead. </p> </html>";
	}

	public static String getChapterOneSummary() {
		return "<html> <h2>Summary</h2> <p>Essentially this chapter just covered how to characterize different sets of measurements. We used data from 100 Thieves games"
				+ " to create a relative frequency histogram as well as calculate some general statistics. It was found that in just under half the amount of games "
				+ "played by 100 Thieves the collective amount of gold earned was between 51.4K and 63.4K. The mean amount of kills per game by the team was 13.2222 and "
				+ "towers taken on average was 6.6111. The towers taken data has a variance of 18.2516 and a standard deviation of 4.2721. </p> </html>";
	}

	// Chapter Two Info
	// =================================================================================
	public static String getChapterTwoIntro() {
		return "<html> <h2> Introduction </h2> <p> In Chapter Two we covered multiple topics in relation to probability ranging from set notation to random sampling. </p> </html>";
	}

	public static String getChapterTwoThree() {
		return "<html> <h2> 2.3 A Review of Set Notation </h2> <p> Set notation was a fairly short topic covered in the text. Depicted is a set of all the possible"
				+ " combinations of dragon spawns possible for the first three dragons, as well as two sets that show the possible ways a Mountain Soul is the Dragon "
				+ "Soul for the match and the ways that no Mountain Dragon spawns at all. The third dragon determines the map and all dragon spawns afterwards will be "
				+ "of the same type until one team gets a soul point (by killing four dragons). The type of dragon soul is determined by the dominant type of dragons"
				+ " slain in the four dragons that a team kills, which is the type of the third dragon spawned. </p> </html>";
	}

	public static String getChapterTwoFour() {
		return "<html> <h2> 2.4 A Probabilistic Model For an Experiment: The Discrete Case </h2> <p> In 2.3 we take a look at the probability that the first dragon would "
				+ "be an ocean drake. We use set notation in combination with a sample space of the possible combinations that the first three dragons can spawn. 6 of the "
				+ "24 possible combinations had the ocean drake first, making the probability 25%. </p> </html>";
	}

	public static String getChapterTwoFive() {
		return "<html> <h2> 2.5 Calculating the Probability of an Event: The Sample Point Method </h2> <p> Here we took a look at the probability of a mountain drake"
				+ " spawning after a cloud drake. After inspecting all the sample-points it was found that there were 6 events out of the 24 total that which this occured, meaning that there"
				+ " is a 25% chance of a mountain drake spawning after a cloud drake. </p> </html>";
	}

	public static String getChapterTwoSix() {
		return "<html> <h2> 2.6 Tools for Counting Sample Points </h2> <p> Each game of competitive League of Legends begins with a draft of 20 champions, with "
				+ "each team getting five bans and five picks. The draft occurs such that the team playing on the blue side of the map begins by banning a single champion,"
				+ " followed by the red team banning one champion, and alternating until six have been banned. Then the blue team selects one champion to lock in for play,"
				+ " followed by two picks for the red team, two more picks for the blue team and another pick for the red team. Then the draft goes back to banning with both"
				+ " team alternating bans starting with the red team until four more champions have been banned from the game. The draft finishes with the red team locking"
				+ " in another champion, then blue choosing its final two, and the red team closing it out with the final pick.\r\n"
				+ " <br> <br> For this season of the LCS there were 153 available champions to play. The total permutations of 20 champions chosen from the available 153 is "
				+ "1.35e+43 which means there are this many unique draft orders. This is just the draft though, and after the draft the order which champions were chose in no"
				+ " longer matters as the game is simply 10 champions, so we can narrow down the number of unique games by taking the number of unique sets of bans, multiplied "
				+ "by the number of unique sets of picks. The number of combinations where 10 champions are selected from the pool of 153 is 1.43e+15, while the number of combinations"
				+ " of 10 champions from the remaining 143 is 7.14e+14. This means that total there are 7.14e+30 ways in which the 20 champions can be picked and banned each match. \r\n"
				+ " <br> <br> The likelihood of picking or banning one champ is not the same as any other, as each champion holds different values to teams based on stats,"
				+ " players, synergies, and overall game balance. Evidence of this is that 4 champions had a 100% presence (either picked or banned) in the drafting phase "
				+ "of all 18 of 100Thieves’ games this split, Udyr, Olaf, Renekton, and Kai’sa. The reason for this is that these champs are considered strong in the game "
				+ "currently, and/or players on 100T’s team are well known for success on these champs. Given the information that these champs will be present in all 100T’s "
				+ "drafts, we reevaluated our calculation for unique drafts to find that there would only be 7.15e+40 unique possible drafts. We got to this number by taking "
				+ "the total combinations of 4 draft spots, to which these 4 champs would end up, multiplied by how many permutations of these champs there are to slot into "
				+ "those spots, multiplied by how many permutations of the 16 champs selected from the remaining 149 in the pool. This is still a very large number of unique drafts,"
				+ " however it is only .53% of the original drafts.</p> </html>";
	}

	public static String getChapterTwoSeven() {
		return "<html> <h2> 2.7 Conditional Probability and the Independence of Events </h2> <p> With conditional probability we are able to inspect events given something has already happened. "
				+ "Given that the first dragon is an infernal drake, we solve here for the probability of an ocean rift occuring. Using the formula for conditional probability we were able to "
				+ "find that the probability of it occuring was about 33.33%. Of the five games that 100T played where infernal drake came first, 0 were ocean rifts.</p> </html>";
	}

	public static String getChapterTwoEight() {
		return "<html> <h2> 2.8 Two Laws of Probability </h2> <p>  </p> </html>";
	}

	public static String getChapterTwoNine() {
		return "<html> <h2> 2.9 Calculating the Probability of an Event: The Event-Composition Method </h2> <p> </p> </html>";
	}

	public static String getChapterTwoTen() {
		return "<html> <h2> 2.10 The Law of Total Probability and Baye's Rule</h2> <p> </p> </html>";
	}

	public static String getChapterTwoSummary() {
		return "<html> <h2> Summary </h2> <p> Chapter 2 mainly focuses on basic probabilities, and how to express them. It includes topics such as set notation, permutations/combinations, "
				+ "conditional probability and similar areas of statistics. For most of the sections we used examples regarding how dragons spawn in League of Legends to demonstrate how to "
				+ "calculate probabilities and the usefulness of knowing these probabilities. We chose this statistic because it is one of few League of Legends mechanics that is random, and "
				+ "not based on performance. For example, we used this data to evaluate how effective 100T are at capturing the first dragon in a game over the season and determined that there "
				+ "was a 71% likelihood that 100T would kill the first dragon in a game. We also noted that if a team were selected at random to choose a side for each game 100T would be likely "
				+ "to play on the blue side for 61% of games. This is an impactful statistic, because blue side is generally considered to have an advantage because the map is more intuitive,"
				+ " and it affords the team the first pick in the draft. We used various laws of probability, such as the multiplicative law and Bayes’ rule to express the probability of "
				+ "different dragon rotations occurring, and how this information could be helpful to the team for drafting purposes. </p> </html>";
	}

	// Chapter Three Info
	// =================================================================================
	public static String getChapterThreeIntro() {
		return "<html> <h2> Introduction </h2> <p> Chapter 3 introduces a wide range of probability distributions that can all be used for different situations."
				+ "We analyze different statistics using these distributions and theorems to explore randomly selected players, jungle pathing, and drake spawns. </p> </html>";
	}

	public static String getChapterThreeTwo() {
		return "<html> <h2> 3.2 The Probability Distribution for a Discrete Random Variable </h2> <p> If there are 11 players total to randomly select from, "
				+ "then the sample space consists of 462 possible combinations and due to random sampling there is an equal chance of getting any specific combination. "
				+ "This means that we can calculate the probability distribution of Y, the number of LCS starters in the selected team. We multiply the combination of how "
				+ "many LCS starters there are selected by the combination of how many non LCS starters there are selected and divide it by the total number of combinations "
				+ "which is 462. We do this for Y = 0, 1, 2, 3, 4, 5. Note that the most common team compositions would include only 2 or 3 LCS starters.</p> </html>";
	}

	public static String getChapterThreeThree() {
		return "<html> <h2> 3.3 The Expected Value of a Random Variable or a Function of a Random Variable </h2> <p> The probability of a Cloud Drake spawning at any given "
				+ "position y = 0, 1, 2, 3 is equal for every position. We can find the mean using this, and then in turn obtain the variance of Y using theorem 3.6. "
				+ "The variance for this probability distribution is 1.25. </p> </html>";
	}

	public static String getChapterThreeFour() {
		return "<html> <h2> 3.4 The Binomial Probability Distribution </h2> <p> Using a sample of 18 games from 100T's we can estimate the general probability of them taking"
				+ " the first dragon in any given game. They took the first dragon in 13 out of 18 games, so we found the probability of that occuring and solved for p, the general"
				+ " probability. After using natural logs and deriving with respect to p, it was found that the general probability of 100T getting the first dragon is 0.7222. </p> </html>";
	}

	public static String getChapterThreeFive() {
		return "<html> <h2> 3.5 The Geometric Probability Distribution </h2> <p> Using the general probability estimate from 3.4, we were able to calculate the probability of the first time "
				+ "100T gets the first dragon being in the third game they play in a series of five games. We used the probabilities for if it were in the first game and second game to calculate this. "
				+ "It was found to be a lower chance, at 37.66%.</p> </html>";
	}

	public static String getChapterThreeSeven() {
		return "<html> <h2> 3.7 The Hypergeometric Probability Distribution </h2> <p> We couldn't find a set of data or mechanic within the 100T Spring 2021 dataset to model a hypergeometric probability "
				+ "distribution, so we used the random champion selection mechanic of League's ARAM gamemode. Using this, we calculated the probability of the game selecting 10 marksman champions for "
				+ "the players from the total 28 marksman in the game, if all 155 champions have a potential to be picked. This came out to be a probability of 8.002*10^(-9). Basically, this is such a "
				+ "small possibility that it will most likely never occur. "
				+ "The expected number of marksmen to show up in an ARAM draft is 1.81 if every champion has an equal chance of getting drafted.</p> </html>";
	}

	public static String getChapterThreeEight() {
		return "<html> <h2> 3.8 The Poisson Probability Distribution </h2> <p> We have to assume that Y possesses a Poisson Probability Distribution, and since we want to find the "
				+ "probability of a jungler missing any given camp in the 2 minute time period we use Y = 0. Substituting our mean in for lambda gives us an equation that we can plug "
				+ "Y into to find the probability of any given number of visits in the 2 minute time period. Plugging in 0 gives us a 36.8% chance that the jungler misses any given camp"
				+ " in a 2 minute period of time.</p> </html>";
	}

	public static String getChapterThreeEleven() {
		return "<html> <h2> 3.11 Tchebysheff's Theorem </h2> <p> Using kills per game data, it was found that the mean amount of kills per game by 100T is 13.2222 with a standard "
				+ "deviation of 6.4402. Using this data we can use Tchebysheff's Theorem to estimate the bottom line probability that the number of kills in any given match is between"
				+ " 6.2222 and 20.2222. This probability is at least 15.35%. </p> </html>";
	}

	public static String getChapterThreeSummary() {
		return "<html> <h2> Summary </h2> <p> In Chapter 3, we covered a lot of different probability distributions and were able to relate them to 100T and their performance in LCS Spring 2021. "
				+ "It was found that they have a very high chance of taking the first dragon in the match as well as having about a third of a chance that any jungler would miss a given camp in a two "
				+ "minute period. Tchebysheff's also allowed us to figure out that there is at least a 15.35% chance that the amount of kills gotten by 100T is between 6.2222 and 20.2222. </p> </html>";
	}

	// Chapter Four Info
	// =================================================================================
	public static String getChapterFourIntro() {
		return "<html> <h2> Introduction </h2> <p> In Chapter 4 we take a look at continuous random variables and the statistics that we can relate to them. </p> </html>";
	}

	public static String getChapterFourTwo() {
		return "<html> <h2> 4.2 The Probability Distribution for a Continuous Random Variable </h2> <p> In 3.2 we solved for a probability distribution of Y, the number of LCS players randomly"
				+ " selected to be on a team. Given this probability distribution we can now find F(Y), the distribution function of Y, and it is depicted to the left. We have also shown this "
				+ "distribution function graphically. </p> </html>";
	}

	public static String getChapterFourSummary() {
		return "<html> <h2> Summary </h2> <p> In 4.2 we took a look at distribution functions for continuous variables and created one ourselves. We couldn't find any relevant topics that could be modeled "
				+ "by a uniform probability distribution from our dataset, or league of legends in general, as most things are based on performance, not probability, or are discrete occurances.</p> </html>";
	}
}
