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
 * UserSession
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder({
    "id",
    "user_id",
    "created_at",
    "type",
    "summary"
})
@JsonTypeName("UserSession")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UserSession {

    @JsonProperty("id")
    private String id;

    @JsonProperty("user_id")
    private String userId;

    /**
     * The date/time the user session was first created.
     */
    @JsonProperty("created_at")
    private OffsetDateTime createdAt;

    /**
     * The type of the session
     */
    @JsonProperty("type")
    private TypeEnum type;

    /**
     * The summary of the session
     */
    @JsonProperty("summary")
    private String summary;


    /**
     * The type of the session
     */
    @AllArgsConstructor
    public enum TypeEnum {
        BROWSER("browser"),
        OAUTH("oauth");

        private final String value;
    }

}
