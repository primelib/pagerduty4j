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
 * GetAutomationActionsActionServiceAssociation200Response
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
    "service"
})
@JsonTypeName("getAutomationActionsActionServiceAssociation_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetAutomationActionsActionServiceAssociation200Response {

    @JsonProperty("service")
    protected ServiceReference service;

    /**
     * Constructs a validated instance of {@link GetAutomationActionsActionServiceAssociation200Response}.
     *
     * @param spec the specification to process
     */
    public GetAutomationActionsActionServiceAssociation200Response(Consumer<GetAutomationActionsActionServiceAssociation200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetAutomationActionsActionServiceAssociation200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetAutomationActionsActionServiceAssociation200Response(Consumer)} instead.
     * @param service var.name
     */
    @ApiStatus.Internal
    public GetAutomationActionsActionServiceAssociation200Response(ServiceReference service) {
        this.service = service;
    }

}
