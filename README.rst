================
Bootstrap Webapp
================

A sample project demonstrating the use of Spring MVC along with Maven to create a simple RESTful API web application.

Requirements
============

This project uses:

- Java 1.7+
- Git
- Apache Maven

To install Git (on Mac)::

    brew install git

To install maven (on Mac)::

    brew install maven

Getting Started
===============

If you haven't already, clone this repo onto your local file system::

    git clone git@github.com:jasonpolites/bootstrap-webapp.git

You can run the web app locally using the embedded Jetty instance::

    cd bootstrap-webapp
    mvn jetty:run

By default the webapp will run on port 8080:

http://localhost:8080/bootstrap-webapp/

Building the Package
====================

To package up the webapp as a WAR file for deployment into your container of choice,
simply run the maven *package* command::

    mvn package

This will produce a war file in the *target* folder called **bootstrap-webapp.war**