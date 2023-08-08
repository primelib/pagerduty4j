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

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * RemoveBusinessServiceNotificationSubscriber200Response
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
    "deleted_count",
    "unauthorized_count",
    "non_existent_count"
})
@JsonTypeName("removeBusinessServiceNotificationSubscriber_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class RemoveBusinessServiceNotificationSubscriber200Response {

    @JsonProperty("deleted_count")
    protected BigDecimal deletedCount;

    @JsonProperty("unauthorized_count")
    protected BigDecimal unauthorizedCount;

    @JsonProperty("non_existent_count")
    protected BigDecimal nonExistentCount;

    /**
     * Constructs a validated instance of {@link RemoveBusinessServiceNotificationSubscriber200Response}.
     *
     * @param spec the specification to process
     */
    public RemoveBusinessServiceNotificationSubscriber200Response(Consumer<RemoveBusinessServiceNotificationSubscriber200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link RemoveBusinessServiceNotificationSubscriber200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #RemoveBusinessServiceNotificationSubscriber200Response(Consumer)} instead.
     * @param deletedCount deletedCount
     * @param unauthorizedCount unauthorizedCount
     * @param nonExistentCount nonExistentCount
     */
    @ApiStatus.Internal
    public RemoveBusinessServiceNotificationSubscriber200Response(BigDecimal deletedCount, BigDecimal unauthorizedCount, BigDecimal nonExistentCount) {
        this.deletedCount = deletedCount;
        this.unauthorizedCount = unauthorizedCount;
        this.nonExistentCount = nonExistentCount;
    }

}
