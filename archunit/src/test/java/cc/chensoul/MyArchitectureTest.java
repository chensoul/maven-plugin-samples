package cc.chensoul;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

public class MyArchitectureTest {
    @Test
    public void check_domainmodel_access() {
        JavaClasses importedClasses = new ClassFileImporter().importPackages("dev.fichtner");

        ArchRule rule = classes().
                that().
                resideInAPackage("cc.chensoul.domain.model").
                should().
                onlyDependOnClassesThat().
                resideInAnyPackage("java..", "cc.chensoul.domain.model", "cc.chensoul.domain.support");

        rule.check(importedClasses);
    }

    @Test
    public void check_layers() {
        JavaClasses importedClasses = new ClassFileImporter().importPackages("dev.fichtner");

        ArchRule rule = layeredArchitecture()
                .consideringAllDependencies()
                .layer("Service").definedBy("cc.chensoul.domain.service")
                .layer("Persistence").definedBy("cc.chensoul.infrastructure.filesystem")
                .whereLayer("Persistence").mayOnlyBeAccessedByLayers("Service");

        rule.check(importedClasses);
    }

}