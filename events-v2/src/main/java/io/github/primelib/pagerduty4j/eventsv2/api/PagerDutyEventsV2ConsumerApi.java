package io.github.primelib.pagerduty4j.eventsv2.api;

import javax.annotation.processing.Generated;

import io.github.primelib.pagerduty4j.eventsv2.model.CreateChangeEvent202Response;

import java.util.function.Consumer;

import io.github.primelib.pagerduty4j.eventsv2.spec.CreateChangeEventOperationSpec;
import io.github.primelib.pagerduty4j.eventsv2.spec.CreateV2EventOperationSpec;

@Generated(value = "io.github.primelib.primecodegen.javafeign.JavaFeignGenerator")
public class PagerDutyEventsV2ConsumerApi {
    private final PagerDutyEventsV2Api api;

    public PagerDutyEventsV2ConsumerApi(PagerDutyEventsV2Api api) {
        this.api = api;
    }

    /**
     * Send change events to the PagerDuty Events API
     * <p>
     * Change Events API enables you to send informational events about recent changes such as code deploys and system config changes from any system that can make an outbound HTTP connection. These events do not create incidents and do not send notifications; they are shown in context with incidents on the same PagerDuty service. 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>createChangeEventRequest: </li>
     * </ul>
     */
    public CreateChangeEvent202Response createChangeEvent(Consumer<CreateChangeEventOperationSpec> spec) {
        CreateChangeEventOperationSpec r = new CreateChangeEventOperationSpec(spec);
        return api.createChangeEvent(r.createChangeEventRequest());
    }

    /**
     * Send an event to PagerDuty
     * <p>
     * Your monitoring tools should send PagerDuty a trigger event to report a new problem, or update an ongoing problem, depending on the event type. 
     * @param spec a consumer that creates the payload for this operation. Supports the following properties:
     * <ul>
     *   <li>createV2EventRequest: </li>
     * </ul>
     */
    public CreateChangeEvent202Response createV2Event(Consumer<CreateV2EventOperationSpec> spec) {
        CreateV2EventOperationSpec r = new CreateV2EventOperationSpec(spec);
        return api.createV2Event(r.createV2EventRequest());
    }

}
