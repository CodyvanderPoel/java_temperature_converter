public class Converter {
    Double magnitude;
    String unit;

    public Converter(Double magnitude, String unit) {
        this.magnitude = magnitude;
        this.unit = unit;
    }

    public Double toFahrenheit() {
        if (unit.equals("F")) {
            return magnitude;
        } else if (unit.equals("C")) {
            return magnitude * 9 / 5 + 32;
        } else if (unit.equals("K")) {
            return ((magnitude - 273.15) * 9 / 5 + 32);
        } else if (unit.equals("R")) {
            return magnitude + 459.67;
        } else if (unit.equals("N")) {
            return ((magnitude - 32) * 11 / 60);
        } else if (unit.equals("Re")) {
            return (magnitude - 32) * 4 / 9;
        } else {
            return null;
        }
    }

    public Double toCelsius() {
        if (unit.equals("F")) {
            return (magnitude - 32) * 5 / 9;
        } else if (unit.equals("C")) {
            return magnitude;
        } else if (unit.equals("K")) {
            return (magnitude - 273.15);
        } else if (unit.equals("R")) {
            return magnitude * 9 / 5 + 491.67;
        } else if (unit.equals("N")) {
            return magnitude * 33 / 100;
        } else if (unit.equals("Re")) {
            return (magnitude * 4 / 5);
        } else {
            return null;
        }
    }

    public Double toKelvin() {
        if (unit.equals("F")) {
            return ((magnitude - 32) * 5 / 9 + 273.15);
        } else if (unit.equals("C")) {
            return (magnitude + 273.15);
        } else if (unit.equals("K")) {
            return magnitude;
        } else if (unit.equals("R")) {
            return magnitude * 1.8;
        } else if (unit.equals("N")) {
            return ((magnitude - 273.15) * 33 / 100);
        } else if (unit.equals("Re")) {
            return (magnitude - 273.15) * 4 / 5;
        } else {
            return null;
        }
    }

    public Double toRankine() {
        if (unit.equals("F")) {
            return (magnitude - 459.67);
        } else if (unit.equals("C")) {
            return ((magnitude - 491.67) * 5 / 9);
        } else if (unit.equals("K")) {
            return (magnitude * 5 / 9);
        } else if (unit.equals("R")) {
            return magnitude;
        } else if (unit.equals("N")) {
            return ((magnitude - 491.67) * 11 / 60);
        } else if (unit.equals("Re")) {
            return (magnitude - 491.67) * 4 / 9;
        }

        else {
            return null;
        }
    }

    public Double toNewton() {
        if (unit.equals("F")) {
            return (magnitude * 60 / 11 + 32);
        } else if (unit.equals("C")) {
            return (magnitude * 100 / 33);
        } else if (unit.equals("K")) {
            return (magnitude * 100 / 33 + 273.15);
        } else if (unit.equals("R")) {
            return (magnitude * 60 / 11 + 491.67);
        } else if (unit.equals("N")) {
            return magnitude;
        } else if (unit.equals("Re")) {
            return magnitude * 80 / 33;
        }

        else {
            return null;
        }
    }

    public Double toRéaumur() {
        if (unit.equals("F")) {
            return (magnitude * 9 / 4 + 32);
        } else if (unit.equals("C")) {
            return (magnitude * 5 / 4);
        } else if (unit.equals("K")) {
            return magnitude * 5 / 4 + 273.15;
        } else if (unit.equals("R")) {
            return magnitude * 9 / 4 + 491.67;
        } else if (unit.equals("N")) {
            return magnitude * 33 / 80;
        } else if (unit.equals("Re")) {
            return magnitude;
        } else {
            return null;
        }
    }
}
