SmartAppointment
================

1. Maven standard directory layout
   http://maven.apache.org/guides/introduction/introduction-to-the-standard-directory-layout.html
2. Run the following maven commands to clean, compile, package (create a war file) and generate eclipse files to import      the project into eclipse. 
   mvn  clean compile package eclipse:eclipse 


How to run the project in eclipse
=================================
1. Clone the project and run "mvn  clean compile package eclipse:eclipse"
2. File -> Import -> General -> Exisiting Projects into Workspace
3. The directory structure shows up in the project view
4. Create a "Server project" from File->Other->Server or from the Servers tab in the bottom console of eclipse and give the target tomcat version.
5. Right click on the project and click on "Run on server" and the application should be running. 
   - If the deployment fails then check "Deployment Assembly" to make sure all the resources including jars are added.
   - If "Deployment Assembly" doesn't show up in eclipse then it's not a "Dynamic Web Project". In order to fix this issue 
     Right click on the project -> goto 'Project Artifacts' -> Choose 'Dynamic Web Project' configuration from the drop down which will enable Dynamic Web Module, Java (make sure Java target version matches to the one that's installed on your machine) -> Apply changes -> Right-click project and run maven install -> Right-click project -> Run on Server/Run configurations -> Choose the tomcat server -> Click next and make sure the project is in the deployment resources (right side window) -> Run and it should work now.

How to deploy the war file in tomcat
====================================
Copy the *.war file to tomcat installation directory and untar it in WEB-INF/ROOT. Now we see classes and web.xml. Start tomcat and run the API calls from the browser or REST console.
