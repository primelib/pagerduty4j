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
 * AuditMetadata
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
    "messages"
})
@JsonTypeName("AuditMetadata")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AuditMetadata {

    @JsonProperty("messages")
    protected List<String> messages;

    /**
     * Constructs a validated instance of {@link AuditMetadata}.
     *
     * @param spec the specification to process
     */
    public AuditMetadata(Consumer<AuditMetadata> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AuditMetadata}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AuditMetadata(Consumer)} instead.
     * @param messages messages
     */
    @ApiStatus.Internal
    public AuditMetadata(List<String> messages) {
        this.messages = messages;
    }

}
