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
 * StatusPagePostUpdateStatus
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
@JsonTypeName("StatusPagePostUpdate_status")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class StatusPagePostUpdateStatus {

    /**
     * Status page Status unique identifier
     */
    @JsonProperty("id")
    protected String id;

    /**
     * A string that determines the schema of the object.
     */
    @JsonProperty("type")
    protected String type;

    /**
     * Constructs a validated instance of {@link StatusPagePostUpdateStatus}.
     *
     * @param spec the specification to process
     */
    public StatusPagePostUpdateStatus(Consumer<StatusPagePostUpdateStatus> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link StatusPagePostUpdateStatus}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #StatusPagePostUpdateStatus(Consumer)} instead.
     * @param id Status page Status unique identifier
     * @param type A string that determines the schema of the object.
     */
    @ApiStatus.Internal
    public StatusPagePostUpdateStatus(String id, String type) {
        this.id = id;
        this.type = type;
    }

}
