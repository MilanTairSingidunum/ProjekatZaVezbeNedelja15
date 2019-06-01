package rs.ac.singidunum.testiranje;

public class VelicinaDatoteke {
    final private long uBajtovima;

    private VelicinaDatoteke(long bajtova) {
        this.uBajtovima = bajtova;
    }

    public static VelicinaDatoteke uBajtovima(int velicina) {
        return new VelicinaDatoteke(velicina);
    }

    public static VelicinaDatoteke uKilobajtima(double velicina) {
        return new VelicinaDatoteke((long) (velicina * 1024L));
    }

    public static VelicinaDatoteke uMegabajtima(double velicina) {
        return new VelicinaDatoteke((long) (velicina * 1048576L));
    }

    public static VelicinaDatoteke uGigabajtima(double velicina) {
        return new VelicinaDatoteke((long) (velicina * 1073741824L));
    }

    public static VelicinaDatoteke uTerabajtima(double velicina) {
        return new VelicinaDatoteke((long) (velicina * 1099511627776L));
    }

    @Override
    public String toString() {
        if (uBajtovima < 1024L) {
            return uBajtovima + " B";
        }

        if (uBajtovima < 1048576L) {
            return String.format("%.2f KB", uBajtovima / 1024.);
        }

        if (uBajtovima < 1073741824L) {
            return String.format("%.2f MB", uBajtovima / 1048576.);
        }

        if (uBajtovima < 1099511627776L) {
            return String.format("%.2f GB", uBajtovima / 1073741824.);
        }

        return String.format("%.2f TB", uBajtovima / 1099511627776.);
    }
}
