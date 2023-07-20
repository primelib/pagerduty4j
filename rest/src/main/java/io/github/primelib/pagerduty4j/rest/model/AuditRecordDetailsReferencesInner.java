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
import lombok.experimental.Accessors;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AuditRecordDetailsReferencesInner
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

    /**
     * Constructs a validated instance of {@link AuditRecordDetailsReferencesInner}.
     *
     * @param spec the specification to process
     */
    public AuditRecordDetailsReferencesInner(Consumer<AuditRecordDetailsReferencesInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AuditRecordDetailsReferencesInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AuditRecordDetailsReferencesInner(Consumer)} instead.
     * @param name Name of the reference field
     * @param description Human readable description of the references field
     * @param added var.name
     * @param removed var.name
     */
    @ApiStatus.Internal
    public AuditRecordDetailsReferencesInner(String name, String description, List<Reference> added, List<Reference> removed) {
        this.name = name;
        this.description = description;
        this.added = added;
        this.removed = removed;
    }

}
