InfoQ Modularity Series
=======================

The InfoQ modularity series is an ongoing series of articles at
  http://www.InfoQ.com

This repository is meant as a convenience for accessing the
code content behind the examples, as well as a cached copy of 
the articles themselves. Please note that the content is copyright
(c) &copy; InfoQ 2009, 2010.

Downloading
-----------

You can check this copy out by using git, the world&rsquo;s most
popular distributed version control system. The public master is
available at:

  git clone http://github.com/alblue/InfoQModularity.git

Tags
----

As this is an ongoing series, the content of the repository
will have different content dependening on which article you
want to read. This is intentional. The idea is that unless the
article specifically references, or makes use of, a particular
module then that module won&rsquo;t show up in the project
list when you clone it.

The different articles are reflected using different git tags
in the repository, for example:

 * `git checkout 00-ModularJava`
 * `git checkout 01-StaticModularity`
 * `git checkout 02-DynamicModularity`
 * `git checkout 03-DeclarativeModularity`

In order to view the article for the appropriate series post,
you&rsquo;ll need to check out the tag corresponding to the
article. Conveniently, this will also reset the state of the
code to the point of the article as well.

Building
--------

The code and examples are all run with Maven. This has been tested
on Maven 3.0, but it may work with Maven 2.x as well.

To build the examples, execute:

	mvn package

This will create a bundle for each one of the submodules in the
project, corresponding to the article version itself. To see it
run in an OSGi framework, do one of:

	mvn install pax:provision -Dframework=felix
	mvn install pax:provision -Dframework=equinox

This will launch a framework and bring up Felix (or Equinox) 
runtime with the bundles installed for demonstration purposes.
It will also automatically start them.

Feedback
--------

Feedback is always useful; feel free to reach out to me at 
<alex.blewitt@gmail.com> or via GitHub. 

