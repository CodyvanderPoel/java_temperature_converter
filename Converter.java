public class Converter {
    Double magnitude;

    public Converter(Double magnitude, String unit) {
        this.magnitude = toCommonUnit(magnitude ,unit);
    }

    public Double toCommonUnit(Double magnitude,String unit) {
//        The common unit in this case is Fahrenheit
        switch (unit) {
            case "F":
                return magnitude;
            case "C":
                return magnitude * 9 / 5 + 32;
            case "K":
                return ((magnitude - 273.15) * 9 / 5 + 32);
            case "R":
                return magnitude + 459.67;
            case "N":
                return ((magnitude - 32) * 11 / 60);
            case "Re":
                return (magnitude - 32) * 4 / 9;
            default:
                return null;
        }
    }

    public Double toFahrenheit() {
        return magnitude;
    }

    public Double toCelsius() {
        return magnitude * 9 / 5 + 32;
    }

    public Double toKelvin() {
        return ((magnitude - 273.15) * 9 / 5 + 32);
    }

    public Double toRankine() {
        return magnitude + 459.67;
    }

    public Double toNewton() {
        return ((magnitude - 32) * 11 / 60);
    }

    public Double toReaumur() {
        return (magnitude - 32) * 4 / 9;
    }
}
