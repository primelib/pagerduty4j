package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AuditRecordDetailsReferencesInner
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "name",
    "description",
    "added",
    "removed"
})
@JsonTypeName("AuditRecord_details_references_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AuditRecordDetailsReferencesInner {

    /**
     * Name of the reference field
     */
    @JsonProperty("name")
    private String name;

    /**
     * Human readable description of the references field
     */
    @JsonProperty("description")
    private String description;

    @JsonProperty("added")
    private List<Reference> added;

    @JsonProperty("removed")
    private List<Reference> removed;


}
