# StatsFinal
A project encompassing everything learned in probability and statistics.

# User Manual

## Installation
In order to install our program, you first have to download the zip file of the source from above. Then you'll need to compile the source with Java whichever way you want to and run Bootstrap.java. That can be found in src\graphics. The program will then launch and you will able use it.

## Usage

### Main Menu
The main menu is where the program opens to. At the top of the panel there are buttons that will take you to different pages where you can view the related findings. General Information shows what the project was about and what sources were used while investigating the topic. Each of the chapter buttons will take you to a menu for that respective chapter, outlining what content we utilized in our research from it. Findings will display a short paper that was written to summarize what was found while researching for this project. It is not all inclusive, but touches on what we found to be the most important parts of our findings. For more in depth explanations, please see each individual chapter. Exit will simply close the program.

### Chapters
Each chapter panel contains three items in it. On the left there is a list where you can select which section of the chapter to view. In the middle there is a graphic that will contain information pertaining to that section. The right most item will be a summary or explanation in text saying what was done. Some sections' graphics will be all inclusive and contain the summaries in them. At the bottom there is a button labelled main menu that will just take you back to the main menu.

## About
### Overview
Sources for this project are [gol.gg](https://gol.gg/teams/team-matchlist/1127/split-ALL/tournament-LCS%20Spring%202021/) and [lol.fandom.com](https://lol.fandom.com/wiki/100_Thieves/Match_History). Already known information has also been used, as those who worked on this project also play League of Legends. This project was built using JavaSE-13 and the Swing library for all GUI components. This project was created for Probability and Applied Statistics, a class at University. It encompasses mostly everything covered in class, and combined with our programming knowledge we were able to create this application. All of our research and statistical calculations were done with the use of Google Sheets and Microsoft Word (for the equation editor and the formula application). When necessary, calculations were done by hand to demonstrate understanding of how to use theorems and formulas. The chapters and sections referenced in this project are those from Mathematical Statistics with Applications 7th edition.

### Software
The Java Swing library was the main component used in displaying the findings of the research. Essentially it uses one JFrame that holds the individual JPanels and whenever we "switch screens," we just make the previous one invisible and make the destination panel visible. This is a pretty easy way to simulate switching pages without opening new windows which can become messy and unorganized fairly quickly. Each JPanel uses a border layout manager that holds a JList, and two JLabels, as well as a JButton to direct the user back to the main menu. When an item is selected in the JList the two JLabels are updated to reflect what item is being used. This is done with the use of a ListSelectionListener that looks for when the selected value changes. All text information and links to images are stored in a seperate class that can be referenced in order to display the information here. The "General Information" and "Findings" pages are more simplified versions of this, as they just display the respective text in each panel, without the ability to select and change the information displayed dynamically. All text utilizes HTML tags in order to get the text to wrap correctly and implement headers and titles for each section. JLabels support the use of HTML tags within the displayed text so this was a simple solution there. The software was built as a way to show our findings in a meaningful, yet organized manner.

### Statistics
In the process of creating this project, statistics of and relating to League of Legends were investigated. When an eSports Team's statistics is viewed, it will be that of 100 Theives for the LCS Spring 2021 season. As for general game statistics, such as dragon spawns, the mechanics analyzed will be those included for and as they functioned in Season 11. Some sections have more in depth explanations on the right hand side of the screen to explain more about about the mechanics and how they work within the scope of what we were investigating.
