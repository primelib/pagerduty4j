package io.github.primelib.pagerduty4j.rest.model;

import java.util.List;
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
 * ListEventOrchestrations200ResponseAllOfOrchestrationsInnerUpdatedBy
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
    "id",
    "type",
    "self"
})
@JsonTypeName("listEventOrchestrations_200_response_allOf_orchestrations_inner_updated_by")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ListEventOrchestrations200ResponseAllOfOrchestrationsInnerUpdatedBy {

    @JsonProperty("id")
    protected String id;

    /**
     * A string that determines the schema of the object
     */
    @JsonProperty("type")
    protected String type;

    /**
     * The API show URL at which the object is accessible
     */
    @JsonProperty("self")
    protected String self;

    /**
     * Constructs a validated instance of {@link ListEventOrchestrations200ResponseAllOfOrchestrationsInnerUpdatedBy}.
     *
     * @param spec the specification to process
     */
    public ListEventOrchestrations200ResponseAllOfOrchestrationsInnerUpdatedBy(Consumer<ListEventOrchestrations200ResponseAllOfOrchestrationsInnerUpdatedBy> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ListEventOrchestrations200ResponseAllOfOrchestrationsInnerUpdatedBy}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ListEventOrchestrations200ResponseAllOfOrchestrationsInnerUpdatedBy(Consumer)} instead.
     * @param id id
     * @param type A string that determines the schema of the object
     * @param self The API show URL at which the object is accessible
     */
    @ApiStatus.Internal
    public ListEventOrchestrations200ResponseAllOfOrchestrationsInnerUpdatedBy(String id, String type, String self) {
        this.id = id;
        this.type = type;
        this.self = self;
    }

}
