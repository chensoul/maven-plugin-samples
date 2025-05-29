# maven-plugin-samples

Many samples for maven plugin usage.

# Usage

Check the Maven and Java version on your machine

```bash
mvn -version
```

Have a look and see what your effective POM looks like:

```bash
mvn help:effective-pom
```

check for plugin updates

```bash
mvn versions:display-plugin-updates
```

check for used / unused dependencies

```bash
mvn org.apache.maven.plugins:maven-dependency-plugin:3.3.0:analyze
```

check the dependency tree to understand what is happening

```bash
mvn dependency:tree
```

check for CVEs with mvn org.owasp:dependency-check-maven:check

```bash
mvn buildplan:list-phase
```

Declare a license for your project, and check the license

```bash
mvn project-info-reports:dependencies
mvn license:third-party-report
```