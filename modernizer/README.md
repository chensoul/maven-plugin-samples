# Modernizer

Detect uses of legacy Java APIs

# Usage

Run the build with Java 7

```bash
mvn verify
```  

Change the Java Version to 8 and run again

```bash
mvn verify
```  

Migrate from Joda-time to JSR-310

```bash
mvn dependency:analyze
```

Slim up and lose Joda-time dependency

Change the Java Version to 11 and run again

```bash
mvn verify
```  


