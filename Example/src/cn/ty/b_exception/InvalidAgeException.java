package cn.ty.b_exception;
/*
自定义异常InvalidAgeException
 */
public class InvalidAgeException extends RuntimeException {
    public InvalidAgeException() {

    }

    public InvalidAgeException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "年龄值非法" ;
    }

    private int minAge;
    private int maxAge;

    public int getMinAge() {
        return minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }
}
