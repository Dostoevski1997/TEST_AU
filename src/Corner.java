public class Corner {

    public static void main(String[] args) {
        int hours = 12;
        int minutes = 13;
        double corner = calculateCorner(hours, minutes);
        System.out.println("Угол между стрелками в " + hours +" часов" + " : " + minutes + " минут" + " = " + corner + " градусам");
    }

        public static double calculateCorner (int hours, int minutes) {

            if (hours < 0 || hours > 12 || minutes < 0 || minutes > 59) {
                throw new IllegalArgumentException("Некорректное время");
            }
            double hourPosition = (hours % 12 + minutes / 60.0) * 360 / 12;
            double minutePosition = minutes * 360 / 60;
            double corner = Math.abs(hourPosition - minutePosition);
            return Math.min(corner, 360 - corner);
        }

    }

