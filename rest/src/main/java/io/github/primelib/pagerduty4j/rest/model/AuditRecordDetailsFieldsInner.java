package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AuditRecordDetailsFieldsInner
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "name",
    "description",
    "value",
    "before_value"
})
@JsonTypeName("AuditRecord_details_fields_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AuditRecordDetailsFieldsInner {

    /**
     * Name of the resource field
     */
    @JsonProperty("name")
    private String name;

    /**
     * Human readable description of the resource field
     */
    @JsonProperty("description")
    private String description;

    /**
     * new or updated value of the field
     */
    @JsonProperty("value")
    private String value;

    /**
     * previous or deleted value of the field
     */
    @JsonProperty("before_value")
    private String beforeValue;


}
