package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IntegrationAllOfEmailFilters
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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

    /**
     * Constructs a validated implementation of {@link IntegrationAllOfEmailFilters}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public IntegrationAllOfEmailFilters(Consumer<IntegrationAllOfEmailFilters> spec) {
        spec.accept(this);
    }

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


    @AllArgsConstructor
    public enum SubjectModeEnum {
        MATCH("match"),
        NO_MATCH("no-match"),
        ALWAYS("always");

        private final String value;
    }

    @AllArgsConstructor
    public enum BodyModeEnum {
        MATCH("match"),
        NO_MATCH("no-match"),
        ALWAYS("always");

        private final String value;
    }

    @AllArgsConstructor
    public enum FromEmailModeEnum {
        MATCH("match"),
        NO_MATCH("no-match"),
        ALWAYS("always");

        private final String value;
    }

}
