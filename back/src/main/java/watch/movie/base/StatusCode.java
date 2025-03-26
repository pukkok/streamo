package watch.movie.base;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum StatusCode {
    /**
     * 공통코드
     */
    SUCCESS(HttpStatus.OK.value(), "C_200", "성공"),
    NOT_FOUND(HttpStatus.NOT_FOUND.value(), "C_404", "페이지를 찾을 수 없습니다."),
    BOARD_NOT_FOUND(HttpStatus.NOT_FOUND.value(), "C_404", "해당 게시글을 찾을 수 없습니다."),

    /**
     * 회원
     */
    DUPLICATED_ID(HttpStatus.BAD_REQUEST.value(), "C_400", "중복된 아이디가 존재합니다."),
    USER_NOT_FOUND(HttpStatus.NOT_FOUND.value(), "C_404", "해당 유저가 존재하지 않습니다.");

    /**
     * 커스텀해서 사용할 변수들
     */
    private final int statusCode;
    private final String customCode;
    private final String msg;

    private StatusCode(int statusCode, String customCode, String msg) {
        this.statusCode = statusCode;
        this.customCode = customCode;
        this.msg = msg;
    }
}
