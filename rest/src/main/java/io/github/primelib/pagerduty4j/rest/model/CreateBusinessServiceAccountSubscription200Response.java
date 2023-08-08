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
 * CreateBusinessServiceAccountSubscription200Response
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
    "account_is_subscribed"
})
@JsonTypeName("createBusinessServiceAccountSubscription_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateBusinessServiceAccountSubscription200Response {

    @JsonProperty("account_is_subscribed")
    protected Boolean accountIsSubscribed;

    /**
     * Constructs a validated instance of {@link CreateBusinessServiceAccountSubscription200Response}.
     *
     * @param spec the specification to process
     */
    public CreateBusinessServiceAccountSubscription200Response(Consumer<CreateBusinessServiceAccountSubscription200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateBusinessServiceAccountSubscription200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateBusinessServiceAccountSubscription200Response(Consumer)} instead.
     * @param accountIsSubscribed accountIsSubscribed
     */
    @ApiStatus.Internal
    public CreateBusinessServiceAccountSubscription200Response(Boolean accountIsSubscribed) {
        this.accountIsSubscribed = accountIsSubscribed;
    }

}
