package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * IntegrationAllOfEmailFilters
 *
 */
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Accessors(fluent = true, chain = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Builder
@JsonPropertyOrder({
    "subject_mode",
    "subject_regex",
    "body_mode",
    "body_regex",
    "from_email_mode",
    "from_email_regex"
})
@JsonTypeName("Integration_allOf_email_filters")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class IntegrationAllOfEmailFilters {

    @JsonProperty("subject_mode")
    protected SubjectModeEnum subjectMode;

    /**
     * Specify if subject_mode is set to match or no-match
     */
    @JsonProperty("subject_regex")
    protected String subjectRegex;

    @JsonProperty("body_mode")
    protected BodyModeEnum bodyMode;

    /**
     * Specify if body_mode is set to match or no-match
     */
    @JsonProperty("body_regex")
    protected String bodyRegex;

    @JsonProperty("from_email_mode")
    protected FromEmailModeEnum fromEmailMode;

    /**
     * Specify if from_email_mode is set to match or no-match
     */
    @JsonProperty("from_email_regex")
    protected String fromEmailRegex;

    /**
     * Constructs a validated instance of {@link IntegrationAllOfEmailFilters}.
     *
     * @param spec the specification to process
     */
    public IntegrationAllOfEmailFilters(Consumer<IntegrationAllOfEmailFilters> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link IntegrationAllOfEmailFilters}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #IntegrationAllOfEmailFilters(Consumer)} instead.
     * @param subjectMode subjectMode
     * @param subjectRegex Specify if subject_mode is set to match or no-match
     * @param bodyMode bodyMode
     * @param bodyRegex Specify if body_mode is set to match or no-match
     * @param fromEmailMode fromEmailMode
     * @param fromEmailRegex Specify if from_email_mode is set to match or no-match
     */
    @ApiStatus.Internal
    public IntegrationAllOfEmailFilters(SubjectModeEnum subjectMode, String subjectRegex, BodyModeEnum bodyMode, String bodyRegex, FromEmailModeEnum fromEmailMode, String fromEmailRegex) {
        this.subjectMode = subjectMode;
        this.subjectRegex = subjectRegex;
        this.bodyMode = bodyMode;
        this.bodyRegex = bodyRegex;
        this.fromEmailMode = fromEmailMode;
        this.fromEmailRegex = fromEmailRegex;
    }

    @AllArgsConstructor
    public enum SubjectModeEnum {
        MATCH("match"),
        NO_MATCH("no-match"),
        ALWAYS("always");

        private static final SubjectModeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static SubjectModeEnum of(String input) {
            if (input != null) {
                for (SubjectModeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

    @AllArgsConstructor
    public enum BodyModeEnum {
        MATCH("match"),
        NO_MATCH("no-match"),
        ALWAYS("always");

        private static final BodyModeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static BodyModeEnum of(String input) {
            if (input != null) {
                for (BodyModeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

    @AllArgsConstructor
    public enum FromEmailModeEnum {
        MATCH("match"),
        NO_MATCH("no-match"),
        ALWAYS("always");

        private static final FromEmailModeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static FromEmailModeEnum of(String input) {
            if (input != null) {
                for (FromEmailModeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
