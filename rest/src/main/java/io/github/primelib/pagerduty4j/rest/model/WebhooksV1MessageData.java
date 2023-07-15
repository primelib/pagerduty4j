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
 * WebhooksV1MessageData
 *
 */
@Data
@AllArgsConstructor
@Accessors(fluent = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@JsonPropertyOrder({
    "incident"
})
@JsonTypeName("WebhooksV1Message_data")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhooksV1MessageData {

    /**
     * Constructs a validated implementation of {@link WebhooksV1MessageData}.
     *
     * @param spec the specification to process
     */
    @ApiStatus.Internal
    public WebhooksV1MessageData(Consumer<WebhooksV1MessageData> spec) {
        spec.accept(this);
    }

    @JsonProperty("incident")
    protected WebhooksV1IncidentData incident;


}
