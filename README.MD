Dear mates!
This is one of my first JAVA    projects, so I'd appreciate if you follow these steps to run it locally.
REQUIREMENTS:
- JDK 11
- TOMCAT APACHE 9.0
- MYSQL
- and a high spirit with luck...

STEPS
1. In the class ConnectionUtil on the lines from 10 to 12 type in your DB credentials and its name

2. Open folder RESOURCES and use INIT_DB.sql to create a local schema in your MySQL DB.
In my case it was MySQL 8.0. Mainly, I used mySQL Shell and Workbench.

3. Download and install TomCat 9.0.53 so that it will run the project

4. Once you start the app, you will see the webserver opens /index in your browser and redirect to /login as you 
do not have access.

5. Register a new driver and all the options and interfaces will be available to you

6. ENJOY!

NOTES:
I implemented logging into a folder on the webserver by a relative logging path in the log4j2.xml.
Please check your TOMCAT folder \bin\logs 

P.S. If you would like to see this project live please click this link to my website
https://java-taxi-jdbc.herokuapp.com