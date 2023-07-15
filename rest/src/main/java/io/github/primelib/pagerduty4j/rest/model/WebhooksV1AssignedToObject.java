package io.github.primelib.pagerduty4j.rest.model;

import javax.annotation.processing.Generated;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebhooksV1AssignedToObject
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "name",
    "email",
    "html_url",
    "type"
})
@JsonTypeName("WebhooksV1AssignedTo_object")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class WebhooksV1AssignedToObject {

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

    @JsonProperty("type")
    private TypeEnum type;


    @AllArgsConstructor
    public enum TypeEnum {
        USER("user");

        private final String value;
    }

}
