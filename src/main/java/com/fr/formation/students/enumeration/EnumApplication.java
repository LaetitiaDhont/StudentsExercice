package com.fr.formation.students.enumeration;

public class EnumApplication {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // Evite la concaténation, c'est un buffer
        WeekDay[] days = WeekDay.values();
        for (WeekDay weekday : days) {
            String name = weekday.name(); // Retourne le nom de la constante au lieu de toString par exemple
            sb.append(name); // Rajoute le nom au StringBuilder
            sb.append("=");
            sb.append(weekday);// Ajoute à la fin de la chaine
            sb.append(System.lineSeparator());// Le séparateur de ligne sur l'OS en cours d'utilisation
            sb.append("Le nombre d'assiettes : ");
            sb.append(weekday.getNumberOfPlates());
            sb.append("Le prix du repas c'est : ");
            sb.append(weekday.getPlatePrice());
            sb.append(weekday.ordinal());
        }
        System.out.println(sb);

        System.out.println(WeekDay.MONDAY == WeekDay.MONDAY);



    }
}
