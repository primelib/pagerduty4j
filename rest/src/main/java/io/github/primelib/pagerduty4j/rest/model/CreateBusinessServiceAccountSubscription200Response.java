package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CreateBusinessServiceAccountSubscription200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "account_is_subscribed"
})
@JsonTypeName("createBusinessServiceAccountSubscription_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateBusinessServiceAccountSubscription200Response {

    /**
     * Constructs a validated implementation of {@link CreateBusinessServiceAccountSubscription200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public CreateBusinessServiceAccountSubscription200Response(Consumer<CreateBusinessServiceAccountSubscription200Response> spec) {
        spec.accept(this);
    }

    @JsonProperty("account_is_subscribed")
    protected Boolean accountIsSubscribed;


}
