package org.hl7.fhir.dstu21.model.valuesets;

import org.hl7.fhir.dstu21.exceptions.FHIRException;

public enum LocationPhysicalType {

        /**
         * Any Building or structure. This may contain rooms, corridors, wings, etc. It may not have walls, or a roof, but is considered a defined/allocated space.
         */
        BU, 
        /**
         * A Wing within a Building, this often contains levels, rooms and corridors.
         */
        WI, 
        /**
         * A Level in a multi-level Building/Structure.
         */
        LVL, 
        /**
         * Any corridor within a Building, that is not within.
         */
        CO, 
        /**
         * A space that is allocated as a room, it may have walls/roof etc., but does not require these.
         */
        RO, 
        /**
         * A space that is allocated for sleeping/laying on.
         */
        BD, 
        /**
         * A means of transportation.
         */
        VE, 
        /**
         * A residential dwelling. Usually used to reference a location that a person/patient may reside.
         */
        HO, 
        /**
         * A container that can store goods, equipment, medications or other items.
         */
        CA, 
        /**
         * A defined path to travel between 2 points that has a known name.
         */
        RD, 
        /**
         * A wide scope that covers a conceptual domain, such as a Nation (Country wide community or Federal Government - e.g. Ministry of Health),  Province or State (community or Government), Business (throughout the enterprise), Nation with a business scope of an agency (e.g. CDC, FDA etc.) or a Business segment (UK Pharmacy).
         */
        JDN, 
        /**
         * A defined boundary, such as a state, region, country, county
         */
        AREA, 
        /**
         * added to help the parsers
         */
        NULL;
        public static LocationPhysicalType fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("bu".equals(codeString))
          return BU;
        if ("wi".equals(codeString))
          return WI;
        if ("lvl".equals(codeString))
          return LVL;
        if ("co".equals(codeString))
          return CO;
        if ("ro".equals(codeString))
          return RO;
        if ("bd".equals(codeString))
          return BD;
        if ("ve".equals(codeString))
          return VE;
        if ("ho".equals(codeString))
          return HO;
        if ("ca".equals(codeString))
          return CA;
        if ("rd".equals(codeString))
          return RD;
        if ("jdn".equals(codeString))
          return JDN;
        if ("area".equals(codeString))
          return AREA;
        throw new FHIRException("Unknown LocationPhysicalType code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case BU: return "bu";
            case WI: return "wi";
            case LVL: return "lvl";
            case CO: return "co";
            case RO: return "ro";
            case BD: return "bd";
            case VE: return "ve";
            case HO: return "ho";
            case CA: return "ca";
            case RD: return "rd";
            case JDN: return "jdn";
            case AREA: return "area";
            default: return "?";
          }
        }
        public String getSystem() {
          return "http://hl7.org/fhir/location-physical-type";
        }
        public String getDefinition() {
          switch (this) {
            case BU: return "Any Building or structure. This may contain rooms, corridors, wings, etc. It may not have walls, or a roof, but is considered a defined/allocated space.";
            case WI: return "A Wing within a Building, this often contains levels, rooms and corridors.";
            case LVL: return "A Level in a multi-level Building/Structure.";
            case CO: return "Any corridor within a Building, that is not within.";
            case RO: return "A space that is allocated as a room, it may have walls/roof etc., but does not require these.";
            case BD: return "A space that is allocated for sleeping/laying on.";
            case VE: return "A means of transportation.";
            case HO: return "A residential dwelling. Usually used to reference a location that a person/patient may reside.";
            case CA: return "A container that can store goods, equipment, medications or other items.";
            case RD: return "A defined path to travel between 2 points that has a known name.";
            case JDN: return "A wide scope that covers a conceptual domain, such as a Nation (Country wide community or Federal Government - e.g. Ministry of Health),  Province or State (community or Government), Business (throughout the enterprise), Nation with a business scope of an agency (e.g. CDC, FDA etc.) or a Business segment (UK Pharmacy).";
            case AREA: return "A defined boundary, such as a state, region, country, county";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case BU: return "Building";
            case WI: return "Wing";
            case LVL: return "Level";
            case CO: return "Corridor";
            case RO: return "Room";
            case BD: return "Bed";
            case VE: return "Vehicle";
            case HO: return "House";
            case CA: return "Cabinet";
            case RD: return "Road";
            case JDN: return "Jurisdiction";
            case AREA: return "Area";
            default: return "?";
          }
    }


}
