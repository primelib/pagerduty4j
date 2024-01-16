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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * UpdateLogEntryChannelRequestChannel
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
    "details",
    "type"
})
@JsonTypeName("updateLogEntryChannel_request_channel")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class UpdateLogEntryChannelRequestChannel {

    /**
     * New channel details
     */
    @JsonProperty("details")
    protected String details;

    /**
     * Channel type. Cannot be changed and must match the present value.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * Constructs a validated instance of {@link UpdateLogEntryChannelRequestChannel}.
     *
     * @param spec the specification to process
     */
    public UpdateLogEntryChannelRequestChannel(Consumer<UpdateLogEntryChannelRequestChannel> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link UpdateLogEntryChannelRequestChannel}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #UpdateLogEntryChannelRequestChannel(Consumer)} instead.
     * @param details New channel details
     * @param type Channel type. Cannot be changed and must match the present value.
     */
    @ApiStatus.Internal
    public UpdateLogEntryChannelRequestChannel(String details, TypeEnum type) {
        this.details = details;
        this.type = type;
    }

    /**
     * Channel type. Cannot be changed and must match the present value.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        WEB_TRIGGER("web_trigger"),
        MOBILE("mobile");

        private static final TypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static TypeEnum of(String input) {
            if (input != null) {
                for (TypeEnum v : VALUES) {
                    if (input.equalsIgnoreCase(v.value)) 
                        return v;
                }
            }

            return null;
        }

        @JsonValue
        public String getValue() {
            return value;
        }
    }

}
