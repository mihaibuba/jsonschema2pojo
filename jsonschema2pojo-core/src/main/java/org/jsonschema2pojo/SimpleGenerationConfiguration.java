package org.jsonschema2pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.jsonschema2pojo.rules.RuleFactory;
import org.jsonschema2pojo.util.JavaVersion;

import java.io.File;
import java.io.FileFilter;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SimpleGenerationConfiguration implements GenerationConfig {
    @Builder.Default
    private boolean generateBuilders = false;
    @Builder.Default
    private boolean includeTypeInfo = false;
    @Builder.Default
    private boolean usePrimitives = false;
    public Iterator<URL> getSource() {
        throw new UnsupportedOperationException("No default source available");
    }
    @Builder.Default
    private File targetDirectory = new File(".");
    @Builder.Default
    private String targetPackage = "";
    @Builder.Default
    private char[] propertyWordDelimiters = new char[]{'-', ' ', '_'};
    @Builder.Default
    private boolean useLongIntegers = false;
    @Builder.Default
    private boolean useDoubleNumbers = true;
    @Builder.Default
    private boolean includeHashcodeAndEquals = true;
    @Builder.Default
    private boolean includeToString = true;
    @Builder.Default
    private String[] toStringExcludes = new String[0];
    @Builder.Default
    private boolean useTitleAsClassname = false;
    @Builder.Default
    private AnnotationStyle annotationStyle = AnnotationStyle.JACKSON;
    @Builder.Default
    private InclusionLevel inclusionLevel = InclusionLevel.NON_NULL;
    @Builder.Default
    private Class<? extends Annotator> customAnnotator = NoopAnnotator.class;
    @Builder.Default
    private Class<? extends RuleFactory> customRuleFactory = RuleFactory.class;
    @Builder.Default
    private boolean includeJsr303Annotations = false;
    @Builder.Default
    private boolean includeJsr305Annotations = false;
    @Builder.Default
    private boolean useOptionalForGetters = false;
    @Builder.Default
    private SourceType sourceType = SourceType.JSONSCHEMA;
    @Builder.Default
    private String outputEncoding = StandardCharsets.UTF_8.toString();
    @Builder.Default
    private boolean removeOldOutput = false;
    @Builder.Default
    private boolean useJodaDates = false;
    @Builder.Default
    private boolean useJodaLocalDates = false;
    @Builder.Default
    private boolean useJodaLocalTimes = false;
    @Builder.Default
    private boolean parcelable = false;
    @Builder.Default
    private boolean serializable = false;
    @Builder.Default
    private FileFilter fileFilter = new AllFileFilter();
    @Builder.Default
    private boolean initializeCollections = true;
    @Builder.Default
    private String classNamePrefix = "";
    @Builder.Default
    private String classNameSuffix = "";
    @Builder.Default
    private String[] fileExtensions = new String[0];
    @Builder.Default
    private boolean useBigIntegers = false;
    @Builder.Default
    private boolean useBigDecimals = false;
    @Builder.Default
    private boolean includeConstructors = false;
    @Builder.Default
    private boolean constructorsRequiredPropertiesOnly = false;
    @Builder.Default
    private boolean includeRequiredPropertiesConstructor = false;
    @Builder.Default
    private boolean includeAllPropertiesConstructor = true;
    @Builder.Default
    private boolean includeCopyConstructor = false;
    @Builder.Default
    private boolean includeAdditionalProperties = true;
    @Builder.Default
    private boolean includeGetters = true;
    @Builder.Default
    private boolean includeSetters = true;
    @Builder.Default
    private String targetVersion = JavaVersion.parse(System.getProperty("java.version"));
    @Builder.Default
    private boolean includeDynamicAccessors = false;
    @Builder.Default
    private boolean includeDynamicGetters = false;
    @Builder.Default
    private boolean includeDynamicSetters = false;
    @Builder.Default
    private boolean includeDynamicBuilders = false;
    @Builder.Default
    private String dateTimeType = null;
    @Builder.Default
    private String dateType = null;
    @Builder.Default
    private String timeType = null;
    @Builder.Default
    private boolean formatDateTimes = false;
    @Builder.Default
    private boolean formatDates = false;
    @Builder.Default
    private boolean formatTimes = false;
    @Builder.Default
    private String refFragmentPathDelimiters = "#/.";
    @Builder.Default
    private String customDatePattern = null;
    @Builder.Default
    private String customTimePattern = null;
    @Builder.Default
    private String customDateTimePattern = null;
    @Builder.Default
    private SourceSortOrder sourceSortOrder = SourceSortOrder.OS;
    @Builder.Default
    private Map<String, String> formatTypeMapping = Collections.emptyMap();
    @Builder.Default
    private boolean useInnerClassBuilders = false;
    @Builder.Default
    private boolean includeConstructorPropertiesAnnotation = false;
    @Builder.Default
    private boolean includeGeneratedAnnotation = true;
    @Builder.Default
    private boolean useJakartaValidation = false;
}
