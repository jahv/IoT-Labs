package nearsoft.iot.service;

import nearsoft.iot.data.dto.Device;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ahernandez on 7/15/16.
 */
@Service
public class DeviceService {
    private Map<String, Device> entries = new HashMap<String, Device>();

    public void saveEntry(final Device device) {
        entries.put(device.getDeviceData().getMacAddress(), device);
    }

    public Device getEntry(final String macAddres) {
        return entries.get(macAddres);
    }
}
