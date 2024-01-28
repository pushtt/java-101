public class GreatCircle {
    public static void main(String[] args) {
        double lat1 = Math.toRadians(Double.parseDouble(args[0]));
        double lon1 = Math.toRadians(Double.parseDouble(args[1]));
        double lat2 = Math.toRadians(Double.parseDouble(args[2]));
        double lon2 = Math.toRadians(Double.parseDouble(args[3]));
        double r = 6371.0;
        double distance;
        double deltaLat = lat1 - lat2;
        double deltaLon = lon1 - lon2;
        distance = 2 * r * Math.asin(
                Math.sqrt(
                        Math.sin(deltaLat / 2) * Math.sin(deltaLat / 2) +
                                Math.cos(lat1) * Math.cos(lat2) * Math.sin(deltaLon / 2) * Math.sin(deltaLon / 2)
                )
        );
        System.out.println(distance + " kilometers");
    }
}
