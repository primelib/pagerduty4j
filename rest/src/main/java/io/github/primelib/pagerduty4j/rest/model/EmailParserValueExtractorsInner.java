package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * EmailParserValueExtractorsInner
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "type",
    "part",
    "value_name",
    "regex",
    "starts_after",
    "ends_with"
})
@JsonTypeName("EmailParser_value_extractors_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class EmailParserValueExtractorsInner {

    @JsonProperty("type")
    private TypeEnum type;

    @JsonProperty("part")
    private PartEnum part;

    /**
     * The field name to set in the Incident object. Exactly one must use the `value_name` of `incident_key`
     */
    @JsonProperty("value_name")
    private String valueName;

    @JsonProperty("regex")
    private String regex;

    @JsonProperty("starts_after")
    private String startsAfter;

    @JsonProperty("ends_with")
    private String endsWith;


    @AllArgsConstructor
    public enum TypeEnum {
        ENTIRE("entire"),
        REGEX("regex"),
        BETWEEN("between");

        private final String value;
    }

    @AllArgsConstructor
    public enum PartEnum {
        BODY("body"),
        SUBJECT("subject"),
        FROM_ADDRESSES("from_addresses");

        private final String value;
    }

}
