**Simple Greeting Interface**\
Creator: Michelle Nguyen\
Language: Java\
Date of Completion: 2024-07-31

Description:\
Enter a name and a text with a greeting and your name will appear.

Running the File on my End:

1. Using Eclipse and the .java File\
Make sure JavaFX is installed as a library.\
Make sure VM arguments lead to your JavaFX lib files.

2. Using the .jar and .bat File\
Make sure that these two files are in the same directory.\
Edit the .bat file in notepad, and remove the [Insert the path to the JavaFX SDK \lib]. Replace it with the directory address to where your JavaFX SFK \lib is.

The Format for the .bat File:\
java [JavaFX VM Argument] -jar [File Name].jar

Example:\
java --module-path "C:\Users\Steve\Desktop\Java\openjfx-21.0.4_windows-x64_bin-sdk\javafx-sdk-21.0.4\lib" --add-modules javafx.controls,javafx.fxml -jar Greeting.jar

Note:\
I've been trying to figure out how to make a runnable .exe version where I can just double-click to launch the project.\
I think there's something wrong with how my project is exported on Eclipse, which I believe that it does not export my JavaFX library.\
Suggestions I've seen from similar problems is to use Maven as they're supposedly more equipped for projects like this. For now, I'm using the .bat file to run it as a double-click.
