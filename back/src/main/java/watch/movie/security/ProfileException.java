package watch.movie.security;

public class ProfileException extends Exception{
    ProfileException(ErrorCode msg){
        super(String.valueOf(msg));
    }
}
