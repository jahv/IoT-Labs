package nearsoft.iot.data.dto;

/**
 * Created by ahernandez on 7/15/16.
 */
public class DeviceMeta {

    private Integer error;
    private Integer code;
    private String status;

    public Integer getError() {
        return error;
    }

    public void setError(final Integer error) {
        this.error = error;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(final Integer code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }
}
