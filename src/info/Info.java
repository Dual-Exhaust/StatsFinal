package info;

public class Info {
	public static String getGeneralInfo() {
		return "<html> <h2> General Information </h2> <p> In the process of creating this project, statistics of and relating to League of Legends are investigated."
				+ " When an eSports Team's statistics is viewed, it will be that of 100 Theives for the LCS Spring 2021 season. As for general game statistics, such"
				+ " as dragon spawns, the mechanics analyzed will be those included for and as they functioned in Season 11. </p> </html>";
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
		return "<html> <h2> 2.4 A Probabilistic Model For an Experiment: The Discrete Case </h2> <p> </p> </html>";
	}

	public static String getChapterTwoFive() {
		return "<html> <h2> 2.5 Calculating the Probability of an Event: The Sample Point Method </h2> <p> </p> </html>";
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
		return "<html> <h2> 2.7 Conditional Probability and the Independence of Events </h2> <p> </p> </html>";
	}

	public static String getChapterTwoEight() {
		return "<html> <h2> 2.8 Two Laws of Probability </h2> <p> </p> </html>";
	}

	public static String getChapterTwoNine() {
		return "<html> <h2> 2.9 Calculating the Probability of an Event: The Event-Composition Method </h2> <p> </p> </html>";
	}

	public static String getChapterTwoTen() {
		return "<html> <h2> 2.10 The Law of Total Probability and Baye's Rule</h2> <p> </p> </html>";
	}

	public static String getChapterTwoSummary() {
		return "<html> <h2> Summary </h2> <p> </p> </html>";
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
				+ "100T gets the first dragon being in the third game they play in a series of five games. We used the probabilities for if it were in the first game and second game to calculate this."
				+ "It was found to be a lower chance, at 37.66%.</p> </html>";
	}

	public static String getChapterThreeSeven() {
		return "<html> <h2> 3.7 The Hypergeometric Probability Distribution </h2> <p> </p> </html>";
	}

	public static String getChapterThreeEight() {
		return "<html> <h2> 3.8 The Poisson Probability Distribution </h2> <p> We have to assume that Y possesses a Poisson Probability Distribution, and since we want to find the "
				+ "probability of a jungler missing any given camp in the 2 minute time period we use Y = 0. Substituting our mean in for lambda gives us an equation that we can plug "
				+ "Y into to find the probability of any given number of visits in the 2 minute time period. Plugging in 0 gives us a 36.8% chance that the jungler misses any given camp"
				+ "in a 2 minute period of time.</p> </html>";
	}

	public static String getChapterThreeEleven() {
		return "<html> <h2> 3.11 Tchebysheff's Theorem </h2> <p> </p> </html>";
	}

	public static String getChapterThreeSummary() {
		return "<html> <h2> Summary </h2> <p> In Chapter 3, we covered a lot of different probability distributions and were able to relate them to 100T and their performence in LCS Spring 2021. "
				+ "</p> </html>";
	}

	// Chapter Four Info
	// =================================================================================
	public static String getChapterFourIntro() {
		return "<html> <h2> Introduction </h2> <p> </p> </html>";
	}

	public static String getChapterFourTwo() {
		return "<html> <h2> 4.2 The Probability Distribution for a Continuous Random Variable </h2> <p> In 3.2 we solved for a probability distribution of Y, the number of LCS players randomly"
				+ " selected to be on a team. Given this probability distribution we can now find F(Y), the distribution function of Y, and it is depicted to the left. We have also shown this "
				+ "distribution function graphically. </p> </html>";
	}

	public static String getChapterFourThree() {
		return "<html> <h2> 4.3 Expected Values For Continuous Random Variables </h2> <p> </p> </html>";
	}

	public static String getChapterFourFour() {
		return "<html> <h2> 4.4 The Uniform Probability Distribution </h2> <p> </p> </html>";
	}

	public static String getChapterFourSummary() {
		return "<html> <h2> Summary </h2> <p> </p> </html>";
	}
}
