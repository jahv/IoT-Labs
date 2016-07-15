package nearsoft.iot.web;

import nearsoft.iot.data.dto.Device;
import nearsoft.iot.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ahernandez on 7/15/16.
 */
@Controller
@RequestMapping("/device")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Integer> saveEntryData(@RequestBody final Device device) {
        deviceService.saveEntry(device);
        return new ResponseEntity<Integer>(200, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Device getEntry(@RequestParam(value = "id")  final String macAddress) {
        return deviceService.getEntry(macAddress);
    }
}
