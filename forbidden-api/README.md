# Forbidden API Checker

# Usage

Run the forbidden API checker

```bash
mvn verify
``` 

Fix problems

```
LocalDateTime.now(ZoneId.of("UTC"))
str.getBytes(StandardCharsets.UTF_8)
```

Run the forbidden API checker again

```bash
mvn verify
``` 

