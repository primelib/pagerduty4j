package io.github.primelib.pagerduty4j.eventsv2.auth;

import java.util.Map;

public interface AuthMethod {
    Map<String, String> headerMap();
    Map<String, String> queryMap();
    Map<String, String> cookieMap();
}