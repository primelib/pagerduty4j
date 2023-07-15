package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IntegrationAllOfEmailFilters
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private SubjectModeEnum subjectMode;

    /**
     * Specify if subject_mode is set to match or no-match
     */
    @JsonProperty("subject_regex")
    private String subjectRegex;

    @JsonProperty("body_mode")
    private BodyModeEnum bodyMode;

    /**
     * Specify if body_mode is set to match or no-match
     */
    @JsonProperty("body_regex")
    private String bodyRegex;

    @JsonProperty("from_email_mode")
    private FromEmailModeEnum fromEmailMode;

    /**
     * Specify if from_email_mode is set to match or no-match
     */
    @JsonProperty("from_email_regex")
    private String fromEmailRegex;


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
