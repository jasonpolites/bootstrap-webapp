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

Then *cd* into the *bootstrap-webapp* folder.  All subsequent operations are run from there::

    cd bootstrap-webapp

You can run the web app locally using the embedded Jetty instance::

    mvn jetty:run

By default the webapp will run on port 8080:

http://localhost:8080/bootstrap-webapp/

Building the Package
====================

To package up the webapp as a WAR file for deployment into your container of choice,
simply run the maven *package* command::

    mvn clean package

This will produce a war file in the *target* folder called **bootstrap-webapp.war**

You will notice that this also runs all the tests and performs all other verification tasks.
More about this below...

Running the Tests
=================

To run the tests for the project and any other build time checks, run the maven *verify* command::

    mvn clean verify

This will cause the entire build to fail if **any** of the following checks fails:

- A test fails
- Checkstyle rules are breached (including PMD and CMD)
- Findbugs rules are breached
- Code coverage falls below prescribed levels (80% for line coverage, 75% for branch coverage)

Viewing Test Output
===================

If a build fails due to any of the build-time checks failing, you can see the details of the failure
by creating the "site" produced by maven::

    mvn site

The site will be generated in the *target* folder::

    open target/site/index.html

Then browse to the **Project Reports** section.

*Note*: This will use report files generated when the *verify* command was executed, so **don't** execute a *clean*
before you run the *site* command.