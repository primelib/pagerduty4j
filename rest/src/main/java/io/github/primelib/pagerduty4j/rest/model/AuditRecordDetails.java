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
 * AuditRecordDetails
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "resource",
    "fields",
    "references"
})
@JsonTypeName("AuditRecord_details")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AuditRecordDetails {

    @JsonProperty("resource")
    private Reference resource;

    /**
     * A set of fields that have been affected. The fields that have not been affected MAY be returned. 
     */
    @JsonProperty("fields")
    private List<AuditRecordDetailsFieldsInner> fields;

    /**
     * A set of references that have been affected.
     */
    @JsonProperty("references")
    private List<AuditRecordDetailsReferencesInner> references;


}
