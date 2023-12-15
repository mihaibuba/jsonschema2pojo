package org.jsonschema2pojo;

public interface LombokAnnotatorConfiguration {
    boolean isAnnotateClassData();

    boolean isAnnotateAllArgsConstructor();

    boolean isAnnotateNoArgsConstructor();
    boolean isAnnotateRequiredArgsConstructor();

    boolean isPrivateFields();

}
