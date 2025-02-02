package com.github.giuliozelante.layer3gen.gradle;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * entityGen Gradle plugin.
 */
public class Layer3GenPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {

        project.getExtensions().create("layer3gen", Layer3GenExtension.class);
        project.getTasks().create("layer3gen", Layer3GenTask.class);

        /*project.getExtensions().create("layer3gen", Layer3GenExtension.class);
        Task task = project.getTasks().create("layer3gen", Layer3GenTask.class);
        org.gradle.api.Task javaCompile = project.getTasks().getByName("compileJava");
        task.dependsOn(javaCompile);*/
    }
}
