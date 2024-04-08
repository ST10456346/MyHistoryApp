Purpose 

An old friend of Jack requested me to build an application. He is a history science-based teacher who is working on a project for a school presentation. 
He requested for an application where a user will input an age, and generate, then the application would be able to display the user age and information provided with it. 
 
The purpose of the application is to enhance the students with the necessary skills, tools and knowledge of the greatest people who have ever lived and had an impact in our lives. Basically, it is used for educational purposes. 

Intuitive Design

The design is easy to follow as there is not much detail onto the design itself and used all the necessary attention to detail. As to putting more detail would have been a lot more difficult and complicated to understand and read.

Content Prioritization 
 
Yes, the application has all the necessary interface elements. These content elements are much more important as they are the face of the app, and they would need to interact with the user and the content which would be displayed. The content which is displayed is very important as it would interact with the user and what they would want displayed.
 
Legible Text Content

Yes, the font I chose is easier to read and you would normally find the font as a suggested font for many app builders. The font which is an Aptos (body), which displays information easily to read and is gradually exceptional especially under dim light or anywhere in the darkness. 
White texts are used throughout the buttons as their functions are to generate and clear information as they should be seen clearly and visibly. 
 
Make Interface Elements Cleary Visible
Yes, the user would be able to see all components on the screen and there is enough padding. The app is well spaced, and it has enough room to display the information and the user to see all the functionality the application does. The app would not be able to confuse the user because it has an exceptional and it is clean interface. 
 
Hand position Controls

No, the buttons are widely spaced with bold text for the user to quickly notice and could interact with them, which they basically display the functionality of each one of them. They are widely spaced so that the user cannot clash the buttons or make a mistake of pressing the incorrect button that would greatly process the incorrect information on the application. Images  
The images I chose are those of the application which would correspond with the age the user would be inputting. The images selected are those that the application would specifically want to display, when entering the age of the corresponding character and the information about the image. The images serve as a clear and additional indication of who the app is specially displaying. 

 GitHub Repository
 
1. Create a New GitHub Repository:
Go to the GitHub website (https://github.com/) and sign in to your account.
Click on the "+" icon in the top right corner and select "New repository".
Give your repository a name (ST10456346- Bulelani), add a description (Assignment 1) and choose public.
Click on the "Create repository" button.
2. Initialise the Repository with a README File:
After creating the repository, you'll see an option to "Initialize this repository with a README". Check this option to create a README file.
Click on the "Create repository" button to finalize the creation of the repository.
3. Commit and Push Your Project Files to the GitHub Repository:
In Android Studio, go to VCS (Version Control System) -> Import into Version Control -> Share Project on GitHub.
Log in to your GitHub account if prompted, and select the repository you created earlier.
Click on the "Share" button to push your project files to the GitHub repository.
4. Regularly Commit and Push Your Code as You Make Progress:
After the initial push, continue making changes to your project in Android Studio.
Whenever you make significant progress or changes, commit your changes locally in Android Studio using VCS -> Commit Changes.
Once committed, push your changes to the GitHub repository using VCS -> Git -> Push.

Testing and Automated Testing:
1. Conduct Manual Testing:
Manually test your app to ensure it functions seamlessly and offers an enjoyable educational experience for learners.
To test various features and user interactions do the following:
1. Create a New Test Class:
In your Android project, navigate to the tests directory (or create it if it doesn't exist).
Create a new Kotlin file for your test class. Name it appropriately to indicate what component or functionality you are testing.
2. Write Test Methods:

Inside the test class, write test methods like the example below.
3. Use assertions to verify the expected behaviour of your code.
4. Run the Tests:
Run the tests using the testing framework's tools provided by Android Studio or through the command line.
Sample of a test class using JUnit:

import org.junit.Assert.*
import org.junit.Test

class MyUnitTest {

    @Test
    fun testWhenStatement() {
        // Test case for a when statement
        val result = when (56) {
            56 -> Adolf Hitler was chancellor of Germany from 1933 to 1945, serving as dictator and leader of the Nazi Party, or National Socialist German Workers Party, for the bulk of his time in power.
            34 -> Ricky was a South African rapper, producer, singer, songwriter, and fashion designer who rose to mainstream fame from his hit single Nafukwa was released in 2014.
            74 -> Muhammad Ali was a boxer, philanthropist, and social activist who is universally regarded as one of the greatest athletes of the 20th century.
            else -> "Nobody famous known to me died at this age"
        }
        
        assertEquals("Nobody famous known to me died at this age", result)
      }

    }
2. GitHub Actions for Automated Testing:
Set up GitHub Actions to automatically run tests and build your code whenever changes are pushed to the repository.
Create a GitHub Actions workflow (.github/workflows/tests.yml) to run tests automatically on every push:
Create a .github/workflows directory in your project repository.
Inside this directory, create YAML files defining your GitHub Actions workflows for testing and building.
Sample GitHub Actions Workflow for Testing (tests.yml):
name: My History App

on: [push]

jobs:
  test:
    runs-on: ubuntu-latest

    steps:
      - name: Set up JDK
        uses: actions/setup-java@v2
        with:
          distribution: 'adopt'
          java-version: '11'

      - name: Check out code
        uses: actions/checkout@v2

      - name: Build and test
        run: ./gradlew test

Set Up Automated Build:
Create a GitHub Actions workflow (.github/workflows/build.yml) to build the APK automatically on every push.
Sample GitHub Actions Workflow for Building (build.yml):
name: Build APK

on: [push]

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
      - name: Set up JDK
        uses: actions/setup-java@v2
        with:
          distribution: 'adopt'
          java-version: '11'

      - name: Check out code
        uses: actions/checkout@v2

      - name: Build APK
        run: ./gradlew assembleDebug
Test your workflows by pushing changes to your repository and observing the actions running in the "Actions" tab on GitHub.

                  ST10456346/MyHistoryApp: Assignment task 1 IMAD (github.com)


 
                                                 YOUTUBE VIDEO LINK
                                                 
                  https://youtube.com/watch?v=OK0bUXMSJkA&si=WnUHKIN0m6_r73yC
                           
                                                   Reference List
                                                   

Anon., 2020. Bibliography. [Online] 
Available at: https://www.biography.com/scientists/isaac-newton
[Accessed 15 March 2024].

Anon., 2021. Biography. [Online] 
Available at: https://www.biography.com/political-figures/adolf-hitler
[Accessed 15 March 2024].

Anon., 2021. Biography. [Online] 
Available at: https://www.biography.com/musicians/biggie-smalls
[Accessed 15 March 2024].

Carson, D. L. L. C., 2024. Britannica. [Online] 
Available at: https://www.britannica.com/biography/Martin-Luther-King-Jr
[Accessed 18 March 2024].

Editors, T., n.d. TheFamousPeople.com. [Online] 
Available at: https://www.thefamouspeople.com/profiles/eazy-e-6545.php
[Accessed 15 March 2024].

Mkhize, V., 2022. BBC News. [Online] 
Available at: https://www.bbc.com/news/world-africa-60575866
[Accessed 15 March 2024].

Piccotti, B. e. a. T., 2023. Biography. [Online] 
Available at: https://www.biography.com/actors/robin-williams
[Accessed 15 March 2024].


