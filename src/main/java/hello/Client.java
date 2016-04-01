package hello;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by huimin on 3/30/16.
 */
public class Client {

    @Id
    private String id;

    private String objectId;
    private String objectName;

    private ResourceInfo manufacturer;
    private ResourceInfo deviceType;
    private ResourceInfo modelNumber;

    private ResourceInfo serialNumber;
    private ResourceInfo hardwareVersion;
    private ResourceInfo firmwareVersion;
    private ResourceInfo softwareVersion;
    private ResourceInfo reboot;
    private ResourceInfo factoryReset;
    private ResourceInfo availPowerSource;
    private ResourceInfo powerSourceVoltage;
    private ResourceInfo powerSourceCurrent;
    private ResourceInfo batteryLevel;
    private ResourceInfo batteryStatus;
    private ResourceInfo memoryFree;
    private ResourceInfo memoryTotal;
    private ResourceInfo errorCode;
    private ResourceInfo resetErrorCode;
    private ResourceInfo currentTime;
    private ResourceInfo utcOffset;
    private ResourceInfo timezone;
    private ResourceInfo supportBindingAndModes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = "3";
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = "Device";
    }


    public ResourceInfo getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(ResourceInfo manufacturer) {
        manufacturer.setResourceId("0");
        manufacturer.setResourceName("Manufacturer");
        this.manufacturer = manufacturer;
    }

    public ResourceInfo getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(ResourceInfo deviceType) {
        deviceType.setResourceId("17");
        deviceType.setResourceName("Device Type");
        this.deviceType = deviceType;
    }

    public ResourceInfo getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(ResourceInfo modelNumber) {
        modelNumber.setResourceId("1");
        modelNumber.setResourceName("Model Number");
        this.modelNumber = modelNumber;
    }

    public ResourceInfo getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(ResourceInfo serialNumber) {
        serialNumber.setResourceId("2");
        serialNumber.setResourceName("Serial Number");
        this.serialNumber = serialNumber;
    }

    public ResourceInfo getHardwareVersion() {
        return hardwareVersion;
    }

    public void setHardwareVersion(ResourceInfo hardwareVersion) {
        hardwareVersion.setResourceId("18");
        hardwareVersion.setResourceName("Hardware Version");
        this.hardwareVersion = hardwareVersion;
    }

    public ResourceInfo getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(ResourceInfo firmwareVersion) {
        firmwareVersion.setResourceId("3");
        firmwareVersion.setResourceName("Firmware Version");
        this.firmwareVersion = firmwareVersion;
    }

    public ResourceInfo getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(ResourceInfo softwareVersion) {
        softwareVersion.setResourceId("19");
        softwareVersion.setResourceName("Software Version");
        this.softwareVersion = softwareVersion;
    }

    public ResourceInfo getReboot() {
        return reboot;
    }

    public void setReboot(ResourceInfo reboot) {
        reboot.setResourceId("4");
        reboot.setResourceName("Reboot");
        this.reboot = reboot;
    }

    public ResourceInfo getFactoryReset() {
        return factoryReset;
    }

    public void setFactoryReset(ResourceInfo factoryReset) {
        factoryReset.setResourceId("5");
        factoryReset.setResourceName("Factory Reset");
        this.factoryReset = factoryReset;
    }

    public ResourceInfo getAvailPowerSource() {
        return availPowerSource;
    }

    public void setAvailPowerSource(ResourceInfo availPowerSource) {
        availPowerSource.setResourceId("6");
        availPowerSource.setResourceName("Available Power Source");
        this.availPowerSource = availPowerSource;
    }

    public ResourceInfo getPowerSourceVoltage() {
        return powerSourceVoltage;
    }

    public void setPowerSourceVoltage(ResourceInfo powerSourceVoltage) {
        powerSourceVoltage.setResourceId("7");
        powerSourceVoltage.setResourceName("Power Source Voltage");
        this.powerSourceVoltage = powerSourceVoltage;
    }

    public ResourceInfo getPowerSourceCurrent() {
        return powerSourceCurrent;
    }

    public void setPowerSourceCurrent(ResourceInfo powerSourceCurrent) {
        powerSourceCurrent.setResourceId("8");
        powerSourceCurrent.setResourceName("Power Source Current");
        this.powerSourceCurrent = powerSourceCurrent;
    }

    public ResourceInfo getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(ResourceInfo batteryLevel) {
        batteryLevel.setResourceId("9");
        batteryLevel.setResourceName("Battery Level");
        this.batteryLevel = batteryLevel;
    }

    public ResourceInfo getBatteryStatus() {
        return batteryStatus;
    }

    public void setBatteryStatus(ResourceInfo batteryStatus) {
        batteryStatus.setResourceId("20");
        batteryStatus.setResourceName("Battery Status");
        this.batteryStatus = batteryStatus;
    }

    public ResourceInfo getMemoryFree() {
        return memoryFree;
    }

    public void setMemoryFree(ResourceInfo memoryFree) {
        memoryFree.setResourceId("10");
        memoryFree.setResourceName("Memory Free");
        this.memoryFree = memoryFree;
    }

    public ResourceInfo getMemoryTotal() {
        return memoryTotal;
    }

    public void setMemoryTotal(ResourceInfo memoryTotal) {
        memoryTotal.setResourceId("21");
        memoryTotal.setResourceName("Memory Total");
        this.memoryTotal = memoryTotal;
    }

    public ResourceInfo getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ResourceInfo errorCode) {
        errorCode.setResourceId("11");
        errorCode.setResourceName("Error Code");
        this.errorCode = errorCode;
    }

    public ResourceInfo getResetErrorCode() {
        return resetErrorCode;
    }

    public void setResetErrorCode(ResourceInfo resetErrorCode) {
        resetErrorCode.setResourceId("12");
        resetErrorCode.setResourceName("Reset Error Code");
        this.resetErrorCode = resetErrorCode;
    }

    public ResourceInfo getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(ResourceInfo currentTime) {
        currentTime.setResourceId("13");
        currentTime.setResourceName("Current Time");
        this.currentTime = currentTime;
    }

    public ResourceInfo getUtcOffset() {
        return utcOffset;
    }

    public void setUtcOffset(ResourceInfo utcOffset) {
        utcOffset.setResourceId("14");
        utcOffset.setResourceName("UTC Offset");
        this.utcOffset = utcOffset;
    }

    public ResourceInfo getTimezone() {
        return timezone;
    }

    public void setTimezone(ResourceInfo timezone) {
        timezone.setResourceId("15");
        timezone.setResourceName("Timezone");
        this.timezone = timezone;
    }

    public ResourceInfo getSupportBindingAndModes() {
        return supportBindingAndModes;
    }

    public void setSupportBindingAndModes(ResourceInfo supportBindingAndModes) {
        supportBindingAndModes.setResourceId("16");
        supportBindingAndModes.setResourceName("Supported Binding and Modes");
        this.supportBindingAndModes = supportBindingAndModes;
    }







}
