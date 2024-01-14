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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * ResponsePlay
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
    "summary",
    "type",
    "self",
    "html_url",
    "name",
    "description",
    "team",
    "subscribers",
    "subscribers_message",
    "responders",
    "responders_message",
    "runnability",
    "conference_number",
    "conference_url",
    "conference_type"
})
@JsonTypeName("ResponsePlay")
@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class ResponsePlay {

    @JsonProperty("id")
    protected String id;

    /**
     * A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     */
    @JsonProperty("summary")
    protected String summary;

    /**
     * The type of object being created.
     */
    @JsonProperty("type")
    protected TypeEnum type;

    /**
     * the API show URL at which the object is accessible
     */
    @JsonProperty("self")
    protected String self;

    /**
     * a URL at which the entity is uniquely displayed in the Web app
     */
    @JsonProperty("html_url")
    protected String htmlUrl;

    /**
     * The name of the response play.
     */
    @JsonProperty("name")
    protected String name;

    /**
     * The description of the response play.
     */
    @JsonProperty("description")
    protected String description;

    @JsonProperty("team")
    protected ResponsePlayAllOfTeam team;

    /**
     * An array containing the users and/or teams to be added as subscribers to any incident on which this response play is run.
     */
    @JsonProperty("subscribers")
    protected List<ResponsePlayAllOfSubscribers> subscribers;

    /**
     * The content of the notification that will be sent to all incident subscribers upon the running of this response play. Note that this includes any users who may have already been subscribed to the incident prior to the running of this response play. If empty, no notifications will be sent.
     */
    @JsonProperty("subscribers_message")
    protected String subscribersMessage;

    /**
     * An array containing the users and/or escalation policies to be requested as responders to any incident on which this response play is run.
     */
    @JsonProperty("responders")
    protected List<ResponsePlayAllOfResponders> responders;

    /**
     * The message body of the notification that will be sent to this response play's set of responders. If empty, a default response request notification will be sent.
     */
    @JsonProperty("responders_message")
    protected String respondersMessage;

    /**
     * String representing how this response play is allowed to be run. Valid options are:
     *  - {@code services}: This response play cannot be manually run by any users. It will run automatically for new incidents triggered on any services that are configured with this response play.
     *  - {@code teams}: This response play can be run manually on an incident only by members of its configured team. This option can only be selected when the {@code team} property for this response play is not empty.
     *  - {@code responders}: This response play can be run manually on an incident by any responders in this account.
     */
    @JsonProperty("runnability")
    protected RunnabilityEnum runnability;

    /**
     * The telephone number that will be set as the conference number for any incident on which this response play is run.
     */
    @JsonProperty("conference_number")
    protected String conferenceNumber;

    /**
     * The URL that will be set as the conference URL for any incident on which this response play is run.
     */
    @JsonProperty("conference_url")
    protected String conferenceUrl;

    /**
     * This field has three possible values and indicates how the response play was created.
     *  - {@code none} : The response play had no conference_number or conference_url set at time of creation.
     *  - {@code manual} : The response play had one or both of conference_number and conference_url set at time of creation.
     *  - {@code zoom} : Customers with the Zoom-Integration Entitelment can use this value to dynamicly configure conference number and url for zoom
     */
    @JsonProperty("conference_type")
    protected ConferenceTypeEnum conferenceType;

    /**
     * Constructs a validated instance of {@link ResponsePlay}.
     *
     * @param spec the specification to process
     */
    public ResponsePlay(Consumer<ResponsePlay> spec) {
        spec.accept(this);
    }

    /**
     * Constructs a validated instance of {@link ResponsePlay}.
     * <p>
     * NOTE: This constructor is not considered stable and may change if the model is updated. Consider using {@link #ResponsePlay(Consumer)} instead.
     * @param id id
     * @param summary A short-form, server-generated string that provides succinct, important information about an object suitable for primary labeling of an entity in a client. In many cases, this will be identical to {@code name}, though it is not intended to be an identifier.
     * @param type The type of object being created.
     * @param self the API show URL at which the object is accessible
     * @param htmlUrl a URL at which the entity is uniquely displayed in the Web app
     * @param name The name of the response play.
     * @param description The description of the response play.
     * @param team team
     * @param subscribers An array containing the users and/or teams to be added as subscribers to any incident on which this response play is run.
     * @param subscribersMessage The content of the notification that will be sent to all incident subscribers upon the running of this response play. Note that this includes any users who may have already been subscribed to the incident prior to the running of this response play. If empty, no notifications will be sent.
     * @param responders An array containing the users and/or escalation policies to be requested as responders to any incident on which this response play is run.
     * @param respondersMessage The message body of the notification that will be sent to this response play's set of responders. If empty, a default response request notification will be sent.
     * @param runnability String representing how this response play is allowed to be run. Valid options are:   - {@code services}: This response play cannot be manually run by any users. It will run automatically for new incidents triggered on any services that are configured with this response play.   - {@code teams}: This response play can be run manually on an incident only by members of its configured team. This option can only be selected when the {@code team} property for this response play is not empty.   - {@code responders}: This response play can be run manually on an incident by any responders in this account.
     * @param conferenceNumber The telephone number that will be set as the conference number for any incident on which this response play is run.
     * @param conferenceUrl The URL that will be set as the conference URL for any incident on which this response play is run.
     * @param conferenceType This field has three possible values and indicates how the response play was created.   - {@code none} : The response play had no conference_number or conference_url set at time of creation.   - {@code manual} : The response play had one or both of conference_number and conference_url set at time of creation.   - {@code zoom} : Customers with the Zoom-Integration Entitelment can use this value to dynamicly configure conference number and url for zoom
     */
    @ApiStatus.Internal
    public ResponsePlay(String id, String summary, TypeEnum type, String self, String htmlUrl, String name, String description, ResponsePlayAllOfTeam team, List<ResponsePlayAllOfSubscribers> subscribers, String subscribersMessage, List<ResponsePlayAllOfResponders> responders, String respondersMessage, RunnabilityEnum runnability, String conferenceNumber, String conferenceUrl, ConferenceTypeEnum conferenceType) {
        this.id = id;
        this.summary = summary;
        this.type = type;
        this.self = self;
        this.htmlUrl = htmlUrl;
        this.name = name;
        this.description = description;
        this.team = team;
        this.subscribers = subscribers;
        this.subscribersMessage = subscribersMessage;
        this.responders = responders;
        this.respondersMessage = respondersMessage;
        this.runnability = runnability;
        this.conferenceNumber = conferenceNumber;
        this.conferenceUrl = conferenceUrl;
        this.conferenceType = conferenceType;
    }

    /**
     * The type of object being created.
     */
    @AllArgsConstructor
    public enum TypeEnum {
        RESPONSE_PLAY("response_play");

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

    /**
     * String representing how this response play is allowed to be run. Valid options are:
     *  - {@code services}: This response play cannot be manually run by any users. It will run automatically for new incidents triggered on any services that are configured with this response play.
     *  - {@code teams}: This response play can be run manually on an incident only by members of its configured team. This option can only be selected when the {@code team} property for this response play is not empty.
     *  - {@code responders}: This response play can be run manually on an incident by any responders in this account.
     */
    @AllArgsConstructor
    public enum RunnabilityEnum {
        SERVICES("services"),
        TEAMS("teams"),
        RESPONDERS("responders");

        private static final RunnabilityEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static RunnabilityEnum of(String input) {
            if (input != null) {
                for (RunnabilityEnum v : VALUES) {
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

    /**
     * This field has three possible values and indicates how the response play was created.
     *  - {@code none} : The response play had no conference_number or conference_url set at time of creation.
     *  - {@code manual} : The response play had one or both of conference_number and conference_url set at time of creation.
     *  - {@code zoom} : Customers with the Zoom-Integration Entitelment can use this value to dynamicly configure conference number and url for zoom
     */
    @AllArgsConstructor
    public enum ConferenceTypeEnum {
        NONE("none"),
        MANUAL("manual"),
        ZOOM("zoom");

        private static final ConferenceTypeEnum[] VALUES = values(); // prevent allocating a new array for every call to values()
        private final String value;

        @JsonCreator
        public static ConferenceTypeEnum of(String input) {
            if (input != null) {
                for (ConferenceTypeEnum v : VALUES) {
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
