TotesNotes
==========

An Android Note Taking App

Totes-Notes

An android note taking app

Wednesday, April 23th 2014, 1:59 PM

Design Document for:

Totes Notes

Written by 

Version # 1.00


Table of Contents

1.0 Introduction
 1.1 Goals and objectives
 1.2 Statement of scope
 1.3 Software context
 1.4 Major constraints
 2.0 Data design
 2.1 Internal software data structure
 2.2 Global data structure
 2.3 Temporary data structure
 2.4 Database description
 3.0 Architectural and component-level design
 3.1 System Structure
 3.1.1 Architecture diagram
 3.2 Description for Component “n”
 3.2.1 Processing narrative (PSPEC) for component “n”
 3.2.2 Component “n” interface description.
 3.2.3 Component “n” processing detail
 3.2.3.1 Design Class hierarchy for component n
 3.2.3.2 Restrictions/limitations for component n
 3.2.3.3 Performance issues for component n
 3.2.3.4 Design constraints for component n
 3.2.3.5 Processing detail for each operation of component
 3.2.3.5.1 Processing narrative (PSPEC) for each operation
 3.2.3.5.2 Algorithmic model (e.g., PDL) for each operation 3.3 Dynamic Behavior for Component
 3.3.1 Interaction Diagrams
 4.0 User interface design
 4.1 Description of the user interface
 4.1.1 Screen images
 4.1.2 Objects and actions
 4.2 Interface design rules
 4.3 Components available
 4.4 UIDS description
 5.0 Restrictions, limitations, and constraints
 6.0 Testing Issues
 6.1 Classes of tests
 6.2 Expected software response
 6.3 Performance bounds
 6.4 Identification of critical components
 7.0 Appendices
 7.1 Requirements traceability matrix
 A matrix that traces stated components and data structures to software requirements is developed.
 7.2 Packaging and installation issues
 7.3 Design metrics to be used
 7.4 Supplementary information (as required)
 Revision History NameDateReason For ChangesVersion You should begin to develop the software design specification after completion of the software requirements specification. The software requirements feed the design task. At this point, your team should decide on a programming language for the project. If you are new to the language, take time to become familiar with it, before you proceed. The software design specification focuses on how the system will be constructed. It includes four models: data design , architectural design , interface design and component-level design. Before you begin, please study chapters 11-16 in the text. Your document should follow the template below. It is a modified version of the Pressman's Adaptable Process Model template for a software design document. (Section 1.0 is repeated from the Software Requirements Specification. This section provides background information about the SW.) Software design is a process by which the software requirements are translated into a representation of software components, interfaces, and data necessary for the implementation phase. The SDD shows how the software system will be structured to satisfy the requirements. It is the primary reference for code development and, therefore, it must contain all the information required by a programmer to write code. The SDD is performed in two stages. The first is a preliminary design in which the overall system architecture and data architecture is defined. In the second stage, i.e the detailed design stage, more detailed data structures are defined and algorithms are developed for the defined architecture

1.0 Introduction This is a note taking application that requires user input to function. It can also save user input and review what was written. 1.1 Goals and objectives The button named new is clicked on then it would open a separate window with a button named save and a text field right next to the button. Then the user can input words which then can be saved by clicking the save button. The user can view their files later on the android app or their computer when they plug in their phone with a USB. 1.2 Statement of scope The essential output is when the new button is clicked it opens a new window where the user can save files. The desirable output the UI interface is friendly and enables the user to sort their files. The future output is to set a calendar reminding the user of previous files they have saved, record pictures, video, and sound, make the files shareable, and reformat the notes into different styles. 1.3 Software context Any user can use this app to take notes in place of flash cards, memo books, and notebooks. 1.4 Major constraints Lack of time and knowledge to code an android app are some major constraints that the programmers are experiencing.

2.0 Data design The app only has a global data structure because that is where the notes will be saved so eventually it can be shared globally. 2.1 Internal software data structure There is no internal software data structure in the app so far. 2.2 Global data structure The app saves the notes which turns them into files into a storage space available already by the android phone. 2.3 Temporary data structure There is no internal software data structure in the app so far. 2.4 Database description There is no database in the app so far.

3.0 Architectural and component-level design The basis of the architectural design is that the app will look like a white page with a few buttons and text fields for the user to write in. 3.1 System Structure The system structure that was used for this app was 3.1.1 Architecture diagram A pictorial representation, using a UML component diagram, of the architecture is presented. 3.2 Description for Component “n” A detailed description of each software component contained within the architecture is presented. Section 3.2 is repeated for each of n components. 3.2.1 Processing narrative (PSPEC) for component “n” A processing narrative for component n is presented. It should describe the responsibilities of the component. 3.2.2 Component “n” interface description. A detailed description of the input and output interfaces for the component is presented. 3.2.3 Component “n” processing detail A detailed algorithmic description for each component is presented. 3.2.3.1 Design Class hierarchy for component n 3.2.3.2 Restrictions/limitations for component n 3.2.3.3 Performance issues for component n 3.2.3.4 Design constraints for component n 3.2.3.5 Processing detail for each operation of component n 3.2.3.5.1 Processing narrative (PSPEC) for each operation 3.2.3.5.2 Algorithmic model (e.g., PDL) for each operation 3.3 Dynamic Behavior for Component n A description of the interaction of the classes is presented. 3.3.1 Interaction Diagrams A sequence diagram, for each use case the component realizes, is presented. 4.0 User interface design The app has functional buttons and functional text fields that open new pages and messages. 4.1 Description of the user interface The user interface is very straight forward and friendly meaning any user can use it because it is set up very effortlessly and its simplicity makes it easy to navigate throughout the app. 4.1.1 Screen images

4.1.2 Objects and actions When the app is opened then a home page opens up with the app’s name, Totes Notes, in the action bar with the settings tab. Under the action bar is a white screen with just a button on the top left corner of the app named “New”. After the “New” button was clicked on a new page is opened up to show a button called “Save” near the top left corner. Next to the “Save” button is a text field and if it is clicked on then a keyboard shows up on the bottom where the user can type in characters into the text field. When the user finishes typing in what they need then the user clicks the “Save” button opening another window displaying the message that it has been saved and shows the text that was typed into the text field. 4.2 Interface design rules 1. Strive for consistency 2. Cater to universal usability 3. Offer informative feedback 4. Design dialogs to yield closure 5. Prevent errors 6. Permit easy reversal of actions 7. Support internal locus of control 8. Reduce short – term memory load 4.3 Components available The action bar was implemented in which is a UI component and the creation of the button, text field, and the home page itself was provided by packages filled with preset UI components. 4.4 UIDS description First the programmers implemented the “New” button and coded it to create a new page and after the app was tested by an android emulator the desired output was produced. The next thing the programmers did was code for the “Save” button to appear on the newly opened page when the “New” button was clicked. After that button was tested and the result was correct the programmers then coded a text field for the user to type his or her notes. The text field was then tested to see if the user could type characters inside the text field when that was finished the programmers then coded if the user could see what they typed in and saved. 5.0 Restrictions, limitations, and constraints The restrictions the programmer had during the design of this app was the constant errors of the emulator because it kept saying that the emulator could not be created or it would not open up. Some other errors were the missing packages that the programmers had to manually import themselves. In other situations the error was caused by the preset packages that came along with the program because the programmers did not use them.

6.0 Testing Issues The primary strategy of testing the app was that after each code was written the programmers then tested it through running the app on a emulator online. 6.1 Classes of tests The programmers used white box testing because in order to fix the problem the code would need to be viewed in a internal perspective to change the code and basically guess and test until it works efficiently. 6.2 Expected software response The expected result of the testing is that after each implementation of code it would run and efficiently produce what the code says it should do. 6.3 Performance bounds It should run smoothly with each button working functionally even after the graphics are added which causes a friendly and appealing UI. There should be no delay if each button was clicked on or if a text was typed in. 6.4 Identification of critical components A critical component in the app that demands attention when testing is the need of having a working emulator to run the app. The need of a code that can produce an image on the working emulator is also another critical component in the app that demands attention.

7.0 Appendices There were packages that needed to be imported to the program in order to implement the methods that came with the package. The detailed information from the android website also helped create this app. 7.1 Requirements traceability matrix import android.support.v7.app.ActionBarActivity and import android.support.v7.app.ActionBar allows the app to create the tools bar on the top of the page allowing the user to find notes they previously saved and other functions too. import android.support.v4.app.Fragment allows the programmers to edit the app while the it is running on a emulator. import android.os.Bundle allows us to edit and save the names of the buttons in the app. import android.view.LayoutInflater allows the programmer to have pre set functions making the creation of the app faster and easier. import android.view.View and import android.view.ViewGroup allows the user to view any characters that they previously entered into a text field. import android.widget.EditText allows the user to enter the text field and enter the characters into it. import android.content.Intent allows the app to do other functions other than what their original was coded for.

7.2 Packaging and installation issues import android.support.v7.app.ActionBarActivity; import android.support.v7.app.ActionBar; import android.support.v4.app.Fragment; import android.os.Bundle; import android.view.LayoutInflater; import android.view.View; import android.view.ViewGroup; import android.widget.EditText; import android.content.Intent;

7.3 Design metrics to be used There was no design metrics used in this app. 7.4 Supplementary information (as required)

Software Design Document
