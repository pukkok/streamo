package watch.movie.base;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum AgeRatingCode {
    @JsonProperty("ALL")
    ALL,
    @JsonProperty("GT7")
    GT7,
    @JsonProperty("GT12")
    GT12,
    @JsonProperty("GT15")
    GT15,
    @JsonProperty("GT19")
    GT19
}
