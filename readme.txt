To facilitate OSGi bundle manifest generation, the archetype offers the choice of two maven plugins.

a. SpringSource Bundlor Plugin 
Home page: http://www.springsource.org/bundlor

"SpringSource� Bundlor is a tool that automates the detection of dependencies and the creation of OSGi 
manifest directives for JARs after their creation."

The Bundlor tool is enabled by default.

b. Apache Felix Bundle Plugin
Home page: http://felix.apache.org/site/apache-felix-maven-bundle-plugin-bnd.html

"This plugin for Maven 2 is based on the BND tool from Peter Kriens. [...] The way you create a bundle 
with BND is to tell it the content of the bundle's JAR file as a subset of the available classes."


To trigger the manifest generation (using either plugin), run: mvn package

<a href='https://ko-fi.com/scaulfield7' target='_blank'><img height='36' style='border:0px;height:36px;' src='https://storage.ko-fi.com/cdn/kofi1.png?v=3' border='0' alt='Buy me a coffee at ko-fi.com' /></a>

