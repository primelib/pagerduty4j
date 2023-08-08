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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetUserContactMethods200Response
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
    "contact_methods"
})
@JsonTypeName("getUserContactMethods_200_response")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class GetUserContactMethods200Response {

    @JsonProperty("contact_methods")
    protected List<GetUserContactMethods200ResponseContactMethodsInner> contactMethods;

    /**
     * Constructs a validated instance of {@link GetUserContactMethods200Response}.
     *
     * @param spec the specification to process
     */
    public GetUserContactMethods200Response(Consumer<GetUserContactMethods200Response> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link GetUserContactMethods200Response}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #GetUserContactMethods200Response(Consumer)} instead.
     * @param contactMethods contactMethods
     */
    @ApiStatus.Internal
    public GetUserContactMethods200Response(List<GetUserContactMethods200ResponseContactMethodsInner> contactMethods) {
        this.contactMethods = contactMethods;
    }

}
