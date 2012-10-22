Spring Integration Latency
==========================

This is the sample code I used to demonstrate the overhead of low level Spring Integration components.

The project can be imported into STS as an existing STS project.

The main methods can be found in src/main/java in the package biz.c24.springone. The examples are:

* TestEntryCost. Compute a minimum latency for using an SI flow. Simply puts a message on to a QueueChannel and consumes it.

* TestTransformer. Compute latency overhead for using a Transformer. Allows comparison of proxying a POJO vs extending an SI class.

* TestLatencyHeaders. Demonstrates a mechanism for tracking per-message latency in an SI flow, and how to reduce the overhead if required.


All tests can be run by right-clicking on the class and selecting Run As->Java Application

The corresponding configuration files can be found under src/main/resources


Andrew

andrew.elmore@incept5.com

@andrew_elmore

