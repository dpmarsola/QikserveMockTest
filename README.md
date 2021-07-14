# QikserveMockTest

This is the development of the QikServe Engineer Technical Test.

The original source code is stored inside the /src folder.

The following instructions should be executed in a Linux machine.

In order to make the application run, you have to:

1. Download the "AmazingStore.tar" file and copy it to the desired folder.
2. Unzip the file with "tar -xvf AmazingStore.tar" 
3. Run the shell script "./initAmazingStore.sh"

IMPORTANT: The script (in step 3), will initialize both the Spring Application (which contains my code for the Challange)
and the Wiremock server (provided by Qikserve) in order to mock the data for the Challange.

After step 3, the Web site can be accessed locally by using the following URL: http://localhost:8080/

The first page should load and you can click on the buttons to put the items in you basket.

The mock test stops at the second page, where you can review how much you will pay and how much you eventually saved with the promos.



