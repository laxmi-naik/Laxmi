package com.xworkz.engineering;

public class Submarine {
	
		 String name;
	     String type;
	     double length;
	     double width;
	     double height;
	     int gravity;
	     int capacity;
	     double maxDepth;
	     double displacement;
	     int pressure;
	     String countryOfOrigin;
	     boolean isNuclearPowered;
	     double speed;
	     String armament;
	     boolean isStealthCapable;
	     String sonarType;
	     String communicationSystem;
	     double endurance;
	     String hullMaterial;
	     String operatingDepth;
	     String radarType;
	     boolean hasTorpedoSystem;
	     int numberOfMissiles;
	     boolean hasMineLayingCapability;
	     String electronicWarfareSystem;
	     double lengthOfService;
	     boolean hasRescueSystem;
	     String onboardComputerSystem;
	     boolean hasAntiSubmarineWarfare;
	     String thermalSignature;
	     boolean hasNuclearMissiles;
	     String navigationSystem;
	     boolean isSubmersible;
	     double batteryLife;
	     boolean hasPeriscope;
	     String combatSystem;
	     boolean isAutonomous;
	     int numberOfEscapePods;
	     String paintType;
	     String refitSchedule;
	    public Submarine(String name, String type, double length, double width, double height) {
	        this.name = name;
	        this.type = type;
	        this.length = length;
	        this.width = width;
	        this.height = height;
	    }

	   
	    public void setgravity(int gravity) 
	    { 
	    	this. gravity =  gravity;
	    }
	    public void setcapacity(int capacity) 
	    { 
	    	this.capacity = capacity; 
	    }
	    public void setMaxDepth(double maxDepth) 
	    { 
	    	this.maxDepth = maxDepth;
	    }
	    public void setDisplacement(double displacement) 
	    { 
	    	this.displacement = displacement; 
	    }
	    public void setpressure(int pressure) 
	    { 
	    	this.pressure = pressure; 
	    }
	    public void setCountryOfOrigin(String countryOfOrigin)
	    { 
	    	this.countryOfOrigin = countryOfOrigin; 
	    }
	    public void setNuclearPowered(boolean isNuclearPowered) 
	    { 
	    	this.isNuclearPowered = isNuclearPowered; 
	    }
	    public void setSpeed(double speed) 
	    { 
	    	this.speed = speed; 
	    }
	    public void setArmament(String armament) 
	    { 
	    	this.armament = armament;
	    }
	    public void setStealthCapable(boolean isStealthCapable)
	    { 
	    	this.isStealthCapable = isStealthCapable; 
	    }
	    public void setSonarType(String sonarType) 
	    {
	    	this.sonarType = sonarType; 
	    }
	    public void setCommunicationSystem(String communicationSystem) 
	    { 
	    	this.communicationSystem = communicationSystem; 
	    }
	    public void setEndurance(double endurance) 
	    { 
	    	this.endurance = endurance; }
	    public void setHullMaterial(String hullMaterial)
	    { 
	    	this.hullMaterial = hullMaterial;
	    }
	    public void setOperatingDepth(String operatingDepth) 
	    { 
	    	this.operatingDepth = operatingDepth; 
	    }
	    public void setRadarType(String radarType) 
	    { 
	    	this.radarType = radarType; 
	    }
	    public void setHasTorpedoSystem(boolean hasTorpedoSystem) 
	    { 
	    	this.hasTorpedoSystem = hasTorpedoSystem; 
	    }
	    public void setNumberOfMissiles(int numberOfMissiles) 
	    {
	    	this.numberOfMissiles = numberOfMissiles; 
	    }
	    public void setHasMineLayingCapability(boolean hasMineLayingCapability) 
	    { 
	    	this.hasMineLayingCapability = hasMineLayingCapability; 
	    }
	    public void setElectronicWarfareSystem(String electronicWarfareSystem)
	    { 
	    	this.electronicWarfareSystem = electronicWarfareSystem; 
	    }
	    public void setLengthOfService(double lengthOfService)
	    {
	    	this.lengthOfService = lengthOfService;
	    }
	    public void setHasRescueSystem(boolean hasRescueSystem) 
	    { 
	    	this.hasRescueSystem = hasRescueSystem; 
	    }
	    public void setOnboardComputerSystem(String onboardComputerSystem) 
	    { 
	    	this.onboardComputerSystem = onboardComputerSystem;
	    }
	    
	    public void setHasAntiSubmarineWarfare(boolean hasAntiSubmarineWarfare)
	    { 
	    	this.hasAntiSubmarineWarfare = hasAntiSubmarineWarfare;
	    }
	    public void setThermalSignature(String thermalSignature)
	    { 
	    	this.thermalSignature = thermalSignature; 
	    }
	    public void setHasNuclearMissiles(boolean hasNuclearMissiles)
	    { 
	    	this.hasNuclearMissiles = hasNuclearMissiles; 
	    }
	    public void setNavigationSystem(String navigationSystem) 
	    { 
	    	this.navigationSystem = navigationSystem; 
	    }
	    public void setSubmersible(boolean isSubmersible) 
	    { 
	    	this.isSubmersible = isSubmersible; 
	    }
	    public void setBatteryLife(double batteryLife)
	    { 
	    	this.batteryLife = batteryLife; 
	    }
	    public void setHasPeriscope(boolean hasPeriscope)
	    { 
	    	this.hasPeriscope = hasPeriscope; 
	    }
	    public void setCombatSystem(String combatSystem)
	    { 
	    	this.combatSystem = combatSystem; 
	    }
	    public void setAutonomous(boolean isAutonomous) 
	    { 
	    	this.isAutonomous = isAutonomous; 
	    }
	    public void setNumberOfEscapePods(int numberOfEscapePods)
	    {
	    	this.numberOfEscapePods = numberOfEscapePods;
	    }
	    public void setPaintType(String paintType) 
	    { 
	    	this.paintType = paintType;
	    }
	    public void setRefitSchedule(String refitSchedule) 
	    {
	    	this.refitSchedule = refitSchedule;
	    }

	   
	    public void print() 
	    {
	        System.out.println("name " +this. name);
	        System.out.println("type:"+ this.type );
	        System.out.println("length:"+this.length);
	        System.out.println("width:"+this.width );
	        System.out.println("height:"+this.height );  
	        System.out.println( "gravity:"+this.gravity);
	        System.out.println("capacity:"+this.capacity );
	        System.out.println( "maxDepth:"+this.maxDepth);
	        System.out.println( "displacement:"+this.displacement);
	        System.out.println( "pressure:"+this.pressure ); 
	        System.out.println( "countryOfOrigin:"+this.countryOfOrigin);
	        System.out.println("isNuclearPowered:"+this.isNuclearPowered );
	        System.out.println("speed:"+this.speed );
	        System.out.println( "armament:"+this.armament);
	        System.out.println("isStealthCapable:"+this.isStealthCapable);
	        System.out.println("sonarType:"+this.sonarType);
	        System.out.println("communicationSystem:"+this.communicationSystem);
	        System.out.println( "endurance:"+this.endurance);
	        System.out.println("hullMaterial:"+this.hullMaterial);
	        System.out.println("operatingDepth:"+this.operatingDepth);
	        System.out.println(  "radarType:"+this.radarType);
	        System.out.println("hasTorpedoSystem:"+this.hasTorpedoSystem );
	        System.out.println("numberOfMissiles:"+this.numberOfMissiles);
	        System.out.println("hasMineLayingCapability:"+this.hasMineLayingCapability);
	        System.out.println( "electronicWarfareSystem:"+this.electronicWarfareSystem);
	        System.out.println("lengthOfService:"+this.lengthOfService);
	        System.out.println("hasRescueSystem:"+this.hasRescueSystem);
	        System.out.println("onboardComputerSystem:"+this.onboardComputerSystem );
	        System.out.println( "hasAntiSubmarineWarfare:"+this.hasAntiSubmarineWarfare);
	        System.out.println("thermalSignature:"+this.thermalSignature);
	        System.out.println( "hasNuclearMissiles:"+this.hasNuclearMissiles);
	        System.out.println( "navigationSystem:"+this.navigationSystem );
	        System.out.println("isSubmersible:"+this.isSubmersible);
	        System.out.println("batteryLife:"+this.batteryLife);
	        System.out.println("hasPeriscope:"+this.hasPeriscope );
	        System.out.println("combatSystem:"+this.combatSystem);
	        System.out.println("isAutonomous:"+this.isAutonomous);
	        System.out.println("numberOfEscapePods:"+this.numberOfEscapePods);
	        System.out.println("paintType:"+ this.paintType);
	        System.out.println("refitSchedule:"+this.refitSchedule);
	        
	    }

	}

