package io.zipcoder.polymorphism;


public abstract class Pet  {
        public abstract String speak();
        private String name;
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
