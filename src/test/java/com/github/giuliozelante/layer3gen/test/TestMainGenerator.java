package com.github.giuliozelante.layer3gen.test;


import com.github.giuliozelante.layer3gen.CodeGenerator;
import freemarker.template.TemplateException;
import com.github.giuliozelante.layer3gen.config.CodeGeneratorConfig;
import com.github.giuliozelante.layer3gen.main.ClassLoaderBuilderMain;
import org.junit.Test;

import java.io.IOException;

public class TestMainGenerator {


    @Test
    public void testGeneration() throws IOException, TemplateException {

        CodeGeneratorConfig config = CodeGeneratorConfig.load("3layer-settings.yml",true);
        CodeGenerator.run(config,ClassLoaderBuilderMain.getClassLoader(config));

    }

}
