package nearsoft.iot.data.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by ahernandez on 7/15/16.
 */
public class Device {
    @JsonProperty("meta")
    private DeviceMeta deviceMeta;

    @JsonProperty("data")
    private DeviceData deviceData;

    public DeviceMeta getDeviceMeta() {
        return deviceMeta;
    }

    public void setDeviceMeta(final DeviceMeta deviceMeta) {
        this.deviceMeta = deviceMeta;
    }

    public DeviceData getDeviceData() {
        return deviceData;
    }

    public void setDeviceData(final DeviceData deviceData) {
        this.deviceData = deviceData;
    }
}
