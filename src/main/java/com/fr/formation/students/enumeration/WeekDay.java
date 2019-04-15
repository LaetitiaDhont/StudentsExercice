package com.fr.formation.students.enumeration;

public enum WeekDay {
    MONDAY(true) {
        @Override
        public double getPlatePrice() {
            return 0;
        }
    }, // new implicite new boolean true or false
    TUESDAY(true){
        @Override
        public double getPlatePrice() {
            return 0;
        }

        @Override
        public int getNumberOfPlates() {
            return super.getNumberOfPlates();
        }
    },
    WEDNESDAY(true){
        @Override
        public double getPlatePrice() {
            return 0;
        }
    },
    THURSDAY(true){
        @Override
        public double getPlatePrice() {
            return 0;
        }
    },
    FRIDAY(true){
        @Override
        public double getPlatePrice() {
            return 0;
        }
    },
    SATURDAY(false){
        @Override
        public double getPlatePrice() {
            return 0;
        }
    },
    SUNDAY(false){
        @Override
        public double getPlatePrice() {
            return 0;
        }
    }; // Point virgule optionnel

    private boolean workingDay;

    private WeekDay(boolean workingDay) { // Constructeur privé car ce sont des constantes donc on ne veut pas que quelqu'un les modifient
        this.workingDay = workingDay;
    }

    public boolean isWorkingDay() {
        return workingDay;
    }

    public abstract double getPlatePrice();

    public  int getNumberOfPlates() {
        return 1;
    }
}
