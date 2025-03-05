package watch.movie.base;

import lombok.Getter;
import org.springframework.http.HttpStatus;

public enum StatusCode {
    /**
     * 공통코드
     */
    SUCCESS(HttpStatus.OK.value(), "C_200", "성공"),
    NOT_FOUND(HttpStatus.OK.value(), "C_404", "페이지를 찾을 수 없습니다.");

    @Getter
    private int statusCode;
    @Getter
    private String customCode;
    @Getter
    private String msg;

    private StatusCode(int statusCode, String customCode, String msg) {
        this.statusCode = statusCode;
        this.customCode = customCode;
        this.msg = msg;
    }
}
