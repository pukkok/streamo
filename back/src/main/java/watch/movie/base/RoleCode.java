package watch.movie.base;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum RoleCode {
    @JsonProperty("ADMIN")
    ADMIN,
    @JsonProperty("NOT_ALLOW")
    NOT_ALLOW,
    @JsonProperty("ADULT")
    ADULT,
    @JsonProperty("NOT_ADULT")
    NOT_ADULT,
}
