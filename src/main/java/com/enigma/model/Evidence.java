package com.enigma.model;

public class Evidence {

        private int id;
        private String name;
        private String description;
        private Clue clue;
        private boolean important;

        public Evidence(int id, String name, String description,
                        Clue clue, boolean important) {

            this.id = id;
            this.name = name;
            this.description = description;
            this.clue = clue;
            this.important = important;
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

        public Clue getClue() {
            return clue;
        }

        public boolean isImportant() {
            return important;
        }
}
