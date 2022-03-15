package org.launchcode.liftOff.models;

import java.util.ArrayList;


public class InventoryData {

        public static ArrayList<Inventory> findByColumnAndValue(String column, String value, Iterable<Inventory> allInventories) {
            ArrayList<Inventory> results = new ArrayList<>();

            if (value.toLowerCase().equals("all")) {
                return (ArrayList<Inventory>) allInventories;
            }
            if (column.equals("all")) {
                results = findByValue(value, allInventories);
                return results;
            }
            for (Inventory inventory : allInventories) {
                String aValue = getFieldValue(inventory, column);
                if (aValue != null && aValue.toLowerCase().contains(value.toLowerCase())) {
                    results.add(inventory);
                }
            }
            return results;
        }

        public static String getFieldValue(Inventory inventory, String fieldName) {
            String theValue;
            if (fieldName.equals("name")) {
                theValue = inventory.getName();
            } else if (fieldName.equals("genre")) {
                theValue = inventory.getGenre().toString();
            } else {
                theValue = inventory.getStyles().toString();
            }
            return theValue;
        }
        public static ArrayList<Inventory> findByValue(String value, Iterable<Inventory> allInventories){
        String lower_val = value.toLowerCase();

        ArrayList<Inventory> results = new ArrayList<>();

            for(Inventory inventory : allInventories)

        {
            if (inventory.getName().toLowerCase().contains(lower_val)) {
                results.add(inventory);
            } else if (inventory.getGenre().toString().toLowerCase().contains(lower_val)) {
                results.add(inventory);
            } else if (inventory.getStyles().toString().toLowerCase().contains(lower_val)) {
                results.add(inventory);
            } else if (inventory.toString().toLowerCase().contains(lower_val)){
            results.add(inventory);
        }
        }
            return results;
    }
}


