# Arithmetic_Calculator_App
Trying to make a calculator app to learning how to use Android Studio for the first time!

## What is accomplished
* In 5 hours, I managed to put together a (REALLY) simple calculator that only works on basic arithmetic (add, subtract, multiply, divide). 
* It only works on positive integers and only 1 operation can be done at a time.

## If I were to continue this
* I want to make it work with negative numbers including decimals
* I want to make it work on more than 1 operation i.e. "5 + 2 + 7 * 3 / -1"
* Make the interface look prettier (Right now is only the basic template)

## What I learned
* Read the documentation first
* Haha! I spent the first hour trying to learn XML but it turns out I could just drag and drop the buttons and text boxes on Android Studio's activity_main.xml and they'll do it for you (this would save me time if I was using android studios in a hackathon)
* The hard part was figuring out how to connect the buttons from the xml to the java file, (using `binding` allows us to refer to widgets (buttons, textview) directly) 

### Other notes:
* In the activity_main.xml file, I had to use an outer <tag> </tag> around the initial setup to use `binding`
* MainActivity.java has all the code that connects to the widgets
* I Tried uploading all the files to github (intermediates) but some were hidden or made github crash when I tried uploading them.
