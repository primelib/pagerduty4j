package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

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
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
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
     * Constructs a validated implementation of {@link AuditRecordDetailsReferencesInner}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public AuditRecordDetailsReferencesInner(Consumer<AuditRecordDetailsReferencesInner> spec) {
        spec.accept(this);
    }

    /**
     * Name of the reference field
     */
    @JsonProperty("name")
    protected String name;

    /**
     * Human readable description of the references field
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("added")
    protected List<Reference> added;

    @JsonProperty("removed")
    protected List<Reference> removed;


}
