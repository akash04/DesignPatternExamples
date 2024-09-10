class LightSystem {
    public void turnOnLights() {
        System.out.println("Lights turned on.");
    }
}

class AlarmSystem {
    public void activateAlarms() {
        System.out.println("Alarms activated.");
    }
}

class ThermostatSystem {
    public void setTemperature(int temp) {
        System.out.println("Temperature set to " + temp + " degrees.");
    }
}

class HomeAutomationFacade {
    private LightSystem lightSystem;
    private AlarmSystem alarmSystem;
    private ThermostatSystem thermostatSystem;

    public HomeAutomationFacade() {
        this.lightSystem = new LightSystem();
        this.alarmSystem = new AlarmSystem();
        this.thermostatSystem = new ThermostatSystem();
    }

    public void startHome() {
        lightSystem.turnOnLights();
        alarmSystem.activateAlarms();
        thermostatSystem.setTemperature(22);
    }
}
