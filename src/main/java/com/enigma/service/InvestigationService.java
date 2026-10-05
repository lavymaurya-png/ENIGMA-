package com.enigma.service;

import com.enigma.model.Clue;
import com.enigma.model.Detective;
import com.enigma.model.Evidence;
import com.enigma.model.Location;

import java.util.ArrayList;
import java.util.List;

    public class InvestigationService {

        private List<Clue> availableClues;

        public InvestigationService() {
            availableClues = new ArrayList<>();
        }

        // Add a clue to the investigation
        public void addClue(Clue clue) {
            availableClues.add(clue);
        }

        // Show all clues available at a particular location
        public List<Clue> getCluesAtLocation(Location location) {

            List<Clue> locationClues = new ArrayList<>();

            for (Clue clue : availableClues) {

                if (clue.getLocation().getName().equals(location.getName())) {
                    locationClues.add(clue);
                }
            }

            return locationClues;
        }

        // Collect evidence from a clue
        public Evidence collectEvidence(Clue clue) {

            Evidence evidence = new Evidence(
                    clue.getId(),
                    clue.getName(),
                    clue.getDescription(),
                    clue,
                    true
            );

            return evidence;
        }

        // Give evidence to the detective
        public void investigateClue(Detective detective, Clue clue) {

            Evidence evidence = collectEvidence(clue);

            detective.collectEvidence(evidence);
        }

        // Get all available clues
        public List<Clue> getAvailableClues() {
            return availableClues;
        }
    }
