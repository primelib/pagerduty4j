package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhooksV1AssignedToUser
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "name",
    "email",
    "html_url"
})
@JsonTypeName("WebhooksV1AssignedToUser")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhooksV1AssignedToUser {

    @JsonProperty("id")
    private String id;

    /**
     * The user's name.
     */
    @JsonProperty("name")
    private String name;

    /**
     * The user's email address.
     */
    @JsonProperty("email")
    private String email;

    @JsonProperty("html_url")
    private String htmlUrl;


}
