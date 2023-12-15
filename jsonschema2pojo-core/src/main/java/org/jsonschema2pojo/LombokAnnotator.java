package org.jsonschema2pojo;

import com.fasterxml.jackson.databind.JsonNode;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JEnumConstant;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMethod;
import lombok.*;

@Getter
@RequiredArgsConstructor
public class LombokAnnotator implements Annotator {
    private final LombokAnnotatorConfiguration config;
    @Override
    public void typeInfo(JDefinedClass clazz, JsonNode jsonNode) {
        if (config.isAnnotateClassData()){
            clazz.annotate(Data.class);
        }
        if (config.isAnnotateAllArgsConstructor()){
            clazz.annotate(AllArgsConstructor.class);
        }
        if (config.isAnnotateNoArgsConstructor()){
            clazz.annotate(NoArgsConstructor.class);
        }
        if (config.isAnnotateRequiredArgsConstructor()){
            clazz.annotate(RequiredArgsConstructor.class);
        }
    }

    @Override
    public void propertyOrder(JDefinedClass clazz, JsonNode jsonNode) {
    }

    @Override
    public void propertyInclusion(JDefinedClass clazz, JsonNode jsonNode) {

    }

    @Override
    public void propertyField(JFieldVar jFieldVar, JDefinedClass clazz, String s, JsonNode jsonNode) {
        if (config.isPrivateFields()){
            jFieldVar.mods().setPrivate();
        }
    }

    @Override
    public void propertyGetter(JMethod jMethod, JDefinedClass clazz, String s) {

    }

    @Override
    public void propertySetter(JMethod jMethod, JDefinedClass clazz, String s) {

    }

    @Override
    public void anyGetter(JMethod jMethod, JDefinedClass clazz) {

    }

    @Override
    public void anySetter(JMethod jMethod, JDefinedClass clazz) {

    }

    @Override
    public void enumCreatorMethod(JDefinedClass clazz, JMethod jMethod) {

    }

    @Override
    public void enumValueMethod(JDefinedClass clazz, JMethod jMethod) {

    }

    @Override
    public void enumConstant(JDefinedClass clazz, JEnumConstant jEnumConstant, String s) {

    }

    @Override
    public boolean isAdditionalPropertiesSupported() {
        return false;
    }

    @Override
    public void dateTimeField(JFieldVar jFieldVar, JDefinedClass clazz, JsonNode jsonNode) {

    }

    @Override
    public void dateField(JFieldVar jFieldVar, JDefinedClass clazz, JsonNode jsonNode) {

    }

    @Override
    public void timeField(JFieldVar jFieldVar, JDefinedClass clazz, JsonNode jsonNode) {

    }

    @Override
    public void additionalPropertiesField(JFieldVar jFieldVar, JDefinedClass clazz, String s) {

    }

    @Override
    public boolean isPolymorphicDeserializationSupported(JsonNode jsonNode) {
        return false;
    }
}
