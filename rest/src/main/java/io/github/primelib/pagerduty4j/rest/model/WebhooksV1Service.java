package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhooksV1Service
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "name",
    "html_url",
    "deleted_at",
    "description"
})
@JsonTypeName("WebhooksV1Service")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhooksV1Service {

    @JsonProperty("id")
    private String id;

    /**
     * The name of the service.
     */
    @JsonProperty("name")
    private String name;

    @JsonProperty("html_url")
    private String htmlUrl;

    /**
     * The date/time the service was deleted, if it has been removed.
     */
    @JsonProperty("deleted_at")
    private OffsetDateTime deletedAt;

    /**
     * The description of the service.
     */
    @JsonProperty("description")
    private String description;


}
