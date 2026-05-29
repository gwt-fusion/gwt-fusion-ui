package org.gwtfusion.icons.phosphor;

import org.gwtfusion.ui.component.icon.Icon;
import org.gwtfusion.ui.component.icon.IconProvider;

public final class PhosphorIcons {
    public static final int THIN_COUNT = 1512;
    public static final int LIGHT_COUNT = 1512;
    public static final int REGULAR_COUNT = 1512;
    public static final int BOLD_COUNT = 1512;
    public static final int FILL_COUNT = 1512;
    public static final int DUOTONE_COUNT = 1512;
    public static final int COUNT = REGULAR_COUNT;

    private PhosphorIcons() {
    }

    public static IconProvider provider() {
        return provider(PhosphorWeight.REGULAR);
    }

    public static IconProvider provider(PhosphorWeight weight) {
        return new PhosphorIconProvider(weight);
    }

    public static String[] names() {
        return names(PhosphorWeight.REGULAR);
    }

    public static String[] names(PhosphorWeight weight) {
        switch (normalize(weight)) {
            case THIN:
                return thinNames();
            case LIGHT:
                return lightNames();
            case REGULAR:
                return regularNames();
            case BOLD:
                return boldNames();
            case FILL:
                return fillNames();
            case DUOTONE:
                return duotoneNames();
            default:
                return regularNames();
        }
    }

    public static Icon icon(String name) {
        return icon(name, PhosphorWeight.REGULAR);
    }

    public static Icon icon(String name, PhosphorWeight weight) {
        if (name == null || name.isEmpty()) {
            return null;
        }
        switch (normalize(weight)) {
            case THIN:
                return thinIcon(name);
            case LIGHT:
                return lightIcon(name);
            case REGULAR:
                return regularIcon(name);
            case BOLD:
                return boldIcon(name);
            case FILL:
                return fillIcon(name);
            case DUOTONE:
                return duotoneIcon(name);
            default:
                return regularIcon(name);
        }
    }

    static int count(PhosphorWeight weight) {
        switch (normalize(weight)) {
            case THIN:
                return THIN_COUNT;
            case LIGHT:
                return LIGHT_COUNT;
            case REGULAR:
                return REGULAR_COUNT;
            case BOLD:
                return BOLD_COUNT;
            case FILL:
                return FILL_COUNT;
            case DUOTONE:
                return DUOTONE_COUNT;
            default:
                return REGULAR_COUNT;
        }
    }

    static PhosphorWeight normalize(PhosphorWeight weight) {
        return weight == null ? PhosphorWeight.REGULAR : weight;
    }

    private static int copy(String[] source, String[] target, int offset) {
        for (int i = 0; i < source.length; i++) {
            target[offset + i] = source[i];
        }
        return offset + source.length;
    }

    private static String[] thinNames() {
        String[] names = new String[THIN_COUNT];
        int offset = 0;
        offset = copy(PhosphorIconsThinA.names(), names, offset);
        offset = copy(PhosphorIconsThinB.names(), names, offset);
        offset = copy(PhosphorIconsThinC1.names(), names, offset);
        offset = copy(PhosphorIconsThinC2.names(), names, offset);
        offset = copy(PhosphorIconsThinD.names(), names, offset);
        offset = copy(PhosphorIconsThinE.names(), names, offset);
        offset = copy(PhosphorIconsThinF.names(), names, offset);
        offset = copy(PhosphorIconsThinG.names(), names, offset);
        offset = copy(PhosphorIconsThinH.names(), names, offset);
        offset = copy(PhosphorIconsThinI.names(), names, offset);
        offset = copy(PhosphorIconsThinJ.names(), names, offset);
        offset = copy(PhosphorIconsThinK.names(), names, offset);
        offset = copy(PhosphorIconsThinL.names(), names, offset);
        offset = copy(PhosphorIconsThinM.names(), names, offset);
        offset = copy(PhosphorIconsThinN.names(), names, offset);
        offset = copy(PhosphorIconsThinO.names(), names, offset);
        offset = copy(PhosphorIconsThinP.names(), names, offset);
        offset = copy(PhosphorIconsThinQ.names(), names, offset);
        offset = copy(PhosphorIconsThinR.names(), names, offset);
        offset = copy(PhosphorIconsThinS1.names(), names, offset);
        offset = copy(PhosphorIconsThinS2.names(), names, offset);
        offset = copy(PhosphorIconsThinT.names(), names, offset);
        offset = copy(PhosphorIconsThinU.names(), names, offset);
        offset = copy(PhosphorIconsThinV.names(), names, offset);
        offset = copy(PhosphorIconsThinW.names(), names, offset);
        offset = copy(PhosphorIconsThinX.names(), names, offset);
        offset = copy(PhosphorIconsThinY.names(), names, offset);
        return names;
    }

    private static String[] lightNames() {
        String[] names = new String[LIGHT_COUNT];
        int offset = 0;
        offset = copy(PhosphorIconsLightA.names(), names, offset);
        offset = copy(PhosphorIconsLightB.names(), names, offset);
        offset = copy(PhosphorIconsLightC1.names(), names, offset);
        offset = copy(PhosphorIconsLightC2.names(), names, offset);
        offset = copy(PhosphorIconsLightD.names(), names, offset);
        offset = copy(PhosphorIconsLightE.names(), names, offset);
        offset = copy(PhosphorIconsLightF.names(), names, offset);
        offset = copy(PhosphorIconsLightG.names(), names, offset);
        offset = copy(PhosphorIconsLightH.names(), names, offset);
        offset = copy(PhosphorIconsLightI.names(), names, offset);
        offset = copy(PhosphorIconsLightJ.names(), names, offset);
        offset = copy(PhosphorIconsLightK.names(), names, offset);
        offset = copy(PhosphorIconsLightL.names(), names, offset);
        offset = copy(PhosphorIconsLightM.names(), names, offset);
        offset = copy(PhosphorIconsLightN.names(), names, offset);
        offset = copy(PhosphorIconsLightO.names(), names, offset);
        offset = copy(PhosphorIconsLightP.names(), names, offset);
        offset = copy(PhosphorIconsLightQ.names(), names, offset);
        offset = copy(PhosphorIconsLightR.names(), names, offset);
        offset = copy(PhosphorIconsLightS1.names(), names, offset);
        offset = copy(PhosphorIconsLightS2.names(), names, offset);
        offset = copy(PhosphorIconsLightT.names(), names, offset);
        offset = copy(PhosphorIconsLightU.names(), names, offset);
        offset = copy(PhosphorIconsLightV.names(), names, offset);
        offset = copy(PhosphorIconsLightW.names(), names, offset);
        offset = copy(PhosphorIconsLightX.names(), names, offset);
        offset = copy(PhosphorIconsLightY.names(), names, offset);
        return names;
    }

    private static String[] regularNames() {
        String[] names = new String[REGULAR_COUNT];
        int offset = 0;
        offset = copy(PhosphorIconsRegularA.names(), names, offset);
        offset = copy(PhosphorIconsRegularB.names(), names, offset);
        offset = copy(PhosphorIconsRegularC1.names(), names, offset);
        offset = copy(PhosphorIconsRegularC2.names(), names, offset);
        offset = copy(PhosphorIconsRegularD.names(), names, offset);
        offset = copy(PhosphorIconsRegularE.names(), names, offset);
        offset = copy(PhosphorIconsRegularF.names(), names, offset);
        offset = copy(PhosphorIconsRegularG.names(), names, offset);
        offset = copy(PhosphorIconsRegularH.names(), names, offset);
        offset = copy(PhosphorIconsRegularI.names(), names, offset);
        offset = copy(PhosphorIconsRegularJ.names(), names, offset);
        offset = copy(PhosphorIconsRegularK.names(), names, offset);
        offset = copy(PhosphorIconsRegularL.names(), names, offset);
        offset = copy(PhosphorIconsRegularM.names(), names, offset);
        offset = copy(PhosphorIconsRegularN.names(), names, offset);
        offset = copy(PhosphorIconsRegularO.names(), names, offset);
        offset = copy(PhosphorIconsRegularP.names(), names, offset);
        offset = copy(PhosphorIconsRegularQ.names(), names, offset);
        offset = copy(PhosphorIconsRegularR.names(), names, offset);
        offset = copy(PhosphorIconsRegularS1.names(), names, offset);
        offset = copy(PhosphorIconsRegularS2.names(), names, offset);
        offset = copy(PhosphorIconsRegularT.names(), names, offset);
        offset = copy(PhosphorIconsRegularU.names(), names, offset);
        offset = copy(PhosphorIconsRegularV.names(), names, offset);
        offset = copy(PhosphorIconsRegularW.names(), names, offset);
        offset = copy(PhosphorIconsRegularX.names(), names, offset);
        offset = copy(PhosphorIconsRegularY.names(), names, offset);
        return names;
    }

    private static String[] boldNames() {
        String[] names = new String[BOLD_COUNT];
        int offset = 0;
        offset = copy(PhosphorIconsBoldA.names(), names, offset);
        offset = copy(PhosphorIconsBoldB.names(), names, offset);
        offset = copy(PhosphorIconsBoldC1.names(), names, offset);
        offset = copy(PhosphorIconsBoldC2.names(), names, offset);
        offset = copy(PhosphorIconsBoldD.names(), names, offset);
        offset = copy(PhosphorIconsBoldE.names(), names, offset);
        offset = copy(PhosphorIconsBoldF.names(), names, offset);
        offset = copy(PhosphorIconsBoldG.names(), names, offset);
        offset = copy(PhosphorIconsBoldH.names(), names, offset);
        offset = copy(PhosphorIconsBoldI.names(), names, offset);
        offset = copy(PhosphorIconsBoldJ.names(), names, offset);
        offset = copy(PhosphorIconsBoldK.names(), names, offset);
        offset = copy(PhosphorIconsBoldL.names(), names, offset);
        offset = copy(PhosphorIconsBoldM.names(), names, offset);
        offset = copy(PhosphorIconsBoldN.names(), names, offset);
        offset = copy(PhosphorIconsBoldO.names(), names, offset);
        offset = copy(PhosphorIconsBoldP.names(), names, offset);
        offset = copy(PhosphorIconsBoldQ.names(), names, offset);
        offset = copy(PhosphorIconsBoldR.names(), names, offset);
        offset = copy(PhosphorIconsBoldS1.names(), names, offset);
        offset = copy(PhosphorIconsBoldS2.names(), names, offset);
        offset = copy(PhosphorIconsBoldT.names(), names, offset);
        offset = copy(PhosphorIconsBoldU.names(), names, offset);
        offset = copy(PhosphorIconsBoldV.names(), names, offset);
        offset = copy(PhosphorIconsBoldW.names(), names, offset);
        offset = copy(PhosphorIconsBoldX.names(), names, offset);
        offset = copy(PhosphorIconsBoldY.names(), names, offset);
        return names;
    }

    private static String[] fillNames() {
        String[] names = new String[FILL_COUNT];
        int offset = 0;
        offset = copy(PhosphorIconsFillA.names(), names, offset);
        offset = copy(PhosphorIconsFillB.names(), names, offset);
        offset = copy(PhosphorIconsFillC1.names(), names, offset);
        offset = copy(PhosphorIconsFillC2.names(), names, offset);
        offset = copy(PhosphorIconsFillD.names(), names, offset);
        offset = copy(PhosphorIconsFillE.names(), names, offset);
        offset = copy(PhosphorIconsFillF.names(), names, offset);
        offset = copy(PhosphorIconsFillG.names(), names, offset);
        offset = copy(PhosphorIconsFillH.names(), names, offset);
        offset = copy(PhosphorIconsFillI.names(), names, offset);
        offset = copy(PhosphorIconsFillJ.names(), names, offset);
        offset = copy(PhosphorIconsFillK.names(), names, offset);
        offset = copy(PhosphorIconsFillL.names(), names, offset);
        offset = copy(PhosphorIconsFillM.names(), names, offset);
        offset = copy(PhosphorIconsFillN.names(), names, offset);
        offset = copy(PhosphorIconsFillO.names(), names, offset);
        offset = copy(PhosphorIconsFillP.names(), names, offset);
        offset = copy(PhosphorIconsFillQ.names(), names, offset);
        offset = copy(PhosphorIconsFillR.names(), names, offset);
        offset = copy(PhosphorIconsFillS1.names(), names, offset);
        offset = copy(PhosphorIconsFillS2.names(), names, offset);
        offset = copy(PhosphorIconsFillT.names(), names, offset);
        offset = copy(PhosphorIconsFillU.names(), names, offset);
        offset = copy(PhosphorIconsFillV.names(), names, offset);
        offset = copy(PhosphorIconsFillW.names(), names, offset);
        offset = copy(PhosphorIconsFillX.names(), names, offset);
        offset = copy(PhosphorIconsFillY.names(), names, offset);
        return names;
    }

    private static String[] duotoneNames() {
        String[] names = new String[DUOTONE_COUNT];
        int offset = 0;
        offset = copy(PhosphorIconsDuotoneA.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneB.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneC1.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneC2.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneD.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneE.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneF.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneG.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneH.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneI.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneJ.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneK.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneL.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneM.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneN.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneO.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneP.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneQ.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneR.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneS1.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneS2.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneT.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneU.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneV.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneW.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneX.names(), names, offset);
        offset = copy(PhosphorIconsDuotoneY.names(), names, offset);
        return names;
    }

    private static Icon thinIcon(String name) {
        Icon icon;
        switch (name.charAt(0)) {
            case 'a':
                icon = PhosphorIconsThinA.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'b':
                icon = PhosphorIconsThinB.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'c':
                icon = PhosphorIconsThinC1.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = PhosphorIconsThinC2.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'd':
                icon = PhosphorIconsThinD.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'e':
                icon = PhosphorIconsThinE.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'f':
                icon = PhosphorIconsThinF.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'g':
                icon = PhosphorIconsThinG.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'h':
                icon = PhosphorIconsThinH.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'i':
                icon = PhosphorIconsThinI.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'j':
                icon = PhosphorIconsThinJ.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'k':
                icon = PhosphorIconsThinK.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'l':
                icon = PhosphorIconsThinL.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'm':
                icon = PhosphorIconsThinM.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'n':
                icon = PhosphorIconsThinN.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'o':
                icon = PhosphorIconsThinO.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'p':
                icon = PhosphorIconsThinP.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'q':
                icon = PhosphorIconsThinQ.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'r':
                icon = PhosphorIconsThinR.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 's':
                icon = PhosphorIconsThinS1.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = PhosphorIconsThinS2.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 't':
                icon = PhosphorIconsThinT.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'u':
                icon = PhosphorIconsThinU.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'v':
                icon = PhosphorIconsThinV.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'w':
                icon = PhosphorIconsThinW.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'x':
                icon = PhosphorIconsThinX.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'y':
                icon = PhosphorIconsThinY.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            default:
                return null;
        }
    }

    private static Icon lightIcon(String name) {
        Icon icon;
        switch (name.charAt(0)) {
            case 'a':
                icon = PhosphorIconsLightA.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'b':
                icon = PhosphorIconsLightB.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'c':
                icon = PhosphorIconsLightC1.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = PhosphorIconsLightC2.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'd':
                icon = PhosphorIconsLightD.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'e':
                icon = PhosphorIconsLightE.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'f':
                icon = PhosphorIconsLightF.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'g':
                icon = PhosphorIconsLightG.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'h':
                icon = PhosphorIconsLightH.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'i':
                icon = PhosphorIconsLightI.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'j':
                icon = PhosphorIconsLightJ.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'k':
                icon = PhosphorIconsLightK.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'l':
                icon = PhosphorIconsLightL.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'm':
                icon = PhosphorIconsLightM.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'n':
                icon = PhosphorIconsLightN.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'o':
                icon = PhosphorIconsLightO.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'p':
                icon = PhosphorIconsLightP.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'q':
                icon = PhosphorIconsLightQ.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'r':
                icon = PhosphorIconsLightR.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 's':
                icon = PhosphorIconsLightS1.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = PhosphorIconsLightS2.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 't':
                icon = PhosphorIconsLightT.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'u':
                icon = PhosphorIconsLightU.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'v':
                icon = PhosphorIconsLightV.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'w':
                icon = PhosphorIconsLightW.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'x':
                icon = PhosphorIconsLightX.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'y':
                icon = PhosphorIconsLightY.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            default:
                return null;
        }
    }

    private static Icon regularIcon(String name) {
        Icon icon;
        switch (name.charAt(0)) {
            case 'a':
                icon = PhosphorIconsRegularA.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'b':
                icon = PhosphorIconsRegularB.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'c':
                icon = PhosphorIconsRegularC1.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = PhosphorIconsRegularC2.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'd':
                icon = PhosphorIconsRegularD.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'e':
                icon = PhosphorIconsRegularE.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'f':
                icon = PhosphorIconsRegularF.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'g':
                icon = PhosphorIconsRegularG.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'h':
                icon = PhosphorIconsRegularH.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'i':
                icon = PhosphorIconsRegularI.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'j':
                icon = PhosphorIconsRegularJ.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'k':
                icon = PhosphorIconsRegularK.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'l':
                icon = PhosphorIconsRegularL.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'm':
                icon = PhosphorIconsRegularM.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'n':
                icon = PhosphorIconsRegularN.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'o':
                icon = PhosphorIconsRegularO.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'p':
                icon = PhosphorIconsRegularP.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'q':
                icon = PhosphorIconsRegularQ.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'r':
                icon = PhosphorIconsRegularR.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 's':
                icon = PhosphorIconsRegularS1.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = PhosphorIconsRegularS2.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 't':
                icon = PhosphorIconsRegularT.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'u':
                icon = PhosphorIconsRegularU.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'v':
                icon = PhosphorIconsRegularV.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'w':
                icon = PhosphorIconsRegularW.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'x':
                icon = PhosphorIconsRegularX.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'y':
                icon = PhosphorIconsRegularY.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            default:
                return null;
        }
    }

    private static Icon boldIcon(String name) {
        Icon icon;
        switch (name.charAt(0)) {
            case 'a':
                icon = PhosphorIconsBoldA.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'b':
                icon = PhosphorIconsBoldB.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'c':
                icon = PhosphorIconsBoldC1.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = PhosphorIconsBoldC2.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'd':
                icon = PhosphorIconsBoldD.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'e':
                icon = PhosphorIconsBoldE.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'f':
                icon = PhosphorIconsBoldF.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'g':
                icon = PhosphorIconsBoldG.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'h':
                icon = PhosphorIconsBoldH.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'i':
                icon = PhosphorIconsBoldI.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'j':
                icon = PhosphorIconsBoldJ.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'k':
                icon = PhosphorIconsBoldK.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'l':
                icon = PhosphorIconsBoldL.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'm':
                icon = PhosphorIconsBoldM.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'n':
                icon = PhosphorIconsBoldN.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'o':
                icon = PhosphorIconsBoldO.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'p':
                icon = PhosphorIconsBoldP.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'q':
                icon = PhosphorIconsBoldQ.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'r':
                icon = PhosphorIconsBoldR.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 's':
                icon = PhosphorIconsBoldS1.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = PhosphorIconsBoldS2.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 't':
                icon = PhosphorIconsBoldT.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'u':
                icon = PhosphorIconsBoldU.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'v':
                icon = PhosphorIconsBoldV.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'w':
                icon = PhosphorIconsBoldW.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'x':
                icon = PhosphorIconsBoldX.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'y':
                icon = PhosphorIconsBoldY.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            default:
                return null;
        }
    }

    private static Icon fillIcon(String name) {
        Icon icon;
        switch (name.charAt(0)) {
            case 'a':
                icon = PhosphorIconsFillA.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'b':
                icon = PhosphorIconsFillB.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'c':
                icon = PhosphorIconsFillC1.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = PhosphorIconsFillC2.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'd':
                icon = PhosphorIconsFillD.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'e':
                icon = PhosphorIconsFillE.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'f':
                icon = PhosphorIconsFillF.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'g':
                icon = PhosphorIconsFillG.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'h':
                icon = PhosphorIconsFillH.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'i':
                icon = PhosphorIconsFillI.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'j':
                icon = PhosphorIconsFillJ.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'k':
                icon = PhosphorIconsFillK.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'l':
                icon = PhosphorIconsFillL.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'm':
                icon = PhosphorIconsFillM.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'n':
                icon = PhosphorIconsFillN.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'o':
                icon = PhosphorIconsFillO.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'p':
                icon = PhosphorIconsFillP.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'q':
                icon = PhosphorIconsFillQ.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'r':
                icon = PhosphorIconsFillR.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 's':
                icon = PhosphorIconsFillS1.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = PhosphorIconsFillS2.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 't':
                icon = PhosphorIconsFillT.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'u':
                icon = PhosphorIconsFillU.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'v':
                icon = PhosphorIconsFillV.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'w':
                icon = PhosphorIconsFillW.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'x':
                icon = PhosphorIconsFillX.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'y':
                icon = PhosphorIconsFillY.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            default:
                return null;
        }
    }

    private static Icon duotoneIcon(String name) {
        Icon icon;
        switch (name.charAt(0)) {
            case 'a':
                icon = PhosphorIconsDuotoneA.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'b':
                icon = PhosphorIconsDuotoneB.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'c':
                icon = PhosphorIconsDuotoneC1.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = PhosphorIconsDuotoneC2.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'd':
                icon = PhosphorIconsDuotoneD.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'e':
                icon = PhosphorIconsDuotoneE.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'f':
                icon = PhosphorIconsDuotoneF.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'g':
                icon = PhosphorIconsDuotoneG.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'h':
                icon = PhosphorIconsDuotoneH.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'i':
                icon = PhosphorIconsDuotoneI.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'j':
                icon = PhosphorIconsDuotoneJ.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'k':
                icon = PhosphorIconsDuotoneK.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'l':
                icon = PhosphorIconsDuotoneL.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'm':
                icon = PhosphorIconsDuotoneM.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'n':
                icon = PhosphorIconsDuotoneN.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'o':
                icon = PhosphorIconsDuotoneO.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'p':
                icon = PhosphorIconsDuotoneP.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'q':
                icon = PhosphorIconsDuotoneQ.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'r':
                icon = PhosphorIconsDuotoneR.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 's':
                icon = PhosphorIconsDuotoneS1.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = PhosphorIconsDuotoneS2.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 't':
                icon = PhosphorIconsDuotoneT.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'u':
                icon = PhosphorIconsDuotoneU.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'v':
                icon = PhosphorIconsDuotoneV.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'w':
                icon = PhosphorIconsDuotoneW.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'x':
                icon = PhosphorIconsDuotoneX.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'y':
                icon = PhosphorIconsDuotoneY.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            default:
                return null;
        }
    }

    public static Icon acorn() {
        return acorn(PhosphorWeight.REGULAR);
    }

    public static Icon acorn(PhosphorWeight weight) {
        return icon("acorn", weight);
    }

    public static Icon addressBook() {
        return addressBook(PhosphorWeight.REGULAR);
    }

    public static Icon addressBook(PhosphorWeight weight) {
        return icon("address-book", weight);
    }

    public static Icon addressBookTabs() {
        return addressBookTabs(PhosphorWeight.REGULAR);
    }

    public static Icon addressBookTabs(PhosphorWeight weight) {
        return icon("address-book-tabs", weight);
    }

    public static Icon airTrafficControl() {
        return airTrafficControl(PhosphorWeight.REGULAR);
    }

    public static Icon airTrafficControl(PhosphorWeight weight) {
        return icon("air-traffic-control", weight);
    }

    public static Icon airplane() {
        return airplane(PhosphorWeight.REGULAR);
    }

    public static Icon airplane(PhosphorWeight weight) {
        return icon("airplane", weight);
    }

    public static Icon airplaneInFlight() {
        return airplaneInFlight(PhosphorWeight.REGULAR);
    }

    public static Icon airplaneInFlight(PhosphorWeight weight) {
        return icon("airplane-in-flight", weight);
    }

    public static Icon airplaneLanding() {
        return airplaneLanding(PhosphorWeight.REGULAR);
    }

    public static Icon airplaneLanding(PhosphorWeight weight) {
        return icon("airplane-landing", weight);
    }

    public static Icon airplaneTakeoff() {
        return airplaneTakeoff(PhosphorWeight.REGULAR);
    }

    public static Icon airplaneTakeoff(PhosphorWeight weight) {
        return icon("airplane-takeoff", weight);
    }

    public static Icon airplaneTaxiing() {
        return airplaneTaxiing(PhosphorWeight.REGULAR);
    }

    public static Icon airplaneTaxiing(PhosphorWeight weight) {
        return icon("airplane-taxiing", weight);
    }

    public static Icon airplaneTilt() {
        return airplaneTilt(PhosphorWeight.REGULAR);
    }

    public static Icon airplaneTilt(PhosphorWeight weight) {
        return icon("airplane-tilt", weight);
    }

    public static Icon airplay() {
        return airplay(PhosphorWeight.REGULAR);
    }

    public static Icon airplay(PhosphorWeight weight) {
        return icon("airplay", weight);
    }

    public static Icon alarm() {
        return alarm(PhosphorWeight.REGULAR);
    }

    public static Icon alarm(PhosphorWeight weight) {
        return icon("alarm", weight);
    }

    public static Icon alien() {
        return alien(PhosphorWeight.REGULAR);
    }

    public static Icon alien(PhosphorWeight weight) {
        return icon("alien", weight);
    }

    public static Icon alignBottom() {
        return alignBottom(PhosphorWeight.REGULAR);
    }

    public static Icon alignBottom(PhosphorWeight weight) {
        return icon("align-bottom", weight);
    }

    public static Icon alignBottomSimple() {
        return alignBottomSimple(PhosphorWeight.REGULAR);
    }

    public static Icon alignBottomSimple(PhosphorWeight weight) {
        return icon("align-bottom-simple", weight);
    }

    public static Icon alignCenterHorizontal() {
        return alignCenterHorizontal(PhosphorWeight.REGULAR);
    }

    public static Icon alignCenterHorizontal(PhosphorWeight weight) {
        return icon("align-center-horizontal", weight);
    }

    public static Icon alignCenterHorizontalSimple() {
        return alignCenterHorizontalSimple(PhosphorWeight.REGULAR);
    }

    public static Icon alignCenterHorizontalSimple(PhosphorWeight weight) {
        return icon("align-center-horizontal-simple", weight);
    }

    public static Icon alignCenterVertical() {
        return alignCenterVertical(PhosphorWeight.REGULAR);
    }

    public static Icon alignCenterVertical(PhosphorWeight weight) {
        return icon("align-center-vertical", weight);
    }

    public static Icon alignCenterVerticalSimple() {
        return alignCenterVerticalSimple(PhosphorWeight.REGULAR);
    }

    public static Icon alignCenterVerticalSimple(PhosphorWeight weight) {
        return icon("align-center-vertical-simple", weight);
    }

    public static Icon alignLeft() {
        return alignLeft(PhosphorWeight.REGULAR);
    }

    public static Icon alignLeft(PhosphorWeight weight) {
        return icon("align-left", weight);
    }

    public static Icon alignLeftSimple() {
        return alignLeftSimple(PhosphorWeight.REGULAR);
    }

    public static Icon alignLeftSimple(PhosphorWeight weight) {
        return icon("align-left-simple", weight);
    }

    public static Icon alignRight() {
        return alignRight(PhosphorWeight.REGULAR);
    }

    public static Icon alignRight(PhosphorWeight weight) {
        return icon("align-right", weight);
    }

    public static Icon alignRightSimple() {
        return alignRightSimple(PhosphorWeight.REGULAR);
    }

    public static Icon alignRightSimple(PhosphorWeight weight) {
        return icon("align-right-simple", weight);
    }

    public static Icon alignTop() {
        return alignTop(PhosphorWeight.REGULAR);
    }

    public static Icon alignTop(PhosphorWeight weight) {
        return icon("align-top", weight);
    }

    public static Icon alignTopSimple() {
        return alignTopSimple(PhosphorWeight.REGULAR);
    }

    public static Icon alignTopSimple(PhosphorWeight weight) {
        return icon("align-top-simple", weight);
    }

    public static Icon amazonLogo() {
        return amazonLogo(PhosphorWeight.REGULAR);
    }

    public static Icon amazonLogo(PhosphorWeight weight) {
        return icon("amazon-logo", weight);
    }

    public static Icon ambulance() {
        return ambulance(PhosphorWeight.REGULAR);
    }

    public static Icon ambulance(PhosphorWeight weight) {
        return icon("ambulance", weight);
    }

    public static Icon anchor() {
        return anchor(PhosphorWeight.REGULAR);
    }

    public static Icon anchor(PhosphorWeight weight) {
        return icon("anchor", weight);
    }

    public static Icon anchorSimple() {
        return anchorSimple(PhosphorWeight.REGULAR);
    }

    public static Icon anchorSimple(PhosphorWeight weight) {
        return icon("anchor-simple", weight);
    }

    public static Icon androidLogo() {
        return androidLogo(PhosphorWeight.REGULAR);
    }

    public static Icon androidLogo(PhosphorWeight weight) {
        return icon("android-logo", weight);
    }

    public static Icon angle() {
        return angle(PhosphorWeight.REGULAR);
    }

    public static Icon angle(PhosphorWeight weight) {
        return icon("angle", weight);
    }

    public static Icon angularLogo() {
        return angularLogo(PhosphorWeight.REGULAR);
    }

    public static Icon angularLogo(PhosphorWeight weight) {
        return icon("angular-logo", weight);
    }

    public static Icon aperture() {
        return aperture(PhosphorWeight.REGULAR);
    }

    public static Icon aperture(PhosphorWeight weight) {
        return icon("aperture", weight);
    }

    public static Icon appStoreLogo() {
        return appStoreLogo(PhosphorWeight.REGULAR);
    }

    public static Icon appStoreLogo(PhosphorWeight weight) {
        return icon("app-store-logo", weight);
    }

    public static Icon appWindow() {
        return appWindow(PhosphorWeight.REGULAR);
    }

    public static Icon appWindow(PhosphorWeight weight) {
        return icon("app-window", weight);
    }

    public static Icon appleLogo() {
        return appleLogo(PhosphorWeight.REGULAR);
    }

    public static Icon appleLogo(PhosphorWeight weight) {
        return icon("apple-logo", weight);
    }

    public static Icon applePodcastsLogo() {
        return applePodcastsLogo(PhosphorWeight.REGULAR);
    }

    public static Icon applePodcastsLogo(PhosphorWeight weight) {
        return icon("apple-podcasts-logo", weight);
    }

    public static Icon approximateEquals() {
        return approximateEquals(PhosphorWeight.REGULAR);
    }

    public static Icon approximateEquals(PhosphorWeight weight) {
        return icon("approximate-equals", weight);
    }

    public static Icon archive() {
        return archive(PhosphorWeight.REGULAR);
    }

    public static Icon archive(PhosphorWeight weight) {
        return icon("archive", weight);
    }

    public static Icon armchair() {
        return armchair(PhosphorWeight.REGULAR);
    }

    public static Icon armchair(PhosphorWeight weight) {
        return icon("armchair", weight);
    }

    public static Icon arrowArcLeft() {
        return arrowArcLeft(PhosphorWeight.REGULAR);
    }

    public static Icon arrowArcLeft(PhosphorWeight weight) {
        return icon("arrow-arc-left", weight);
    }

    public static Icon arrowArcRight() {
        return arrowArcRight(PhosphorWeight.REGULAR);
    }

    public static Icon arrowArcRight(PhosphorWeight weight) {
        return icon("arrow-arc-right", weight);
    }

    public static Icon arrowBendDoubleUpLeft() {
        return arrowBendDoubleUpLeft(PhosphorWeight.REGULAR);
    }

    public static Icon arrowBendDoubleUpLeft(PhosphorWeight weight) {
        return icon("arrow-bend-double-up-left", weight);
    }

    public static Icon arrowBendDoubleUpRight() {
        return arrowBendDoubleUpRight(PhosphorWeight.REGULAR);
    }

    public static Icon arrowBendDoubleUpRight(PhosphorWeight weight) {
        return icon("arrow-bend-double-up-right", weight);
    }

    public static Icon arrowBendDownLeft() {
        return arrowBendDownLeft(PhosphorWeight.REGULAR);
    }

    public static Icon arrowBendDownLeft(PhosphorWeight weight) {
        return icon("arrow-bend-down-left", weight);
    }

    public static Icon arrowBendDownRight() {
        return arrowBendDownRight(PhosphorWeight.REGULAR);
    }

    public static Icon arrowBendDownRight(PhosphorWeight weight) {
        return icon("arrow-bend-down-right", weight);
    }

    public static Icon arrowBendLeftDown() {
        return arrowBendLeftDown(PhosphorWeight.REGULAR);
    }

    public static Icon arrowBendLeftDown(PhosphorWeight weight) {
        return icon("arrow-bend-left-down", weight);
    }

    public static Icon arrowBendLeftUp() {
        return arrowBendLeftUp(PhosphorWeight.REGULAR);
    }

    public static Icon arrowBendLeftUp(PhosphorWeight weight) {
        return icon("arrow-bend-left-up", weight);
    }

    public static Icon arrowBendRightDown() {
        return arrowBendRightDown(PhosphorWeight.REGULAR);
    }

    public static Icon arrowBendRightDown(PhosphorWeight weight) {
        return icon("arrow-bend-right-down", weight);
    }

    public static Icon arrowBendRightUp() {
        return arrowBendRightUp(PhosphorWeight.REGULAR);
    }

    public static Icon arrowBendRightUp(PhosphorWeight weight) {
        return icon("arrow-bend-right-up", weight);
    }

    public static Icon arrowBendUpLeft() {
        return arrowBendUpLeft(PhosphorWeight.REGULAR);
    }

    public static Icon arrowBendUpLeft(PhosphorWeight weight) {
        return icon("arrow-bend-up-left", weight);
    }

    public static Icon arrowBendUpRight() {
        return arrowBendUpRight(PhosphorWeight.REGULAR);
    }

    public static Icon arrowBendUpRight(PhosphorWeight weight) {
        return icon("arrow-bend-up-right", weight);
    }

    public static Icon arrowCircleDown() {
        return arrowCircleDown(PhosphorWeight.REGULAR);
    }

    public static Icon arrowCircleDown(PhosphorWeight weight) {
        return icon("arrow-circle-down", weight);
    }

    public static Icon arrowCircleDownLeft() {
        return arrowCircleDownLeft(PhosphorWeight.REGULAR);
    }

    public static Icon arrowCircleDownLeft(PhosphorWeight weight) {
        return icon("arrow-circle-down-left", weight);
    }

    public static Icon arrowCircleDownRight() {
        return arrowCircleDownRight(PhosphorWeight.REGULAR);
    }

    public static Icon arrowCircleDownRight(PhosphorWeight weight) {
        return icon("arrow-circle-down-right", weight);
    }

    public static Icon arrowCircleLeft() {
        return arrowCircleLeft(PhosphorWeight.REGULAR);
    }

    public static Icon arrowCircleLeft(PhosphorWeight weight) {
        return icon("arrow-circle-left", weight);
    }

    public static Icon arrowCircleRight() {
        return arrowCircleRight(PhosphorWeight.REGULAR);
    }

    public static Icon arrowCircleRight(PhosphorWeight weight) {
        return icon("arrow-circle-right", weight);
    }

    public static Icon arrowCircleUp() {
        return arrowCircleUp(PhosphorWeight.REGULAR);
    }

    public static Icon arrowCircleUp(PhosphorWeight weight) {
        return icon("arrow-circle-up", weight);
    }

    public static Icon arrowCircleUpLeft() {
        return arrowCircleUpLeft(PhosphorWeight.REGULAR);
    }

    public static Icon arrowCircleUpLeft(PhosphorWeight weight) {
        return icon("arrow-circle-up-left", weight);
    }

    public static Icon arrowCircleUpRight() {
        return arrowCircleUpRight(PhosphorWeight.REGULAR);
    }

    public static Icon arrowCircleUpRight(PhosphorWeight weight) {
        return icon("arrow-circle-up-right", weight);
    }

    public static Icon arrowClockwise() {
        return arrowClockwise(PhosphorWeight.REGULAR);
    }

    public static Icon arrowClockwise(PhosphorWeight weight) {
        return icon("arrow-clockwise", weight);
    }

    public static Icon arrowCounterClockwise() {
        return arrowCounterClockwise(PhosphorWeight.REGULAR);
    }

    public static Icon arrowCounterClockwise(PhosphorWeight weight) {
        return icon("arrow-counter-clockwise", weight);
    }

    public static Icon arrowDown() {
        return arrowDown(PhosphorWeight.REGULAR);
    }

    public static Icon arrowDown(PhosphorWeight weight) {
        return icon("arrow-down", weight);
    }

    public static Icon arrowDownLeft() {
        return arrowDownLeft(PhosphorWeight.REGULAR);
    }

    public static Icon arrowDownLeft(PhosphorWeight weight) {
        return icon("arrow-down-left", weight);
    }

    public static Icon arrowDownRight() {
        return arrowDownRight(PhosphorWeight.REGULAR);
    }

    public static Icon arrowDownRight(PhosphorWeight weight) {
        return icon("arrow-down-right", weight);
    }

    public static Icon arrowElbowDownLeft() {
        return arrowElbowDownLeft(PhosphorWeight.REGULAR);
    }

    public static Icon arrowElbowDownLeft(PhosphorWeight weight) {
        return icon("arrow-elbow-down-left", weight);
    }

    public static Icon arrowElbowDownRight() {
        return arrowElbowDownRight(PhosphorWeight.REGULAR);
    }

    public static Icon arrowElbowDownRight(PhosphorWeight weight) {
        return icon("arrow-elbow-down-right", weight);
    }

    public static Icon arrowElbowLeft() {
        return arrowElbowLeft(PhosphorWeight.REGULAR);
    }

    public static Icon arrowElbowLeft(PhosphorWeight weight) {
        return icon("arrow-elbow-left", weight);
    }

    public static Icon arrowElbowLeftDown() {
        return arrowElbowLeftDown(PhosphorWeight.REGULAR);
    }

    public static Icon arrowElbowLeftDown(PhosphorWeight weight) {
        return icon("arrow-elbow-left-down", weight);
    }

    public static Icon arrowElbowLeftUp() {
        return arrowElbowLeftUp(PhosphorWeight.REGULAR);
    }

    public static Icon arrowElbowLeftUp(PhosphorWeight weight) {
        return icon("arrow-elbow-left-up", weight);
    }

    public static Icon arrowElbowRight() {
        return arrowElbowRight(PhosphorWeight.REGULAR);
    }

    public static Icon arrowElbowRight(PhosphorWeight weight) {
        return icon("arrow-elbow-right", weight);
    }

    public static Icon arrowElbowRightDown() {
        return arrowElbowRightDown(PhosphorWeight.REGULAR);
    }

    public static Icon arrowElbowRightDown(PhosphorWeight weight) {
        return icon("arrow-elbow-right-down", weight);
    }

    public static Icon arrowElbowRightUp() {
        return arrowElbowRightUp(PhosphorWeight.REGULAR);
    }

    public static Icon arrowElbowRightUp(PhosphorWeight weight) {
        return icon("arrow-elbow-right-up", weight);
    }

    public static Icon arrowElbowUpLeft() {
        return arrowElbowUpLeft(PhosphorWeight.REGULAR);
    }

    public static Icon arrowElbowUpLeft(PhosphorWeight weight) {
        return icon("arrow-elbow-up-left", weight);
    }

    public static Icon arrowElbowUpRight() {
        return arrowElbowUpRight(PhosphorWeight.REGULAR);
    }

    public static Icon arrowElbowUpRight(PhosphorWeight weight) {
        return icon("arrow-elbow-up-right", weight);
    }

    public static Icon arrowFatDown() {
        return arrowFatDown(PhosphorWeight.REGULAR);
    }

    public static Icon arrowFatDown(PhosphorWeight weight) {
        return icon("arrow-fat-down", weight);
    }

    public static Icon arrowFatLeft() {
        return arrowFatLeft(PhosphorWeight.REGULAR);
    }

    public static Icon arrowFatLeft(PhosphorWeight weight) {
        return icon("arrow-fat-left", weight);
    }

    public static Icon arrowFatLineDown() {
        return arrowFatLineDown(PhosphorWeight.REGULAR);
    }

    public static Icon arrowFatLineDown(PhosphorWeight weight) {
        return icon("arrow-fat-line-down", weight);
    }

    public static Icon arrowFatLineLeft() {
        return arrowFatLineLeft(PhosphorWeight.REGULAR);
    }

    public static Icon arrowFatLineLeft(PhosphorWeight weight) {
        return icon("arrow-fat-line-left", weight);
    }

    public static Icon arrowFatLineRight() {
        return arrowFatLineRight(PhosphorWeight.REGULAR);
    }

    public static Icon arrowFatLineRight(PhosphorWeight weight) {
        return icon("arrow-fat-line-right", weight);
    }

    public static Icon arrowFatLineUp() {
        return arrowFatLineUp(PhosphorWeight.REGULAR);
    }

    public static Icon arrowFatLineUp(PhosphorWeight weight) {
        return icon("arrow-fat-line-up", weight);
    }

    public static Icon arrowFatLinesDown() {
        return arrowFatLinesDown(PhosphorWeight.REGULAR);
    }

    public static Icon arrowFatLinesDown(PhosphorWeight weight) {
        return icon("arrow-fat-lines-down", weight);
    }

    public static Icon arrowFatLinesLeft() {
        return arrowFatLinesLeft(PhosphorWeight.REGULAR);
    }

    public static Icon arrowFatLinesLeft(PhosphorWeight weight) {
        return icon("arrow-fat-lines-left", weight);
    }

    public static Icon arrowFatLinesRight() {
        return arrowFatLinesRight(PhosphorWeight.REGULAR);
    }

    public static Icon arrowFatLinesRight(PhosphorWeight weight) {
        return icon("arrow-fat-lines-right", weight);
    }

    public static Icon arrowFatLinesUp() {
        return arrowFatLinesUp(PhosphorWeight.REGULAR);
    }

    public static Icon arrowFatLinesUp(PhosphorWeight weight) {
        return icon("arrow-fat-lines-up", weight);
    }

    public static Icon arrowFatRight() {
        return arrowFatRight(PhosphorWeight.REGULAR);
    }

    public static Icon arrowFatRight(PhosphorWeight weight) {
        return icon("arrow-fat-right", weight);
    }

    public static Icon arrowFatUp() {
        return arrowFatUp(PhosphorWeight.REGULAR);
    }

    public static Icon arrowFatUp(PhosphorWeight weight) {
        return icon("arrow-fat-up", weight);
    }

    public static Icon arrowLeft() {
        return arrowLeft(PhosphorWeight.REGULAR);
    }

    public static Icon arrowLeft(PhosphorWeight weight) {
        return icon("arrow-left", weight);
    }

    public static Icon arrowLineDown() {
        return arrowLineDown(PhosphorWeight.REGULAR);
    }

    public static Icon arrowLineDown(PhosphorWeight weight) {
        return icon("arrow-line-down", weight);
    }

    public static Icon arrowLineDownLeft() {
        return arrowLineDownLeft(PhosphorWeight.REGULAR);
    }

    public static Icon arrowLineDownLeft(PhosphorWeight weight) {
        return icon("arrow-line-down-left", weight);
    }

    public static Icon arrowLineDownRight() {
        return arrowLineDownRight(PhosphorWeight.REGULAR);
    }

    public static Icon arrowLineDownRight(PhosphorWeight weight) {
        return icon("arrow-line-down-right", weight);
    }

    public static Icon arrowLineLeft() {
        return arrowLineLeft(PhosphorWeight.REGULAR);
    }

    public static Icon arrowLineLeft(PhosphorWeight weight) {
        return icon("arrow-line-left", weight);
    }

    public static Icon arrowLineRight() {
        return arrowLineRight(PhosphorWeight.REGULAR);
    }

    public static Icon arrowLineRight(PhosphorWeight weight) {
        return icon("arrow-line-right", weight);
    }

    public static Icon arrowLineUp() {
        return arrowLineUp(PhosphorWeight.REGULAR);
    }

    public static Icon arrowLineUp(PhosphorWeight weight) {
        return icon("arrow-line-up", weight);
    }

    public static Icon arrowLineUpLeft() {
        return arrowLineUpLeft(PhosphorWeight.REGULAR);
    }

    public static Icon arrowLineUpLeft(PhosphorWeight weight) {
        return icon("arrow-line-up-left", weight);
    }

    public static Icon arrowLineUpRight() {
        return arrowLineUpRight(PhosphorWeight.REGULAR);
    }

    public static Icon arrowLineUpRight(PhosphorWeight weight) {
        return icon("arrow-line-up-right", weight);
    }

    public static Icon arrowRight() {
        return arrowRight(PhosphorWeight.REGULAR);
    }

    public static Icon arrowRight(PhosphorWeight weight) {
        return icon("arrow-right", weight);
    }

    public static Icon arrowSquareDown() {
        return arrowSquareDown(PhosphorWeight.REGULAR);
    }

    public static Icon arrowSquareDown(PhosphorWeight weight) {
        return icon("arrow-square-down", weight);
    }

    public static Icon arrowSquareDownLeft() {
        return arrowSquareDownLeft(PhosphorWeight.REGULAR);
    }

    public static Icon arrowSquareDownLeft(PhosphorWeight weight) {
        return icon("arrow-square-down-left", weight);
    }

    public static Icon arrowSquareDownRight() {
        return arrowSquareDownRight(PhosphorWeight.REGULAR);
    }

    public static Icon arrowSquareDownRight(PhosphorWeight weight) {
        return icon("arrow-square-down-right", weight);
    }

    public static Icon arrowSquareIn() {
        return arrowSquareIn(PhosphorWeight.REGULAR);
    }

    public static Icon arrowSquareIn(PhosphorWeight weight) {
        return icon("arrow-square-in", weight);
    }

    public static Icon arrowSquareLeft() {
        return arrowSquareLeft(PhosphorWeight.REGULAR);
    }

    public static Icon arrowSquareLeft(PhosphorWeight weight) {
        return icon("arrow-square-left", weight);
    }

    public static Icon arrowSquareOut() {
        return arrowSquareOut(PhosphorWeight.REGULAR);
    }

    public static Icon arrowSquareOut(PhosphorWeight weight) {
        return icon("arrow-square-out", weight);
    }

    public static Icon arrowSquareRight() {
        return arrowSquareRight(PhosphorWeight.REGULAR);
    }

    public static Icon arrowSquareRight(PhosphorWeight weight) {
        return icon("arrow-square-right", weight);
    }

    public static Icon arrowSquareUp() {
        return arrowSquareUp(PhosphorWeight.REGULAR);
    }

    public static Icon arrowSquareUp(PhosphorWeight weight) {
        return icon("arrow-square-up", weight);
    }

    public static Icon arrowSquareUpLeft() {
        return arrowSquareUpLeft(PhosphorWeight.REGULAR);
    }

    public static Icon arrowSquareUpLeft(PhosphorWeight weight) {
        return icon("arrow-square-up-left", weight);
    }

    public static Icon arrowSquareUpRight() {
        return arrowSquareUpRight(PhosphorWeight.REGULAR);
    }

    public static Icon arrowSquareUpRight(PhosphorWeight weight) {
        return icon("arrow-square-up-right", weight);
    }

    public static Icon arrowUDownLeft() {
        return arrowUDownLeft(PhosphorWeight.REGULAR);
    }

    public static Icon arrowUDownLeft(PhosphorWeight weight) {
        return icon("arrow-u-down-left", weight);
    }

    public static Icon arrowUDownRight() {
        return arrowUDownRight(PhosphorWeight.REGULAR);
    }

    public static Icon arrowUDownRight(PhosphorWeight weight) {
        return icon("arrow-u-down-right", weight);
    }

    public static Icon arrowULeftDown() {
        return arrowULeftDown(PhosphorWeight.REGULAR);
    }

    public static Icon arrowULeftDown(PhosphorWeight weight) {
        return icon("arrow-u-left-down", weight);
    }

    public static Icon arrowULeftUp() {
        return arrowULeftUp(PhosphorWeight.REGULAR);
    }

    public static Icon arrowULeftUp(PhosphorWeight weight) {
        return icon("arrow-u-left-up", weight);
    }

    public static Icon arrowURightDown() {
        return arrowURightDown(PhosphorWeight.REGULAR);
    }

    public static Icon arrowURightDown(PhosphorWeight weight) {
        return icon("arrow-u-right-down", weight);
    }

    public static Icon arrowURightUp() {
        return arrowURightUp(PhosphorWeight.REGULAR);
    }

    public static Icon arrowURightUp(PhosphorWeight weight) {
        return icon("arrow-u-right-up", weight);
    }

    public static Icon arrowUUpLeft() {
        return arrowUUpLeft(PhosphorWeight.REGULAR);
    }

    public static Icon arrowUUpLeft(PhosphorWeight weight) {
        return icon("arrow-u-up-left", weight);
    }

    public static Icon arrowUUpRight() {
        return arrowUUpRight(PhosphorWeight.REGULAR);
    }

    public static Icon arrowUUpRight(PhosphorWeight weight) {
        return icon("arrow-u-up-right", weight);
    }

    public static Icon arrowUp() {
        return arrowUp(PhosphorWeight.REGULAR);
    }

    public static Icon arrowUp(PhosphorWeight weight) {
        return icon("arrow-up", weight);
    }

    public static Icon arrowUpLeft() {
        return arrowUpLeft(PhosphorWeight.REGULAR);
    }

    public static Icon arrowUpLeft(PhosphorWeight weight) {
        return icon("arrow-up-left", weight);
    }

    public static Icon arrowUpRight() {
        return arrowUpRight(PhosphorWeight.REGULAR);
    }

    public static Icon arrowUpRight(PhosphorWeight weight) {
        return icon("arrow-up-right", weight);
    }

    public static Icon arrowsClockwise() {
        return arrowsClockwise(PhosphorWeight.REGULAR);
    }

    public static Icon arrowsClockwise(PhosphorWeight weight) {
        return icon("arrows-clockwise", weight);
    }

    public static Icon arrowsCounterClockwise() {
        return arrowsCounterClockwise(PhosphorWeight.REGULAR);
    }

    public static Icon arrowsCounterClockwise(PhosphorWeight weight) {
        return icon("arrows-counter-clockwise", weight);
    }

    public static Icon arrowsDownUp() {
        return arrowsDownUp(PhosphorWeight.REGULAR);
    }

    public static Icon arrowsDownUp(PhosphorWeight weight) {
        return icon("arrows-down-up", weight);
    }

    public static Icon arrowsHorizontal() {
        return arrowsHorizontal(PhosphorWeight.REGULAR);
    }

    public static Icon arrowsHorizontal(PhosphorWeight weight) {
        return icon("arrows-horizontal", weight);
    }

    public static Icon arrowsIn() {
        return arrowsIn(PhosphorWeight.REGULAR);
    }

    public static Icon arrowsIn(PhosphorWeight weight) {
        return icon("arrows-in", weight);
    }

    public static Icon arrowsInCardinal() {
        return arrowsInCardinal(PhosphorWeight.REGULAR);
    }

    public static Icon arrowsInCardinal(PhosphorWeight weight) {
        return icon("arrows-in-cardinal", weight);
    }

    public static Icon arrowsInLineHorizontal() {
        return arrowsInLineHorizontal(PhosphorWeight.REGULAR);
    }

    public static Icon arrowsInLineHorizontal(PhosphorWeight weight) {
        return icon("arrows-in-line-horizontal", weight);
    }

    public static Icon arrowsInLineVertical() {
        return arrowsInLineVertical(PhosphorWeight.REGULAR);
    }

    public static Icon arrowsInLineVertical(PhosphorWeight weight) {
        return icon("arrows-in-line-vertical", weight);
    }

    public static Icon arrowsInSimple() {
        return arrowsInSimple(PhosphorWeight.REGULAR);
    }

    public static Icon arrowsInSimple(PhosphorWeight weight) {
        return icon("arrows-in-simple", weight);
    }

    public static Icon arrowsLeftRight() {
        return arrowsLeftRight(PhosphorWeight.REGULAR);
    }

    public static Icon arrowsLeftRight(PhosphorWeight weight) {
        return icon("arrows-left-right", weight);
    }

    public static Icon arrowsMerge() {
        return arrowsMerge(PhosphorWeight.REGULAR);
    }

    public static Icon arrowsMerge(PhosphorWeight weight) {
        return icon("arrows-merge", weight);
    }

    public static Icon arrowsOut() {
        return arrowsOut(PhosphorWeight.REGULAR);
    }

    public static Icon arrowsOut(PhosphorWeight weight) {
        return icon("arrows-out", weight);
    }

    public static Icon arrowsOutCardinal() {
        return arrowsOutCardinal(PhosphorWeight.REGULAR);
    }

    public static Icon arrowsOutCardinal(PhosphorWeight weight) {
        return icon("arrows-out-cardinal", weight);
    }

    public static Icon arrowsOutLineHorizontal() {
        return arrowsOutLineHorizontal(PhosphorWeight.REGULAR);
    }

    public static Icon arrowsOutLineHorizontal(PhosphorWeight weight) {
        return icon("arrows-out-line-horizontal", weight);
    }

    public static Icon arrowsOutLineVertical() {
        return arrowsOutLineVertical(PhosphorWeight.REGULAR);
    }

    public static Icon arrowsOutLineVertical(PhosphorWeight weight) {
        return icon("arrows-out-line-vertical", weight);
    }

    public static Icon arrowsOutSimple() {
        return arrowsOutSimple(PhosphorWeight.REGULAR);
    }

    public static Icon arrowsOutSimple(PhosphorWeight weight) {
        return icon("arrows-out-simple", weight);
    }

    public static Icon arrowsSplit() {
        return arrowsSplit(PhosphorWeight.REGULAR);
    }

    public static Icon arrowsSplit(PhosphorWeight weight) {
        return icon("arrows-split", weight);
    }

    public static Icon arrowsVertical() {
        return arrowsVertical(PhosphorWeight.REGULAR);
    }

    public static Icon arrowsVertical(PhosphorWeight weight) {
        return icon("arrows-vertical", weight);
    }

    public static Icon article() {
        return article(PhosphorWeight.REGULAR);
    }

    public static Icon article(PhosphorWeight weight) {
        return icon("article", weight);
    }

    public static Icon articleMedium() {
        return articleMedium(PhosphorWeight.REGULAR);
    }

    public static Icon articleMedium(PhosphorWeight weight) {
        return icon("article-medium", weight);
    }

    public static Icon articleNyTimes() {
        return articleNyTimes(PhosphorWeight.REGULAR);
    }

    public static Icon articleNyTimes(PhosphorWeight weight) {
        return icon("article-ny-times", weight);
    }

    public static Icon asclepius() {
        return asclepius(PhosphorWeight.REGULAR);
    }

    public static Icon asclepius(PhosphorWeight weight) {
        return icon("asclepius", weight);
    }

    public static Icon asterisk() {
        return asterisk(PhosphorWeight.REGULAR);
    }

    public static Icon asterisk(PhosphorWeight weight) {
        return icon("asterisk", weight);
    }

    public static Icon asteriskSimple() {
        return asteriskSimple(PhosphorWeight.REGULAR);
    }

    public static Icon asteriskSimple(PhosphorWeight weight) {
        return icon("asterisk-simple", weight);
    }

    public static Icon at() {
        return at(PhosphorWeight.REGULAR);
    }

    public static Icon at(PhosphorWeight weight) {
        return icon("at", weight);
    }

    public static Icon atom() {
        return atom(PhosphorWeight.REGULAR);
    }

    public static Icon atom(PhosphorWeight weight) {
        return icon("atom", weight);
    }

    public static Icon avocado() {
        return avocado(PhosphorWeight.REGULAR);
    }

    public static Icon avocado(PhosphorWeight weight) {
        return icon("avocado", weight);
    }

    public static Icon axe() {
        return axe(PhosphorWeight.REGULAR);
    }

    public static Icon axe(PhosphorWeight weight) {
        return icon("axe", weight);
    }

    public static Icon baby() {
        return baby(PhosphorWeight.REGULAR);
    }

    public static Icon baby(PhosphorWeight weight) {
        return icon("baby", weight);
    }

    public static Icon babyCarriage() {
        return babyCarriage(PhosphorWeight.REGULAR);
    }

    public static Icon babyCarriage(PhosphorWeight weight) {
        return icon("baby-carriage", weight);
    }

    public static Icon backpack() {
        return backpack(PhosphorWeight.REGULAR);
    }

    public static Icon backpack(PhosphorWeight weight) {
        return icon("backpack", weight);
    }

    public static Icon backspace() {
        return backspace(PhosphorWeight.REGULAR);
    }

    public static Icon backspace(PhosphorWeight weight) {
        return icon("backspace", weight);
    }

    public static Icon bag() {
        return bag(PhosphorWeight.REGULAR);
    }

    public static Icon bag(PhosphorWeight weight) {
        return icon("bag", weight);
    }

    public static Icon bagSimple() {
        return bagSimple(PhosphorWeight.REGULAR);
    }

    public static Icon bagSimple(PhosphorWeight weight) {
        return icon("bag-simple", weight);
    }

    public static Icon balloon() {
        return balloon(PhosphorWeight.REGULAR);
    }

    public static Icon balloon(PhosphorWeight weight) {
        return icon("balloon", weight);
    }

    public static Icon bandaids() {
        return bandaids(PhosphorWeight.REGULAR);
    }

    public static Icon bandaids(PhosphorWeight weight) {
        return icon("bandaids", weight);
    }

    public static Icon bank() {
        return bank(PhosphorWeight.REGULAR);
    }

    public static Icon bank(PhosphorWeight weight) {
        return icon("bank", weight);
    }

    public static Icon barbell() {
        return barbell(PhosphorWeight.REGULAR);
    }

    public static Icon barbell(PhosphorWeight weight) {
        return icon("barbell", weight);
    }

    public static Icon barcode() {
        return barcode(PhosphorWeight.REGULAR);
    }

    public static Icon barcode(PhosphorWeight weight) {
        return icon("barcode", weight);
    }

    public static Icon barn() {
        return barn(PhosphorWeight.REGULAR);
    }

    public static Icon barn(PhosphorWeight weight) {
        return icon("barn", weight);
    }

    public static Icon barricade() {
        return barricade(PhosphorWeight.REGULAR);
    }

    public static Icon barricade(PhosphorWeight weight) {
        return icon("barricade", weight);
    }

    public static Icon baseball() {
        return baseball(PhosphorWeight.REGULAR);
    }

    public static Icon baseball(PhosphorWeight weight) {
        return icon("baseball", weight);
    }

    public static Icon baseballCap() {
        return baseballCap(PhosphorWeight.REGULAR);
    }

    public static Icon baseballCap(PhosphorWeight weight) {
        return icon("baseball-cap", weight);
    }

    public static Icon baseballHelmet() {
        return baseballHelmet(PhosphorWeight.REGULAR);
    }

    public static Icon baseballHelmet(PhosphorWeight weight) {
        return icon("baseball-helmet", weight);
    }

    public static Icon basket() {
        return basket(PhosphorWeight.REGULAR);
    }

    public static Icon basket(PhosphorWeight weight) {
        return icon("basket", weight);
    }

    public static Icon basketball() {
        return basketball(PhosphorWeight.REGULAR);
    }

    public static Icon basketball(PhosphorWeight weight) {
        return icon("basketball", weight);
    }

    public static Icon bathtub() {
        return bathtub(PhosphorWeight.REGULAR);
    }

    public static Icon bathtub(PhosphorWeight weight) {
        return icon("bathtub", weight);
    }

    public static Icon batteryCharging() {
        return batteryCharging(PhosphorWeight.REGULAR);
    }

    public static Icon batteryCharging(PhosphorWeight weight) {
        return icon("battery-charging", weight);
    }

    public static Icon batteryChargingVertical() {
        return batteryChargingVertical(PhosphorWeight.REGULAR);
    }

    public static Icon batteryChargingVertical(PhosphorWeight weight) {
        return icon("battery-charging-vertical", weight);
    }

    public static Icon batteryEmpty() {
        return batteryEmpty(PhosphorWeight.REGULAR);
    }

    public static Icon batteryEmpty(PhosphorWeight weight) {
        return icon("battery-empty", weight);
    }

    public static Icon batteryFull() {
        return batteryFull(PhosphorWeight.REGULAR);
    }

    public static Icon batteryFull(PhosphorWeight weight) {
        return icon("battery-full", weight);
    }

    public static Icon batteryHigh() {
        return batteryHigh(PhosphorWeight.REGULAR);
    }

    public static Icon batteryHigh(PhosphorWeight weight) {
        return icon("battery-high", weight);
    }

    public static Icon batteryLow() {
        return batteryLow(PhosphorWeight.REGULAR);
    }

    public static Icon batteryLow(PhosphorWeight weight) {
        return icon("battery-low", weight);
    }

    public static Icon batteryMedium() {
        return batteryMedium(PhosphorWeight.REGULAR);
    }

    public static Icon batteryMedium(PhosphorWeight weight) {
        return icon("battery-medium", weight);
    }

    public static Icon batteryPlus() {
        return batteryPlus(PhosphorWeight.REGULAR);
    }

    public static Icon batteryPlus(PhosphorWeight weight) {
        return icon("battery-plus", weight);
    }

    public static Icon batteryPlusVertical() {
        return batteryPlusVertical(PhosphorWeight.REGULAR);
    }

    public static Icon batteryPlusVertical(PhosphorWeight weight) {
        return icon("battery-plus-vertical", weight);
    }

    public static Icon batteryVerticalEmpty() {
        return batteryVerticalEmpty(PhosphorWeight.REGULAR);
    }

    public static Icon batteryVerticalEmpty(PhosphorWeight weight) {
        return icon("battery-vertical-empty", weight);
    }

    public static Icon batteryVerticalFull() {
        return batteryVerticalFull(PhosphorWeight.REGULAR);
    }

    public static Icon batteryVerticalFull(PhosphorWeight weight) {
        return icon("battery-vertical-full", weight);
    }

    public static Icon batteryVerticalHigh() {
        return batteryVerticalHigh(PhosphorWeight.REGULAR);
    }

    public static Icon batteryVerticalHigh(PhosphorWeight weight) {
        return icon("battery-vertical-high", weight);
    }

    public static Icon batteryVerticalLow() {
        return batteryVerticalLow(PhosphorWeight.REGULAR);
    }

    public static Icon batteryVerticalLow(PhosphorWeight weight) {
        return icon("battery-vertical-low", weight);
    }

    public static Icon batteryVerticalMedium() {
        return batteryVerticalMedium(PhosphorWeight.REGULAR);
    }

    public static Icon batteryVerticalMedium(PhosphorWeight weight) {
        return icon("battery-vertical-medium", weight);
    }

    public static Icon batteryWarning() {
        return batteryWarning(PhosphorWeight.REGULAR);
    }

    public static Icon batteryWarning(PhosphorWeight weight) {
        return icon("battery-warning", weight);
    }

    public static Icon batteryWarningVertical() {
        return batteryWarningVertical(PhosphorWeight.REGULAR);
    }

    public static Icon batteryWarningVertical(PhosphorWeight weight) {
        return icon("battery-warning-vertical", weight);
    }

    public static Icon beachBall() {
        return beachBall(PhosphorWeight.REGULAR);
    }

    public static Icon beachBall(PhosphorWeight weight) {
        return icon("beach-ball", weight);
    }

    public static Icon beanie() {
        return beanie(PhosphorWeight.REGULAR);
    }

    public static Icon beanie(PhosphorWeight weight) {
        return icon("beanie", weight);
    }

    public static Icon bed() {
        return bed(PhosphorWeight.REGULAR);
    }

    public static Icon bed(PhosphorWeight weight) {
        return icon("bed", weight);
    }

    public static Icon beerBottle() {
        return beerBottle(PhosphorWeight.REGULAR);
    }

    public static Icon beerBottle(PhosphorWeight weight) {
        return icon("beer-bottle", weight);
    }

    public static Icon beerStein() {
        return beerStein(PhosphorWeight.REGULAR);
    }

    public static Icon beerStein(PhosphorWeight weight) {
        return icon("beer-stein", weight);
    }

    public static Icon behanceLogo() {
        return behanceLogo(PhosphorWeight.REGULAR);
    }

    public static Icon behanceLogo(PhosphorWeight weight) {
        return icon("behance-logo", weight);
    }

    public static Icon bell() {
        return bell(PhosphorWeight.REGULAR);
    }

    public static Icon bell(PhosphorWeight weight) {
        return icon("bell", weight);
    }

    public static Icon bellRinging() {
        return bellRinging(PhosphorWeight.REGULAR);
    }

    public static Icon bellRinging(PhosphorWeight weight) {
        return icon("bell-ringing", weight);
    }

    public static Icon bellSimple() {
        return bellSimple(PhosphorWeight.REGULAR);
    }

    public static Icon bellSimple(PhosphorWeight weight) {
        return icon("bell-simple", weight);
    }

    public static Icon bellSimpleRinging() {
        return bellSimpleRinging(PhosphorWeight.REGULAR);
    }

    public static Icon bellSimpleRinging(PhosphorWeight weight) {
        return icon("bell-simple-ringing", weight);
    }

    public static Icon bellSimpleSlash() {
        return bellSimpleSlash(PhosphorWeight.REGULAR);
    }

    public static Icon bellSimpleSlash(PhosphorWeight weight) {
        return icon("bell-simple-slash", weight);
    }

    public static Icon bellSimpleZ() {
        return bellSimpleZ(PhosphorWeight.REGULAR);
    }

    public static Icon bellSimpleZ(PhosphorWeight weight) {
        return icon("bell-simple-z", weight);
    }

    public static Icon bellSlash() {
        return bellSlash(PhosphorWeight.REGULAR);
    }

    public static Icon bellSlash(PhosphorWeight weight) {
        return icon("bell-slash", weight);
    }

    public static Icon bellZ() {
        return bellZ(PhosphorWeight.REGULAR);
    }

    public static Icon bellZ(PhosphorWeight weight) {
        return icon("bell-z", weight);
    }

    public static Icon belt() {
        return belt(PhosphorWeight.REGULAR);
    }

    public static Icon belt(PhosphorWeight weight) {
        return icon("belt", weight);
    }

    public static Icon bezierCurve() {
        return bezierCurve(PhosphorWeight.REGULAR);
    }

    public static Icon bezierCurve(PhosphorWeight weight) {
        return icon("bezier-curve", weight);
    }

    public static Icon bicycle() {
        return bicycle(PhosphorWeight.REGULAR);
    }

    public static Icon bicycle(PhosphorWeight weight) {
        return icon("bicycle", weight);
    }

    public static Icon binary() {
        return binary(PhosphorWeight.REGULAR);
    }

    public static Icon binary(PhosphorWeight weight) {
        return icon("binary", weight);
    }

    public static Icon binoculars() {
        return binoculars(PhosphorWeight.REGULAR);
    }

    public static Icon binoculars(PhosphorWeight weight) {
        return icon("binoculars", weight);
    }

    public static Icon biohazard() {
        return biohazard(PhosphorWeight.REGULAR);
    }

    public static Icon biohazard(PhosphorWeight weight) {
        return icon("biohazard", weight);
    }

    public static Icon bird() {
        return bird(PhosphorWeight.REGULAR);
    }

    public static Icon bird(PhosphorWeight weight) {
        return icon("bird", weight);
    }

    public static Icon blueprint() {
        return blueprint(PhosphorWeight.REGULAR);
    }

    public static Icon blueprint(PhosphorWeight weight) {
        return icon("blueprint", weight);
    }

    public static Icon bluetooth() {
        return bluetooth(PhosphorWeight.REGULAR);
    }

    public static Icon bluetooth(PhosphorWeight weight) {
        return icon("bluetooth", weight);
    }

    public static Icon bluetoothConnected() {
        return bluetoothConnected(PhosphorWeight.REGULAR);
    }

    public static Icon bluetoothConnected(PhosphorWeight weight) {
        return icon("bluetooth-connected", weight);
    }

    public static Icon bluetoothSlash() {
        return bluetoothSlash(PhosphorWeight.REGULAR);
    }

    public static Icon bluetoothSlash(PhosphorWeight weight) {
        return icon("bluetooth-slash", weight);
    }

    public static Icon bluetoothX() {
        return bluetoothX(PhosphorWeight.REGULAR);
    }

    public static Icon bluetoothX(PhosphorWeight weight) {
        return icon("bluetooth-x", weight);
    }

    public static Icon boat() {
        return boat(PhosphorWeight.REGULAR);
    }

    public static Icon boat(PhosphorWeight weight) {
        return icon("boat", weight);
    }

    public static Icon bomb() {
        return bomb(PhosphorWeight.REGULAR);
    }

    public static Icon bomb(PhosphorWeight weight) {
        return icon("bomb", weight);
    }

    public static Icon bone() {
        return bone(PhosphorWeight.REGULAR);
    }

    public static Icon bone(PhosphorWeight weight) {
        return icon("bone", weight);
    }

    public static Icon book() {
        return book(PhosphorWeight.REGULAR);
    }

    public static Icon book(PhosphorWeight weight) {
        return icon("book", weight);
    }

    public static Icon bookBookmark() {
        return bookBookmark(PhosphorWeight.REGULAR);
    }

    public static Icon bookBookmark(PhosphorWeight weight) {
        return icon("book-bookmark", weight);
    }

    public static Icon bookOpen() {
        return bookOpen(PhosphorWeight.REGULAR);
    }

    public static Icon bookOpen(PhosphorWeight weight) {
        return icon("book-open", weight);
    }

    public static Icon bookOpenText() {
        return bookOpenText(PhosphorWeight.REGULAR);
    }

    public static Icon bookOpenText(PhosphorWeight weight) {
        return icon("book-open-text", weight);
    }

    public static Icon bookOpenUser() {
        return bookOpenUser(PhosphorWeight.REGULAR);
    }

    public static Icon bookOpenUser(PhosphorWeight weight) {
        return icon("book-open-user", weight);
    }

    public static Icon bookmark() {
        return bookmark(PhosphorWeight.REGULAR);
    }

    public static Icon bookmark(PhosphorWeight weight) {
        return icon("bookmark", weight);
    }

    public static Icon bookmarkSimple() {
        return bookmarkSimple(PhosphorWeight.REGULAR);
    }

    public static Icon bookmarkSimple(PhosphorWeight weight) {
        return icon("bookmark-simple", weight);
    }

    public static Icon bookmarks() {
        return bookmarks(PhosphorWeight.REGULAR);
    }

    public static Icon bookmarks(PhosphorWeight weight) {
        return icon("bookmarks", weight);
    }

    public static Icon bookmarksSimple() {
        return bookmarksSimple(PhosphorWeight.REGULAR);
    }

    public static Icon bookmarksSimple(PhosphorWeight weight) {
        return icon("bookmarks-simple", weight);
    }

    public static Icon books() {
        return books(PhosphorWeight.REGULAR);
    }

    public static Icon books(PhosphorWeight weight) {
        return icon("books", weight);
    }

    public static Icon boot() {
        return boot(PhosphorWeight.REGULAR);
    }

    public static Icon boot(PhosphorWeight weight) {
        return icon("boot", weight);
    }

    public static Icon boules() {
        return boules(PhosphorWeight.REGULAR);
    }

    public static Icon boules(PhosphorWeight weight) {
        return icon("boules", weight);
    }

    public static Icon boundingBox() {
        return boundingBox(PhosphorWeight.REGULAR);
    }

    public static Icon boundingBox(PhosphorWeight weight) {
        return icon("bounding-box", weight);
    }

    public static Icon bowlFood() {
        return bowlFood(PhosphorWeight.REGULAR);
    }

    public static Icon bowlFood(PhosphorWeight weight) {
        return icon("bowl-food", weight);
    }

    public static Icon bowlSteam() {
        return bowlSteam(PhosphorWeight.REGULAR);
    }

    public static Icon bowlSteam(PhosphorWeight weight) {
        return icon("bowl-steam", weight);
    }

    public static Icon bowlingBall() {
        return bowlingBall(PhosphorWeight.REGULAR);
    }

    public static Icon bowlingBall(PhosphorWeight weight) {
        return icon("bowling-ball", weight);
    }

    public static Icon boxArrowDown() {
        return boxArrowDown(PhosphorWeight.REGULAR);
    }

    public static Icon boxArrowDown(PhosphorWeight weight) {
        return icon("box-arrow-down", weight);
    }

    public static Icon boxArrowUp() {
        return boxArrowUp(PhosphorWeight.REGULAR);
    }

    public static Icon boxArrowUp(PhosphorWeight weight) {
        return icon("box-arrow-up", weight);
    }

    public static Icon boxingGlove() {
        return boxingGlove(PhosphorWeight.REGULAR);
    }

    public static Icon boxingGlove(PhosphorWeight weight) {
        return icon("boxing-glove", weight);
    }

    public static Icon bracketsAngle() {
        return bracketsAngle(PhosphorWeight.REGULAR);
    }

    public static Icon bracketsAngle(PhosphorWeight weight) {
        return icon("brackets-angle", weight);
    }

    public static Icon bracketsCurly() {
        return bracketsCurly(PhosphorWeight.REGULAR);
    }

    public static Icon bracketsCurly(PhosphorWeight weight) {
        return icon("brackets-curly", weight);
    }

    public static Icon bracketsRound() {
        return bracketsRound(PhosphorWeight.REGULAR);
    }

    public static Icon bracketsRound(PhosphorWeight weight) {
        return icon("brackets-round", weight);
    }

    public static Icon bracketsSquare() {
        return bracketsSquare(PhosphorWeight.REGULAR);
    }

    public static Icon bracketsSquare(PhosphorWeight weight) {
        return icon("brackets-square", weight);
    }

    public static Icon brain() {
        return brain(PhosphorWeight.REGULAR);
    }

    public static Icon brain(PhosphorWeight weight) {
        return icon("brain", weight);
    }

    public static Icon brandy() {
        return brandy(PhosphorWeight.REGULAR);
    }

    public static Icon brandy(PhosphorWeight weight) {
        return icon("brandy", weight);
    }

    public static Icon bread() {
        return bread(PhosphorWeight.REGULAR);
    }

    public static Icon bread(PhosphorWeight weight) {
        return icon("bread", weight);
    }

    public static Icon bridge() {
        return bridge(PhosphorWeight.REGULAR);
    }

    public static Icon bridge(PhosphorWeight weight) {
        return icon("bridge", weight);
    }

    public static Icon briefcase() {
        return briefcase(PhosphorWeight.REGULAR);
    }

    public static Icon briefcase(PhosphorWeight weight) {
        return icon("briefcase", weight);
    }

    public static Icon briefcaseMetal() {
        return briefcaseMetal(PhosphorWeight.REGULAR);
    }

    public static Icon briefcaseMetal(PhosphorWeight weight) {
        return icon("briefcase-metal", weight);
    }

    public static Icon broadcast() {
        return broadcast(PhosphorWeight.REGULAR);
    }

    public static Icon broadcast(PhosphorWeight weight) {
        return icon("broadcast", weight);
    }

    public static Icon broom() {
        return broom(PhosphorWeight.REGULAR);
    }

    public static Icon broom(PhosphorWeight weight) {
        return icon("broom", weight);
    }

    public static Icon browser() {
        return browser(PhosphorWeight.REGULAR);
    }

    public static Icon browser(PhosphorWeight weight) {
        return icon("browser", weight);
    }

    public static Icon browsers() {
        return browsers(PhosphorWeight.REGULAR);
    }

    public static Icon browsers(PhosphorWeight weight) {
        return icon("browsers", weight);
    }

    public static Icon bug() {
        return bug(PhosphorWeight.REGULAR);
    }

    public static Icon bug(PhosphorWeight weight) {
        return icon("bug", weight);
    }

    public static Icon bugBeetle() {
        return bugBeetle(PhosphorWeight.REGULAR);
    }

    public static Icon bugBeetle(PhosphorWeight weight) {
        return icon("bug-beetle", weight);
    }

    public static Icon bugDroid() {
        return bugDroid(PhosphorWeight.REGULAR);
    }

    public static Icon bugDroid(PhosphorWeight weight) {
        return icon("bug-droid", weight);
    }

    public static Icon building() {
        return building(PhosphorWeight.REGULAR);
    }

    public static Icon building(PhosphorWeight weight) {
        return icon("building", weight);
    }

    public static Icon buildingApartment() {
        return buildingApartment(PhosphorWeight.REGULAR);
    }

    public static Icon buildingApartment(PhosphorWeight weight) {
        return icon("building-apartment", weight);
    }

    public static Icon buildingOffice() {
        return buildingOffice(PhosphorWeight.REGULAR);
    }

    public static Icon buildingOffice(PhosphorWeight weight) {
        return icon("building-office", weight);
    }

    public static Icon buildings() {
        return buildings(PhosphorWeight.REGULAR);
    }

    public static Icon buildings(PhosphorWeight weight) {
        return icon("buildings", weight);
    }

    public static Icon bulldozer() {
        return bulldozer(PhosphorWeight.REGULAR);
    }

    public static Icon bulldozer(PhosphorWeight weight) {
        return icon("bulldozer", weight);
    }

    public static Icon bus() {
        return bus(PhosphorWeight.REGULAR);
    }

    public static Icon bus(PhosphorWeight weight) {
        return icon("bus", weight);
    }

    public static Icon butterfly() {
        return butterfly(PhosphorWeight.REGULAR);
    }

    public static Icon butterfly(PhosphorWeight weight) {
        return icon("butterfly", weight);
    }

    public static Icon cableCar() {
        return cableCar(PhosphorWeight.REGULAR);
    }

    public static Icon cableCar(PhosphorWeight weight) {
        return icon("cable-car", weight);
    }

    public static Icon cactus() {
        return cactus(PhosphorWeight.REGULAR);
    }

    public static Icon cactus(PhosphorWeight weight) {
        return icon("cactus", weight);
    }

    public static Icon cake() {
        return cake(PhosphorWeight.REGULAR);
    }

    public static Icon cake(PhosphorWeight weight) {
        return icon("cake", weight);
    }

    public static Icon calculator() {
        return calculator(PhosphorWeight.REGULAR);
    }

    public static Icon calculator(PhosphorWeight weight) {
        return icon("calculator", weight);
    }

    public static Icon calendar() {
        return calendar(PhosphorWeight.REGULAR);
    }

    public static Icon calendar(PhosphorWeight weight) {
        return icon("calendar", weight);
    }

    public static Icon calendarBlank() {
        return calendarBlank(PhosphorWeight.REGULAR);
    }

    public static Icon calendarBlank(PhosphorWeight weight) {
        return icon("calendar-blank", weight);
    }

    public static Icon calendarCheck() {
        return calendarCheck(PhosphorWeight.REGULAR);
    }

    public static Icon calendarCheck(PhosphorWeight weight) {
        return icon("calendar-check", weight);
    }

    public static Icon calendarDot() {
        return calendarDot(PhosphorWeight.REGULAR);
    }

    public static Icon calendarDot(PhosphorWeight weight) {
        return icon("calendar-dot", weight);
    }

    public static Icon calendarDots() {
        return calendarDots(PhosphorWeight.REGULAR);
    }

    public static Icon calendarDots(PhosphorWeight weight) {
        return icon("calendar-dots", weight);
    }

    public static Icon calendarHeart() {
        return calendarHeart(PhosphorWeight.REGULAR);
    }

    public static Icon calendarHeart(PhosphorWeight weight) {
        return icon("calendar-heart", weight);
    }

    public static Icon calendarMinus() {
        return calendarMinus(PhosphorWeight.REGULAR);
    }

    public static Icon calendarMinus(PhosphorWeight weight) {
        return icon("calendar-minus", weight);
    }

    public static Icon calendarPlus() {
        return calendarPlus(PhosphorWeight.REGULAR);
    }

    public static Icon calendarPlus(PhosphorWeight weight) {
        return icon("calendar-plus", weight);
    }

    public static Icon calendarSlash() {
        return calendarSlash(PhosphorWeight.REGULAR);
    }

    public static Icon calendarSlash(PhosphorWeight weight) {
        return icon("calendar-slash", weight);
    }

    public static Icon calendarStar() {
        return calendarStar(PhosphorWeight.REGULAR);
    }

    public static Icon calendarStar(PhosphorWeight weight) {
        return icon("calendar-star", weight);
    }

    public static Icon calendarX() {
        return calendarX(PhosphorWeight.REGULAR);
    }

    public static Icon calendarX(PhosphorWeight weight) {
        return icon("calendar-x", weight);
    }

    public static Icon callBell() {
        return callBell(PhosphorWeight.REGULAR);
    }

    public static Icon callBell(PhosphorWeight weight) {
        return icon("call-bell", weight);
    }

    public static Icon camera() {
        return camera(PhosphorWeight.REGULAR);
    }

    public static Icon camera(PhosphorWeight weight) {
        return icon("camera", weight);
    }

    public static Icon cameraPlus() {
        return cameraPlus(PhosphorWeight.REGULAR);
    }

    public static Icon cameraPlus(PhosphorWeight weight) {
        return icon("camera-plus", weight);
    }

    public static Icon cameraRotate() {
        return cameraRotate(PhosphorWeight.REGULAR);
    }

    public static Icon cameraRotate(PhosphorWeight weight) {
        return icon("camera-rotate", weight);
    }

    public static Icon cameraSlash() {
        return cameraSlash(PhosphorWeight.REGULAR);
    }

    public static Icon cameraSlash(PhosphorWeight weight) {
        return icon("camera-slash", weight);
    }

    public static Icon campfire() {
        return campfire(PhosphorWeight.REGULAR);
    }

    public static Icon campfire(PhosphorWeight weight) {
        return icon("campfire", weight);
    }

    public static Icon car() {
        return car(PhosphorWeight.REGULAR);
    }

    public static Icon car(PhosphorWeight weight) {
        return icon("car", weight);
    }

    public static Icon carBattery() {
        return carBattery(PhosphorWeight.REGULAR);
    }

    public static Icon carBattery(PhosphorWeight weight) {
        return icon("car-battery", weight);
    }

    public static Icon carProfile() {
        return carProfile(PhosphorWeight.REGULAR);
    }

    public static Icon carProfile(PhosphorWeight weight) {
        return icon("car-profile", weight);
    }

    public static Icon carSimple() {
        return carSimple(PhosphorWeight.REGULAR);
    }

    public static Icon carSimple(PhosphorWeight weight) {
        return icon("car-simple", weight);
    }

    public static Icon cardholder() {
        return cardholder(PhosphorWeight.REGULAR);
    }

    public static Icon cardholder(PhosphorWeight weight) {
        return icon("cardholder", weight);
    }

    public static Icon cards() {
        return cards(PhosphorWeight.REGULAR);
    }

    public static Icon cards(PhosphorWeight weight) {
        return icon("cards", weight);
    }

    public static Icon cardsThree() {
        return cardsThree(PhosphorWeight.REGULAR);
    }

    public static Icon cardsThree(PhosphorWeight weight) {
        return icon("cards-three", weight);
    }

    public static Icon caretCircleDoubleDown() {
        return caretCircleDoubleDown(PhosphorWeight.REGULAR);
    }

    public static Icon caretCircleDoubleDown(PhosphorWeight weight) {
        return icon("caret-circle-double-down", weight);
    }

    public static Icon caretCircleDoubleLeft() {
        return caretCircleDoubleLeft(PhosphorWeight.REGULAR);
    }

    public static Icon caretCircleDoubleLeft(PhosphorWeight weight) {
        return icon("caret-circle-double-left", weight);
    }

    public static Icon caretCircleDoubleRight() {
        return caretCircleDoubleRight(PhosphorWeight.REGULAR);
    }

    public static Icon caretCircleDoubleRight(PhosphorWeight weight) {
        return icon("caret-circle-double-right", weight);
    }

    public static Icon caretCircleDoubleUp() {
        return caretCircleDoubleUp(PhosphorWeight.REGULAR);
    }

    public static Icon caretCircleDoubleUp(PhosphorWeight weight) {
        return icon("caret-circle-double-up", weight);
    }

    public static Icon caretCircleDown() {
        return caretCircleDown(PhosphorWeight.REGULAR);
    }

    public static Icon caretCircleDown(PhosphorWeight weight) {
        return icon("caret-circle-down", weight);
    }

    public static Icon caretCircleLeft() {
        return caretCircleLeft(PhosphorWeight.REGULAR);
    }

    public static Icon caretCircleLeft(PhosphorWeight weight) {
        return icon("caret-circle-left", weight);
    }

    public static Icon caretCircleRight() {
        return caretCircleRight(PhosphorWeight.REGULAR);
    }

    public static Icon caretCircleRight(PhosphorWeight weight) {
        return icon("caret-circle-right", weight);
    }

    public static Icon caretCircleUp() {
        return caretCircleUp(PhosphorWeight.REGULAR);
    }

    public static Icon caretCircleUp(PhosphorWeight weight) {
        return icon("caret-circle-up", weight);
    }

    public static Icon caretCircleUpDown() {
        return caretCircleUpDown(PhosphorWeight.REGULAR);
    }

    public static Icon caretCircleUpDown(PhosphorWeight weight) {
        return icon("caret-circle-up-down", weight);
    }

    public static Icon caretDoubleDown() {
        return caretDoubleDown(PhosphorWeight.REGULAR);
    }

    public static Icon caretDoubleDown(PhosphorWeight weight) {
        return icon("caret-double-down", weight);
    }

    public static Icon caretDoubleLeft() {
        return caretDoubleLeft(PhosphorWeight.REGULAR);
    }

    public static Icon caretDoubleLeft(PhosphorWeight weight) {
        return icon("caret-double-left", weight);
    }

    public static Icon caretDoubleRight() {
        return caretDoubleRight(PhosphorWeight.REGULAR);
    }

    public static Icon caretDoubleRight(PhosphorWeight weight) {
        return icon("caret-double-right", weight);
    }

    public static Icon caretDoubleUp() {
        return caretDoubleUp(PhosphorWeight.REGULAR);
    }

    public static Icon caretDoubleUp(PhosphorWeight weight) {
        return icon("caret-double-up", weight);
    }

    public static Icon caretDown() {
        return caretDown(PhosphorWeight.REGULAR);
    }

    public static Icon caretDown(PhosphorWeight weight) {
        return icon("caret-down", weight);
    }

    public static Icon caretLeft() {
        return caretLeft(PhosphorWeight.REGULAR);
    }

    public static Icon caretLeft(PhosphorWeight weight) {
        return icon("caret-left", weight);
    }

    public static Icon caretLineDown() {
        return caretLineDown(PhosphorWeight.REGULAR);
    }

    public static Icon caretLineDown(PhosphorWeight weight) {
        return icon("caret-line-down", weight);
    }

    public static Icon caretLineLeft() {
        return caretLineLeft(PhosphorWeight.REGULAR);
    }

    public static Icon caretLineLeft(PhosphorWeight weight) {
        return icon("caret-line-left", weight);
    }

    public static Icon caretLineRight() {
        return caretLineRight(PhosphorWeight.REGULAR);
    }

    public static Icon caretLineRight(PhosphorWeight weight) {
        return icon("caret-line-right", weight);
    }

    public static Icon caretLineUp() {
        return caretLineUp(PhosphorWeight.REGULAR);
    }

    public static Icon caretLineUp(PhosphorWeight weight) {
        return icon("caret-line-up", weight);
    }

    public static Icon caretRight() {
        return caretRight(PhosphorWeight.REGULAR);
    }

    public static Icon caretRight(PhosphorWeight weight) {
        return icon("caret-right", weight);
    }

    public static Icon caretUp() {
        return caretUp(PhosphorWeight.REGULAR);
    }

    public static Icon caretUp(PhosphorWeight weight) {
        return icon("caret-up", weight);
    }

    public static Icon caretUpDown() {
        return caretUpDown(PhosphorWeight.REGULAR);
    }

    public static Icon caretUpDown(PhosphorWeight weight) {
        return icon("caret-up-down", weight);
    }

    public static Icon carrot() {
        return carrot(PhosphorWeight.REGULAR);
    }

    public static Icon carrot(PhosphorWeight weight) {
        return icon("carrot", weight);
    }

    public static Icon cashRegister() {
        return cashRegister(PhosphorWeight.REGULAR);
    }

    public static Icon cashRegister(PhosphorWeight weight) {
        return icon("cash-register", weight);
    }

    public static Icon cassetteTape() {
        return cassetteTape(PhosphorWeight.REGULAR);
    }

    public static Icon cassetteTape(PhosphorWeight weight) {
        return icon("cassette-tape", weight);
    }

    public static Icon castleTurret() {
        return castleTurret(PhosphorWeight.REGULAR);
    }

    public static Icon castleTurret(PhosphorWeight weight) {
        return icon("castle-turret", weight);
    }

    public static Icon cat() {
        return cat(PhosphorWeight.REGULAR);
    }

    public static Icon cat(PhosphorWeight weight) {
        return icon("cat", weight);
    }

    public static Icon cellSignalFull() {
        return cellSignalFull(PhosphorWeight.REGULAR);
    }

    public static Icon cellSignalFull(PhosphorWeight weight) {
        return icon("cell-signal-full", weight);
    }

    public static Icon cellSignalHigh() {
        return cellSignalHigh(PhosphorWeight.REGULAR);
    }

    public static Icon cellSignalHigh(PhosphorWeight weight) {
        return icon("cell-signal-high", weight);
    }

    public static Icon cellSignalLow() {
        return cellSignalLow(PhosphorWeight.REGULAR);
    }

    public static Icon cellSignalLow(PhosphorWeight weight) {
        return icon("cell-signal-low", weight);
    }

    public static Icon cellSignalMedium() {
        return cellSignalMedium(PhosphorWeight.REGULAR);
    }

    public static Icon cellSignalMedium(PhosphorWeight weight) {
        return icon("cell-signal-medium", weight);
    }

    public static Icon cellSignalNone() {
        return cellSignalNone(PhosphorWeight.REGULAR);
    }

    public static Icon cellSignalNone(PhosphorWeight weight) {
        return icon("cell-signal-none", weight);
    }

    public static Icon cellSignalSlash() {
        return cellSignalSlash(PhosphorWeight.REGULAR);
    }

    public static Icon cellSignalSlash(PhosphorWeight weight) {
        return icon("cell-signal-slash", weight);
    }

    public static Icon cellSignalX() {
        return cellSignalX(PhosphorWeight.REGULAR);
    }

    public static Icon cellSignalX(PhosphorWeight weight) {
        return icon("cell-signal-x", weight);
    }

    public static Icon cellTower() {
        return cellTower(PhosphorWeight.REGULAR);
    }

    public static Icon cellTower(PhosphorWeight weight) {
        return icon("cell-tower", weight);
    }

    public static Icon certificate() {
        return certificate(PhosphorWeight.REGULAR);
    }

    public static Icon certificate(PhosphorWeight weight) {
        return icon("certificate", weight);
    }

    public static Icon chair() {
        return chair(PhosphorWeight.REGULAR);
    }

    public static Icon chair(PhosphorWeight weight) {
        return icon("chair", weight);
    }

    public static Icon chalkboard() {
        return chalkboard(PhosphorWeight.REGULAR);
    }

    public static Icon chalkboard(PhosphorWeight weight) {
        return icon("chalkboard", weight);
    }

    public static Icon chalkboardSimple() {
        return chalkboardSimple(PhosphorWeight.REGULAR);
    }

    public static Icon chalkboardSimple(PhosphorWeight weight) {
        return icon("chalkboard-simple", weight);
    }

    public static Icon chalkboardTeacher() {
        return chalkboardTeacher(PhosphorWeight.REGULAR);
    }

    public static Icon chalkboardTeacher(PhosphorWeight weight) {
        return icon("chalkboard-teacher", weight);
    }

    public static Icon champagne() {
        return champagne(PhosphorWeight.REGULAR);
    }

    public static Icon champagne(PhosphorWeight weight) {
        return icon("champagne", weight);
    }

    public static Icon chargingStation() {
        return chargingStation(PhosphorWeight.REGULAR);
    }

    public static Icon chargingStation(PhosphorWeight weight) {
        return icon("charging-station", weight);
    }

    public static Icon chartBar() {
        return chartBar(PhosphorWeight.REGULAR);
    }

    public static Icon chartBar(PhosphorWeight weight) {
        return icon("chart-bar", weight);
    }

    public static Icon chartBarHorizontal() {
        return chartBarHorizontal(PhosphorWeight.REGULAR);
    }

    public static Icon chartBarHorizontal(PhosphorWeight weight) {
        return icon("chart-bar-horizontal", weight);
    }

    public static Icon chartDonut() {
        return chartDonut(PhosphorWeight.REGULAR);
    }

    public static Icon chartDonut(PhosphorWeight weight) {
        return icon("chart-donut", weight);
    }

    public static Icon chartLine() {
        return chartLine(PhosphorWeight.REGULAR);
    }

    public static Icon chartLine(PhosphorWeight weight) {
        return icon("chart-line", weight);
    }

    public static Icon chartLineDown() {
        return chartLineDown(PhosphorWeight.REGULAR);
    }

    public static Icon chartLineDown(PhosphorWeight weight) {
        return icon("chart-line-down", weight);
    }

    public static Icon chartLineUp() {
        return chartLineUp(PhosphorWeight.REGULAR);
    }

    public static Icon chartLineUp(PhosphorWeight weight) {
        return icon("chart-line-up", weight);
    }

    public static Icon chartPie() {
        return chartPie(PhosphorWeight.REGULAR);
    }

    public static Icon chartPie(PhosphorWeight weight) {
        return icon("chart-pie", weight);
    }

    public static Icon chartPieSlice() {
        return chartPieSlice(PhosphorWeight.REGULAR);
    }

    public static Icon chartPieSlice(PhosphorWeight weight) {
        return icon("chart-pie-slice", weight);
    }

    public static Icon chartPolar() {
        return chartPolar(PhosphorWeight.REGULAR);
    }

    public static Icon chartPolar(PhosphorWeight weight) {
        return icon("chart-polar", weight);
    }

    public static Icon chartScatter() {
        return chartScatter(PhosphorWeight.REGULAR);
    }

    public static Icon chartScatter(PhosphorWeight weight) {
        return icon("chart-scatter", weight);
    }

    public static Icon chat() {
        return chat(PhosphorWeight.REGULAR);
    }

    public static Icon chat(PhosphorWeight weight) {
        return icon("chat", weight);
    }

    public static Icon chatCentered() {
        return chatCentered(PhosphorWeight.REGULAR);
    }

    public static Icon chatCentered(PhosphorWeight weight) {
        return icon("chat-centered", weight);
    }

    public static Icon chatCenteredDots() {
        return chatCenteredDots(PhosphorWeight.REGULAR);
    }

    public static Icon chatCenteredDots(PhosphorWeight weight) {
        return icon("chat-centered-dots", weight);
    }

    public static Icon chatCenteredSlash() {
        return chatCenteredSlash(PhosphorWeight.REGULAR);
    }

    public static Icon chatCenteredSlash(PhosphorWeight weight) {
        return icon("chat-centered-slash", weight);
    }

    public static Icon chatCenteredText() {
        return chatCenteredText(PhosphorWeight.REGULAR);
    }

    public static Icon chatCenteredText(PhosphorWeight weight) {
        return icon("chat-centered-text", weight);
    }

    public static Icon chatCircle() {
        return chatCircle(PhosphorWeight.REGULAR);
    }

    public static Icon chatCircle(PhosphorWeight weight) {
        return icon("chat-circle", weight);
    }

    public static Icon chatCircleDots() {
        return chatCircleDots(PhosphorWeight.REGULAR);
    }

    public static Icon chatCircleDots(PhosphorWeight weight) {
        return icon("chat-circle-dots", weight);
    }

    public static Icon chatCircleSlash() {
        return chatCircleSlash(PhosphorWeight.REGULAR);
    }

    public static Icon chatCircleSlash(PhosphorWeight weight) {
        return icon("chat-circle-slash", weight);
    }

    public static Icon chatCircleText() {
        return chatCircleText(PhosphorWeight.REGULAR);
    }

    public static Icon chatCircleText(PhosphorWeight weight) {
        return icon("chat-circle-text", weight);
    }

    public static Icon chatDots() {
        return chatDots(PhosphorWeight.REGULAR);
    }

    public static Icon chatDots(PhosphorWeight weight) {
        return icon("chat-dots", weight);
    }

    public static Icon chatSlash() {
        return chatSlash(PhosphorWeight.REGULAR);
    }

    public static Icon chatSlash(PhosphorWeight weight) {
        return icon("chat-slash", weight);
    }

    public static Icon chatTeardrop() {
        return chatTeardrop(PhosphorWeight.REGULAR);
    }

    public static Icon chatTeardrop(PhosphorWeight weight) {
        return icon("chat-teardrop", weight);
    }

    public static Icon chatTeardropDots() {
        return chatTeardropDots(PhosphorWeight.REGULAR);
    }

    public static Icon chatTeardropDots(PhosphorWeight weight) {
        return icon("chat-teardrop-dots", weight);
    }

    public static Icon chatTeardropSlash() {
        return chatTeardropSlash(PhosphorWeight.REGULAR);
    }

    public static Icon chatTeardropSlash(PhosphorWeight weight) {
        return icon("chat-teardrop-slash", weight);
    }

    public static Icon chatTeardropText() {
        return chatTeardropText(PhosphorWeight.REGULAR);
    }

    public static Icon chatTeardropText(PhosphorWeight weight) {
        return icon("chat-teardrop-text", weight);
    }

    public static Icon chatText() {
        return chatText(PhosphorWeight.REGULAR);
    }

    public static Icon chatText(PhosphorWeight weight) {
        return icon("chat-text", weight);
    }

    public static Icon chats() {
        return chats(PhosphorWeight.REGULAR);
    }

    public static Icon chats(PhosphorWeight weight) {
        return icon("chats", weight);
    }

    public static Icon chatsCircle() {
        return chatsCircle(PhosphorWeight.REGULAR);
    }

    public static Icon chatsCircle(PhosphorWeight weight) {
        return icon("chats-circle", weight);
    }

    public static Icon chatsTeardrop() {
        return chatsTeardrop(PhosphorWeight.REGULAR);
    }

    public static Icon chatsTeardrop(PhosphorWeight weight) {
        return icon("chats-teardrop", weight);
    }

    public static Icon check() {
        return check(PhosphorWeight.REGULAR);
    }

    public static Icon check(PhosphorWeight weight) {
        return icon("check", weight);
    }

    public static Icon checkCircle() {
        return checkCircle(PhosphorWeight.REGULAR);
    }

    public static Icon checkCircle(PhosphorWeight weight) {
        return icon("check-circle", weight);
    }

    public static Icon checkFat() {
        return checkFat(PhosphorWeight.REGULAR);
    }

    public static Icon checkFat(PhosphorWeight weight) {
        return icon("check-fat", weight);
    }

    public static Icon checkSquare() {
        return checkSquare(PhosphorWeight.REGULAR);
    }

    public static Icon checkSquare(PhosphorWeight weight) {
        return icon("check-square", weight);
    }

    public static Icon checkSquareOffset() {
        return checkSquareOffset(PhosphorWeight.REGULAR);
    }

    public static Icon checkSquareOffset(PhosphorWeight weight) {
        return icon("check-square-offset", weight);
    }

    public static Icon checkerboard() {
        return checkerboard(PhosphorWeight.REGULAR);
    }

    public static Icon checkerboard(PhosphorWeight weight) {
        return icon("checkerboard", weight);
    }

    public static Icon checks() {
        return checks(PhosphorWeight.REGULAR);
    }

    public static Icon checks(PhosphorWeight weight) {
        return icon("checks", weight);
    }

    public static Icon cheers() {
        return cheers(PhosphorWeight.REGULAR);
    }

    public static Icon cheers(PhosphorWeight weight) {
        return icon("cheers", weight);
    }

    public static Icon cheese() {
        return cheese(PhosphorWeight.REGULAR);
    }

    public static Icon cheese(PhosphorWeight weight) {
        return icon("cheese", weight);
    }

    public static Icon chefHat() {
        return chefHat(PhosphorWeight.REGULAR);
    }

    public static Icon chefHat(PhosphorWeight weight) {
        return icon("chef-hat", weight);
    }

    public static Icon cherries() {
        return cherries(PhosphorWeight.REGULAR);
    }

    public static Icon cherries(PhosphorWeight weight) {
        return icon("cherries", weight);
    }

    public static Icon church() {
        return church(PhosphorWeight.REGULAR);
    }

    public static Icon church(PhosphorWeight weight) {
        return icon("church", weight);
    }

    public static Icon cigarette() {
        return cigarette(PhosphorWeight.REGULAR);
    }

    public static Icon cigarette(PhosphorWeight weight) {
        return icon("cigarette", weight);
    }

    public static Icon cigaretteSlash() {
        return cigaretteSlash(PhosphorWeight.REGULAR);
    }

    public static Icon cigaretteSlash(PhosphorWeight weight) {
        return icon("cigarette-slash", weight);
    }

    public static Icon circle() {
        return circle(PhosphorWeight.REGULAR);
    }

    public static Icon circle(PhosphorWeight weight) {
        return icon("circle", weight);
    }

    public static Icon circleDashed() {
        return circleDashed(PhosphorWeight.REGULAR);
    }

    public static Icon circleDashed(PhosphorWeight weight) {
        return icon("circle-dashed", weight);
    }

    public static Icon circleHalf() {
        return circleHalf(PhosphorWeight.REGULAR);
    }

    public static Icon circleHalf(PhosphorWeight weight) {
        return icon("circle-half", weight);
    }

    public static Icon circleHalfTilt() {
        return circleHalfTilt(PhosphorWeight.REGULAR);
    }

    public static Icon circleHalfTilt(PhosphorWeight weight) {
        return icon("circle-half-tilt", weight);
    }

    public static Icon circleNotch() {
        return circleNotch(PhosphorWeight.REGULAR);
    }

    public static Icon circleNotch(PhosphorWeight weight) {
        return icon("circle-notch", weight);
    }

    public static Icon circlesFour() {
        return circlesFour(PhosphorWeight.REGULAR);
    }

    public static Icon circlesFour(PhosphorWeight weight) {
        return icon("circles-four", weight);
    }

    public static Icon circlesThree() {
        return circlesThree(PhosphorWeight.REGULAR);
    }

    public static Icon circlesThree(PhosphorWeight weight) {
        return icon("circles-three", weight);
    }

    public static Icon circlesThreePlus() {
        return circlesThreePlus(PhosphorWeight.REGULAR);
    }

    public static Icon circlesThreePlus(PhosphorWeight weight) {
        return icon("circles-three-plus", weight);
    }

    public static Icon circuitry() {
        return circuitry(PhosphorWeight.REGULAR);
    }

    public static Icon circuitry(PhosphorWeight weight) {
        return icon("circuitry", weight);
    }

    public static Icon city() {
        return city(PhosphorWeight.REGULAR);
    }

    public static Icon city(PhosphorWeight weight) {
        return icon("city", weight);
    }

    public static Icon clipboard() {
        return clipboard(PhosphorWeight.REGULAR);
    }

    public static Icon clipboard(PhosphorWeight weight) {
        return icon("clipboard", weight);
    }

    public static Icon clipboardText() {
        return clipboardText(PhosphorWeight.REGULAR);
    }

    public static Icon clipboardText(PhosphorWeight weight) {
        return icon("clipboard-text", weight);
    }

    public static Icon clock() {
        return clock(PhosphorWeight.REGULAR);
    }

    public static Icon clock(PhosphorWeight weight) {
        return icon("clock", weight);
    }

    public static Icon clockAfternoon() {
        return clockAfternoon(PhosphorWeight.REGULAR);
    }

    public static Icon clockAfternoon(PhosphorWeight weight) {
        return icon("clock-afternoon", weight);
    }

    public static Icon clockClockwise() {
        return clockClockwise(PhosphorWeight.REGULAR);
    }

    public static Icon clockClockwise(PhosphorWeight weight) {
        return icon("clock-clockwise", weight);
    }

    public static Icon clockCountdown() {
        return clockCountdown(PhosphorWeight.REGULAR);
    }

    public static Icon clockCountdown(PhosphorWeight weight) {
        return icon("clock-countdown", weight);
    }

    public static Icon clockCounterClockwise() {
        return clockCounterClockwise(PhosphorWeight.REGULAR);
    }

    public static Icon clockCounterClockwise(PhosphorWeight weight) {
        return icon("clock-counter-clockwise", weight);
    }

    public static Icon clockUser() {
        return clockUser(PhosphorWeight.REGULAR);
    }

    public static Icon clockUser(PhosphorWeight weight) {
        return icon("clock-user", weight);
    }

    public static Icon closedCaptioning() {
        return closedCaptioning(PhosphorWeight.REGULAR);
    }

    public static Icon closedCaptioning(PhosphorWeight weight) {
        return icon("closed-captioning", weight);
    }

    public static Icon cloud() {
        return cloud(PhosphorWeight.REGULAR);
    }

    public static Icon cloud(PhosphorWeight weight) {
        return icon("cloud", weight);
    }

    public static Icon cloudArrowDown() {
        return cloudArrowDown(PhosphorWeight.REGULAR);
    }

    public static Icon cloudArrowDown(PhosphorWeight weight) {
        return icon("cloud-arrow-down", weight);
    }

    public static Icon cloudArrowUp() {
        return cloudArrowUp(PhosphorWeight.REGULAR);
    }

    public static Icon cloudArrowUp(PhosphorWeight weight) {
        return icon("cloud-arrow-up", weight);
    }

    public static Icon cloudCheck() {
        return cloudCheck(PhosphorWeight.REGULAR);
    }

    public static Icon cloudCheck(PhosphorWeight weight) {
        return icon("cloud-check", weight);
    }

    public static Icon cloudFog() {
        return cloudFog(PhosphorWeight.REGULAR);
    }

    public static Icon cloudFog(PhosphorWeight weight) {
        return icon("cloud-fog", weight);
    }

    public static Icon cloudLightning() {
        return cloudLightning(PhosphorWeight.REGULAR);
    }

    public static Icon cloudLightning(PhosphorWeight weight) {
        return icon("cloud-lightning", weight);
    }

    public static Icon cloudMoon() {
        return cloudMoon(PhosphorWeight.REGULAR);
    }

    public static Icon cloudMoon(PhosphorWeight weight) {
        return icon("cloud-moon", weight);
    }

    public static Icon cloudRain() {
        return cloudRain(PhosphorWeight.REGULAR);
    }

    public static Icon cloudRain(PhosphorWeight weight) {
        return icon("cloud-rain", weight);
    }

    public static Icon cloudSlash() {
        return cloudSlash(PhosphorWeight.REGULAR);
    }

    public static Icon cloudSlash(PhosphorWeight weight) {
        return icon("cloud-slash", weight);
    }

    public static Icon cloudSnow() {
        return cloudSnow(PhosphorWeight.REGULAR);
    }

    public static Icon cloudSnow(PhosphorWeight weight) {
        return icon("cloud-snow", weight);
    }

    public static Icon cloudSun() {
        return cloudSun(PhosphorWeight.REGULAR);
    }

    public static Icon cloudSun(PhosphorWeight weight) {
        return icon("cloud-sun", weight);
    }

    public static Icon cloudWarning() {
        return cloudWarning(PhosphorWeight.REGULAR);
    }

    public static Icon cloudWarning(PhosphorWeight weight) {
        return icon("cloud-warning", weight);
    }

    public static Icon cloudX() {
        return cloudX(PhosphorWeight.REGULAR);
    }

    public static Icon cloudX(PhosphorWeight weight) {
        return icon("cloud-x", weight);
    }

    public static Icon clover() {
        return clover(PhosphorWeight.REGULAR);
    }

    public static Icon clover(PhosphorWeight weight) {
        return icon("clover", weight);
    }

    public static Icon club() {
        return club(PhosphorWeight.REGULAR);
    }

    public static Icon club(PhosphorWeight weight) {
        return icon("club", weight);
    }

    public static Icon coatHanger() {
        return coatHanger(PhosphorWeight.REGULAR);
    }

    public static Icon coatHanger(PhosphorWeight weight) {
        return icon("coat-hanger", weight);
    }

    public static Icon codaLogo() {
        return codaLogo(PhosphorWeight.REGULAR);
    }

    public static Icon codaLogo(PhosphorWeight weight) {
        return icon("coda-logo", weight);
    }

    public static Icon code() {
        return code(PhosphorWeight.REGULAR);
    }

    public static Icon code(PhosphorWeight weight) {
        return icon("code", weight);
    }

    public static Icon codeBlock() {
        return codeBlock(PhosphorWeight.REGULAR);
    }

    public static Icon codeBlock(PhosphorWeight weight) {
        return icon("code-block", weight);
    }

    public static Icon codeSimple() {
        return codeSimple(PhosphorWeight.REGULAR);
    }

    public static Icon codeSimple(PhosphorWeight weight) {
        return icon("code-simple", weight);
    }

    public static Icon codepenLogo() {
        return codepenLogo(PhosphorWeight.REGULAR);
    }

    public static Icon codepenLogo(PhosphorWeight weight) {
        return icon("codepen-logo", weight);
    }

    public static Icon codesandboxLogo() {
        return codesandboxLogo(PhosphorWeight.REGULAR);
    }

    public static Icon codesandboxLogo(PhosphorWeight weight) {
        return icon("codesandbox-logo", weight);
    }

    public static Icon coffee() {
        return coffee(PhosphorWeight.REGULAR);
    }

    public static Icon coffee(PhosphorWeight weight) {
        return icon("coffee", weight);
    }

    public static Icon coffeeBean() {
        return coffeeBean(PhosphorWeight.REGULAR);
    }

    public static Icon coffeeBean(PhosphorWeight weight) {
        return icon("coffee-bean", weight);
    }

    public static Icon coin() {
        return coin(PhosphorWeight.REGULAR);
    }

    public static Icon coin(PhosphorWeight weight) {
        return icon("coin", weight);
    }

    public static Icon coinVertical() {
        return coinVertical(PhosphorWeight.REGULAR);
    }

    public static Icon coinVertical(PhosphorWeight weight) {
        return icon("coin-vertical", weight);
    }

    public static Icon coins() {
        return coins(PhosphorWeight.REGULAR);
    }

    public static Icon coins(PhosphorWeight weight) {
        return icon("coins", weight);
    }

    public static Icon columns() {
        return columns(PhosphorWeight.REGULAR);
    }

    public static Icon columns(PhosphorWeight weight) {
        return icon("columns", weight);
    }

    public static Icon columnsPlusLeft() {
        return columnsPlusLeft(PhosphorWeight.REGULAR);
    }

    public static Icon columnsPlusLeft(PhosphorWeight weight) {
        return icon("columns-plus-left", weight);
    }

    public static Icon columnsPlusRight() {
        return columnsPlusRight(PhosphorWeight.REGULAR);
    }

    public static Icon columnsPlusRight(PhosphorWeight weight) {
        return icon("columns-plus-right", weight);
    }

    public static Icon command() {
        return command(PhosphorWeight.REGULAR);
    }

    public static Icon command(PhosphorWeight weight) {
        return icon("command", weight);
    }

    public static Icon compass() {
        return compass(PhosphorWeight.REGULAR);
    }

    public static Icon compass(PhosphorWeight weight) {
        return icon("compass", weight);
    }

    public static Icon compassRose() {
        return compassRose(PhosphorWeight.REGULAR);
    }

    public static Icon compassRose(PhosphorWeight weight) {
        return icon("compass-rose", weight);
    }

    public static Icon compassTool() {
        return compassTool(PhosphorWeight.REGULAR);
    }

    public static Icon compassTool(PhosphorWeight weight) {
        return icon("compass-tool", weight);
    }

    public static Icon computerTower() {
        return computerTower(PhosphorWeight.REGULAR);
    }

    public static Icon computerTower(PhosphorWeight weight) {
        return icon("computer-tower", weight);
    }

    public static Icon confetti() {
        return confetti(PhosphorWeight.REGULAR);
    }

    public static Icon confetti(PhosphorWeight weight) {
        return icon("confetti", weight);
    }

    public static Icon contactlessPayment() {
        return contactlessPayment(PhosphorWeight.REGULAR);
    }

    public static Icon contactlessPayment(PhosphorWeight weight) {
        return icon("contactless-payment", weight);
    }

    public static Icon control() {
        return control(PhosphorWeight.REGULAR);
    }

    public static Icon control(PhosphorWeight weight) {
        return icon("control", weight);
    }

    public static Icon cookie() {
        return cookie(PhosphorWeight.REGULAR);
    }

    public static Icon cookie(PhosphorWeight weight) {
        return icon("cookie", weight);
    }

    public static Icon cookingPot() {
        return cookingPot(PhosphorWeight.REGULAR);
    }

    public static Icon cookingPot(PhosphorWeight weight) {
        return icon("cooking-pot", weight);
    }

    public static Icon copy() {
        return copy(PhosphorWeight.REGULAR);
    }

    public static Icon copy(PhosphorWeight weight) {
        return icon("copy", weight);
    }

    public static Icon copySimple() {
        return copySimple(PhosphorWeight.REGULAR);
    }

    public static Icon copySimple(PhosphorWeight weight) {
        return icon("copy-simple", weight);
    }

    public static Icon copyleft() {
        return copyleft(PhosphorWeight.REGULAR);
    }

    public static Icon copyleft(PhosphorWeight weight) {
        return icon("copyleft", weight);
    }

    public static Icon copyright() {
        return copyright(PhosphorWeight.REGULAR);
    }

    public static Icon copyright(PhosphorWeight weight) {
        return icon("copyright", weight);
    }

    public static Icon cornersIn() {
        return cornersIn(PhosphorWeight.REGULAR);
    }

    public static Icon cornersIn(PhosphorWeight weight) {
        return icon("corners-in", weight);
    }

    public static Icon cornersOut() {
        return cornersOut(PhosphorWeight.REGULAR);
    }

    public static Icon cornersOut(PhosphorWeight weight) {
        return icon("corners-out", weight);
    }

    public static Icon couch() {
        return couch(PhosphorWeight.REGULAR);
    }

    public static Icon couch(PhosphorWeight weight) {
        return icon("couch", weight);
    }

    public static Icon courtBasketball() {
        return courtBasketball(PhosphorWeight.REGULAR);
    }

    public static Icon courtBasketball(PhosphorWeight weight) {
        return icon("court-basketball", weight);
    }

    public static Icon cow() {
        return cow(PhosphorWeight.REGULAR);
    }

    public static Icon cow(PhosphorWeight weight) {
        return icon("cow", weight);
    }

    public static Icon cowboyHat() {
        return cowboyHat(PhosphorWeight.REGULAR);
    }

    public static Icon cowboyHat(PhosphorWeight weight) {
        return icon("cowboy-hat", weight);
    }

    public static Icon cpu() {
        return cpu(PhosphorWeight.REGULAR);
    }

    public static Icon cpu(PhosphorWeight weight) {
        return icon("cpu", weight);
    }

    public static Icon crane() {
        return crane(PhosphorWeight.REGULAR);
    }

    public static Icon crane(PhosphorWeight weight) {
        return icon("crane", weight);
    }

    public static Icon craneTower() {
        return craneTower(PhosphorWeight.REGULAR);
    }

    public static Icon craneTower(PhosphorWeight weight) {
        return icon("crane-tower", weight);
    }

    public static Icon creditCard() {
        return creditCard(PhosphorWeight.REGULAR);
    }

    public static Icon creditCard(PhosphorWeight weight) {
        return icon("credit-card", weight);
    }

    public static Icon cricket() {
        return cricket(PhosphorWeight.REGULAR);
    }

    public static Icon cricket(PhosphorWeight weight) {
        return icon("cricket", weight);
    }

    public static Icon crop() {
        return crop(PhosphorWeight.REGULAR);
    }

    public static Icon crop(PhosphorWeight weight) {
        return icon("crop", weight);
    }

    public static Icon cross() {
        return cross(PhosphorWeight.REGULAR);
    }

    public static Icon cross(PhosphorWeight weight) {
        return icon("cross", weight);
    }

    public static Icon crosshair() {
        return crosshair(PhosphorWeight.REGULAR);
    }

    public static Icon crosshair(PhosphorWeight weight) {
        return icon("crosshair", weight);
    }

    public static Icon crosshairSimple() {
        return crosshairSimple(PhosphorWeight.REGULAR);
    }

    public static Icon crosshairSimple(PhosphorWeight weight) {
        return icon("crosshair-simple", weight);
    }

    public static Icon crown() {
        return crown(PhosphorWeight.REGULAR);
    }

    public static Icon crown(PhosphorWeight weight) {
        return icon("crown", weight);
    }

    public static Icon crownCross() {
        return crownCross(PhosphorWeight.REGULAR);
    }

    public static Icon crownCross(PhosphorWeight weight) {
        return icon("crown-cross", weight);
    }

    public static Icon crownSimple() {
        return crownSimple(PhosphorWeight.REGULAR);
    }

    public static Icon crownSimple(PhosphorWeight weight) {
        return icon("crown-simple", weight);
    }

    public static Icon cube() {
        return cube(PhosphorWeight.REGULAR);
    }

    public static Icon cube(PhosphorWeight weight) {
        return icon("cube", weight);
    }

    public static Icon cubeFocus() {
        return cubeFocus(PhosphorWeight.REGULAR);
    }

    public static Icon cubeFocus(PhosphorWeight weight) {
        return icon("cube-focus", weight);
    }

    public static Icon cubeTransparent() {
        return cubeTransparent(PhosphorWeight.REGULAR);
    }

    public static Icon cubeTransparent(PhosphorWeight weight) {
        return icon("cube-transparent", weight);
    }

    public static Icon currencyBtc() {
        return currencyBtc(PhosphorWeight.REGULAR);
    }

    public static Icon currencyBtc(PhosphorWeight weight) {
        return icon("currency-btc", weight);
    }

    public static Icon currencyCircleDollar() {
        return currencyCircleDollar(PhosphorWeight.REGULAR);
    }

    public static Icon currencyCircleDollar(PhosphorWeight weight) {
        return icon("currency-circle-dollar", weight);
    }

    public static Icon currencyCny() {
        return currencyCny(PhosphorWeight.REGULAR);
    }

    public static Icon currencyCny(PhosphorWeight weight) {
        return icon("currency-cny", weight);
    }

    public static Icon currencyDollar() {
        return currencyDollar(PhosphorWeight.REGULAR);
    }

    public static Icon currencyDollar(PhosphorWeight weight) {
        return icon("currency-dollar", weight);
    }

    public static Icon currencyDollarSimple() {
        return currencyDollarSimple(PhosphorWeight.REGULAR);
    }

    public static Icon currencyDollarSimple(PhosphorWeight weight) {
        return icon("currency-dollar-simple", weight);
    }

    public static Icon currencyEth() {
        return currencyEth(PhosphorWeight.REGULAR);
    }

    public static Icon currencyEth(PhosphorWeight weight) {
        return icon("currency-eth", weight);
    }

    public static Icon currencyEur() {
        return currencyEur(PhosphorWeight.REGULAR);
    }

    public static Icon currencyEur(PhosphorWeight weight) {
        return icon("currency-eur", weight);
    }

    public static Icon currencyGbp() {
        return currencyGbp(PhosphorWeight.REGULAR);
    }

    public static Icon currencyGbp(PhosphorWeight weight) {
        return icon("currency-gbp", weight);
    }

    public static Icon currencyInr() {
        return currencyInr(PhosphorWeight.REGULAR);
    }

    public static Icon currencyInr(PhosphorWeight weight) {
        return icon("currency-inr", weight);
    }

    public static Icon currencyJpy() {
        return currencyJpy(PhosphorWeight.REGULAR);
    }

    public static Icon currencyJpy(PhosphorWeight weight) {
        return icon("currency-jpy", weight);
    }

    public static Icon currencyKrw() {
        return currencyKrw(PhosphorWeight.REGULAR);
    }

    public static Icon currencyKrw(PhosphorWeight weight) {
        return icon("currency-krw", weight);
    }

    public static Icon currencyKzt() {
        return currencyKzt(PhosphorWeight.REGULAR);
    }

    public static Icon currencyKzt(PhosphorWeight weight) {
        return icon("currency-kzt", weight);
    }

    public static Icon currencyNgn() {
        return currencyNgn(PhosphorWeight.REGULAR);
    }

    public static Icon currencyNgn(PhosphorWeight weight) {
        return icon("currency-ngn", weight);
    }

    public static Icon currencyRub() {
        return currencyRub(PhosphorWeight.REGULAR);
    }

    public static Icon currencyRub(PhosphorWeight weight) {
        return icon("currency-rub", weight);
    }

    public static Icon cursor() {
        return cursor(PhosphorWeight.REGULAR);
    }

    public static Icon cursor(PhosphorWeight weight) {
        return icon("cursor", weight);
    }

    public static Icon cursorClick() {
        return cursorClick(PhosphorWeight.REGULAR);
    }

    public static Icon cursorClick(PhosphorWeight weight) {
        return icon("cursor-click", weight);
    }

    public static Icon cursorText() {
        return cursorText(PhosphorWeight.REGULAR);
    }

    public static Icon cursorText(PhosphorWeight weight) {
        return icon("cursor-text", weight);
    }

    public static Icon cylinder() {
        return cylinder(PhosphorWeight.REGULAR);
    }

    public static Icon cylinder(PhosphorWeight weight) {
        return icon("cylinder", weight);
    }

    public static Icon database() {
        return database(PhosphorWeight.REGULAR);
    }

    public static Icon database(PhosphorWeight weight) {
        return icon("database", weight);
    }

    public static Icon desk() {
        return desk(PhosphorWeight.REGULAR);
    }

    public static Icon desk(PhosphorWeight weight) {
        return icon("desk", weight);
    }

    public static Icon desktop() {
        return desktop(PhosphorWeight.REGULAR);
    }

    public static Icon desktop(PhosphorWeight weight) {
        return icon("desktop", weight);
    }

    public static Icon desktopTower() {
        return desktopTower(PhosphorWeight.REGULAR);
    }

    public static Icon desktopTower(PhosphorWeight weight) {
        return icon("desktop-tower", weight);
    }

    public static Icon detective() {
        return detective(PhosphorWeight.REGULAR);
    }

    public static Icon detective(PhosphorWeight weight) {
        return icon("detective", weight);
    }

    public static Icon devToLogo() {
        return devToLogo(PhosphorWeight.REGULAR);
    }

    public static Icon devToLogo(PhosphorWeight weight) {
        return icon("dev-to-logo", weight);
    }

    public static Icon deviceMobile() {
        return deviceMobile(PhosphorWeight.REGULAR);
    }

    public static Icon deviceMobile(PhosphorWeight weight) {
        return icon("device-mobile", weight);
    }

    public static Icon deviceMobileCamera() {
        return deviceMobileCamera(PhosphorWeight.REGULAR);
    }

    public static Icon deviceMobileCamera(PhosphorWeight weight) {
        return icon("device-mobile-camera", weight);
    }

    public static Icon deviceMobileSlash() {
        return deviceMobileSlash(PhosphorWeight.REGULAR);
    }

    public static Icon deviceMobileSlash(PhosphorWeight weight) {
        return icon("device-mobile-slash", weight);
    }

    public static Icon deviceMobileSpeaker() {
        return deviceMobileSpeaker(PhosphorWeight.REGULAR);
    }

    public static Icon deviceMobileSpeaker(PhosphorWeight weight) {
        return icon("device-mobile-speaker", weight);
    }

    public static Icon deviceRotate() {
        return deviceRotate(PhosphorWeight.REGULAR);
    }

    public static Icon deviceRotate(PhosphorWeight weight) {
        return icon("device-rotate", weight);
    }

    public static Icon deviceTablet() {
        return deviceTablet(PhosphorWeight.REGULAR);
    }

    public static Icon deviceTablet(PhosphorWeight weight) {
        return icon("device-tablet", weight);
    }

    public static Icon deviceTabletCamera() {
        return deviceTabletCamera(PhosphorWeight.REGULAR);
    }

    public static Icon deviceTabletCamera(PhosphorWeight weight) {
        return icon("device-tablet-camera", weight);
    }

    public static Icon deviceTabletSpeaker() {
        return deviceTabletSpeaker(PhosphorWeight.REGULAR);
    }

    public static Icon deviceTabletSpeaker(PhosphorWeight weight) {
        return icon("device-tablet-speaker", weight);
    }

    public static Icon devices() {
        return devices(PhosphorWeight.REGULAR);
    }

    public static Icon devices(PhosphorWeight weight) {
        return icon("devices", weight);
    }

    public static Icon diamond() {
        return diamond(PhosphorWeight.REGULAR);
    }

    public static Icon diamond(PhosphorWeight weight) {
        return icon("diamond", weight);
    }

    public static Icon diamondsFour() {
        return diamondsFour(PhosphorWeight.REGULAR);
    }

    public static Icon diamondsFour(PhosphorWeight weight) {
        return icon("diamonds-four", weight);
    }

    public static Icon diceFive() {
        return diceFive(PhosphorWeight.REGULAR);
    }

    public static Icon diceFive(PhosphorWeight weight) {
        return icon("dice-five", weight);
    }

    public static Icon diceFour() {
        return diceFour(PhosphorWeight.REGULAR);
    }

    public static Icon diceFour(PhosphorWeight weight) {
        return icon("dice-four", weight);
    }

    public static Icon diceOne() {
        return diceOne(PhosphorWeight.REGULAR);
    }

    public static Icon diceOne(PhosphorWeight weight) {
        return icon("dice-one", weight);
    }

    public static Icon diceSix() {
        return diceSix(PhosphorWeight.REGULAR);
    }

    public static Icon diceSix(PhosphorWeight weight) {
        return icon("dice-six", weight);
    }

    public static Icon diceThree() {
        return diceThree(PhosphorWeight.REGULAR);
    }

    public static Icon diceThree(PhosphorWeight weight) {
        return icon("dice-three", weight);
    }

    public static Icon diceTwo() {
        return diceTwo(PhosphorWeight.REGULAR);
    }

    public static Icon diceTwo(PhosphorWeight weight) {
        return icon("dice-two", weight);
    }

    public static Icon disc() {
        return disc(PhosphorWeight.REGULAR);
    }

    public static Icon disc(PhosphorWeight weight) {
        return icon("disc", weight);
    }

    public static Icon discoBall() {
        return discoBall(PhosphorWeight.REGULAR);
    }

    public static Icon discoBall(PhosphorWeight weight) {
        return icon("disco-ball", weight);
    }

    public static Icon discordLogo() {
        return discordLogo(PhosphorWeight.REGULAR);
    }

    public static Icon discordLogo(PhosphorWeight weight) {
        return icon("discord-logo", weight);
    }

    public static Icon divide() {
        return divide(PhosphorWeight.REGULAR);
    }

    public static Icon divide(PhosphorWeight weight) {
        return icon("divide", weight);
    }

    public static Icon dna() {
        return dna(PhosphorWeight.REGULAR);
    }

    public static Icon dna(PhosphorWeight weight) {
        return icon("dna", weight);
    }

    public static Icon dog() {
        return dog(PhosphorWeight.REGULAR);
    }

    public static Icon dog(PhosphorWeight weight) {
        return icon("dog", weight);
    }

    public static Icon door() {
        return door(PhosphorWeight.REGULAR);
    }

    public static Icon door(PhosphorWeight weight) {
        return icon("door", weight);
    }

    public static Icon doorOpen() {
        return doorOpen(PhosphorWeight.REGULAR);
    }

    public static Icon doorOpen(PhosphorWeight weight) {
        return icon("door-open", weight);
    }

    public static Icon dot() {
        return dot(PhosphorWeight.REGULAR);
    }

    public static Icon dot(PhosphorWeight weight) {
        return icon("dot", weight);
    }

    public static Icon dotOutline() {
        return dotOutline(PhosphorWeight.REGULAR);
    }

    public static Icon dotOutline(PhosphorWeight weight) {
        return icon("dot-outline", weight);
    }

    public static Icon dotsNine() {
        return dotsNine(PhosphorWeight.REGULAR);
    }

    public static Icon dotsNine(PhosphorWeight weight) {
        return icon("dots-nine", weight);
    }

    public static Icon dotsSix() {
        return dotsSix(PhosphorWeight.REGULAR);
    }

    public static Icon dotsSix(PhosphorWeight weight) {
        return icon("dots-six", weight);
    }

    public static Icon dotsSixVertical() {
        return dotsSixVertical(PhosphorWeight.REGULAR);
    }

    public static Icon dotsSixVertical(PhosphorWeight weight) {
        return icon("dots-six-vertical", weight);
    }

    public static Icon dotsThree() {
        return dotsThree(PhosphorWeight.REGULAR);
    }

    public static Icon dotsThree(PhosphorWeight weight) {
        return icon("dots-three", weight);
    }

    public static Icon dotsThreeCircle() {
        return dotsThreeCircle(PhosphorWeight.REGULAR);
    }

    public static Icon dotsThreeCircle(PhosphorWeight weight) {
        return icon("dots-three-circle", weight);
    }

    public static Icon dotsThreeCircleVertical() {
        return dotsThreeCircleVertical(PhosphorWeight.REGULAR);
    }

    public static Icon dotsThreeCircleVertical(PhosphorWeight weight) {
        return icon("dots-three-circle-vertical", weight);
    }

    public static Icon dotsThreeOutline() {
        return dotsThreeOutline(PhosphorWeight.REGULAR);
    }

    public static Icon dotsThreeOutline(PhosphorWeight weight) {
        return icon("dots-three-outline", weight);
    }

    public static Icon dotsThreeOutlineVertical() {
        return dotsThreeOutlineVertical(PhosphorWeight.REGULAR);
    }

    public static Icon dotsThreeOutlineVertical(PhosphorWeight weight) {
        return icon("dots-three-outline-vertical", weight);
    }

    public static Icon dotsThreeVertical() {
        return dotsThreeVertical(PhosphorWeight.REGULAR);
    }

    public static Icon dotsThreeVertical(PhosphorWeight weight) {
        return icon("dots-three-vertical", weight);
    }

    public static Icon download() {
        return download(PhosphorWeight.REGULAR);
    }

    public static Icon download(PhosphorWeight weight) {
        return icon("download", weight);
    }

    public static Icon downloadSimple() {
        return downloadSimple(PhosphorWeight.REGULAR);
    }

    public static Icon downloadSimple(PhosphorWeight weight) {
        return icon("download-simple", weight);
    }

    public static Icon dress() {
        return dress(PhosphorWeight.REGULAR);
    }

    public static Icon dress(PhosphorWeight weight) {
        return icon("dress", weight);
    }

    public static Icon dresser() {
        return dresser(PhosphorWeight.REGULAR);
    }

    public static Icon dresser(PhosphorWeight weight) {
        return icon("dresser", weight);
    }

    public static Icon dribbbleLogo() {
        return dribbbleLogo(PhosphorWeight.REGULAR);
    }

    public static Icon dribbbleLogo(PhosphorWeight weight) {
        return icon("dribbble-logo", weight);
    }

    public static Icon drone() {
        return drone(PhosphorWeight.REGULAR);
    }

    public static Icon drone(PhosphorWeight weight) {
        return icon("drone", weight);
    }

    public static Icon drop() {
        return drop(PhosphorWeight.REGULAR);
    }

    public static Icon drop(PhosphorWeight weight) {
        return icon("drop", weight);
    }

    public static Icon dropHalf() {
        return dropHalf(PhosphorWeight.REGULAR);
    }

    public static Icon dropHalf(PhosphorWeight weight) {
        return icon("drop-half", weight);
    }

    public static Icon dropHalfBottom() {
        return dropHalfBottom(PhosphorWeight.REGULAR);
    }

    public static Icon dropHalfBottom(PhosphorWeight weight) {
        return icon("drop-half-bottom", weight);
    }

    public static Icon dropSimple() {
        return dropSimple(PhosphorWeight.REGULAR);
    }

    public static Icon dropSimple(PhosphorWeight weight) {
        return icon("drop-simple", weight);
    }

    public static Icon dropSlash() {
        return dropSlash(PhosphorWeight.REGULAR);
    }

    public static Icon dropSlash(PhosphorWeight weight) {
        return icon("drop-slash", weight);
    }

    public static Icon dropboxLogo() {
        return dropboxLogo(PhosphorWeight.REGULAR);
    }

    public static Icon dropboxLogo(PhosphorWeight weight) {
        return icon("dropbox-logo", weight);
    }

    public static Icon ear() {
        return ear(PhosphorWeight.REGULAR);
    }

    public static Icon ear(PhosphorWeight weight) {
        return icon("ear", weight);
    }

    public static Icon earSlash() {
        return earSlash(PhosphorWeight.REGULAR);
    }

    public static Icon earSlash(PhosphorWeight weight) {
        return icon("ear-slash", weight);
    }

    public static Icon egg() {
        return egg(PhosphorWeight.REGULAR);
    }

    public static Icon egg(PhosphorWeight weight) {
        return icon("egg", weight);
    }

    public static Icon eggCrack() {
        return eggCrack(PhosphorWeight.REGULAR);
    }

    public static Icon eggCrack(PhosphorWeight weight) {
        return icon("egg-crack", weight);
    }

    public static Icon eject() {
        return eject(PhosphorWeight.REGULAR);
    }

    public static Icon eject(PhosphorWeight weight) {
        return icon("eject", weight);
    }

    public static Icon ejectSimple() {
        return ejectSimple(PhosphorWeight.REGULAR);
    }

    public static Icon ejectSimple(PhosphorWeight weight) {
        return icon("eject-simple", weight);
    }

    public static Icon elevator() {
        return elevator(PhosphorWeight.REGULAR);
    }

    public static Icon elevator(PhosphorWeight weight) {
        return icon("elevator", weight);
    }

    public static Icon empty() {
        return empty(PhosphorWeight.REGULAR);
    }

    public static Icon empty(PhosphorWeight weight) {
        return icon("empty", weight);
    }

    public static Icon engine() {
        return engine(PhosphorWeight.REGULAR);
    }

    public static Icon engine(PhosphorWeight weight) {
        return icon("engine", weight);
    }

    public static Icon envelope() {
        return envelope(PhosphorWeight.REGULAR);
    }

    public static Icon envelope(PhosphorWeight weight) {
        return icon("envelope", weight);
    }

    public static Icon envelopeOpen() {
        return envelopeOpen(PhosphorWeight.REGULAR);
    }

    public static Icon envelopeOpen(PhosphorWeight weight) {
        return icon("envelope-open", weight);
    }

    public static Icon envelopeSimple() {
        return envelopeSimple(PhosphorWeight.REGULAR);
    }

    public static Icon envelopeSimple(PhosphorWeight weight) {
        return icon("envelope-simple", weight);
    }

    public static Icon envelopeSimpleOpen() {
        return envelopeSimpleOpen(PhosphorWeight.REGULAR);
    }

    public static Icon envelopeSimpleOpen(PhosphorWeight weight) {
        return icon("envelope-simple-open", weight);
    }

    public static Icon equalizer() {
        return equalizer(PhosphorWeight.REGULAR);
    }

    public static Icon equalizer(PhosphorWeight weight) {
        return icon("equalizer", weight);
    }

    public static Icon equals() {
        return equals(PhosphorWeight.REGULAR);
    }

    public static Icon equals(PhosphorWeight weight) {
        return icon("equals", weight);
    }

    public static Icon eraser() {
        return eraser(PhosphorWeight.REGULAR);
    }

    public static Icon eraser(PhosphorWeight weight) {
        return icon("eraser", weight);
    }

    public static Icon escalatorDown() {
        return escalatorDown(PhosphorWeight.REGULAR);
    }

    public static Icon escalatorDown(PhosphorWeight weight) {
        return icon("escalator-down", weight);
    }

    public static Icon escalatorUp() {
        return escalatorUp(PhosphorWeight.REGULAR);
    }

    public static Icon escalatorUp(PhosphorWeight weight) {
        return icon("escalator-up", weight);
    }

    public static Icon exam() {
        return exam(PhosphorWeight.REGULAR);
    }

    public static Icon exam(PhosphorWeight weight) {
        return icon("exam", weight);
    }

    public static Icon exclamationMark() {
        return exclamationMark(PhosphorWeight.REGULAR);
    }

    public static Icon exclamationMark(PhosphorWeight weight) {
        return icon("exclamation-mark", weight);
    }

    public static Icon exclude() {
        return exclude(PhosphorWeight.REGULAR);
    }

    public static Icon exclude(PhosphorWeight weight) {
        return icon("exclude", weight);
    }

    public static Icon excludeSquare() {
        return excludeSquare(PhosphorWeight.REGULAR);
    }

    public static Icon excludeSquare(PhosphorWeight weight) {
        return icon("exclude-square", weight);
    }

    public static Icon export() {
        return export(PhosphorWeight.REGULAR);
    }

    public static Icon export(PhosphorWeight weight) {
        return icon("export", weight);
    }

    public static Icon eye() {
        return eye(PhosphorWeight.REGULAR);
    }

    public static Icon eye(PhosphorWeight weight) {
        return icon("eye", weight);
    }

    public static Icon eyeClosed() {
        return eyeClosed(PhosphorWeight.REGULAR);
    }

    public static Icon eyeClosed(PhosphorWeight weight) {
        return icon("eye-closed", weight);
    }

    public static Icon eyeSlash() {
        return eyeSlash(PhosphorWeight.REGULAR);
    }

    public static Icon eyeSlash(PhosphorWeight weight) {
        return icon("eye-slash", weight);
    }

    public static Icon eyedropper() {
        return eyedropper(PhosphorWeight.REGULAR);
    }

    public static Icon eyedropper(PhosphorWeight weight) {
        return icon("eyedropper", weight);
    }

    public static Icon eyedropperSample() {
        return eyedropperSample(PhosphorWeight.REGULAR);
    }

    public static Icon eyedropperSample(PhosphorWeight weight) {
        return icon("eyedropper-sample", weight);
    }

    public static Icon eyeglasses() {
        return eyeglasses(PhosphorWeight.REGULAR);
    }

    public static Icon eyeglasses(PhosphorWeight weight) {
        return icon("eyeglasses", weight);
    }

    public static Icon eyes() {
        return eyes(PhosphorWeight.REGULAR);
    }

    public static Icon eyes(PhosphorWeight weight) {
        return icon("eyes", weight);
    }

    public static Icon faceMask() {
        return faceMask(PhosphorWeight.REGULAR);
    }

    public static Icon faceMask(PhosphorWeight weight) {
        return icon("face-mask", weight);
    }

    public static Icon facebookLogo() {
        return facebookLogo(PhosphorWeight.REGULAR);
    }

    public static Icon facebookLogo(PhosphorWeight weight) {
        return icon("facebook-logo", weight);
    }

    public static Icon factory() {
        return factory(PhosphorWeight.REGULAR);
    }

    public static Icon factory(PhosphorWeight weight) {
        return icon("factory", weight);
    }

    public static Icon faders() {
        return faders(PhosphorWeight.REGULAR);
    }

    public static Icon faders(PhosphorWeight weight) {
        return icon("faders", weight);
    }

    public static Icon fadersHorizontal() {
        return fadersHorizontal(PhosphorWeight.REGULAR);
    }

    public static Icon fadersHorizontal(PhosphorWeight weight) {
        return icon("faders-horizontal", weight);
    }

    public static Icon falloutShelter() {
        return falloutShelter(PhosphorWeight.REGULAR);
    }

    public static Icon falloutShelter(PhosphorWeight weight) {
        return icon("fallout-shelter", weight);
    }

    public static Icon fan() {
        return fan(PhosphorWeight.REGULAR);
    }

    public static Icon fan(PhosphorWeight weight) {
        return icon("fan", weight);
    }

    public static Icon farm() {
        return farm(PhosphorWeight.REGULAR);
    }

    public static Icon farm(PhosphorWeight weight) {
        return icon("farm", weight);
    }

    public static Icon fastForward() {
        return fastForward(PhosphorWeight.REGULAR);
    }

    public static Icon fastForward(PhosphorWeight weight) {
        return icon("fast-forward", weight);
    }

    public static Icon fastForwardCircle() {
        return fastForwardCircle(PhosphorWeight.REGULAR);
    }

    public static Icon fastForwardCircle(PhosphorWeight weight) {
        return icon("fast-forward-circle", weight);
    }

    public static Icon feather() {
        return feather(PhosphorWeight.REGULAR);
    }

    public static Icon feather(PhosphorWeight weight) {
        return icon("feather", weight);
    }

    public static Icon fediverseLogo() {
        return fediverseLogo(PhosphorWeight.REGULAR);
    }

    public static Icon fediverseLogo(PhosphorWeight weight) {
        return icon("fediverse-logo", weight);
    }

    public static Icon figmaLogo() {
        return figmaLogo(PhosphorWeight.REGULAR);
    }

    public static Icon figmaLogo(PhosphorWeight weight) {
        return icon("figma-logo", weight);
    }

    public static Icon file() {
        return file(PhosphorWeight.REGULAR);
    }

    public static Icon file(PhosphorWeight weight) {
        return icon("file", weight);
    }

    public static Icon fileArchive() {
        return fileArchive(PhosphorWeight.REGULAR);
    }

    public static Icon fileArchive(PhosphorWeight weight) {
        return icon("file-archive", weight);
    }

    public static Icon fileArrowDown() {
        return fileArrowDown(PhosphorWeight.REGULAR);
    }

    public static Icon fileArrowDown(PhosphorWeight weight) {
        return icon("file-arrow-down", weight);
    }

    public static Icon fileArrowUp() {
        return fileArrowUp(PhosphorWeight.REGULAR);
    }

    public static Icon fileArrowUp(PhosphorWeight weight) {
        return icon("file-arrow-up", weight);
    }

    public static Icon fileAudio() {
        return fileAudio(PhosphorWeight.REGULAR);
    }

    public static Icon fileAudio(PhosphorWeight weight) {
        return icon("file-audio", weight);
    }

    public static Icon fileC() {
        return fileC(PhosphorWeight.REGULAR);
    }

    public static Icon fileC(PhosphorWeight weight) {
        return icon("file-c", weight);
    }

    public static Icon fileCSharp() {
        return fileCSharp(PhosphorWeight.REGULAR);
    }

    public static Icon fileCSharp(PhosphorWeight weight) {
        return icon("file-c-sharp", weight);
    }

    public static Icon fileCloud() {
        return fileCloud(PhosphorWeight.REGULAR);
    }

    public static Icon fileCloud(PhosphorWeight weight) {
        return icon("file-cloud", weight);
    }

    public static Icon fileCode() {
        return fileCode(PhosphorWeight.REGULAR);
    }

    public static Icon fileCode(PhosphorWeight weight) {
        return icon("file-code", weight);
    }

    public static Icon fileCpp() {
        return fileCpp(PhosphorWeight.REGULAR);
    }

    public static Icon fileCpp(PhosphorWeight weight) {
        return icon("file-cpp", weight);
    }

    public static Icon fileCss() {
        return fileCss(PhosphorWeight.REGULAR);
    }

    public static Icon fileCss(PhosphorWeight weight) {
        return icon("file-css", weight);
    }

    public static Icon fileCsv() {
        return fileCsv(PhosphorWeight.REGULAR);
    }

    public static Icon fileCsv(PhosphorWeight weight) {
        return icon("file-csv", weight);
    }

    public static Icon fileDashed() {
        return fileDashed(PhosphorWeight.REGULAR);
    }

    public static Icon fileDashed(PhosphorWeight weight) {
        return icon("file-dashed", weight);
    }

    public static Icon fileDoc() {
        return fileDoc(PhosphorWeight.REGULAR);
    }

    public static Icon fileDoc(PhosphorWeight weight) {
        return icon("file-doc", weight);
    }

    public static Icon fileHtml() {
        return fileHtml(PhosphorWeight.REGULAR);
    }

    public static Icon fileHtml(PhosphorWeight weight) {
        return icon("file-html", weight);
    }

    public static Icon fileImage() {
        return fileImage(PhosphorWeight.REGULAR);
    }

    public static Icon fileImage(PhosphorWeight weight) {
        return icon("file-image", weight);
    }

    public static Icon fileIni() {
        return fileIni(PhosphorWeight.REGULAR);
    }

    public static Icon fileIni(PhosphorWeight weight) {
        return icon("file-ini", weight);
    }

    public static Icon fileJpg() {
        return fileJpg(PhosphorWeight.REGULAR);
    }

    public static Icon fileJpg(PhosphorWeight weight) {
        return icon("file-jpg", weight);
    }

    public static Icon fileJs() {
        return fileJs(PhosphorWeight.REGULAR);
    }

    public static Icon fileJs(PhosphorWeight weight) {
        return icon("file-js", weight);
    }

    public static Icon fileJsx() {
        return fileJsx(PhosphorWeight.REGULAR);
    }

    public static Icon fileJsx(PhosphorWeight weight) {
        return icon("file-jsx", weight);
    }

    public static Icon fileLock() {
        return fileLock(PhosphorWeight.REGULAR);
    }

    public static Icon fileLock(PhosphorWeight weight) {
        return icon("file-lock", weight);
    }

    public static Icon fileMagnifyingGlass() {
        return fileMagnifyingGlass(PhosphorWeight.REGULAR);
    }

    public static Icon fileMagnifyingGlass(PhosphorWeight weight) {
        return icon("file-magnifying-glass", weight);
    }

    public static Icon fileMd() {
        return fileMd(PhosphorWeight.REGULAR);
    }

    public static Icon fileMd(PhosphorWeight weight) {
        return icon("file-md", weight);
    }

    public static Icon fileMinus() {
        return fileMinus(PhosphorWeight.REGULAR);
    }

    public static Icon fileMinus(PhosphorWeight weight) {
        return icon("file-minus", weight);
    }

    public static Icon filePdf() {
        return filePdf(PhosphorWeight.REGULAR);
    }

    public static Icon filePdf(PhosphorWeight weight) {
        return icon("file-pdf", weight);
    }

    public static Icon filePlus() {
        return filePlus(PhosphorWeight.REGULAR);
    }

    public static Icon filePlus(PhosphorWeight weight) {
        return icon("file-plus", weight);
    }

    public static Icon filePng() {
        return filePng(PhosphorWeight.REGULAR);
    }

    public static Icon filePng(PhosphorWeight weight) {
        return icon("file-png", weight);
    }

    public static Icon filePpt() {
        return filePpt(PhosphorWeight.REGULAR);
    }

    public static Icon filePpt(PhosphorWeight weight) {
        return icon("file-ppt", weight);
    }

    public static Icon filePy() {
        return filePy(PhosphorWeight.REGULAR);
    }

    public static Icon filePy(PhosphorWeight weight) {
        return icon("file-py", weight);
    }

    public static Icon fileRs() {
        return fileRs(PhosphorWeight.REGULAR);
    }

    public static Icon fileRs(PhosphorWeight weight) {
        return icon("file-rs", weight);
    }

    public static Icon fileSql() {
        return fileSql(PhosphorWeight.REGULAR);
    }

    public static Icon fileSql(PhosphorWeight weight) {
        return icon("file-sql", weight);
    }

    public static Icon fileSvg() {
        return fileSvg(PhosphorWeight.REGULAR);
    }

    public static Icon fileSvg(PhosphorWeight weight) {
        return icon("file-svg", weight);
    }

    public static Icon fileText() {
        return fileText(PhosphorWeight.REGULAR);
    }

    public static Icon fileText(PhosphorWeight weight) {
        return icon("file-text", weight);
    }

    public static Icon fileTs() {
        return fileTs(PhosphorWeight.REGULAR);
    }

    public static Icon fileTs(PhosphorWeight weight) {
        return icon("file-ts", weight);
    }

    public static Icon fileTsx() {
        return fileTsx(PhosphorWeight.REGULAR);
    }

    public static Icon fileTsx(PhosphorWeight weight) {
        return icon("file-tsx", weight);
    }

    public static Icon fileTxt() {
        return fileTxt(PhosphorWeight.REGULAR);
    }

    public static Icon fileTxt(PhosphorWeight weight) {
        return icon("file-txt", weight);
    }

    public static Icon fileVideo() {
        return fileVideo(PhosphorWeight.REGULAR);
    }

    public static Icon fileVideo(PhosphorWeight weight) {
        return icon("file-video", weight);
    }

    public static Icon fileVue() {
        return fileVue(PhosphorWeight.REGULAR);
    }

    public static Icon fileVue(PhosphorWeight weight) {
        return icon("file-vue", weight);
    }

    public static Icon fileX() {
        return fileX(PhosphorWeight.REGULAR);
    }

    public static Icon fileX(PhosphorWeight weight) {
        return icon("file-x", weight);
    }

    public static Icon fileXls() {
        return fileXls(PhosphorWeight.REGULAR);
    }

    public static Icon fileXls(PhosphorWeight weight) {
        return icon("file-xls", weight);
    }

    public static Icon fileZip() {
        return fileZip(PhosphorWeight.REGULAR);
    }

    public static Icon fileZip(PhosphorWeight weight) {
        return icon("file-zip", weight);
    }

    public static Icon files() {
        return files(PhosphorWeight.REGULAR);
    }

    public static Icon files(PhosphorWeight weight) {
        return icon("files", weight);
    }

    public static Icon filmReel() {
        return filmReel(PhosphorWeight.REGULAR);
    }

    public static Icon filmReel(PhosphorWeight weight) {
        return icon("film-reel", weight);
    }

    public static Icon filmScript() {
        return filmScript(PhosphorWeight.REGULAR);
    }

    public static Icon filmScript(PhosphorWeight weight) {
        return icon("film-script", weight);
    }

    public static Icon filmSlate() {
        return filmSlate(PhosphorWeight.REGULAR);
    }

    public static Icon filmSlate(PhosphorWeight weight) {
        return icon("film-slate", weight);
    }

    public static Icon filmStrip() {
        return filmStrip(PhosphorWeight.REGULAR);
    }

    public static Icon filmStrip(PhosphorWeight weight) {
        return icon("film-strip", weight);
    }

    public static Icon fingerprint() {
        return fingerprint(PhosphorWeight.REGULAR);
    }

    public static Icon fingerprint(PhosphorWeight weight) {
        return icon("fingerprint", weight);
    }

    public static Icon fingerprintSimple() {
        return fingerprintSimple(PhosphorWeight.REGULAR);
    }

    public static Icon fingerprintSimple(PhosphorWeight weight) {
        return icon("fingerprint-simple", weight);
    }

    public static Icon finnTheHuman() {
        return finnTheHuman(PhosphorWeight.REGULAR);
    }

    public static Icon finnTheHuman(PhosphorWeight weight) {
        return icon("finn-the-human", weight);
    }

    public static Icon fire() {
        return fire(PhosphorWeight.REGULAR);
    }

    public static Icon fire(PhosphorWeight weight) {
        return icon("fire", weight);
    }

    public static Icon fireExtinguisher() {
        return fireExtinguisher(PhosphorWeight.REGULAR);
    }

    public static Icon fireExtinguisher(PhosphorWeight weight) {
        return icon("fire-extinguisher", weight);
    }

    public static Icon fireSimple() {
        return fireSimple(PhosphorWeight.REGULAR);
    }

    public static Icon fireSimple(PhosphorWeight weight) {
        return icon("fire-simple", weight);
    }

    public static Icon fireTruck() {
        return fireTruck(PhosphorWeight.REGULAR);
    }

    public static Icon fireTruck(PhosphorWeight weight) {
        return icon("fire-truck", weight);
    }

    public static Icon firstAid() {
        return firstAid(PhosphorWeight.REGULAR);
    }

    public static Icon firstAid(PhosphorWeight weight) {
        return icon("first-aid", weight);
    }

    public static Icon firstAidKit() {
        return firstAidKit(PhosphorWeight.REGULAR);
    }

    public static Icon firstAidKit(PhosphorWeight weight) {
        return icon("first-aid-kit", weight);
    }

    public static Icon fish() {
        return fish(PhosphorWeight.REGULAR);
    }

    public static Icon fish(PhosphorWeight weight) {
        return icon("fish", weight);
    }

    public static Icon fishSimple() {
        return fishSimple(PhosphorWeight.REGULAR);
    }

    public static Icon fishSimple(PhosphorWeight weight) {
        return icon("fish-simple", weight);
    }

    public static Icon flag() {
        return flag(PhosphorWeight.REGULAR);
    }

    public static Icon flag(PhosphorWeight weight) {
        return icon("flag", weight);
    }

    public static Icon flagBanner() {
        return flagBanner(PhosphorWeight.REGULAR);
    }

    public static Icon flagBanner(PhosphorWeight weight) {
        return icon("flag-banner", weight);
    }

    public static Icon flagBannerFold() {
        return flagBannerFold(PhosphorWeight.REGULAR);
    }

    public static Icon flagBannerFold(PhosphorWeight weight) {
        return icon("flag-banner-fold", weight);
    }

    public static Icon flagCheckered() {
        return flagCheckered(PhosphorWeight.REGULAR);
    }

    public static Icon flagCheckered(PhosphorWeight weight) {
        return icon("flag-checkered", weight);
    }

    public static Icon flagPennant() {
        return flagPennant(PhosphorWeight.REGULAR);
    }

    public static Icon flagPennant(PhosphorWeight weight) {
        return icon("flag-pennant", weight);
    }

    public static Icon flame() {
        return flame(PhosphorWeight.REGULAR);
    }

    public static Icon flame(PhosphorWeight weight) {
        return icon("flame", weight);
    }

    public static Icon flashlight() {
        return flashlight(PhosphorWeight.REGULAR);
    }

    public static Icon flashlight(PhosphorWeight weight) {
        return icon("flashlight", weight);
    }

    public static Icon flask() {
        return flask(PhosphorWeight.REGULAR);
    }

    public static Icon flask(PhosphorWeight weight) {
        return icon("flask", weight);
    }

    public static Icon flipHorizontal() {
        return flipHorizontal(PhosphorWeight.REGULAR);
    }

    public static Icon flipHorizontal(PhosphorWeight weight) {
        return icon("flip-horizontal", weight);
    }

    public static Icon flipVertical() {
        return flipVertical(PhosphorWeight.REGULAR);
    }

    public static Icon flipVertical(PhosphorWeight weight) {
        return icon("flip-vertical", weight);
    }

    public static Icon floppyDisk() {
        return floppyDisk(PhosphorWeight.REGULAR);
    }

    public static Icon floppyDisk(PhosphorWeight weight) {
        return icon("floppy-disk", weight);
    }

    public static Icon floppyDiskBack() {
        return floppyDiskBack(PhosphorWeight.REGULAR);
    }

    public static Icon floppyDiskBack(PhosphorWeight weight) {
        return icon("floppy-disk-back", weight);
    }

    public static Icon flowArrow() {
        return flowArrow(PhosphorWeight.REGULAR);
    }

    public static Icon flowArrow(PhosphorWeight weight) {
        return icon("flow-arrow", weight);
    }

    public static Icon flower() {
        return flower(PhosphorWeight.REGULAR);
    }

    public static Icon flower(PhosphorWeight weight) {
        return icon("flower", weight);
    }

    public static Icon flowerLotus() {
        return flowerLotus(PhosphorWeight.REGULAR);
    }

    public static Icon flowerLotus(PhosphorWeight weight) {
        return icon("flower-lotus", weight);
    }

    public static Icon flowerTulip() {
        return flowerTulip(PhosphorWeight.REGULAR);
    }

    public static Icon flowerTulip(PhosphorWeight weight) {
        return icon("flower-tulip", weight);
    }

    public static Icon flyingSaucer() {
        return flyingSaucer(PhosphorWeight.REGULAR);
    }

    public static Icon flyingSaucer(PhosphorWeight weight) {
        return icon("flying-saucer", weight);
    }

    public static Icon folder() {
        return folder(PhosphorWeight.REGULAR);
    }

    public static Icon folder(PhosphorWeight weight) {
        return icon("folder", weight);
    }

    public static Icon folderDashed() {
        return folderDashed(PhosphorWeight.REGULAR);
    }

    public static Icon folderDashed(PhosphorWeight weight) {
        return icon("folder-dashed", weight);
    }

    public static Icon folderLock() {
        return folderLock(PhosphorWeight.REGULAR);
    }

    public static Icon folderLock(PhosphorWeight weight) {
        return icon("folder-lock", weight);
    }

    public static Icon folderMinus() {
        return folderMinus(PhosphorWeight.REGULAR);
    }

    public static Icon folderMinus(PhosphorWeight weight) {
        return icon("folder-minus", weight);
    }

    public static Icon folderOpen() {
        return folderOpen(PhosphorWeight.REGULAR);
    }

    public static Icon folderOpen(PhosphorWeight weight) {
        return icon("folder-open", weight);
    }

    public static Icon folderPlus() {
        return folderPlus(PhosphorWeight.REGULAR);
    }

    public static Icon folderPlus(PhosphorWeight weight) {
        return icon("folder-plus", weight);
    }

    public static Icon folderSimple() {
        return folderSimple(PhosphorWeight.REGULAR);
    }

    public static Icon folderSimple(PhosphorWeight weight) {
        return icon("folder-simple", weight);
    }

    public static Icon folderSimpleDashed() {
        return folderSimpleDashed(PhosphorWeight.REGULAR);
    }

    public static Icon folderSimpleDashed(PhosphorWeight weight) {
        return icon("folder-simple-dashed", weight);
    }

    public static Icon folderSimpleLock() {
        return folderSimpleLock(PhosphorWeight.REGULAR);
    }

    public static Icon folderSimpleLock(PhosphorWeight weight) {
        return icon("folder-simple-lock", weight);
    }

    public static Icon folderSimpleMinus() {
        return folderSimpleMinus(PhosphorWeight.REGULAR);
    }

    public static Icon folderSimpleMinus(PhosphorWeight weight) {
        return icon("folder-simple-minus", weight);
    }

    public static Icon folderSimplePlus() {
        return folderSimplePlus(PhosphorWeight.REGULAR);
    }

    public static Icon folderSimplePlus(PhosphorWeight weight) {
        return icon("folder-simple-plus", weight);
    }

    public static Icon folderSimpleStar() {
        return folderSimpleStar(PhosphorWeight.REGULAR);
    }

    public static Icon folderSimpleStar(PhosphorWeight weight) {
        return icon("folder-simple-star", weight);
    }

    public static Icon folderSimpleUser() {
        return folderSimpleUser(PhosphorWeight.REGULAR);
    }

    public static Icon folderSimpleUser(PhosphorWeight weight) {
        return icon("folder-simple-user", weight);
    }

    public static Icon folderStar() {
        return folderStar(PhosphorWeight.REGULAR);
    }

    public static Icon folderStar(PhosphorWeight weight) {
        return icon("folder-star", weight);
    }

    public static Icon folderUser() {
        return folderUser(PhosphorWeight.REGULAR);
    }

    public static Icon folderUser(PhosphorWeight weight) {
        return icon("folder-user", weight);
    }

    public static Icon folders() {
        return folders(PhosphorWeight.REGULAR);
    }

    public static Icon folders(PhosphorWeight weight) {
        return icon("folders", weight);
    }

    public static Icon football() {
        return football(PhosphorWeight.REGULAR);
    }

    public static Icon football(PhosphorWeight weight) {
        return icon("football", weight);
    }

    public static Icon footballHelmet() {
        return footballHelmet(PhosphorWeight.REGULAR);
    }

    public static Icon footballHelmet(PhosphorWeight weight) {
        return icon("football-helmet", weight);
    }

    public static Icon footprints() {
        return footprints(PhosphorWeight.REGULAR);
    }

    public static Icon footprints(PhosphorWeight weight) {
        return icon("footprints", weight);
    }

    public static Icon forkKnife() {
        return forkKnife(PhosphorWeight.REGULAR);
    }

    public static Icon forkKnife(PhosphorWeight weight) {
        return icon("fork-knife", weight);
    }

    public static Icon fourK() {
        return fourK(PhosphorWeight.REGULAR);
    }

    public static Icon fourK(PhosphorWeight weight) {
        return icon("four-k", weight);
    }

    public static Icon frameCorners() {
        return frameCorners(PhosphorWeight.REGULAR);
    }

    public static Icon frameCorners(PhosphorWeight weight) {
        return icon("frame-corners", weight);
    }

    public static Icon framerLogo() {
        return framerLogo(PhosphorWeight.REGULAR);
    }

    public static Icon framerLogo(PhosphorWeight weight) {
        return icon("framer-logo", weight);
    }

    public static Icon function() {
        return function(PhosphorWeight.REGULAR);
    }

    public static Icon function(PhosphorWeight weight) {
        return icon("function", weight);
    }

    public static Icon funnel() {
        return funnel(PhosphorWeight.REGULAR);
    }

    public static Icon funnel(PhosphorWeight weight) {
        return icon("funnel", weight);
    }

    public static Icon funnelSimple() {
        return funnelSimple(PhosphorWeight.REGULAR);
    }

    public static Icon funnelSimple(PhosphorWeight weight) {
        return icon("funnel-simple", weight);
    }

    public static Icon funnelSimpleX() {
        return funnelSimpleX(PhosphorWeight.REGULAR);
    }

    public static Icon funnelSimpleX(PhosphorWeight weight) {
        return icon("funnel-simple-x", weight);
    }

    public static Icon funnelX() {
        return funnelX(PhosphorWeight.REGULAR);
    }

    public static Icon funnelX(PhosphorWeight weight) {
        return icon("funnel-x", weight);
    }

    public static Icon gameController() {
        return gameController(PhosphorWeight.REGULAR);
    }

    public static Icon gameController(PhosphorWeight weight) {
        return icon("game-controller", weight);
    }

    public static Icon garage() {
        return garage(PhosphorWeight.REGULAR);
    }

    public static Icon garage(PhosphorWeight weight) {
        return icon("garage", weight);
    }

    public static Icon gasCan() {
        return gasCan(PhosphorWeight.REGULAR);
    }

    public static Icon gasCan(PhosphorWeight weight) {
        return icon("gas-can", weight);
    }

    public static Icon gasPump() {
        return gasPump(PhosphorWeight.REGULAR);
    }

    public static Icon gasPump(PhosphorWeight weight) {
        return icon("gas-pump", weight);
    }

    public static Icon gauge() {
        return gauge(PhosphorWeight.REGULAR);
    }

    public static Icon gauge(PhosphorWeight weight) {
        return icon("gauge", weight);
    }

    public static Icon gavel() {
        return gavel(PhosphorWeight.REGULAR);
    }

    public static Icon gavel(PhosphorWeight weight) {
        return icon("gavel", weight);
    }

    public static Icon gear() {
        return gear(PhosphorWeight.REGULAR);
    }

    public static Icon gear(PhosphorWeight weight) {
        return icon("gear", weight);
    }

    public static Icon gearFine() {
        return gearFine(PhosphorWeight.REGULAR);
    }

    public static Icon gearFine(PhosphorWeight weight) {
        return icon("gear-fine", weight);
    }

    public static Icon gearSix() {
        return gearSix(PhosphorWeight.REGULAR);
    }

    public static Icon gearSix(PhosphorWeight weight) {
        return icon("gear-six", weight);
    }

    public static Icon genderFemale() {
        return genderFemale(PhosphorWeight.REGULAR);
    }

    public static Icon genderFemale(PhosphorWeight weight) {
        return icon("gender-female", weight);
    }

    public static Icon genderIntersex() {
        return genderIntersex(PhosphorWeight.REGULAR);
    }

    public static Icon genderIntersex(PhosphorWeight weight) {
        return icon("gender-intersex", weight);
    }

    public static Icon genderMale() {
        return genderMale(PhosphorWeight.REGULAR);
    }

    public static Icon genderMale(PhosphorWeight weight) {
        return icon("gender-male", weight);
    }

    public static Icon genderNeuter() {
        return genderNeuter(PhosphorWeight.REGULAR);
    }

    public static Icon genderNeuter(PhosphorWeight weight) {
        return icon("gender-neuter", weight);
    }

    public static Icon genderNonbinary() {
        return genderNonbinary(PhosphorWeight.REGULAR);
    }

    public static Icon genderNonbinary(PhosphorWeight weight) {
        return icon("gender-nonbinary", weight);
    }

    public static Icon genderTransgender() {
        return genderTransgender(PhosphorWeight.REGULAR);
    }

    public static Icon genderTransgender(PhosphorWeight weight) {
        return icon("gender-transgender", weight);
    }

    public static Icon ghost() {
        return ghost(PhosphorWeight.REGULAR);
    }

    public static Icon ghost(PhosphorWeight weight) {
        return icon("ghost", weight);
    }

    public static Icon gif() {
        return gif(PhosphorWeight.REGULAR);
    }

    public static Icon gif(PhosphorWeight weight) {
        return icon("gif", weight);
    }

    public static Icon gift() {
        return gift(PhosphorWeight.REGULAR);
    }

    public static Icon gift(PhosphorWeight weight) {
        return icon("gift", weight);
    }

    public static Icon gitBranch() {
        return gitBranch(PhosphorWeight.REGULAR);
    }

    public static Icon gitBranch(PhosphorWeight weight) {
        return icon("git-branch", weight);
    }

    public static Icon gitCommit() {
        return gitCommit(PhosphorWeight.REGULAR);
    }

    public static Icon gitCommit(PhosphorWeight weight) {
        return icon("git-commit", weight);
    }

    public static Icon gitDiff() {
        return gitDiff(PhosphorWeight.REGULAR);
    }

    public static Icon gitDiff(PhosphorWeight weight) {
        return icon("git-diff", weight);
    }

    public static Icon gitFork() {
        return gitFork(PhosphorWeight.REGULAR);
    }

    public static Icon gitFork(PhosphorWeight weight) {
        return icon("git-fork", weight);
    }

    public static Icon gitMerge() {
        return gitMerge(PhosphorWeight.REGULAR);
    }

    public static Icon gitMerge(PhosphorWeight weight) {
        return icon("git-merge", weight);
    }

    public static Icon gitPullRequest() {
        return gitPullRequest(PhosphorWeight.REGULAR);
    }

    public static Icon gitPullRequest(PhosphorWeight weight) {
        return icon("git-pull-request", weight);
    }

    public static Icon githubLogo() {
        return githubLogo(PhosphorWeight.REGULAR);
    }

    public static Icon githubLogo(PhosphorWeight weight) {
        return icon("github-logo", weight);
    }

    public static Icon gitlabLogo() {
        return gitlabLogo(PhosphorWeight.REGULAR);
    }

    public static Icon gitlabLogo(PhosphorWeight weight) {
        return icon("gitlab-logo", weight);
    }

    public static Icon gitlabLogoSimple() {
        return gitlabLogoSimple(PhosphorWeight.REGULAR);
    }

    public static Icon gitlabLogoSimple(PhosphorWeight weight) {
        return icon("gitlab-logo-simple", weight);
    }

    public static Icon globe() {
        return globe(PhosphorWeight.REGULAR);
    }

    public static Icon globe(PhosphorWeight weight) {
        return icon("globe", weight);
    }

    public static Icon globeHemisphereEast() {
        return globeHemisphereEast(PhosphorWeight.REGULAR);
    }

    public static Icon globeHemisphereEast(PhosphorWeight weight) {
        return icon("globe-hemisphere-east", weight);
    }

    public static Icon globeHemisphereWest() {
        return globeHemisphereWest(PhosphorWeight.REGULAR);
    }

    public static Icon globeHemisphereWest(PhosphorWeight weight) {
        return icon("globe-hemisphere-west", weight);
    }

    public static Icon globeSimple() {
        return globeSimple(PhosphorWeight.REGULAR);
    }

    public static Icon globeSimple(PhosphorWeight weight) {
        return icon("globe-simple", weight);
    }

    public static Icon globeSimpleX() {
        return globeSimpleX(PhosphorWeight.REGULAR);
    }

    public static Icon globeSimpleX(PhosphorWeight weight) {
        return icon("globe-simple-x", weight);
    }

    public static Icon globeStand() {
        return globeStand(PhosphorWeight.REGULAR);
    }

    public static Icon globeStand(PhosphorWeight weight) {
        return icon("globe-stand", weight);
    }

    public static Icon globeX() {
        return globeX(PhosphorWeight.REGULAR);
    }

    public static Icon globeX(PhosphorWeight weight) {
        return icon("globe-x", weight);
    }

    public static Icon goggles() {
        return goggles(PhosphorWeight.REGULAR);
    }

    public static Icon goggles(PhosphorWeight weight) {
        return icon("goggles", weight);
    }

    public static Icon golf() {
        return golf(PhosphorWeight.REGULAR);
    }

    public static Icon golf(PhosphorWeight weight) {
        return icon("golf", weight);
    }

    public static Icon goodreadsLogo() {
        return goodreadsLogo(PhosphorWeight.REGULAR);
    }

    public static Icon goodreadsLogo(PhosphorWeight weight) {
        return icon("goodreads-logo", weight);
    }

    public static Icon googleCardboardLogo() {
        return googleCardboardLogo(PhosphorWeight.REGULAR);
    }

    public static Icon googleCardboardLogo(PhosphorWeight weight) {
        return icon("google-cardboard-logo", weight);
    }

    public static Icon googleChromeLogo() {
        return googleChromeLogo(PhosphorWeight.REGULAR);
    }

    public static Icon googleChromeLogo(PhosphorWeight weight) {
        return icon("google-chrome-logo", weight);
    }

    public static Icon googleDriveLogo() {
        return googleDriveLogo(PhosphorWeight.REGULAR);
    }

    public static Icon googleDriveLogo(PhosphorWeight weight) {
        return icon("google-drive-logo", weight);
    }

    public static Icon googleLogo() {
        return googleLogo(PhosphorWeight.REGULAR);
    }

    public static Icon googleLogo(PhosphorWeight weight) {
        return icon("google-logo", weight);
    }

    public static Icon googlePhotosLogo() {
        return googlePhotosLogo(PhosphorWeight.REGULAR);
    }

    public static Icon googlePhotosLogo(PhosphorWeight weight) {
        return icon("google-photos-logo", weight);
    }

    public static Icon googlePlayLogo() {
        return googlePlayLogo(PhosphorWeight.REGULAR);
    }

    public static Icon googlePlayLogo(PhosphorWeight weight) {
        return icon("google-play-logo", weight);
    }

    public static Icon googlePodcastsLogo() {
        return googlePodcastsLogo(PhosphorWeight.REGULAR);
    }

    public static Icon googlePodcastsLogo(PhosphorWeight weight) {
        return icon("google-podcasts-logo", weight);
    }

    public static Icon gps() {
        return gps(PhosphorWeight.REGULAR);
    }

    public static Icon gps(PhosphorWeight weight) {
        return icon("gps", weight);
    }

    public static Icon gpsFix() {
        return gpsFix(PhosphorWeight.REGULAR);
    }

    public static Icon gpsFix(PhosphorWeight weight) {
        return icon("gps-fix", weight);
    }

    public static Icon gpsSlash() {
        return gpsSlash(PhosphorWeight.REGULAR);
    }

    public static Icon gpsSlash(PhosphorWeight weight) {
        return icon("gps-slash", weight);
    }

    public static Icon gradient() {
        return gradient(PhosphorWeight.REGULAR);
    }

    public static Icon gradient(PhosphorWeight weight) {
        return icon("gradient", weight);
    }

    public static Icon graduationCap() {
        return graduationCap(PhosphorWeight.REGULAR);
    }

    public static Icon graduationCap(PhosphorWeight weight) {
        return icon("graduation-cap", weight);
    }

    public static Icon grains() {
        return grains(PhosphorWeight.REGULAR);
    }

    public static Icon grains(PhosphorWeight weight) {
        return icon("grains", weight);
    }

    public static Icon grainsSlash() {
        return grainsSlash(PhosphorWeight.REGULAR);
    }

    public static Icon grainsSlash(PhosphorWeight weight) {
        return icon("grains-slash", weight);
    }

    public static Icon graph() {
        return graph(PhosphorWeight.REGULAR);
    }

    public static Icon graph(PhosphorWeight weight) {
        return icon("graph", weight);
    }

    public static Icon graphicsCard() {
        return graphicsCard(PhosphorWeight.REGULAR);
    }

    public static Icon graphicsCard(PhosphorWeight weight) {
        return icon("graphics-card", weight);
    }

    public static Icon greaterThan() {
        return greaterThan(PhosphorWeight.REGULAR);
    }

    public static Icon greaterThan(PhosphorWeight weight) {
        return icon("greater-than", weight);
    }

    public static Icon greaterThanOrEqual() {
        return greaterThanOrEqual(PhosphorWeight.REGULAR);
    }

    public static Icon greaterThanOrEqual(PhosphorWeight weight) {
        return icon("greater-than-or-equal", weight);
    }

    public static Icon gridFour() {
        return gridFour(PhosphorWeight.REGULAR);
    }

    public static Icon gridFour(PhosphorWeight weight) {
        return icon("grid-four", weight);
    }

    public static Icon gridNine() {
        return gridNine(PhosphorWeight.REGULAR);
    }

    public static Icon gridNine(PhosphorWeight weight) {
        return icon("grid-nine", weight);
    }

    public static Icon guitar() {
        return guitar(PhosphorWeight.REGULAR);
    }

    public static Icon guitar(PhosphorWeight weight) {
        return icon("guitar", weight);
    }

    public static Icon hairDryer() {
        return hairDryer(PhosphorWeight.REGULAR);
    }

    public static Icon hairDryer(PhosphorWeight weight) {
        return icon("hair-dryer", weight);
    }

    public static Icon hamburger() {
        return hamburger(PhosphorWeight.REGULAR);
    }

    public static Icon hamburger(PhosphorWeight weight) {
        return icon("hamburger", weight);
    }

    public static Icon hammer() {
        return hammer(PhosphorWeight.REGULAR);
    }

    public static Icon hammer(PhosphorWeight weight) {
        return icon("hammer", weight);
    }

    public static Icon hand() {
        return hand(PhosphorWeight.REGULAR);
    }

    public static Icon hand(PhosphorWeight weight) {
        return icon("hand", weight);
    }

    public static Icon handArrowDown() {
        return handArrowDown(PhosphorWeight.REGULAR);
    }

    public static Icon handArrowDown(PhosphorWeight weight) {
        return icon("hand-arrow-down", weight);
    }

    public static Icon handArrowUp() {
        return handArrowUp(PhosphorWeight.REGULAR);
    }

    public static Icon handArrowUp(PhosphorWeight weight) {
        return icon("hand-arrow-up", weight);
    }

    public static Icon handCoins() {
        return handCoins(PhosphorWeight.REGULAR);
    }

    public static Icon handCoins(PhosphorWeight weight) {
        return icon("hand-coins", weight);
    }

    public static Icon handDeposit() {
        return handDeposit(PhosphorWeight.REGULAR);
    }

    public static Icon handDeposit(PhosphorWeight weight) {
        return icon("hand-deposit", weight);
    }

    public static Icon handEye() {
        return handEye(PhosphorWeight.REGULAR);
    }

    public static Icon handEye(PhosphorWeight weight) {
        return icon("hand-eye", weight);
    }

    public static Icon handFist() {
        return handFist(PhosphorWeight.REGULAR);
    }

    public static Icon handFist(PhosphorWeight weight) {
        return icon("hand-fist", weight);
    }

    public static Icon handGrabbing() {
        return handGrabbing(PhosphorWeight.REGULAR);
    }

    public static Icon handGrabbing(PhosphorWeight weight) {
        return icon("hand-grabbing", weight);
    }

    public static Icon handHeart() {
        return handHeart(PhosphorWeight.REGULAR);
    }

    public static Icon handHeart(PhosphorWeight weight) {
        return icon("hand-heart", weight);
    }

    public static Icon handPalm() {
        return handPalm(PhosphorWeight.REGULAR);
    }

    public static Icon handPalm(PhosphorWeight weight) {
        return icon("hand-palm", weight);
    }

    public static Icon handPeace() {
        return handPeace(PhosphorWeight.REGULAR);
    }

    public static Icon handPeace(PhosphorWeight weight) {
        return icon("hand-peace", weight);
    }

    public static Icon handPointing() {
        return handPointing(PhosphorWeight.REGULAR);
    }

    public static Icon handPointing(PhosphorWeight weight) {
        return icon("hand-pointing", weight);
    }

    public static Icon handSoap() {
        return handSoap(PhosphorWeight.REGULAR);
    }

    public static Icon handSoap(PhosphorWeight weight) {
        return icon("hand-soap", weight);
    }

    public static Icon handSwipeLeft() {
        return handSwipeLeft(PhosphorWeight.REGULAR);
    }

    public static Icon handSwipeLeft(PhosphorWeight weight) {
        return icon("hand-swipe-left", weight);
    }

    public static Icon handSwipeRight() {
        return handSwipeRight(PhosphorWeight.REGULAR);
    }

    public static Icon handSwipeRight(PhosphorWeight weight) {
        return icon("hand-swipe-right", weight);
    }

    public static Icon handTap() {
        return handTap(PhosphorWeight.REGULAR);
    }

    public static Icon handTap(PhosphorWeight weight) {
        return icon("hand-tap", weight);
    }

    public static Icon handWaving() {
        return handWaving(PhosphorWeight.REGULAR);
    }

    public static Icon handWaving(PhosphorWeight weight) {
        return icon("hand-waving", weight);
    }

    public static Icon handWithdraw() {
        return handWithdraw(PhosphorWeight.REGULAR);
    }

    public static Icon handWithdraw(PhosphorWeight weight) {
        return icon("hand-withdraw", weight);
    }

    public static Icon handbag() {
        return handbag(PhosphorWeight.REGULAR);
    }

    public static Icon handbag(PhosphorWeight weight) {
        return icon("handbag", weight);
    }

    public static Icon handbagSimple() {
        return handbagSimple(PhosphorWeight.REGULAR);
    }

    public static Icon handbagSimple(PhosphorWeight weight) {
        return icon("handbag-simple", weight);
    }

    public static Icon handsClapping() {
        return handsClapping(PhosphorWeight.REGULAR);
    }

    public static Icon handsClapping(PhosphorWeight weight) {
        return icon("hands-clapping", weight);
    }

    public static Icon handsPraying() {
        return handsPraying(PhosphorWeight.REGULAR);
    }

    public static Icon handsPraying(PhosphorWeight weight) {
        return icon("hands-praying", weight);
    }

    public static Icon handshake() {
        return handshake(PhosphorWeight.REGULAR);
    }

    public static Icon handshake(PhosphorWeight weight) {
        return icon("handshake", weight);
    }

    public static Icon hardDrive() {
        return hardDrive(PhosphorWeight.REGULAR);
    }

    public static Icon hardDrive(PhosphorWeight weight) {
        return icon("hard-drive", weight);
    }

    public static Icon hardDrives() {
        return hardDrives(PhosphorWeight.REGULAR);
    }

    public static Icon hardDrives(PhosphorWeight weight) {
        return icon("hard-drives", weight);
    }

    public static Icon hardHat() {
        return hardHat(PhosphorWeight.REGULAR);
    }

    public static Icon hardHat(PhosphorWeight weight) {
        return icon("hard-hat", weight);
    }

    public static Icon hash() {
        return hash(PhosphorWeight.REGULAR);
    }

    public static Icon hash(PhosphorWeight weight) {
        return icon("hash", weight);
    }

    public static Icon hashStraight() {
        return hashStraight(PhosphorWeight.REGULAR);
    }

    public static Icon hashStraight(PhosphorWeight weight) {
        return icon("hash-straight", weight);
    }

    public static Icon headCircuit() {
        return headCircuit(PhosphorWeight.REGULAR);
    }

    public static Icon headCircuit(PhosphorWeight weight) {
        return icon("head-circuit", weight);
    }

    public static Icon headlights() {
        return headlights(PhosphorWeight.REGULAR);
    }

    public static Icon headlights(PhosphorWeight weight) {
        return icon("headlights", weight);
    }

    public static Icon headphones() {
        return headphones(PhosphorWeight.REGULAR);
    }

    public static Icon headphones(PhosphorWeight weight) {
        return icon("headphones", weight);
    }

    public static Icon headset() {
        return headset(PhosphorWeight.REGULAR);
    }

    public static Icon headset(PhosphorWeight weight) {
        return icon("headset", weight);
    }

    public static Icon heart() {
        return heart(PhosphorWeight.REGULAR);
    }

    public static Icon heart(PhosphorWeight weight) {
        return icon("heart", weight);
    }

    public static Icon heartBreak() {
        return heartBreak(PhosphorWeight.REGULAR);
    }

    public static Icon heartBreak(PhosphorWeight weight) {
        return icon("heart-break", weight);
    }

    public static Icon heartHalf() {
        return heartHalf(PhosphorWeight.REGULAR);
    }

    public static Icon heartHalf(PhosphorWeight weight) {
        return icon("heart-half", weight);
    }

    public static Icon heartStraight() {
        return heartStraight(PhosphorWeight.REGULAR);
    }

    public static Icon heartStraight(PhosphorWeight weight) {
        return icon("heart-straight", weight);
    }

    public static Icon heartStraightBreak() {
        return heartStraightBreak(PhosphorWeight.REGULAR);
    }

    public static Icon heartStraightBreak(PhosphorWeight weight) {
        return icon("heart-straight-break", weight);
    }

    public static Icon heartbeat() {
        return heartbeat(PhosphorWeight.REGULAR);
    }

    public static Icon heartbeat(PhosphorWeight weight) {
        return icon("heartbeat", weight);
    }

    public static Icon hexagon() {
        return hexagon(PhosphorWeight.REGULAR);
    }

    public static Icon hexagon(PhosphorWeight weight) {
        return icon("hexagon", weight);
    }

    public static Icon highDefinition() {
        return highDefinition(PhosphorWeight.REGULAR);
    }

    public static Icon highDefinition(PhosphorWeight weight) {
        return icon("high-definition", weight);
    }

    public static Icon highHeel() {
        return highHeel(PhosphorWeight.REGULAR);
    }

    public static Icon highHeel(PhosphorWeight weight) {
        return icon("high-heel", weight);
    }

    public static Icon highlighter() {
        return highlighter(PhosphorWeight.REGULAR);
    }

    public static Icon highlighter(PhosphorWeight weight) {
        return icon("highlighter", weight);
    }

    public static Icon highlighterCircle() {
        return highlighterCircle(PhosphorWeight.REGULAR);
    }

    public static Icon highlighterCircle(PhosphorWeight weight) {
        return icon("highlighter-circle", weight);
    }

    public static Icon hockey() {
        return hockey(PhosphorWeight.REGULAR);
    }

    public static Icon hockey(PhosphorWeight weight) {
        return icon("hockey", weight);
    }

    public static Icon hoodie() {
        return hoodie(PhosphorWeight.REGULAR);
    }

    public static Icon hoodie(PhosphorWeight weight) {
        return icon("hoodie", weight);
    }

    public static Icon horse() {
        return horse(PhosphorWeight.REGULAR);
    }

    public static Icon horse(PhosphorWeight weight) {
        return icon("horse", weight);
    }

    public static Icon hospital() {
        return hospital(PhosphorWeight.REGULAR);
    }

    public static Icon hospital(PhosphorWeight weight) {
        return icon("hospital", weight);
    }

    public static Icon hourglass() {
        return hourglass(PhosphorWeight.REGULAR);
    }

    public static Icon hourglass(PhosphorWeight weight) {
        return icon("hourglass", weight);
    }

    public static Icon hourglassHigh() {
        return hourglassHigh(PhosphorWeight.REGULAR);
    }

    public static Icon hourglassHigh(PhosphorWeight weight) {
        return icon("hourglass-high", weight);
    }

    public static Icon hourglassLow() {
        return hourglassLow(PhosphorWeight.REGULAR);
    }

    public static Icon hourglassLow(PhosphorWeight weight) {
        return icon("hourglass-low", weight);
    }

    public static Icon hourglassMedium() {
        return hourglassMedium(PhosphorWeight.REGULAR);
    }

    public static Icon hourglassMedium(PhosphorWeight weight) {
        return icon("hourglass-medium", weight);
    }

    public static Icon hourglassSimple() {
        return hourglassSimple(PhosphorWeight.REGULAR);
    }

    public static Icon hourglassSimple(PhosphorWeight weight) {
        return icon("hourglass-simple", weight);
    }

    public static Icon hourglassSimpleHigh() {
        return hourglassSimpleHigh(PhosphorWeight.REGULAR);
    }

    public static Icon hourglassSimpleHigh(PhosphorWeight weight) {
        return icon("hourglass-simple-high", weight);
    }

    public static Icon hourglassSimpleLow() {
        return hourglassSimpleLow(PhosphorWeight.REGULAR);
    }

    public static Icon hourglassSimpleLow(PhosphorWeight weight) {
        return icon("hourglass-simple-low", weight);
    }

    public static Icon hourglassSimpleMedium() {
        return hourglassSimpleMedium(PhosphorWeight.REGULAR);
    }

    public static Icon hourglassSimpleMedium(PhosphorWeight weight) {
        return icon("hourglass-simple-medium", weight);
    }

    public static Icon house() {
        return house(PhosphorWeight.REGULAR);
    }

    public static Icon house(PhosphorWeight weight) {
        return icon("house", weight);
    }

    public static Icon houseLine() {
        return houseLine(PhosphorWeight.REGULAR);
    }

    public static Icon houseLine(PhosphorWeight weight) {
        return icon("house-line", weight);
    }

    public static Icon houseSimple() {
        return houseSimple(PhosphorWeight.REGULAR);
    }

    public static Icon houseSimple(PhosphorWeight weight) {
        return icon("house-simple", weight);
    }

    public static Icon hurricane() {
        return hurricane(PhosphorWeight.REGULAR);
    }

    public static Icon hurricane(PhosphorWeight weight) {
        return icon("hurricane", weight);
    }

    public static Icon iceCream() {
        return iceCream(PhosphorWeight.REGULAR);
    }

    public static Icon iceCream(PhosphorWeight weight) {
        return icon("ice-cream", weight);
    }

    public static Icon identificationBadge() {
        return identificationBadge(PhosphorWeight.REGULAR);
    }

    public static Icon identificationBadge(PhosphorWeight weight) {
        return icon("identification-badge", weight);
    }

    public static Icon identificationCard() {
        return identificationCard(PhosphorWeight.REGULAR);
    }

    public static Icon identificationCard(PhosphorWeight weight) {
        return icon("identification-card", weight);
    }

    public static Icon image() {
        return image(PhosphorWeight.REGULAR);
    }

    public static Icon image(PhosphorWeight weight) {
        return icon("image", weight);
    }

    public static Icon imageBroken() {
        return imageBroken(PhosphorWeight.REGULAR);
    }

    public static Icon imageBroken(PhosphorWeight weight) {
        return icon("image-broken", weight);
    }

    public static Icon imageSquare() {
        return imageSquare(PhosphorWeight.REGULAR);
    }

    public static Icon imageSquare(PhosphorWeight weight) {
        return icon("image-square", weight);
    }

    public static Icon images() {
        return images(PhosphorWeight.REGULAR);
    }

    public static Icon images(PhosphorWeight weight) {
        return icon("images", weight);
    }

    public static Icon imagesSquare() {
        return imagesSquare(PhosphorWeight.REGULAR);
    }

    public static Icon imagesSquare(PhosphorWeight weight) {
        return icon("images-square", weight);
    }

    public static Icon infinity() {
        return infinity(PhosphorWeight.REGULAR);
    }

    public static Icon infinity(PhosphorWeight weight) {
        return icon("infinity", weight);
    }

    public static Icon info() {
        return info(PhosphorWeight.REGULAR);
    }

    public static Icon info(PhosphorWeight weight) {
        return icon("info", weight);
    }

    public static Icon instagramLogo() {
        return instagramLogo(PhosphorWeight.REGULAR);
    }

    public static Icon instagramLogo(PhosphorWeight weight) {
        return icon("instagram-logo", weight);
    }

    public static Icon intersect() {
        return intersect(PhosphorWeight.REGULAR);
    }

    public static Icon intersect(PhosphorWeight weight) {
        return icon("intersect", weight);
    }

    public static Icon intersectSquare() {
        return intersectSquare(PhosphorWeight.REGULAR);
    }

    public static Icon intersectSquare(PhosphorWeight weight) {
        return icon("intersect-square", weight);
    }

    public static Icon intersectThree() {
        return intersectThree(PhosphorWeight.REGULAR);
    }

    public static Icon intersectThree(PhosphorWeight weight) {
        return icon("intersect-three", weight);
    }

    public static Icon intersection() {
        return intersection(PhosphorWeight.REGULAR);
    }

    public static Icon intersection(PhosphorWeight weight) {
        return icon("intersection", weight);
    }

    public static Icon invoice() {
        return invoice(PhosphorWeight.REGULAR);
    }

    public static Icon invoice(PhosphorWeight weight) {
        return icon("invoice", weight);
    }

    public static Icon island() {
        return island(PhosphorWeight.REGULAR);
    }

    public static Icon island(PhosphorWeight weight) {
        return icon("island", weight);
    }

    public static Icon jar() {
        return jar(PhosphorWeight.REGULAR);
    }

    public static Icon jar(PhosphorWeight weight) {
        return icon("jar", weight);
    }

    public static Icon jarLabel() {
        return jarLabel(PhosphorWeight.REGULAR);
    }

    public static Icon jarLabel(PhosphorWeight weight) {
        return icon("jar-label", weight);
    }

    public static Icon jeep() {
        return jeep(PhosphorWeight.REGULAR);
    }

    public static Icon jeep(PhosphorWeight weight) {
        return icon("jeep", weight);
    }

    public static Icon joystick() {
        return joystick(PhosphorWeight.REGULAR);
    }

    public static Icon joystick(PhosphorWeight weight) {
        return icon("joystick", weight);
    }

    public static Icon kanban() {
        return kanban(PhosphorWeight.REGULAR);
    }

    public static Icon kanban(PhosphorWeight weight) {
        return icon("kanban", weight);
    }

    public static Icon key() {
        return key(PhosphorWeight.REGULAR);
    }

    public static Icon key(PhosphorWeight weight) {
        return icon("key", weight);
    }

    public static Icon keyReturn() {
        return keyReturn(PhosphorWeight.REGULAR);
    }

    public static Icon keyReturn(PhosphorWeight weight) {
        return icon("key-return", weight);
    }

    public static Icon keyboard() {
        return keyboard(PhosphorWeight.REGULAR);
    }

    public static Icon keyboard(PhosphorWeight weight) {
        return icon("keyboard", weight);
    }

    public static Icon keyhole() {
        return keyhole(PhosphorWeight.REGULAR);
    }

    public static Icon keyhole(PhosphorWeight weight) {
        return icon("keyhole", weight);
    }

    public static Icon knife() {
        return knife(PhosphorWeight.REGULAR);
    }

    public static Icon knife(PhosphorWeight weight) {
        return icon("knife", weight);
    }

    public static Icon ladder() {
        return ladder(PhosphorWeight.REGULAR);
    }

    public static Icon ladder(PhosphorWeight weight) {
        return icon("ladder", weight);
    }

    public static Icon ladderSimple() {
        return ladderSimple(PhosphorWeight.REGULAR);
    }

    public static Icon ladderSimple(PhosphorWeight weight) {
        return icon("ladder-simple", weight);
    }

    public static Icon lamp() {
        return lamp(PhosphorWeight.REGULAR);
    }

    public static Icon lamp(PhosphorWeight weight) {
        return icon("lamp", weight);
    }

    public static Icon lampPendant() {
        return lampPendant(PhosphorWeight.REGULAR);
    }

    public static Icon lampPendant(PhosphorWeight weight) {
        return icon("lamp-pendant", weight);
    }

    public static Icon laptop() {
        return laptop(PhosphorWeight.REGULAR);
    }

    public static Icon laptop(PhosphorWeight weight) {
        return icon("laptop", weight);
    }

    public static Icon lasso() {
        return lasso(PhosphorWeight.REGULAR);
    }

    public static Icon lasso(PhosphorWeight weight) {
        return icon("lasso", weight);
    }

    public static Icon lastfmLogo() {
        return lastfmLogo(PhosphorWeight.REGULAR);
    }

    public static Icon lastfmLogo(PhosphorWeight weight) {
        return icon("lastfm-logo", weight);
    }

    public static Icon layout() {
        return layout(PhosphorWeight.REGULAR);
    }

    public static Icon layout(PhosphorWeight weight) {
        return icon("layout", weight);
    }

    public static Icon leaf() {
        return leaf(PhosphorWeight.REGULAR);
    }

    public static Icon leaf(PhosphorWeight weight) {
        return icon("leaf", weight);
    }

    public static Icon lectern() {
        return lectern(PhosphorWeight.REGULAR);
    }

    public static Icon lectern(PhosphorWeight weight) {
        return icon("lectern", weight);
    }

    public static Icon lego() {
        return lego(PhosphorWeight.REGULAR);
    }

    public static Icon lego(PhosphorWeight weight) {
        return icon("lego", weight);
    }

    public static Icon legoSmiley() {
        return legoSmiley(PhosphorWeight.REGULAR);
    }

    public static Icon legoSmiley(PhosphorWeight weight) {
        return icon("lego-smiley", weight);
    }

    public static Icon lessThan() {
        return lessThan(PhosphorWeight.REGULAR);
    }

    public static Icon lessThan(PhosphorWeight weight) {
        return icon("less-than", weight);
    }

    public static Icon lessThanOrEqual() {
        return lessThanOrEqual(PhosphorWeight.REGULAR);
    }

    public static Icon lessThanOrEqual(PhosphorWeight weight) {
        return icon("less-than-or-equal", weight);
    }

    public static Icon letterCircleH() {
        return letterCircleH(PhosphorWeight.REGULAR);
    }

    public static Icon letterCircleH(PhosphorWeight weight) {
        return icon("letter-circle-h", weight);
    }

    public static Icon letterCircleP() {
        return letterCircleP(PhosphorWeight.REGULAR);
    }

    public static Icon letterCircleP(PhosphorWeight weight) {
        return icon("letter-circle-p", weight);
    }

    public static Icon letterCircleV() {
        return letterCircleV(PhosphorWeight.REGULAR);
    }

    public static Icon letterCircleV(PhosphorWeight weight) {
        return icon("letter-circle-v", weight);
    }

    public static Icon lifebuoy() {
        return lifebuoy(PhosphorWeight.REGULAR);
    }

    public static Icon lifebuoy(PhosphorWeight weight) {
        return icon("lifebuoy", weight);
    }

    public static Icon lightbulb() {
        return lightbulb(PhosphorWeight.REGULAR);
    }

    public static Icon lightbulb(PhosphorWeight weight) {
        return icon("lightbulb", weight);
    }

    public static Icon lightbulbFilament() {
        return lightbulbFilament(PhosphorWeight.REGULAR);
    }

    public static Icon lightbulbFilament(PhosphorWeight weight) {
        return icon("lightbulb-filament", weight);
    }

    public static Icon lighthouse() {
        return lighthouse(PhosphorWeight.REGULAR);
    }

    public static Icon lighthouse(PhosphorWeight weight) {
        return icon("lighthouse", weight);
    }

    public static Icon lightning() {
        return lightning(PhosphorWeight.REGULAR);
    }

    public static Icon lightning(PhosphorWeight weight) {
        return icon("lightning", weight);
    }

    public static Icon lightningA() {
        return lightningA(PhosphorWeight.REGULAR);
    }

    public static Icon lightningA(PhosphorWeight weight) {
        return icon("lightning-a", weight);
    }

    public static Icon lightningSlash() {
        return lightningSlash(PhosphorWeight.REGULAR);
    }

    public static Icon lightningSlash(PhosphorWeight weight) {
        return icon("lightning-slash", weight);
    }

    public static Icon lineSegment() {
        return lineSegment(PhosphorWeight.REGULAR);
    }

    public static Icon lineSegment(PhosphorWeight weight) {
        return icon("line-segment", weight);
    }

    public static Icon lineSegments() {
        return lineSegments(PhosphorWeight.REGULAR);
    }

    public static Icon lineSegments(PhosphorWeight weight) {
        return icon("line-segments", weight);
    }

    public static Icon lineVertical() {
        return lineVertical(PhosphorWeight.REGULAR);
    }

    public static Icon lineVertical(PhosphorWeight weight) {
        return icon("line-vertical", weight);
    }

    public static Icon link() {
        return link(PhosphorWeight.REGULAR);
    }

    public static Icon link(PhosphorWeight weight) {
        return icon("link", weight);
    }

    public static Icon linkBreak() {
        return linkBreak(PhosphorWeight.REGULAR);
    }

    public static Icon linkBreak(PhosphorWeight weight) {
        return icon("link-break", weight);
    }

    public static Icon linkSimple() {
        return linkSimple(PhosphorWeight.REGULAR);
    }

    public static Icon linkSimple(PhosphorWeight weight) {
        return icon("link-simple", weight);
    }

    public static Icon linkSimpleBreak() {
        return linkSimpleBreak(PhosphorWeight.REGULAR);
    }

    public static Icon linkSimpleBreak(PhosphorWeight weight) {
        return icon("link-simple-break", weight);
    }

    public static Icon linkSimpleHorizontal() {
        return linkSimpleHorizontal(PhosphorWeight.REGULAR);
    }

    public static Icon linkSimpleHorizontal(PhosphorWeight weight) {
        return icon("link-simple-horizontal", weight);
    }

    public static Icon linkSimpleHorizontalBreak() {
        return linkSimpleHorizontalBreak(PhosphorWeight.REGULAR);
    }

    public static Icon linkSimpleHorizontalBreak(PhosphorWeight weight) {
        return icon("link-simple-horizontal-break", weight);
    }

    public static Icon linkedinLogo() {
        return linkedinLogo(PhosphorWeight.REGULAR);
    }

    public static Icon linkedinLogo(PhosphorWeight weight) {
        return icon("linkedin-logo", weight);
    }

    public static Icon linktreeLogo() {
        return linktreeLogo(PhosphorWeight.REGULAR);
    }

    public static Icon linktreeLogo(PhosphorWeight weight) {
        return icon("linktree-logo", weight);
    }

    public static Icon linuxLogo() {
        return linuxLogo(PhosphorWeight.REGULAR);
    }

    public static Icon linuxLogo(PhosphorWeight weight) {
        return icon("linux-logo", weight);
    }

    public static Icon list() {
        return list(PhosphorWeight.REGULAR);
    }

    public static Icon list(PhosphorWeight weight) {
        return icon("list", weight);
    }

    public static Icon listBullets() {
        return listBullets(PhosphorWeight.REGULAR);
    }

    public static Icon listBullets(PhosphorWeight weight) {
        return icon("list-bullets", weight);
    }

    public static Icon listChecks() {
        return listChecks(PhosphorWeight.REGULAR);
    }

    public static Icon listChecks(PhosphorWeight weight) {
        return icon("list-checks", weight);
    }

    public static Icon listDashes() {
        return listDashes(PhosphorWeight.REGULAR);
    }

    public static Icon listDashes(PhosphorWeight weight) {
        return icon("list-dashes", weight);
    }

    public static Icon listHeart() {
        return listHeart(PhosphorWeight.REGULAR);
    }

    public static Icon listHeart(PhosphorWeight weight) {
        return icon("list-heart", weight);
    }

    public static Icon listMagnifyingGlass() {
        return listMagnifyingGlass(PhosphorWeight.REGULAR);
    }

    public static Icon listMagnifyingGlass(PhosphorWeight weight) {
        return icon("list-magnifying-glass", weight);
    }

    public static Icon listNumbers() {
        return listNumbers(PhosphorWeight.REGULAR);
    }

    public static Icon listNumbers(PhosphorWeight weight) {
        return icon("list-numbers", weight);
    }

    public static Icon listPlus() {
        return listPlus(PhosphorWeight.REGULAR);
    }

    public static Icon listPlus(PhosphorWeight weight) {
        return icon("list-plus", weight);
    }

    public static Icon listStar() {
        return listStar(PhosphorWeight.REGULAR);
    }

    public static Icon listStar(PhosphorWeight weight) {
        return icon("list-star", weight);
    }

    public static Icon lock() {
        return lock(PhosphorWeight.REGULAR);
    }

    public static Icon lock(PhosphorWeight weight) {
        return icon("lock", weight);
    }

    public static Icon lockKey() {
        return lockKey(PhosphorWeight.REGULAR);
    }

    public static Icon lockKey(PhosphorWeight weight) {
        return icon("lock-key", weight);
    }

    public static Icon lockKeyOpen() {
        return lockKeyOpen(PhosphorWeight.REGULAR);
    }

    public static Icon lockKeyOpen(PhosphorWeight weight) {
        return icon("lock-key-open", weight);
    }

    public static Icon lockLaminated() {
        return lockLaminated(PhosphorWeight.REGULAR);
    }

    public static Icon lockLaminated(PhosphorWeight weight) {
        return icon("lock-laminated", weight);
    }

    public static Icon lockLaminatedOpen() {
        return lockLaminatedOpen(PhosphorWeight.REGULAR);
    }

    public static Icon lockLaminatedOpen(PhosphorWeight weight) {
        return icon("lock-laminated-open", weight);
    }

    public static Icon lockOpen() {
        return lockOpen(PhosphorWeight.REGULAR);
    }

    public static Icon lockOpen(PhosphorWeight weight) {
        return icon("lock-open", weight);
    }

    public static Icon lockSimple() {
        return lockSimple(PhosphorWeight.REGULAR);
    }

    public static Icon lockSimple(PhosphorWeight weight) {
        return icon("lock-simple", weight);
    }

    public static Icon lockSimpleOpen() {
        return lockSimpleOpen(PhosphorWeight.REGULAR);
    }

    public static Icon lockSimpleOpen(PhosphorWeight weight) {
        return icon("lock-simple-open", weight);
    }

    public static Icon lockers() {
        return lockers(PhosphorWeight.REGULAR);
    }

    public static Icon lockers(PhosphorWeight weight) {
        return icon("lockers", weight);
    }

    public static Icon log() {
        return log(PhosphorWeight.REGULAR);
    }

    public static Icon log(PhosphorWeight weight) {
        return icon("log", weight);
    }

    public static Icon magicWand() {
        return magicWand(PhosphorWeight.REGULAR);
    }

    public static Icon magicWand(PhosphorWeight weight) {
        return icon("magic-wand", weight);
    }

    public static Icon magnet() {
        return magnet(PhosphorWeight.REGULAR);
    }

    public static Icon magnet(PhosphorWeight weight) {
        return icon("magnet", weight);
    }

    public static Icon magnetStraight() {
        return magnetStraight(PhosphorWeight.REGULAR);
    }

    public static Icon magnetStraight(PhosphorWeight weight) {
        return icon("magnet-straight", weight);
    }

    public static Icon magnifyingGlass() {
        return magnifyingGlass(PhosphorWeight.REGULAR);
    }

    public static Icon magnifyingGlass(PhosphorWeight weight) {
        return icon("magnifying-glass", weight);
    }

    public static Icon magnifyingGlassMinus() {
        return magnifyingGlassMinus(PhosphorWeight.REGULAR);
    }

    public static Icon magnifyingGlassMinus(PhosphorWeight weight) {
        return icon("magnifying-glass-minus", weight);
    }

    public static Icon magnifyingGlassPlus() {
        return magnifyingGlassPlus(PhosphorWeight.REGULAR);
    }

    public static Icon magnifyingGlassPlus(PhosphorWeight weight) {
        return icon("magnifying-glass-plus", weight);
    }

    public static Icon mailbox() {
        return mailbox(PhosphorWeight.REGULAR);
    }

    public static Icon mailbox(PhosphorWeight weight) {
        return icon("mailbox", weight);
    }

    public static Icon mapPin() {
        return mapPin(PhosphorWeight.REGULAR);
    }

    public static Icon mapPin(PhosphorWeight weight) {
        return icon("map-pin", weight);
    }

    public static Icon mapPinArea() {
        return mapPinArea(PhosphorWeight.REGULAR);
    }

    public static Icon mapPinArea(PhosphorWeight weight) {
        return icon("map-pin-area", weight);
    }

    public static Icon mapPinLine() {
        return mapPinLine(PhosphorWeight.REGULAR);
    }

    public static Icon mapPinLine(PhosphorWeight weight) {
        return icon("map-pin-line", weight);
    }

    public static Icon mapPinPlus() {
        return mapPinPlus(PhosphorWeight.REGULAR);
    }

    public static Icon mapPinPlus(PhosphorWeight weight) {
        return icon("map-pin-plus", weight);
    }

    public static Icon mapPinSimple() {
        return mapPinSimple(PhosphorWeight.REGULAR);
    }

    public static Icon mapPinSimple(PhosphorWeight weight) {
        return icon("map-pin-simple", weight);
    }

    public static Icon mapPinSimpleArea() {
        return mapPinSimpleArea(PhosphorWeight.REGULAR);
    }

    public static Icon mapPinSimpleArea(PhosphorWeight weight) {
        return icon("map-pin-simple-area", weight);
    }

    public static Icon mapPinSimpleLine() {
        return mapPinSimpleLine(PhosphorWeight.REGULAR);
    }

    public static Icon mapPinSimpleLine(PhosphorWeight weight) {
        return icon("map-pin-simple-line", weight);
    }

    public static Icon mapTrifold() {
        return mapTrifold(PhosphorWeight.REGULAR);
    }

    public static Icon mapTrifold(PhosphorWeight weight) {
        return icon("map-trifold", weight);
    }

    public static Icon markdownLogo() {
        return markdownLogo(PhosphorWeight.REGULAR);
    }

    public static Icon markdownLogo(PhosphorWeight weight) {
        return icon("markdown-logo", weight);
    }

    public static Icon markerCircle() {
        return markerCircle(PhosphorWeight.REGULAR);
    }

    public static Icon markerCircle(PhosphorWeight weight) {
        return icon("marker-circle", weight);
    }

    public static Icon martini() {
        return martini(PhosphorWeight.REGULAR);
    }

    public static Icon martini(PhosphorWeight weight) {
        return icon("martini", weight);
    }

    public static Icon maskHappy() {
        return maskHappy(PhosphorWeight.REGULAR);
    }

    public static Icon maskHappy(PhosphorWeight weight) {
        return icon("mask-happy", weight);
    }

    public static Icon maskSad() {
        return maskSad(PhosphorWeight.REGULAR);
    }

    public static Icon maskSad(PhosphorWeight weight) {
        return icon("mask-sad", weight);
    }

    public static Icon mastodonLogo() {
        return mastodonLogo(PhosphorWeight.REGULAR);
    }

    public static Icon mastodonLogo(PhosphorWeight weight) {
        return icon("mastodon-logo", weight);
    }

    public static Icon mathOperations() {
        return mathOperations(PhosphorWeight.REGULAR);
    }

    public static Icon mathOperations(PhosphorWeight weight) {
        return icon("math-operations", weight);
    }

    public static Icon matrixLogo() {
        return matrixLogo(PhosphorWeight.REGULAR);
    }

    public static Icon matrixLogo(PhosphorWeight weight) {
        return icon("matrix-logo", weight);
    }

    public static Icon medal() {
        return medal(PhosphorWeight.REGULAR);
    }

    public static Icon medal(PhosphorWeight weight) {
        return icon("medal", weight);
    }

    public static Icon medalMilitary() {
        return medalMilitary(PhosphorWeight.REGULAR);
    }

    public static Icon medalMilitary(PhosphorWeight weight) {
        return icon("medal-military", weight);
    }

    public static Icon mediumLogo() {
        return mediumLogo(PhosphorWeight.REGULAR);
    }

    public static Icon mediumLogo(PhosphorWeight weight) {
        return icon("medium-logo", weight);
    }

    public static Icon megaphone() {
        return megaphone(PhosphorWeight.REGULAR);
    }

    public static Icon megaphone(PhosphorWeight weight) {
        return icon("megaphone", weight);
    }

    public static Icon megaphoneSimple() {
        return megaphoneSimple(PhosphorWeight.REGULAR);
    }

    public static Icon megaphoneSimple(PhosphorWeight weight) {
        return icon("megaphone-simple", weight);
    }

    public static Icon memberOf() {
        return memberOf(PhosphorWeight.REGULAR);
    }

    public static Icon memberOf(PhosphorWeight weight) {
        return icon("member-of", weight);
    }

    public static Icon memory() {
        return memory(PhosphorWeight.REGULAR);
    }

    public static Icon memory(PhosphorWeight weight) {
        return icon("memory", weight);
    }

    public static Icon messengerLogo() {
        return messengerLogo(PhosphorWeight.REGULAR);
    }

    public static Icon messengerLogo(PhosphorWeight weight) {
        return icon("messenger-logo", weight);
    }

    public static Icon metaLogo() {
        return metaLogo(PhosphorWeight.REGULAR);
    }

    public static Icon metaLogo(PhosphorWeight weight) {
        return icon("meta-logo", weight);
    }

    public static Icon meteor() {
        return meteor(PhosphorWeight.REGULAR);
    }

    public static Icon meteor(PhosphorWeight weight) {
        return icon("meteor", weight);
    }

    public static Icon metronome() {
        return metronome(PhosphorWeight.REGULAR);
    }

    public static Icon metronome(PhosphorWeight weight) {
        return icon("metronome", weight);
    }

    public static Icon microphone() {
        return microphone(PhosphorWeight.REGULAR);
    }

    public static Icon microphone(PhosphorWeight weight) {
        return icon("microphone", weight);
    }

    public static Icon microphoneSlash() {
        return microphoneSlash(PhosphorWeight.REGULAR);
    }

    public static Icon microphoneSlash(PhosphorWeight weight) {
        return icon("microphone-slash", weight);
    }

    public static Icon microphoneStage() {
        return microphoneStage(PhosphorWeight.REGULAR);
    }

    public static Icon microphoneStage(PhosphorWeight weight) {
        return icon("microphone-stage", weight);
    }

    public static Icon microscope() {
        return microscope(PhosphorWeight.REGULAR);
    }

    public static Icon microscope(PhosphorWeight weight) {
        return icon("microscope", weight);
    }

    public static Icon microsoftExcelLogo() {
        return microsoftExcelLogo(PhosphorWeight.REGULAR);
    }

    public static Icon microsoftExcelLogo(PhosphorWeight weight) {
        return icon("microsoft-excel-logo", weight);
    }

    public static Icon microsoftOutlookLogo() {
        return microsoftOutlookLogo(PhosphorWeight.REGULAR);
    }

    public static Icon microsoftOutlookLogo(PhosphorWeight weight) {
        return icon("microsoft-outlook-logo", weight);
    }

    public static Icon microsoftPowerpointLogo() {
        return microsoftPowerpointLogo(PhosphorWeight.REGULAR);
    }

    public static Icon microsoftPowerpointLogo(PhosphorWeight weight) {
        return icon("microsoft-powerpoint-logo", weight);
    }

    public static Icon microsoftTeamsLogo() {
        return microsoftTeamsLogo(PhosphorWeight.REGULAR);
    }

    public static Icon microsoftTeamsLogo(PhosphorWeight weight) {
        return icon("microsoft-teams-logo", weight);
    }

    public static Icon microsoftWordLogo() {
        return microsoftWordLogo(PhosphorWeight.REGULAR);
    }

    public static Icon microsoftWordLogo(PhosphorWeight weight) {
        return icon("microsoft-word-logo", weight);
    }

    public static Icon minus() {
        return minus(PhosphorWeight.REGULAR);
    }

    public static Icon minus(PhosphorWeight weight) {
        return icon("minus", weight);
    }

    public static Icon minusCircle() {
        return minusCircle(PhosphorWeight.REGULAR);
    }

    public static Icon minusCircle(PhosphorWeight weight) {
        return icon("minus-circle", weight);
    }

    public static Icon minusSquare() {
        return minusSquare(PhosphorWeight.REGULAR);
    }

    public static Icon minusSquare(PhosphorWeight weight) {
        return icon("minus-square", weight);
    }

    public static Icon money() {
        return money(PhosphorWeight.REGULAR);
    }

    public static Icon money(PhosphorWeight weight) {
        return icon("money", weight);
    }

    public static Icon moneyWavy() {
        return moneyWavy(PhosphorWeight.REGULAR);
    }

    public static Icon moneyWavy(PhosphorWeight weight) {
        return icon("money-wavy", weight);
    }

    public static Icon monitor() {
        return monitor(PhosphorWeight.REGULAR);
    }

    public static Icon monitor(PhosphorWeight weight) {
        return icon("monitor", weight);
    }

    public static Icon monitorArrowUp() {
        return monitorArrowUp(PhosphorWeight.REGULAR);
    }

    public static Icon monitorArrowUp(PhosphorWeight weight) {
        return icon("monitor-arrow-up", weight);
    }

    public static Icon monitorPlay() {
        return monitorPlay(PhosphorWeight.REGULAR);
    }

    public static Icon monitorPlay(PhosphorWeight weight) {
        return icon("monitor-play", weight);
    }

    public static Icon moon() {
        return moon(PhosphorWeight.REGULAR);
    }

    public static Icon moon(PhosphorWeight weight) {
        return icon("moon", weight);
    }

    public static Icon moonStars() {
        return moonStars(PhosphorWeight.REGULAR);
    }

    public static Icon moonStars(PhosphorWeight weight) {
        return icon("moon-stars", weight);
    }

    public static Icon moped() {
        return moped(PhosphorWeight.REGULAR);
    }

    public static Icon moped(PhosphorWeight weight) {
        return icon("moped", weight);
    }

    public static Icon mopedFront() {
        return mopedFront(PhosphorWeight.REGULAR);
    }

    public static Icon mopedFront(PhosphorWeight weight) {
        return icon("moped-front", weight);
    }

    public static Icon mosque() {
        return mosque(PhosphorWeight.REGULAR);
    }

    public static Icon mosque(PhosphorWeight weight) {
        return icon("mosque", weight);
    }

    public static Icon motorcycle() {
        return motorcycle(PhosphorWeight.REGULAR);
    }

    public static Icon motorcycle(PhosphorWeight weight) {
        return icon("motorcycle", weight);
    }

    public static Icon mountains() {
        return mountains(PhosphorWeight.REGULAR);
    }

    public static Icon mountains(PhosphorWeight weight) {
        return icon("mountains", weight);
    }

    public static Icon mouse() {
        return mouse(PhosphorWeight.REGULAR);
    }

    public static Icon mouse(PhosphorWeight weight) {
        return icon("mouse", weight);
    }

    public static Icon mouseLeftClick() {
        return mouseLeftClick(PhosphorWeight.REGULAR);
    }

    public static Icon mouseLeftClick(PhosphorWeight weight) {
        return icon("mouse-left-click", weight);
    }

    public static Icon mouseMiddleClick() {
        return mouseMiddleClick(PhosphorWeight.REGULAR);
    }

    public static Icon mouseMiddleClick(PhosphorWeight weight) {
        return icon("mouse-middle-click", weight);
    }

    public static Icon mouseRightClick() {
        return mouseRightClick(PhosphorWeight.REGULAR);
    }

    public static Icon mouseRightClick(PhosphorWeight weight) {
        return icon("mouse-right-click", weight);
    }

    public static Icon mouseScroll() {
        return mouseScroll(PhosphorWeight.REGULAR);
    }

    public static Icon mouseScroll(PhosphorWeight weight) {
        return icon("mouse-scroll", weight);
    }

    public static Icon mouseSimple() {
        return mouseSimple(PhosphorWeight.REGULAR);
    }

    public static Icon mouseSimple(PhosphorWeight weight) {
        return icon("mouse-simple", weight);
    }

    public static Icon musicNote() {
        return musicNote(PhosphorWeight.REGULAR);
    }

    public static Icon musicNote(PhosphorWeight weight) {
        return icon("music-note", weight);
    }

    public static Icon musicNoteSimple() {
        return musicNoteSimple(PhosphorWeight.REGULAR);
    }

    public static Icon musicNoteSimple(PhosphorWeight weight) {
        return icon("music-note-simple", weight);
    }

    public static Icon musicNotes() {
        return musicNotes(PhosphorWeight.REGULAR);
    }

    public static Icon musicNotes(PhosphorWeight weight) {
        return icon("music-notes", weight);
    }

    public static Icon musicNotesMinus() {
        return musicNotesMinus(PhosphorWeight.REGULAR);
    }

    public static Icon musicNotesMinus(PhosphorWeight weight) {
        return icon("music-notes-minus", weight);
    }

    public static Icon musicNotesPlus() {
        return musicNotesPlus(PhosphorWeight.REGULAR);
    }

    public static Icon musicNotesPlus(PhosphorWeight weight) {
        return icon("music-notes-plus", weight);
    }

    public static Icon musicNotesSimple() {
        return musicNotesSimple(PhosphorWeight.REGULAR);
    }

    public static Icon musicNotesSimple(PhosphorWeight weight) {
        return icon("music-notes-simple", weight);
    }

    public static Icon navigationArrow() {
        return navigationArrow(PhosphorWeight.REGULAR);
    }

    public static Icon navigationArrow(PhosphorWeight weight) {
        return icon("navigation-arrow", weight);
    }

    public static Icon needle() {
        return needle(PhosphorWeight.REGULAR);
    }

    public static Icon needle(PhosphorWeight weight) {
        return icon("needle", weight);
    }

    public static Icon network() {
        return network(PhosphorWeight.REGULAR);
    }

    public static Icon network(PhosphorWeight weight) {
        return icon("network", weight);
    }

    public static Icon networkSlash() {
        return networkSlash(PhosphorWeight.REGULAR);
    }

    public static Icon networkSlash(PhosphorWeight weight) {
        return icon("network-slash", weight);
    }

    public static Icon networkX() {
        return networkX(PhosphorWeight.REGULAR);
    }

    public static Icon networkX(PhosphorWeight weight) {
        return icon("network-x", weight);
    }

    public static Icon newspaper() {
        return newspaper(PhosphorWeight.REGULAR);
    }

    public static Icon newspaper(PhosphorWeight weight) {
        return icon("newspaper", weight);
    }

    public static Icon newspaperClipping() {
        return newspaperClipping(PhosphorWeight.REGULAR);
    }

    public static Icon newspaperClipping(PhosphorWeight weight) {
        return icon("newspaper-clipping", weight);
    }

    public static Icon notEquals() {
        return notEquals(PhosphorWeight.REGULAR);
    }

    public static Icon notEquals(PhosphorWeight weight) {
        return icon("not-equals", weight);
    }

    public static Icon notMemberOf() {
        return notMemberOf(PhosphorWeight.REGULAR);
    }

    public static Icon notMemberOf(PhosphorWeight weight) {
        return icon("not-member-of", weight);
    }

    public static Icon notSubsetOf() {
        return notSubsetOf(PhosphorWeight.REGULAR);
    }

    public static Icon notSubsetOf(PhosphorWeight weight) {
        return icon("not-subset-of", weight);
    }

    public static Icon notSupersetOf() {
        return notSupersetOf(PhosphorWeight.REGULAR);
    }

    public static Icon notSupersetOf(PhosphorWeight weight) {
        return icon("not-superset-of", weight);
    }

    public static Icon notches() {
        return notches(PhosphorWeight.REGULAR);
    }

    public static Icon notches(PhosphorWeight weight) {
        return icon("notches", weight);
    }

    public static Icon note() {
        return note(PhosphorWeight.REGULAR);
    }

    public static Icon note(PhosphorWeight weight) {
        return icon("note", weight);
    }

    public static Icon noteBlank() {
        return noteBlank(PhosphorWeight.REGULAR);
    }

    public static Icon noteBlank(PhosphorWeight weight) {
        return icon("note-blank", weight);
    }

    public static Icon notePencil() {
        return notePencil(PhosphorWeight.REGULAR);
    }

    public static Icon notePencil(PhosphorWeight weight) {
        return icon("note-pencil", weight);
    }

    public static Icon notebook() {
        return notebook(PhosphorWeight.REGULAR);
    }

    public static Icon notebook(PhosphorWeight weight) {
        return icon("notebook", weight);
    }

    public static Icon notepad() {
        return notepad(PhosphorWeight.REGULAR);
    }

    public static Icon notepad(PhosphorWeight weight) {
        return icon("notepad", weight);
    }

    public static Icon notification() {
        return notification(PhosphorWeight.REGULAR);
    }

    public static Icon notification(PhosphorWeight weight) {
        return icon("notification", weight);
    }

    public static Icon notionLogo() {
        return notionLogo(PhosphorWeight.REGULAR);
    }

    public static Icon notionLogo(PhosphorWeight weight) {
        return icon("notion-logo", weight);
    }

    public static Icon nuclearPlant() {
        return nuclearPlant(PhosphorWeight.REGULAR);
    }

    public static Icon nuclearPlant(PhosphorWeight weight) {
        return icon("nuclear-plant", weight);
    }

    public static Icon numberCircleEight() {
        return numberCircleEight(PhosphorWeight.REGULAR);
    }

    public static Icon numberCircleEight(PhosphorWeight weight) {
        return icon("number-circle-eight", weight);
    }

    public static Icon numberCircleFive() {
        return numberCircleFive(PhosphorWeight.REGULAR);
    }

    public static Icon numberCircleFive(PhosphorWeight weight) {
        return icon("number-circle-five", weight);
    }

    public static Icon numberCircleFour() {
        return numberCircleFour(PhosphorWeight.REGULAR);
    }

    public static Icon numberCircleFour(PhosphorWeight weight) {
        return icon("number-circle-four", weight);
    }

    public static Icon numberCircleNine() {
        return numberCircleNine(PhosphorWeight.REGULAR);
    }

    public static Icon numberCircleNine(PhosphorWeight weight) {
        return icon("number-circle-nine", weight);
    }

    public static Icon numberCircleOne() {
        return numberCircleOne(PhosphorWeight.REGULAR);
    }

    public static Icon numberCircleOne(PhosphorWeight weight) {
        return icon("number-circle-one", weight);
    }

    public static Icon numberCircleSeven() {
        return numberCircleSeven(PhosphorWeight.REGULAR);
    }

    public static Icon numberCircleSeven(PhosphorWeight weight) {
        return icon("number-circle-seven", weight);
    }

    public static Icon numberCircleSix() {
        return numberCircleSix(PhosphorWeight.REGULAR);
    }

    public static Icon numberCircleSix(PhosphorWeight weight) {
        return icon("number-circle-six", weight);
    }

    public static Icon numberCircleThree() {
        return numberCircleThree(PhosphorWeight.REGULAR);
    }

    public static Icon numberCircleThree(PhosphorWeight weight) {
        return icon("number-circle-three", weight);
    }

    public static Icon numberCircleTwo() {
        return numberCircleTwo(PhosphorWeight.REGULAR);
    }

    public static Icon numberCircleTwo(PhosphorWeight weight) {
        return icon("number-circle-two", weight);
    }

    public static Icon numberCircleZero() {
        return numberCircleZero(PhosphorWeight.REGULAR);
    }

    public static Icon numberCircleZero(PhosphorWeight weight) {
        return icon("number-circle-zero", weight);
    }

    public static Icon numberEight() {
        return numberEight(PhosphorWeight.REGULAR);
    }

    public static Icon numberEight(PhosphorWeight weight) {
        return icon("number-eight", weight);
    }

    public static Icon numberFive() {
        return numberFive(PhosphorWeight.REGULAR);
    }

    public static Icon numberFive(PhosphorWeight weight) {
        return icon("number-five", weight);
    }

    public static Icon numberFour() {
        return numberFour(PhosphorWeight.REGULAR);
    }

    public static Icon numberFour(PhosphorWeight weight) {
        return icon("number-four", weight);
    }

    public static Icon numberNine() {
        return numberNine(PhosphorWeight.REGULAR);
    }

    public static Icon numberNine(PhosphorWeight weight) {
        return icon("number-nine", weight);
    }

    public static Icon numberOne() {
        return numberOne(PhosphorWeight.REGULAR);
    }

    public static Icon numberOne(PhosphorWeight weight) {
        return icon("number-one", weight);
    }

    public static Icon numberSeven() {
        return numberSeven(PhosphorWeight.REGULAR);
    }

    public static Icon numberSeven(PhosphorWeight weight) {
        return icon("number-seven", weight);
    }

    public static Icon numberSix() {
        return numberSix(PhosphorWeight.REGULAR);
    }

    public static Icon numberSix(PhosphorWeight weight) {
        return icon("number-six", weight);
    }

    public static Icon numberSquareEight() {
        return numberSquareEight(PhosphorWeight.REGULAR);
    }

    public static Icon numberSquareEight(PhosphorWeight weight) {
        return icon("number-square-eight", weight);
    }

    public static Icon numberSquareFive() {
        return numberSquareFive(PhosphorWeight.REGULAR);
    }

    public static Icon numberSquareFive(PhosphorWeight weight) {
        return icon("number-square-five", weight);
    }

    public static Icon numberSquareFour() {
        return numberSquareFour(PhosphorWeight.REGULAR);
    }

    public static Icon numberSquareFour(PhosphorWeight weight) {
        return icon("number-square-four", weight);
    }

    public static Icon numberSquareNine() {
        return numberSquareNine(PhosphorWeight.REGULAR);
    }

    public static Icon numberSquareNine(PhosphorWeight weight) {
        return icon("number-square-nine", weight);
    }

    public static Icon numberSquareOne() {
        return numberSquareOne(PhosphorWeight.REGULAR);
    }

    public static Icon numberSquareOne(PhosphorWeight weight) {
        return icon("number-square-one", weight);
    }

    public static Icon numberSquareSeven() {
        return numberSquareSeven(PhosphorWeight.REGULAR);
    }

    public static Icon numberSquareSeven(PhosphorWeight weight) {
        return icon("number-square-seven", weight);
    }

    public static Icon numberSquareSix() {
        return numberSquareSix(PhosphorWeight.REGULAR);
    }

    public static Icon numberSquareSix(PhosphorWeight weight) {
        return icon("number-square-six", weight);
    }

    public static Icon numberSquareThree() {
        return numberSquareThree(PhosphorWeight.REGULAR);
    }

    public static Icon numberSquareThree(PhosphorWeight weight) {
        return icon("number-square-three", weight);
    }

    public static Icon numberSquareTwo() {
        return numberSquareTwo(PhosphorWeight.REGULAR);
    }

    public static Icon numberSquareTwo(PhosphorWeight weight) {
        return icon("number-square-two", weight);
    }

    public static Icon numberSquareZero() {
        return numberSquareZero(PhosphorWeight.REGULAR);
    }

    public static Icon numberSquareZero(PhosphorWeight weight) {
        return icon("number-square-zero", weight);
    }

    public static Icon numberThree() {
        return numberThree(PhosphorWeight.REGULAR);
    }

    public static Icon numberThree(PhosphorWeight weight) {
        return icon("number-three", weight);
    }

    public static Icon numberTwo() {
        return numberTwo(PhosphorWeight.REGULAR);
    }

    public static Icon numberTwo(PhosphorWeight weight) {
        return icon("number-two", weight);
    }

    public static Icon numberZero() {
        return numberZero(PhosphorWeight.REGULAR);
    }

    public static Icon numberZero(PhosphorWeight weight) {
        return icon("number-zero", weight);
    }

    public static Icon numpad() {
        return numpad(PhosphorWeight.REGULAR);
    }

    public static Icon numpad(PhosphorWeight weight) {
        return icon("numpad", weight);
    }

    public static Icon nut() {
        return nut(PhosphorWeight.REGULAR);
    }

    public static Icon nut(PhosphorWeight weight) {
        return icon("nut", weight);
    }

    public static Icon nyTimesLogo() {
        return nyTimesLogo(PhosphorWeight.REGULAR);
    }

    public static Icon nyTimesLogo(PhosphorWeight weight) {
        return icon("ny-times-logo", weight);
    }

    public static Icon octagon() {
        return octagon(PhosphorWeight.REGULAR);
    }

    public static Icon octagon(PhosphorWeight weight) {
        return icon("octagon", weight);
    }

    public static Icon officeChair() {
        return officeChair(PhosphorWeight.REGULAR);
    }

    public static Icon officeChair(PhosphorWeight weight) {
        return icon("office-chair", weight);
    }

    public static Icon onigiri() {
        return onigiri(PhosphorWeight.REGULAR);
    }

    public static Icon onigiri(PhosphorWeight weight) {
        return icon("onigiri", weight);
    }

    public static Icon openAiLogo() {
        return openAiLogo(PhosphorWeight.REGULAR);
    }

    public static Icon openAiLogo(PhosphorWeight weight) {
        return icon("open-ai-logo", weight);
    }

    public static Icon option() {
        return option(PhosphorWeight.REGULAR);
    }

    public static Icon option(PhosphorWeight weight) {
        return icon("option", weight);
    }

    public static Icon orange() {
        return orange(PhosphorWeight.REGULAR);
    }

    public static Icon orange(PhosphorWeight weight) {
        return icon("orange", weight);
    }

    public static Icon orangeSlice() {
        return orangeSlice(PhosphorWeight.REGULAR);
    }

    public static Icon orangeSlice(PhosphorWeight weight) {
        return icon("orange-slice", weight);
    }

    public static Icon oven() {
        return oven(PhosphorWeight.REGULAR);
    }

    public static Icon oven(PhosphorWeight weight) {
        return icon("oven", weight);
    }

    public static Icon packageIcon() {
        return packageIcon(PhosphorWeight.REGULAR);
    }

    public static Icon packageIcon(PhosphorWeight weight) {
        return icon("package", weight);
    }

    public static Icon paintBrush() {
        return paintBrush(PhosphorWeight.REGULAR);
    }

    public static Icon paintBrush(PhosphorWeight weight) {
        return icon("paint-brush", weight);
    }

    public static Icon paintBrushBroad() {
        return paintBrushBroad(PhosphorWeight.REGULAR);
    }

    public static Icon paintBrushBroad(PhosphorWeight weight) {
        return icon("paint-brush-broad", weight);
    }

    public static Icon paintBrushHousehold() {
        return paintBrushHousehold(PhosphorWeight.REGULAR);
    }

    public static Icon paintBrushHousehold(PhosphorWeight weight) {
        return icon("paint-brush-household", weight);
    }

    public static Icon paintBucket() {
        return paintBucket(PhosphorWeight.REGULAR);
    }

    public static Icon paintBucket(PhosphorWeight weight) {
        return icon("paint-bucket", weight);
    }

    public static Icon paintRoller() {
        return paintRoller(PhosphorWeight.REGULAR);
    }

    public static Icon paintRoller(PhosphorWeight weight) {
        return icon("paint-roller", weight);
    }

    public static Icon palette() {
        return palette(PhosphorWeight.REGULAR);
    }

    public static Icon palette(PhosphorWeight weight) {
        return icon("palette", weight);
    }

    public static Icon panorama() {
        return panorama(PhosphorWeight.REGULAR);
    }

    public static Icon panorama(PhosphorWeight weight) {
        return icon("panorama", weight);
    }

    public static Icon pants() {
        return pants(PhosphorWeight.REGULAR);
    }

    public static Icon pants(PhosphorWeight weight) {
        return icon("pants", weight);
    }

    public static Icon paperPlane() {
        return paperPlane(PhosphorWeight.REGULAR);
    }

    public static Icon paperPlane(PhosphorWeight weight) {
        return icon("paper-plane", weight);
    }

    public static Icon paperPlaneRight() {
        return paperPlaneRight(PhosphorWeight.REGULAR);
    }

    public static Icon paperPlaneRight(PhosphorWeight weight) {
        return icon("paper-plane-right", weight);
    }

    public static Icon paperPlaneTilt() {
        return paperPlaneTilt(PhosphorWeight.REGULAR);
    }

    public static Icon paperPlaneTilt(PhosphorWeight weight) {
        return icon("paper-plane-tilt", weight);
    }

    public static Icon paperclip() {
        return paperclip(PhosphorWeight.REGULAR);
    }

    public static Icon paperclip(PhosphorWeight weight) {
        return icon("paperclip", weight);
    }

    public static Icon paperclipHorizontal() {
        return paperclipHorizontal(PhosphorWeight.REGULAR);
    }

    public static Icon paperclipHorizontal(PhosphorWeight weight) {
        return icon("paperclip-horizontal", weight);
    }

    public static Icon parachute() {
        return parachute(PhosphorWeight.REGULAR);
    }

    public static Icon parachute(PhosphorWeight weight) {
        return icon("parachute", weight);
    }

    public static Icon paragraph() {
        return paragraph(PhosphorWeight.REGULAR);
    }

    public static Icon paragraph(PhosphorWeight weight) {
        return icon("paragraph", weight);
    }

    public static Icon parallelogram() {
        return parallelogram(PhosphorWeight.REGULAR);
    }

    public static Icon parallelogram(PhosphorWeight weight) {
        return icon("parallelogram", weight);
    }

    public static Icon park() {
        return park(PhosphorWeight.REGULAR);
    }

    public static Icon park(PhosphorWeight weight) {
        return icon("park", weight);
    }

    public static Icon password() {
        return password(PhosphorWeight.REGULAR);
    }

    public static Icon password(PhosphorWeight weight) {
        return icon("password", weight);
    }

    public static Icon path() {
        return path(PhosphorWeight.REGULAR);
    }

    public static Icon path(PhosphorWeight weight) {
        return icon("path", weight);
    }

    public static Icon patreonLogo() {
        return patreonLogo(PhosphorWeight.REGULAR);
    }

    public static Icon patreonLogo(PhosphorWeight weight) {
        return icon("patreon-logo", weight);
    }

    public static Icon pause() {
        return pause(PhosphorWeight.REGULAR);
    }

    public static Icon pause(PhosphorWeight weight) {
        return icon("pause", weight);
    }

    public static Icon pauseCircle() {
        return pauseCircle(PhosphorWeight.REGULAR);
    }

    public static Icon pauseCircle(PhosphorWeight weight) {
        return icon("pause-circle", weight);
    }

    public static Icon pawPrint() {
        return pawPrint(PhosphorWeight.REGULAR);
    }

    public static Icon pawPrint(PhosphorWeight weight) {
        return icon("paw-print", weight);
    }

    public static Icon paypalLogo() {
        return paypalLogo(PhosphorWeight.REGULAR);
    }

    public static Icon paypalLogo(PhosphorWeight weight) {
        return icon("paypal-logo", weight);
    }

    public static Icon peace() {
        return peace(PhosphorWeight.REGULAR);
    }

    public static Icon peace(PhosphorWeight weight) {
        return icon("peace", weight);
    }

    public static Icon pen() {
        return pen(PhosphorWeight.REGULAR);
    }

    public static Icon pen(PhosphorWeight weight) {
        return icon("pen", weight);
    }

    public static Icon penNib() {
        return penNib(PhosphorWeight.REGULAR);
    }

    public static Icon penNib(PhosphorWeight weight) {
        return icon("pen-nib", weight);
    }

    public static Icon penNibStraight() {
        return penNibStraight(PhosphorWeight.REGULAR);
    }

    public static Icon penNibStraight(PhosphorWeight weight) {
        return icon("pen-nib-straight", weight);
    }

    public static Icon pencil() {
        return pencil(PhosphorWeight.REGULAR);
    }

    public static Icon pencil(PhosphorWeight weight) {
        return icon("pencil", weight);
    }

    public static Icon pencilCircle() {
        return pencilCircle(PhosphorWeight.REGULAR);
    }

    public static Icon pencilCircle(PhosphorWeight weight) {
        return icon("pencil-circle", weight);
    }

    public static Icon pencilLine() {
        return pencilLine(PhosphorWeight.REGULAR);
    }

    public static Icon pencilLine(PhosphorWeight weight) {
        return icon("pencil-line", weight);
    }

    public static Icon pencilRuler() {
        return pencilRuler(PhosphorWeight.REGULAR);
    }

    public static Icon pencilRuler(PhosphorWeight weight) {
        return icon("pencil-ruler", weight);
    }

    public static Icon pencilSimple() {
        return pencilSimple(PhosphorWeight.REGULAR);
    }

    public static Icon pencilSimple(PhosphorWeight weight) {
        return icon("pencil-simple", weight);
    }

    public static Icon pencilSimpleLine() {
        return pencilSimpleLine(PhosphorWeight.REGULAR);
    }

    public static Icon pencilSimpleLine(PhosphorWeight weight) {
        return icon("pencil-simple-line", weight);
    }

    public static Icon pencilSimpleSlash() {
        return pencilSimpleSlash(PhosphorWeight.REGULAR);
    }

    public static Icon pencilSimpleSlash(PhosphorWeight weight) {
        return icon("pencil-simple-slash", weight);
    }

    public static Icon pencilSlash() {
        return pencilSlash(PhosphorWeight.REGULAR);
    }

    public static Icon pencilSlash(PhosphorWeight weight) {
        return icon("pencil-slash", weight);
    }

    public static Icon pentagon() {
        return pentagon(PhosphorWeight.REGULAR);
    }

    public static Icon pentagon(PhosphorWeight weight) {
        return icon("pentagon", weight);
    }

    public static Icon pentagram() {
        return pentagram(PhosphorWeight.REGULAR);
    }

    public static Icon pentagram(PhosphorWeight weight) {
        return icon("pentagram", weight);
    }

    public static Icon pepper() {
        return pepper(PhosphorWeight.REGULAR);
    }

    public static Icon pepper(PhosphorWeight weight) {
        return icon("pepper", weight);
    }

    public static Icon percent() {
        return percent(PhosphorWeight.REGULAR);
    }

    public static Icon percent(PhosphorWeight weight) {
        return icon("percent", weight);
    }

    public static Icon person() {
        return person(PhosphorWeight.REGULAR);
    }

    public static Icon person(PhosphorWeight weight) {
        return icon("person", weight);
    }

    public static Icon personArmsSpread() {
        return personArmsSpread(PhosphorWeight.REGULAR);
    }

    public static Icon personArmsSpread(PhosphorWeight weight) {
        return icon("person-arms-spread", weight);
    }

    public static Icon personSimple() {
        return personSimple(PhosphorWeight.REGULAR);
    }

    public static Icon personSimple(PhosphorWeight weight) {
        return icon("person-simple", weight);
    }

    public static Icon personSimpleBike() {
        return personSimpleBike(PhosphorWeight.REGULAR);
    }

    public static Icon personSimpleBike(PhosphorWeight weight) {
        return icon("person-simple-bike", weight);
    }

    public static Icon personSimpleCircle() {
        return personSimpleCircle(PhosphorWeight.REGULAR);
    }

    public static Icon personSimpleCircle(PhosphorWeight weight) {
        return icon("person-simple-circle", weight);
    }

    public static Icon personSimpleHike() {
        return personSimpleHike(PhosphorWeight.REGULAR);
    }

    public static Icon personSimpleHike(PhosphorWeight weight) {
        return icon("person-simple-hike", weight);
    }

    public static Icon personSimpleRun() {
        return personSimpleRun(PhosphorWeight.REGULAR);
    }

    public static Icon personSimpleRun(PhosphorWeight weight) {
        return icon("person-simple-run", weight);
    }

    public static Icon personSimpleSki() {
        return personSimpleSki(PhosphorWeight.REGULAR);
    }

    public static Icon personSimpleSki(PhosphorWeight weight) {
        return icon("person-simple-ski", weight);
    }

    public static Icon personSimpleSnowboard() {
        return personSimpleSnowboard(PhosphorWeight.REGULAR);
    }

    public static Icon personSimpleSnowboard(PhosphorWeight weight) {
        return icon("person-simple-snowboard", weight);
    }

    public static Icon personSimpleSwim() {
        return personSimpleSwim(PhosphorWeight.REGULAR);
    }

    public static Icon personSimpleSwim(PhosphorWeight weight) {
        return icon("person-simple-swim", weight);
    }

    public static Icon personSimpleTaiChi() {
        return personSimpleTaiChi(PhosphorWeight.REGULAR);
    }

    public static Icon personSimpleTaiChi(PhosphorWeight weight) {
        return icon("person-simple-tai-chi", weight);
    }

    public static Icon personSimpleThrow() {
        return personSimpleThrow(PhosphorWeight.REGULAR);
    }

    public static Icon personSimpleThrow(PhosphorWeight weight) {
        return icon("person-simple-throw", weight);
    }

    public static Icon personSimpleWalk() {
        return personSimpleWalk(PhosphorWeight.REGULAR);
    }

    public static Icon personSimpleWalk(PhosphorWeight weight) {
        return icon("person-simple-walk", weight);
    }

    public static Icon perspective() {
        return perspective(PhosphorWeight.REGULAR);
    }

    public static Icon perspective(PhosphorWeight weight) {
        return icon("perspective", weight);
    }

    public static Icon phone() {
        return phone(PhosphorWeight.REGULAR);
    }

    public static Icon phone(PhosphorWeight weight) {
        return icon("phone", weight);
    }

    public static Icon phoneCall() {
        return phoneCall(PhosphorWeight.REGULAR);
    }

    public static Icon phoneCall(PhosphorWeight weight) {
        return icon("phone-call", weight);
    }

    public static Icon phoneDisconnect() {
        return phoneDisconnect(PhosphorWeight.REGULAR);
    }

    public static Icon phoneDisconnect(PhosphorWeight weight) {
        return icon("phone-disconnect", weight);
    }

    public static Icon phoneIncoming() {
        return phoneIncoming(PhosphorWeight.REGULAR);
    }

    public static Icon phoneIncoming(PhosphorWeight weight) {
        return icon("phone-incoming", weight);
    }

    public static Icon phoneList() {
        return phoneList(PhosphorWeight.REGULAR);
    }

    public static Icon phoneList(PhosphorWeight weight) {
        return icon("phone-list", weight);
    }

    public static Icon phoneOutgoing() {
        return phoneOutgoing(PhosphorWeight.REGULAR);
    }

    public static Icon phoneOutgoing(PhosphorWeight weight) {
        return icon("phone-outgoing", weight);
    }

    public static Icon phonePause() {
        return phonePause(PhosphorWeight.REGULAR);
    }

    public static Icon phonePause(PhosphorWeight weight) {
        return icon("phone-pause", weight);
    }

    public static Icon phonePlus() {
        return phonePlus(PhosphorWeight.REGULAR);
    }

    public static Icon phonePlus(PhosphorWeight weight) {
        return icon("phone-plus", weight);
    }

    public static Icon phoneSlash() {
        return phoneSlash(PhosphorWeight.REGULAR);
    }

    public static Icon phoneSlash(PhosphorWeight weight) {
        return icon("phone-slash", weight);
    }

    public static Icon phoneTransfer() {
        return phoneTransfer(PhosphorWeight.REGULAR);
    }

    public static Icon phoneTransfer(PhosphorWeight weight) {
        return icon("phone-transfer", weight);
    }

    public static Icon phoneX() {
        return phoneX(PhosphorWeight.REGULAR);
    }

    public static Icon phoneX(PhosphorWeight weight) {
        return icon("phone-x", weight);
    }

    public static Icon phosphorLogo() {
        return phosphorLogo(PhosphorWeight.REGULAR);
    }

    public static Icon phosphorLogo(PhosphorWeight weight) {
        return icon("phosphor-logo", weight);
    }

    public static Icon pi() {
        return pi(PhosphorWeight.REGULAR);
    }

    public static Icon pi(PhosphorWeight weight) {
        return icon("pi", weight);
    }

    public static Icon pianoKeys() {
        return pianoKeys(PhosphorWeight.REGULAR);
    }

    public static Icon pianoKeys(PhosphorWeight weight) {
        return icon("piano-keys", weight);
    }

    public static Icon picnicTable() {
        return picnicTable(PhosphorWeight.REGULAR);
    }

    public static Icon picnicTable(PhosphorWeight weight) {
        return icon("picnic-table", weight);
    }

    public static Icon pictureInPicture() {
        return pictureInPicture(PhosphorWeight.REGULAR);
    }

    public static Icon pictureInPicture(PhosphorWeight weight) {
        return icon("picture-in-picture", weight);
    }

    public static Icon piggyBank() {
        return piggyBank(PhosphorWeight.REGULAR);
    }

    public static Icon piggyBank(PhosphorWeight weight) {
        return icon("piggy-bank", weight);
    }

    public static Icon pill() {
        return pill(PhosphorWeight.REGULAR);
    }

    public static Icon pill(PhosphorWeight weight) {
        return icon("pill", weight);
    }

    public static Icon pingPong() {
        return pingPong(PhosphorWeight.REGULAR);
    }

    public static Icon pingPong(PhosphorWeight weight) {
        return icon("ping-pong", weight);
    }

    public static Icon pintGlass() {
        return pintGlass(PhosphorWeight.REGULAR);
    }

    public static Icon pintGlass(PhosphorWeight weight) {
        return icon("pint-glass", weight);
    }

    public static Icon pinterestLogo() {
        return pinterestLogo(PhosphorWeight.REGULAR);
    }

    public static Icon pinterestLogo(PhosphorWeight weight) {
        return icon("pinterest-logo", weight);
    }

    public static Icon pinwheel() {
        return pinwheel(PhosphorWeight.REGULAR);
    }

    public static Icon pinwheel(PhosphorWeight weight) {
        return icon("pinwheel", weight);
    }

    public static Icon pipe() {
        return pipe(PhosphorWeight.REGULAR);
    }

    public static Icon pipe(PhosphorWeight weight) {
        return icon("pipe", weight);
    }

    public static Icon pipeWrench() {
        return pipeWrench(PhosphorWeight.REGULAR);
    }

    public static Icon pipeWrench(PhosphorWeight weight) {
        return icon("pipe-wrench", weight);
    }

    public static Icon pixLogo() {
        return pixLogo(PhosphorWeight.REGULAR);
    }

    public static Icon pixLogo(PhosphorWeight weight) {
        return icon("pix-logo", weight);
    }

    public static Icon pizza() {
        return pizza(PhosphorWeight.REGULAR);
    }

    public static Icon pizza(PhosphorWeight weight) {
        return icon("pizza", weight);
    }

    public static Icon placeholder() {
        return placeholder(PhosphorWeight.REGULAR);
    }

    public static Icon placeholder(PhosphorWeight weight) {
        return icon("placeholder", weight);
    }

    public static Icon planet() {
        return planet(PhosphorWeight.REGULAR);
    }

    public static Icon planet(PhosphorWeight weight) {
        return icon("planet", weight);
    }

    public static Icon plant() {
        return plant(PhosphorWeight.REGULAR);
    }

    public static Icon plant(PhosphorWeight weight) {
        return icon("plant", weight);
    }

    public static Icon play() {
        return play(PhosphorWeight.REGULAR);
    }

    public static Icon play(PhosphorWeight weight) {
        return icon("play", weight);
    }

    public static Icon playCircle() {
        return playCircle(PhosphorWeight.REGULAR);
    }

    public static Icon playCircle(PhosphorWeight weight) {
        return icon("play-circle", weight);
    }

    public static Icon playPause() {
        return playPause(PhosphorWeight.REGULAR);
    }

    public static Icon playPause(PhosphorWeight weight) {
        return icon("play-pause", weight);
    }

    public static Icon playlist() {
        return playlist(PhosphorWeight.REGULAR);
    }

    public static Icon playlist(PhosphorWeight weight) {
        return icon("playlist", weight);
    }

    public static Icon plug() {
        return plug(PhosphorWeight.REGULAR);
    }

    public static Icon plug(PhosphorWeight weight) {
        return icon("plug", weight);
    }

    public static Icon plugCharging() {
        return plugCharging(PhosphorWeight.REGULAR);
    }

    public static Icon plugCharging(PhosphorWeight weight) {
        return icon("plug-charging", weight);
    }

    public static Icon plugs() {
        return plugs(PhosphorWeight.REGULAR);
    }

    public static Icon plugs(PhosphorWeight weight) {
        return icon("plugs", weight);
    }

    public static Icon plugsConnected() {
        return plugsConnected(PhosphorWeight.REGULAR);
    }

    public static Icon plugsConnected(PhosphorWeight weight) {
        return icon("plugs-connected", weight);
    }

    public static Icon plus() {
        return plus(PhosphorWeight.REGULAR);
    }

    public static Icon plus(PhosphorWeight weight) {
        return icon("plus", weight);
    }

    public static Icon plusCircle() {
        return plusCircle(PhosphorWeight.REGULAR);
    }

    public static Icon plusCircle(PhosphorWeight weight) {
        return icon("plus-circle", weight);
    }

    public static Icon plusMinus() {
        return plusMinus(PhosphorWeight.REGULAR);
    }

    public static Icon plusMinus(PhosphorWeight weight) {
        return icon("plus-minus", weight);
    }

    public static Icon plusSquare() {
        return plusSquare(PhosphorWeight.REGULAR);
    }

    public static Icon plusSquare(PhosphorWeight weight) {
        return icon("plus-square", weight);
    }

    public static Icon pokerChip() {
        return pokerChip(PhosphorWeight.REGULAR);
    }

    public static Icon pokerChip(PhosphorWeight weight) {
        return icon("poker-chip", weight);
    }

    public static Icon policeCar() {
        return policeCar(PhosphorWeight.REGULAR);
    }

    public static Icon policeCar(PhosphorWeight weight) {
        return icon("police-car", weight);
    }

    public static Icon polygon() {
        return polygon(PhosphorWeight.REGULAR);
    }

    public static Icon polygon(PhosphorWeight weight) {
        return icon("polygon", weight);
    }

    public static Icon popcorn() {
        return popcorn(PhosphorWeight.REGULAR);
    }

    public static Icon popcorn(PhosphorWeight weight) {
        return icon("popcorn", weight);
    }

    public static Icon popsicle() {
        return popsicle(PhosphorWeight.REGULAR);
    }

    public static Icon popsicle(PhosphorWeight weight) {
        return icon("popsicle", weight);
    }

    public static Icon pottedPlant() {
        return pottedPlant(PhosphorWeight.REGULAR);
    }

    public static Icon pottedPlant(PhosphorWeight weight) {
        return icon("potted-plant", weight);
    }

    public static Icon power() {
        return power(PhosphorWeight.REGULAR);
    }

    public static Icon power(PhosphorWeight weight) {
        return icon("power", weight);
    }

    public static Icon prescription() {
        return prescription(PhosphorWeight.REGULAR);
    }

    public static Icon prescription(PhosphorWeight weight) {
        return icon("prescription", weight);
    }

    public static Icon presentation() {
        return presentation(PhosphorWeight.REGULAR);
    }

    public static Icon presentation(PhosphorWeight weight) {
        return icon("presentation", weight);
    }

    public static Icon presentationChart() {
        return presentationChart(PhosphorWeight.REGULAR);
    }

    public static Icon presentationChart(PhosphorWeight weight) {
        return icon("presentation-chart", weight);
    }

    public static Icon printer() {
        return printer(PhosphorWeight.REGULAR);
    }

    public static Icon printer(PhosphorWeight weight) {
        return icon("printer", weight);
    }

    public static Icon prohibit() {
        return prohibit(PhosphorWeight.REGULAR);
    }

    public static Icon prohibit(PhosphorWeight weight) {
        return icon("prohibit", weight);
    }

    public static Icon prohibitInset() {
        return prohibitInset(PhosphorWeight.REGULAR);
    }

    public static Icon prohibitInset(PhosphorWeight weight) {
        return icon("prohibit-inset", weight);
    }

    public static Icon projectorScreen() {
        return projectorScreen(PhosphorWeight.REGULAR);
    }

    public static Icon projectorScreen(PhosphorWeight weight) {
        return icon("projector-screen", weight);
    }

    public static Icon projectorScreenChart() {
        return projectorScreenChart(PhosphorWeight.REGULAR);
    }

    public static Icon projectorScreenChart(PhosphorWeight weight) {
        return icon("projector-screen-chart", weight);
    }

    public static Icon pulse() {
        return pulse(PhosphorWeight.REGULAR);
    }

    public static Icon pulse(PhosphorWeight weight) {
        return icon("pulse", weight);
    }

    public static Icon pushPin() {
        return pushPin(PhosphorWeight.REGULAR);
    }

    public static Icon pushPin(PhosphorWeight weight) {
        return icon("push-pin", weight);
    }

    public static Icon pushPinSimple() {
        return pushPinSimple(PhosphorWeight.REGULAR);
    }

    public static Icon pushPinSimple(PhosphorWeight weight) {
        return icon("push-pin-simple", weight);
    }

    public static Icon pushPinSimpleSlash() {
        return pushPinSimpleSlash(PhosphorWeight.REGULAR);
    }

    public static Icon pushPinSimpleSlash(PhosphorWeight weight) {
        return icon("push-pin-simple-slash", weight);
    }

    public static Icon pushPinSlash() {
        return pushPinSlash(PhosphorWeight.REGULAR);
    }

    public static Icon pushPinSlash(PhosphorWeight weight) {
        return icon("push-pin-slash", weight);
    }

    public static Icon puzzlePiece() {
        return puzzlePiece(PhosphorWeight.REGULAR);
    }

    public static Icon puzzlePiece(PhosphorWeight weight) {
        return icon("puzzle-piece", weight);
    }

    public static Icon qrCode() {
        return qrCode(PhosphorWeight.REGULAR);
    }

    public static Icon qrCode(PhosphorWeight weight) {
        return icon("qr-code", weight);
    }

    public static Icon question() {
        return question(PhosphorWeight.REGULAR);
    }

    public static Icon question(PhosphorWeight weight) {
        return icon("question", weight);
    }

    public static Icon questionMark() {
        return questionMark(PhosphorWeight.REGULAR);
    }

    public static Icon questionMark(PhosphorWeight weight) {
        return icon("question-mark", weight);
    }

    public static Icon queue() {
        return queue(PhosphorWeight.REGULAR);
    }

    public static Icon queue(PhosphorWeight weight) {
        return icon("queue", weight);
    }

    public static Icon quotes() {
        return quotes(PhosphorWeight.REGULAR);
    }

    public static Icon quotes(PhosphorWeight weight) {
        return icon("quotes", weight);
    }

    public static Icon rabbit() {
        return rabbit(PhosphorWeight.REGULAR);
    }

    public static Icon rabbit(PhosphorWeight weight) {
        return icon("rabbit", weight);
    }

    public static Icon racquet() {
        return racquet(PhosphorWeight.REGULAR);
    }

    public static Icon racquet(PhosphorWeight weight) {
        return icon("racquet", weight);
    }

    public static Icon radical() {
        return radical(PhosphorWeight.REGULAR);
    }

    public static Icon radical(PhosphorWeight weight) {
        return icon("radical", weight);
    }

    public static Icon radio() {
        return radio(PhosphorWeight.REGULAR);
    }

    public static Icon radio(PhosphorWeight weight) {
        return icon("radio", weight);
    }

    public static Icon radioButton() {
        return radioButton(PhosphorWeight.REGULAR);
    }

    public static Icon radioButton(PhosphorWeight weight) {
        return icon("radio-button", weight);
    }

    public static Icon radioactive() {
        return radioactive(PhosphorWeight.REGULAR);
    }

    public static Icon radioactive(PhosphorWeight weight) {
        return icon("radioactive", weight);
    }

    public static Icon rainbow() {
        return rainbow(PhosphorWeight.REGULAR);
    }

    public static Icon rainbow(PhosphorWeight weight) {
        return icon("rainbow", weight);
    }

    public static Icon rainbowCloud() {
        return rainbowCloud(PhosphorWeight.REGULAR);
    }

    public static Icon rainbowCloud(PhosphorWeight weight) {
        return icon("rainbow-cloud", weight);
    }

    public static Icon ranking() {
        return ranking(PhosphorWeight.REGULAR);
    }

    public static Icon ranking(PhosphorWeight weight) {
        return icon("ranking", weight);
    }

    public static Icon readCvLogo() {
        return readCvLogo(PhosphorWeight.REGULAR);
    }

    public static Icon readCvLogo(PhosphorWeight weight) {
        return icon("read-cv-logo", weight);
    }

    public static Icon receipt() {
        return receipt(PhosphorWeight.REGULAR);
    }

    public static Icon receipt(PhosphorWeight weight) {
        return icon("receipt", weight);
    }

    public static Icon receiptX() {
        return receiptX(PhosphorWeight.REGULAR);
    }

    public static Icon receiptX(PhosphorWeight weight) {
        return icon("receipt-x", weight);
    }

    public static Icon record() {
        return record(PhosphorWeight.REGULAR);
    }

    public static Icon record(PhosphorWeight weight) {
        return icon("record", weight);
    }

    public static Icon rectangle() {
        return rectangle(PhosphorWeight.REGULAR);
    }

    public static Icon rectangle(PhosphorWeight weight) {
        return icon("rectangle", weight);
    }

    public static Icon rectangleDashed() {
        return rectangleDashed(PhosphorWeight.REGULAR);
    }

    public static Icon rectangleDashed(PhosphorWeight weight) {
        return icon("rectangle-dashed", weight);
    }

    public static Icon recycle() {
        return recycle(PhosphorWeight.REGULAR);
    }

    public static Icon recycle(PhosphorWeight weight) {
        return icon("recycle", weight);
    }

    public static Icon redditLogo() {
        return redditLogo(PhosphorWeight.REGULAR);
    }

    public static Icon redditLogo(PhosphorWeight weight) {
        return icon("reddit-logo", weight);
    }

    public static Icon repeat() {
        return repeat(PhosphorWeight.REGULAR);
    }

    public static Icon repeat(PhosphorWeight weight) {
        return icon("repeat", weight);
    }

    public static Icon repeatOnce() {
        return repeatOnce(PhosphorWeight.REGULAR);
    }

    public static Icon repeatOnce(PhosphorWeight weight) {
        return icon("repeat-once", weight);
    }

    public static Icon replitLogo() {
        return replitLogo(PhosphorWeight.REGULAR);
    }

    public static Icon replitLogo(PhosphorWeight weight) {
        return icon("replit-logo", weight);
    }

    public static Icon resize() {
        return resize(PhosphorWeight.REGULAR);
    }

    public static Icon resize(PhosphorWeight weight) {
        return icon("resize", weight);
    }

    public static Icon rewind() {
        return rewind(PhosphorWeight.REGULAR);
    }

    public static Icon rewind(PhosphorWeight weight) {
        return icon("rewind", weight);
    }

    public static Icon rewindCircle() {
        return rewindCircle(PhosphorWeight.REGULAR);
    }

    public static Icon rewindCircle(PhosphorWeight weight) {
        return icon("rewind-circle", weight);
    }

    public static Icon roadHorizon() {
        return roadHorizon(PhosphorWeight.REGULAR);
    }

    public static Icon roadHorizon(PhosphorWeight weight) {
        return icon("road-horizon", weight);
    }

    public static Icon robot() {
        return robot(PhosphorWeight.REGULAR);
    }

    public static Icon robot(PhosphorWeight weight) {
        return icon("robot", weight);
    }

    public static Icon rocket() {
        return rocket(PhosphorWeight.REGULAR);
    }

    public static Icon rocket(PhosphorWeight weight) {
        return icon("rocket", weight);
    }

    public static Icon rocketLaunch() {
        return rocketLaunch(PhosphorWeight.REGULAR);
    }

    public static Icon rocketLaunch(PhosphorWeight weight) {
        return icon("rocket-launch", weight);
    }

    public static Icon rows() {
        return rows(PhosphorWeight.REGULAR);
    }

    public static Icon rows(PhosphorWeight weight) {
        return icon("rows", weight);
    }

    public static Icon rowsPlusBottom() {
        return rowsPlusBottom(PhosphorWeight.REGULAR);
    }

    public static Icon rowsPlusBottom(PhosphorWeight weight) {
        return icon("rows-plus-bottom", weight);
    }

    public static Icon rowsPlusTop() {
        return rowsPlusTop(PhosphorWeight.REGULAR);
    }

    public static Icon rowsPlusTop(PhosphorWeight weight) {
        return icon("rows-plus-top", weight);
    }

    public static Icon rss() {
        return rss(PhosphorWeight.REGULAR);
    }

    public static Icon rss(PhosphorWeight weight) {
        return icon("rss", weight);
    }

    public static Icon rssSimple() {
        return rssSimple(PhosphorWeight.REGULAR);
    }

    public static Icon rssSimple(PhosphorWeight weight) {
        return icon("rss-simple", weight);
    }

    public static Icon rug() {
        return rug(PhosphorWeight.REGULAR);
    }

    public static Icon rug(PhosphorWeight weight) {
        return icon("rug", weight);
    }

    public static Icon ruler() {
        return ruler(PhosphorWeight.REGULAR);
    }

    public static Icon ruler(PhosphorWeight weight) {
        return icon("ruler", weight);
    }

    public static Icon sailboat() {
        return sailboat(PhosphorWeight.REGULAR);
    }

    public static Icon sailboat(PhosphorWeight weight) {
        return icon("sailboat", weight);
    }

    public static Icon scales() {
        return scales(PhosphorWeight.REGULAR);
    }

    public static Icon scales(PhosphorWeight weight) {
        return icon("scales", weight);
    }

    public static Icon scan() {
        return scan(PhosphorWeight.REGULAR);
    }

    public static Icon scan(PhosphorWeight weight) {
        return icon("scan", weight);
    }

    public static Icon scanSmiley() {
        return scanSmiley(PhosphorWeight.REGULAR);
    }

    public static Icon scanSmiley(PhosphorWeight weight) {
        return icon("scan-smiley", weight);
    }

    public static Icon scissors() {
        return scissors(PhosphorWeight.REGULAR);
    }

    public static Icon scissors(PhosphorWeight weight) {
        return icon("scissors", weight);
    }

    public static Icon scooter() {
        return scooter(PhosphorWeight.REGULAR);
    }

    public static Icon scooter(PhosphorWeight weight) {
        return icon("scooter", weight);
    }

    public static Icon screencast() {
        return screencast(PhosphorWeight.REGULAR);
    }

    public static Icon screencast(PhosphorWeight weight) {
        return icon("screencast", weight);
    }

    public static Icon screwdriver() {
        return screwdriver(PhosphorWeight.REGULAR);
    }

    public static Icon screwdriver(PhosphorWeight weight) {
        return icon("screwdriver", weight);
    }

    public static Icon scribble() {
        return scribble(PhosphorWeight.REGULAR);
    }

    public static Icon scribble(PhosphorWeight weight) {
        return icon("scribble", weight);
    }

    public static Icon scribbleLoop() {
        return scribbleLoop(PhosphorWeight.REGULAR);
    }

    public static Icon scribbleLoop(PhosphorWeight weight) {
        return icon("scribble-loop", weight);
    }

    public static Icon scroll() {
        return scroll(PhosphorWeight.REGULAR);
    }

    public static Icon scroll(PhosphorWeight weight) {
        return icon("scroll", weight);
    }

    public static Icon seal() {
        return seal(PhosphorWeight.REGULAR);
    }

    public static Icon seal(PhosphorWeight weight) {
        return icon("seal", weight);
    }

    public static Icon sealCheck() {
        return sealCheck(PhosphorWeight.REGULAR);
    }

    public static Icon sealCheck(PhosphorWeight weight) {
        return icon("seal-check", weight);
    }

    public static Icon sealPercent() {
        return sealPercent(PhosphorWeight.REGULAR);
    }

    public static Icon sealPercent(PhosphorWeight weight) {
        return icon("seal-percent", weight);
    }

    public static Icon sealQuestion() {
        return sealQuestion(PhosphorWeight.REGULAR);
    }

    public static Icon sealQuestion(PhosphorWeight weight) {
        return icon("seal-question", weight);
    }

    public static Icon sealWarning() {
        return sealWarning(PhosphorWeight.REGULAR);
    }

    public static Icon sealWarning(PhosphorWeight weight) {
        return icon("seal-warning", weight);
    }

    public static Icon seat() {
        return seat(PhosphorWeight.REGULAR);
    }

    public static Icon seat(PhosphorWeight weight) {
        return icon("seat", weight);
    }

    public static Icon seatbelt() {
        return seatbelt(PhosphorWeight.REGULAR);
    }

    public static Icon seatbelt(PhosphorWeight weight) {
        return icon("seatbelt", weight);
    }

    public static Icon securityCamera() {
        return securityCamera(PhosphorWeight.REGULAR);
    }

    public static Icon securityCamera(PhosphorWeight weight) {
        return icon("security-camera", weight);
    }

    public static Icon selection() {
        return selection(PhosphorWeight.REGULAR);
    }

    public static Icon selection(PhosphorWeight weight) {
        return icon("selection", weight);
    }

    public static Icon selectionAll() {
        return selectionAll(PhosphorWeight.REGULAR);
    }

    public static Icon selectionAll(PhosphorWeight weight) {
        return icon("selection-all", weight);
    }

    public static Icon selectionBackground() {
        return selectionBackground(PhosphorWeight.REGULAR);
    }

    public static Icon selectionBackground(PhosphorWeight weight) {
        return icon("selection-background", weight);
    }

    public static Icon selectionForeground() {
        return selectionForeground(PhosphorWeight.REGULAR);
    }

    public static Icon selectionForeground(PhosphorWeight weight) {
        return icon("selection-foreground", weight);
    }

    public static Icon selectionInverse() {
        return selectionInverse(PhosphorWeight.REGULAR);
    }

    public static Icon selectionInverse(PhosphorWeight weight) {
        return icon("selection-inverse", weight);
    }

    public static Icon selectionPlus() {
        return selectionPlus(PhosphorWeight.REGULAR);
    }

    public static Icon selectionPlus(PhosphorWeight weight) {
        return icon("selection-plus", weight);
    }

    public static Icon selectionSlash() {
        return selectionSlash(PhosphorWeight.REGULAR);
    }

    public static Icon selectionSlash(PhosphorWeight weight) {
        return icon("selection-slash", weight);
    }

    public static Icon shapes() {
        return shapes(PhosphorWeight.REGULAR);
    }

    public static Icon shapes(PhosphorWeight weight) {
        return icon("shapes", weight);
    }

    public static Icon share() {
        return share(PhosphorWeight.REGULAR);
    }

    public static Icon share(PhosphorWeight weight) {
        return icon("share", weight);
    }

    public static Icon shareFat() {
        return shareFat(PhosphorWeight.REGULAR);
    }

    public static Icon shareFat(PhosphorWeight weight) {
        return icon("share-fat", weight);
    }

    public static Icon shareNetwork() {
        return shareNetwork(PhosphorWeight.REGULAR);
    }

    public static Icon shareNetwork(PhosphorWeight weight) {
        return icon("share-network", weight);
    }

    public static Icon shield() {
        return shield(PhosphorWeight.REGULAR);
    }

    public static Icon shield(PhosphorWeight weight) {
        return icon("shield", weight);
    }

    public static Icon shieldCheck() {
        return shieldCheck(PhosphorWeight.REGULAR);
    }

    public static Icon shieldCheck(PhosphorWeight weight) {
        return icon("shield-check", weight);
    }

    public static Icon shieldCheckered() {
        return shieldCheckered(PhosphorWeight.REGULAR);
    }

    public static Icon shieldCheckered(PhosphorWeight weight) {
        return icon("shield-checkered", weight);
    }

    public static Icon shieldChevron() {
        return shieldChevron(PhosphorWeight.REGULAR);
    }

    public static Icon shieldChevron(PhosphorWeight weight) {
        return icon("shield-chevron", weight);
    }

    public static Icon shieldPlus() {
        return shieldPlus(PhosphorWeight.REGULAR);
    }

    public static Icon shieldPlus(PhosphorWeight weight) {
        return icon("shield-plus", weight);
    }

    public static Icon shieldSlash() {
        return shieldSlash(PhosphorWeight.REGULAR);
    }

    public static Icon shieldSlash(PhosphorWeight weight) {
        return icon("shield-slash", weight);
    }

    public static Icon shieldStar() {
        return shieldStar(PhosphorWeight.REGULAR);
    }

    public static Icon shieldStar(PhosphorWeight weight) {
        return icon("shield-star", weight);
    }

    public static Icon shieldWarning() {
        return shieldWarning(PhosphorWeight.REGULAR);
    }

    public static Icon shieldWarning(PhosphorWeight weight) {
        return icon("shield-warning", weight);
    }

    public static Icon shippingContainer() {
        return shippingContainer(PhosphorWeight.REGULAR);
    }

    public static Icon shippingContainer(PhosphorWeight weight) {
        return icon("shipping-container", weight);
    }

    public static Icon shirtFolded() {
        return shirtFolded(PhosphorWeight.REGULAR);
    }

    public static Icon shirtFolded(PhosphorWeight weight) {
        return icon("shirt-folded", weight);
    }

    public static Icon shootingStar() {
        return shootingStar(PhosphorWeight.REGULAR);
    }

    public static Icon shootingStar(PhosphorWeight weight) {
        return icon("shooting-star", weight);
    }

    public static Icon shoppingBag() {
        return shoppingBag(PhosphorWeight.REGULAR);
    }

    public static Icon shoppingBag(PhosphorWeight weight) {
        return icon("shopping-bag", weight);
    }

    public static Icon shoppingBagOpen() {
        return shoppingBagOpen(PhosphorWeight.REGULAR);
    }

    public static Icon shoppingBagOpen(PhosphorWeight weight) {
        return icon("shopping-bag-open", weight);
    }

    public static Icon shoppingCart() {
        return shoppingCart(PhosphorWeight.REGULAR);
    }

    public static Icon shoppingCart(PhosphorWeight weight) {
        return icon("shopping-cart", weight);
    }

    public static Icon shoppingCartSimple() {
        return shoppingCartSimple(PhosphorWeight.REGULAR);
    }

    public static Icon shoppingCartSimple(PhosphorWeight weight) {
        return icon("shopping-cart-simple", weight);
    }

    public static Icon shovel() {
        return shovel(PhosphorWeight.REGULAR);
    }

    public static Icon shovel(PhosphorWeight weight) {
        return icon("shovel", weight);
    }

    public static Icon shower() {
        return shower(PhosphorWeight.REGULAR);
    }

    public static Icon shower(PhosphorWeight weight) {
        return icon("shower", weight);
    }

    public static Icon shrimp() {
        return shrimp(PhosphorWeight.REGULAR);
    }

    public static Icon shrimp(PhosphorWeight weight) {
        return icon("shrimp", weight);
    }

    public static Icon shuffle() {
        return shuffle(PhosphorWeight.REGULAR);
    }

    public static Icon shuffle(PhosphorWeight weight) {
        return icon("shuffle", weight);
    }

    public static Icon shuffleAngular() {
        return shuffleAngular(PhosphorWeight.REGULAR);
    }

    public static Icon shuffleAngular(PhosphorWeight weight) {
        return icon("shuffle-angular", weight);
    }

    public static Icon shuffleSimple() {
        return shuffleSimple(PhosphorWeight.REGULAR);
    }

    public static Icon shuffleSimple(PhosphorWeight weight) {
        return icon("shuffle-simple", weight);
    }

    public static Icon sidebar() {
        return sidebar(PhosphorWeight.REGULAR);
    }

    public static Icon sidebar(PhosphorWeight weight) {
        return icon("sidebar", weight);
    }

    public static Icon sidebarSimple() {
        return sidebarSimple(PhosphorWeight.REGULAR);
    }

    public static Icon sidebarSimple(PhosphorWeight weight) {
        return icon("sidebar-simple", weight);
    }

    public static Icon sigma() {
        return sigma(PhosphorWeight.REGULAR);
    }

    public static Icon sigma(PhosphorWeight weight) {
        return icon("sigma", weight);
    }

    public static Icon signIn() {
        return signIn(PhosphorWeight.REGULAR);
    }

    public static Icon signIn(PhosphorWeight weight) {
        return icon("sign-in", weight);
    }

    public static Icon signOut() {
        return signOut(PhosphorWeight.REGULAR);
    }

    public static Icon signOut(PhosphorWeight weight) {
        return icon("sign-out", weight);
    }

    public static Icon signature() {
        return signature(PhosphorWeight.REGULAR);
    }

    public static Icon signature(PhosphorWeight weight) {
        return icon("signature", weight);
    }

    public static Icon signpost() {
        return signpost(PhosphorWeight.REGULAR);
    }

    public static Icon signpost(PhosphorWeight weight) {
        return icon("signpost", weight);
    }

    public static Icon simCard() {
        return simCard(PhosphorWeight.REGULAR);
    }

    public static Icon simCard(PhosphorWeight weight) {
        return icon("sim-card", weight);
    }

    public static Icon siren() {
        return siren(PhosphorWeight.REGULAR);
    }

    public static Icon siren(PhosphorWeight weight) {
        return icon("siren", weight);
    }

    public static Icon sketchLogo() {
        return sketchLogo(PhosphorWeight.REGULAR);
    }

    public static Icon sketchLogo(PhosphorWeight weight) {
        return icon("sketch-logo", weight);
    }

    public static Icon skipBack() {
        return skipBack(PhosphorWeight.REGULAR);
    }

    public static Icon skipBack(PhosphorWeight weight) {
        return icon("skip-back", weight);
    }

    public static Icon skipBackCircle() {
        return skipBackCircle(PhosphorWeight.REGULAR);
    }

    public static Icon skipBackCircle(PhosphorWeight weight) {
        return icon("skip-back-circle", weight);
    }

    public static Icon skipForward() {
        return skipForward(PhosphorWeight.REGULAR);
    }

    public static Icon skipForward(PhosphorWeight weight) {
        return icon("skip-forward", weight);
    }

    public static Icon skipForwardCircle() {
        return skipForwardCircle(PhosphorWeight.REGULAR);
    }

    public static Icon skipForwardCircle(PhosphorWeight weight) {
        return icon("skip-forward-circle", weight);
    }

    public static Icon skull() {
        return skull(PhosphorWeight.REGULAR);
    }

    public static Icon skull(PhosphorWeight weight) {
        return icon("skull", weight);
    }

    public static Icon skypeLogo() {
        return skypeLogo(PhosphorWeight.REGULAR);
    }

    public static Icon skypeLogo(PhosphorWeight weight) {
        return icon("skype-logo", weight);
    }

    public static Icon slackLogo() {
        return slackLogo(PhosphorWeight.REGULAR);
    }

    public static Icon slackLogo(PhosphorWeight weight) {
        return icon("slack-logo", weight);
    }

    public static Icon sliders() {
        return sliders(PhosphorWeight.REGULAR);
    }

    public static Icon sliders(PhosphorWeight weight) {
        return icon("sliders", weight);
    }

    public static Icon slidersHorizontal() {
        return slidersHorizontal(PhosphorWeight.REGULAR);
    }

    public static Icon slidersHorizontal(PhosphorWeight weight) {
        return icon("sliders-horizontal", weight);
    }

    public static Icon slideshow() {
        return slideshow(PhosphorWeight.REGULAR);
    }

    public static Icon slideshow(PhosphorWeight weight) {
        return icon("slideshow", weight);
    }

    public static Icon smiley() {
        return smiley(PhosphorWeight.REGULAR);
    }

    public static Icon smiley(PhosphorWeight weight) {
        return icon("smiley", weight);
    }

    public static Icon smileyAngry() {
        return smileyAngry(PhosphorWeight.REGULAR);
    }

    public static Icon smileyAngry(PhosphorWeight weight) {
        return icon("smiley-angry", weight);
    }

    public static Icon smileyBlank() {
        return smileyBlank(PhosphorWeight.REGULAR);
    }

    public static Icon smileyBlank(PhosphorWeight weight) {
        return icon("smiley-blank", weight);
    }

    public static Icon smileyMeh() {
        return smileyMeh(PhosphorWeight.REGULAR);
    }

    public static Icon smileyMeh(PhosphorWeight weight) {
        return icon("smiley-meh", weight);
    }

    public static Icon smileyMelting() {
        return smileyMelting(PhosphorWeight.REGULAR);
    }

    public static Icon smileyMelting(PhosphorWeight weight) {
        return icon("smiley-melting", weight);
    }

    public static Icon smileyNervous() {
        return smileyNervous(PhosphorWeight.REGULAR);
    }

    public static Icon smileyNervous(PhosphorWeight weight) {
        return icon("smiley-nervous", weight);
    }

    public static Icon smileySad() {
        return smileySad(PhosphorWeight.REGULAR);
    }

    public static Icon smileySad(PhosphorWeight weight) {
        return icon("smiley-sad", weight);
    }

    public static Icon smileySticker() {
        return smileySticker(PhosphorWeight.REGULAR);
    }

    public static Icon smileySticker(PhosphorWeight weight) {
        return icon("smiley-sticker", weight);
    }

    public static Icon smileyWink() {
        return smileyWink(PhosphorWeight.REGULAR);
    }

    public static Icon smileyWink(PhosphorWeight weight) {
        return icon("smiley-wink", weight);
    }

    public static Icon smileyXEyes() {
        return smileyXEyes(PhosphorWeight.REGULAR);
    }

    public static Icon smileyXEyes(PhosphorWeight weight) {
        return icon("smiley-x-eyes", weight);
    }

    public static Icon snapchatLogo() {
        return snapchatLogo(PhosphorWeight.REGULAR);
    }

    public static Icon snapchatLogo(PhosphorWeight weight) {
        return icon("snapchat-logo", weight);
    }

    public static Icon sneaker() {
        return sneaker(PhosphorWeight.REGULAR);
    }

    public static Icon sneaker(PhosphorWeight weight) {
        return icon("sneaker", weight);
    }

    public static Icon sneakerMove() {
        return sneakerMove(PhosphorWeight.REGULAR);
    }

    public static Icon sneakerMove(PhosphorWeight weight) {
        return icon("sneaker-move", weight);
    }

    public static Icon snowflake() {
        return snowflake(PhosphorWeight.REGULAR);
    }

    public static Icon snowflake(PhosphorWeight weight) {
        return icon("snowflake", weight);
    }

    public static Icon soccerBall() {
        return soccerBall(PhosphorWeight.REGULAR);
    }

    public static Icon soccerBall(PhosphorWeight weight) {
        return icon("soccer-ball", weight);
    }

    public static Icon sock() {
        return sock(PhosphorWeight.REGULAR);
    }

    public static Icon sock(PhosphorWeight weight) {
        return icon("sock", weight);
    }

    public static Icon solarPanel() {
        return solarPanel(PhosphorWeight.REGULAR);
    }

    public static Icon solarPanel(PhosphorWeight weight) {
        return icon("solar-panel", weight);
    }

    public static Icon solarRoof() {
        return solarRoof(PhosphorWeight.REGULAR);
    }

    public static Icon solarRoof(PhosphorWeight weight) {
        return icon("solar-roof", weight);
    }

    public static Icon sortAscending() {
        return sortAscending(PhosphorWeight.REGULAR);
    }

    public static Icon sortAscending(PhosphorWeight weight) {
        return icon("sort-ascending", weight);
    }

    public static Icon sortDescending() {
        return sortDescending(PhosphorWeight.REGULAR);
    }

    public static Icon sortDescending(PhosphorWeight weight) {
        return icon("sort-descending", weight);
    }

    public static Icon soundcloudLogo() {
        return soundcloudLogo(PhosphorWeight.REGULAR);
    }

    public static Icon soundcloudLogo(PhosphorWeight weight) {
        return icon("soundcloud-logo", weight);
    }

    public static Icon spade() {
        return spade(PhosphorWeight.REGULAR);
    }

    public static Icon spade(PhosphorWeight weight) {
        return icon("spade", weight);
    }

    public static Icon sparkle() {
        return sparkle(PhosphorWeight.REGULAR);
    }

    public static Icon sparkle(PhosphorWeight weight) {
        return icon("sparkle", weight);
    }

    public static Icon speakerHifi() {
        return speakerHifi(PhosphorWeight.REGULAR);
    }

    public static Icon speakerHifi(PhosphorWeight weight) {
        return icon("speaker-hifi", weight);
    }

    public static Icon speakerHigh() {
        return speakerHigh(PhosphorWeight.REGULAR);
    }

    public static Icon speakerHigh(PhosphorWeight weight) {
        return icon("speaker-high", weight);
    }

    public static Icon speakerLow() {
        return speakerLow(PhosphorWeight.REGULAR);
    }

    public static Icon speakerLow(PhosphorWeight weight) {
        return icon("speaker-low", weight);
    }

    public static Icon speakerNone() {
        return speakerNone(PhosphorWeight.REGULAR);
    }

    public static Icon speakerNone(PhosphorWeight weight) {
        return icon("speaker-none", weight);
    }

    public static Icon speakerSimpleHigh() {
        return speakerSimpleHigh(PhosphorWeight.REGULAR);
    }

    public static Icon speakerSimpleHigh(PhosphorWeight weight) {
        return icon("speaker-simple-high", weight);
    }

    public static Icon speakerSimpleLow() {
        return speakerSimpleLow(PhosphorWeight.REGULAR);
    }

    public static Icon speakerSimpleLow(PhosphorWeight weight) {
        return icon("speaker-simple-low", weight);
    }

    public static Icon speakerSimpleNone() {
        return speakerSimpleNone(PhosphorWeight.REGULAR);
    }

    public static Icon speakerSimpleNone(PhosphorWeight weight) {
        return icon("speaker-simple-none", weight);
    }

    public static Icon speakerSimpleSlash() {
        return speakerSimpleSlash(PhosphorWeight.REGULAR);
    }

    public static Icon speakerSimpleSlash(PhosphorWeight weight) {
        return icon("speaker-simple-slash", weight);
    }

    public static Icon speakerSimpleX() {
        return speakerSimpleX(PhosphorWeight.REGULAR);
    }

    public static Icon speakerSimpleX(PhosphorWeight weight) {
        return icon("speaker-simple-x", weight);
    }

    public static Icon speakerSlash() {
        return speakerSlash(PhosphorWeight.REGULAR);
    }

    public static Icon speakerSlash(PhosphorWeight weight) {
        return icon("speaker-slash", weight);
    }

    public static Icon speakerX() {
        return speakerX(PhosphorWeight.REGULAR);
    }

    public static Icon speakerX(PhosphorWeight weight) {
        return icon("speaker-x", weight);
    }

    public static Icon speedometer() {
        return speedometer(PhosphorWeight.REGULAR);
    }

    public static Icon speedometer(PhosphorWeight weight) {
        return icon("speedometer", weight);
    }

    public static Icon sphere() {
        return sphere(PhosphorWeight.REGULAR);
    }

    public static Icon sphere(PhosphorWeight weight) {
        return icon("sphere", weight);
    }

    public static Icon spinner() {
        return spinner(PhosphorWeight.REGULAR);
    }

    public static Icon spinner(PhosphorWeight weight) {
        return icon("spinner", weight);
    }

    public static Icon spinnerBall() {
        return spinnerBall(PhosphorWeight.REGULAR);
    }

    public static Icon spinnerBall(PhosphorWeight weight) {
        return icon("spinner-ball", weight);
    }

    public static Icon spinnerGap() {
        return spinnerGap(PhosphorWeight.REGULAR);
    }

    public static Icon spinnerGap(PhosphorWeight weight) {
        return icon("spinner-gap", weight);
    }

    public static Icon spiral() {
        return spiral(PhosphorWeight.REGULAR);
    }

    public static Icon spiral(PhosphorWeight weight) {
        return icon("spiral", weight);
    }

    public static Icon splitHorizontal() {
        return splitHorizontal(PhosphorWeight.REGULAR);
    }

    public static Icon splitHorizontal(PhosphorWeight weight) {
        return icon("split-horizontal", weight);
    }

    public static Icon splitVertical() {
        return splitVertical(PhosphorWeight.REGULAR);
    }

    public static Icon splitVertical(PhosphorWeight weight) {
        return icon("split-vertical", weight);
    }

    public static Icon spotifyLogo() {
        return spotifyLogo(PhosphorWeight.REGULAR);
    }

    public static Icon spotifyLogo(PhosphorWeight weight) {
        return icon("spotify-logo", weight);
    }

    public static Icon sprayBottle() {
        return sprayBottle(PhosphorWeight.REGULAR);
    }

    public static Icon sprayBottle(PhosphorWeight weight) {
        return icon("spray-bottle", weight);
    }

    public static Icon square() {
        return square(PhosphorWeight.REGULAR);
    }

    public static Icon square(PhosphorWeight weight) {
        return icon("square", weight);
    }

    public static Icon squareHalf() {
        return squareHalf(PhosphorWeight.REGULAR);
    }

    public static Icon squareHalf(PhosphorWeight weight) {
        return icon("square-half", weight);
    }

    public static Icon squareHalfBottom() {
        return squareHalfBottom(PhosphorWeight.REGULAR);
    }

    public static Icon squareHalfBottom(PhosphorWeight weight) {
        return icon("square-half-bottom", weight);
    }

    public static Icon squareLogo() {
        return squareLogo(PhosphorWeight.REGULAR);
    }

    public static Icon squareLogo(PhosphorWeight weight) {
        return icon("square-logo", weight);
    }

    public static Icon squareSplitHorizontal() {
        return squareSplitHorizontal(PhosphorWeight.REGULAR);
    }

    public static Icon squareSplitHorizontal(PhosphorWeight weight) {
        return icon("square-split-horizontal", weight);
    }

    public static Icon squareSplitVertical() {
        return squareSplitVertical(PhosphorWeight.REGULAR);
    }

    public static Icon squareSplitVertical(PhosphorWeight weight) {
        return icon("square-split-vertical", weight);
    }

    public static Icon squaresFour() {
        return squaresFour(PhosphorWeight.REGULAR);
    }

    public static Icon squaresFour(PhosphorWeight weight) {
        return icon("squares-four", weight);
    }

    public static Icon stack() {
        return stack(PhosphorWeight.REGULAR);
    }

    public static Icon stack(PhosphorWeight weight) {
        return icon("stack", weight);
    }

    public static Icon stackMinus() {
        return stackMinus(PhosphorWeight.REGULAR);
    }

    public static Icon stackMinus(PhosphorWeight weight) {
        return icon("stack-minus", weight);
    }

    public static Icon stackOverflowLogo() {
        return stackOverflowLogo(PhosphorWeight.REGULAR);
    }

    public static Icon stackOverflowLogo(PhosphorWeight weight) {
        return icon("stack-overflow-logo", weight);
    }

    public static Icon stackPlus() {
        return stackPlus(PhosphorWeight.REGULAR);
    }

    public static Icon stackPlus(PhosphorWeight weight) {
        return icon("stack-plus", weight);
    }

    public static Icon stackSimple() {
        return stackSimple(PhosphorWeight.REGULAR);
    }

    public static Icon stackSimple(PhosphorWeight weight) {
        return icon("stack-simple", weight);
    }

    public static Icon stairs() {
        return stairs(PhosphorWeight.REGULAR);
    }

    public static Icon stairs(PhosphorWeight weight) {
        return icon("stairs", weight);
    }

    public static Icon stamp() {
        return stamp(PhosphorWeight.REGULAR);
    }

    public static Icon stamp(PhosphorWeight weight) {
        return icon("stamp", weight);
    }

    public static Icon standardDefinition() {
        return standardDefinition(PhosphorWeight.REGULAR);
    }

    public static Icon standardDefinition(PhosphorWeight weight) {
        return icon("standard-definition", weight);
    }

    public static Icon star() {
        return star(PhosphorWeight.REGULAR);
    }

    public static Icon star(PhosphorWeight weight) {
        return icon("star", weight);
    }

    public static Icon starAndCrescent() {
        return starAndCrescent(PhosphorWeight.REGULAR);
    }

    public static Icon starAndCrescent(PhosphorWeight weight) {
        return icon("star-and-crescent", weight);
    }

    public static Icon starFour() {
        return starFour(PhosphorWeight.REGULAR);
    }

    public static Icon starFour(PhosphorWeight weight) {
        return icon("star-four", weight);
    }

    public static Icon starHalf() {
        return starHalf(PhosphorWeight.REGULAR);
    }

    public static Icon starHalf(PhosphorWeight weight) {
        return icon("star-half", weight);
    }

    public static Icon starOfDavid() {
        return starOfDavid(PhosphorWeight.REGULAR);
    }

    public static Icon starOfDavid(PhosphorWeight weight) {
        return icon("star-of-david", weight);
    }

    public static Icon steamLogo() {
        return steamLogo(PhosphorWeight.REGULAR);
    }

    public static Icon steamLogo(PhosphorWeight weight) {
        return icon("steam-logo", weight);
    }

    public static Icon steeringWheel() {
        return steeringWheel(PhosphorWeight.REGULAR);
    }

    public static Icon steeringWheel(PhosphorWeight weight) {
        return icon("steering-wheel", weight);
    }

    public static Icon steps() {
        return steps(PhosphorWeight.REGULAR);
    }

    public static Icon steps(PhosphorWeight weight) {
        return icon("steps", weight);
    }

    public static Icon stethoscope() {
        return stethoscope(PhosphorWeight.REGULAR);
    }

    public static Icon stethoscope(PhosphorWeight weight) {
        return icon("stethoscope", weight);
    }

    public static Icon sticker() {
        return sticker(PhosphorWeight.REGULAR);
    }

    public static Icon sticker(PhosphorWeight weight) {
        return icon("sticker", weight);
    }

    public static Icon stool() {
        return stool(PhosphorWeight.REGULAR);
    }

    public static Icon stool(PhosphorWeight weight) {
        return icon("stool", weight);
    }

    public static Icon stop() {
        return stop(PhosphorWeight.REGULAR);
    }

    public static Icon stop(PhosphorWeight weight) {
        return icon("stop", weight);
    }

    public static Icon stopCircle() {
        return stopCircle(PhosphorWeight.REGULAR);
    }

    public static Icon stopCircle(PhosphorWeight weight) {
        return icon("stop-circle", weight);
    }

    public static Icon storefront() {
        return storefront(PhosphorWeight.REGULAR);
    }

    public static Icon storefront(PhosphorWeight weight) {
        return icon("storefront", weight);
    }

    public static Icon strategy() {
        return strategy(PhosphorWeight.REGULAR);
    }

    public static Icon strategy(PhosphorWeight weight) {
        return icon("strategy", weight);
    }

    public static Icon stripeLogo() {
        return stripeLogo(PhosphorWeight.REGULAR);
    }

    public static Icon stripeLogo(PhosphorWeight weight) {
        return icon("stripe-logo", weight);
    }

    public static Icon student() {
        return student(PhosphorWeight.REGULAR);
    }

    public static Icon student(PhosphorWeight weight) {
        return icon("student", weight);
    }

    public static Icon subsetOf() {
        return subsetOf(PhosphorWeight.REGULAR);
    }

    public static Icon subsetOf(PhosphorWeight weight) {
        return icon("subset-of", weight);
    }

    public static Icon subsetProperOf() {
        return subsetProperOf(PhosphorWeight.REGULAR);
    }

    public static Icon subsetProperOf(PhosphorWeight weight) {
        return icon("subset-proper-of", weight);
    }

    public static Icon subtitles() {
        return subtitles(PhosphorWeight.REGULAR);
    }

    public static Icon subtitles(PhosphorWeight weight) {
        return icon("subtitles", weight);
    }

    public static Icon subtitlesSlash() {
        return subtitlesSlash(PhosphorWeight.REGULAR);
    }

    public static Icon subtitlesSlash(PhosphorWeight weight) {
        return icon("subtitles-slash", weight);
    }

    public static Icon subtract() {
        return subtract(PhosphorWeight.REGULAR);
    }

    public static Icon subtract(PhosphorWeight weight) {
        return icon("subtract", weight);
    }

    public static Icon subtractSquare() {
        return subtractSquare(PhosphorWeight.REGULAR);
    }

    public static Icon subtractSquare(PhosphorWeight weight) {
        return icon("subtract-square", weight);
    }

    public static Icon subway() {
        return subway(PhosphorWeight.REGULAR);
    }

    public static Icon subway(PhosphorWeight weight) {
        return icon("subway", weight);
    }

    public static Icon suitcase() {
        return suitcase(PhosphorWeight.REGULAR);
    }

    public static Icon suitcase(PhosphorWeight weight) {
        return icon("suitcase", weight);
    }

    public static Icon suitcaseRolling() {
        return suitcaseRolling(PhosphorWeight.REGULAR);
    }

    public static Icon suitcaseRolling(PhosphorWeight weight) {
        return icon("suitcase-rolling", weight);
    }

    public static Icon suitcaseSimple() {
        return suitcaseSimple(PhosphorWeight.REGULAR);
    }

    public static Icon suitcaseSimple(PhosphorWeight weight) {
        return icon("suitcase-simple", weight);
    }

    public static Icon sun() {
        return sun(PhosphorWeight.REGULAR);
    }

    public static Icon sun(PhosphorWeight weight) {
        return icon("sun", weight);
    }

    public static Icon sunDim() {
        return sunDim(PhosphorWeight.REGULAR);
    }

    public static Icon sunDim(PhosphorWeight weight) {
        return icon("sun-dim", weight);
    }

    public static Icon sunHorizon() {
        return sunHorizon(PhosphorWeight.REGULAR);
    }

    public static Icon sunHorizon(PhosphorWeight weight) {
        return icon("sun-horizon", weight);
    }

    public static Icon sunglasses() {
        return sunglasses(PhosphorWeight.REGULAR);
    }

    public static Icon sunglasses(PhosphorWeight weight) {
        return icon("sunglasses", weight);
    }

    public static Icon supersetOf() {
        return supersetOf(PhosphorWeight.REGULAR);
    }

    public static Icon supersetOf(PhosphorWeight weight) {
        return icon("superset-of", weight);
    }

    public static Icon supersetProperOf() {
        return supersetProperOf(PhosphorWeight.REGULAR);
    }

    public static Icon supersetProperOf(PhosphorWeight weight) {
        return icon("superset-proper-of", weight);
    }

    public static Icon swap() {
        return swap(PhosphorWeight.REGULAR);
    }

    public static Icon swap(PhosphorWeight weight) {
        return icon("swap", weight);
    }

    public static Icon swatches() {
        return swatches(PhosphorWeight.REGULAR);
    }

    public static Icon swatches(PhosphorWeight weight) {
        return icon("swatches", weight);
    }

    public static Icon swimmingPool() {
        return swimmingPool(PhosphorWeight.REGULAR);
    }

    public static Icon swimmingPool(PhosphorWeight weight) {
        return icon("swimming-pool", weight);
    }

    public static Icon sword() {
        return sword(PhosphorWeight.REGULAR);
    }

    public static Icon sword(PhosphorWeight weight) {
        return icon("sword", weight);
    }

    public static Icon synagogue() {
        return synagogue(PhosphorWeight.REGULAR);
    }

    public static Icon synagogue(PhosphorWeight weight) {
        return icon("synagogue", weight);
    }

    public static Icon syringe() {
        return syringe(PhosphorWeight.REGULAR);
    }

    public static Icon syringe(PhosphorWeight weight) {
        return icon("syringe", weight);
    }

    public static Icon tShirt() {
        return tShirt(PhosphorWeight.REGULAR);
    }

    public static Icon tShirt(PhosphorWeight weight) {
        return icon("t-shirt", weight);
    }

    public static Icon table() {
        return table(PhosphorWeight.REGULAR);
    }

    public static Icon table(PhosphorWeight weight) {
        return icon("table", weight);
    }

    public static Icon tabs() {
        return tabs(PhosphorWeight.REGULAR);
    }

    public static Icon tabs(PhosphorWeight weight) {
        return icon("tabs", weight);
    }

    public static Icon tag() {
        return tag(PhosphorWeight.REGULAR);
    }

    public static Icon tag(PhosphorWeight weight) {
        return icon("tag", weight);
    }

    public static Icon tagChevron() {
        return tagChevron(PhosphorWeight.REGULAR);
    }

    public static Icon tagChevron(PhosphorWeight weight) {
        return icon("tag-chevron", weight);
    }

    public static Icon tagSimple() {
        return tagSimple(PhosphorWeight.REGULAR);
    }

    public static Icon tagSimple(PhosphorWeight weight) {
        return icon("tag-simple", weight);
    }

    public static Icon target() {
        return target(PhosphorWeight.REGULAR);
    }

    public static Icon target(PhosphorWeight weight) {
        return icon("target", weight);
    }

    public static Icon taxi() {
        return taxi(PhosphorWeight.REGULAR);
    }

    public static Icon taxi(PhosphorWeight weight) {
        return icon("taxi", weight);
    }

    public static Icon teaBag() {
        return teaBag(PhosphorWeight.REGULAR);
    }

    public static Icon teaBag(PhosphorWeight weight) {
        return icon("tea-bag", weight);
    }

    public static Icon telegramLogo() {
        return telegramLogo(PhosphorWeight.REGULAR);
    }

    public static Icon telegramLogo(PhosphorWeight weight) {
        return icon("telegram-logo", weight);
    }

    public static Icon television() {
        return television(PhosphorWeight.REGULAR);
    }

    public static Icon television(PhosphorWeight weight) {
        return icon("television", weight);
    }

    public static Icon televisionSimple() {
        return televisionSimple(PhosphorWeight.REGULAR);
    }

    public static Icon televisionSimple(PhosphorWeight weight) {
        return icon("television-simple", weight);
    }

    public static Icon tennisBall() {
        return tennisBall(PhosphorWeight.REGULAR);
    }

    public static Icon tennisBall(PhosphorWeight weight) {
        return icon("tennis-ball", weight);
    }

    public static Icon tent() {
        return tent(PhosphorWeight.REGULAR);
    }

    public static Icon tent(PhosphorWeight weight) {
        return icon("tent", weight);
    }

    public static Icon terminal() {
        return terminal(PhosphorWeight.REGULAR);
    }

    public static Icon terminal(PhosphorWeight weight) {
        return icon("terminal", weight);
    }

    public static Icon terminalWindow() {
        return terminalWindow(PhosphorWeight.REGULAR);
    }

    public static Icon terminalWindow(PhosphorWeight weight) {
        return icon("terminal-window", weight);
    }

    public static Icon testTube() {
        return testTube(PhosphorWeight.REGULAR);
    }

    public static Icon testTube(PhosphorWeight weight) {
        return icon("test-tube", weight);
    }

    public static Icon textAUnderline() {
        return textAUnderline(PhosphorWeight.REGULAR);
    }

    public static Icon textAUnderline(PhosphorWeight weight) {
        return icon("text-a-underline", weight);
    }

    public static Icon textAa() {
        return textAa(PhosphorWeight.REGULAR);
    }

    public static Icon textAa(PhosphorWeight weight) {
        return icon("text-aa", weight);
    }

    public static Icon textAlignCenter() {
        return textAlignCenter(PhosphorWeight.REGULAR);
    }

    public static Icon textAlignCenter(PhosphorWeight weight) {
        return icon("text-align-center", weight);
    }

    public static Icon textAlignJustify() {
        return textAlignJustify(PhosphorWeight.REGULAR);
    }

    public static Icon textAlignJustify(PhosphorWeight weight) {
        return icon("text-align-justify", weight);
    }

    public static Icon textAlignLeft() {
        return textAlignLeft(PhosphorWeight.REGULAR);
    }

    public static Icon textAlignLeft(PhosphorWeight weight) {
        return icon("text-align-left", weight);
    }

    public static Icon textAlignRight() {
        return textAlignRight(PhosphorWeight.REGULAR);
    }

    public static Icon textAlignRight(PhosphorWeight weight) {
        return icon("text-align-right", weight);
    }

    public static Icon textB() {
        return textB(PhosphorWeight.REGULAR);
    }

    public static Icon textB(PhosphorWeight weight) {
        return icon("text-b", weight);
    }

    public static Icon textColumns() {
        return textColumns(PhosphorWeight.REGULAR);
    }

    public static Icon textColumns(PhosphorWeight weight) {
        return icon("text-columns", weight);
    }

    public static Icon textH() {
        return textH(PhosphorWeight.REGULAR);
    }

    public static Icon textH(PhosphorWeight weight) {
        return icon("text-h", weight);
    }

    public static Icon textHFive() {
        return textHFive(PhosphorWeight.REGULAR);
    }

    public static Icon textHFive(PhosphorWeight weight) {
        return icon("text-h-five", weight);
    }

    public static Icon textHFour() {
        return textHFour(PhosphorWeight.REGULAR);
    }

    public static Icon textHFour(PhosphorWeight weight) {
        return icon("text-h-four", weight);
    }

    public static Icon textHOne() {
        return textHOne(PhosphorWeight.REGULAR);
    }

    public static Icon textHOne(PhosphorWeight weight) {
        return icon("text-h-one", weight);
    }

    public static Icon textHSix() {
        return textHSix(PhosphorWeight.REGULAR);
    }

    public static Icon textHSix(PhosphorWeight weight) {
        return icon("text-h-six", weight);
    }

    public static Icon textHThree() {
        return textHThree(PhosphorWeight.REGULAR);
    }

    public static Icon textHThree(PhosphorWeight weight) {
        return icon("text-h-three", weight);
    }

    public static Icon textHTwo() {
        return textHTwo(PhosphorWeight.REGULAR);
    }

    public static Icon textHTwo(PhosphorWeight weight) {
        return icon("text-h-two", weight);
    }

    public static Icon textIndent() {
        return textIndent(PhosphorWeight.REGULAR);
    }

    public static Icon textIndent(PhosphorWeight weight) {
        return icon("text-indent", weight);
    }

    public static Icon textItalic() {
        return textItalic(PhosphorWeight.REGULAR);
    }

    public static Icon textItalic(PhosphorWeight weight) {
        return icon("text-italic", weight);
    }

    public static Icon textOutdent() {
        return textOutdent(PhosphorWeight.REGULAR);
    }

    public static Icon textOutdent(PhosphorWeight weight) {
        return icon("text-outdent", weight);
    }

    public static Icon textStrikethrough() {
        return textStrikethrough(PhosphorWeight.REGULAR);
    }

    public static Icon textStrikethrough(PhosphorWeight weight) {
        return icon("text-strikethrough", weight);
    }

    public static Icon textSubscript() {
        return textSubscript(PhosphorWeight.REGULAR);
    }

    public static Icon textSubscript(PhosphorWeight weight) {
        return icon("text-subscript", weight);
    }

    public static Icon textSuperscript() {
        return textSuperscript(PhosphorWeight.REGULAR);
    }

    public static Icon textSuperscript(PhosphorWeight weight) {
        return icon("text-superscript", weight);
    }

    public static Icon textT() {
        return textT(PhosphorWeight.REGULAR);
    }

    public static Icon textT(PhosphorWeight weight) {
        return icon("text-t", weight);
    }

    public static Icon textTSlash() {
        return textTSlash(PhosphorWeight.REGULAR);
    }

    public static Icon textTSlash(PhosphorWeight weight) {
        return icon("text-t-slash", weight);
    }

    public static Icon textUnderline() {
        return textUnderline(PhosphorWeight.REGULAR);
    }

    public static Icon textUnderline(PhosphorWeight weight) {
        return icon("text-underline", weight);
    }

    public static Icon textbox() {
        return textbox(PhosphorWeight.REGULAR);
    }

    public static Icon textbox(PhosphorWeight weight) {
        return icon("textbox", weight);
    }

    public static Icon thermometer() {
        return thermometer(PhosphorWeight.REGULAR);
    }

    public static Icon thermometer(PhosphorWeight weight) {
        return icon("thermometer", weight);
    }

    public static Icon thermometerCold() {
        return thermometerCold(PhosphorWeight.REGULAR);
    }

    public static Icon thermometerCold(PhosphorWeight weight) {
        return icon("thermometer-cold", weight);
    }

    public static Icon thermometerHot() {
        return thermometerHot(PhosphorWeight.REGULAR);
    }

    public static Icon thermometerHot(PhosphorWeight weight) {
        return icon("thermometer-hot", weight);
    }

    public static Icon thermometerSimple() {
        return thermometerSimple(PhosphorWeight.REGULAR);
    }

    public static Icon thermometerSimple(PhosphorWeight weight) {
        return icon("thermometer-simple", weight);
    }

    public static Icon threadsLogo() {
        return threadsLogo(PhosphorWeight.REGULAR);
    }

    public static Icon threadsLogo(PhosphorWeight weight) {
        return icon("threads-logo", weight);
    }

    public static Icon threeD() {
        return threeD(PhosphorWeight.REGULAR);
    }

    public static Icon threeD(PhosphorWeight weight) {
        return icon("three-d", weight);
    }

    public static Icon thumbsDown() {
        return thumbsDown(PhosphorWeight.REGULAR);
    }

    public static Icon thumbsDown(PhosphorWeight weight) {
        return icon("thumbs-down", weight);
    }

    public static Icon thumbsUp() {
        return thumbsUp(PhosphorWeight.REGULAR);
    }

    public static Icon thumbsUp(PhosphorWeight weight) {
        return icon("thumbs-up", weight);
    }

    public static Icon ticket() {
        return ticket(PhosphorWeight.REGULAR);
    }

    public static Icon ticket(PhosphorWeight weight) {
        return icon("ticket", weight);
    }

    public static Icon tidalLogo() {
        return tidalLogo(PhosphorWeight.REGULAR);
    }

    public static Icon tidalLogo(PhosphorWeight weight) {
        return icon("tidal-logo", weight);
    }

    public static Icon tiktokLogo() {
        return tiktokLogo(PhosphorWeight.REGULAR);
    }

    public static Icon tiktokLogo(PhosphorWeight weight) {
        return icon("tiktok-logo", weight);
    }

    public static Icon tilde() {
        return tilde(PhosphorWeight.REGULAR);
    }

    public static Icon tilde(PhosphorWeight weight) {
        return icon("tilde", weight);
    }

    public static Icon timer() {
        return timer(PhosphorWeight.REGULAR);
    }

    public static Icon timer(PhosphorWeight weight) {
        return icon("timer", weight);
    }

    public static Icon tipJar() {
        return tipJar(PhosphorWeight.REGULAR);
    }

    public static Icon tipJar(PhosphorWeight weight) {
        return icon("tip-jar", weight);
    }

    public static Icon tipi() {
        return tipi(PhosphorWeight.REGULAR);
    }

    public static Icon tipi(PhosphorWeight weight) {
        return icon("tipi", weight);
    }

    public static Icon tire() {
        return tire(PhosphorWeight.REGULAR);
    }

    public static Icon tire(PhosphorWeight weight) {
        return icon("tire", weight);
    }

    public static Icon toggleLeft() {
        return toggleLeft(PhosphorWeight.REGULAR);
    }

    public static Icon toggleLeft(PhosphorWeight weight) {
        return icon("toggle-left", weight);
    }

    public static Icon toggleRight() {
        return toggleRight(PhosphorWeight.REGULAR);
    }

    public static Icon toggleRight(PhosphorWeight weight) {
        return icon("toggle-right", weight);
    }

    public static Icon toilet() {
        return toilet(PhosphorWeight.REGULAR);
    }

    public static Icon toilet(PhosphorWeight weight) {
        return icon("toilet", weight);
    }

    public static Icon toiletPaper() {
        return toiletPaper(PhosphorWeight.REGULAR);
    }

    public static Icon toiletPaper(PhosphorWeight weight) {
        return icon("toilet-paper", weight);
    }

    public static Icon toolbox() {
        return toolbox(PhosphorWeight.REGULAR);
    }

    public static Icon toolbox(PhosphorWeight weight) {
        return icon("toolbox", weight);
    }

    public static Icon tooth() {
        return tooth(PhosphorWeight.REGULAR);
    }

    public static Icon tooth(PhosphorWeight weight) {
        return icon("tooth", weight);
    }

    public static Icon tornado() {
        return tornado(PhosphorWeight.REGULAR);
    }

    public static Icon tornado(PhosphorWeight weight) {
        return icon("tornado", weight);
    }

    public static Icon tote() {
        return tote(PhosphorWeight.REGULAR);
    }

    public static Icon tote(PhosphorWeight weight) {
        return icon("tote", weight);
    }

    public static Icon toteSimple() {
        return toteSimple(PhosphorWeight.REGULAR);
    }

    public static Icon toteSimple(PhosphorWeight weight) {
        return icon("tote-simple", weight);
    }

    public static Icon towel() {
        return towel(PhosphorWeight.REGULAR);
    }

    public static Icon towel(PhosphorWeight weight) {
        return icon("towel", weight);
    }

    public static Icon tractor() {
        return tractor(PhosphorWeight.REGULAR);
    }

    public static Icon tractor(PhosphorWeight weight) {
        return icon("tractor", weight);
    }

    public static Icon trademark() {
        return trademark(PhosphorWeight.REGULAR);
    }

    public static Icon trademark(PhosphorWeight weight) {
        return icon("trademark", weight);
    }

    public static Icon trademarkRegistered() {
        return trademarkRegistered(PhosphorWeight.REGULAR);
    }

    public static Icon trademarkRegistered(PhosphorWeight weight) {
        return icon("trademark-registered", weight);
    }

    public static Icon trafficCone() {
        return trafficCone(PhosphorWeight.REGULAR);
    }

    public static Icon trafficCone(PhosphorWeight weight) {
        return icon("traffic-cone", weight);
    }

    public static Icon trafficSign() {
        return trafficSign(PhosphorWeight.REGULAR);
    }

    public static Icon trafficSign(PhosphorWeight weight) {
        return icon("traffic-sign", weight);
    }

    public static Icon trafficSignal() {
        return trafficSignal(PhosphorWeight.REGULAR);
    }

    public static Icon trafficSignal(PhosphorWeight weight) {
        return icon("traffic-signal", weight);
    }

    public static Icon train() {
        return train(PhosphorWeight.REGULAR);
    }

    public static Icon train(PhosphorWeight weight) {
        return icon("train", weight);
    }

    public static Icon trainRegional() {
        return trainRegional(PhosphorWeight.REGULAR);
    }

    public static Icon trainRegional(PhosphorWeight weight) {
        return icon("train-regional", weight);
    }

    public static Icon trainSimple() {
        return trainSimple(PhosphorWeight.REGULAR);
    }

    public static Icon trainSimple(PhosphorWeight weight) {
        return icon("train-simple", weight);
    }

    public static Icon tram() {
        return tram(PhosphorWeight.REGULAR);
    }

    public static Icon tram(PhosphorWeight weight) {
        return icon("tram", weight);
    }

    public static Icon translate() {
        return translate(PhosphorWeight.REGULAR);
    }

    public static Icon translate(PhosphorWeight weight) {
        return icon("translate", weight);
    }

    public static Icon trash() {
        return trash(PhosphorWeight.REGULAR);
    }

    public static Icon trash(PhosphorWeight weight) {
        return icon("trash", weight);
    }

    public static Icon trashSimple() {
        return trashSimple(PhosphorWeight.REGULAR);
    }

    public static Icon trashSimple(PhosphorWeight weight) {
        return icon("trash-simple", weight);
    }

    public static Icon tray() {
        return tray(PhosphorWeight.REGULAR);
    }

    public static Icon tray(PhosphorWeight weight) {
        return icon("tray", weight);
    }

    public static Icon trayArrowDown() {
        return trayArrowDown(PhosphorWeight.REGULAR);
    }

    public static Icon trayArrowDown(PhosphorWeight weight) {
        return icon("tray-arrow-down", weight);
    }

    public static Icon trayArrowUp() {
        return trayArrowUp(PhosphorWeight.REGULAR);
    }

    public static Icon trayArrowUp(PhosphorWeight weight) {
        return icon("tray-arrow-up", weight);
    }

    public static Icon treasureChest() {
        return treasureChest(PhosphorWeight.REGULAR);
    }

    public static Icon treasureChest(PhosphorWeight weight) {
        return icon("treasure-chest", weight);
    }

    public static Icon tree() {
        return tree(PhosphorWeight.REGULAR);
    }

    public static Icon tree(PhosphorWeight weight) {
        return icon("tree", weight);
    }

    public static Icon treeEvergreen() {
        return treeEvergreen(PhosphorWeight.REGULAR);
    }

    public static Icon treeEvergreen(PhosphorWeight weight) {
        return icon("tree-evergreen", weight);
    }

    public static Icon treePalm() {
        return treePalm(PhosphorWeight.REGULAR);
    }

    public static Icon treePalm(PhosphorWeight weight) {
        return icon("tree-palm", weight);
    }

    public static Icon treeStructure() {
        return treeStructure(PhosphorWeight.REGULAR);
    }

    public static Icon treeStructure(PhosphorWeight weight) {
        return icon("tree-structure", weight);
    }

    public static Icon treeView() {
        return treeView(PhosphorWeight.REGULAR);
    }

    public static Icon treeView(PhosphorWeight weight) {
        return icon("tree-view", weight);
    }

    public static Icon trendDown() {
        return trendDown(PhosphorWeight.REGULAR);
    }

    public static Icon trendDown(PhosphorWeight weight) {
        return icon("trend-down", weight);
    }

    public static Icon trendUp() {
        return trendUp(PhosphorWeight.REGULAR);
    }

    public static Icon trendUp(PhosphorWeight weight) {
        return icon("trend-up", weight);
    }

    public static Icon triangle() {
        return triangle(PhosphorWeight.REGULAR);
    }

    public static Icon triangle(PhosphorWeight weight) {
        return icon("triangle", weight);
    }

    public static Icon triangleDashed() {
        return triangleDashed(PhosphorWeight.REGULAR);
    }

    public static Icon triangleDashed(PhosphorWeight weight) {
        return icon("triangle-dashed", weight);
    }

    public static Icon trolley() {
        return trolley(PhosphorWeight.REGULAR);
    }

    public static Icon trolley(PhosphorWeight weight) {
        return icon("trolley", weight);
    }

    public static Icon trolleySuitcase() {
        return trolleySuitcase(PhosphorWeight.REGULAR);
    }

    public static Icon trolleySuitcase(PhosphorWeight weight) {
        return icon("trolley-suitcase", weight);
    }

    public static Icon trophy() {
        return trophy(PhosphorWeight.REGULAR);
    }

    public static Icon trophy(PhosphorWeight weight) {
        return icon("trophy", weight);
    }

    public static Icon truck() {
        return truck(PhosphorWeight.REGULAR);
    }

    public static Icon truck(PhosphorWeight weight) {
        return icon("truck", weight);
    }

    public static Icon truckTrailer() {
        return truckTrailer(PhosphorWeight.REGULAR);
    }

    public static Icon truckTrailer(PhosphorWeight weight) {
        return icon("truck-trailer", weight);
    }

    public static Icon tumblrLogo() {
        return tumblrLogo(PhosphorWeight.REGULAR);
    }

    public static Icon tumblrLogo(PhosphorWeight weight) {
        return icon("tumblr-logo", weight);
    }

    public static Icon twitchLogo() {
        return twitchLogo(PhosphorWeight.REGULAR);
    }

    public static Icon twitchLogo(PhosphorWeight weight) {
        return icon("twitch-logo", weight);
    }

    public static Icon twitterLogo() {
        return twitterLogo(PhosphorWeight.REGULAR);
    }

    public static Icon twitterLogo(PhosphorWeight weight) {
        return icon("twitter-logo", weight);
    }

    public static Icon umbrella() {
        return umbrella(PhosphorWeight.REGULAR);
    }

    public static Icon umbrella(PhosphorWeight weight) {
        return icon("umbrella", weight);
    }

    public static Icon umbrellaSimple() {
        return umbrellaSimple(PhosphorWeight.REGULAR);
    }

    public static Icon umbrellaSimple(PhosphorWeight weight) {
        return icon("umbrella-simple", weight);
    }

    public static Icon union() {
        return union(PhosphorWeight.REGULAR);
    }

    public static Icon union(PhosphorWeight weight) {
        return icon("union", weight);
    }

    public static Icon unite() {
        return unite(PhosphorWeight.REGULAR);
    }

    public static Icon unite(PhosphorWeight weight) {
        return icon("unite", weight);
    }

    public static Icon uniteSquare() {
        return uniteSquare(PhosphorWeight.REGULAR);
    }

    public static Icon uniteSquare(PhosphorWeight weight) {
        return icon("unite-square", weight);
    }

    public static Icon upload() {
        return upload(PhosphorWeight.REGULAR);
    }

    public static Icon upload(PhosphorWeight weight) {
        return icon("upload", weight);
    }

    public static Icon uploadSimple() {
        return uploadSimple(PhosphorWeight.REGULAR);
    }

    public static Icon uploadSimple(PhosphorWeight weight) {
        return icon("upload-simple", weight);
    }

    public static Icon usb() {
        return usb(PhosphorWeight.REGULAR);
    }

    public static Icon usb(PhosphorWeight weight) {
        return icon("usb", weight);
    }

    public static Icon user() {
        return user(PhosphorWeight.REGULAR);
    }

    public static Icon user(PhosphorWeight weight) {
        return icon("user", weight);
    }

    public static Icon userCheck() {
        return userCheck(PhosphorWeight.REGULAR);
    }

    public static Icon userCheck(PhosphorWeight weight) {
        return icon("user-check", weight);
    }

    public static Icon userCircle() {
        return userCircle(PhosphorWeight.REGULAR);
    }

    public static Icon userCircle(PhosphorWeight weight) {
        return icon("user-circle", weight);
    }

    public static Icon userCircleCheck() {
        return userCircleCheck(PhosphorWeight.REGULAR);
    }

    public static Icon userCircleCheck(PhosphorWeight weight) {
        return icon("user-circle-check", weight);
    }

    public static Icon userCircleDashed() {
        return userCircleDashed(PhosphorWeight.REGULAR);
    }

    public static Icon userCircleDashed(PhosphorWeight weight) {
        return icon("user-circle-dashed", weight);
    }

    public static Icon userCircleGear() {
        return userCircleGear(PhosphorWeight.REGULAR);
    }

    public static Icon userCircleGear(PhosphorWeight weight) {
        return icon("user-circle-gear", weight);
    }

    public static Icon userCircleMinus() {
        return userCircleMinus(PhosphorWeight.REGULAR);
    }

    public static Icon userCircleMinus(PhosphorWeight weight) {
        return icon("user-circle-minus", weight);
    }

    public static Icon userCirclePlus() {
        return userCirclePlus(PhosphorWeight.REGULAR);
    }

    public static Icon userCirclePlus(PhosphorWeight weight) {
        return icon("user-circle-plus", weight);
    }

    public static Icon userFocus() {
        return userFocus(PhosphorWeight.REGULAR);
    }

    public static Icon userFocus(PhosphorWeight weight) {
        return icon("user-focus", weight);
    }

    public static Icon userGear() {
        return userGear(PhosphorWeight.REGULAR);
    }

    public static Icon userGear(PhosphorWeight weight) {
        return icon("user-gear", weight);
    }

    public static Icon userList() {
        return userList(PhosphorWeight.REGULAR);
    }

    public static Icon userList(PhosphorWeight weight) {
        return icon("user-list", weight);
    }

    public static Icon userMinus() {
        return userMinus(PhosphorWeight.REGULAR);
    }

    public static Icon userMinus(PhosphorWeight weight) {
        return icon("user-minus", weight);
    }

    public static Icon userPlus() {
        return userPlus(PhosphorWeight.REGULAR);
    }

    public static Icon userPlus(PhosphorWeight weight) {
        return icon("user-plus", weight);
    }

    public static Icon userRectangle() {
        return userRectangle(PhosphorWeight.REGULAR);
    }

    public static Icon userRectangle(PhosphorWeight weight) {
        return icon("user-rectangle", weight);
    }

    public static Icon userSound() {
        return userSound(PhosphorWeight.REGULAR);
    }

    public static Icon userSound(PhosphorWeight weight) {
        return icon("user-sound", weight);
    }

    public static Icon userSquare() {
        return userSquare(PhosphorWeight.REGULAR);
    }

    public static Icon userSquare(PhosphorWeight weight) {
        return icon("user-square", weight);
    }

    public static Icon userSwitch() {
        return userSwitch(PhosphorWeight.REGULAR);
    }

    public static Icon userSwitch(PhosphorWeight weight) {
        return icon("user-switch", weight);
    }

    public static Icon users() {
        return users(PhosphorWeight.REGULAR);
    }

    public static Icon users(PhosphorWeight weight) {
        return icon("users", weight);
    }

    public static Icon usersFour() {
        return usersFour(PhosphorWeight.REGULAR);
    }

    public static Icon usersFour(PhosphorWeight weight) {
        return icon("users-four", weight);
    }

    public static Icon usersThree() {
        return usersThree(PhosphorWeight.REGULAR);
    }

    public static Icon usersThree(PhosphorWeight weight) {
        return icon("users-three", weight);
    }

    public static Icon van() {
        return van(PhosphorWeight.REGULAR);
    }

    public static Icon van(PhosphorWeight weight) {
        return icon("van", weight);
    }

    public static Icon vault() {
        return vault(PhosphorWeight.REGULAR);
    }

    public static Icon vault(PhosphorWeight weight) {
        return icon("vault", weight);
    }

    public static Icon vectorThree() {
        return vectorThree(PhosphorWeight.REGULAR);
    }

    public static Icon vectorThree(PhosphorWeight weight) {
        return icon("vector-three", weight);
    }

    public static Icon vectorTwo() {
        return vectorTwo(PhosphorWeight.REGULAR);
    }

    public static Icon vectorTwo(PhosphorWeight weight) {
        return icon("vector-two", weight);
    }

    public static Icon vibrate() {
        return vibrate(PhosphorWeight.REGULAR);
    }

    public static Icon vibrate(PhosphorWeight weight) {
        return icon("vibrate", weight);
    }

    public static Icon video() {
        return video(PhosphorWeight.REGULAR);
    }

    public static Icon video(PhosphorWeight weight) {
        return icon("video", weight);
    }

    public static Icon videoCamera() {
        return videoCamera(PhosphorWeight.REGULAR);
    }

    public static Icon videoCamera(PhosphorWeight weight) {
        return icon("video-camera", weight);
    }

    public static Icon videoCameraSlash() {
        return videoCameraSlash(PhosphorWeight.REGULAR);
    }

    public static Icon videoCameraSlash(PhosphorWeight weight) {
        return icon("video-camera-slash", weight);
    }

    public static Icon videoConference() {
        return videoConference(PhosphorWeight.REGULAR);
    }

    public static Icon videoConference(PhosphorWeight weight) {
        return icon("video-conference", weight);
    }

    public static Icon vignette() {
        return vignette(PhosphorWeight.REGULAR);
    }

    public static Icon vignette(PhosphorWeight weight) {
        return icon("vignette", weight);
    }

    public static Icon vinylRecord() {
        return vinylRecord(PhosphorWeight.REGULAR);
    }

    public static Icon vinylRecord(PhosphorWeight weight) {
        return icon("vinyl-record", weight);
    }

    public static Icon virtualReality() {
        return virtualReality(PhosphorWeight.REGULAR);
    }

    public static Icon virtualReality(PhosphorWeight weight) {
        return icon("virtual-reality", weight);
    }

    public static Icon virus() {
        return virus(PhosphorWeight.REGULAR);
    }

    public static Icon virus(PhosphorWeight weight) {
        return icon("virus", weight);
    }

    public static Icon visor() {
        return visor(PhosphorWeight.REGULAR);
    }

    public static Icon visor(PhosphorWeight weight) {
        return icon("visor", weight);
    }

    public static Icon voicemail() {
        return voicemail(PhosphorWeight.REGULAR);
    }

    public static Icon voicemail(PhosphorWeight weight) {
        return icon("voicemail", weight);
    }

    public static Icon volleyball() {
        return volleyball(PhosphorWeight.REGULAR);
    }

    public static Icon volleyball(PhosphorWeight weight) {
        return icon("volleyball", weight);
    }

    public static Icon wall() {
        return wall(PhosphorWeight.REGULAR);
    }

    public static Icon wall(PhosphorWeight weight) {
        return icon("wall", weight);
    }

    public static Icon wallet() {
        return wallet(PhosphorWeight.REGULAR);
    }

    public static Icon wallet(PhosphorWeight weight) {
        return icon("wallet", weight);
    }

    public static Icon warehouse() {
        return warehouse(PhosphorWeight.REGULAR);
    }

    public static Icon warehouse(PhosphorWeight weight) {
        return icon("warehouse", weight);
    }

    public static Icon warning() {
        return warning(PhosphorWeight.REGULAR);
    }

    public static Icon warning(PhosphorWeight weight) {
        return icon("warning", weight);
    }

    public static Icon warningCircle() {
        return warningCircle(PhosphorWeight.REGULAR);
    }

    public static Icon warningCircle(PhosphorWeight weight) {
        return icon("warning-circle", weight);
    }

    public static Icon warningDiamond() {
        return warningDiamond(PhosphorWeight.REGULAR);
    }

    public static Icon warningDiamond(PhosphorWeight weight) {
        return icon("warning-diamond", weight);
    }

    public static Icon warningOctagon() {
        return warningOctagon(PhosphorWeight.REGULAR);
    }

    public static Icon warningOctagon(PhosphorWeight weight) {
        return icon("warning-octagon", weight);
    }

    public static Icon washingMachine() {
        return washingMachine(PhosphorWeight.REGULAR);
    }

    public static Icon washingMachine(PhosphorWeight weight) {
        return icon("washing-machine", weight);
    }

    public static Icon watch() {
        return watch(PhosphorWeight.REGULAR);
    }

    public static Icon watch(PhosphorWeight weight) {
        return icon("watch", weight);
    }

    public static Icon waveSawtooth() {
        return waveSawtooth(PhosphorWeight.REGULAR);
    }

    public static Icon waveSawtooth(PhosphorWeight weight) {
        return icon("wave-sawtooth", weight);
    }

    public static Icon waveSine() {
        return waveSine(PhosphorWeight.REGULAR);
    }

    public static Icon waveSine(PhosphorWeight weight) {
        return icon("wave-sine", weight);
    }

    public static Icon waveSquare() {
        return waveSquare(PhosphorWeight.REGULAR);
    }

    public static Icon waveSquare(PhosphorWeight weight) {
        return icon("wave-square", weight);
    }

    public static Icon waveTriangle() {
        return waveTriangle(PhosphorWeight.REGULAR);
    }

    public static Icon waveTriangle(PhosphorWeight weight) {
        return icon("wave-triangle", weight);
    }

    public static Icon waveform() {
        return waveform(PhosphorWeight.REGULAR);
    }

    public static Icon waveform(PhosphorWeight weight) {
        return icon("waveform", weight);
    }

    public static Icon waveformSlash() {
        return waveformSlash(PhosphorWeight.REGULAR);
    }

    public static Icon waveformSlash(PhosphorWeight weight) {
        return icon("waveform-slash", weight);
    }

    public static Icon waves() {
        return waves(PhosphorWeight.REGULAR);
    }

    public static Icon waves(PhosphorWeight weight) {
        return icon("waves", weight);
    }

    public static Icon webcam() {
        return webcam(PhosphorWeight.REGULAR);
    }

    public static Icon webcam(PhosphorWeight weight) {
        return icon("webcam", weight);
    }

    public static Icon webcamSlash() {
        return webcamSlash(PhosphorWeight.REGULAR);
    }

    public static Icon webcamSlash(PhosphorWeight weight) {
        return icon("webcam-slash", weight);
    }

    public static Icon webhooksLogo() {
        return webhooksLogo(PhosphorWeight.REGULAR);
    }

    public static Icon webhooksLogo(PhosphorWeight weight) {
        return icon("webhooks-logo", weight);
    }

    public static Icon wechatLogo() {
        return wechatLogo(PhosphorWeight.REGULAR);
    }

    public static Icon wechatLogo(PhosphorWeight weight) {
        return icon("wechat-logo", weight);
    }

    public static Icon whatsappLogo() {
        return whatsappLogo(PhosphorWeight.REGULAR);
    }

    public static Icon whatsappLogo(PhosphorWeight weight) {
        return icon("whatsapp-logo", weight);
    }

    public static Icon wheelchair() {
        return wheelchair(PhosphorWeight.REGULAR);
    }

    public static Icon wheelchair(PhosphorWeight weight) {
        return icon("wheelchair", weight);
    }

    public static Icon wheelchairMotion() {
        return wheelchairMotion(PhosphorWeight.REGULAR);
    }

    public static Icon wheelchairMotion(PhosphorWeight weight) {
        return icon("wheelchair-motion", weight);
    }

    public static Icon wifiHigh() {
        return wifiHigh(PhosphorWeight.REGULAR);
    }

    public static Icon wifiHigh(PhosphorWeight weight) {
        return icon("wifi-high", weight);
    }

    public static Icon wifiLow() {
        return wifiLow(PhosphorWeight.REGULAR);
    }

    public static Icon wifiLow(PhosphorWeight weight) {
        return icon("wifi-low", weight);
    }

    public static Icon wifiMedium() {
        return wifiMedium(PhosphorWeight.REGULAR);
    }

    public static Icon wifiMedium(PhosphorWeight weight) {
        return icon("wifi-medium", weight);
    }

    public static Icon wifiNone() {
        return wifiNone(PhosphorWeight.REGULAR);
    }

    public static Icon wifiNone(PhosphorWeight weight) {
        return icon("wifi-none", weight);
    }

    public static Icon wifiSlash() {
        return wifiSlash(PhosphorWeight.REGULAR);
    }

    public static Icon wifiSlash(PhosphorWeight weight) {
        return icon("wifi-slash", weight);
    }

    public static Icon wifiX() {
        return wifiX(PhosphorWeight.REGULAR);
    }

    public static Icon wifiX(PhosphorWeight weight) {
        return icon("wifi-x", weight);
    }

    public static Icon wind() {
        return wind(PhosphorWeight.REGULAR);
    }

    public static Icon wind(PhosphorWeight weight) {
        return icon("wind", weight);
    }

    public static Icon windmill() {
        return windmill(PhosphorWeight.REGULAR);
    }

    public static Icon windmill(PhosphorWeight weight) {
        return icon("windmill", weight);
    }

    public static Icon windowsLogo() {
        return windowsLogo(PhosphorWeight.REGULAR);
    }

    public static Icon windowsLogo(PhosphorWeight weight) {
        return icon("windows-logo", weight);
    }

    public static Icon wine() {
        return wine(PhosphorWeight.REGULAR);
    }

    public static Icon wine(PhosphorWeight weight) {
        return icon("wine", weight);
    }

    public static Icon wrench() {
        return wrench(PhosphorWeight.REGULAR);
    }

    public static Icon wrench(PhosphorWeight weight) {
        return icon("wrench", weight);
    }

    public static Icon x() {
        return x(PhosphorWeight.REGULAR);
    }

    public static Icon x(PhosphorWeight weight) {
        return icon("x", weight);
    }

    public static Icon xCircle() {
        return xCircle(PhosphorWeight.REGULAR);
    }

    public static Icon xCircle(PhosphorWeight weight) {
        return icon("x-circle", weight);
    }

    public static Icon xLogo() {
        return xLogo(PhosphorWeight.REGULAR);
    }

    public static Icon xLogo(PhosphorWeight weight) {
        return icon("x-logo", weight);
    }

    public static Icon xSquare() {
        return xSquare(PhosphorWeight.REGULAR);
    }

    public static Icon xSquare(PhosphorWeight weight) {
        return icon("x-square", weight);
    }

    public static Icon yarn() {
        return yarn(PhosphorWeight.REGULAR);
    }

    public static Icon yarn(PhosphorWeight weight) {
        return icon("yarn", weight);
    }

    public static Icon yinYang() {
        return yinYang(PhosphorWeight.REGULAR);
    }

    public static Icon yinYang(PhosphorWeight weight) {
        return icon("yin-yang", weight);
    }

    public static Icon youtubeLogo() {
        return youtubeLogo(PhosphorWeight.REGULAR);
    }

    public static Icon youtubeLogo(PhosphorWeight weight) {
        return icon("youtube-logo", weight);
    }
}
