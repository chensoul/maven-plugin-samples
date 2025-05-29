# Sbom-cyclonedx

Creates CycloneDX Software Bill of Materials (SBOM) from Maven projects

# Usage

Look at pom dependencies and then run

```bash
mvn dependency:tree
```

Build project and get sbom

```bash
mvn package
```

# Links

- https://apps.rancher.io/sbom-viewer 