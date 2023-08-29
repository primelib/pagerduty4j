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

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * StandardAppliedStandardsInner
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
    "active",
    "description",
    "id",
    "name",
    "type",
    "pass"
})
@JsonTypeName("StandardApplied_standards_inner")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StandardAppliedStandardsInner {

    @JsonProperty("active")
    protected Boolean active;

    @JsonProperty("description")
    protected String description;

    @JsonProperty("id")
    protected String id;

    @JsonProperty("name")
    protected String name;

    @JsonProperty("type")
    protected String type;

    @JsonProperty("pass")
    protected Boolean pass;

    /**
     * Constructs a validated instance of {@link StandardAppliedStandardsInner}.
     *
     * @param spec the specification to process
     */
    public StandardAppliedStandardsInner(Consumer<StandardAppliedStandardsInner> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StandardAppliedStandardsInner}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StandardAppliedStandardsInner(Consumer)} instead.
     * @param active active
     * @param description description
     * @param id id
     * @param name name
     * @param type type
     * @param pass pass
     */
    @ApiStatus.Internal
    public StandardAppliedStandardsInner(Boolean active, String description, String id, String name, String type, Boolean pass) {
        this.active = active;
        this.description = description;
        this.id = id;
        this.name = name;
        this.type = type;
        this.pass = pass;
    }

}
