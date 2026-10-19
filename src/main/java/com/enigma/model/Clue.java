package com.enigma.model;

public class Clue {

        private int id;
        private String name;
        private String description;
        private Location location;

        public Clue(int id, String name, String description, Location location) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.location = location;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public Location getLocation() {
            return location;
        }
}
