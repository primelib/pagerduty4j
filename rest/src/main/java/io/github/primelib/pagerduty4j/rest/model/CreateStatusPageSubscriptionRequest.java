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
 * CreateStatusPageSubscriptionRequest
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
    "subscription"
})
@JsonTypeName("createStatusPageSubscription_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateStatusPageSubscriptionRequest {

    @JsonProperty("subscription")
    protected StatusPageSubscriptionRequest subscription;

    /**
     * Constructs a validated instance of {@link CreateStatusPageSubscriptionRequest}.
     *
     * @param spec the specification to process
     */
    public CreateStatusPageSubscriptionRequest(Consumer<CreateStatusPageSubscriptionRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateStatusPageSubscriptionRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateStatusPageSubscriptionRequest(Consumer)} instead.
     * @param subscription subscription
     */
    @ApiStatus.Internal
    public CreateStatusPageSubscriptionRequest(StatusPageSubscriptionRequest subscription) {
        this.subscription = subscription;
    }

}
