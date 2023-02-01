# orderApp
Patika Sipariş uygulaması

PS C:\Development\intellij\orderApp> mvn clean install
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------------< org.hasan:orderApp >-------------------------
[INFO] Building orderApp 1.0-SNAPSHOT                                          
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ orderApp ---
[INFO] Deleting C:\Development\intellij\orderApp\target
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ orderApp ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ orderApp ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 3 source files to C:\Development\intellij\orderApp\target\classes
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ orderApp ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Development\intellij\orderApp\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ orderApp ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ orderApp ---
[INFO] No tests to run.
[INFO]
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ orderApp ---
[INFO] Building jar: C:\Development\intellij\orderApp\target\orderApp-1.0-SNAPSHOT.jar
[INFO] 
[INFO] Installing C:\Development\intellij\orderApp\target\orderApp-1.0-SNAPSHOT.jar to C:\Users\hasan\.m2\repository\org\hasan\orderApp\1.0-SNAPSHOT\orderApp-1.0-SNAPSHOT.jar
[INFO] Installing C:\Development\intellij\orderApp\pom.xml to C:\Users\hasan\.m2\repository\org\hasan\orderApp\1.0-SNAPSHOT\orderApp-1.0-SNAPSHOT.pom
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.966 s
[INFO] Finished at: 2023-02-01T20:03:05+03:00
[INFO] ------------------------------------------------------------------------

PS C:\Development\intellij\orderApp> mvn compile
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------------< org.hasan:orderApp >-------------------------
[INFO] Building orderApp 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ orderApp ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ orderApp ---
[INFO] Nothing to compile - all classes are up to date
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.696 s
[INFO] Finished at: 2023-02-01T20:03:13+03:00
[INFO] ------------------------------------------------------------------------
PS C:\Development\intellij\orderApp> mvn package                                              
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------------< org.hasan:orderApp >-------------------------
[INFO] Building orderApp 1.0-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ orderApp ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ orderApp ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ orderApp ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\Development\intellij\orderApp\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ orderApp ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ orderApp ---
[INFO]
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ orderApp ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.018 s
[INFO] Finished at: 2023-02-01T20:03:55+03:00
[INFO] ------------------------------------------------------------------------


PS C:\Development\intellij\orderApp> cd target                          
PS C:\Development\intellij\orderApp\target> java -jar orderApp-1.0-SNAPSHOT.jar
1-List all customers                                               
2-List customers with the letter 'C' in it                         
3-List the total amount of invoices of customers registered in June
4-List all invoices in the system
5-List invoices over 1500TL in the system
6-Calculate the average of invoices over 1500TL in the system
7-List the names of customers with invoices under 500TL in the system
8-Type the code that lists the sector in which the companies with June invoices with an average of less than 750 are located
9-Add New Customer and Invoice
Press any key to exit
please select the process :
9


please enter customer's name, sector, year, month, dayOfMonth in order
Apple
Technology 
2020
5
1
please enter invoice's amount, year, month, dayOfMonth in order
400
2023
6
8
7
please select the process :
1


All customers:
Amazon
Beta Corp.
Gamma LLC
ACME Inc.
Google
Apple
Microsoft
please select the process :
2



Customers with 'C' in their name:
Beta Corp.
Gamma LLC
ACME Inc.
please select the process :
3



Total invoice amount for customers registered in June:
7000.0
please select the process :
4



All invoices:
200.0 - 2020-05-16
4000.0 - 2020-06-19
1500.0 - 2023-06-15
500.0 - 2023-06-01
2000.0 - 2023-06-04
3000.0 - 2023-07-21
2000.0 - 2022-06-15
1000.0 - 2019-05-15
7000.0 - 2023-02-11
400.0 - 2021-06-15
400.0 - 2023-06-08
100.0 - 2023-06-10
300.0 - 2022-07-15
please select the process :
5



Invoices above 1500:
4000.0 - 2020-06-19
2000.0 - 2023-06-04
3000.0 - 2023-07-21
2000.0 - 2022-06-15
7000.0 - 2023-02-11
please select the process :
6



Average invoice amount above 1500:
3600.0
please select the process :
7



Customers with invoices below 500:
Amazon
Google
Apple
Microsoft
please select the process :
8



Companies with June invoice average below 750, grouped by sector:
Technology:
Google
Apple
Computer:
Microsoft
please select the process :
exit


