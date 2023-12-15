package org.jsonschema2pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SimpleLombokGenerationConfiguration implements LombokAnnotatorConfiguration {
    @Builder.Default
    private boolean annotateClassData = true;

    @Builder.Default
    private boolean annotateAllArgsConstructor = true;

    @Builder.Default
    private boolean annotateNoArgsConstructor = true;

    @Builder.Default
    private boolean annotateRequiredArgsConstructor = false;

    @Builder.Default
    private boolean privateFields = true;

}
