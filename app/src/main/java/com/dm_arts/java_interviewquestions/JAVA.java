package com.dm_arts.java_interviewquestions;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ExpandableListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JAVA extends AppCompatActivity {
    private AdView mAdView;
    private int lastExpandedPosition = -1;

    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, String> listHash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jav);
        MobileAds.initialize(this, "ca-app-pub-1928579807368701~2133237074");



        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        listView = (ExpandableListView) findViewById(R.id.lvExp);
        initData();
        listAdapter = new ExpandableListAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);

        listView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                if (lastExpandedPosition != -1
                        && groupPosition != lastExpandedPosition) {
                    listView.collapseGroup(lastExpandedPosition);
                }
                lastExpandedPosition = groupPosition;
            }
        });
    }

    public void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        List<String> answer = new ArrayList<>();

        listDataHeader.add("1. Which class cannot be subclassed (or extended) in java?");
        listDataHeader.add("2. Can we declare abstract static method ?");
        listDataHeader.add("3. Can we access private class outside the package?");
        listDataHeader.add("4. Why we use array as a parameter of main method?");
        listDataHeader.add("5. Suspend thread can be revived by using?");
        listDataHeader.add("6. Runnable is (Class or Interface) ?");
        listDataHeader.add("7. Which collection class associates values witch keys, and orders the keys according to their natural order ?");
        listDataHeader.add("8. Unchecked exceptions are checked at compile-time rather they are checked at runtime. (true or false)");
        listDataHeader.add("9. The PipedInputStream and PipedOutputStream classes can be used to read and write data simultaneously.");
        listDataHeader.add("10. ResultSetMetaData interface is useful because it provides methods to get metadata from the ResultSet object. (true or false") ;
        listDataHeader.add("11. Which constructor creates an empty string buffer with the specified capacity as length") ;
        listDataHeader.add("12. How many reserved keywords are currently defined in the Java language?") ;
        listDataHeader.add("13. Which mechanism is used when a thread is paused running in its critical section and another thread is allowed to enter (or lock) in the same critical section to be executed?") ;
        listDataHeader.add("14. Which method is used to change the name of a thread?") ;
        listDataHeader.add("15. Which class is used to uncompress the file in the deflate compression format, It provides facility to the other uncompression filters?") ;
        listDataHeader.add("16. Which is used for reading streams of raw bytes such as image data and for reading streams of characters, consider using FileReader?") ;
        listDataHeader.add("17. Switch is more efficient than nested if or if - else in java. (true or false)") ;
        listDataHeader.add("18. An exception is an event, which occurs during the execution of a program that disrupts the normal flow of the program's instructions.(true or false)") ;
        listDataHeader.add("19. Mutual exclusive and inter-thread communication are which type of Synchorization?") ;
        listDataHeader.add("20. Java application uses an output stream to read data from a source, it may be a file, an array, peripheral device or socket. (true or false)") ;
        listDataHeader.add("21.  What is known as the classes that extend Throwable class except RuntimeException and Error?") ;
        listDataHeader.add("22. A package can be renamed without renaming the directory in which the classes are stored.") ;
        listDataHeader.add("23. Daemon thread provides services to user threads for background supporting tasks,It has no role in life than to serve user threads (true or false)") ;
        listDataHeader.add("24.   Which methods are provided by the PrintStream class? ") ;
        listDataHeader.add("25. Which Exception occurs when a class is not found while dynamically loading a class using the class loaders?") ;
        listDataHeader.add("26.  By overriding the toString() method of the Object class, we can return values of the object, so we don't need to write much code.(true or false)") ;
        listDataHeader.add("27. Which method of string class in java is used to convert the boolean into String?") ;
        listDataHeader.add("28. Classes in the same package cannot access each other's package-access members.(true or false)") ;
        listDataHeader.add("29. Which is used to separate the hierarchy of the class while declaring an import statement?") ;
        listDataHeader.add("30. Which Thread pool is used where container creates a thread pool to process the request?") ;
        listDataHeader.add("31. Which field of StreamTokenizer if the token is a word, this filed contains the word that can be used in programming?") ;
        listDataHeader.add("32. Which statement provides an easy way to dispatch execution to different parts of your code based on the value of an expression?") ;
        listDataHeader.add("33. Packages are used for distributing a collection of reusable classes, usually in a format known as Java Archive (JAR) file.(true or false)") ;
        listDataHeader.add("34. Which provides accessibility to classes and interface?") ;
        listDataHeader.add("35. What can be accessed or inherited without actual copy of code to each program?") ;
        listDataHeader.add("36. Breaking a string or stream into meaningful independent words is known as tokenization.(true or false)") ;
        listDataHeader.add("37. Which variables are created when an object is created with the use of the keyword 'new' and destroyed when the object is destroyed?") ;
        listDataHeader.add("38. An interface is a blueprint of a class. It has static constants and abstract methods.(true or false)") ;
        listDataHeader.add("39. Which is a superclass of all exception classes?") ;
        listDataHeader.add("40. The Object class is not a parent class of all the classes in java by default.") ;
        listDataHeader.add("41. Which access specifiers can be used for a class so that it’s members can be accessed by a different class in the different package?") ;
        listDataHeader.add("42. Which keyword is used to make the classes and interface of another package accessible to the current package?") ;
        listDataHeader.add("43. If you import a package, subpackages will not be imported.") ;
        listDataHeader.add("44. Which method returns a reference to the currently executing thread object?") ;
        listDataHeader.add("45. Which are subclasses of FilterInputStream and FilterOutputStream?") ;
        listDataHeader.add("46. Java Virtual Machine is platform independent.(true or false)") ;
        listDataHeader.add("47. Which is a mechanism where one object acquires all the properties and behaviors of the parent object?") ;
        listDataHeader.add("48. Which class is thread-safe i.e. multiple threads cannot access it simultaneously,So it is safe and will result in an order?") ;
        listDataHeader.add("49. Which is a technique in Java in which a class can have any number of constructors that differ in parameter lists? ") ;
        listDataHeader.add("50. Which method of object class can clone an object?") ;


        answer.add("final class");
        answer.add(" no");
        answer.add("no");
        answer.add("can store multiple values ");
        answer.add(" resume() method");
        answer.add("interface");
        answer.add("java.util.TreeMap");
        answer.add("False");
        answer.add("True");
        answer.add("True");
        answer.add("StringBuffer(int capacity)");
        answer.add("49");
        answer.add("Inter-thread communication");
        answer.add("public void setName(String name)");
        answer.add("InflaterInputStream class");
        answer.add("FileInputStream");
        answer.add("True");
        answer.add("True");
        answer.add("Thread Synchronization");
        answer.add("False");
        answer.add("Checked Exception");
        answer.add("False");
        answer.add("True");
        answer.add("Write data to another stream");
        answer.add("ClassNotFoundException");
        answer.add("True");
        answer.add("public static String valueOf(double I)");
        answer.add(" False");
        answer.add("Package");
        answer.add("Servlet and JSp");
        answer.add("double nval");
        answer.add("Switch");
        answer.add("True");
        answer.add(" import");
        answer.add("Package");
        answer.add("True");
        answer.add("Instance variables");
        answer.add(" True");
        answer.add("Throwable");
        answer.add("False");
        answer.add("Public");
        answer.add("Import");
        answer.add("True");
        answer.add("currentThread()");
        answer.add("DataInputStream and DataOutputStream");
        answer.add("False");
        answer.add("Inheritance");
        answer.add("StringBuffer class");
        answer.add("Constructor overloading");
        answer.add("Objectclone()");





        for (int i =0 ; i<50 ; i++) {
            listHash.put(listDataHeader.get(i), answer.get(i));
        }


    }
}
