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
 * AutomationActionsScriptActionDataReference
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
    "script",
    "invocation_command"
})
@JsonTypeName("AutomationActionsScriptActionDataReference")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class AutomationActionsScriptActionDataReference {

    /**
     * Body of the script to be executed on the Runner. To execute it, the Runner will write the content of the property into a temp file, make the file executable and execute it. It is assumed that the Runner has a properly configured environment to run the script as an executable file. This behaviour can be altered by providing the {@code invocation_command} property. The maxLength value is specified in bytes.
     */
    @JsonProperty("script")
    protected String script;

    /**
     * The command to executed a script with. With the body of the script written into a temp file, the Runner will execute the {@code &amp;lt;invocation_command&amp;gt; &amp;lt;temp_file&amp;gt;} command. The maxLength value is specified in bytes.
     */
    @JsonProperty("invocation_command")
    protected String invocationCommand;

    /**
     * Constructs a validated instance of {@link AutomationActionsScriptActionDataReference}.
     *
     * @param spec the specification to process
     */
    public AutomationActionsScriptActionDataReference(Consumer<AutomationActionsScriptActionDataReference> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link AutomationActionsScriptActionDataReference}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #AutomationActionsScriptActionDataReference(Consumer)} instead.
     * @param script Body of the script to be executed on the Runner. To execute it, the Runner will write the content of the property into a temp file, make the file executable and execute it. It is assumed that the Runner has a properly configured environment to run the script as an executable file. This behaviour can be altered by providing the {@code invocation_command} property. The maxLength value is specified in bytes.
     * @param invocationCommand The command to executed a script with. With the body of the script written into a temp file, the Runner will execute the {@code &amp;lt;invocation_command&amp;gt; &amp;lt;temp_file&amp;gt;} command. The maxLength value is specified in bytes.
     */
    @ApiStatus.Internal
    public AutomationActionsScriptActionDataReference(String script, String invocationCommand) {
        this.script = script;
        this.invocationCommand = invocationCommand;
    }

}
