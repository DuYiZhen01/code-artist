package code.artist.common.result;

/**
 * 响应对象
 * 使用泛型
 * @param <T>
 */
public class RestResponse<T> {

    private int code;
    private String message;
    private T data;

    public RestResponse() {
    }

    public RestResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public RestResponse(int code, String message, T data) {
        this(code, message);
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
