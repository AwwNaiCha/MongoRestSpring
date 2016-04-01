package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Map;

/**
 * Created by huimin on 3/28/16.
 */

@Controller
public class CustomerController {

    @Autowired
    ClientRepo clientRepo;

    @Autowired
    ServerRepo serverRepo;

    @RequestMapping(value="/boot", method = RequestMethod.GET)
    public ModelAndView startBoot() {
        ModelAndView mav = new ModelAndView("boot");
        mav.addObject("boot","boot");
        return mav;
    }

    @RequestMapping(value="/boot", method = RequestMethod.POST)
    public ModelAndView createProfile(final RedirectAttributes redirectAttributes) {
        ModelAndView mav = new ModelAndView("redirect:/register");
        return mav;
    }

    @RequestMapping(value="/register", method = RequestMethod.GET)
    public ModelAndView emptyProfile() {
        Client client = new Client();
        ModelAndView mav = new ModelAndView("register");
        mav.addObject("client",client);
        return mav;
    }

    @RequestMapping(value="/register", method = RequestMethod.POST)
    public ModelAndView createProfile(@ModelAttribute Client client, final RedirectAttributes redirectAttributes) {
        if(client.getObjectId() == null || client.getObjectId().equals("")) {
            ModelAndView mav = new ModelAndView("redirect:/register");
            return mav;
        }
        ModelAndView mav = new ModelAndView("redirect:/client/" + client.getObjectId());
        if(clientRepo.findByObjectId(client.getObjectId()) != null) {
            Client newClient = clientRepo.findByObjectId(client.getObjectId());
            //newClient.setId(client.getId());
            newClient.setObjectName(client.getObjectName());
            newClient.setAvailPowerSource(client.getAvailPowerSource());
            newClient.setBatteryLevel(client.getBatteryLevel());
            newClient.setBatteryStatus(client.getBatteryStatus());
            newClient.setCurrentTime(client.getCurrentTime());
            newClient.setDeviceType(client.getDeviceType());
            newClient.setErrorCode(client.getErrorCode());
            newClient.setFactoryReset(client.getFactoryReset());
            newClient.setFirmwareVersion(client.getFirmwareVersion());
            newClient.setHardwareVersion(client.getHardwareVersion());
            newClient.setManufacturer(client.getManufacturer());
            newClient.setMemoryFree(client.getMemoryFree());
            newClient.setMemoryTotal(client.getMemoryTotal());
            newClient.setModelNumber(client.getModelNumber());
            newClient.setPowerSourceCurrent(client.getPowerSourceCurrent());
            newClient.setPowerSourceVoltage(client.getPowerSourceVoltage());
            newClient.setReboot(client.getReboot());
            newClient.setResetErrorCode(client.getResetErrorCode());
            newClient.setSerialNumber(client.getSerialNumber());
            newClient.setSoftwareVersion(client.getSoftwareVersion());
            newClient.setSupportBindingAndModes(client.getSupportBindingAndModes());
            newClient.setTimezone(client.getTimezone());
            newClient.setUtcOffset(client.getUtcOffset());

            clientRepo.save(newClient);

        }
        else {
            clientRepo.save(client);
        }
        return mav;
    }

    @RequestMapping(value = {"/client/{objectId}"}, method = RequestMethod.GET)
    public String showProfile(@PathVariable String objectId, Model model){
        model.addAttribute("client", clientRepo.findByObjectId(objectId));
        return "client";
    }

    @RequestMapping(value = {"/client/{objectId}"}, method = RequestMethod.POST)
    public ModelAndView postProfileDetail(@ModelAttribute Client client, @RequestParam Map<String,String> allRequestParams,
                                          @PathVariable String objectId, final RedirectAttributes redirectAttributes) {

        if(allRequestParams.containsKey("action")) {
            if (allRequestParams.get("action").equals("delete")) {
                ModelAndView mav = new ModelAndView("redirect:/redirectafterdelete");
                clientRepo.delete(clientRepo.findByObjectId(objectId));
                return mav;
            }
        }

        if(clientRepo.findByObjectId(objectId) != null) {
            Client newClient = clientRepo.findByObjectId(objectId);
            //newClient.setId(client.getId());
            newClient.setAvailPowerSource(client.getAvailPowerSource());
            newClient.setBatteryLevel(client.getBatteryLevel());
            newClient.setBatteryStatus(client.getBatteryStatus());
            newClient.setCurrentTime(client.getCurrentTime());
            newClient.setDeviceType(client.getDeviceType());
            newClient.setErrorCode(client.getErrorCode());
            newClient.setFactoryReset(client.getFactoryReset());
            newClient.setFirmwareVersion(client.getFirmwareVersion());
            newClient.setHardwareVersion(client.getHardwareVersion());
            newClient.setManufacturer(client.getManufacturer());
            newClient.setMemoryFree(client.getMemoryFree());
            newClient.setMemoryTotal(client.getMemoryTotal());
            newClient.setModelNumber(client.getModelNumber());
            newClient.setPowerSourceCurrent(client.getPowerSourceCurrent());
            newClient.setPowerSourceVoltage(client.getPowerSourceVoltage());
            newClient.setReboot(client.getReboot());
            newClient.setResetErrorCode(client.getResetErrorCode());
            newClient.setSerialNumber(client.getSerialNumber());
            newClient.setSoftwareVersion(client.getSoftwareVersion());
            newClient.setSupportBindingAndModes(client.getSupportBindingAndModes());
            newClient.setTimezone(client.getTimezone());
            newClient.setUtcOffset(client.getUtcOffset());
            clientRepo.save(newClient);
        }
        else {
            clientRepo.save(client);
        }
        ModelAndView mav = new ModelAndView("redirect:/client/" + objectId);
        return mav;

    }


    @RequestMapping(value={"/profile/{id}"}, method = RequestMethod.DELETE)
    public ModelAndView deleteProfile(@PathVariable String objectId, final RedirectAttributes redirectAttributes) {
        //if(profileDao.findById(id) == null ) throw new NotFoundExcp(id);
        ModelAndView mav = new ModelAndView("redirect:/redirectafterdelete");
        clientRepo.delete(clientRepo.findByObjectId(objectId));
        return mav;
    }

    @RequestMapping(value="/redirectafterdelete")
    public View redirectDelete(final RedirectAttributes redirectAttributes) {
        RedirectView redirect = new RedirectView("/register");
        redirect.setExposeModelAttributes(false);
        return redirect;
    }

    @RequestMapping(value = {"/server"}, method = RequestMethod.GET)
    public String showServer(Model model){
        model.addAttribute("client", clientRepo.findAll());
        return "server";
    }

    @RequestMapping(value="/server", method = RequestMethod.POST)
    public ModelAndView createServer(final RedirectAttributes redirectAttributes) {
        ModelAndView mav = new ModelAndView("redirect:/server/create");
        return mav;
    }

    @RequestMapping(value="/server/create", method = RequestMethod.GET)
    public ModelAndView emptyServer() {
        Server server = new Server();
        ModelAndView mav = new ModelAndView("createserver");
        mav.addObject("server",server);
        return mav;
    }

    @RequestMapping(value="/server/create", method = RequestMethod.POST)
    public ModelAndView createServer(@ModelAttribute Server server, final RedirectAttributes redirectAttributes) {
        if(server.getObjectId() == null || server.getObjectId().equals("")) {
            ModelAndView mav = new ModelAndView("redirect:/server/create");
            return mav;
        }
        ModelAndView mav = new ModelAndView("redirect:/server");
        serverRepo.save(server);
        return mav;
    }

}
