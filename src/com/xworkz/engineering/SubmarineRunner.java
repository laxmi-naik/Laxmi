package com.xworkz.engineering;

public class SubmarineRunner {

	public static void main(String[] args) {
		Submarine submarines1 = new Submarine("drebbel 1", "fleet ballistic missile", 201, 8, 9);
        Submarine submarines2 = new Submarine("Arihant", "guided missile", 150, 9.5, 9.5);
        Submarine submarines3 = new Submarine("midgrt", "attack", 160,11.5, 8.5);

        
        submarines1.setgravity(180);
        submarines1.setcapacity(120);
        submarines1.setMaxDepth(500);
        submarines1.setDisplacement(8000);
        submarines1.setpressure(68);
        submarines1.setCountryOfOrigin("USA");
        submarines1.setNuclearPowered(true);
        submarines1.setSpeed(30.5);
        submarines1.setArmament("Torpedoes");
        submarines1.setStealthCapable(true);
        submarines1.setSonarType("Active/Passive");
        submarines1.setCommunicationSystem("Satellite");
        submarines1.setEndurance(90.0);
        submarines1.setHullMaterial("Steel");
        submarines1.setOperatingDepth("Deep");
        submarines1.setRadarType("Advanced");
        submarines1.setHasTorpedoSystem(true);
        submarines1.setNumberOfMissiles(12);
        submarines1.setHasMineLayingCapability(true);
        submarines1.setElectronicWarfareSystem("ECM");
        submarines1.setLengthOfService(30.0);
        submarines1.setHasRescueSystem(true);
        submarines1.setOnboardComputerSystem("Intel i9");
        submarines1.setHasAntiSubmarineWarfare(true);
        submarines1.setThermalSignature("Low");
        submarines1.setHasNuclearMissiles(true);
        submarines1.setNavigationSystem("GPS");
        submarines1.setSubmersible(true);
        submarines1.setBatteryLife(10.0);
        submarines1.setHasPeriscope(true);
        submarines1.setCombatSystem("Aegis");
        submarines1.setAutonomous(false);
        submarines1.setNumberOfEscapePods(4);
        submarines1.setPaintType("Anti-corrosive");
        submarines1.setRefitSchedule("Every 5 years");

        
        submarines2.setgravity(100);
        submarines2.setcapacity(90);
        submarines2.setMaxDepth(300);
        submarines2.setDisplacement(7000);
        submarines2.setpressure(120);
        submarines2.setCountryOfOrigin("India");
        submarines2.setNuclearPowered(false);
        submarines2.setSpeed(20.0);
        submarines2.setArmament("Missiles");
        submarines2.setStealthCapable(false);
        submarines2.setSonarType("Passive");
        submarines2.setCommunicationSystem("Radio");
        submarines2.setEndurance(60.0);
        submarines2.setHullMaterial("Titanium");
        submarines2.setOperatingDepth("Mid");
        submarines2.setRadarType("Basic");
        submarines2.setHasTorpedoSystem(false);
        submarines2.setNumberOfMissiles(16);
        submarines2.setHasMineLayingCapability(false);
        submarines2.setElectronicWarfareSystem("None");
        submarines2.setLengthOfService(25.0);
        submarines2.setHasRescueSystem(false);
        submarines2.setOnboardComputerSystem("AMD Ryzen");
        submarines2.setHasAntiSubmarineWarfare(false);
        submarines2.setThermalSignature("Medium");
        submarines2.setHasNuclearMissiles(false);
        submarines2.setNavigationSystem("INS");
        submarines2.setSubmersible(true);
        submarines2.setBatteryLife(8.0);
        submarines2.setHasPeriscope(false);
        submarines2.setCombatSystem("BrahMos");
        submarines2.setAutonomous(false);
        submarines2.setNumberOfEscapePods(2);
        submarines2.setPaintType("Standard");
        submarines2.setRefitSchedule("Every 7 years");

       
        submarines3.setgravity(120);
        submarines3.setcapacity(100);
        submarines3.setMaxDepth(450);
        submarines3.setDisplacement(7500);
        submarines3.setpressure(280);
        submarines3.setCountryOfOrigin("Russia");
        submarines3.setNuclearPowered(false);
        submarines3.setSpeed(25.0);
        submarines3.setArmament("Torpedoes");
        submarines3.setStealthCapable(true);
        submarines3.setSonarType("Advanced");
        submarines3.setCommunicationSystem("Encrypted Radio");
        submarines3.setEndurance(75.0);
        submarines3.setHullMaterial("Composite");
        submarines3.setOperatingDepth("Shallow");
        submarines3.setRadarType("Standard");
        submarines3.setHasTorpedoSystem(true);
        submarines3.setNumberOfMissiles(10);
        submarines3.setHasMineLayingCapability(true);
        submarines3.setElectronicWarfareSystem("Advanced");
        submarines3.setLengthOfService(35.0);
        submarines3.setHasRescueSystem(true);
        submarines3.setOnboardComputerSystem("ARM Cortex");
        submarines3.setHasAntiSubmarineWarfare(true);
        submarines3.setThermalSignature("High");
        submarines3.setHasNuclearMissiles(true);
        submarines3.setNavigationSystem("LIDAR");
        submarines3.setSubmersible(true);
        submarines3.setBatteryLife(12.0);
        submarines3.setHasPeriscope(true);
        submarines3.setCombatSystem("Kalibr");
        submarines3.setAutonomous(true);
        submarines3.setNumberOfEscapePods(3);
        submarines3.setPaintType("Reflective");
        submarines3.setRefitSchedule("Every 6 years");

        Submarine[] submarines = { submarines1, submarines2, submarines3 };

       
        for (Submarine submarine : submarines) {
            submarine.print();
        }
    

	}


	}


