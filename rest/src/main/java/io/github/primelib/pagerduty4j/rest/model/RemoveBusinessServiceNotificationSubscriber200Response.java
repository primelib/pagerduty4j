package io.github.primelib.pagerduty4j.rest.model;

import java.util.function.Consumer;
import org.jetbrains.annotations.ApiStatus;
import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RemoveBusinessServiceNotificationSubscriber200Response
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "deleted_count",
    "unauthorized_count",
    "non_existent_count"
})
@JsonTypeName("removeBusinessServiceNotificationSubscriber_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoveBusinessServiceNotificationSubscriber200Response {

    /**
     * Constructs a validated implementation of {@link RemoveBusinessServiceNotificationSubscriber200Response}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public RemoveBusinessServiceNotificationSubscriber200Response(Consumer<RemoveBusinessServiceNotificationSubscriber200Response> spec) {
        spec.accept(this);
    }

    @JsonProperty("deleted_count")
    protected BigDecimal deletedCount;

    @JsonProperty("unauthorized_count")
    protected BigDecimal unauthorizedCount;

    @JsonProperty("non_existent_count")
    protected BigDecimal nonExistentCount;


}
