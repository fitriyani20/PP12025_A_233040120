package Pertemuan11;

//LATIHAN 1
public class Vertex {

        private char label;
        private boolean wasVisited;

        // Constructor to initialize the vertex with a label
        public Vertex(char lab) {
            this.label = lab;
            this.wasVisited = false; // Initially, the vertex has not been visited
        }

        // Setter & Getter methods for label and wasVisited
        public char getLabel() {
            return label;
        }
        public void setLabel(char label) {
            this.label = label;
        }
        public boolean isWasVisited() {
            return wasVisited;
        }
        public void setWasVisited(boolean wasVisited) {
            this.wasVisited = wasVisited;
        }
    }
