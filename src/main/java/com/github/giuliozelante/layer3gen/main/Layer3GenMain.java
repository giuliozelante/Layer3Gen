package com.github.giuliozelante.layer3gen.main;

import com.github.giuliozelante.layer3gen.CodeGenerator;
import com.github.giuliozelante.layer3gen.config.CodeGeneratorConfig;
import org.apache.commons.lang3.ArrayUtils;

public class Layer3GenMain {

    public static void main(String[] args) throws Exception {
        String configFile = "";
        if(!ArrayUtils.isEmpty(args)){
            configFile = args[0];
        }
        CodeGeneratorConfig config = CodeGeneratorConfig.load(configFile,false);
        CodeGenerator.run(config,ClassLoaderBuilderMain.getClassLoader(config));
    }

}