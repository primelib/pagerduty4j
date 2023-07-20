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
import lombok.AllArgsConstructor;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AuditRecordMethod
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
    "description",
    "truncated_token",
    "type"
})
@JsonTypeName("AuditRecord_method")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AuditRecordMethod {

    @JsonProperty("description")
    protected String description;

    /**
     * Truncated token containing the last 4 chars of the token's actual value.
     */
    @JsonProperty("truncated_token")
    protected String truncatedToken;

    /**
     * Describes the method used to perform the action:
     * {@code browser} -- authenticated user session. Session value is not returned in the {@code truncated_token} field.
     * {@code oauth} -- access token obtained via the OAuth flow. Truncated token value is returned in the {@code truncated_token} field.
     * {@code api_token} -- Pagerduty API token. Truncated token value is returned in the {@code truncated_token} field.
     * {@code identity_provider} -- action performed by an Identity provider on behalf of a user. No value is returned in the {@code truncated_token} field.
     * {@code other} -- Method that does not fall in the predefined categories. Truncated token value MAY be returned in the {@code truncated_token} field. 
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Constructs a validated instance of {@link AuditRecordMethod}.
     *
     * @param spec the specification to process
     */
    public AuditRecordMethod(Consumer<AuditRecordMethod> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AuditRecordMethod}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AuditRecordMethod(Consumer)} instead.
     * @param description var.name
     * @param truncatedToken Truncated token containing the last 4 chars of the token's actual value.
     * @param type Describes the method used to perform the action:  {@code browser} -- authenticated user session. Session value is not returned in the {@code truncated_token} field.  {@code oauth} -- access token obtained via the OAuth flow. Truncated token value is returned in the {@code truncated_token} field.  {@code api_token} -- Pagerduty API token. Truncated token value is returned in the {@code truncated_token} field.  {@code identity_provider} -- action performed by an Identity provider on behalf of a user. No value is returned in the {@code truncated_token} field.  {@code other} -- Method that does not fall in the predefined categories. Truncated token value MAY be returned in the {@code truncated_token} field. 
     */
    @ApiStatus.Internal
    public AuditRecordMethod(String description, String truncatedToken, TypeEnum type) {
        this.description = description;
        this.truncatedToken = truncatedToken;
        this.type = type;
    }

    /**
     * Describes the method used to perform the action:
     * {@code browser} -- authenticated user session. Session value is not returned in the {@code truncated_token} field.
     * {@code oauth} -- access token obtained via the OAuth flow. Truncated token value is returned in the {@code truncated_token} field.
     * {@code api_token} -- Pagerduty API token. Truncated token value is returned in the {@code truncated_token} field.
     * {@code identity_provider} -- action performed by an Identity provider on behalf of a user. No value is returned in the {@code truncated_token} field.
     * {@code other} -- Method that does not fall in the predefined categories. Truncated token value MAY be returned in the {@code truncated_token} field. 
     */
    @AllArgsConstructor
    public enum TypeEnum {
        BROWSER("browser"),
        OAUTH("oauth"),
        API_TOKEN("api_token"),
        IDENTITY_PROVIDER("identity_provider"),
        OTHER("other");

        private final String value;
    }

}
