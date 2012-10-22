Spring Batch & Integration Performance - Parsing Demo
=====================================================

This project is a cut-down version of the C24 Retail Demo and corresponds to the Retail demo section of the slides. 
It contains a SpringSource Tool Suite (STS) project which you can use by simply importing the existing project into STS.

In order to minimise download requirements, the data has been simplified and compressed. To create a sample data set:

Unix/Mac OSX
------------

Run the supplied createData.sh file in the c24-springone-retail-demo directory. It will unpack data.zip and combine the extracted data to
to create a suitable data set.

Windows
-------

1. Extract the data folder from data.zip and put it in the same directory.
2. Run the createData.bat file from the same directory
3. Zip up data/xml/daily/txns-2012-03-01.xml and place the result (ending in .zip) into the data/xml/weeklyzip directory


Running the Examples
====================

The examples can be found in the src/test/java directory, in the package biz.c24.retaildemo.perftest.

* XmlReceiptTest. A minimalistic test timing an XML string through the SI flow.

* IndividualFileXmlReceiptTest. Uses an Inbound File Adapter to acquire receipt files (1 receipt per file).

* MultiFileXmlReceiptTest. Uses an Inbound File Adapter to acquire receipt files (multiple receipts per file). Works only with relatively small files.

* LargeMultiFileXmlReceiptTest. As per MultiFileXmlReceiptTest, showing the consequences of processing large files.

* BatchTest. Minimalistic example using Spring Batch to process a file.

* BatchSiTest. A richer example showing use of Spring Integration to initiate procesing but handing off to Spring Batch to parse the file. Demonstrates how to hand items back into Spring Integration and how to push exceptions (both skipped and failures) back into SI.


Corresponding configuration files can be found beneath the src/main/resources directory.


LargeMultiFileXmlReceiptTest
----------------------------

Both the Splitter and Service Activator approaches will be problematic due to lack of memory.
The Splitter will fail with an OOM as it attempts to split the entire file into a single Collection of Strings.


Batch SiTest
------------

The test data contains 2 additional zip files:

* invalid.zip is an invalid zip file (0 bytes)
* mixed.zip contains a valid receipt and a syntactically incorrect one. This demonstrates that we can continue processing the remaining data
  in the file, even in the event of parse failures.


The Full Demo
=============

The full C24 Retail Demo, showing use of Spring Integration, Spring Batch and Integration Objects is available on GitHub.
The full demo also contains a web-based UI which can be used to monitor the data loading and analyse the imported data.
Unlike this project which bundles its dependencies, the full demo uses Maven to download required jars.
The project can be found at https://github.com/C24-Technologies/c24-sample-retaildemo

Andrew
andrew.elmore@incep5.com
@andrew_elmore

