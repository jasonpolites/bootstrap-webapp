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

    mvn jetty:run

By default the webapp will run on port 8000:

http://localhost:8000/bootstrap-webapp/