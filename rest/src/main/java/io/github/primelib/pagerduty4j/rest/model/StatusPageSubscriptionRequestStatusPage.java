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
 * StatusPageSubscriptionRequestStatusPage
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
    "type"
})
@JsonTypeName("StatusPageSubscriptionRequest_status_page")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusPageSubscriptionRequestStatusPage {

    /**
     * The id of the status page.
     */
    @JsonProperty("id")
    protected String id;

    /**
     * A string that determines the schema of the object.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link StatusPageSubscriptionRequestStatusPage}.
     *
     * @param spec the specification to process
     */
    public StatusPageSubscriptionRequestStatusPage(Consumer<StatusPageSubscriptionRequestStatusPage> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusPageSubscriptionRequestStatusPage}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusPageSubscriptionRequestStatusPage(Consumer)} instead.
     * @param id The id of the status page.
     * @param type A string that determines the schema of the object.
     */
    @ApiStatus.Internal
    public StatusPageSubscriptionRequestStatusPage(String id, String type) {
        this.id = id;
        this.type = type;
    }

}
