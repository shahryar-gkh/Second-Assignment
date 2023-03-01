# **Second Assignment Report**

- Mohammad Golkhorshidi
- 401222117

## Introduction

- This assignment was about getting weather data through a weather website's API. The main purpose was to figure out how git works and how data is stored in JSON files.
- For completing this assignment, it was needed to have some basic information about the famous version control system, git. Git is a very useful tool in programming, specially in bigger projects and the ones in which you need to work with other people to complete a project. Another approach in this assignment was getting familiar with two well-known package managers, Maven and Gradle. Lastly, it was required that we learn how data is stored in JSON and how we can access that data.

## Design and Implementation

- Most part of the code was already written. We needed to first fork the assignment and then clone it from GitHub into our own local computer. The program needed an API key from the weather API to get the weather data. The type of data it returned needed to be converted into a JSON format. After getting the data and displaying it on the screen, it was time to add and commit those changes on git and then finally push it to our remote repository, aka GitHub.
- The main challenge of this project was understanding the real concept of git and learning how to actually work with it. There were also some parts that could get a little confusing like getting an SSH key and creating that connection between your local machine and your remote repository. But thanks to Google and YouTube, there's nothing you can't find the solution to!

## Testing and Evaluation

 - The thing that was slowing me down the most was probably the part where I had to figure out how git works. For example, I kept getting errors in the process of creating an SSH key. I kept assigning a name to the key when I was first creating it in Git Bash, and it turned out that I had to name it later in GitHub and everything worked just fine after that! Adding branches was also a bit confusing and I had to watch a separate course on YouTube just for that.
 - One thing to keep in mind was that the data received from the weather API had a string data type. In order to access different parts of that data, it was best to have it in JSON format, so you could easily work with the keys and get any values you wanted. But overall, working with JSON was surprisingly easy and I didn't run into any serious errors that I could point out right now.

## Conclusion

- Git is a widely used version control system that helps programmers code more efficiently. It is necessary for computer science students to at least learn the basics of git, its commands, and GitHub.
- This program can get the name of a city as an input, and it will get the weather data from the weather API in the form of a string which gets converted into a JSON format. You can see that city's temperature in Celsius, humidity, and the wind's speed and direction in Kilometers per hour. This could've been way more user-friendly if it had a graphical user interface; but other than that, the program does what it's supposed to do.