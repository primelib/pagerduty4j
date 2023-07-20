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
 * GetAutomationActionsActionServiceAssociations200Response
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
    "services"
})
@JsonTypeName("getAutomationActionsActionServiceAssociations_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAutomationActionsActionServiceAssociations200Response {

    @JsonProperty("services")
    protected List<ServiceReference> services;

    /**
     * Constructs a validated instance of {@link GetAutomationActionsActionServiceAssociations200Response}.
     *
     * @param spec the specification to process
     */
    public GetAutomationActionsActionServiceAssociations200Response(Consumer<GetAutomationActionsActionServiceAssociations200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetAutomationActionsActionServiceAssociations200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetAutomationActionsActionServiceAssociations200Response(Consumer)} instead.
     * @param services var.name
     */
    @ApiStatus.Internal
    public GetAutomationActionsActionServiceAssociations200Response(List<ServiceReference> services) {
        this.services = services;
    }

}
