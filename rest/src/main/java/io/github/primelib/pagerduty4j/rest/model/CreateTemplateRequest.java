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
 * CreateTemplateRequest
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
    "template"
})
@JsonTypeName("createTemplate_request")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class CreateTemplateRequest {

    @JsonProperty("template")
    protected EditableTemplate template;

    /**
     * Constructs a validated instance of {@link CreateTemplateRequest}.
     *
     * @param spec the specification to process
     */
    public CreateTemplateRequest(Consumer<CreateTemplateRequest> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link CreateTemplateRequest}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #CreateTemplateRequest(Consumer)} instead.
     * @param template template
     */
    @ApiStatus.Internal
    public CreateTemplateRequest(EditableTemplate template) {
        this.template = template;
    }

}
