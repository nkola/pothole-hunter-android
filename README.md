# Pothole Hunter Android
This repository hosts the android application for the pothole hunter project.

## About Pothole Hunter
Pothole Hunter is a system that allows the citizen of a city to capture and report pothole to the city authorities
This project is in active development with the help from volunteers from [nkola](www.nkola.com) 

The Pothole Hunter application has both mobile and web interfaces that interact with a backend API. A mobile phone will be used 
by anyone to register a pothole and upload it to the backend system that us accessible by the city authorities.

## Information for Contributors
Stories for the Pothole Hunter project (api, android, web) are tracked as Github issues in the 
[tracker repository](https://github.com/nkola/pothole-hunter-tracker/issues) you can also look at the story board [here](https://waffle.io/nkola/pothole-hunter-tracker)

### Project Setup
We are currently targeting Android API 19 (4.0.0)

#### Setup Pre-requisites
This project requires;

* JDK 1.7 and above
* Maven 3.2 and above

#### Setup Android SDK

* Download the [android sdk](http://developer.android.com/sdk/index.html#Other) from the android developer website and unzip the same.
* Open the android sdk manager and install the following items;
    * Platform Tools
    * Build Tools
    * Extras
        * Android support library
        * Android Maven Repository
    * Android API 19 (including the system images)
* Set ```ANDROID_HOME```  environment variable to the path of the android sdk

#### Setup Android Emulator
We recommend using [Genymotion](http://www.genymotion.com/)

#### Building from the Command Line
* Run ```mvn clean package``` from the project folder to test whether everything is working properly. This will build the APK inside the 
```app/target``` folder.
* Run ```mvn android:deploy android:run``` to deploy and the run the generated apk to the emulator

#### IDE setup
##### Intellij Idea 14 Community Edition

* Simply import: File > Open Project and select ```pom.xml```, and the Maven project will be automatically imported 
along with the maven sub-modules (app and integration-tests). For more information on how to do this [http://www.jetbrains.com/idea/webhelp/importing-project-from-maven-model.html]
 
* Intellij comes with default android support, so once the project is imported, configure the android framework when prompted to.