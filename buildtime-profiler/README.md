# Maven Build Time Profiler


# Configuration
If you like to use this extension for Maven you have to define the following .mvn/extensions.xml file:

```xml

<extensions xmlns="http://maven.apache.org/EXTENSIONS/1.1.0"
            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xsi:schemaLocation="http://maven.apache.org/EXTENSIONS/1.1.0 http://maven.apache.org/xsd/core-extensions-1.1.0.xsd">
    <extension>
        <groupId>com.soebes.maven.extensions</groupId>
        <artifactId>maven-buildtime-profiler</artifactId>
        <version>0.5.0</version>
    </extension>
</extensions>
```

If you don't like to add the .mvn/extensions.xml to your project you can also go via command line like this:

```bash
mvn verify -Dmaven.ext.class.path=$HOME/.m2/repository/com/soebes/maven/extensions/maven-buildtime-profiles/0.5.0/maven-buildtime-profiler-0.5.0.jar
```

The download from Maven Central will be done by Maven itself.

## Deactivation

If you like to deactivate the extension without removing the .mvn/extensions.xml file this can easily achieved, by
adding the following to your command line (system property):

```bash
mvn -Dmaven-build-time-profiler.disabled verify
```

# Links

- https://github.com/khmarbaise/maven-buildtime-profiler