package org.gwtfusion.icons.tabler;

import org.gwtfusion.ui.component.icon.Icon;
import org.gwtfusion.ui.component.icon.IconProvider;

public final class TablerIcons {
    public static final int COUNT = 5093;

    private TablerIcons() {
    }

    public static IconProvider provider() {
        return new TablerIconProvider();
    }

    public static String[] names() {
        String[] names = new String[COUNT];
        int offset = 0;
        offset = copy(TablerIconsA1.names(), names, offset);
        offset = copy(TablerIconsA2.names(), names, offset);
        offset = copy(TablerIconsA3.names(), names, offset);
        offset = copy(TablerIconsB1.names(), names, offset);
        offset = copy(TablerIconsB2.names(), names, offset);
        offset = copy(TablerIconsB3.names(), names, offset);
        offset = copy(TablerIconsB4.names(), names, offset);
        offset = copy(TablerIconsC1.names(), names, offset);
        offset = copy(TablerIconsC2.names(), names, offset);
        offset = copy(TablerIconsC3.names(), names, offset);
        offset = copy(TablerIconsC4.names(), names, offset);
        offset = copy(TablerIconsC5.names(), names, offset);
        offset = copy(TablerIconsD1.names(), names, offset);
        offset = copy(TablerIconsD2.names(), names, offset);
        offset = copy(TablerIconsE.names(), names, offset);
        offset = copy(TablerIconsF1.names(), names, offset);
        offset = copy(TablerIconsF2.names(), names, offset);
        offset = copy(TablerIconsG.names(), names, offset);
        offset = copy(TablerIconsH1.names(), names, offset);
        offset = copy(TablerIconsH2.names(), names, offset);
        offset = copy(TablerIconsI.names(), names, offset);
        offset = copy(TablerIconsJ.names(), names, offset);
        offset = copy(TablerIconsK.names(), names, offset);
        offset = copy(TablerIconsL1.names(), names, offset);
        offset = copy(TablerIconsL2.names(), names, offset);
        offset = copy(TablerIconsM1.names(), names, offset);
        offset = copy(TablerIconsM2.names(), names, offset);
        offset = copy(TablerIconsM3.names(), names, offset);
        offset = copy(TablerIconsN.names(), names, offset);
        offset = copy(TablerIconsO.names(), names, offset);
        offset = copy(TablerIconsP1.names(), names, offset);
        offset = copy(TablerIconsP2.names(), names, offset);
        offset = copy(TablerIconsQ.names(), names, offset);
        offset = copy(TablerIconsR.names(), names, offset);
        offset = copy(TablerIconsS1.names(), names, offset);
        offset = copy(TablerIconsS2.names(), names, offset);
        offset = copy(TablerIconsS3.names(), names, offset);
        offset = copy(TablerIconsT1.names(), names, offset);
        offset = copy(TablerIconsT2.names(), names, offset);
        offset = copy(TablerIconsU.names(), names, offset);
        offset = copy(TablerIconsV.names(), names, offset);
        offset = copy(TablerIconsW.names(), names, offset);
        offset = copy(TablerIconsX.names(), names, offset);
        offset = copy(TablerIconsY.names(), names, offset);
        offset = copy(TablerIconsZ.names(), names, offset);
        return names;
    }

    public static Icon icon(String name) {
        if (name == null || name.isEmpty()) {
            return null;
        }
        Icon icon;
        switch (name.charAt(0)) {
            case 'a':
                icon = TablerIconsA1.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = TablerIconsA2.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = TablerIconsA3.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'b':
                icon = TablerIconsB1.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = TablerIconsB2.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = TablerIconsB3.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = TablerIconsB4.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'c':
                icon = TablerIconsC1.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = TablerIconsC2.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = TablerIconsC3.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = TablerIconsC4.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = TablerIconsC5.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'd':
                icon = TablerIconsD1.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = TablerIconsD2.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'e':
                icon = TablerIconsE.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'f':
                icon = TablerIconsF1.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = TablerIconsF2.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'g':
                icon = TablerIconsG.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'h':
                icon = TablerIconsH1.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = TablerIconsH2.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'i':
                icon = TablerIconsI.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'j':
                icon = TablerIconsJ.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'k':
                icon = TablerIconsK.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'l':
                icon = TablerIconsL1.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = TablerIconsL2.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'm':
                icon = TablerIconsM1.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = TablerIconsM2.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = TablerIconsM3.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'n':
                icon = TablerIconsN.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'o':
                icon = TablerIconsO.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'p':
                icon = TablerIconsP1.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = TablerIconsP2.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'q':
                icon = TablerIconsQ.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'r':
                icon = TablerIconsR.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 's':
                icon = TablerIconsS1.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = TablerIconsS2.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = TablerIconsS3.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 't':
                icon = TablerIconsT1.icon(name);
                if (icon != null) {
                    return icon;
                }
                icon = TablerIconsT2.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'u':
                icon = TablerIconsU.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'v':
                icon = TablerIconsV.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'w':
                icon = TablerIconsW.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'x':
                icon = TablerIconsX.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'y':
                icon = TablerIconsY.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            case 'z':
                icon = TablerIconsZ.icon(name);
                if (icon != null) {
                    return icon;
                }
                return null;
            default:
                return null;
        }
    }

    private static int copy(String[] source, String[] target, int offset) {
        for (int i = 0; i < source.length; i++) {
            target[offset + i] = source[i];
        }
        return offset + source.length;
    }

    public static Icon aB() {
        return TablerIconsA1.aB();
    }

    public static Icon aBN2() {
        return TablerIconsA1.aBN2();
    }

    public static Icon aBOff() {
        return TablerIconsA1.aBOff();
    }

    public static Icon abacus() {
        return TablerIconsA1.abacus();
    }

    public static Icon abacusOff() {
        return TablerIconsA1.abacusOff();
    }

    public static Icon abc() {
        return TablerIconsA1.abc();
    }

    public static Icon accessPoint() {
        return TablerIconsA1.accessPoint();
    }

    public static Icon accessPointOff() {
        return TablerIconsA1.accessPointOff();
    }

    public static Icon accessible() {
        return TablerIconsA1.accessible();
    }

    public static Icon accessibleOff() {
        return TablerIconsA1.accessibleOff();
    }

    public static Icon acorn() {
        return TablerIconsA1.acorn();
    }

    public static Icon acrobatic() {
        return TablerIconsA1.acrobatic();
    }

    public static Icon activity() {
        return TablerIconsA1.activity();
    }

    public static Icon activityHeartbeat() {
        return TablerIconsA1.activityHeartbeat();
    }

    public static Icon ad() {
        return TablerIconsA1.ad();
    }

    public static Icon adN2() {
        return TablerIconsA1.adN2();
    }

    public static Icon adCircle() {
        return TablerIconsA1.adCircle();
    }

    public static Icon adCircleOff() {
        return TablerIconsA1.adCircleOff();
    }

    public static Icon adOff() {
        return TablerIconsA1.adOff();
    }

    public static Icon addressBook() {
        return TablerIconsA1.addressBook();
    }

    public static Icon addressBookOff() {
        return TablerIconsA1.addressBookOff();
    }

    public static Icon adjustments() {
        return TablerIconsA1.adjustments();
    }

    public static Icon adjustmentsAlt() {
        return TablerIconsA1.adjustmentsAlt();
    }

    public static Icon adjustmentsBolt() {
        return TablerIconsA1.adjustmentsBolt();
    }

    public static Icon adjustmentsCancel() {
        return TablerIconsA1.adjustmentsCancel();
    }

    public static Icon adjustmentsCheck() {
        return TablerIconsA1.adjustmentsCheck();
    }

    public static Icon adjustmentsCode() {
        return TablerIconsA1.adjustmentsCode();
    }

    public static Icon adjustmentsCog() {
        return TablerIconsA1.adjustmentsCog();
    }

    public static Icon adjustmentsDollar() {
        return TablerIconsA1.adjustmentsDollar();
    }

    public static Icon adjustmentsDown() {
        return TablerIconsA1.adjustmentsDown();
    }

    public static Icon adjustmentsExclamation() {
        return TablerIconsA1.adjustmentsExclamation();
    }

    public static Icon adjustmentsHeart() {
        return TablerIconsA1.adjustmentsHeart();
    }

    public static Icon adjustmentsHorizontal() {
        return TablerIconsA1.adjustmentsHorizontal();
    }

    public static Icon adjustmentsMinus() {
        return TablerIconsA1.adjustmentsMinus();
    }

    public static Icon adjustmentsOff() {
        return TablerIconsA1.adjustmentsOff();
    }

    public static Icon adjustmentsPause() {
        return TablerIconsA1.adjustmentsPause();
    }

    public static Icon adjustmentsPin() {
        return TablerIconsA1.adjustmentsPin();
    }

    public static Icon adjustmentsPlus() {
        return TablerIconsA1.adjustmentsPlus();
    }

    public static Icon adjustmentsQuestion() {
        return TablerIconsA1.adjustmentsQuestion();
    }

    public static Icon adjustmentsSearch() {
        return TablerIconsA1.adjustmentsSearch();
    }

    public static Icon adjustmentsShare() {
        return TablerIconsA1.adjustmentsShare();
    }

    public static Icon adjustmentsSpark() {
        return TablerIconsA1.adjustmentsSpark();
    }

    public static Icon adjustmentsStar() {
        return TablerIconsA1.adjustmentsStar();
    }

    public static Icon adjustmentsUp() {
        return TablerIconsA1.adjustmentsUp();
    }

    public static Icon adjustmentsX() {
        return TablerIconsA1.adjustmentsX();
    }

    public static Icon aerialLift() {
        return TablerIconsA1.aerialLift();
    }

    public static Icon affiliate() {
        return TablerIconsA1.affiliate();
    }

    public static Icon ai() {
        return TablerIconsA1.ai();
    }

    public static Icon aiAgent() {
        return TablerIconsA1.aiAgent();
    }

    public static Icon aiAgents() {
        return TablerIconsA1.aiAgents();
    }

    public static Icon aiGateway() {
        return TablerIconsA1.aiGateway();
    }

    public static Icon airBalloon() {
        return TablerIconsA1.airBalloon();
    }

    public static Icon airConditioning() {
        return TablerIconsA1.airConditioning();
    }

    public static Icon airConditioningDisabled() {
        return TablerIconsA1.airConditioningDisabled();
    }

    public static Icon airTrafficControl() {
        return TablerIconsA1.airTrafficControl();
    }

    public static Icon alarm() {
        return TablerIconsA1.alarm();
    }

    public static Icon alarmAverage() {
        return TablerIconsA1.alarmAverage();
    }

    public static Icon alarmMinus() {
        return TablerIconsA1.alarmMinus();
    }

    public static Icon alarmOff() {
        return TablerIconsA1.alarmOff();
    }

    public static Icon alarmPlus() {
        return TablerIconsA1.alarmPlus();
    }

    public static Icon alarmSmoke() {
        return TablerIconsA1.alarmSmoke();
    }

    public static Icon alarmSnooze() {
        return TablerIconsA1.alarmSnooze();
    }

    public static Icon album() {
        return TablerIconsA1.album();
    }

    public static Icon albumOff() {
        return TablerIconsA1.albumOff();
    }

    public static Icon alertCircle() {
        return TablerIconsA1.alertCircle();
    }

    public static Icon alertCircleOff() {
        return TablerIconsA1.alertCircleOff();
    }

    public static Icon alertHexagon() {
        return TablerIconsA1.alertHexagon();
    }

    public static Icon alertHexagonOff() {
        return TablerIconsA1.alertHexagonOff();
    }

    public static Icon alertOctagon() {
        return TablerIconsA1.alertOctagon();
    }

    public static Icon alertSmall() {
        return TablerIconsA1.alertSmall();
    }

    public static Icon alertSmallOff() {
        return TablerIconsA1.alertSmallOff();
    }

    public static Icon alertSquare() {
        return TablerIconsA1.alertSquare();
    }

    public static Icon alertSquareRounded() {
        return TablerIconsA1.alertSquareRounded();
    }

    public static Icon alertSquareRoundedOff() {
        return TablerIconsA1.alertSquareRoundedOff();
    }

    public static Icon alertTriangle() {
        return TablerIconsA1.alertTriangle();
    }

    public static Icon alertTriangleOff() {
        return TablerIconsA1.alertTriangleOff();
    }

    public static Icon alien() {
        return TablerIconsA1.alien();
    }

    public static Icon alignBoxBottomCenter() {
        return TablerIconsA1.alignBoxBottomCenter();
    }

    public static Icon alignBoxBottomLeft() {
        return TablerIconsA1.alignBoxBottomLeft();
    }

    public static Icon alignBoxBottomRight() {
        return TablerIconsA1.alignBoxBottomRight();
    }

    public static Icon alignBoxCenterBottom() {
        return TablerIconsA1.alignBoxCenterBottom();
    }

    public static Icon alignBoxCenterMiddle() {
        return TablerIconsA1.alignBoxCenterMiddle();
    }

    public static Icon alignBoxCenterStretch() {
        return TablerIconsA1.alignBoxCenterStretch();
    }

    public static Icon alignBoxCenterTop() {
        return TablerIconsA1.alignBoxCenterTop();
    }

    public static Icon alignBoxLeftBottom() {
        return TablerIconsA1.alignBoxLeftBottom();
    }

    public static Icon alignBoxLeftMiddle() {
        return TablerIconsA1.alignBoxLeftMiddle();
    }

    public static Icon alignBoxLeftStretch() {
        return TablerIconsA1.alignBoxLeftStretch();
    }

    public static Icon alignBoxLeftTop() {
        return TablerIconsA1.alignBoxLeftTop();
    }

    public static Icon alignBoxRightBottom() {
        return TablerIconsA1.alignBoxRightBottom();
    }

    public static Icon alignBoxRightMiddle() {
        return TablerIconsA1.alignBoxRightMiddle();
    }

    public static Icon alignBoxRightStretch() {
        return TablerIconsA1.alignBoxRightStretch();
    }

    public static Icon alignBoxRightTop() {
        return TablerIconsA1.alignBoxRightTop();
    }

    public static Icon alignBoxTopCenter() {
        return TablerIconsA1.alignBoxTopCenter();
    }

    public static Icon alignBoxTopLeft() {
        return TablerIconsA1.alignBoxTopLeft();
    }

    public static Icon alignBoxTopRight() {
        return TablerIconsA1.alignBoxTopRight();
    }

    public static Icon alignCenter() {
        return TablerIconsA1.alignCenter();
    }

    public static Icon alignJustified() {
        return TablerIconsA1.alignJustified();
    }

    public static Icon alignLeft() {
        return TablerIconsA1.alignLeft();
    }

    public static Icon alignLeftN2() {
        return TablerIconsA1.alignLeftN2();
    }

    public static Icon alignRight() {
        return TablerIconsA1.alignRight();
    }

    public static Icon alignRightN2() {
        return TablerIconsA1.alignRightN2();
    }

    public static Icon alpha() {
        return TablerIconsA1.alpha();
    }

    public static Icon alphabetArabic() {
        return TablerIconsA1.alphabetArabic();
    }

    public static Icon alphabetBangla() {
        return TablerIconsA1.alphabetBangla();
    }

    public static Icon alphabetCyrillic() {
        return TablerIconsA1.alphabetCyrillic();
    }

    public static Icon alphabetGreek() {
        return TablerIconsA1.alphabetGreek();
    }

    public static Icon alphabetHebrew() {
        return TablerIconsA1.alphabetHebrew();
    }

    public static Icon alphabetKorean() {
        return TablerIconsA1.alphabetKorean();
    }

    public static Icon alphabetLatin() {
        return TablerIconsA1.alphabetLatin();
    }

    public static Icon alphabetPolish() {
        return TablerIconsA1.alphabetPolish();
    }

    public static Icon alphabetRunes() {
        return TablerIconsA1.alphabetRunes();
    }

    public static Icon alphabetThai() {
        return TablerIconsA1.alphabetThai();
    }

    public static Icon alt() {
        return TablerIconsA1.alt();
    }

    public static Icon ambulance() {
        return TablerIconsA1.ambulance();
    }

    public static Icon ampersand() {
        return TablerIconsA1.ampersand();
    }

    public static Icon analyze() {
        return TablerIconsA1.analyze();
    }

    public static Icon analyzeOff() {
        return TablerIconsA1.analyzeOff();
    }

    public static Icon anchor() {
        return TablerIconsA1.anchor();
    }

    public static Icon anchorOff() {
        return TablerIconsA1.anchorOff();
    }

    public static Icon angle() {
        return TablerIconsA1.angle();
    }

    public static Icon ankh() {
        return TablerIconsA1.ankh();
    }

    public static Icon antenna() {
        return TablerIconsA1.antenna();
    }

    public static Icon antennaBarsN1() {
        return TablerIconsA1.antennaBarsN1();
    }

    public static Icon antennaBarsN2() {
        return TablerIconsA1.antennaBarsN2();
    }

    public static Icon antennaBarsN3() {
        return TablerIconsA1.antennaBarsN3();
    }

    public static Icon antennaBarsN4() {
        return TablerIconsA1.antennaBarsN4();
    }

    public static Icon antennaBarsN5() {
        return TablerIconsA1.antennaBarsN5();
    }

    public static Icon antennaBarsOff() {
        return TablerIconsA1.antennaBarsOff();
    }

    public static Icon antennaOff() {
        return TablerIconsA1.antennaOff();
    }

    public static Icon aperture() {
        return TablerIconsA1.aperture();
    }

    public static Icon apertureOff() {
        return TablerIconsA1.apertureOff();
    }

    public static Icon api() {
        return TablerIconsA1.api();
    }

    public static Icon apiApp() {
        return TablerIconsA1.apiApp();
    }

    public static Icon apiAppOff() {
        return TablerIconsA1.apiAppOff();
    }

    public static Icon apiBook() {
        return TablerIconsA1.apiBook();
    }

    public static Icon apiOff() {
        return TablerIconsA1.apiOff();
    }

    public static Icon appWindow() {
        return TablerIconsA1.appWindow();
    }

    public static Icon apple() {
        return TablerIconsA1.apple();
    }

    public static Icon apps() {
        return TablerIconsA1.apps();
    }

    public static Icon appsOff() {
        return TablerIconsA1.appsOff();
    }

    public static Icon archeryArrow() {
        return TablerIconsA1.archeryArrow();
    }

    public static Icon archive() {
        return TablerIconsA1.archive();
    }

    public static Icon archiveOff() {
        return TablerIconsA1.archiveOff();
    }

    public static Icon armchair() {
        return TablerIconsA1.armchair();
    }

    public static Icon armchairN2() {
        return TablerIconsA1.armchairN2();
    }

    public static Icon armchairN2Off() {
        return TablerIconsA1.armchairN2Off();
    }

    public static Icon armchairOff() {
        return TablerIconsA1.armchairOff();
    }

    public static Icon arrowAutofitContent() {
        return TablerIconsA1.arrowAutofitContent();
    }

    public static Icon arrowAutofitDown() {
        return TablerIconsA1.arrowAutofitDown();
    }

    public static Icon arrowAutofitHeight() {
        return TablerIconsA1.arrowAutofitHeight();
    }

    public static Icon arrowAutofitLeft() {
        return TablerIconsA1.arrowAutofitLeft();
    }

    public static Icon arrowAutofitRight() {
        return TablerIconsA1.arrowAutofitRight();
    }

    public static Icon arrowAutofitUp() {
        return TablerIconsA1.arrowAutofitUp();
    }

    public static Icon arrowAutofitWidth() {
        return TablerIconsA1.arrowAutofitWidth();
    }

    public static Icon arrowBack() {
        return TablerIconsA1.arrowBack();
    }

    public static Icon arrowBackUp() {
        return TablerIconsA1.arrowBackUp();
    }

    public static Icon arrowBackUpDouble() {
        return TablerIconsA1.arrowBackUpDouble();
    }

    public static Icon arrowBadgeDown() {
        return TablerIconsA1.arrowBadgeDown();
    }

    public static Icon arrowBadgeLeft() {
        return TablerIconsA1.arrowBadgeLeft();
    }

    public static Icon arrowBadgeRight() {
        return TablerIconsA1.arrowBadgeRight();
    }

    public static Icon arrowBadgeUp() {
        return TablerIconsA1.arrowBadgeUp();
    }

    public static Icon arrowBarBoth() {
        return TablerIconsA1.arrowBarBoth();
    }

    public static Icon arrowBarDown() {
        return TablerIconsA1.arrowBarDown();
    }

    public static Icon arrowBarLeft() {
        return TablerIconsA1.arrowBarLeft();
    }

    public static Icon arrowBarRight() {
        return TablerIconsA1.arrowBarRight();
    }

    public static Icon arrowBarToDown() {
        return TablerIconsA1.arrowBarToDown();
    }

    public static Icon arrowBarToDownDashed() {
        return TablerIconsA1.arrowBarToDownDashed();
    }

    public static Icon arrowBarToLeft() {
        return TablerIconsA1.arrowBarToLeft();
    }

    public static Icon arrowBarToLeftDashed() {
        return TablerIconsA1.arrowBarToLeftDashed();
    }

    public static Icon arrowBarToRight() {
        return TablerIconsA1.arrowBarToRight();
    }

    public static Icon arrowBarToRightDashed() {
        return TablerIconsA1.arrowBarToRightDashed();
    }

    public static Icon arrowBarToUp() {
        return TablerIconsA1.arrowBarToUp();
    }

    public static Icon arrowBarToUpDashed() {
        return TablerIconsA1.arrowBarToUpDashed();
    }

    public static Icon arrowBarUp() {
        return TablerIconsA1.arrowBarUp();
    }

    public static Icon arrowBearLeft() {
        return TablerIconsA1.arrowBearLeft();
    }

    public static Icon arrowBearLeftN2() {
        return TablerIconsA1.arrowBearLeftN2();
    }

    public static Icon arrowBearRight() {
        return TablerIconsA1.arrowBearRight();
    }

    public static Icon arrowBearRightN2() {
        return TablerIconsA1.arrowBearRightN2();
    }

    public static Icon arrowBigDown() {
        return TablerIconsA1.arrowBigDown();
    }

    public static Icon arrowBigDownLine() {
        return TablerIconsA1.arrowBigDownLine();
    }

    public static Icon arrowBigDownLines() {
        return TablerIconsA2.arrowBigDownLines();
    }

    public static Icon arrowBigLeft() {
        return TablerIconsA2.arrowBigLeft();
    }

    public static Icon arrowBigLeftLine() {
        return TablerIconsA2.arrowBigLeftLine();
    }

    public static Icon arrowBigLeftLines() {
        return TablerIconsA2.arrowBigLeftLines();
    }

    public static Icon arrowBigRight() {
        return TablerIconsA2.arrowBigRight();
    }

    public static Icon arrowBigRightLine() {
        return TablerIconsA2.arrowBigRightLine();
    }

    public static Icon arrowBigRightLines() {
        return TablerIconsA2.arrowBigRightLines();
    }

    public static Icon arrowBigUp() {
        return TablerIconsA2.arrowBigUp();
    }

    public static Icon arrowBigUpLine() {
        return TablerIconsA2.arrowBigUpLine();
    }

    public static Icon arrowBigUpLines() {
        return TablerIconsA2.arrowBigUpLines();
    }

    public static Icon arrowBounce() {
        return TablerIconsA2.arrowBounce();
    }

    public static Icon arrowCapsule() {
        return TablerIconsA2.arrowCapsule();
    }

    public static Icon arrowCurveLeft() {
        return TablerIconsA2.arrowCurveLeft();
    }

    public static Icon arrowCurveRight() {
        return TablerIconsA2.arrowCurveRight();
    }

    public static Icon arrowDown() {
        return TablerIconsA2.arrowDown();
    }

    public static Icon arrowDownBar() {
        return TablerIconsA2.arrowDownBar();
    }

    public static Icon arrowDownCircle() {
        return TablerIconsA2.arrowDownCircle();
    }

    public static Icon arrowDownDashed() {
        return TablerIconsA2.arrowDownDashed();
    }

    public static Icon arrowDownFromArc() {
        return TablerIconsA2.arrowDownFromArc();
    }

    public static Icon arrowDownLeft() {
        return TablerIconsA2.arrowDownLeft();
    }

    public static Icon arrowDownLeftCircle() {
        return TablerIconsA2.arrowDownLeftCircle();
    }

    public static Icon arrowDownRhombus() {
        return TablerIconsA2.arrowDownRhombus();
    }

    public static Icon arrowDownRight() {
        return TablerIconsA2.arrowDownRight();
    }

    public static Icon arrowDownRightCircle() {
        return TablerIconsA2.arrowDownRightCircle();
    }

    public static Icon arrowDownSquare() {
        return TablerIconsA2.arrowDownSquare();
    }

    public static Icon arrowDownTail() {
        return TablerIconsA2.arrowDownTail();
    }

    public static Icon arrowDownToArc() {
        return TablerIconsA2.arrowDownToArc();
    }

    public static Icon arrowElbowLeft() {
        return TablerIconsA2.arrowElbowLeft();
    }

    public static Icon arrowElbowRight() {
        return TablerIconsA2.arrowElbowRight();
    }

    public static Icon arrowFork() {
        return TablerIconsA2.arrowFork();
    }

    public static Icon arrowForward() {
        return TablerIconsA2.arrowForward();
    }

    public static Icon arrowForwardUp() {
        return TablerIconsA2.arrowForwardUp();
    }

    public static Icon arrowForwardUpDouble() {
        return TablerIconsA2.arrowForwardUpDouble();
    }

    public static Icon arrowGuide() {
        return TablerIconsA2.arrowGuide();
    }

    public static Icon arrowIteration() {
        return TablerIconsA2.arrowIteration();
    }

    public static Icon arrowLeft() {
        return TablerIconsA2.arrowLeft();
    }

    public static Icon arrowLeftBar() {
        return TablerIconsA2.arrowLeftBar();
    }

    public static Icon arrowLeftCircle() {
        return TablerIconsA2.arrowLeftCircle();
    }

    public static Icon arrowLeftDashed() {
        return TablerIconsA2.arrowLeftDashed();
    }

    public static Icon arrowLeftFromArc() {
        return TablerIconsA2.arrowLeftFromArc();
    }

    public static Icon arrowLeftRhombus() {
        return TablerIconsA2.arrowLeftRhombus();
    }

    public static Icon arrowLeftRight() {
        return TablerIconsA2.arrowLeftRight();
    }

    public static Icon arrowLeftSquare() {
        return TablerIconsA2.arrowLeftSquare();
    }

    public static Icon arrowLeftTail() {
        return TablerIconsA2.arrowLeftTail();
    }

    public static Icon arrowLeftToArc() {
        return TablerIconsA2.arrowLeftToArc();
    }

    public static Icon arrowLoopLeft() {
        return TablerIconsA2.arrowLoopLeft();
    }

    public static Icon arrowLoopLeftN2() {
        return TablerIconsA2.arrowLoopLeftN2();
    }

    public static Icon arrowLoopRight() {
        return TablerIconsA2.arrowLoopRight();
    }

    public static Icon arrowLoopRightN2() {
        return TablerIconsA2.arrowLoopRightN2();
    }

    public static Icon arrowMerge() {
        return TablerIconsA2.arrowMerge();
    }

    public static Icon arrowMergeAltLeft() {
        return TablerIconsA2.arrowMergeAltLeft();
    }

    public static Icon arrowMergeAltRight() {
        return TablerIconsA2.arrowMergeAltRight();
    }

    public static Icon arrowMergeBoth() {
        return TablerIconsA2.arrowMergeBoth();
    }

    public static Icon arrowMergeLeft() {
        return TablerIconsA2.arrowMergeLeft();
    }

    public static Icon arrowMergeRight() {
        return TablerIconsA2.arrowMergeRight();
    }

    public static Icon arrowMoveDown() {
        return TablerIconsA2.arrowMoveDown();
    }

    public static Icon arrowMoveLeft() {
        return TablerIconsA2.arrowMoveLeft();
    }

    public static Icon arrowMoveRight() {
        return TablerIconsA2.arrowMoveRight();
    }

    public static Icon arrowMoveUp() {
        return TablerIconsA2.arrowMoveUp();
    }

    public static Icon arrowNarrowDown() {
        return TablerIconsA2.arrowNarrowDown();
    }

    public static Icon arrowNarrowDownDashed() {
        return TablerIconsA2.arrowNarrowDownDashed();
    }

    public static Icon arrowNarrowLeft() {
        return TablerIconsA2.arrowNarrowLeft();
    }

    public static Icon arrowNarrowLeftDashed() {
        return TablerIconsA2.arrowNarrowLeftDashed();
    }

    public static Icon arrowNarrowRight() {
        return TablerIconsA2.arrowNarrowRight();
    }

    public static Icon arrowNarrowRightDashed() {
        return TablerIconsA2.arrowNarrowRightDashed();
    }

    public static Icon arrowNarrowUp() {
        return TablerIconsA2.arrowNarrowUp();
    }

    public static Icon arrowNarrowUpDashed() {
        return TablerIconsA2.arrowNarrowUpDashed();
    }

    public static Icon arrowRampLeft() {
        return TablerIconsA2.arrowRampLeft();
    }

    public static Icon arrowRampLeftN2() {
        return TablerIconsA2.arrowRampLeftN2();
    }

    public static Icon arrowRampLeftN3() {
        return TablerIconsA2.arrowRampLeftN3();
    }

    public static Icon arrowRampRight() {
        return TablerIconsA2.arrowRampRight();
    }

    public static Icon arrowRampRightN2() {
        return TablerIconsA2.arrowRampRightN2();
    }

    public static Icon arrowRampRightN3() {
        return TablerIconsA2.arrowRampRightN3();
    }

    public static Icon arrowRight() {
        return TablerIconsA2.arrowRight();
    }

    public static Icon arrowRightBar() {
        return TablerIconsA2.arrowRightBar();
    }

    public static Icon arrowRightCircle() {
        return TablerIconsA2.arrowRightCircle();
    }

    public static Icon arrowRightDashed() {
        return TablerIconsA2.arrowRightDashed();
    }

    public static Icon arrowRightFromArc() {
        return TablerIconsA2.arrowRightFromArc();
    }

    public static Icon arrowRightRhombus() {
        return TablerIconsA2.arrowRightRhombus();
    }

    public static Icon arrowRightSquare() {
        return TablerIconsA2.arrowRightSquare();
    }

    public static Icon arrowRightTail() {
        return TablerIconsA2.arrowRightTail();
    }

    public static Icon arrowRightToArc() {
        return TablerIconsA2.arrowRightToArc();
    }

    public static Icon arrowRotaryFirstLeft() {
        return TablerIconsA2.arrowRotaryFirstLeft();
    }

    public static Icon arrowRotaryFirstRight() {
        return TablerIconsA2.arrowRotaryFirstRight();
    }

    public static Icon arrowRotaryLastLeft() {
        return TablerIconsA2.arrowRotaryLastLeft();
    }

    public static Icon arrowRotaryLastRight() {
        return TablerIconsA2.arrowRotaryLastRight();
    }

    public static Icon arrowRotaryLeft() {
        return TablerIconsA2.arrowRotaryLeft();
    }

    public static Icon arrowRotaryRight() {
        return TablerIconsA2.arrowRotaryRight();
    }

    public static Icon arrowRotaryStraight() {
        return TablerIconsA2.arrowRotaryStraight();
    }

    public static Icon arrowRoundaboutLeft() {
        return TablerIconsA2.arrowRoundaboutLeft();
    }

    public static Icon arrowRoundaboutRight() {
        return TablerIconsA2.arrowRoundaboutRight();
    }

    public static Icon arrowSharpTurnLeft() {
        return TablerIconsA2.arrowSharpTurnLeft();
    }

    public static Icon arrowSharpTurnRight() {
        return TablerIconsA2.arrowSharpTurnRight();
    }

    public static Icon arrowUp() {
        return TablerIconsA2.arrowUp();
    }

    public static Icon arrowUpBar() {
        return TablerIconsA2.arrowUpBar();
    }

    public static Icon arrowUpCircle() {
        return TablerIconsA2.arrowUpCircle();
    }

    public static Icon arrowUpDashed() {
        return TablerIconsA2.arrowUpDashed();
    }

    public static Icon arrowUpFromArc() {
        return TablerIconsA2.arrowUpFromArc();
    }

    public static Icon arrowUpLeft() {
        return TablerIconsA2.arrowUpLeft();
    }

    public static Icon arrowUpLeftCircle() {
        return TablerIconsA2.arrowUpLeftCircle();
    }

    public static Icon arrowUpRhombus() {
        return TablerIconsA2.arrowUpRhombus();
    }

    public static Icon arrowUpRight() {
        return TablerIconsA2.arrowUpRight();
    }

    public static Icon arrowUpRightCircle() {
        return TablerIconsA2.arrowUpRightCircle();
    }

    public static Icon arrowUpSquare() {
        return TablerIconsA2.arrowUpSquare();
    }

    public static Icon arrowUpTail() {
        return TablerIconsA2.arrowUpTail();
    }

    public static Icon arrowUpToArc() {
        return TablerIconsA2.arrowUpToArc();
    }

    public static Icon arrowWaveLeftDown() {
        return TablerIconsA2.arrowWaveLeftDown();
    }

    public static Icon arrowWaveLeftUp() {
        return TablerIconsA2.arrowWaveLeftUp();
    }

    public static Icon arrowWaveRightDown() {
        return TablerIconsA2.arrowWaveRightDown();
    }

    public static Icon arrowWaveRightUp() {
        return TablerIconsA2.arrowWaveRightUp();
    }

    public static Icon arrowZigZag() {
        return TablerIconsA2.arrowZigZag();
    }

    public static Icon arrowsCross() {
        return TablerIconsA2.arrowsCross();
    }

    public static Icon arrowsDiagonal() {
        return TablerIconsA2.arrowsDiagonal();
    }

    public static Icon arrowsDiagonalN2() {
        return TablerIconsA2.arrowsDiagonalN2();
    }

    public static Icon arrowsDiagonalMinimize() {
        return TablerIconsA2.arrowsDiagonalMinimize();
    }

    public static Icon arrowsDiagonalMinimizeN2() {
        return TablerIconsA2.arrowsDiagonalMinimizeN2();
    }

    public static Icon arrowsDiff() {
        return TablerIconsA2.arrowsDiff();
    }

    public static Icon arrowsDoubleNeSw() {
        return TablerIconsA2.arrowsDoubleNeSw();
    }

    public static Icon arrowsDoubleNwSe() {
        return TablerIconsA2.arrowsDoubleNwSe();
    }

    public static Icon arrowsDoubleSeNw() {
        return TablerIconsA2.arrowsDoubleSeNw();
    }

    public static Icon arrowsDoubleSwNe() {
        return TablerIconsA2.arrowsDoubleSwNe();
    }

    public static Icon arrowsDown() {
        return TablerIconsA2.arrowsDown();
    }

    public static Icon arrowsDownUp() {
        return TablerIconsA2.arrowsDownUp();
    }

    public static Icon arrowsExchange() {
        return TablerIconsA2.arrowsExchange();
    }

    public static Icon arrowsExchangeN2() {
        return TablerIconsA2.arrowsExchangeN2();
    }

    public static Icon arrowsHorizontal() {
        return TablerIconsA2.arrowsHorizontal();
    }

    public static Icon arrowsJoin() {
        return TablerIconsA2.arrowsJoin();
    }

    public static Icon arrowsJoinN2() {
        return TablerIconsA2.arrowsJoinN2();
    }

    public static Icon arrowsLeft() {
        return TablerIconsA2.arrowsLeft();
    }

    public static Icon arrowsLeftDown() {
        return TablerIconsA2.arrowsLeftDown();
    }

    public static Icon arrowsLeftRight() {
        return TablerIconsA2.arrowsLeftRight();
    }

    public static Icon arrowsMaximize() {
        return TablerIconsA2.arrowsMaximize();
    }

    public static Icon arrowsMinimize() {
        return TablerIconsA2.arrowsMinimize();
    }

    public static Icon arrowsMove() {
        return TablerIconsA2.arrowsMove();
    }

    public static Icon arrowsMoveHorizontal() {
        return TablerIconsA2.arrowsMoveHorizontal();
    }

    public static Icon arrowsMoveVertical() {
        return TablerIconsA2.arrowsMoveVertical();
    }

    public static Icon arrowsRandom() {
        return TablerIconsA2.arrowsRandom();
    }

    public static Icon arrowsRight() {
        return TablerIconsA2.arrowsRight();
    }

    public static Icon arrowsRightDown() {
        return TablerIconsA2.arrowsRightDown();
    }

    public static Icon arrowsRightLeft() {
        return TablerIconsA2.arrowsRightLeft();
    }

    public static Icon arrowsShuffle() {
        return TablerIconsA2.arrowsShuffle();
    }

    public static Icon arrowsShuffleN2() {
        return TablerIconsA2.arrowsShuffleN2();
    }

    public static Icon arrowsSort() {
        return TablerIconsA2.arrowsSort();
    }

    public static Icon arrowsSplit() {
        return TablerIconsA2.arrowsSplit();
    }

    public static Icon arrowsSplitN2() {
        return TablerIconsA2.arrowsSplitN2();
    }

    public static Icon arrowsTransferDown() {
        return TablerIconsA2.arrowsTransferDown();
    }

    public static Icon arrowsTransferUp() {
        return TablerIconsA2.arrowsTransferUp();
    }

    public static Icon arrowsTransferUpDown() {
        return TablerIconsA2.arrowsTransferUpDown();
    }

    public static Icon arrowsUp() {
        return TablerIconsA2.arrowsUp();
    }

    public static Icon arrowsUpDown() {
        return TablerIconsA2.arrowsUpDown();
    }

    public static Icon arrowsUpLeft() {
        return TablerIconsA2.arrowsUpLeft();
    }

    public static Icon arrowsUpRight() {
        return TablerIconsA2.arrowsUpRight();
    }

    public static Icon arrowsVertical() {
        return TablerIconsA2.arrowsVertical();
    }

    public static Icon artboard() {
        return TablerIconsA2.artboard();
    }

    public static Icon artboardOff() {
        return TablerIconsA2.artboardOff();
    }

    public static Icon article() {
        return TablerIconsA2.article();
    }

    public static Icon articleOff() {
        return TablerIconsA2.articleOff();
    }

    public static Icon aspectRatio() {
        return TablerIconsA2.aspectRatio();
    }

    public static Icon aspectRatioOff() {
        return TablerIconsA2.aspectRatioOff();
    }

    public static Icon assembly() {
        return TablerIconsA2.assembly();
    }

    public static Icon assemblyOff() {
        return TablerIconsA2.assemblyOff();
    }

    public static Icon asset() {
        return TablerIconsA2.asset();
    }

    public static Icon asterisk() {
        return TablerIconsA2.asterisk();
    }

    public static Icon asteriskSimple() {
        return TablerIconsA2.asteriskSimple();
    }

    public static Icon at() {
        return TablerIconsA2.at();
    }

    public static Icon atOff() {
        return TablerIconsA2.atOff();
    }

    public static Icon atom() {
        return TablerIconsA2.atom();
    }

    public static Icon atomN2() {
        return TablerIconsA2.atomN2();
    }

    public static Icon atomOff() {
        return TablerIconsA2.atomOff();
    }

    public static Icon augmentedReality() {
        return TablerIconsA2.augmentedReality();
    }

    public static Icon augmentedRealityN2() {
        return TablerIconsA2.augmentedRealityN2();
    }

    public static Icon augmentedRealityOff() {
        return TablerIconsA2.augmentedRealityOff();
    }

    public static Icon auth2fa() {
        return TablerIconsA2.auth2fa();
    }

    public static Icon automaticGearbox() {
        return TablerIconsA2.automaticGearbox();
    }

    public static Icon automation() {
        return TablerIconsA2.automation();
    }

    public static Icon avocado() {
        return TablerIconsA2.avocado();
    }

    public static Icon award() {
        return TablerIconsA2.award();
    }

    public static Icon awardOff() {
        return TablerIconsA2.awardOff();
    }

    public static Icon axe() {
        return TablerIconsA2.axe();
    }

    public static Icon axisX() {
        return TablerIconsA2.axisX();
    }

    public static Icon axisY() {
        return TablerIconsA3.axisY();
    }

    public static Icon babyBottle() {
        return TablerIconsB1.babyBottle();
    }

    public static Icon babyCarriage() {
        return TablerIconsB1.babyCarriage();
    }

    public static Icon background() {
        return TablerIconsB1.background();
    }

    public static Icon backhoe() {
        return TablerIconsB1.backhoe();
    }

    public static Icon backpack() {
        return TablerIconsB1.backpack();
    }

    public static Icon backpackOff() {
        return TablerIconsB1.backpackOff();
    }

    public static Icon backslash() {
        return TablerIconsB1.backslash();
    }

    public static Icon backspace() {
        return TablerIconsB1.backspace();
    }

    public static Icon badge() {
        return TablerIconsB1.badge();
    }

    public static Icon badge2k() {
        return TablerIconsB1.badge2k();
    }

    public static Icon badge3d() {
        return TablerIconsB1.badge3d();
    }

    public static Icon badge3k() {
        return TablerIconsB1.badge3k();
    }

    public static Icon badge4k() {
        return TablerIconsB1.badge4k();
    }

    public static Icon badge5k() {
        return TablerIconsB1.badge5k();
    }

    public static Icon badge8k() {
        return TablerIconsB1.badge8k();
    }

    public static Icon badgeAd() {
        return TablerIconsB1.badgeAd();
    }

    public static Icon badgeAdOff() {
        return TablerIconsB1.badgeAdOff();
    }

    public static Icon badgeAr() {
        return TablerIconsB1.badgeAr();
    }

    public static Icon badgeCc() {
        return TablerIconsB1.badgeCc();
    }

    public static Icon badgeHd() {
        return TablerIconsB1.badgeHd();
    }

    public static Icon badgeOff() {
        return TablerIconsB1.badgeOff();
    }

    public static Icon badgeSd() {
        return TablerIconsB1.badgeSd();
    }

    public static Icon badgeTm() {
        return TablerIconsB1.badgeTm();
    }

    public static Icon badgeVo() {
        return TablerIconsB1.badgeVo();
    }

    public static Icon badgeVr() {
        return TablerIconsB1.badgeVr();
    }

    public static Icon badgeWc() {
        return TablerIconsB1.badgeWc();
    }

    public static Icon badges() {
        return TablerIconsB1.badges();
    }

    public static Icon badgesOff() {
        return TablerIconsB1.badgesOff();
    }

    public static Icon baguette() {
        return TablerIconsB1.baguette();
    }

    public static Icon ballAmericanFootball() {
        return TablerIconsB1.ballAmericanFootball();
    }

    public static Icon ballAmericanFootballOff() {
        return TablerIconsB1.ballAmericanFootballOff();
    }

    public static Icon ballBaseball() {
        return TablerIconsB1.ballBaseball();
    }

    public static Icon ballBasketball() {
        return TablerIconsB1.ballBasketball();
    }

    public static Icon ballBowling() {
        return TablerIconsB1.ballBowling();
    }

    public static Icon ballFootball() {
        return TablerIconsB1.ballFootball();
    }

    public static Icon ballFootballOff() {
        return TablerIconsB1.ballFootballOff();
    }

    public static Icon ballTennis() {
        return TablerIconsB1.ballTennis();
    }

    public static Icon ballVolleyball() {
        return TablerIconsB1.ballVolleyball();
    }

    public static Icon balloon() {
        return TablerIconsB1.balloon();
    }

    public static Icon balloonOff() {
        return TablerIconsB1.balloonOff();
    }

    public static Icon ballpen() {
        return TablerIconsB1.ballpen();
    }

    public static Icon ballpenOff() {
        return TablerIconsB1.ballpenOff();
    }

    public static Icon ban() {
        return TablerIconsB1.ban();
    }

    public static Icon banana() {
        return TablerIconsB1.banana();
    }

    public static Icon bandage() {
        return TablerIconsB1.bandage();
    }

    public static Icon bandageOff() {
        return TablerIconsB1.bandageOff();
    }

    public static Icon barbell() {
        return TablerIconsB1.barbell();
    }

    public static Icon barbellOff() {
        return TablerIconsB1.barbellOff();
    }

    public static Icon barcode() {
        return TablerIconsB1.barcode();
    }

    public static Icon barcodeOff() {
        return TablerIconsB1.barcodeOff();
    }

    public static Icon barrel() {
        return TablerIconsB1.barrel();
    }

    public static Icon barrelOff() {
        return TablerIconsB1.barrelOff();
    }

    public static Icon barrierBlock() {
        return TablerIconsB1.barrierBlock();
    }

    public static Icon barrierBlockOff() {
        return TablerIconsB1.barrierBlockOff();
    }

    public static Icon baseline() {
        return TablerIconsB1.baseline();
    }

    public static Icon baselineDensityLarge() {
        return TablerIconsB1.baselineDensityLarge();
    }

    public static Icon baselineDensityMedium() {
        return TablerIconsB1.baselineDensityMedium();
    }

    public static Icon baselineDensitySmall() {
        return TablerIconsB1.baselineDensitySmall();
    }

    public static Icon basket() {
        return TablerIconsB1.basket();
    }

    public static Icon basketBolt() {
        return TablerIconsB1.basketBolt();
    }

    public static Icon basketCancel() {
        return TablerIconsB1.basketCancel();
    }

    public static Icon basketCheck() {
        return TablerIconsB1.basketCheck();
    }

    public static Icon basketCode() {
        return TablerIconsB1.basketCode();
    }

    public static Icon basketCog() {
        return TablerIconsB1.basketCog();
    }

    public static Icon basketDiscount() {
        return TablerIconsB1.basketDiscount();
    }

    public static Icon basketDollar() {
        return TablerIconsB1.basketDollar();
    }

    public static Icon basketDown() {
        return TablerIconsB1.basketDown();
    }

    public static Icon basketExclamation() {
        return TablerIconsB1.basketExclamation();
    }

    public static Icon basketHeart() {
        return TablerIconsB1.basketHeart();
    }

    public static Icon basketMinus() {
        return TablerIconsB1.basketMinus();
    }

    public static Icon basketOff() {
        return TablerIconsB1.basketOff();
    }

    public static Icon basketPause() {
        return TablerIconsB1.basketPause();
    }

    public static Icon basketPin() {
        return TablerIconsB1.basketPin();
    }

    public static Icon basketPlus() {
        return TablerIconsB1.basketPlus();
    }

    public static Icon basketQuestion() {
        return TablerIconsB1.basketQuestion();
    }

    public static Icon basketSearch() {
        return TablerIconsB1.basketSearch();
    }

    public static Icon basketShare() {
        return TablerIconsB1.basketShare();
    }

    public static Icon basketStar() {
        return TablerIconsB1.basketStar();
    }

    public static Icon basketUp() {
        return TablerIconsB1.basketUp();
    }

    public static Icon basketX() {
        return TablerIconsB1.basketX();
    }

    public static Icon bat() {
        return TablerIconsB1.bat();
    }

    public static Icon bath() {
        return TablerIconsB1.bath();
    }

    public static Icon bathOff() {
        return TablerIconsB1.bathOff();
    }

    public static Icon battery() {
        return TablerIconsB1.battery();
    }

    public static Icon batteryN1() {
        return TablerIconsB1.batteryN1();
    }

    public static Icon batteryN2() {
        return TablerIconsB1.batteryN2();
    }

    public static Icon batteryN3() {
        return TablerIconsB1.batteryN3();
    }

    public static Icon batteryN4() {
        return TablerIconsB1.batteryN4();
    }

    public static Icon batteryAutomotive() {
        return TablerIconsB1.batteryAutomotive();
    }

    public static Icon batteryCharging() {
        return TablerIconsB1.batteryCharging();
    }

    public static Icon batteryChargingN2() {
        return TablerIconsB1.batteryChargingN2();
    }

    public static Icon batteryEco() {
        return TablerIconsB1.batteryEco();
    }

    public static Icon batteryExclamation() {
        return TablerIconsB1.batteryExclamation();
    }

    public static Icon batteryOff() {
        return TablerIconsB1.batteryOff();
    }

    public static Icon batterySpark() {
        return TablerIconsB1.batterySpark();
    }

    public static Icon batteryVertical() {
        return TablerIconsB1.batteryVertical();
    }

    public static Icon batteryVerticalN1() {
        return TablerIconsB1.batteryVerticalN1();
    }

    public static Icon batteryVerticalN2() {
        return TablerIconsB1.batteryVerticalN2();
    }

    public static Icon batteryVerticalN3() {
        return TablerIconsB1.batteryVerticalN3();
    }

    public static Icon batteryVerticalN4() {
        return TablerIconsB1.batteryVerticalN4();
    }

    public static Icon batteryVerticalCharging() {
        return TablerIconsB1.batteryVerticalCharging();
    }

    public static Icon batteryVerticalChargingN2() {
        return TablerIconsB1.batteryVerticalChargingN2();
    }

    public static Icon batteryVerticalEco() {
        return TablerIconsB1.batteryVerticalEco();
    }

    public static Icon batteryVerticalExclamation() {
        return TablerIconsB1.batteryVerticalExclamation();
    }

    public static Icon batteryVerticalOff() {
        return TablerIconsB1.batteryVerticalOff();
    }

    public static Icon beach() {
        return TablerIconsB1.beach();
    }

    public static Icon beachOff() {
        return TablerIconsB1.beachOff();
    }

    public static Icon bed() {
        return TablerIconsB1.bed();
    }

    public static Icon bedFlat() {
        return TablerIconsB1.bedFlat();
    }

    public static Icon bedOff() {
        return TablerIconsB1.bedOff();
    }

    public static Icon beer() {
        return TablerIconsB1.beer();
    }

    public static Icon beerOff() {
        return TablerIconsB1.beerOff();
    }

    public static Icon bell() {
        return TablerIconsB1.bell();
    }

    public static Icon bellBolt() {
        return TablerIconsB1.bellBolt();
    }

    public static Icon bellCancel() {
        return TablerIconsB1.bellCancel();
    }

    public static Icon bellCheck() {
        return TablerIconsB1.bellCheck();
    }

    public static Icon bellCode() {
        return TablerIconsB1.bellCode();
    }

    public static Icon bellCog() {
        return TablerIconsB1.bellCog();
    }

    public static Icon bellDollar() {
        return TablerIconsB1.bellDollar();
    }

    public static Icon bellDown() {
        return TablerIconsB1.bellDown();
    }

    public static Icon bellExclamation() {
        return TablerIconsB1.bellExclamation();
    }

    public static Icon bellHeart() {
        return TablerIconsB1.bellHeart();
    }

    public static Icon bellMinus() {
        return TablerIconsB1.bellMinus();
    }

    public static Icon bellOff() {
        return TablerIconsB1.bellOff();
    }

    public static Icon bellPause() {
        return TablerIconsB1.bellPause();
    }

    public static Icon bellPin() {
        return TablerIconsB1.bellPin();
    }

    public static Icon bellPlus() {
        return TablerIconsB1.bellPlus();
    }

    public static Icon bellQuestion() {
        return TablerIconsB1.bellQuestion();
    }

    public static Icon bellRinging() {
        return TablerIconsB1.bellRinging();
    }

    public static Icon bellRingingN2() {
        return TablerIconsB1.bellRingingN2();
    }

    public static Icon bellSchool() {
        return TablerIconsB1.bellSchool();
    }

    public static Icon bellSearch() {
        return TablerIconsB1.bellSearch();
    }

    public static Icon bellShare() {
        return TablerIconsB1.bellShare();
    }

    public static Icon bellStar() {
        return TablerIconsB1.bellStar();
    }

    public static Icon bellUp() {
        return TablerIconsB1.bellUp();
    }

    public static Icon bellX() {
        return TablerIconsB1.bellX();
    }

    public static Icon bellZ() {
        return TablerIconsB1.bellZ();
    }

    public static Icon beta() {
        return TablerIconsB1.beta();
    }

    public static Icon bible() {
        return TablerIconsB1.bible();
    }

    public static Icon bike() {
        return TablerIconsB1.bike();
    }

    public static Icon bikeOff() {
        return TablerIconsB1.bikeOff();
    }

    public static Icon binary() {
        return TablerIconsB1.binary();
    }

    public static Icon binaryOff() {
        return TablerIconsB1.binaryOff();
    }

    public static Icon binaryTree() {
        return TablerIconsB1.binaryTree();
    }

    public static Icon binaryTreeN2() {
        return TablerIconsB1.binaryTreeN2();
    }

    public static Icon binoculars() {
        return TablerIconsB1.binoculars();
    }

    public static Icon biohazard() {
        return TablerIconsB1.biohazard();
    }

    public static Icon biohazardOff() {
        return TablerIconsB1.biohazardOff();
    }

    public static Icon blade() {
        return TablerIconsB1.blade();
    }

    public static Icon bleach() {
        return TablerIconsB1.bleach();
    }

    public static Icon bleachChlorine() {
        return TablerIconsB1.bleachChlorine();
    }

    public static Icon bleachNoChlorine() {
        return TablerIconsB1.bleachNoChlorine();
    }

    public static Icon bleachOff() {
        return TablerIconsB1.bleachOff();
    }

    public static Icon blendMode() {
        return TablerIconsB1.blendMode();
    }

    public static Icon blender() {
        return TablerIconsB1.blender();
    }

    public static Icon blind() {
        return TablerIconsB1.blind();
    }

    public static Icon blob() {
        return TablerIconsB1.blob();
    }

    public static Icon blockquote() {
        return TablerIconsB1.blockquote();
    }

    public static Icon blocks() {
        return TablerIconsB1.blocks();
    }

    public static Icon bluetooth() {
        return TablerIconsB1.bluetooth();
    }

    public static Icon bluetoothConnected() {
        return TablerIconsB1.bluetoothConnected();
    }

    public static Icon bluetoothOff() {
        return TablerIconsB1.bluetoothOff();
    }

    public static Icon bluetoothX() {
        return TablerIconsB1.bluetoothX();
    }

    public static Icon blur() {
        return TablerIconsB1.blur();
    }

    public static Icon blurOff() {
        return TablerIconsB1.blurOff();
    }

    public static Icon bmp() {
        return TablerIconsB1.bmp();
    }

    public static Icon bodyScan() {
        return TablerIconsB1.bodyScan();
    }

    public static Icon bold() {
        return TablerIconsB1.bold();
    }

    public static Icon boldOff() {
        return TablerIconsB1.boldOff();
    }

    public static Icon bolt() {
        return TablerIconsB1.bolt();
    }

    public static Icon boltOff() {
        return TablerIconsB1.boltOff();
    }

    public static Icon bomb() {
        return TablerIconsB1.bomb();
    }

    public static Icon bone() {
        return TablerIconsB1.bone();
    }

    public static Icon boneOff() {
        return TablerIconsB1.boneOff();
    }

    public static Icon bong() {
        return TablerIconsB1.bong();
    }

    public static Icon bongOff() {
        return TablerIconsB1.bongOff();
    }

    public static Icon book() {
        return TablerIconsB1.book();
    }

    public static Icon bookN2() {
        return TablerIconsB1.bookN2();
    }

    public static Icon bookDownload() {
        return TablerIconsB1.bookDownload();
    }

    public static Icon bookOff() {
        return TablerIconsB1.bookOff();
    }

    public static Icon bookUpload() {
        return TablerIconsB2.bookUpload();
    }

    public static Icon bookmark() {
        return TablerIconsB2.bookmark();
    }

    public static Icon bookmarkAi() {
        return TablerIconsB2.bookmarkAi();
    }

    public static Icon bookmarkEdit() {
        return TablerIconsB2.bookmarkEdit();
    }

    public static Icon bookmarkMinus() {
        return TablerIconsB2.bookmarkMinus();
    }

    public static Icon bookmarkOff() {
        return TablerIconsB2.bookmarkOff();
    }

    public static Icon bookmarkPlus() {
        return TablerIconsB2.bookmarkPlus();
    }

    public static Icon bookmarkQuestion() {
        return TablerIconsB2.bookmarkQuestion();
    }

    public static Icon bookmarks() {
        return TablerIconsB2.bookmarks();
    }

    public static Icon bookmarksOff() {
        return TablerIconsB2.bookmarksOff();
    }

    public static Icon books() {
        return TablerIconsB2.books();
    }

    public static Icon booksOff() {
        return TablerIconsB2.booksOff();
    }

    public static Icon boom() {
        return TablerIconsB2.boom();
    }

    public static Icon borderAll() {
        return TablerIconsB2.borderAll();
    }

    public static Icon borderBottom() {
        return TablerIconsB2.borderBottom();
    }

    public static Icon borderBottomPlus() {
        return TablerIconsB2.borderBottomPlus();
    }

    public static Icon borderCornerIos() {
        return TablerIconsB2.borderCornerIos();
    }

    public static Icon borderCornerPill() {
        return TablerIconsB2.borderCornerPill();
    }

    public static Icon borderCornerRounded() {
        return TablerIconsB2.borderCornerRounded();
    }

    public static Icon borderCornerSquare() {
        return TablerIconsB2.borderCornerSquare();
    }

    public static Icon borderCorners() {
        return TablerIconsB2.borderCorners();
    }

    public static Icon borderHorizontal() {
        return TablerIconsB2.borderHorizontal();
    }

    public static Icon borderInner() {
        return TablerIconsB2.borderInner();
    }

    public static Icon borderLeft() {
        return TablerIconsB2.borderLeft();
    }

    public static Icon borderLeftPlus() {
        return TablerIconsB2.borderLeftPlus();
    }

    public static Icon borderNone() {
        return TablerIconsB2.borderNone();
    }

    public static Icon borderOuter() {
        return TablerIconsB2.borderOuter();
    }

    public static Icon borderRadius() {
        return TablerIconsB2.borderRadius();
    }

    public static Icon borderRight() {
        return TablerIconsB2.borderRight();
    }

    public static Icon borderRightPlus() {
        return TablerIconsB2.borderRightPlus();
    }

    public static Icon borderSides() {
        return TablerIconsB2.borderSides();
    }

    public static Icon borderStyle() {
        return TablerIconsB2.borderStyle();
    }

    public static Icon borderStyleN2() {
        return TablerIconsB2.borderStyleN2();
    }

    public static Icon borderTop() {
        return TablerIconsB2.borderTop();
    }

    public static Icon borderTopPlus() {
        return TablerIconsB2.borderTopPlus();
    }

    public static Icon borderVertical() {
        return TablerIconsB2.borderVertical();
    }

    public static Icon botId() {
        return TablerIconsB2.botId();
    }

    public static Icon bottle() {
        return TablerIconsB2.bottle();
    }

    public static Icon bottleOff() {
        return TablerIconsB2.bottleOff();
    }

    public static Icon bounceLeft() {
        return TablerIconsB2.bounceLeft();
    }

    public static Icon bounceRight() {
        return TablerIconsB2.bounceRight();
    }

    public static Icon bow() {
        return TablerIconsB2.bow();
    }

    public static Icon bowl() {
        return TablerIconsB2.bowl();
    }

    public static Icon bowlChopsticks() {
        return TablerIconsB2.bowlChopsticks();
    }

    public static Icon bowlSpoon() {
        return TablerIconsB2.bowlSpoon();
    }

    public static Icon bowling() {
        return TablerIconsB2.bowling();
    }

    public static Icon box() {
        return TablerIconsB2.box();
    }

    public static Icon boxAlignBottom() {
        return TablerIconsB2.boxAlignBottom();
    }

    public static Icon boxAlignBottomLeft() {
        return TablerIconsB2.boxAlignBottomLeft();
    }

    public static Icon boxAlignBottomRight() {
        return TablerIconsB2.boxAlignBottomRight();
    }

    public static Icon boxAlignLeft() {
        return TablerIconsB2.boxAlignLeft();
    }

    public static Icon boxAlignRight() {
        return TablerIconsB2.boxAlignRight();
    }

    public static Icon boxAlignTop() {
        return TablerIconsB2.boxAlignTop();
    }

    public static Icon boxAlignTopLeft() {
        return TablerIconsB2.boxAlignTopLeft();
    }

    public static Icon boxAlignTopRight() {
        return TablerIconsB2.boxAlignTopRight();
    }

    public static Icon boxMargin() {
        return TablerIconsB2.boxMargin();
    }

    public static Icon boxModel() {
        return TablerIconsB2.boxModel();
    }

    public static Icon boxModelN2() {
        return TablerIconsB2.boxModelN2();
    }

    public static Icon boxModelN2Off() {
        return TablerIconsB2.boxModelN2Off();
    }

    public static Icon boxModelOff() {
        return TablerIconsB2.boxModelOff();
    }

    public static Icon boxMultiple() {
        return TablerIconsB2.boxMultiple();
    }

    public static Icon boxMultipleN0() {
        return TablerIconsB2.boxMultipleN0();
    }

    public static Icon boxMultipleN1() {
        return TablerIconsB2.boxMultipleN1();
    }

    public static Icon boxMultipleN2() {
        return TablerIconsB2.boxMultipleN2();
    }

    public static Icon boxMultipleN3() {
        return TablerIconsB2.boxMultipleN3();
    }

    public static Icon boxMultipleN4() {
        return TablerIconsB2.boxMultipleN4();
    }

    public static Icon boxMultipleN5() {
        return TablerIconsB2.boxMultipleN5();
    }

    public static Icon boxMultipleN6() {
        return TablerIconsB2.boxMultipleN6();
    }

    public static Icon boxMultipleN7() {
        return TablerIconsB2.boxMultipleN7();
    }

    public static Icon boxMultipleN8() {
        return TablerIconsB2.boxMultipleN8();
    }

    public static Icon boxMultipleN9() {
        return TablerIconsB2.boxMultipleN9();
    }

    public static Icon boxOff() {
        return TablerIconsB2.boxOff();
    }

    public static Icon boxPadding() {
        return TablerIconsB2.boxPadding();
    }

    public static Icon braces() {
        return TablerIconsB2.braces();
    }

    public static Icon bracesOff() {
        return TablerIconsB2.bracesOff();
    }

    public static Icon brackets() {
        return TablerIconsB2.brackets();
    }

    public static Icon bracketsAngle() {
        return TablerIconsB2.bracketsAngle();
    }

    public static Icon bracketsAngleOff() {
        return TablerIconsB2.bracketsAngleOff();
    }

    public static Icon bracketsContain() {
        return TablerIconsB2.bracketsContain();
    }

    public static Icon bracketsContainEnd() {
        return TablerIconsB2.bracketsContainEnd();
    }

    public static Icon bracketsContainStart() {
        return TablerIconsB2.bracketsContainStart();
    }

    public static Icon bracketsOff() {
        return TablerIconsB2.bracketsOff();
    }

    public static Icon braille() {
        return TablerIconsB2.braille();
    }

    public static Icon brain() {
        return TablerIconsB2.brain();
    }

    public static Icon brand4chan() {
        return TablerIconsB2.brand4chan();
    }

    public static Icon brandAbstract() {
        return TablerIconsB2.brandAbstract();
    }

    public static Icon brandAdobe() {
        return TablerIconsB2.brandAdobe();
    }

    public static Icon brandAdobeAfterEffect() {
        return TablerIconsB2.brandAdobeAfterEffect();
    }

    public static Icon brandAdobeIllustrator() {
        return TablerIconsB2.brandAdobeIllustrator();
    }

    public static Icon brandAdobeIndesign() {
        return TablerIconsB2.brandAdobeIndesign();
    }

    public static Icon brandAdobePhotoshop() {
        return TablerIconsB2.brandAdobePhotoshop();
    }

    public static Icon brandAdobePremiere() {
        return TablerIconsB2.brandAdobePremiere();
    }

    public static Icon brandAdobeXd() {
        return TablerIconsB2.brandAdobeXd();
    }

    public static Icon brandAdonisJs() {
        return TablerIconsB2.brandAdonisJs();
    }

    public static Icon brandAirbnb() {
        return TablerIconsB2.brandAirbnb();
    }

    public static Icon brandAirtable() {
        return TablerIconsB2.brandAirtable();
    }

    public static Icon brandAlgolia() {
        return TablerIconsB2.brandAlgolia();
    }

    public static Icon brandAlipay() {
        return TablerIconsB2.brandAlipay();
    }

    public static Icon brandAlpineJs() {
        return TablerIconsB2.brandAlpineJs();
    }

    public static Icon brandAmazon() {
        return TablerIconsB2.brandAmazon();
    }

    public static Icon brandAmd() {
        return TablerIconsB2.brandAmd();
    }

    public static Icon brandAmie() {
        return TablerIconsB2.brandAmie();
    }

    public static Icon brandAmigo() {
        return TablerIconsB2.brandAmigo();
    }

    public static Icon brandAmongUs() {
        return TablerIconsB2.brandAmongUs();
    }

    public static Icon brandAndroid() {
        return TablerIconsB2.brandAndroid();
    }

    public static Icon brandAngular() {
        return TablerIconsB2.brandAngular();
    }

    public static Icon brandAnsible() {
        return TablerIconsB2.brandAnsible();
    }

    public static Icon brandAo3() {
        return TablerIconsB2.brandAo3();
    }

    public static Icon brandAppgallery() {
        return TablerIconsB2.brandAppgallery();
    }

    public static Icon brandApple() {
        return TablerIconsB2.brandApple();
    }

    public static Icon brandAppleArcade() {
        return TablerIconsB2.brandAppleArcade();
    }

    public static Icon brandAppleNews() {
        return TablerIconsB2.brandAppleNews();
    }

    public static Icon brandApplePodcast() {
        return TablerIconsB2.brandApplePodcast();
    }

    public static Icon brandAppstore() {
        return TablerIconsB2.brandAppstore();
    }

    public static Icon brandArc() {
        return TablerIconsB2.brandArc();
    }

    public static Icon brandAsana() {
        return TablerIconsB2.brandAsana();
    }

    public static Icon brandAstro() {
        return TablerIconsB2.brandAstro();
    }

    public static Icon brandAudible() {
        return TablerIconsB2.brandAudible();
    }

    public static Icon brandAuth0() {
        return TablerIconsB2.brandAuth0();
    }

    public static Icon brandAws() {
        return TablerIconsB2.brandAws();
    }

    public static Icon brandAzure() {
        return TablerIconsB2.brandAzure();
    }

    public static Icon brandBackbone() {
        return TablerIconsB2.brandBackbone();
    }

    public static Icon brandBadoo() {
        return TablerIconsB2.brandBadoo();
    }

    public static Icon brandBaidu() {
        return TablerIconsB2.brandBaidu();
    }

    public static Icon brandBandcamp() {
        return TablerIconsB2.brandBandcamp();
    }

    public static Icon brandBandlab() {
        return TablerIconsB2.brandBandlab();
    }

    public static Icon brandBeats() {
        return TablerIconsB2.brandBeats();
    }

    public static Icon brandBebo() {
        return TablerIconsB2.brandBebo();
    }

    public static Icon brandBehance() {
        return TablerIconsB2.brandBehance();
    }

    public static Icon brandBilibili() {
        return TablerIconsB2.brandBilibili();
    }

    public static Icon brandBinance() {
        return TablerIconsB2.brandBinance();
    }

    public static Icon brandBing() {
        return TablerIconsB2.brandBing();
    }

    public static Icon brandBitbucket() {
        return TablerIconsB2.brandBitbucket();
    }

    public static Icon brandBlackberry() {
        return TablerIconsB2.brandBlackberry();
    }

    public static Icon brandBlender() {
        return TablerIconsB2.brandBlender();
    }

    public static Icon brandBlogger() {
        return TablerIconsB2.brandBlogger();
    }

    public static Icon brandBluesky() {
        return TablerIconsB2.brandBluesky();
    }

    public static Icon brandBooking() {
        return TablerIconsB2.brandBooking();
    }

    public static Icon brandBootstrap() {
        return TablerIconsB2.brandBootstrap();
    }

    public static Icon brandBulma() {
        return TablerIconsB2.brandBulma();
    }

    public static Icon brandBumble() {
        return TablerIconsB2.brandBumble();
    }

    public static Icon brandBunpo() {
        return TablerIconsB2.brandBunpo();
    }

    public static Icon brandCSharp() {
        return TablerIconsB2.brandCSharp();
    }

    public static Icon brandCake() {
        return TablerIconsB2.brandCake();
    }

    public static Icon brandCakephp() {
        return TablerIconsB2.brandCakephp();
    }

    public static Icon brandCampaignmonitor() {
        return TablerIconsB2.brandCampaignmonitor();
    }

    public static Icon brandCarbon() {
        return TablerIconsB2.brandCarbon();
    }

    public static Icon brandCashapp() {
        return TablerIconsB2.brandCashapp();
    }

    public static Icon brandChrome() {
        return TablerIconsB2.brandChrome();
    }

    public static Icon brandCinema4d() {
        return TablerIconsB2.brandCinema4d();
    }

    public static Icon brandCitymapper() {
        return TablerIconsB2.brandCitymapper();
    }

    public static Icon brandCloudflare() {
        return TablerIconsB2.brandCloudflare();
    }

    public static Icon brandCodecov() {
        return TablerIconsB2.brandCodecov();
    }

    public static Icon brandCodepen() {
        return TablerIconsB2.brandCodepen();
    }

    public static Icon brandCodesandbox() {
        return TablerIconsB2.brandCodesandbox();
    }

    public static Icon brandCohost() {
        return TablerIconsB2.brandCohost();
    }

    public static Icon brandCoinbase() {
        return TablerIconsB2.brandCoinbase();
    }

    public static Icon brandComedyCentral() {
        return TablerIconsB2.brandComedyCentral();
    }

    public static Icon brandCoreos() {
        return TablerIconsB2.brandCoreos();
    }

    public static Icon brandCouchdb() {
        return TablerIconsB2.brandCouchdb();
    }

    public static Icon brandCouchsurfing() {
        return TablerIconsB2.brandCouchsurfing();
    }

    public static Icon brandCpp() {
        return TablerIconsB2.brandCpp();
    }

    public static Icon brandCraft() {
        return TablerIconsB2.brandCraft();
    }

    public static Icon brandCrunchbase() {
        return TablerIconsB2.brandCrunchbase();
    }

    public static Icon brandCss3() {
        return TablerIconsB2.brandCss3();
    }

    public static Icon brandCtemplar() {
        return TablerIconsB2.brandCtemplar();
    }

    public static Icon brandCucumber() {
        return TablerIconsB2.brandCucumber();
    }

    public static Icon brandCupra() {
        return TablerIconsB2.brandCupra();
    }

    public static Icon brandCypress() {
        return TablerIconsB2.brandCypress();
    }

    public static Icon brandD3() {
        return TablerIconsB2.brandD3();
    }

    public static Icon brandDatabricks() {
        return TablerIconsB2.brandDatabricks();
    }

    public static Icon brandDaysCounter() {
        return TablerIconsB2.brandDaysCounter();
    }

    public static Icon brandDcos() {
        return TablerIconsB2.brandDcos();
    }

    public static Icon brandDebian() {
        return TablerIconsB2.brandDebian();
    }

    public static Icon brandDeezer() {
        return TablerIconsB2.brandDeezer();
    }

    public static Icon brandDeliveroo() {
        return TablerIconsB2.brandDeliveroo();
    }

    public static Icon brandDeno() {
        return TablerIconsB2.brandDeno();
    }

    public static Icon brandDenodo() {
        return TablerIconsB2.brandDenodo();
    }

    public static Icon brandDeviantart() {
        return TablerIconsB2.brandDeviantart();
    }

    public static Icon brandDigg() {
        return TablerIconsB2.brandDigg();
    }

    public static Icon brandDingtalk() {
        return TablerIconsB3.brandDingtalk();
    }

    public static Icon brandDiscord() {
        return TablerIconsB3.brandDiscord();
    }

    public static Icon brandDisney() {
        return TablerIconsB3.brandDisney();
    }

    public static Icon brandDisqus() {
        return TablerIconsB3.brandDisqus();
    }

    public static Icon brandDjango() {
        return TablerIconsB3.brandDjango();
    }

    public static Icon brandDocker() {
        return TablerIconsB3.brandDocker();
    }

    public static Icon brandDoctrine() {
        return TablerIconsB3.brandDoctrine();
    }

    public static Icon brandDolbyDigital() {
        return TablerIconsB3.brandDolbyDigital();
    }

    public static Icon brandDouban() {
        return TablerIconsB3.brandDouban();
    }

    public static Icon brandDribbble() {
        return TablerIconsB3.brandDribbble();
    }

    public static Icon brandDropbox() {
        return TablerIconsB3.brandDropbox();
    }

    public static Icon brandDrops() {
        return TablerIconsB3.brandDrops();
    }

    public static Icon brandDrupal() {
        return TablerIconsB3.brandDrupal();
    }

    public static Icon brandEdge() {
        return TablerIconsB3.brandEdge();
    }

    public static Icon brandElastic() {
        return TablerIconsB3.brandElastic();
    }

    public static Icon brandElectronicArts() {
        return TablerIconsB3.brandElectronicArts();
    }

    public static Icon brandEmber() {
        return TablerIconsB3.brandEmber();
    }

    public static Icon brandEnvato() {
        return TablerIconsB3.brandEnvato();
    }

    public static Icon brandEtsy() {
        return TablerIconsB3.brandEtsy();
    }

    public static Icon brandEvernote() {
        return TablerIconsB3.brandEvernote();
    }

    public static Icon brandFacebook() {
        return TablerIconsB3.brandFacebook();
    }

    public static Icon brandFeedly() {
        return TablerIconsB3.brandFeedly();
    }

    public static Icon brandFigma() {
        return TablerIconsB3.brandFigma();
    }

    public static Icon brandFilezilla() {
        return TablerIconsB3.brandFilezilla();
    }

    public static Icon brandFinder() {
        return TablerIconsB3.brandFinder();
    }

    public static Icon brandFirebase() {
        return TablerIconsB3.brandFirebase();
    }

    public static Icon brandFirefox() {
        return TablerIconsB3.brandFirefox();
    }

    public static Icon brandFiverr() {
        return TablerIconsB3.brandFiverr();
    }

    public static Icon brandFlickr() {
        return TablerIconsB3.brandFlickr();
    }

    public static Icon brandFlightradar24() {
        return TablerIconsB3.brandFlightradar24();
    }

    public static Icon brandFlipboard() {
        return TablerIconsB3.brandFlipboard();
    }

    public static Icon brandFlutter() {
        return TablerIconsB3.brandFlutter();
    }

    public static Icon brandFortnite() {
        return TablerIconsB3.brandFortnite();
    }

    public static Icon brandFoursquare() {
        return TablerIconsB3.brandFoursquare();
    }

    public static Icon brandFramer() {
        return TablerIconsB3.brandFramer();
    }

    public static Icon brandFramerMotion() {
        return TablerIconsB3.brandFramerMotion();
    }

    public static Icon brandFunimation() {
        return TablerIconsB3.brandFunimation();
    }

    public static Icon brandGatsby() {
        return TablerIconsB3.brandGatsby();
    }

    public static Icon brandGit() {
        return TablerIconsB3.brandGit();
    }

    public static Icon brandGithub() {
        return TablerIconsB3.brandGithub();
    }

    public static Icon brandGithubCopilot() {
        return TablerIconsB3.brandGithubCopilot();
    }

    public static Icon brandGitlab() {
        return TablerIconsB3.brandGitlab();
    }

    public static Icon brandGmail() {
        return TablerIconsB3.brandGmail();
    }

    public static Icon brandGolang() {
        return TablerIconsB3.brandGolang();
    }

    public static Icon brandGoogle() {
        return TablerIconsB3.brandGoogle();
    }

    public static Icon brandGoogleAnalytics() {
        return TablerIconsB3.brandGoogleAnalytics();
    }

    public static Icon brandGoogleBigQuery() {
        return TablerIconsB3.brandGoogleBigQuery();
    }

    public static Icon brandGoogleDrive() {
        return TablerIconsB3.brandGoogleDrive();
    }

    public static Icon brandGoogleFit() {
        return TablerIconsB3.brandGoogleFit();
    }

    public static Icon brandGoogleHome() {
        return TablerIconsB3.brandGoogleHome();
    }

    public static Icon brandGoogleMaps() {
        return TablerIconsB3.brandGoogleMaps();
    }

    public static Icon brandGoogleOne() {
        return TablerIconsB3.brandGoogleOne();
    }

    public static Icon brandGooglePhotos() {
        return TablerIconsB3.brandGooglePhotos();
    }

    public static Icon brandGooglePlay() {
        return TablerIconsB3.brandGooglePlay();
    }

    public static Icon brandGooglePodcasts() {
        return TablerIconsB3.brandGooglePodcasts();
    }

    public static Icon brandGrammarly() {
        return TablerIconsB3.brandGrammarly();
    }

    public static Icon brandGraphql() {
        return TablerIconsB3.brandGraphql();
    }

    public static Icon brandGravatar() {
        return TablerIconsB3.brandGravatar();
    }

    public static Icon brandGrindr() {
        return TablerIconsB3.brandGrindr();
    }

    public static Icon brandGuardian() {
        return TablerIconsB3.brandGuardian();
    }

    public static Icon brandGumroad() {
        return TablerIconsB3.brandGumroad();
    }

    public static Icon brandHackerrank() {
        return TablerIconsB3.brandHackerrank();
    }

    public static Icon brandHbo() {
        return TablerIconsB3.brandHbo();
    }

    public static Icon brandHeadlessui() {
        return TablerIconsB3.brandHeadlessui();
    }

    public static Icon brandHexo() {
        return TablerIconsB3.brandHexo();
    }

    public static Icon brandHipchat() {
        return TablerIconsB3.brandHipchat();
    }

    public static Icon brandHtml5() {
        return TablerIconsB3.brandHtml5();
    }

    public static Icon brandInertia() {
        return TablerIconsB3.brandInertia();
    }

    public static Icon brandInfakt() {
        return TablerIconsB3.brandInfakt();
    }

    public static Icon brandInstagram() {
        return TablerIconsB3.brandInstagram();
    }

    public static Icon brandIntercom() {
        return TablerIconsB3.brandIntercom();
    }

    public static Icon brandItch() {
        return TablerIconsB3.brandItch();
    }

    public static Icon brandJavascript() {
        return TablerIconsB3.brandJavascript();
    }

    public static Icon brandJira() {
        return TablerIconsB3.brandJira();
    }

    public static Icon brandJuejin() {
        return TablerIconsB3.brandJuejin();
    }

    public static Icon brandKakoTalk() {
        return TablerIconsB3.brandKakoTalk();
    }

    public static Icon brandKbin() {
        return TablerIconsB3.brandKbin();
    }

    public static Icon brandKick() {
        return TablerIconsB3.brandKick();
    }

    public static Icon brandKickstarter() {
        return TablerIconsB3.brandKickstarter();
    }

    public static Icon brandKotlin() {
        return TablerIconsB3.brandKotlin();
    }

    public static Icon brandLaravel() {
        return TablerIconsB3.brandLaravel();
    }

    public static Icon brandLastfm() {
        return TablerIconsB3.brandLastfm();
    }

    public static Icon brandLeetcode() {
        return TablerIconsB3.brandLeetcode();
    }

    public static Icon brandLetterboxd() {
        return TablerIconsB3.brandLetterboxd();
    }

    public static Icon brandLine() {
        return TablerIconsB3.brandLine();
    }

    public static Icon brandLinkedin() {
        return TablerIconsB3.brandLinkedin();
    }

    public static Icon brandLinktree() {
        return TablerIconsB3.brandLinktree();
    }

    public static Icon brandLinqpad() {
        return TablerIconsB3.brandLinqpad();
    }

    public static Icon brandLivewire() {
        return TablerIconsB3.brandLivewire();
    }

    public static Icon brandLoom() {
        return TablerIconsB3.brandLoom();
    }

    public static Icon brandMailgun() {
        return TablerIconsB3.brandMailgun();
    }

    public static Icon brandMantine() {
        return TablerIconsB3.brandMantine();
    }

    public static Icon brandMastercard() {
        return TablerIconsB3.brandMastercard();
    }

    public static Icon brandMastodon() {
        return TablerIconsB3.brandMastodon();
    }

    public static Icon brandMatrix() {
        return TablerIconsB3.brandMatrix();
    }

    public static Icon brandMcdonalds() {
        return TablerIconsB3.brandMcdonalds();
    }

    public static Icon brandMedium() {
        return TablerIconsB3.brandMedium();
    }

    public static Icon brandMeetup() {
        return TablerIconsB3.brandMeetup();
    }

    public static Icon brandMercedes() {
        return TablerIconsB3.brandMercedes();
    }

    public static Icon brandMessenger() {
        return TablerIconsB3.brandMessenger();
    }

    public static Icon brandMeta() {
        return TablerIconsB3.brandMeta();
    }

    public static Icon brandMetabrainz() {
        return TablerIconsB3.brandMetabrainz();
    }

    public static Icon brandMinecraft() {
        return TablerIconsB3.brandMinecraft();
    }

    public static Icon brandMiniprogram() {
        return TablerIconsB3.brandMiniprogram();
    }

    public static Icon brandMixpanel() {
        return TablerIconsB3.brandMixpanel();
    }

    public static Icon brandMonday() {
        return TablerIconsB3.brandMonday();
    }

    public static Icon brandMongodb() {
        return TablerIconsB3.brandMongodb();
    }

    public static Icon brandMyOppo() {
        return TablerIconsB3.brandMyOppo();
    }

    public static Icon brandMysql() {
        return TablerIconsB3.brandMysql();
    }

    public static Icon brandNationalGeographic() {
        return TablerIconsB3.brandNationalGeographic();
    }

    public static Icon brandNem() {
        return TablerIconsB3.brandNem();
    }

    public static Icon brandNetbeans() {
        return TablerIconsB3.brandNetbeans();
    }

    public static Icon brandNeteaseMusic() {
        return TablerIconsB3.brandNeteaseMusic();
    }

    public static Icon brandNetflix() {
        return TablerIconsB3.brandNetflix();
    }

    public static Icon brandNexo() {
        return TablerIconsB3.brandNexo();
    }

    public static Icon brandNextcloud() {
        return TablerIconsB3.brandNextcloud();
    }

    public static Icon brandNextjs() {
        return TablerIconsB3.brandNextjs();
    }

    public static Icon brandNodejs() {
        return TablerIconsB3.brandNodejs();
    }

    public static Icon brandNordVpn() {
        return TablerIconsB3.brandNordVpn();
    }

    public static Icon brandNotion() {
        return TablerIconsB3.brandNotion();
    }

    public static Icon brandNpm() {
        return TablerIconsB3.brandNpm();
    }

    public static Icon brandNuxt() {
        return TablerIconsB3.brandNuxt();
    }

    public static Icon brandNytimes() {
        return TablerIconsB3.brandNytimes();
    }

    public static Icon brandOauth() {
        return TablerIconsB3.brandOauth();
    }

    public static Icon brandOffice() {
        return TablerIconsB3.brandOffice();
    }

    public static Icon brandOkRu() {
        return TablerIconsB3.brandOkRu();
    }

    public static Icon brandOnedrive() {
        return TablerIconsB3.brandOnedrive();
    }

    public static Icon brandOnlyfans() {
        return TablerIconsB3.brandOnlyfans();
    }

    public static Icon brandOpenSource() {
        return TablerIconsB3.brandOpenSource();
    }

    public static Icon brandOpenai() {
        return TablerIconsB3.brandOpenai();
    }

    public static Icon brandOpenvpn() {
        return TablerIconsB3.brandOpenvpn();
    }

    public static Icon brandOpera() {
        return TablerIconsB3.brandOpera();
    }

    public static Icon brandPagekit() {
        return TablerIconsB3.brandPagekit();
    }

    public static Icon brandParsinta() {
        return TablerIconsB3.brandParsinta();
    }

    public static Icon brandPatreon() {
        return TablerIconsB3.brandPatreon();
    }

    public static Icon brandPaypal() {
        return TablerIconsB3.brandPaypal();
    }

    public static Icon brandPaypay() {
        return TablerIconsB3.brandPaypay();
    }

    public static Icon brandPeanut() {
        return TablerIconsB3.brandPeanut();
    }

    public static Icon brandPepsi() {
        return TablerIconsB3.brandPepsi();
    }

    public static Icon brandPhp() {
        return TablerIconsB3.brandPhp();
    }

    public static Icon brandPicsart() {
        return TablerIconsB3.brandPicsart();
    }

    public static Icon brandPinterest() {
        return TablerIconsB3.brandPinterest();
    }

    public static Icon brandPlanetscale() {
        return TablerIconsB3.brandPlanetscale();
    }

    public static Icon brandPnpm() {
        return TablerIconsB3.brandPnpm();
    }

    public static Icon brandPocket() {
        return TablerIconsB3.brandPocket();
    }

    public static Icon brandPolymer() {
        return TablerIconsB3.brandPolymer();
    }

    public static Icon brandPowershell() {
        return TablerIconsB3.brandPowershell();
    }

    public static Icon brandPrintables() {
        return TablerIconsB3.brandPrintables();
    }

    public static Icon brandPrisma() {
        return TablerIconsB3.brandPrisma();
    }

    public static Icon brandProducthunt() {
        return TablerIconsB3.brandProducthunt();
    }

    public static Icon brandPushbullet() {
        return TablerIconsB3.brandPushbullet();
    }

    public static Icon brandPushover() {
        return TablerIconsB3.brandPushover();
    }

    public static Icon brandPython() {
        return TablerIconsB3.brandPython();
    }

    public static Icon brandQq() {
        return TablerIconsB3.brandQq();
    }

    public static Icon brandRadixUi() {
        return TablerIconsB3.brandRadixUi();
    }

    public static Icon brandReact() {
        return TablerIconsB3.brandReact();
    }

    public static Icon brandReactNative() {
        return TablerIconsB3.brandReactNative();
    }

    public static Icon brandReason() {
        return TablerIconsB3.brandReason();
    }

    public static Icon brandReddit() {
        return TablerIconsB3.brandReddit();
    }

    public static Icon brandRedhat() {
        return TablerIconsB3.brandRedhat();
    }

    public static Icon brandRedux() {
        return TablerIconsB3.brandRedux();
    }

    public static Icon brandRevolut() {
        return TablerIconsB3.brandRevolut();
    }

    public static Icon brandRumble() {
        return TablerIconsB3.brandRumble();
    }

    public static Icon brandRust() {
        return TablerIconsB3.brandRust();
    }

    public static Icon brandSafari() {
        return TablerIconsB3.brandSafari();
    }

    public static Icon brandSamsungpass() {
        return TablerIconsB3.brandSamsungpass();
    }

    public static Icon brandSass() {
        return TablerIconsB3.brandSass();
    }

    public static Icon brandSentry() {
        return TablerIconsB3.brandSentry();
    }

    public static Icon brandSharik() {
        return TablerIconsB3.brandSharik();
    }

    public static Icon brandShazam() {
        return TablerIconsB3.brandShazam();
    }

    public static Icon brandShopee() {
        return TablerIconsB3.brandShopee();
    }

    public static Icon brandSketch() {
        return TablerIconsB3.brandSketch();
    }

    public static Icon brandSkype() {
        return TablerIconsB3.brandSkype();
    }

    public static Icon brandSlack() {
        return TablerIconsB3.brandSlack();
    }

    public static Icon brandSnapchat() {
        return TablerIconsB3.brandSnapchat();
    }

    public static Icon brandSnapseed() {
        return TablerIconsB3.brandSnapseed();
    }

    public static Icon brandSnowflake() {
        return TablerIconsB3.brandSnowflake();
    }

    public static Icon brandSocketIo() {
        return TablerIconsB3.brandSocketIo();
    }

    public static Icon brandSolidjs() {
        return TablerIconsB3.brandSolidjs();
    }

    public static Icon brandSoundcloud() {
        return TablerIconsB3.brandSoundcloud();
    }

    public static Icon brandSpacehey() {
        return TablerIconsB4.brandSpacehey();
    }

    public static Icon brandSpeedtest() {
        return TablerIconsB4.brandSpeedtest();
    }

    public static Icon brandSpotify() {
        return TablerIconsB4.brandSpotify();
    }

    public static Icon brandStackoverflow() {
        return TablerIconsB4.brandStackoverflow();
    }

    public static Icon brandStackshare() {
        return TablerIconsB4.brandStackshare();
    }

    public static Icon brandSteam() {
        return TablerIconsB4.brandSteam();
    }

    public static Icon brandStellar() {
        return TablerIconsB4.brandStellar();
    }

    public static Icon brandStocktwits() {
        return TablerIconsB4.brandStocktwits();
    }

    public static Icon brandStorj() {
        return TablerIconsB4.brandStorj();
    }

    public static Icon brandStorybook() {
        return TablerIconsB4.brandStorybook();
    }

    public static Icon brandStorytel() {
        return TablerIconsB4.brandStorytel();
    }

    public static Icon brandStrava() {
        return TablerIconsB4.brandStrava();
    }

    public static Icon brandStripe() {
        return TablerIconsB4.brandStripe();
    }

    public static Icon brandSublimeText() {
        return TablerIconsB4.brandSublimeText();
    }

    public static Icon brandSugarizer() {
        return TablerIconsB4.brandSugarizer();
    }

    public static Icon brandSupabase() {
        return TablerIconsB4.brandSupabase();
    }

    public static Icon brandSuperhuman() {
        return TablerIconsB4.brandSuperhuman();
    }

    public static Icon brandSupernova() {
        return TablerIconsB4.brandSupernova();
    }

    public static Icon brandSurfshark() {
        return TablerIconsB4.brandSurfshark();
    }

    public static Icon brandSvelte() {
        return TablerIconsB4.brandSvelte();
    }

    public static Icon brandSwift() {
        return TablerIconsB4.brandSwift();
    }

    public static Icon brandSymfony() {
        return TablerIconsB4.brandSymfony();
    }

    public static Icon brandTabler() {
        return TablerIconsB4.brandTabler();
    }

    public static Icon brandTabnine() {
        return TablerIconsB4.brandTabnine();
    }

    public static Icon brandTailwind() {
        return TablerIconsB4.brandTailwind();
    }

    public static Icon brandTaobao() {
        return TablerIconsB4.brandTaobao();
    }

    public static Icon brandTeams() {
        return TablerIconsB4.brandTeams();
    }

    public static Icon brandTed() {
        return TablerIconsB4.brandTed();
    }

    public static Icon brandTelegram() {
        return TablerIconsB4.brandTelegram();
    }

    public static Icon brandTerraform() {
        return TablerIconsB4.brandTerraform();
    }

    public static Icon brandTesla() {
        return TablerIconsB4.brandTesla();
    }

    public static Icon brandTether() {
        return TablerIconsB4.brandTether();
    }

    public static Icon brandThingiverse() {
        return TablerIconsB4.brandThingiverse();
    }

    public static Icon brandThreads() {
        return TablerIconsB4.brandThreads();
    }

    public static Icon brandThreejs() {
        return TablerIconsB4.brandThreejs();
    }

    public static Icon brandTidal() {
        return TablerIconsB4.brandTidal();
    }

    public static Icon brandTiktok() {
        return TablerIconsB4.brandTiktok();
    }

    public static Icon brandTinder() {
        return TablerIconsB4.brandTinder();
    }

    public static Icon brandTopbuzz() {
        return TablerIconsB4.brandTopbuzz();
    }

    public static Icon brandTorchain() {
        return TablerIconsB4.brandTorchain();
    }

    public static Icon brandToyota() {
        return TablerIconsB4.brandToyota();
    }

    public static Icon brandTrello() {
        return TablerIconsB4.brandTrello();
    }

    public static Icon brandTripadvisor() {
        return TablerIconsB4.brandTripadvisor();
    }

    public static Icon brandTumblr() {
        return TablerIconsB4.brandTumblr();
    }

    public static Icon brandTwilio() {
        return TablerIconsB4.brandTwilio();
    }

    public static Icon brandTwitch() {
        return TablerIconsB4.brandTwitch();
    }

    public static Icon brandTwitter() {
        return TablerIconsB4.brandTwitter();
    }

    public static Icon brandTypescript() {
        return TablerIconsB4.brandTypescript();
    }

    public static Icon brandUber() {
        return TablerIconsB4.brandUber();
    }

    public static Icon brandUbuntu() {
        return TablerIconsB4.brandUbuntu();
    }

    public static Icon brandUnity() {
        return TablerIconsB4.brandUnity();
    }

    public static Icon brandUnsplash() {
        return TablerIconsB4.brandUnsplash();
    }

    public static Icon brandUpwork() {
        return TablerIconsB4.brandUpwork();
    }

    public static Icon brandValorant() {
        return TablerIconsB4.brandValorant();
    }

    public static Icon brandVechain() {
        return TablerIconsB4.brandVechain();
    }

    public static Icon brandVercel() {
        return TablerIconsB4.brandVercel();
    }

    public static Icon brandVimeo() {
        return TablerIconsB4.brandVimeo();
    }

    public static Icon brandVinted() {
        return TablerIconsB4.brandVinted();
    }

    public static Icon brandVisa() {
        return TablerIconsB4.brandVisa();
    }

    public static Icon brandVisualStudio() {
        return TablerIconsB4.brandVisualStudio();
    }

    public static Icon brandVite() {
        return TablerIconsB4.brandVite();
    }

    public static Icon brandVivaldi() {
        return TablerIconsB4.brandVivaldi();
    }

    public static Icon brandVk() {
        return TablerIconsB4.brandVk();
    }

    public static Icon brandVlc() {
        return TablerIconsB4.brandVlc();
    }

    public static Icon brandVolkswagen() {
        return TablerIconsB4.brandVolkswagen();
    }

    public static Icon brandVsco() {
        return TablerIconsB4.brandVsco();
    }

    public static Icon brandVscode() {
        return TablerIconsB4.brandVscode();
    }

    public static Icon brandVue() {
        return TablerIconsB4.brandVue();
    }

    public static Icon brandWalmart() {
        return TablerIconsB4.brandWalmart();
    }

    public static Icon brandWaze() {
        return TablerIconsB4.brandWaze();
    }

    public static Icon brandWebflow() {
        return TablerIconsB4.brandWebflow();
    }

    public static Icon brandWechat() {
        return TablerIconsB4.brandWechat();
    }

    public static Icon brandWeibo() {
        return TablerIconsB4.brandWeibo();
    }

    public static Icon brandWhatsapp() {
        return TablerIconsB4.brandWhatsapp();
    }

    public static Icon brandWikipedia() {
        return TablerIconsB4.brandWikipedia();
    }

    public static Icon brandWindows() {
        return TablerIconsB4.brandWindows();
    }

    public static Icon brandWindy() {
        return TablerIconsB4.brandWindy();
    }

    public static Icon brandWish() {
        return TablerIconsB4.brandWish();
    }

    public static Icon brandWix() {
        return TablerIconsB4.brandWix();
    }

    public static Icon brandWordpress() {
        return TablerIconsB4.brandWordpress();
    }

    public static Icon brandX() {
        return TablerIconsB4.brandX();
    }

    public static Icon brandXamarin() {
        return TablerIconsB4.brandXamarin();
    }

    public static Icon brandXbox() {
        return TablerIconsB4.brandXbox();
    }

    public static Icon brandXdeep() {
        return TablerIconsB4.brandXdeep();
    }

    public static Icon brandXing() {
        return TablerIconsB4.brandXing();
    }

    public static Icon brandYahoo() {
        return TablerIconsB4.brandYahoo();
    }

    public static Icon brandYandex() {
        return TablerIconsB4.brandYandex();
    }

    public static Icon brandYarn() {
        return TablerIconsB4.brandYarn();
    }

    public static Icon brandYatse() {
        return TablerIconsB4.brandYatse();
    }

    public static Icon brandYcombinator() {
        return TablerIconsB4.brandYcombinator();
    }

    public static Icon brandYoutube() {
        return TablerIconsB4.brandYoutube();
    }

    public static Icon brandYoutubeKids() {
        return TablerIconsB4.brandYoutubeKids();
    }

    public static Icon brandZalando() {
        return TablerIconsB4.brandZalando();
    }

    public static Icon brandZapier() {
        return TablerIconsB4.brandZapier();
    }

    public static Icon brandZeit() {
        return TablerIconsB4.brandZeit();
    }

    public static Icon brandZhihu() {
        return TablerIconsB4.brandZhihu();
    }

    public static Icon brandZoom() {
        return TablerIconsB4.brandZoom();
    }

    public static Icon brandZulip() {
        return TablerIconsB4.brandZulip();
    }

    public static Icon brandZwift() {
        return TablerIconsB4.brandZwift();
    }

    public static Icon bread() {
        return TablerIconsB4.bread();
    }

    public static Icon breadOff() {
        return TablerIconsB4.breadOff();
    }

    public static Icon briefcase() {
        return TablerIconsB4.briefcase();
    }

    public static Icon briefcaseN2() {
        return TablerIconsB4.briefcaseN2();
    }

    public static Icon briefcaseOff() {
        return TablerIconsB4.briefcaseOff();
    }

    public static Icon brightness() {
        return TablerIconsB4.brightness();
    }

    public static Icon brightnessN2() {
        return TablerIconsB4.brightnessN2();
    }

    public static Icon brightnessAuto() {
        return TablerIconsB4.brightnessAuto();
    }

    public static Icon brightnessDown() {
        return TablerIconsB4.brightnessDown();
    }

    public static Icon brightnessHalf() {
        return TablerIconsB4.brightnessHalf();
    }

    public static Icon brightnessOff() {
        return TablerIconsB4.brightnessOff();
    }

    public static Icon brightnessUp() {
        return TablerIconsB4.brightnessUp();
    }

    public static Icon broadcast() {
        return TablerIconsB4.broadcast();
    }

    public static Icon broadcastOff() {
        return TablerIconsB4.broadcastOff();
    }

    public static Icon browser() {
        return TablerIconsB4.browser();
    }

    public static Icon browserCheck() {
        return TablerIconsB4.browserCheck();
    }

    public static Icon browserMaximize() {
        return TablerIconsB4.browserMaximize();
    }

    public static Icon browserMinus() {
        return TablerIconsB4.browserMinus();
    }

    public static Icon browserOff() {
        return TablerIconsB4.browserOff();
    }

    public static Icon browserPlus() {
        return TablerIconsB4.browserPlus();
    }

    public static Icon browserShare() {
        return TablerIconsB4.browserShare();
    }

    public static Icon browserX() {
        return TablerIconsB4.browserX();
    }

    public static Icon brush() {
        return TablerIconsB4.brush();
    }

    public static Icon brushOff() {
        return TablerIconsB4.brushOff();
    }

    public static Icon bubble() {
        return TablerIconsB4.bubble();
    }

    public static Icon bubbleMinus() {
        return TablerIconsB4.bubbleMinus();
    }

    public static Icon bubblePlus() {
        return TablerIconsB4.bubblePlus();
    }

    public static Icon bubbleTea() {
        return TablerIconsB4.bubbleTea();
    }

    public static Icon bubbleTeaN2() {
        return TablerIconsB4.bubbleTeaN2();
    }

    public static Icon bubbleText() {
        return TablerIconsB4.bubbleText();
    }

    public static Icon bubbleX() {
        return TablerIconsB4.bubbleX();
    }

    public static Icon bucket() {
        return TablerIconsB4.bucket();
    }

    public static Icon bucketDroplet() {
        return TablerIconsB4.bucketDroplet();
    }

    public static Icon bucketOff() {
        return TablerIconsB4.bucketOff();
    }

    public static Icon bug() {
        return TablerIconsB4.bug();
    }

    public static Icon bugOff() {
        return TablerIconsB4.bugOff();
    }

    public static Icon building() {
        return TablerIconsB4.building();
    }

    public static Icon buildingAirport() {
        return TablerIconsB4.buildingAirport();
    }

    public static Icon buildingArch() {
        return TablerIconsB4.buildingArch();
    }

    public static Icon buildingBank() {
        return TablerIconsB4.buildingBank();
    }

    public static Icon buildingBridge() {
        return TablerIconsB4.buildingBridge();
    }

    public static Icon buildingBridgeN2() {
        return TablerIconsB4.buildingBridgeN2();
    }

    public static Icon buildingBroadcastTower() {
        return TablerIconsB4.buildingBroadcastTower();
    }

    public static Icon buildingBurjAlArab() {
        return TablerIconsB4.buildingBurjAlArab();
    }

    public static Icon buildingCarousel() {
        return TablerIconsB4.buildingCarousel();
    }

    public static Icon buildingCastle() {
        return TablerIconsB4.buildingCastle();
    }

    public static Icon buildingChurch() {
        return TablerIconsB4.buildingChurch();
    }

    public static Icon buildingCircus() {
        return TablerIconsB4.buildingCircus();
    }

    public static Icon buildingCog() {
        return TablerIconsB4.buildingCog();
    }

    public static Icon buildingCommunity() {
        return TablerIconsB4.buildingCommunity();
    }

    public static Icon buildingCottage() {
        return TablerIconsB4.buildingCottage();
    }

    public static Icon buildingEiffelTower() {
        return TablerIconsB4.buildingEiffelTower();
    }

    public static Icon buildingEstate() {
        return TablerIconsB4.buildingEstate();
    }

    public static Icon buildingFactory() {
        return TablerIconsB4.buildingFactory();
    }

    public static Icon buildingFactoryN2() {
        return TablerIconsB4.buildingFactoryN2();
    }

    public static Icon buildingFortress() {
        return TablerIconsB4.buildingFortress();
    }

    public static Icon buildingHospital() {
        return TablerIconsB4.buildingHospital();
    }

    public static Icon buildingLighthouse() {
        return TablerIconsB4.buildingLighthouse();
    }

    public static Icon buildingMinus() {
        return TablerIconsB4.buildingMinus();
    }

    public static Icon buildingMonument() {
        return TablerIconsB4.buildingMonument();
    }

    public static Icon buildingMosque() {
        return TablerIconsB4.buildingMosque();
    }

    public static Icon buildingOff() {
        return TablerIconsB4.buildingOff();
    }

    public static Icon buildingPavilion() {
        return TablerIconsB4.buildingPavilion();
    }

    public static Icon buildingPlus() {
        return TablerIconsB4.buildingPlus();
    }

    public static Icon buildingSkyscraper() {
        return TablerIconsB4.buildingSkyscraper();
    }

    public static Icon buildingStadium() {
        return TablerIconsB4.buildingStadium();
    }

    public static Icon buildingStore() {
        return TablerIconsB4.buildingStore();
    }

    public static Icon buildingTunnel() {
        return TablerIconsB4.buildingTunnel();
    }

    public static Icon buildingWarehouse() {
        return TablerIconsB4.buildingWarehouse();
    }

    public static Icon buildingWindTurbine() {
        return TablerIconsB4.buildingWindTurbine();
    }

    public static Icon buildings() {
        return TablerIconsB4.buildings();
    }

    public static Icon bulb() {
        return TablerIconsB4.bulb();
    }

    public static Icon bulbOff() {
        return TablerIconsB4.bulbOff();
    }

    public static Icon bulldozer() {
        return TablerIconsB4.bulldozer();
    }

    public static Icon burger() {
        return TablerIconsB4.burger();
    }

    public static Icon bus() {
        return TablerIconsB4.bus();
    }

    public static Icon busOff() {
        return TablerIconsB4.busOff();
    }

    public static Icon busStop() {
        return TablerIconsB4.busStop();
    }

    public static Icon businessplan() {
        return TablerIconsB4.businessplan();
    }

    public static Icon butterfly() {
        return TablerIconsB4.butterfly();
    }

    public static Icon cactus() {
        return TablerIconsC1.cactus();
    }

    public static Icon cactusOff() {
        return TablerIconsC1.cactusOff();
    }

    public static Icon cake() {
        return TablerIconsC1.cake();
    }

    public static Icon cakeOff() {
        return TablerIconsC1.cakeOff();
    }

    public static Icon cakeRoll() {
        return TablerIconsC1.cakeRoll();
    }

    public static Icon calculator() {
        return TablerIconsC1.calculator();
    }

    public static Icon calculatorOff() {
        return TablerIconsC1.calculatorOff();
    }

    public static Icon calendar() {
        return TablerIconsC1.calendar();
    }

    public static Icon calendarBolt() {
        return TablerIconsC1.calendarBolt();
    }

    public static Icon calendarCancel() {
        return TablerIconsC1.calendarCancel();
    }

    public static Icon calendarCheck() {
        return TablerIconsC1.calendarCheck();
    }

    public static Icon calendarClock() {
        return TablerIconsC1.calendarClock();
    }

    public static Icon calendarCode() {
        return TablerIconsC1.calendarCode();
    }

    public static Icon calendarCog() {
        return TablerIconsC1.calendarCog();
    }

    public static Icon calendarDollar() {
        return TablerIconsC1.calendarDollar();
    }

    public static Icon calendarDot() {
        return TablerIconsC1.calendarDot();
    }

    public static Icon calendarDown() {
        return TablerIconsC1.calendarDown();
    }

    public static Icon calendarDue() {
        return TablerIconsC1.calendarDue();
    }

    public static Icon calendarEvent() {
        return TablerIconsC1.calendarEvent();
    }

    public static Icon calendarExclamation() {
        return TablerIconsC1.calendarExclamation();
    }

    public static Icon calendarHeart() {
        return TablerIconsC1.calendarHeart();
    }

    public static Icon calendarMinus() {
        return TablerIconsC1.calendarMinus();
    }

    public static Icon calendarMonth() {
        return TablerIconsC1.calendarMonth();
    }

    public static Icon calendarOff() {
        return TablerIconsC1.calendarOff();
    }

    public static Icon calendarPause() {
        return TablerIconsC1.calendarPause();
    }

    public static Icon calendarPin() {
        return TablerIconsC1.calendarPin();
    }

    public static Icon calendarPlus() {
        return TablerIconsC1.calendarPlus();
    }

    public static Icon calendarQuestion() {
        return TablerIconsC1.calendarQuestion();
    }

    public static Icon calendarRepeat() {
        return TablerIconsC1.calendarRepeat();
    }

    public static Icon calendarSad() {
        return TablerIconsC1.calendarSad();
    }

    public static Icon calendarSearch() {
        return TablerIconsC1.calendarSearch();
    }

    public static Icon calendarShare() {
        return TablerIconsC1.calendarShare();
    }

    public static Icon calendarSmile() {
        return TablerIconsC1.calendarSmile();
    }

    public static Icon calendarStar() {
        return TablerIconsC1.calendarStar();
    }

    public static Icon calendarStats() {
        return TablerIconsC1.calendarStats();
    }

    public static Icon calendarTime() {
        return TablerIconsC1.calendarTime();
    }

    public static Icon calendarUp() {
        return TablerIconsC1.calendarUp();
    }

    public static Icon calendarUser() {
        return TablerIconsC1.calendarUser();
    }

    public static Icon calendarWeek() {
        return TablerIconsC1.calendarWeek();
    }

    public static Icon calendarX() {
        return TablerIconsC1.calendarX();
    }

    public static Icon camera() {
        return TablerIconsC1.camera();
    }

    public static Icon cameraAi() {
        return TablerIconsC1.cameraAi();
    }

    public static Icon cameraBitcoin() {
        return TablerIconsC1.cameraBitcoin();
    }

    public static Icon cameraBolt() {
        return TablerIconsC1.cameraBolt();
    }

    public static Icon cameraCancel() {
        return TablerIconsC1.cameraCancel();
    }

    public static Icon cameraCheck() {
        return TablerIconsC1.cameraCheck();
    }

    public static Icon cameraCode() {
        return TablerIconsC1.cameraCode();
    }

    public static Icon cameraCog() {
        return TablerIconsC1.cameraCog();
    }

    public static Icon cameraDollar() {
        return TablerIconsC1.cameraDollar();
    }

    public static Icon cameraDown() {
        return TablerIconsC1.cameraDown();
    }

    public static Icon cameraExclamation() {
        return TablerIconsC1.cameraExclamation();
    }

    public static Icon cameraHeart() {
        return TablerIconsC1.cameraHeart();
    }

    public static Icon cameraMinus() {
        return TablerIconsC1.cameraMinus();
    }

    public static Icon cameraMoon() {
        return TablerIconsC1.cameraMoon();
    }

    public static Icon cameraOff() {
        return TablerIconsC1.cameraOff();
    }

    public static Icon cameraPause() {
        return TablerIconsC1.cameraPause();
    }

    public static Icon cameraPin() {
        return TablerIconsC1.cameraPin();
    }

    public static Icon cameraPlus() {
        return TablerIconsC1.cameraPlus();
    }

    public static Icon cameraQuestion() {
        return TablerIconsC1.cameraQuestion();
    }

    public static Icon cameraRotate() {
        return TablerIconsC1.cameraRotate();
    }

    public static Icon cameraSearch() {
        return TablerIconsC1.cameraSearch();
    }

    public static Icon cameraSelfie() {
        return TablerIconsC1.cameraSelfie();
    }

    public static Icon cameraShare() {
        return TablerIconsC1.cameraShare();
    }

    public static Icon cameraSpark() {
        return TablerIconsC1.cameraSpark();
    }

    public static Icon cameraStar() {
        return TablerIconsC1.cameraStar();
    }

    public static Icon cameraUp() {
        return TablerIconsC1.cameraUp();
    }

    public static Icon cameraX() {
        return TablerIconsC1.cameraX();
    }

    public static Icon camper() {
        return TablerIconsC1.camper();
    }

    public static Icon campfire() {
        return TablerIconsC1.campfire();
    }

    public static Icon canary() {
        return TablerIconsC1.canary();
    }

    public static Icon cancel() {
        return TablerIconsC1.cancel();
    }

    public static Icon candle() {
        return TablerIconsC1.candle();
    }

    public static Icon candy() {
        return TablerIconsC1.candy();
    }

    public static Icon candyOff() {
        return TablerIconsC1.candyOff();
    }

    public static Icon cane() {
        return TablerIconsC1.cane();
    }

    public static Icon cannabis() {
        return TablerIconsC1.cannabis();
    }

    public static Icon capProjecting() {
        return TablerIconsC1.capProjecting();
    }

    public static Icon capRounded() {
        return TablerIconsC1.capRounded();
    }

    public static Icon capStraight() {
        return TablerIconsC1.capStraight();
    }

    public static Icon capsule() {
        return TablerIconsC1.capsule();
    }

    public static Icon capsuleHorizontal() {
        return TablerIconsC1.capsuleHorizontal();
    }

    public static Icon capture() {
        return TablerIconsC1.capture();
    }

    public static Icon captureOff() {
        return TablerIconsC1.captureOff();
    }

    public static Icon car() {
        return TablerIconsC1.car();
    }

    public static Icon car4wd() {
        return TablerIconsC1.car4wd();
    }

    public static Icon carCrane() {
        return TablerIconsC1.carCrane();
    }

    public static Icon carCrash() {
        return TablerIconsC1.carCrash();
    }

    public static Icon carDoor() {
        return TablerIconsC1.carDoor();
    }

    public static Icon carFan() {
        return TablerIconsC1.carFan();
    }

    public static Icon carFanN1() {
        return TablerIconsC1.carFanN1();
    }

    public static Icon carFanN2() {
        return TablerIconsC1.carFanN2();
    }

    public static Icon carFanN3() {
        return TablerIconsC1.carFanN3();
    }

    public static Icon carFanAuto() {
        return TablerIconsC1.carFanAuto();
    }

    public static Icon carGarage() {
        return TablerIconsC1.carGarage();
    }

    public static Icon carLifter() {
        return TablerIconsC1.carLifter();
    }

    public static Icon carOff() {
        return TablerIconsC1.carOff();
    }

    public static Icon carOffRoad() {
        return TablerIconsC1.carOffRoad();
    }

    public static Icon carSuspension() {
        return TablerIconsC1.carSuspension();
    }

    public static Icon carSuv() {
        return TablerIconsC1.carSuv();
    }

    public static Icon carTurbine() {
        return TablerIconsC1.carTurbine();
    }

    public static Icon carambola() {
        return TablerIconsC1.carambola();
    }

    public static Icon caravan() {
        return TablerIconsC1.caravan();
    }

    public static Icon cardboards() {
        return TablerIconsC1.cardboards();
    }

    public static Icon cardboardsOff() {
        return TablerIconsC1.cardboardsOff();
    }

    public static Icon cards() {
        return TablerIconsC1.cards();
    }

    public static Icon caretDown() {
        return TablerIconsC1.caretDown();
    }

    public static Icon caretLeft() {
        return TablerIconsC1.caretLeft();
    }

    public static Icon caretLeftRight() {
        return TablerIconsC1.caretLeftRight();
    }

    public static Icon caretRight() {
        return TablerIconsC1.caretRight();
    }

    public static Icon caretUp() {
        return TablerIconsC1.caretUp();
    }

    public static Icon caretUpDown() {
        return TablerIconsC1.caretUpDown();
    }

    public static Icon carouselHorizontal() {
        return TablerIconsC1.carouselHorizontal();
    }

    public static Icon carouselVertical() {
        return TablerIconsC1.carouselVertical();
    }

    public static Icon carrot() {
        return TablerIconsC1.carrot();
    }

    public static Icon carrotOff() {
        return TablerIconsC1.carrotOff();
    }

    public static Icon cash() {
        return TablerIconsC1.cash();
    }

    public static Icon cashBanknote() {
        return TablerIconsC1.cashBanknote();
    }

    public static Icon cashBanknoteEdit() {
        return TablerIconsC1.cashBanknoteEdit();
    }

    public static Icon cashBanknoteHeart() {
        return TablerIconsC1.cashBanknoteHeart();
    }

    public static Icon cashBanknoteMinus() {
        return TablerIconsC1.cashBanknoteMinus();
    }

    public static Icon cashBanknoteMove() {
        return TablerIconsC1.cashBanknoteMove();
    }

    public static Icon cashBanknoteMoveBack() {
        return TablerIconsC1.cashBanknoteMoveBack();
    }

    public static Icon cashBanknoteOff() {
        return TablerIconsC1.cashBanknoteOff();
    }

    public static Icon cashBanknotePlus() {
        return TablerIconsC1.cashBanknotePlus();
    }

    public static Icon cashEdit() {
        return TablerIconsC1.cashEdit();
    }

    public static Icon cashHeart() {
        return TablerIconsC1.cashHeart();
    }

    public static Icon cashMinus() {
        return TablerIconsC1.cashMinus();
    }

    public static Icon cashMove() {
        return TablerIconsC1.cashMove();
    }

    public static Icon cashMoveBack() {
        return TablerIconsC1.cashMoveBack();
    }

    public static Icon cashOff() {
        return TablerIconsC1.cashOff();
    }

    public static Icon cashPlus() {
        return TablerIconsC1.cashPlus();
    }

    public static Icon cashRegister() {
        return TablerIconsC1.cashRegister();
    }

    public static Icon cast() {
        return TablerIconsC1.cast();
    }

    public static Icon castOff() {
        return TablerIconsC1.castOff();
    }

    public static Icon cat() {
        return TablerIconsC1.cat();
    }

    public static Icon category() {
        return TablerIconsC1.category();
    }

    public static Icon categoryN2() {
        return TablerIconsC1.categoryN2();
    }

    public static Icon categoryMinus() {
        return TablerIconsC1.categoryMinus();
    }

    public static Icon categoryPlus() {
        return TablerIconsC1.categoryPlus();
    }

    public static Icon ce() {
        return TablerIconsC1.ce();
    }

    public static Icon ceOff() {
        return TablerIconsC1.ceOff();
    }

    public static Icon cell() {
        return TablerIconsC1.cell();
    }

    public static Icon cellSignalN1() {
        return TablerIconsC1.cellSignalN1();
    }

    public static Icon cellSignalN2() {
        return TablerIconsC1.cellSignalN2();
    }

    public static Icon cellSignalN3() {
        return TablerIconsC1.cellSignalN3();
    }

    public static Icon cellSignalN4() {
        return TablerIconsC1.cellSignalN4();
    }

    public static Icon cellSignalN5() {
        return TablerIconsC1.cellSignalN5();
    }

    public static Icon cellSignalOff() {
        return TablerIconsC1.cellSignalOff();
    }

    public static Icon certificate() {
        return TablerIconsC1.certificate();
    }

    public static Icon certificateN2() {
        return TablerIconsC1.certificateN2();
    }

    public static Icon certificateN2Off() {
        return TablerIconsC1.certificateN2Off();
    }

    public static Icon certificateOff() {
        return TablerIconsC1.certificateOff();
    }

    public static Icon chairDirector() {
        return TablerIconsC1.chairDirector();
    }

    public static Icon chalkboard() {
        return TablerIconsC1.chalkboard();
    }

    public static Icon chalkboardOff() {
        return TablerIconsC1.chalkboardOff();
    }

    public static Icon chalkboardTeacher() {
        return TablerIconsC1.chalkboardTeacher();
    }

    public static Icon chargingPile() {
        return TablerIconsC1.chargingPile();
    }

    public static Icon chartArcs() {
        return TablerIconsC1.chartArcs();
    }

    public static Icon chartArcsN3() {
        return TablerIconsC1.chartArcsN3();
    }

    public static Icon chartArea() {
        return TablerIconsC1.chartArea();
    }

    public static Icon chartAreaLine() {
        return TablerIconsC1.chartAreaLine();
    }

    public static Icon chartArrows() {
        return TablerIconsC1.chartArrows();
    }

    public static Icon chartArrowsVertical() {
        return TablerIconsC1.chartArrowsVertical();
    }

    public static Icon chartBar() {
        return TablerIconsC1.chartBar();
    }

    public static Icon chartBarOff() {
        return TablerIconsC1.chartBarOff();
    }

    public static Icon chartBarPopular() {
        return TablerIconsC1.chartBarPopular();
    }

    public static Icon chartBubble() {
        return TablerIconsC1.chartBubble();
    }

    public static Icon chartCandle() {
        return TablerIconsC1.chartCandle();
    }

    public static Icon chartCircles() {
        return TablerIconsC1.chartCircles();
    }

    public static Icon chartCohort() {
        return TablerIconsC1.chartCohort();
    }

    public static Icon chartColumn() {
        return TablerIconsC1.chartColumn();
    }

    public static Icon chartCovariate() {
        return TablerIconsC1.chartCovariate();
    }

    public static Icon chartDonut() {
        return TablerIconsC1.chartDonut();
    }

    public static Icon chartDonutN2() {
        return TablerIconsC1.chartDonutN2();
    }

    public static Icon chartDonutN3() {
        return TablerIconsC1.chartDonutN3();
    }

    public static Icon chartDonutN4() {
        return TablerIconsC1.chartDonutN4();
    }

    public static Icon chartDots() {
        return TablerIconsC1.chartDots();
    }

    public static Icon chartDotsN2() {
        return TablerIconsC1.chartDotsN2();
    }

    public static Icon chartDotsN3() {
        return TablerIconsC1.chartDotsN3();
    }

    public static Icon chartFunnel() {
        return TablerIconsC1.chartFunnel();
    }

    public static Icon chartGridDots() {
        return TablerIconsC2.chartGridDots();
    }

    public static Icon chartHistogram() {
        return TablerIconsC2.chartHistogram();
    }

    public static Icon chartInfographic() {
        return TablerIconsC2.chartInfographic();
    }

    public static Icon chartLine() {
        return TablerIconsC2.chartLine();
    }

    public static Icon chartPie() {
        return TablerIconsC2.chartPie();
    }

    public static Icon chartPieN2() {
        return TablerIconsC2.chartPieN2();
    }

    public static Icon chartPieN3() {
        return TablerIconsC2.chartPieN3();
    }

    public static Icon chartPieN4() {
        return TablerIconsC2.chartPieN4();
    }

    public static Icon chartPieOff() {
        return TablerIconsC2.chartPieOff();
    }

    public static Icon chartPpf() {
        return TablerIconsC2.chartPpf();
    }

    public static Icon chartRadar() {
        return TablerIconsC2.chartRadar();
    }

    public static Icon chartSankey() {
        return TablerIconsC2.chartSankey();
    }

    public static Icon chartScatter() {
        return TablerIconsC2.chartScatter();
    }

    public static Icon chartScatter3d() {
        return TablerIconsC2.chartScatter3d();
    }

    public static Icon chartTreemap() {
        return TablerIconsC2.chartTreemap();
    }

    public static Icon check() {
        return TablerIconsC2.check();
    }

    public static Icon checkbox() {
        return TablerIconsC2.checkbox();
    }

    public static Icon checklist() {
        return TablerIconsC2.checklist();
    }

    public static Icon checks() {
        return TablerIconsC2.checks();
    }

    public static Icon checkupList() {
        return TablerIconsC2.checkupList();
    }

    public static Icon cheese() {
        return TablerIconsC2.cheese();
    }

    public static Icon chefHat() {
        return TablerIconsC2.chefHat();
    }

    public static Icon chefHatOff() {
        return TablerIconsC2.chefHatOff();
    }

    public static Icon cherry() {
        return TablerIconsC2.cherry();
    }

    public static Icon chess() {
        return TablerIconsC2.chess();
    }

    public static Icon chessBishop() {
        return TablerIconsC2.chessBishop();
    }

    public static Icon chessKing() {
        return TablerIconsC2.chessKing();
    }

    public static Icon chessKnight() {
        return TablerIconsC2.chessKnight();
    }

    public static Icon chessQueen() {
        return TablerIconsC2.chessQueen();
    }

    public static Icon chessRook() {
        return TablerIconsC2.chessRook();
    }

    public static Icon chevronCompactDown() {
        return TablerIconsC2.chevronCompactDown();
    }

    public static Icon chevronCompactLeft() {
        return TablerIconsC2.chevronCompactLeft();
    }

    public static Icon chevronCompactRight() {
        return TablerIconsC2.chevronCompactRight();
    }

    public static Icon chevronCompactUp() {
        return TablerIconsC2.chevronCompactUp();
    }

    public static Icon chevronDown() {
        return TablerIconsC2.chevronDown();
    }

    public static Icon chevronDownLeft() {
        return TablerIconsC2.chevronDownLeft();
    }

    public static Icon chevronDownRight() {
        return TablerIconsC2.chevronDownRight();
    }

    public static Icon chevronLeft() {
        return TablerIconsC2.chevronLeft();
    }

    public static Icon chevronLeftPipe() {
        return TablerIconsC2.chevronLeftPipe();
    }

    public static Icon chevronRight() {
        return TablerIconsC2.chevronRight();
    }

    public static Icon chevronRightPipe() {
        return TablerIconsC2.chevronRightPipe();
    }

    public static Icon chevronUp() {
        return TablerIconsC2.chevronUp();
    }

    public static Icon chevronUpLeft() {
        return TablerIconsC2.chevronUpLeft();
    }

    public static Icon chevronUpRight() {
        return TablerIconsC2.chevronUpRight();
    }

    public static Icon chevronsDown() {
        return TablerIconsC2.chevronsDown();
    }

    public static Icon chevronsDownLeft() {
        return TablerIconsC2.chevronsDownLeft();
    }

    public static Icon chevronsDownRight() {
        return TablerIconsC2.chevronsDownRight();
    }

    public static Icon chevronsLeft() {
        return TablerIconsC2.chevronsLeft();
    }

    public static Icon chevronsRight() {
        return TablerIconsC2.chevronsRight();
    }

    public static Icon chevronsUp() {
        return TablerIconsC2.chevronsUp();
    }

    public static Icon chevronsUpLeft() {
        return TablerIconsC2.chevronsUpLeft();
    }

    public static Icon chevronsUpRight() {
        return TablerIconsC2.chevronsUpRight();
    }

    public static Icon chisel() {
        return TablerIconsC2.chisel();
    }

    public static Icon chocolate() {
        return TablerIconsC2.chocolate();
    }

    public static Icon christmasBall() {
        return TablerIconsC2.christmasBall();
    }

    public static Icon christmasTree() {
        return TablerIconsC2.christmasTree();
    }

    public static Icon christmasTreeOff() {
        return TablerIconsC2.christmasTreeOff();
    }

    public static Icon circle() {
        return TablerIconsC2.circle();
    }

    public static Icon circleArrowDown() {
        return TablerIconsC2.circleArrowDown();
    }

    public static Icon circleArrowDownLeft() {
        return TablerIconsC2.circleArrowDownLeft();
    }

    public static Icon circleArrowDownRight() {
        return TablerIconsC2.circleArrowDownRight();
    }

    public static Icon circleArrowLeft() {
        return TablerIconsC2.circleArrowLeft();
    }

    public static Icon circleArrowRight() {
        return TablerIconsC2.circleArrowRight();
    }

    public static Icon circleArrowUp() {
        return TablerIconsC2.circleArrowUp();
    }

    public static Icon circleArrowUpLeft() {
        return TablerIconsC2.circleArrowUpLeft();
    }

    public static Icon circleArrowUpRight() {
        return TablerIconsC2.circleArrowUpRight();
    }

    public static Icon circleAsterisk() {
        return TablerIconsC2.circleAsterisk();
    }

    public static Icon circleCaretDown() {
        return TablerIconsC2.circleCaretDown();
    }

    public static Icon circleCaretLeft() {
        return TablerIconsC2.circleCaretLeft();
    }

    public static Icon circleCaretRight() {
        return TablerIconsC2.circleCaretRight();
    }

    public static Icon circleCaretUp() {
        return TablerIconsC2.circleCaretUp();
    }

    public static Icon circleCheck() {
        return TablerIconsC2.circleCheck();
    }

    public static Icon circleChevronDown() {
        return TablerIconsC2.circleChevronDown();
    }

    public static Icon circleChevronLeft() {
        return TablerIconsC2.circleChevronLeft();
    }

    public static Icon circleChevronRight() {
        return TablerIconsC2.circleChevronRight();
    }

    public static Icon circleChevronUp() {
        return TablerIconsC2.circleChevronUp();
    }

    public static Icon circleChevronsDown() {
        return TablerIconsC2.circleChevronsDown();
    }

    public static Icon circleChevronsLeft() {
        return TablerIconsC2.circleChevronsLeft();
    }

    public static Icon circleChevronsRight() {
        return TablerIconsC2.circleChevronsRight();
    }

    public static Icon circleChevronsUp() {
        return TablerIconsC2.circleChevronsUp();
    }

    public static Icon circleDashed() {
        return TablerIconsC2.circleDashed();
    }

    public static Icon circleDashedCheck() {
        return TablerIconsC2.circleDashedCheck();
    }

    public static Icon circleDashedLetterA() {
        return TablerIconsC2.circleDashedLetterA();
    }

    public static Icon circleDashedLetterB() {
        return TablerIconsC2.circleDashedLetterB();
    }

    public static Icon circleDashedLetterC() {
        return TablerIconsC2.circleDashedLetterC();
    }

    public static Icon circleDashedLetterD() {
        return TablerIconsC2.circleDashedLetterD();
    }

    public static Icon circleDashedLetterE() {
        return TablerIconsC2.circleDashedLetterE();
    }

    public static Icon circleDashedLetterF() {
        return TablerIconsC2.circleDashedLetterF();
    }

    public static Icon circleDashedLetterG() {
        return TablerIconsC2.circleDashedLetterG();
    }

    public static Icon circleDashedLetterH() {
        return TablerIconsC2.circleDashedLetterH();
    }

    public static Icon circleDashedLetterI() {
        return TablerIconsC2.circleDashedLetterI();
    }

    public static Icon circleDashedLetterJ() {
        return TablerIconsC2.circleDashedLetterJ();
    }

    public static Icon circleDashedLetterK() {
        return TablerIconsC2.circleDashedLetterK();
    }

    public static Icon circleDashedLetterL() {
        return TablerIconsC2.circleDashedLetterL();
    }

    public static Icon circleDashedLetterM() {
        return TablerIconsC2.circleDashedLetterM();
    }

    public static Icon circleDashedLetterN() {
        return TablerIconsC2.circleDashedLetterN();
    }

    public static Icon circleDashedLetterO() {
        return TablerIconsC2.circleDashedLetterO();
    }

    public static Icon circleDashedLetterP() {
        return TablerIconsC2.circleDashedLetterP();
    }

    public static Icon circleDashedLetterQ() {
        return TablerIconsC2.circleDashedLetterQ();
    }

    public static Icon circleDashedLetterR() {
        return TablerIconsC2.circleDashedLetterR();
    }

    public static Icon circleDashedLetterS() {
        return TablerIconsC2.circleDashedLetterS();
    }

    public static Icon circleDashedLetterT() {
        return TablerIconsC2.circleDashedLetterT();
    }

    public static Icon circleDashedLetterU() {
        return TablerIconsC2.circleDashedLetterU();
    }

    public static Icon circleDashedLetterV() {
        return TablerIconsC2.circleDashedLetterV();
    }

    public static Icon circleDashedLetterW() {
        return TablerIconsC2.circleDashedLetterW();
    }

    public static Icon circleDashedLetterX() {
        return TablerIconsC2.circleDashedLetterX();
    }

    public static Icon circleDashedLetterY() {
        return TablerIconsC2.circleDashedLetterY();
    }

    public static Icon circleDashedLetterZ() {
        return TablerIconsC2.circleDashedLetterZ();
    }

    public static Icon circleDashedMinus() {
        return TablerIconsC2.circleDashedMinus();
    }

    public static Icon circleDashedNumberN0() {
        return TablerIconsC2.circleDashedNumberN0();
    }

    public static Icon circleDashedNumberN1() {
        return TablerIconsC2.circleDashedNumberN1();
    }

    public static Icon circleDashedNumberN2() {
        return TablerIconsC2.circleDashedNumberN2();
    }

    public static Icon circleDashedNumberN3() {
        return TablerIconsC2.circleDashedNumberN3();
    }

    public static Icon circleDashedNumberN4() {
        return TablerIconsC2.circleDashedNumberN4();
    }

    public static Icon circleDashedNumberN5() {
        return TablerIconsC2.circleDashedNumberN5();
    }

    public static Icon circleDashedNumberN6() {
        return TablerIconsC2.circleDashedNumberN6();
    }

    public static Icon circleDashedNumberN7() {
        return TablerIconsC2.circleDashedNumberN7();
    }

    public static Icon circleDashedNumberN8() {
        return TablerIconsC2.circleDashedNumberN8();
    }

    public static Icon circleDashedNumberN9() {
        return TablerIconsC2.circleDashedNumberN9();
    }

    public static Icon circleDashedPercentage() {
        return TablerIconsC2.circleDashedPercentage();
    }

    public static Icon circleDashedPlus() {
        return TablerIconsC2.circleDashedPlus();
    }

    public static Icon circleDashedX() {
        return TablerIconsC2.circleDashedX();
    }

    public static Icon circleDot() {
        return TablerIconsC2.circleDot();
    }

    public static Icon circleDotted() {
        return TablerIconsC2.circleDotted();
    }

    public static Icon circleDottedLetterA() {
        return TablerIconsC2.circleDottedLetterA();
    }

    public static Icon circleDottedLetterB() {
        return TablerIconsC2.circleDottedLetterB();
    }

    public static Icon circleDottedLetterC() {
        return TablerIconsC2.circleDottedLetterC();
    }

    public static Icon circleDottedLetterD() {
        return TablerIconsC2.circleDottedLetterD();
    }

    public static Icon circleDottedLetterE() {
        return TablerIconsC2.circleDottedLetterE();
    }

    public static Icon circleDottedLetterF() {
        return TablerIconsC2.circleDottedLetterF();
    }

    public static Icon circleDottedLetterG() {
        return TablerIconsC2.circleDottedLetterG();
    }

    public static Icon circleDottedLetterH() {
        return TablerIconsC2.circleDottedLetterH();
    }

    public static Icon circleDottedLetterI() {
        return TablerIconsC2.circleDottedLetterI();
    }

    public static Icon circleDottedLetterJ() {
        return TablerIconsC2.circleDottedLetterJ();
    }

    public static Icon circleDottedLetterK() {
        return TablerIconsC2.circleDottedLetterK();
    }

    public static Icon circleDottedLetterL() {
        return TablerIconsC2.circleDottedLetterL();
    }

    public static Icon circleDottedLetterM() {
        return TablerIconsC2.circleDottedLetterM();
    }

    public static Icon circleDottedLetterN() {
        return TablerIconsC2.circleDottedLetterN();
    }

    public static Icon circleDottedLetterO() {
        return TablerIconsC2.circleDottedLetterO();
    }

    public static Icon circleDottedLetterP() {
        return TablerIconsC2.circleDottedLetterP();
    }

    public static Icon circleDottedLetterQ() {
        return TablerIconsC2.circleDottedLetterQ();
    }

    public static Icon circleDottedLetterR() {
        return TablerIconsC2.circleDottedLetterR();
    }

    public static Icon circleDottedLetterS() {
        return TablerIconsC2.circleDottedLetterS();
    }

    public static Icon circleDottedLetterT() {
        return TablerIconsC2.circleDottedLetterT();
    }

    public static Icon circleDottedLetterU() {
        return TablerIconsC2.circleDottedLetterU();
    }

    public static Icon circleDottedLetterV() {
        return TablerIconsC2.circleDottedLetterV();
    }

    public static Icon circleDottedLetterW() {
        return TablerIconsC2.circleDottedLetterW();
    }

    public static Icon circleDottedLetterX() {
        return TablerIconsC2.circleDottedLetterX();
    }

    public static Icon circleDottedLetterY() {
        return TablerIconsC2.circleDottedLetterY();
    }

    public static Icon circleDottedLetterZ() {
        return TablerIconsC2.circleDottedLetterZ();
    }

    public static Icon circleHalf() {
        return TablerIconsC2.circleHalf();
    }

    public static Icon circleHalfN2() {
        return TablerIconsC2.circleHalfN2();
    }

    public static Icon circleHalfVertical() {
        return TablerIconsC2.circleHalfVertical();
    }

    public static Icon circleKey() {
        return TablerIconsC2.circleKey();
    }

    public static Icon circleLetterA() {
        return TablerIconsC2.circleLetterA();
    }

    public static Icon circleLetterB() {
        return TablerIconsC2.circleLetterB();
    }

    public static Icon circleLetterC() {
        return TablerIconsC2.circleLetterC();
    }

    public static Icon circleLetterD() {
        return TablerIconsC2.circleLetterD();
    }

    public static Icon circleLetterE() {
        return TablerIconsC2.circleLetterE();
    }

    public static Icon circleLetterF() {
        return TablerIconsC2.circleLetterF();
    }

    public static Icon circleLetterG() {
        return TablerIconsC2.circleLetterG();
    }

    public static Icon circleLetterH() {
        return TablerIconsC2.circleLetterH();
    }

    public static Icon circleLetterI() {
        return TablerIconsC2.circleLetterI();
    }

    public static Icon circleLetterJ() {
        return TablerIconsC2.circleLetterJ();
    }

    public static Icon circleLetterK() {
        return TablerIconsC2.circleLetterK();
    }

    public static Icon circleLetterL() {
        return TablerIconsC2.circleLetterL();
    }

    public static Icon circleLetterM() {
        return TablerIconsC2.circleLetterM();
    }

    public static Icon circleLetterN() {
        return TablerIconsC2.circleLetterN();
    }

    public static Icon circleLetterO() {
        return TablerIconsC2.circleLetterO();
    }

    public static Icon circleLetterP() {
        return TablerIconsC2.circleLetterP();
    }

    public static Icon circleLetterQ() {
        return TablerIconsC2.circleLetterQ();
    }

    public static Icon circleLetterR() {
        return TablerIconsC2.circleLetterR();
    }

    public static Icon circleLetterS() {
        return TablerIconsC2.circleLetterS();
    }

    public static Icon circleLetterT() {
        return TablerIconsC2.circleLetterT();
    }

    public static Icon circleLetterU() {
        return TablerIconsC2.circleLetterU();
    }

    public static Icon circleLetterV() {
        return TablerIconsC2.circleLetterV();
    }

    public static Icon circleLetterW() {
        return TablerIconsC2.circleLetterW();
    }

    public static Icon circleLetterX() {
        return TablerIconsC2.circleLetterX();
    }

    public static Icon circleLetterY() {
        return TablerIconsC2.circleLetterY();
    }

    public static Icon circleLetterZ() {
        return TablerIconsC2.circleLetterZ();
    }

    public static Icon circleMinus() {
        return TablerIconsC3.circleMinus();
    }

    public static Icon circleMinusN2() {
        return TablerIconsC3.circleMinusN2();
    }

    public static Icon circleNumberN0() {
        return TablerIconsC3.circleNumberN0();
    }

    public static Icon circleNumberN1() {
        return TablerIconsC3.circleNumberN1();
    }

    public static Icon circleNumberN2() {
        return TablerIconsC3.circleNumberN2();
    }

    public static Icon circleNumberN3() {
        return TablerIconsC3.circleNumberN3();
    }

    public static Icon circleNumberN4() {
        return TablerIconsC3.circleNumberN4();
    }

    public static Icon circleNumberN5() {
        return TablerIconsC3.circleNumberN5();
    }

    public static Icon circleNumberN6() {
        return TablerIconsC3.circleNumberN6();
    }

    public static Icon circleNumberN7() {
        return TablerIconsC3.circleNumberN7();
    }

    public static Icon circleNumberN8() {
        return TablerIconsC3.circleNumberN8();
    }

    public static Icon circleNumberN9() {
        return TablerIconsC3.circleNumberN9();
    }

    public static Icon circleOff() {
        return TablerIconsC3.circleOff();
    }

    public static Icon circleOpenArrowDown() {
        return TablerIconsC3.circleOpenArrowDown();
    }

    public static Icon circleOpenArrowLeft() {
        return TablerIconsC3.circleOpenArrowLeft();
    }

    public static Icon circleOpenArrowRight() {
        return TablerIconsC3.circleOpenArrowRight();
    }

    public static Icon circleOpenArrowUp() {
        return TablerIconsC3.circleOpenArrowUp();
    }

    public static Icon circlePercentage() {
        return TablerIconsC3.circlePercentage();
    }

    public static Icon circlePlus() {
        return TablerIconsC3.circlePlus();
    }

    public static Icon circlePlusN2() {
        return TablerIconsC3.circlePlusN2();
    }

    public static Icon circlePlusMinus() {
        return TablerIconsC3.circlePlusMinus();
    }

    public static Icon circleRectangle() {
        return TablerIconsC3.circleRectangle();
    }

    public static Icon circleRectangleOff() {
        return TablerIconsC3.circleRectangleOff();
    }

    public static Icon circleSquare() {
        return TablerIconsC3.circleSquare();
    }

    public static Icon circleTriangle() {
        return TablerIconsC3.circleTriangle();
    }

    public static Icon circleX() {
        return TablerIconsC3.circleX();
    }

    public static Icon circles() {
        return TablerIconsC3.circles();
    }

    public static Icon circlesRelation() {
        return TablerIconsC3.circlesRelation();
    }

    public static Icon circuitAmmeter() {
        return TablerIconsC3.circuitAmmeter();
    }

    public static Icon circuitBattery() {
        return TablerIconsC3.circuitBattery();
    }

    public static Icon circuitBulb() {
        return TablerIconsC3.circuitBulb();
    }

    public static Icon circuitCapacitor() {
        return TablerIconsC3.circuitCapacitor();
    }

    public static Icon circuitCapacitorPolarized() {
        return TablerIconsC3.circuitCapacitorPolarized();
    }

    public static Icon circuitCell() {
        return TablerIconsC3.circuitCell();
    }

    public static Icon circuitCellPlus() {
        return TablerIconsC3.circuitCellPlus();
    }

    public static Icon circuitChangeover() {
        return TablerIconsC3.circuitChangeover();
    }

    public static Icon circuitDiode() {
        return TablerIconsC3.circuitDiode();
    }

    public static Icon circuitDiodeZener() {
        return TablerIconsC3.circuitDiodeZener();
    }

    public static Icon circuitGround() {
        return TablerIconsC3.circuitGround();
    }

    public static Icon circuitGroundDigital() {
        return TablerIconsC3.circuitGroundDigital();
    }

    public static Icon circuitInductor() {
        return TablerIconsC3.circuitInductor();
    }

    public static Icon circuitMotor() {
        return TablerIconsC3.circuitMotor();
    }

    public static Icon circuitPushbutton() {
        return TablerIconsC3.circuitPushbutton();
    }

    public static Icon circuitResistor() {
        return TablerIconsC3.circuitResistor();
    }

    public static Icon circuitSwitchClosed() {
        return TablerIconsC3.circuitSwitchClosed();
    }

    public static Icon circuitSwitchOpen() {
        return TablerIconsC3.circuitSwitchOpen();
    }

    public static Icon circuitVoltmeter() {
        return TablerIconsC3.circuitVoltmeter();
    }

    public static Icon clearAll() {
        return TablerIconsC3.clearAll();
    }

    public static Icon clearFormatting() {
        return TablerIconsC3.clearFormatting();
    }

    public static Icon clef() {
        return TablerIconsC3.clef();
    }

    public static Icon clefStaff() {
        return TablerIconsC3.clefStaff();
    }

    public static Icon click() {
        return TablerIconsC3.click();
    }

    public static Icon cliffJumping() {
        return TablerIconsC3.cliffJumping();
    }

    public static Icon clipboard() {
        return TablerIconsC3.clipboard();
    }

    public static Icon clipboardCheck() {
        return TablerIconsC3.clipboardCheck();
    }

    public static Icon clipboardCopy() {
        return TablerIconsC3.clipboardCopy();
    }

    public static Icon clipboardData() {
        return TablerIconsC3.clipboardData();
    }

    public static Icon clipboardHeart() {
        return TablerIconsC3.clipboardHeart();
    }

    public static Icon clipboardList() {
        return TablerIconsC3.clipboardList();
    }

    public static Icon clipboardOff() {
        return TablerIconsC3.clipboardOff();
    }

    public static Icon clipboardPlus() {
        return TablerIconsC3.clipboardPlus();
    }

    public static Icon clipboardSearch() {
        return TablerIconsC3.clipboardSearch();
    }

    public static Icon clipboardSmile() {
        return TablerIconsC3.clipboardSmile();
    }

    public static Icon clipboardText() {
        return TablerIconsC3.clipboardText();
    }

    public static Icon clipboardTypography() {
        return TablerIconsC3.clipboardTypography();
    }

    public static Icon clipboardX() {
        return TablerIconsC3.clipboardX();
    }

    public static Icon clock() {
        return TablerIconsC3.clock();
    }

    public static Icon clockN12() {
        return TablerIconsC3.clockN12();
    }

    public static Icon clockN2() {
        return TablerIconsC3.clockN2();
    }

    public static Icon clockN24() {
        return TablerIconsC3.clockN24();
    }

    public static Icon clockBitcoin() {
        return TablerIconsC3.clockBitcoin();
    }

    public static Icon clockBolt() {
        return TablerIconsC3.clockBolt();
    }

    public static Icon clockCancel() {
        return TablerIconsC3.clockCancel();
    }

    public static Icon clockCheck() {
        return TablerIconsC3.clockCheck();
    }

    public static Icon clockCode() {
        return TablerIconsC3.clockCode();
    }

    public static Icon clockCog() {
        return TablerIconsC3.clockCog();
    }

    public static Icon clockDollar() {
        return TablerIconsC3.clockDollar();
    }

    public static Icon clockDown() {
        return TablerIconsC3.clockDown();
    }

    public static Icon clockEdit() {
        return TablerIconsC3.clockEdit();
    }

    public static Icon clockExclamation() {
        return TablerIconsC3.clockExclamation();
    }

    public static Icon clockHeart() {
        return TablerIconsC3.clockHeart();
    }

    public static Icon clockHourN1() {
        return TablerIconsC3.clockHourN1();
    }

    public static Icon clockHourN10() {
        return TablerIconsC3.clockHourN10();
    }

    public static Icon clockHourN11() {
        return TablerIconsC3.clockHourN11();
    }

    public static Icon clockHourN12() {
        return TablerIconsC3.clockHourN12();
    }

    public static Icon clockHourN2() {
        return TablerIconsC3.clockHourN2();
    }

    public static Icon clockHourN3() {
        return TablerIconsC3.clockHourN3();
    }

    public static Icon clockHourN4() {
        return TablerIconsC3.clockHourN4();
    }

    public static Icon clockHourN5() {
        return TablerIconsC3.clockHourN5();
    }

    public static Icon clockHourN6() {
        return TablerIconsC3.clockHourN6();
    }

    public static Icon clockHourN7() {
        return TablerIconsC3.clockHourN7();
    }

    public static Icon clockHourN8() {
        return TablerIconsC3.clockHourN8();
    }

    public static Icon clockHourN9() {
        return TablerIconsC3.clockHourN9();
    }

    public static Icon clockMinus() {
        return TablerIconsC3.clockMinus();
    }

    public static Icon clockOff() {
        return TablerIconsC3.clockOff();
    }

    public static Icon clockPause() {
        return TablerIconsC3.clockPause();
    }

    public static Icon clockPin() {
        return TablerIconsC3.clockPin();
    }

    public static Icon clockPlay() {
        return TablerIconsC3.clockPlay();
    }

    public static Icon clockPlus() {
        return TablerIconsC3.clockPlus();
    }

    public static Icon clockQuestion() {
        return TablerIconsC3.clockQuestion();
    }

    public static Icon clockRecord() {
        return TablerIconsC3.clockRecord();
    }

    public static Icon clockSearch() {
        return TablerIconsC3.clockSearch();
    }

    public static Icon clockShare() {
        return TablerIconsC3.clockShare();
    }

    public static Icon clockShield() {
        return TablerIconsC3.clockShield();
    }

    public static Icon clockStar() {
        return TablerIconsC3.clockStar();
    }

    public static Icon clockStop() {
        return TablerIconsC3.clockStop();
    }

    public static Icon clockUp() {
        return TablerIconsC3.clockUp();
    }

    public static Icon clockX() {
        return TablerIconsC3.clockX();
    }

    public static Icon clothesRack() {
        return TablerIconsC3.clothesRack();
    }

    public static Icon clothesRackOff() {
        return TablerIconsC3.clothesRackOff();
    }

    public static Icon cloud() {
        return TablerIconsC3.cloud();
    }

    public static Icon cloudBitcoin() {
        return TablerIconsC3.cloudBitcoin();
    }

    public static Icon cloudBolt() {
        return TablerIconsC3.cloudBolt();
    }

    public static Icon cloudCancel() {
        return TablerIconsC3.cloudCancel();
    }

    public static Icon cloudCheck() {
        return TablerIconsC3.cloudCheck();
    }

    public static Icon cloudCode() {
        return TablerIconsC3.cloudCode();
    }

    public static Icon cloudCog() {
        return TablerIconsC3.cloudCog();
    }

    public static Icon cloudComputing() {
        return TablerIconsC3.cloudComputing();
    }

    public static Icon cloudDataConnection() {
        return TablerIconsC3.cloudDataConnection();
    }

    public static Icon cloudDollar() {
        return TablerIconsC3.cloudDollar();
    }

    public static Icon cloudDown() {
        return TablerIconsC3.cloudDown();
    }

    public static Icon cloudDownload() {
        return TablerIconsC3.cloudDownload();
    }

    public static Icon cloudExclamation() {
        return TablerIconsC3.cloudExclamation();
    }

    public static Icon cloudFog() {
        return TablerIconsC3.cloudFog();
    }

    public static Icon cloudHeart() {
        return TablerIconsC3.cloudHeart();
    }

    public static Icon cloudLock() {
        return TablerIconsC3.cloudLock();
    }

    public static Icon cloudLockOpen() {
        return TablerIconsC3.cloudLockOpen();
    }

    public static Icon cloudMinus() {
        return TablerIconsC3.cloudMinus();
    }

    public static Icon cloudNetwork() {
        return TablerIconsC3.cloudNetwork();
    }

    public static Icon cloudOff() {
        return TablerIconsC3.cloudOff();
    }

    public static Icon cloudPause() {
        return TablerIconsC3.cloudPause();
    }

    public static Icon cloudPin() {
        return TablerIconsC3.cloudPin();
    }

    public static Icon cloudPlus() {
        return TablerIconsC3.cloudPlus();
    }

    public static Icon cloudQuestion() {
        return TablerIconsC3.cloudQuestion();
    }

    public static Icon cloudRain() {
        return TablerIconsC3.cloudRain();
    }

    public static Icon cloudSearch() {
        return TablerIconsC3.cloudSearch();
    }

    public static Icon cloudShare() {
        return TablerIconsC3.cloudShare();
    }

    public static Icon cloudSnow() {
        return TablerIconsC3.cloudSnow();
    }

    public static Icon cloudStar() {
        return TablerIconsC3.cloudStar();
    }

    public static Icon cloudStorm() {
        return TablerIconsC3.cloudStorm();
    }

    public static Icon cloudUp() {
        return TablerIconsC3.cloudUp();
    }

    public static Icon cloudUpload() {
        return TablerIconsC3.cloudUpload();
    }

    public static Icon cloudX() {
        return TablerIconsC3.cloudX();
    }

    public static Icon clover() {
        return TablerIconsC3.clover();
    }

    public static Icon cloverN2() {
        return TablerIconsC3.cloverN2();
    }

    public static Icon clubs() {
        return TablerIconsC3.clubs();
    }

    public static Icon code() {
        return TablerIconsC3.code();
    }

    public static Icon codeAi() {
        return TablerIconsC3.codeAi();
    }

    public static Icon codeAsterisk() {
        return TablerIconsC3.codeAsterisk();
    }

    public static Icon codeCircle() {
        return TablerIconsC3.codeCircle();
    }

    public static Icon codeCircleN2() {
        return TablerIconsC3.codeCircleN2();
    }

    public static Icon codeDots() {
        return TablerIconsC3.codeDots();
    }

    public static Icon codeMinus() {
        return TablerIconsC3.codeMinus();
    }

    public static Icon codeOff() {
        return TablerIconsC3.codeOff();
    }

    public static Icon codePlus() {
        return TablerIconsC3.codePlus();
    }

    public static Icon codeVariable() {
        return TablerIconsC3.codeVariable();
    }

    public static Icon codeVariableMinus() {
        return TablerIconsC3.codeVariableMinus();
    }

    public static Icon codeVariablePlus() {
        return TablerIconsC3.codeVariablePlus();
    }

    public static Icon codeblock() {
        return TablerIconsC3.codeblock();
    }

    public static Icon coffee() {
        return TablerIconsC3.coffee();
    }

    public static Icon coffeeOff() {
        return TablerIconsC3.coffeeOff();
    }

    public static Icon coffin() {
        return TablerIconsC3.coffin();
    }

    public static Icon coin() {
        return TablerIconsC3.coin();
    }

    public static Icon coinBitcoin() {
        return TablerIconsC3.coinBitcoin();
    }

    public static Icon coinEuro() {
        return TablerIconsC3.coinEuro();
    }

    public static Icon coinMonero() {
        return TablerIconsC3.coinMonero();
    }

    public static Icon coinOff() {
        return TablerIconsC3.coinOff();
    }

    public static Icon coinPound() {
        return TablerIconsC3.coinPound();
    }

    public static Icon coinRupee() {
        return TablerIconsC3.coinRupee();
    }

    public static Icon coinTaka() {
        return TablerIconsC3.coinTaka();
    }

    public static Icon coinYen() {
        return TablerIconsC3.coinYen();
    }

    public static Icon coinYuan() {
        return TablerIconsC3.coinYuan();
    }

    public static Icon coins() {
        return TablerIconsC3.coins();
    }

    public static Icon colorFilter() {
        return TablerIconsC3.colorFilter();
    }

    public static Icon colorPicker() {
        return TablerIconsC3.colorPicker();
    }

    public static Icon colorPickerOff() {
        return TablerIconsC3.colorPickerOff();
    }

    public static Icon colorSwatch() {
        return TablerIconsC3.colorSwatch();
    }

    public static Icon colorSwatchOff() {
        return TablerIconsC3.colorSwatchOff();
    }

    public static Icon columnInsertLeft() {
        return TablerIconsC3.columnInsertLeft();
    }

    public static Icon columnInsertRight() {
        return TablerIconsC3.columnInsertRight();
    }

    public static Icon columnRemove() {
        return TablerIconsC4.columnRemove();
    }

    public static Icon columns() {
        return TablerIconsC4.columns();
    }

    public static Icon columnsN1() {
        return TablerIconsC4.columnsN1();
    }

    public static Icon columnsN2() {
        return TablerIconsC4.columnsN2();
    }

    public static Icon columnsN3() {
        return TablerIconsC4.columnsN3();
    }

    public static Icon columnsOff() {
        return TablerIconsC4.columnsOff();
    }

    public static Icon comet() {
        return TablerIconsC4.comet();
    }

    public static Icon command() {
        return TablerIconsC4.command();
    }

    public static Icon commandOff() {
        return TablerIconsC4.commandOff();
    }

    public static Icon compass() {
        return TablerIconsC4.compass();
    }

    public static Icon compassOff() {
        return TablerIconsC4.compassOff();
    }

    public static Icon components() {
        return TablerIconsC4.components();
    }

    public static Icon componentsOff() {
        return TablerIconsC4.componentsOff();
    }

    public static Icon cone() {
        return TablerIconsC4.cone();
    }

    public static Icon coneN2() {
        return TablerIconsC4.coneN2();
    }

    public static Icon coneOff() {
        return TablerIconsC4.coneOff();
    }

    public static Icon conePlus() {
        return TablerIconsC4.conePlus();
    }

    public static Icon confetti() {
        return TablerIconsC4.confetti();
    }

    public static Icon confettiOff() {
        return TablerIconsC4.confettiOff();
    }

    public static Icon confucius() {
        return TablerIconsC4.confucius();
    }

    public static Icon congruentTo() {
        return TablerIconsC4.congruentTo();
    }

    public static Icon connection() {
        return TablerIconsC4.connection();
    }

    public static Icon container() {
        return TablerIconsC4.container();
    }

    public static Icon containerOff() {
        return TablerIconsC4.containerOff();
    }

    public static Icon contract() {
        return TablerIconsC4.contract();
    }

    public static Icon contrast() {
        return TablerIconsC4.contrast();
    }

    public static Icon contrastN2() {
        return TablerIconsC4.contrastN2();
    }

    public static Icon contrastN2Off() {
        return TablerIconsC4.contrastN2Off();
    }

    public static Icon contrastOff() {
        return TablerIconsC4.contrastOff();
    }

    public static Icon cooker() {
        return TablerIconsC4.cooker();
    }

    public static Icon cookie() {
        return TablerIconsC4.cookie();
    }

    public static Icon cookieMan() {
        return TablerIconsC4.cookieMan();
    }

    public static Icon cookieOff() {
        return TablerIconsC4.cookieOff();
    }

    public static Icon copy() {
        return TablerIconsC4.copy();
    }

    public static Icon copyCheck() {
        return TablerIconsC4.copyCheck();
    }

    public static Icon copyMinus() {
        return TablerIconsC4.copyMinus();
    }

    public static Icon copyOff() {
        return TablerIconsC4.copyOff();
    }

    public static Icon copyPlus() {
        return TablerIconsC4.copyPlus();
    }

    public static Icon copyX() {
        return TablerIconsC4.copyX();
    }

    public static Icon copyleft() {
        return TablerIconsC4.copyleft();
    }

    public static Icon copyleftOff() {
        return TablerIconsC4.copyleftOff();
    }

    public static Icon copyright() {
        return TablerIconsC4.copyright();
    }

    public static Icon copyrightOff() {
        return TablerIconsC4.copyrightOff();
    }

    public static Icon cornerDownLeft() {
        return TablerIconsC4.cornerDownLeft();
    }

    public static Icon cornerDownLeftDouble() {
        return TablerIconsC4.cornerDownLeftDouble();
    }

    public static Icon cornerDownRight() {
        return TablerIconsC4.cornerDownRight();
    }

    public static Icon cornerDownRightDouble() {
        return TablerIconsC4.cornerDownRightDouble();
    }

    public static Icon cornerLeftDown() {
        return TablerIconsC4.cornerLeftDown();
    }

    public static Icon cornerLeftDownDouble() {
        return TablerIconsC4.cornerLeftDownDouble();
    }

    public static Icon cornerLeftUp() {
        return TablerIconsC4.cornerLeftUp();
    }

    public static Icon cornerLeftUpDouble() {
        return TablerIconsC4.cornerLeftUpDouble();
    }

    public static Icon cornerRightDown() {
        return TablerIconsC4.cornerRightDown();
    }

    public static Icon cornerRightDownDouble() {
        return TablerIconsC4.cornerRightDownDouble();
    }

    public static Icon cornerRightUp() {
        return TablerIconsC4.cornerRightUp();
    }

    public static Icon cornerRightUpDouble() {
        return TablerIconsC4.cornerRightUpDouble();
    }

    public static Icon cornerUpLeft() {
        return TablerIconsC4.cornerUpLeft();
    }

    public static Icon cornerUpLeftDouble() {
        return TablerIconsC4.cornerUpLeftDouble();
    }

    public static Icon cornerUpRight() {
        return TablerIconsC4.cornerUpRight();
    }

    public static Icon cornerUpRightDouble() {
        return TablerIconsC4.cornerUpRightDouble();
    }

    public static Icon cpu() {
        return TablerIconsC4.cpu();
    }

    public static Icon cpuN2() {
        return TablerIconsC4.cpuN2();
    }

    public static Icon cpuOff() {
        return TablerIconsC4.cpuOff();
    }

    public static Icon crane() {
        return TablerIconsC4.crane();
    }

    public static Icon craneOff() {
        return TablerIconsC4.craneOff();
    }

    public static Icon creativeCommons() {
        return TablerIconsC4.creativeCommons();
    }

    public static Icon creativeCommonsBy() {
        return TablerIconsC4.creativeCommonsBy();
    }

    public static Icon creativeCommonsNc() {
        return TablerIconsC4.creativeCommonsNc();
    }

    public static Icon creativeCommonsNd() {
        return TablerIconsC4.creativeCommonsNd();
    }

    public static Icon creativeCommonsOff() {
        return TablerIconsC4.creativeCommonsOff();
    }

    public static Icon creativeCommonsSa() {
        return TablerIconsC4.creativeCommonsSa();
    }

    public static Icon creativeCommonsZero() {
        return TablerIconsC4.creativeCommonsZero();
    }

    public static Icon creditCard() {
        return TablerIconsC4.creditCard();
    }

    public static Icon creditCardHand() {
        return TablerIconsC4.creditCardHand();
    }

    public static Icon creditCardOff() {
        return TablerIconsC4.creditCardOff();
    }

    public static Icon creditCardPay() {
        return TablerIconsC4.creditCardPay();
    }

    public static Icon creditCardRefund() {
        return TablerIconsC4.creditCardRefund();
    }

    public static Icon credits() {
        return TablerIconsC4.credits();
    }

    public static Icon cricket() {
        return TablerIconsC4.cricket();
    }

    public static Icon crop() {
        return TablerIconsC4.crop();
    }

    public static Icon cropN1N1() {
        return TablerIconsC4.cropN1N1();
    }

    public static Icon cropN16N9() {
        return TablerIconsC4.cropN16N9();
    }

    public static Icon cropN3N2() {
        return TablerIconsC4.cropN3N2();
    }

    public static Icon cropN5N4() {
        return TablerIconsC4.cropN5N4();
    }

    public static Icon cropN7N5() {
        return TablerIconsC4.cropN7N5();
    }

    public static Icon cropLandscape() {
        return TablerIconsC4.cropLandscape();
    }

    public static Icon cropPortrait() {
        return TablerIconsC4.cropPortrait();
    }

    public static Icon cross() {
        return TablerIconsC4.cross();
    }

    public static Icon crossOff() {
        return TablerIconsC4.crossOff();
    }

    public static Icon crosshair() {
        return TablerIconsC4.crosshair();
    }

    public static Icon crown() {
        return TablerIconsC4.crown();
    }

    public static Icon crownOff() {
        return TablerIconsC4.crownOff();
    }

    public static Icon crutches() {
        return TablerIconsC4.crutches();
    }

    public static Icon crutchesOff() {
        return TablerIconsC4.crutchesOff();
    }

    public static Icon crystalBall() {
        return TablerIconsC4.crystalBall();
    }

    public static Icon csv() {
        return TablerIconsC4.csv();
    }

    public static Icon cube() {
        return TablerIconsC4.cube();
    }

    public static Icon cube3dSphere() {
        return TablerIconsC4.cube3dSphere();
    }

    public static Icon cube3dSphereOff() {
        return TablerIconsC4.cube3dSphereOff();
    }

    public static Icon cubeOff() {
        return TablerIconsC4.cubeOff();
    }

    public static Icon cubePlus() {
        return TablerIconsC4.cubePlus();
    }

    public static Icon cubeSend() {
        return TablerIconsC4.cubeSend();
    }

    public static Icon cubeSpark() {
        return TablerIconsC4.cubeSpark();
    }

    public static Icon cubeUnfolded() {
        return TablerIconsC4.cubeUnfolded();
    }

    public static Icon cup() {
        return TablerIconsC4.cup();
    }

    public static Icon cupOff() {
        return TablerIconsC4.cupOff();
    }

    public static Icon curling() {
        return TablerIconsC4.curling();
    }

    public static Icon curlyLoop() {
        return TablerIconsC4.curlyLoop();
    }

    public static Icon currency() {
        return TablerIconsC4.currency();
    }

    public static Icon currencyAfghani() {
        return TablerIconsC4.currencyAfghani();
    }

    public static Icon currencyBahraini() {
        return TablerIconsC4.currencyBahraini();
    }

    public static Icon currencyBaht() {
        return TablerIconsC4.currencyBaht();
    }

    public static Icon currencyBitcoin() {
        return TablerIconsC4.currencyBitcoin();
    }

    public static Icon currencyCent() {
        return TablerIconsC4.currencyCent();
    }

    public static Icon currencyDinar() {
        return TablerIconsC4.currencyDinar();
    }

    public static Icon currencyDirham() {
        return TablerIconsC4.currencyDirham();
    }

    public static Icon currencyDogecoin() {
        return TablerIconsC4.currencyDogecoin();
    }

    public static Icon currencyDollar() {
        return TablerIconsC4.currencyDollar();
    }

    public static Icon currencyDollarAustralian() {
        return TablerIconsC4.currencyDollarAustralian();
    }

    public static Icon currencyDollarBrunei() {
        return TablerIconsC4.currencyDollarBrunei();
    }

    public static Icon currencyDollarCanadian() {
        return TablerIconsC4.currencyDollarCanadian();
    }

    public static Icon currencyDollarGuyanese() {
        return TablerIconsC4.currencyDollarGuyanese();
    }

    public static Icon currencyDollarOff() {
        return TablerIconsC4.currencyDollarOff();
    }

    public static Icon currencyDollarSingapore() {
        return TablerIconsC4.currencyDollarSingapore();
    }

    public static Icon currencyDollarZimbabwean() {
        return TablerIconsC4.currencyDollarZimbabwean();
    }

    public static Icon currencyDong() {
        return TablerIconsC4.currencyDong();
    }

    public static Icon currencyDram() {
        return TablerIconsC4.currencyDram();
    }

    public static Icon currencyEthereum() {
        return TablerIconsC4.currencyEthereum();
    }

    public static Icon currencyEuro() {
        return TablerIconsC4.currencyEuro();
    }

    public static Icon currencyEuroOff() {
        return TablerIconsC4.currencyEuroOff();
    }

    public static Icon currencyFlorin() {
        return TablerIconsC4.currencyFlorin();
    }

    public static Icon currencyForint() {
        return TablerIconsC4.currencyForint();
    }

    public static Icon currencyFrank() {
        return TablerIconsC4.currencyFrank();
    }

    public static Icon currencyGuarani() {
        return TablerIconsC4.currencyGuarani();
    }

    public static Icon currencyHryvnia() {
        return TablerIconsC4.currencyHryvnia();
    }

    public static Icon currencyHusd() {
        return TablerIconsC4.currencyHusd();
    }

    public static Icon currencyIranianRial() {
        return TablerIconsC4.currencyIranianRial();
    }

    public static Icon currencyKip() {
        return TablerIconsC4.currencyKip();
    }

    public static Icon currencyKroneCzech() {
        return TablerIconsC4.currencyKroneCzech();
    }

    public static Icon currencyKroneDanish() {
        return TablerIconsC4.currencyKroneDanish();
    }

    public static Icon currencyKroneSwedish() {
        return TablerIconsC4.currencyKroneSwedish();
    }

    public static Icon currencyLari() {
        return TablerIconsC4.currencyLari();
    }

    public static Icon currencyLeu() {
        return TablerIconsC4.currencyLeu();
    }

    public static Icon currencyLira() {
        return TablerIconsC4.currencyLira();
    }

    public static Icon currencyLitecoin() {
        return TablerIconsC4.currencyLitecoin();
    }

    public static Icon currencyLyd() {
        return TablerIconsC4.currencyLyd();
    }

    public static Icon currencyManat() {
        return TablerIconsC4.currencyManat();
    }

    public static Icon currencyMonero() {
        return TablerIconsC4.currencyMonero();
    }

    public static Icon currencyNaira() {
        return TablerIconsC4.currencyNaira();
    }

    public static Icon currencyNano() {
        return TablerIconsC4.currencyNano();
    }

    public static Icon currencyOff() {
        return TablerIconsC4.currencyOff();
    }

    public static Icon currencyPaanga() {
        return TablerIconsC4.currencyPaanga();
    }

    public static Icon currencyPeso() {
        return TablerIconsC4.currencyPeso();
    }

    public static Icon currencyPound() {
        return TablerIconsC4.currencyPound();
    }

    public static Icon currencyPoundOff() {
        return TablerIconsC4.currencyPoundOff();
    }

    public static Icon currencyQuetzal() {
        return TablerIconsC4.currencyQuetzal();
    }

    public static Icon currencyReal() {
        return TablerIconsC4.currencyReal();
    }

    public static Icon currencyRenminbi() {
        return TablerIconsC4.currencyRenminbi();
    }

    public static Icon currencyRipple() {
        return TablerIconsC4.currencyRipple();
    }

    public static Icon currencyRiyal() {
        return TablerIconsC4.currencyRiyal();
    }

    public static Icon currencyRubel() {
        return TablerIconsC4.currencyRubel();
    }

    public static Icon currencyRufiyaa() {
        return TablerIconsC4.currencyRufiyaa();
    }

    public static Icon currencyRupee() {
        return TablerIconsC4.currencyRupee();
    }

    public static Icon currencyRupeeNepalese() {
        return TablerIconsC4.currencyRupeeNepalese();
    }

    public static Icon currencyShekel() {
        return TablerIconsC4.currencyShekel();
    }

    public static Icon currencySolana() {
        return TablerIconsC4.currencySolana();
    }

    public static Icon currencySom() {
        return TablerIconsC4.currencySom();
    }

    public static Icon currencyTaka() {
        return TablerIconsC4.currencyTaka();
    }

    public static Icon currencyTenge() {
        return TablerIconsC4.currencyTenge();
    }

    public static Icon currencyTether() {
        return TablerIconsC4.currencyTether();
    }

    public static Icon currencyTugrik() {
        return TablerIconsC4.currencyTugrik();
    }

    public static Icon currencyWon() {
        return TablerIconsC4.currencyWon();
    }

    public static Icon currencyXrp() {
        return TablerIconsC4.currencyXrp();
    }

    public static Icon currencyYen() {
        return TablerIconsC4.currencyYen();
    }

    public static Icon currencyYenOff() {
        return TablerIconsC4.currencyYenOff();
    }

    public static Icon currencyYuan() {
        return TablerIconsC4.currencyYuan();
    }

    public static Icon currencyZcash() {
        return TablerIconsC4.currencyZcash();
    }

    public static Icon currencyZloty() {
        return TablerIconsC4.currencyZloty();
    }

    public static Icon currentLocation() {
        return TablerIconsC4.currentLocation();
    }

    public static Icon currentLocationOff() {
        return TablerIconsC4.currentLocationOff();
    }

    public static Icon cursorOff() {
        return TablerIconsC4.cursorOff();
    }

    public static Icon cursorText() {
        return TablerIconsC5.cursorText();
    }

    public static Icon cut() {
        return TablerIconsC5.cut();
    }

    public static Icon cylinder() {
        return TablerIconsC5.cylinder();
    }

    public static Icon cylinderOff() {
        return TablerIconsC5.cylinderOff();
    }

    public static Icon cylinderPlus() {
        return TablerIconsC5.cylinderPlus();
    }

    public static Icon dashboard() {
        return TablerIconsD1.dashboard();
    }

    public static Icon dashboardOff() {
        return TablerIconsD1.dashboardOff();
    }

    public static Icon database() {
        return TablerIconsD1.database();
    }

    public static Icon databaseCog() {
        return TablerIconsD1.databaseCog();
    }

    public static Icon databaseDollar() {
        return TablerIconsD1.databaseDollar();
    }

    public static Icon databaseEdit() {
        return TablerIconsD1.databaseEdit();
    }

    public static Icon databaseExclamation() {
        return TablerIconsD1.databaseExclamation();
    }

    public static Icon databaseExport() {
        return TablerIconsD1.databaseExport();
    }

    public static Icon databaseHeart() {
        return TablerIconsD1.databaseHeart();
    }

    public static Icon databaseImport() {
        return TablerIconsD1.databaseImport();
    }

    public static Icon databaseLeak() {
        return TablerIconsD1.databaseLeak();
    }

    public static Icon databaseMinus() {
        return TablerIconsD1.databaseMinus();
    }

    public static Icon databaseOff() {
        return TablerIconsD1.databaseOff();
    }

    public static Icon databasePlus() {
        return TablerIconsD1.databasePlus();
    }

    public static Icon databaseSearch() {
        return TablerIconsD1.databaseSearch();
    }

    public static Icon databaseShare() {
        return TablerIconsD1.databaseShare();
    }

    public static Icon databaseSmile() {
        return TablerIconsD1.databaseSmile();
    }

    public static Icon databaseStar() {
        return TablerIconsD1.databaseStar();
    }

    public static Icon databaseX() {
        return TablerIconsD1.databaseX();
    }

    public static Icon deaf() {
        return TablerIconsD1.deaf();
    }

    public static Icon decimal() {
        return TablerIconsD1.decimal();
    }

    public static Icon deer() {
        return TablerIconsD1.deer();
    }

    public static Icon delta() {
        return TablerIconsD1.delta();
    }

    public static Icon dental() {
        return TablerIconsD1.dental();
    }

    public static Icon dentalBroken() {
        return TablerIconsD1.dentalBroken();
    }

    public static Icon dentalOff() {
        return TablerIconsD1.dentalOff();
    }

    public static Icon deselect() {
        return TablerIconsD1.deselect();
    }

    public static Icon desk() {
        return TablerIconsD1.desk();
    }

    public static Icon details() {
        return TablerIconsD1.details();
    }

    public static Icon detailsOff() {
        return TablerIconsD1.detailsOff();
    }

    public static Icon device3dCamera() {
        return TablerIconsD1.device3dCamera();
    }

    public static Icon device3dLens() {
        return TablerIconsD1.device3dLens();
    }

    public static Icon deviceAirpods() {
        return TablerIconsD1.deviceAirpods();
    }

    public static Icon deviceAirpodsCase() {
        return TablerIconsD1.deviceAirpodsCase();
    }

    public static Icon deviceAirtag() {
        return TablerIconsD1.deviceAirtag();
    }

    public static Icon deviceAnalytics() {
        return TablerIconsD1.deviceAnalytics();
    }

    public static Icon deviceAudioTape() {
        return TablerIconsD1.deviceAudioTape();
    }

    public static Icon deviceCameraPhone() {
        return TablerIconsD1.deviceCameraPhone();
    }

    public static Icon deviceCctv() {
        return TablerIconsD1.deviceCctv();
    }

    public static Icon deviceCctvOff() {
        return TablerIconsD1.deviceCctvOff();
    }

    public static Icon deviceComputerCamera() {
        return TablerIconsD1.deviceComputerCamera();
    }

    public static Icon deviceComputerCameraN2() {
        return TablerIconsD1.deviceComputerCameraN2();
    }

    public static Icon deviceComputerCameraOff() {
        return TablerIconsD1.deviceComputerCameraOff();
    }

    public static Icon deviceDesktop() {
        return TablerIconsD1.deviceDesktop();
    }

    public static Icon deviceDesktopAnalytics() {
        return TablerIconsD1.deviceDesktopAnalytics();
    }

    public static Icon deviceDesktopBolt() {
        return TablerIconsD1.deviceDesktopBolt();
    }

    public static Icon deviceDesktopCancel() {
        return TablerIconsD1.deviceDesktopCancel();
    }

    public static Icon deviceDesktopCheck() {
        return TablerIconsD1.deviceDesktopCheck();
    }

    public static Icon deviceDesktopCode() {
        return TablerIconsD1.deviceDesktopCode();
    }

    public static Icon deviceDesktopCog() {
        return TablerIconsD1.deviceDesktopCog();
    }

    public static Icon deviceDesktopDollar() {
        return TablerIconsD1.deviceDesktopDollar();
    }

    public static Icon deviceDesktopDown() {
        return TablerIconsD1.deviceDesktopDown();
    }

    public static Icon deviceDesktopExclamation() {
        return TablerIconsD1.deviceDesktopExclamation();
    }

    public static Icon deviceDesktopHeart() {
        return TablerIconsD1.deviceDesktopHeart();
    }

    public static Icon deviceDesktopMinus() {
        return TablerIconsD1.deviceDesktopMinus();
    }

    public static Icon deviceDesktopOff() {
        return TablerIconsD1.deviceDesktopOff();
    }

    public static Icon deviceDesktopPause() {
        return TablerIconsD1.deviceDesktopPause();
    }

    public static Icon deviceDesktopPin() {
        return TablerIconsD1.deviceDesktopPin();
    }

    public static Icon deviceDesktopPlus() {
        return TablerIconsD1.deviceDesktopPlus();
    }

    public static Icon deviceDesktopQuestion() {
        return TablerIconsD1.deviceDesktopQuestion();
    }

    public static Icon deviceDesktopSearch() {
        return TablerIconsD1.deviceDesktopSearch();
    }

    public static Icon deviceDesktopShare() {
        return TablerIconsD1.deviceDesktopShare();
    }

    public static Icon deviceDesktopStar() {
        return TablerIconsD1.deviceDesktopStar();
    }

    public static Icon deviceDesktopUp() {
        return TablerIconsD1.deviceDesktopUp();
    }

    public static Icon deviceDesktopX() {
        return TablerIconsD1.deviceDesktopX();
    }

    public static Icon deviceFloppy() {
        return TablerIconsD1.deviceFloppy();
    }

    public static Icon deviceGamepad() {
        return TablerIconsD1.deviceGamepad();
    }

    public static Icon deviceGamepadN2() {
        return TablerIconsD1.deviceGamepadN2();
    }

    public static Icon deviceGamepadN3() {
        return TablerIconsD1.deviceGamepadN3();
    }

    public static Icon deviceHeartMonitor() {
        return TablerIconsD1.deviceHeartMonitor();
    }

    public static Icon deviceImac() {
        return TablerIconsD1.deviceImac();
    }

    public static Icon deviceImacBolt() {
        return TablerIconsD1.deviceImacBolt();
    }

    public static Icon deviceImacCancel() {
        return TablerIconsD1.deviceImacCancel();
    }

    public static Icon deviceImacCheck() {
        return TablerIconsD1.deviceImacCheck();
    }

    public static Icon deviceImacCode() {
        return TablerIconsD1.deviceImacCode();
    }

    public static Icon deviceImacCog() {
        return TablerIconsD1.deviceImacCog();
    }

    public static Icon deviceImacDollar() {
        return TablerIconsD1.deviceImacDollar();
    }

    public static Icon deviceImacDown() {
        return TablerIconsD1.deviceImacDown();
    }

    public static Icon deviceImacExclamation() {
        return TablerIconsD1.deviceImacExclamation();
    }

    public static Icon deviceImacHeart() {
        return TablerIconsD1.deviceImacHeart();
    }

    public static Icon deviceImacMinus() {
        return TablerIconsD1.deviceImacMinus();
    }

    public static Icon deviceImacOff() {
        return TablerIconsD1.deviceImacOff();
    }

    public static Icon deviceImacPause() {
        return TablerIconsD1.deviceImacPause();
    }

    public static Icon deviceImacPin() {
        return TablerIconsD1.deviceImacPin();
    }

    public static Icon deviceImacPlus() {
        return TablerIconsD1.deviceImacPlus();
    }

    public static Icon deviceImacQuestion() {
        return TablerIconsD1.deviceImacQuestion();
    }

    public static Icon deviceImacSearch() {
        return TablerIconsD1.deviceImacSearch();
    }

    public static Icon deviceImacShare() {
        return TablerIconsD1.deviceImacShare();
    }

    public static Icon deviceImacStar() {
        return TablerIconsD1.deviceImacStar();
    }

    public static Icon deviceImacUp() {
        return TablerIconsD1.deviceImacUp();
    }

    public static Icon deviceImacX() {
        return TablerIconsD1.deviceImacX();
    }

    public static Icon deviceIpad() {
        return TablerIconsD1.deviceIpad();
    }

    public static Icon deviceIpadBolt() {
        return TablerIconsD1.deviceIpadBolt();
    }

    public static Icon deviceIpadCancel() {
        return TablerIconsD1.deviceIpadCancel();
    }

    public static Icon deviceIpadCheck() {
        return TablerIconsD1.deviceIpadCheck();
    }

    public static Icon deviceIpadCode() {
        return TablerIconsD1.deviceIpadCode();
    }

    public static Icon deviceIpadCog() {
        return TablerIconsD1.deviceIpadCog();
    }

    public static Icon deviceIpadDollar() {
        return TablerIconsD1.deviceIpadDollar();
    }

    public static Icon deviceIpadDown() {
        return TablerIconsD1.deviceIpadDown();
    }

    public static Icon deviceIpadExclamation() {
        return TablerIconsD1.deviceIpadExclamation();
    }

    public static Icon deviceIpadHeart() {
        return TablerIconsD1.deviceIpadHeart();
    }

    public static Icon deviceIpadHorizontal() {
        return TablerIconsD1.deviceIpadHorizontal();
    }

    public static Icon deviceIpadHorizontalBolt() {
        return TablerIconsD1.deviceIpadHorizontalBolt();
    }

    public static Icon deviceIpadHorizontalCancel() {
        return TablerIconsD1.deviceIpadHorizontalCancel();
    }

    public static Icon deviceIpadHorizontalCheck() {
        return TablerIconsD1.deviceIpadHorizontalCheck();
    }

    public static Icon deviceIpadHorizontalCode() {
        return TablerIconsD1.deviceIpadHorizontalCode();
    }

    public static Icon deviceIpadHorizontalCog() {
        return TablerIconsD1.deviceIpadHorizontalCog();
    }

    public static Icon deviceIpadHorizontalDollar() {
        return TablerIconsD1.deviceIpadHorizontalDollar();
    }

    public static Icon deviceIpadHorizontalDown() {
        return TablerIconsD1.deviceIpadHorizontalDown();
    }

    public static Icon deviceIpadHorizontalExclamation() {
        return TablerIconsD1.deviceIpadHorizontalExclamation();
    }

    public static Icon deviceIpadHorizontalHeart() {
        return TablerIconsD1.deviceIpadHorizontalHeart();
    }

    public static Icon deviceIpadHorizontalMinus() {
        return TablerIconsD1.deviceIpadHorizontalMinus();
    }

    public static Icon deviceIpadHorizontalOff() {
        return TablerIconsD1.deviceIpadHorizontalOff();
    }

    public static Icon deviceIpadHorizontalPause() {
        return TablerIconsD1.deviceIpadHorizontalPause();
    }

    public static Icon deviceIpadHorizontalPin() {
        return TablerIconsD1.deviceIpadHorizontalPin();
    }

    public static Icon deviceIpadHorizontalPlus() {
        return TablerIconsD1.deviceIpadHorizontalPlus();
    }

    public static Icon deviceIpadHorizontalQuestion() {
        return TablerIconsD1.deviceIpadHorizontalQuestion();
    }

    public static Icon deviceIpadHorizontalSearch() {
        return TablerIconsD1.deviceIpadHorizontalSearch();
    }

    public static Icon deviceIpadHorizontalShare() {
        return TablerIconsD1.deviceIpadHorizontalShare();
    }

    public static Icon deviceIpadHorizontalStar() {
        return TablerIconsD1.deviceIpadHorizontalStar();
    }

    public static Icon deviceIpadHorizontalUp() {
        return TablerIconsD1.deviceIpadHorizontalUp();
    }

    public static Icon deviceIpadHorizontalX() {
        return TablerIconsD1.deviceIpadHorizontalX();
    }

    public static Icon deviceIpadMinus() {
        return TablerIconsD1.deviceIpadMinus();
    }

    public static Icon deviceIpadOff() {
        return TablerIconsD1.deviceIpadOff();
    }

    public static Icon deviceIpadPause() {
        return TablerIconsD1.deviceIpadPause();
    }

    public static Icon deviceIpadPin() {
        return TablerIconsD1.deviceIpadPin();
    }

    public static Icon deviceIpadPlus() {
        return TablerIconsD1.deviceIpadPlus();
    }

    public static Icon deviceIpadQuestion() {
        return TablerIconsD1.deviceIpadQuestion();
    }

    public static Icon deviceIpadSearch() {
        return TablerIconsD1.deviceIpadSearch();
    }

    public static Icon deviceIpadShare() {
        return TablerIconsD1.deviceIpadShare();
    }

    public static Icon deviceIpadStar() {
        return TablerIconsD1.deviceIpadStar();
    }

    public static Icon deviceIpadUp() {
        return TablerIconsD1.deviceIpadUp();
    }

    public static Icon deviceIpadX() {
        return TablerIconsD1.deviceIpadX();
    }

    public static Icon deviceLandlinePhone() {
        return TablerIconsD1.deviceLandlinePhone();
    }

    public static Icon deviceLaptop() {
        return TablerIconsD1.deviceLaptop();
    }

    public static Icon deviceLaptopOff() {
        return TablerIconsD1.deviceLaptopOff();
    }

    public static Icon deviceMobile() {
        return TablerIconsD1.deviceMobile();
    }

    public static Icon deviceMobileBolt() {
        return TablerIconsD1.deviceMobileBolt();
    }

    public static Icon deviceMobileCancel() {
        return TablerIconsD1.deviceMobileCancel();
    }

    public static Icon deviceMobileCharging() {
        return TablerIconsD1.deviceMobileCharging();
    }

    public static Icon deviceMobileCheck() {
        return TablerIconsD1.deviceMobileCheck();
    }

    public static Icon deviceMobileCode() {
        return TablerIconsD1.deviceMobileCode();
    }

    public static Icon deviceMobileCog() {
        return TablerIconsD1.deviceMobileCog();
    }

    public static Icon deviceMobileDollar() {
        return TablerIconsD1.deviceMobileDollar();
    }

    public static Icon deviceMobileDown() {
        return TablerIconsD1.deviceMobileDown();
    }

    public static Icon deviceMobileExclamation() {
        return TablerIconsD1.deviceMobileExclamation();
    }

    public static Icon deviceMobileHeart() {
        return TablerIconsD1.deviceMobileHeart();
    }

    public static Icon deviceMobileMessage() {
        return TablerIconsD1.deviceMobileMessage();
    }

    public static Icon deviceMobileMinus() {
        return TablerIconsD1.deviceMobileMinus();
    }

    public static Icon deviceMobileOff() {
        return TablerIconsD1.deviceMobileOff();
    }

    public static Icon deviceMobilePause() {
        return TablerIconsD1.deviceMobilePause();
    }

    public static Icon deviceMobilePin() {
        return TablerIconsD1.deviceMobilePin();
    }

    public static Icon deviceMobilePlus() {
        return TablerIconsD1.deviceMobilePlus();
    }

    public static Icon deviceMobileQuestion() {
        return TablerIconsD1.deviceMobileQuestion();
    }

    public static Icon deviceMobileRotated() {
        return TablerIconsD1.deviceMobileRotated();
    }

    public static Icon deviceMobileSearch() {
        return TablerIconsD1.deviceMobileSearch();
    }

    public static Icon deviceMobileShare() {
        return TablerIconsD1.deviceMobileShare();
    }

    public static Icon deviceMobileStar() {
        return TablerIconsD1.deviceMobileStar();
    }

    public static Icon deviceMobileUp() {
        return TablerIconsD1.deviceMobileUp();
    }

    public static Icon deviceMobileVibration() {
        return TablerIconsD1.deviceMobileVibration();
    }

    public static Icon deviceMobileX() {
        return TablerIconsD1.deviceMobileX();
    }

    public static Icon deviceNintendo() {
        return TablerIconsD1.deviceNintendo();
    }

    public static Icon deviceNintendoOff() {
        return TablerIconsD1.deviceNintendoOff();
    }

    public static Icon deviceProjector() {
        return TablerIconsD1.deviceProjector();
    }

    public static Icon deviceRemote() {
        return TablerIconsD1.deviceRemote();
    }

    public static Icon deviceScreen() {
        return TablerIconsD1.deviceScreen();
    }

    public static Icon deviceSdCard() {
        return TablerIconsD1.deviceSdCard();
    }

    public static Icon deviceSim() {
        return TablerIconsD1.deviceSim();
    }

    public static Icon deviceSimN1() {
        return TablerIconsD1.deviceSimN1();
    }

    public static Icon deviceSimN2() {
        return TablerIconsD1.deviceSimN2();
    }

    public static Icon deviceSimN3() {
        return TablerIconsD1.deviceSimN3();
    }

    public static Icon deviceSpeaker() {
        return TablerIconsD1.deviceSpeaker();
    }

    public static Icon deviceSpeakerOff() {
        return TablerIconsD1.deviceSpeakerOff();
    }

    public static Icon deviceTablet() {
        return TablerIconsD1.deviceTablet();
    }

    public static Icon deviceTabletBolt() {
        return TablerIconsD1.deviceTabletBolt();
    }

    public static Icon deviceTabletCancel() {
        return TablerIconsD1.deviceTabletCancel();
    }

    public static Icon deviceTabletCheck() {
        return TablerIconsD1.deviceTabletCheck();
    }

    public static Icon deviceTabletCode() {
        return TablerIconsD1.deviceTabletCode();
    }

    public static Icon deviceTabletCog() {
        return TablerIconsD1.deviceTabletCog();
    }

    public static Icon deviceTabletDollar() {
        return TablerIconsD1.deviceTabletDollar();
    }

    public static Icon deviceTabletDown() {
        return TablerIconsD2.deviceTabletDown();
    }

    public static Icon deviceTabletExclamation() {
        return TablerIconsD2.deviceTabletExclamation();
    }

    public static Icon deviceTabletHeart() {
        return TablerIconsD2.deviceTabletHeart();
    }

    public static Icon deviceTabletMinus() {
        return TablerIconsD2.deviceTabletMinus();
    }

    public static Icon deviceTabletOff() {
        return TablerIconsD2.deviceTabletOff();
    }

    public static Icon deviceTabletPause() {
        return TablerIconsD2.deviceTabletPause();
    }

    public static Icon deviceTabletPin() {
        return TablerIconsD2.deviceTabletPin();
    }

    public static Icon deviceTabletPlus() {
        return TablerIconsD2.deviceTabletPlus();
    }

    public static Icon deviceTabletQuestion() {
        return TablerIconsD2.deviceTabletQuestion();
    }

    public static Icon deviceTabletSearch() {
        return TablerIconsD2.deviceTabletSearch();
    }

    public static Icon deviceTabletShare() {
        return TablerIconsD2.deviceTabletShare();
    }

    public static Icon deviceTabletStar() {
        return TablerIconsD2.deviceTabletStar();
    }

    public static Icon deviceTabletUp() {
        return TablerIconsD2.deviceTabletUp();
    }

    public static Icon deviceTabletX() {
        return TablerIconsD2.deviceTabletX();
    }

    public static Icon deviceTv() {
        return TablerIconsD2.deviceTv();
    }

    public static Icon deviceTvOff() {
        return TablerIconsD2.deviceTvOff();
    }

    public static Icon deviceTvOld() {
        return TablerIconsD2.deviceTvOld();
    }

    public static Icon deviceUnknown() {
        return TablerIconsD2.deviceUnknown();
    }

    public static Icon deviceUsb() {
        return TablerIconsD2.deviceUsb();
    }

    public static Icon deviceVisionPro() {
        return TablerIconsD2.deviceVisionPro();
    }

    public static Icon deviceWatch() {
        return TablerIconsD2.deviceWatch();
    }

    public static Icon deviceWatchBolt() {
        return TablerIconsD2.deviceWatchBolt();
    }

    public static Icon deviceWatchCancel() {
        return TablerIconsD2.deviceWatchCancel();
    }

    public static Icon deviceWatchCheck() {
        return TablerIconsD2.deviceWatchCheck();
    }

    public static Icon deviceWatchCode() {
        return TablerIconsD2.deviceWatchCode();
    }

    public static Icon deviceWatchCog() {
        return TablerIconsD2.deviceWatchCog();
    }

    public static Icon deviceWatchDollar() {
        return TablerIconsD2.deviceWatchDollar();
    }

    public static Icon deviceWatchDown() {
        return TablerIconsD2.deviceWatchDown();
    }

    public static Icon deviceWatchExclamation() {
        return TablerIconsD2.deviceWatchExclamation();
    }

    public static Icon deviceWatchHeart() {
        return TablerIconsD2.deviceWatchHeart();
    }

    public static Icon deviceWatchMinus() {
        return TablerIconsD2.deviceWatchMinus();
    }

    public static Icon deviceWatchOff() {
        return TablerIconsD2.deviceWatchOff();
    }

    public static Icon deviceWatchPause() {
        return TablerIconsD2.deviceWatchPause();
    }

    public static Icon deviceWatchPin() {
        return TablerIconsD2.deviceWatchPin();
    }

    public static Icon deviceWatchPlus() {
        return TablerIconsD2.deviceWatchPlus();
    }

    public static Icon deviceWatchQuestion() {
        return TablerIconsD2.deviceWatchQuestion();
    }

    public static Icon deviceWatchSearch() {
        return TablerIconsD2.deviceWatchSearch();
    }

    public static Icon deviceWatchShare() {
        return TablerIconsD2.deviceWatchShare();
    }

    public static Icon deviceWatchStar() {
        return TablerIconsD2.deviceWatchStar();
    }

    public static Icon deviceWatchStats() {
        return TablerIconsD2.deviceWatchStats();
    }

    public static Icon deviceWatchStatsN2() {
        return TablerIconsD2.deviceWatchStatsN2();
    }

    public static Icon deviceWatchUp() {
        return TablerIconsD2.deviceWatchUp();
    }

    public static Icon deviceWatchX() {
        return TablerIconsD2.deviceWatchX();
    }

    public static Icon devices() {
        return TablerIconsD2.devices();
    }

    public static Icon devicesN2() {
        return TablerIconsD2.devicesN2();
    }

    public static Icon devicesBolt() {
        return TablerIconsD2.devicesBolt();
    }

    public static Icon devicesCancel() {
        return TablerIconsD2.devicesCancel();
    }

    public static Icon devicesCheck() {
        return TablerIconsD2.devicesCheck();
    }

    public static Icon devicesCode() {
        return TablerIconsD2.devicesCode();
    }

    public static Icon devicesCog() {
        return TablerIconsD2.devicesCog();
    }

    public static Icon devicesDollar() {
        return TablerIconsD2.devicesDollar();
    }

    public static Icon devicesDown() {
        return TablerIconsD2.devicesDown();
    }

    public static Icon devicesExclamation() {
        return TablerIconsD2.devicesExclamation();
    }

    public static Icon devicesHeart() {
        return TablerIconsD2.devicesHeart();
    }

    public static Icon devicesMinus() {
        return TablerIconsD2.devicesMinus();
    }

    public static Icon devicesOff() {
        return TablerIconsD2.devicesOff();
    }

    public static Icon devicesPause() {
        return TablerIconsD2.devicesPause();
    }

    public static Icon devicesPc() {
        return TablerIconsD2.devicesPc();
    }

    public static Icon devicesPcOff() {
        return TablerIconsD2.devicesPcOff();
    }

    public static Icon devicesPin() {
        return TablerIconsD2.devicesPin();
    }

    public static Icon devicesPlus() {
        return TablerIconsD2.devicesPlus();
    }

    public static Icon devicesQuestion() {
        return TablerIconsD2.devicesQuestion();
    }

    public static Icon devicesSearch() {
        return TablerIconsD2.devicesSearch();
    }

    public static Icon devicesShare() {
        return TablerIconsD2.devicesShare();
    }

    public static Icon devicesStar() {
        return TablerIconsD2.devicesStar();
    }

    public static Icon devicesUp() {
        return TablerIconsD2.devicesUp();
    }

    public static Icon devicesX() {
        return TablerIconsD2.devicesX();
    }

    public static Icon diabolo() {
        return TablerIconsD2.diabolo();
    }

    public static Icon diaboloOff() {
        return TablerIconsD2.diaboloOff();
    }

    public static Icon diaboloPlus() {
        return TablerIconsD2.diaboloPlus();
    }

    public static Icon dialpad() {
        return TablerIconsD2.dialpad();
    }

    public static Icon dialpadOff() {
        return TablerIconsD2.dialpadOff();
    }

    public static Icon diamond() {
        return TablerIconsD2.diamond();
    }

    public static Icon diamondOff() {
        return TablerIconsD2.diamondOff();
    }

    public static Icon diamonds() {
        return TablerIconsD2.diamonds();
    }

    public static Icon diaper() {
        return TablerIconsD2.diaper();
    }

    public static Icon dice() {
        return TablerIconsD2.dice();
    }

    public static Icon diceN1() {
        return TablerIconsD2.diceN1();
    }

    public static Icon diceN2() {
        return TablerIconsD2.diceN2();
    }

    public static Icon diceN3() {
        return TablerIconsD2.diceN3();
    }

    public static Icon diceN4() {
        return TablerIconsD2.diceN4();
    }

    public static Icon diceN5() {
        return TablerIconsD2.diceN5();
    }

    public static Icon diceN6() {
        return TablerIconsD2.diceN6();
    }

    public static Icon dimensions() {
        return TablerIconsD2.dimensions();
    }

    public static Icon direction() {
        return TablerIconsD2.direction();
    }

    public static Icon directionArrows() {
        return TablerIconsD2.directionArrows();
    }

    public static Icon directionHorizontal() {
        return TablerIconsD2.directionHorizontal();
    }

    public static Icon directionSign() {
        return TablerIconsD2.directionSign();
    }

    public static Icon directionSignOff() {
        return TablerIconsD2.directionSignOff();
    }

    public static Icon directions() {
        return TablerIconsD2.directions();
    }

    public static Icon directionsOff() {
        return TablerIconsD2.directionsOff();
    }

    public static Icon disabled() {
        return TablerIconsD2.disabled();
    }

    public static Icon disabledN2() {
        return TablerIconsD2.disabledN2();
    }

    public static Icon disabledOff() {
        return TablerIconsD2.disabledOff();
    }

    public static Icon disc() {
        return TablerIconsD2.disc();
    }

    public static Icon discGolf() {
        return TablerIconsD2.discGolf();
    }

    public static Icon discOff() {
        return TablerIconsD2.discOff();
    }

    public static Icon discount() {
        return TablerIconsD2.discount();
    }

    public static Icon discountOff() {
        return TablerIconsD2.discountOff();
    }

    public static Icon divide() {
        return TablerIconsD2.divide();
    }

    public static Icon dna() {
        return TablerIconsD2.dna();
    }

    public static Icon dnaN2() {
        return TablerIconsD2.dnaN2();
    }

    public static Icon dnaN2Off() {
        return TablerIconsD2.dnaN2Off();
    }

    public static Icon dnaOff() {
        return TablerIconsD2.dnaOff();
    }

    public static Icon dog() {
        return TablerIconsD2.dog();
    }

    public static Icon dogBowl() {
        return TablerIconsD2.dogBowl();
    }

    public static Icon door() {
        return TablerIconsD2.door();
    }

    public static Icon doorEnter() {
        return TablerIconsD2.doorEnter();
    }

    public static Icon doorExit() {
        return TablerIconsD2.doorExit();
    }

    public static Icon doorHanger() {
        return TablerIconsD2.doorHanger();
    }

    public static Icon doorOff() {
        return TablerIconsD2.doorOff();
    }

    public static Icon dots() {
        return TablerIconsD2.dots();
    }

    public static Icon dotsCircleHorizontal() {
        return TablerIconsD2.dotsCircleHorizontal();
    }

    public static Icon dotsDiagonal() {
        return TablerIconsD2.dotsDiagonal();
    }

    public static Icon dotsDiagonalN2() {
        return TablerIconsD2.dotsDiagonalN2();
    }

    public static Icon dotsVertical() {
        return TablerIconsD2.dotsVertical();
    }

    public static Icon download() {
        return TablerIconsD2.download();
    }

    public static Icon downloadOff() {
        return TablerIconsD2.downloadOff();
    }

    public static Icon dragDrop() {
        return TablerIconsD2.dragDrop();
    }

    public static Icon dragDropN2() {
        return TablerIconsD2.dragDropN2();
    }

    public static Icon drone() {
        return TablerIconsD2.drone();
    }

    public static Icon droneOff() {
        return TablerIconsD2.droneOff();
    }

    public static Icon dropCircle() {
        return TablerIconsD2.dropCircle();
    }

    public static Icon droplet() {
        return TablerIconsD2.droplet();
    }

    public static Icon dropletBolt() {
        return TablerIconsD2.dropletBolt();
    }

    public static Icon dropletCancel() {
        return TablerIconsD2.dropletCancel();
    }

    public static Icon dropletCheck() {
        return TablerIconsD2.dropletCheck();
    }

    public static Icon dropletCode() {
        return TablerIconsD2.dropletCode();
    }

    public static Icon dropletCog() {
        return TablerIconsD2.dropletCog();
    }

    public static Icon dropletDollar() {
        return TablerIconsD2.dropletDollar();
    }

    public static Icon dropletDown() {
        return TablerIconsD2.dropletDown();
    }

    public static Icon dropletExclamation() {
        return TablerIconsD2.dropletExclamation();
    }

    public static Icon dropletHalf() {
        return TablerIconsD2.dropletHalf();
    }

    public static Icon dropletHalfN2() {
        return TablerIconsD2.dropletHalfN2();
    }

    public static Icon dropletHeart() {
        return TablerIconsD2.dropletHeart();
    }

    public static Icon dropletMinus() {
        return TablerIconsD2.dropletMinus();
    }

    public static Icon dropletOff() {
        return TablerIconsD2.dropletOff();
    }

    public static Icon dropletPause() {
        return TablerIconsD2.dropletPause();
    }

    public static Icon dropletPin() {
        return TablerIconsD2.dropletPin();
    }

    public static Icon dropletPlus() {
        return TablerIconsD2.dropletPlus();
    }

    public static Icon dropletQuestion() {
        return TablerIconsD2.dropletQuestion();
    }

    public static Icon dropletSearch() {
        return TablerIconsD2.dropletSearch();
    }

    public static Icon dropletShare() {
        return TablerIconsD2.dropletShare();
    }

    public static Icon dropletStar() {
        return TablerIconsD2.dropletStar();
    }

    public static Icon dropletUp() {
        return TablerIconsD2.dropletUp();
    }

    public static Icon dropletX() {
        return TablerIconsD2.dropletX();
    }

    public static Icon droplets() {
        return TablerIconsD2.droplets();
    }

    public static Icon dualScreen() {
        return TablerIconsD2.dualScreen();
    }

    public static Icon dumbbell() {
        return TablerIconsD2.dumbbell();
    }

    public static Icon dumpling() {
        return TablerIconsD2.dumpling();
    }

    public static Icon ePassport() {
        return TablerIconsE.ePassport();
    }

    public static Icon ear() {
        return TablerIconsE.ear();
    }

    public static Icon earOff() {
        return TablerIconsE.earOff();
    }

    public static Icon earScan() {
        return TablerIconsE.earScan();
    }

    public static Icon earphoneBluetooth() {
        return TablerIconsE.earphoneBluetooth();
    }

    public static Icon easeIn() {
        return TablerIconsE.easeIn();
    }

    public static Icon easeInControlPoint() {
        return TablerIconsE.easeInControlPoint();
    }

    public static Icon easeInOut() {
        return TablerIconsE.easeInOut();
    }

    public static Icon easeInOutControlPoints() {
        return TablerIconsE.easeInOutControlPoints();
    }

    public static Icon easeOut() {
        return TablerIconsE.easeOut();
    }

    public static Icon easeOutControlPoint() {
        return TablerIconsE.easeOutControlPoint();
    }

    public static Icon edit() {
        return TablerIconsE.edit();
    }

    public static Icon editCircle() {
        return TablerIconsE.editCircle();
    }

    public static Icon editCircleOff() {
        return TablerIconsE.editCircleOff();
    }

    public static Icon editOff() {
        return TablerIconsE.editOff();
    }

    public static Icon egg() {
        return TablerIconsE.egg();
    }

    public static Icon eggCracked() {
        return TablerIconsE.eggCracked();
    }

    public static Icon eggFried() {
        return TablerIconsE.eggFried();
    }

    public static Icon eggOff() {
        return TablerIconsE.eggOff();
    }

    public static Icon eggs() {
        return TablerIconsE.eggs();
    }

    public static Icon elevator() {
        return TablerIconsE.elevator();
    }

    public static Icon elevatorOff() {
        return TablerIconsE.elevatorOff();
    }

    public static Icon emailStamp() {
        return TablerIconsE.emailStamp();
    }

    public static Icon emergencyBed() {
        return TablerIconsE.emergencyBed();
    }

    public static Icon empathize() {
        return TablerIconsE.empathize();
    }

    public static Icon empathizeOff() {
        return TablerIconsE.empathizeOff();
    }

    public static Icon emphasis() {
        return TablerIconsE.emphasis();
    }

    public static Icon engine() {
        return TablerIconsE.engine();
    }

    public static Icon engineOff() {
        return TablerIconsE.engineOff();
    }

    public static Icon equal() {
        return TablerIconsE.equal();
    }

    public static Icon equalDouble() {
        return TablerIconsE.equalDouble();
    }

    public static Icon equalNot() {
        return TablerIconsE.equalNot();
    }

    public static Icon eraser() {
        return TablerIconsE.eraser();
    }

    public static Icon eraserOff() {
        return TablerIconsE.eraserOff();
    }

    public static Icon errorN404() {
        return TablerIconsE.errorN404();
    }

    public static Icon errorN404Off() {
        return TablerIconsE.errorN404Off();
    }

    public static Icon escalator() {
        return TablerIconsE.escalator();
    }

    public static Icon escalatorDown() {
        return TablerIconsE.escalatorDown();
    }

    public static Icon escalatorUp() {
        return TablerIconsE.escalatorUp();
    }

    public static Icon exchange() {
        return TablerIconsE.exchange();
    }

    public static Icon exchangeOff() {
        return TablerIconsE.exchangeOff();
    }

    public static Icon exclamationCircle() {
        return TablerIconsE.exclamationCircle();
    }

    public static Icon exclamationMark() {
        return TablerIconsE.exclamationMark();
    }

    public static Icon exclamationMarkOff() {
        return TablerIconsE.exclamationMarkOff();
    }

    public static Icon exerciseBall() {
        return TablerIconsE.exerciseBall();
    }

    public static Icon explicit() {
        return TablerIconsE.explicit();
    }

    public static Icon explicitOff() {
        return TablerIconsE.explicitOff();
    }

    public static Icon exposure() {
        return TablerIconsE.exposure();
    }

    public static Icon exposureN0() {
        return TablerIconsE.exposureN0();
    }

    public static Icon exposureMinusN1() {
        return TablerIconsE.exposureMinusN1();
    }

    public static Icon exposureMinusN2() {
        return TablerIconsE.exposureMinusN2();
    }

    public static Icon exposureOff() {
        return TablerIconsE.exposureOff();
    }

    public static Icon exposurePlusN1() {
        return TablerIconsE.exposurePlusN1();
    }

    public static Icon exposurePlusN2() {
        return TablerIconsE.exposurePlusN2();
    }

    public static Icon externalLink() {
        return TablerIconsE.externalLink();
    }

    public static Icon externalLinkOff() {
        return TablerIconsE.externalLinkOff();
    }

    public static Icon eye() {
        return TablerIconsE.eye();
    }

    public static Icon eyeBitcoin() {
        return TablerIconsE.eyeBitcoin();
    }

    public static Icon eyeBolt() {
        return TablerIconsE.eyeBolt();
    }

    public static Icon eyeCancel() {
        return TablerIconsE.eyeCancel();
    }

    public static Icon eyeCheck() {
        return TablerIconsE.eyeCheck();
    }

    public static Icon eyeClosed() {
        return TablerIconsE.eyeClosed();
    }

    public static Icon eyeCode() {
        return TablerIconsE.eyeCode();
    }

    public static Icon eyeCog() {
        return TablerIconsE.eyeCog();
    }

    public static Icon eyeDiscount() {
        return TablerIconsE.eyeDiscount();
    }

    public static Icon eyeDollar() {
        return TablerIconsE.eyeDollar();
    }

    public static Icon eyeDotted() {
        return TablerIconsE.eyeDotted();
    }

    public static Icon eyeDown() {
        return TablerIconsE.eyeDown();
    }

    public static Icon eyeEdit() {
        return TablerIconsE.eyeEdit();
    }

    public static Icon eyeExclamation() {
        return TablerIconsE.eyeExclamation();
    }

    public static Icon eyeHeart() {
        return TablerIconsE.eyeHeart();
    }

    public static Icon eyeMinus() {
        return TablerIconsE.eyeMinus();
    }

    public static Icon eyeOff() {
        return TablerIconsE.eyeOff();
    }

    public static Icon eyePause() {
        return TablerIconsE.eyePause();
    }

    public static Icon eyePin() {
        return TablerIconsE.eyePin();
    }

    public static Icon eyePlus() {
        return TablerIconsE.eyePlus();
    }

    public static Icon eyeQuestion() {
        return TablerIconsE.eyeQuestion();
    }

    public static Icon eyeSearch() {
        return TablerIconsE.eyeSearch();
    }

    public static Icon eyeShare() {
        return TablerIconsE.eyeShare();
    }

    public static Icon eyeSpark() {
        return TablerIconsE.eyeSpark();
    }

    public static Icon eyeStar() {
        return TablerIconsE.eyeStar();
    }

    public static Icon eyeTable() {
        return TablerIconsE.eyeTable();
    }

    public static Icon eyeUp() {
        return TablerIconsE.eyeUp();
    }

    public static Icon eyeX() {
        return TablerIconsE.eyeX();
    }

    public static Icon eyeglass() {
        return TablerIconsE.eyeglass();
    }

    public static Icon eyeglassN2() {
        return TablerIconsE.eyeglassN2();
    }

    public static Icon eyeglassOff() {
        return TablerIconsE.eyeglassOff();
    }

    public static Icon faceId() {
        return TablerIconsF1.faceId();
    }

    public static Icon faceIdError() {
        return TablerIconsF1.faceIdError();
    }

    public static Icon faceMask() {
        return TablerIconsF1.faceMask();
    }

    public static Icon faceMaskOff() {
        return TablerIconsF1.faceMaskOff();
    }

    public static Icon fall() {
        return TablerIconsF1.fall();
    }

    public static Icon favicon() {
        return TablerIconsF1.favicon();
    }

    public static Icon feather() {
        return TablerIconsF1.feather();
    }

    public static Icon featherOff() {
        return TablerIconsF1.featherOff();
    }

    public static Icon fence() {
        return TablerIconsF1.fence();
    }

    public static Icon fenceOff() {
        return TablerIconsF1.fenceOff();
    }

    public static Icon ferry() {
        return TablerIconsF1.ferry();
    }

    public static Icon fidgetSpinner() {
        return TablerIconsF1.fidgetSpinner();
    }

    public static Icon file() {
        return TablerIconsF1.file();
    }

    public static Icon file3d() {
        return TablerIconsF1.file3d();
    }

    public static Icon fileAi() {
        return TablerIconsF1.fileAi();
    }

    public static Icon fileAlert() {
        return TablerIconsF1.fileAlert();
    }

    public static Icon fileAnalytics() {
        return TablerIconsF1.fileAnalytics();
    }

    public static Icon fileArrowLeft() {
        return TablerIconsF1.fileArrowLeft();
    }

    public static Icon fileArrowRight() {
        return TablerIconsF1.fileArrowRight();
    }

    public static Icon fileBarcode() {
        return TablerIconsF1.fileBarcode();
    }

    public static Icon fileBitcoin() {
        return TablerIconsF1.fileBitcoin();
    }

    public static Icon fileBroken() {
        return TablerIconsF1.fileBroken();
    }

    public static Icon fileCertificate() {
        return TablerIconsF1.fileCertificate();
    }

    public static Icon fileChart() {
        return TablerIconsF1.fileChart();
    }

    public static Icon fileCheck() {
        return TablerIconsF1.fileCheck();
    }

    public static Icon fileCode() {
        return TablerIconsF1.fileCode();
    }

    public static Icon fileCodeN2() {
        return TablerIconsF1.fileCodeN2();
    }

    public static Icon fileCv() {
        return TablerIconsF1.fileCv();
    }

    public static Icon fileDatabase() {
        return TablerIconsF1.fileDatabase();
    }

    public static Icon fileDelta() {
        return TablerIconsF1.fileDelta();
    }

    public static Icon fileDescription() {
        return TablerIconsF1.fileDescription();
    }

    public static Icon fileDiff() {
        return TablerIconsF1.fileDiff();
    }

    public static Icon fileDigit() {
        return TablerIconsF1.fileDigit();
    }

    public static Icon fileDislike() {
        return TablerIconsF1.fileDislike();
    }

    public static Icon fileDollar() {
        return TablerIconsF1.fileDollar();
    }

    public static Icon fileDots() {
        return TablerIconsF1.fileDots();
    }

    public static Icon fileDownload() {
        return TablerIconsF1.fileDownload();
    }

    public static Icon fileEuro() {
        return TablerIconsF1.fileEuro();
    }

    public static Icon fileExcel() {
        return TablerIconsF1.fileExcel();
    }

    public static Icon fileExport() {
        return TablerIconsF1.fileExport();
    }

    public static Icon fileFunction() {
        return TablerIconsF1.fileFunction();
    }

    public static Icon fileHorizontal() {
        return TablerIconsF1.fileHorizontal();
    }

    public static Icon fileImport() {
        return TablerIconsF1.fileImport();
    }

    public static Icon fileInfinity() {
        return TablerIconsF1.fileInfinity();
    }

    public static Icon fileInfo() {
        return TablerIconsF1.fileInfo();
    }

    public static Icon fileInvoice() {
        return TablerIconsF1.fileInvoice();
    }

    public static Icon fileIsr() {
        return TablerIconsF1.fileIsr();
    }

    public static Icon fileLambda() {
        return TablerIconsF1.fileLambda();
    }

    public static Icon fileLike() {
        return TablerIconsF1.fileLike();
    }

    public static Icon fileMinus() {
        return TablerIconsF1.fileMinus();
    }

    public static Icon fileMusic() {
        return TablerIconsF1.fileMusic();
    }

    public static Icon fileNeutral() {
        return TablerIconsF1.fileNeutral();
    }

    public static Icon fileOff() {
        return TablerIconsF1.fileOff();
    }

    public static Icon fileOrientation() {
        return TablerIconsF1.fileOrientation();
    }

    public static Icon filePencil() {
        return TablerIconsF1.filePencil();
    }

    public static Icon filePercent() {
        return TablerIconsF1.filePercent();
    }

    public static Icon filePhone() {
        return TablerIconsF1.filePhone();
    }

    public static Icon filePlus() {
        return TablerIconsF1.filePlus();
    }

    public static Icon filePower() {
        return TablerIconsF1.filePower();
    }

    public static Icon fileReport() {
        return TablerIconsF1.fileReport();
    }

    public static Icon fileRss() {
        return TablerIconsF1.fileRss();
    }

    public static Icon fileSad() {
        return TablerIconsF1.fileSad();
    }

    public static Icon fileScissors() {
        return TablerIconsF1.fileScissors();
    }

    public static Icon fileSearch() {
        return TablerIconsF1.fileSearch();
    }

    public static Icon fileSettings() {
        return TablerIconsF1.fileSettings();
    }

    public static Icon fileShredder() {
        return TablerIconsF1.fileShredder();
    }

    public static Icon fileSignal() {
        return TablerIconsF1.fileSignal();
    }

    public static Icon fileSmile() {
        return TablerIconsF1.fileSmile();
    }

    public static Icon fileSpark() {
        return TablerIconsF1.fileSpark();
    }

    public static Icon fileSpreadsheet() {
        return TablerIconsF1.fileSpreadsheet();
    }

    public static Icon fileStack() {
        return TablerIconsF1.fileStack();
    }

    public static Icon fileStar() {
        return TablerIconsF1.fileStar();
    }

    public static Icon fileSymlink() {
        return TablerIconsF1.fileSymlink();
    }

    public static Icon fileText() {
        return TablerIconsF1.fileText();
    }

    public static Icon fileTextAi() {
        return TablerIconsF1.fileTextAi();
    }

    public static Icon fileTextShield() {
        return TablerIconsF1.fileTextShield();
    }

    public static Icon fileTextSpark() {
        return TablerIconsF1.fileTextSpark();
    }

    public static Icon fileTime() {
        return TablerIconsF1.fileTime();
    }

    public static Icon fileTypeBmp() {
        return TablerIconsF1.fileTypeBmp();
    }

    public static Icon fileTypeCss() {
        return TablerIconsF1.fileTypeCss();
    }

    public static Icon fileTypeCsv() {
        return TablerIconsF1.fileTypeCsv();
    }

    public static Icon fileTypeDoc() {
        return TablerIconsF1.fileTypeDoc();
    }

    public static Icon fileTypeDocx() {
        return TablerIconsF1.fileTypeDocx();
    }

    public static Icon fileTypeHtml() {
        return TablerIconsF1.fileTypeHtml();
    }

    public static Icon fileTypeJpg() {
        return TablerIconsF1.fileTypeJpg();
    }

    public static Icon fileTypeJs() {
        return TablerIconsF1.fileTypeJs();
    }

    public static Icon fileTypeJsx() {
        return TablerIconsF1.fileTypeJsx();
    }

    public static Icon fileTypePdf() {
        return TablerIconsF1.fileTypePdf();
    }

    public static Icon fileTypePhp() {
        return TablerIconsF1.fileTypePhp();
    }

    public static Icon fileTypePng() {
        return TablerIconsF1.fileTypePng();
    }

    public static Icon fileTypePpt() {
        return TablerIconsF1.fileTypePpt();
    }

    public static Icon fileTypeRs() {
        return TablerIconsF1.fileTypeRs();
    }

    public static Icon fileTypeSql() {
        return TablerIconsF1.fileTypeSql();
    }

    public static Icon fileTypeSvg() {
        return TablerIconsF1.fileTypeSvg();
    }

    public static Icon fileTypeTs() {
        return TablerIconsF1.fileTypeTs();
    }

    public static Icon fileTypeTsx() {
        return TablerIconsF1.fileTypeTsx();
    }

    public static Icon fileTypeTxt() {
        return TablerIconsF1.fileTypeTxt();
    }

    public static Icon fileTypeVue() {
        return TablerIconsF1.fileTypeVue();
    }

    public static Icon fileTypeXls() {
        return TablerIconsF1.fileTypeXls();
    }

    public static Icon fileTypeXml() {
        return TablerIconsF1.fileTypeXml();
    }

    public static Icon fileTypeZip() {
        return TablerIconsF1.fileTypeZip();
    }

    public static Icon fileTypography() {
        return TablerIconsF1.fileTypography();
    }

    public static Icon fileUnknown() {
        return TablerIconsF1.fileUnknown();
    }

    public static Icon fileUpload() {
        return TablerIconsF1.fileUpload();
    }

    public static Icon fileVector() {
        return TablerIconsF1.fileVector();
    }

    public static Icon fileWord() {
        return TablerIconsF1.fileWord();
    }

    public static Icon fileX() {
        return TablerIconsF1.fileX();
    }

    public static Icon fileZip() {
        return TablerIconsF1.fileZip();
    }

    public static Icon files() {
        return TablerIconsF1.files();
    }

    public static Icon filesOff() {
        return TablerIconsF1.filesOff();
    }

    public static Icon filter() {
        return TablerIconsF1.filter();
    }

    public static Icon filterN2() {
        return TablerIconsF1.filterN2();
    }

    public static Icon filterN2Bolt() {
        return TablerIconsF1.filterN2Bolt();
    }

    public static Icon filterN2Cancel() {
        return TablerIconsF1.filterN2Cancel();
    }

    public static Icon filterN2Check() {
        return TablerIconsF1.filterN2Check();
    }

    public static Icon filterN2Code() {
        return TablerIconsF1.filterN2Code();
    }

    public static Icon filterN2Cog() {
        return TablerIconsF1.filterN2Cog();
    }

    public static Icon filterN2Discount() {
        return TablerIconsF1.filterN2Discount();
    }

    public static Icon filterN2Dollar() {
        return TablerIconsF1.filterN2Dollar();
    }

    public static Icon filterN2Down() {
        return TablerIconsF1.filterN2Down();
    }

    public static Icon filterN2Edit() {
        return TablerIconsF1.filterN2Edit();
    }

    public static Icon filterN2Exclamation() {
        return TablerIconsF1.filterN2Exclamation();
    }

    public static Icon filterN2Minus() {
        return TablerIconsF1.filterN2Minus();
    }

    public static Icon filterN2Pause() {
        return TablerIconsF1.filterN2Pause();
    }

    public static Icon filterN2Pin() {
        return TablerIconsF1.filterN2Pin();
    }

    public static Icon filterN2Plus() {
        return TablerIconsF1.filterN2Plus();
    }

    public static Icon filterN2Question() {
        return TablerIconsF1.filterN2Question();
    }

    public static Icon filterN2Search() {
        return TablerIconsF1.filterN2Search();
    }

    public static Icon filterN2Share() {
        return TablerIconsF1.filterN2Share();
    }

    public static Icon filterN2Spark() {
        return TablerIconsF1.filterN2Spark();
    }

    public static Icon filterN2Up() {
        return TablerIconsF1.filterN2Up();
    }

    public static Icon filterN2X() {
        return TablerIconsF1.filterN2X();
    }

    public static Icon filterBolt() {
        return TablerIconsF1.filterBolt();
    }

    public static Icon filterCancel() {
        return TablerIconsF1.filterCancel();
    }

    public static Icon filterCheck() {
        return TablerIconsF1.filterCheck();
    }

    public static Icon filterCode() {
        return TablerIconsF1.filterCode();
    }

    public static Icon filterCog() {
        return TablerIconsF1.filterCog();
    }

    public static Icon filterDiscount() {
        return TablerIconsF1.filterDiscount();
    }

    public static Icon filterDollar() {
        return TablerIconsF1.filterDollar();
    }

    public static Icon filterDown() {
        return TablerIconsF1.filterDown();
    }

    public static Icon filterEdit() {
        return TablerIconsF1.filterEdit();
    }

    public static Icon filterExclamation() {
        return TablerIconsF1.filterExclamation();
    }

    public static Icon filterHeart() {
        return TablerIconsF1.filterHeart();
    }

    public static Icon filterMinus() {
        return TablerIconsF1.filterMinus();
    }

    public static Icon filterOff() {
        return TablerIconsF1.filterOff();
    }

    public static Icon filterPause() {
        return TablerIconsF1.filterPause();
    }

    public static Icon filterPin() {
        return TablerIconsF1.filterPin();
    }

    public static Icon filterPlus() {
        return TablerIconsF1.filterPlus();
    }

    public static Icon filterQuestion() {
        return TablerIconsF1.filterQuestion();
    }

    public static Icon filterSearch() {
        return TablerIconsF1.filterSearch();
    }

    public static Icon filterShare() {
        return TablerIconsF1.filterShare();
    }

    public static Icon filterSpark() {
        return TablerIconsF1.filterSpark();
    }

    public static Icon filterStar() {
        return TablerIconsF1.filterStar();
    }

    public static Icon filterUp() {
        return TablerIconsF1.filterUp();
    }

    public static Icon filterX() {
        return TablerIconsF1.filterX();
    }

    public static Icon filters() {
        return TablerIconsF1.filters();
    }

    public static Icon fingerprint() {
        return TablerIconsF1.fingerprint();
    }

    public static Icon fingerprintOff() {
        return TablerIconsF1.fingerprintOff();
    }

    public static Icon fingerprintScan() {
        return TablerIconsF1.fingerprintScan();
    }

    public static Icon fireExtinguisher() {
        return TablerIconsF1.fireExtinguisher();
    }

    public static Icon fireHydrant() {
        return TablerIconsF1.fireHydrant();
    }

    public static Icon fireHydrantOff() {
        return TablerIconsF1.fireHydrantOff();
    }

    public static Icon firetruck() {
        return TablerIconsF1.firetruck();
    }

    public static Icon firewallCheck() {
        return TablerIconsF1.firewallCheck();
    }

    public static Icon firewallFlame() {
        return TablerIconsF1.firewallFlame();
    }

    public static Icon firstAidKit() {
        return TablerIconsF1.firstAidKit();
    }

    public static Icon firstAidKitOff() {
        return TablerIconsF1.firstAidKitOff();
    }

    public static Icon fish() {
        return TablerIconsF1.fish();
    }

    public static Icon fishBone() {
        return TablerIconsF1.fishBone();
    }

    public static Icon fishChristianity() {
        return TablerIconsF1.fishChristianity();
    }

    public static Icon fishHook() {
        return TablerIconsF1.fishHook();
    }

    public static Icon fishHookOff() {
        return TablerIconsF1.fishHookOff();
    }

    public static Icon fishOff() {
        return TablerIconsF1.fishOff();
    }

    public static Icon flag() {
        return TablerIconsF1.flag();
    }

    public static Icon flagN2() {
        return TablerIconsF1.flagN2();
    }

    public static Icon flagN2Off() {
        return TablerIconsF1.flagN2Off();
    }

    public static Icon flagN3() {
        return TablerIconsF1.flagN3();
    }

    public static Icon flagBitcoin() {
        return TablerIconsF1.flagBitcoin();
    }

    public static Icon flagBolt() {
        return TablerIconsF1.flagBolt();
    }

    public static Icon flagCancel() {
        return TablerIconsF1.flagCancel();
    }

    public static Icon flagCheck() {
        return TablerIconsF2.flagCheck();
    }

    public static Icon flagCode() {
        return TablerIconsF2.flagCode();
    }

    public static Icon flagCog() {
        return TablerIconsF2.flagCog();
    }

    public static Icon flagDiscount() {
        return TablerIconsF2.flagDiscount();
    }

    public static Icon flagDollar() {
        return TablerIconsF2.flagDollar();
    }

    public static Icon flagDown() {
        return TablerIconsF2.flagDown();
    }

    public static Icon flagExclamation() {
        return TablerIconsF2.flagExclamation();
    }

    public static Icon flagHeart() {
        return TablerIconsF2.flagHeart();
    }

    public static Icon flagMinus() {
        return TablerIconsF2.flagMinus();
    }

    public static Icon flagOff() {
        return TablerIconsF2.flagOff();
    }

    public static Icon flagPause() {
        return TablerIconsF2.flagPause();
    }

    public static Icon flagPin() {
        return TablerIconsF2.flagPin();
    }

    public static Icon flagPlus() {
        return TablerIconsF2.flagPlus();
    }

    public static Icon flagQuestion() {
        return TablerIconsF2.flagQuestion();
    }

    public static Icon flagSearch() {
        return TablerIconsF2.flagSearch();
    }

    public static Icon flagShare() {
        return TablerIconsF2.flagShare();
    }

    public static Icon flagSpark() {
        return TablerIconsF2.flagSpark();
    }

    public static Icon flagStar() {
        return TablerIconsF2.flagStar();
    }

    public static Icon flagUp() {
        return TablerIconsF2.flagUp();
    }

    public static Icon flagX() {
        return TablerIconsF2.flagX();
    }

    public static Icon flame() {
        return TablerIconsF2.flame();
    }

    public static Icon flameOff() {
        return TablerIconsF2.flameOff();
    }

    public static Icon flare() {
        return TablerIconsF2.flare();
    }

    public static Icon flask() {
        return TablerIconsF2.flask();
    }

    public static Icon flaskN2() {
        return TablerIconsF2.flaskN2();
    }

    public static Icon flaskN2Off() {
        return TablerIconsF2.flaskN2Off();
    }

    public static Icon flaskOff() {
        return TablerIconsF2.flaskOff();
    }

    public static Icon flipFlops() {
        return TablerIconsF2.flipFlops();
    }

    public static Icon flipHorizontal() {
        return TablerIconsF2.flipHorizontal();
    }

    public static Icon flipVertical() {
        return TablerIconsF2.flipVertical();
    }

    public static Icon floatCenter() {
        return TablerIconsF2.floatCenter();
    }

    public static Icon floatLeft() {
        return TablerIconsF2.floatLeft();
    }

    public static Icon floatNone() {
        return TablerIconsF2.floatNone();
    }

    public static Icon floatRight() {
        return TablerIconsF2.floatRight();
    }

    public static Icon flood() {
        return TablerIconsF2.flood();
    }

    public static Icon flower() {
        return TablerIconsF2.flower();
    }

    public static Icon flowerOff() {
        return TablerIconsF2.flowerOff();
    }

    public static Icon focus() {
        return TablerIconsF2.focus();
    }

    public static Icon focusN2() {
        return TablerIconsF2.focusN2();
    }

    public static Icon focusAuto() {
        return TablerIconsF2.focusAuto();
    }

    public static Icon focusCentered() {
        return TablerIconsF2.focusCentered();
    }

    public static Icon fold() {
        return TablerIconsF2.fold();
    }

    public static Icon foldDown() {
        return TablerIconsF2.foldDown();
    }

    public static Icon foldUp() {
        return TablerIconsF2.foldUp();
    }

    public static Icon folder() {
        return TablerIconsF2.folder();
    }

    public static Icon folderBolt() {
        return TablerIconsF2.folderBolt();
    }

    public static Icon folderCancel() {
        return TablerIconsF2.folderCancel();
    }

    public static Icon folderCheck() {
        return TablerIconsF2.folderCheck();
    }

    public static Icon folderCode() {
        return TablerIconsF2.folderCode();
    }

    public static Icon folderCog() {
        return TablerIconsF2.folderCog();
    }

    public static Icon folderDollar() {
        return TablerIconsF2.folderDollar();
    }

    public static Icon folderDown() {
        return TablerIconsF2.folderDown();
    }

    public static Icon folderExclamation() {
        return TablerIconsF2.folderExclamation();
    }

    public static Icon folderHeart() {
        return TablerIconsF2.folderHeart();
    }

    public static Icon folderMinus() {
        return TablerIconsF2.folderMinus();
    }

    public static Icon folderOff() {
        return TablerIconsF2.folderOff();
    }

    public static Icon folderOpen() {
        return TablerIconsF2.folderOpen();
    }

    public static Icon folderPause() {
        return TablerIconsF2.folderPause();
    }

    public static Icon folderPin() {
        return TablerIconsF2.folderPin();
    }

    public static Icon folderPlus() {
        return TablerIconsF2.folderPlus();
    }

    public static Icon folderQuestion() {
        return TablerIconsF2.folderQuestion();
    }

    public static Icon folderRoot() {
        return TablerIconsF2.folderRoot();
    }

    public static Icon folderSearch() {
        return TablerIconsF2.folderSearch();
    }

    public static Icon folderShare() {
        return TablerIconsF2.folderShare();
    }

    public static Icon folderStar() {
        return TablerIconsF2.folderStar();
    }

    public static Icon folderSymlink() {
        return TablerIconsF2.folderSymlink();
    }

    public static Icon folderUp() {
        return TablerIconsF2.folderUp();
    }

    public static Icon folderX() {
        return TablerIconsF2.folderX();
    }

    public static Icon folders() {
        return TablerIconsF2.folders();
    }

    public static Icon foldersOff() {
        return TablerIconsF2.foldersOff();
    }

    public static Icon foodsteps() {
        return TablerIconsF2.foodsteps();
    }

    public static Icon forbid() {
        return TablerIconsF2.forbid();
    }

    public static Icon forbidN2() {
        return TablerIconsF2.forbidN2();
    }

    public static Icon forklift() {
        return TablerIconsF2.forklift();
    }

    public static Icon forms() {
        return TablerIconsF2.forms();
    }

    public static Icon fountain() {
        return TablerIconsF2.fountain();
    }

    public static Icon fountainOff() {
        return TablerIconsF2.fountainOff();
    }

    public static Icon frame() {
        return TablerIconsF2.frame();
    }

    public static Icon frameOff() {
        return TablerIconsF2.frameOff();
    }

    public static Icon freeRights() {
        return TablerIconsF2.freeRights();
    }

    public static Icon freezeColumn() {
        return TablerIconsF2.freezeColumn();
    }

    public static Icon freezeRow() {
        return TablerIconsF2.freezeRow();
    }

    public static Icon freezeRowColumn() {
        return TablerIconsF2.freezeRowColumn();
    }

    public static Icon fridge() {
        return TablerIconsF2.fridge();
    }

    public static Icon fridgeOff() {
        return TablerIconsF2.fridgeOff();
    }

    public static Icon friends() {
        return TablerIconsF2.friends();
    }

    public static Icon friendsOff() {
        return TablerIconsF2.friendsOff();
    }

    public static Icon frustum() {
        return TablerIconsF2.frustum();
    }

    public static Icon frustumOff() {
        return TablerIconsF2.frustumOff();
    }

    public static Icon frustumPlus() {
        return TablerIconsF2.frustumPlus();
    }

    public static Icon function() {
        return TablerIconsF2.function();
    }

    public static Icon functionOff() {
        return TablerIconsF2.functionOff();
    }

    public static Icon galaxy() {
        return TablerIconsG.galaxy();
    }

    public static Icon gardenCart() {
        return TablerIconsG.gardenCart();
    }

    public static Icon gardenCartOff() {
        return TablerIconsG.gardenCartOff();
    }

    public static Icon gasStation() {
        return TablerIconsG.gasStation();
    }

    public static Icon gasStationOff() {
        return TablerIconsG.gasStationOff();
    }

    public static Icon gauge() {
        return TablerIconsG.gauge();
    }

    public static Icon gaugeOff() {
        return TablerIconsG.gaugeOff();
    }

    public static Icon gavel() {
        return TablerIconsG.gavel();
    }

    public static Icon genderAgender() {
        return TablerIconsG.genderAgender();
    }

    public static Icon genderAndrogyne() {
        return TablerIconsG.genderAndrogyne();
    }

    public static Icon genderBigender() {
        return TablerIconsG.genderBigender();
    }

    public static Icon genderDemiboy() {
        return TablerIconsG.genderDemiboy();
    }

    public static Icon genderDemigirl() {
        return TablerIconsG.genderDemigirl();
    }

    public static Icon genderEpicene() {
        return TablerIconsG.genderEpicene();
    }

    public static Icon genderFemale() {
        return TablerIconsG.genderFemale();
    }

    public static Icon genderFemme() {
        return TablerIconsG.genderFemme();
    }

    public static Icon genderGenderfluid() {
        return TablerIconsG.genderGenderfluid();
    }

    public static Icon genderGenderless() {
        return TablerIconsG.genderGenderless();
    }

    public static Icon genderGenderqueer() {
        return TablerIconsG.genderGenderqueer();
    }

    public static Icon genderHermaphrodite() {
        return TablerIconsG.genderHermaphrodite();
    }

    public static Icon genderIntergender() {
        return TablerIconsG.genderIntergender();
    }

    public static Icon genderMale() {
        return TablerIconsG.genderMale();
    }

    public static Icon genderNeutrois() {
        return TablerIconsG.genderNeutrois();
    }

    public static Icon genderThird() {
        return TablerIconsG.genderThird();
    }

    public static Icon genderTransgender() {
        return TablerIconsG.genderTransgender();
    }

    public static Icon genderTrasvesti() {
        return TablerIconsG.genderTrasvesti();
    }

    public static Icon geometry() {
        return TablerIconsG.geometry();
    }

    public static Icon ghost() {
        return TablerIconsG.ghost();
    }

    public static Icon ghostN2() {
        return TablerIconsG.ghostN2();
    }

    public static Icon ghostN3() {
        return TablerIconsG.ghostN3();
    }

    public static Icon ghostOff() {
        return TablerIconsG.ghostOff();
    }

    public static Icon gif() {
        return TablerIconsG.gif();
    }

    public static Icon gift() {
        return TablerIconsG.gift();
    }

    public static Icon giftCard() {
        return TablerIconsG.giftCard();
    }

    public static Icon giftOff() {
        return TablerIconsG.giftOff();
    }

    public static Icon gitBranch() {
        return TablerIconsG.gitBranch();
    }

    public static Icon gitBranchDeleted() {
        return TablerIconsG.gitBranchDeleted();
    }

    public static Icon gitCherryPick() {
        return TablerIconsG.gitCherryPick();
    }

    public static Icon gitCommit() {
        return TablerIconsG.gitCommit();
    }

    public static Icon gitCompare() {
        return TablerIconsG.gitCompare();
    }

    public static Icon gitFork() {
        return TablerIconsG.gitFork();
    }

    public static Icon gitMerge() {
        return TablerIconsG.gitMerge();
    }

    public static Icon gitPullRequest() {
        return TablerIconsG.gitPullRequest();
    }

    public static Icon gitPullRequestClosed() {
        return TablerIconsG.gitPullRequestClosed();
    }

    public static Icon gitPullRequestConflict() {
        return TablerIconsG.gitPullRequestConflict();
    }

    public static Icon gitPullRequestDraft() {
        return TablerIconsG.gitPullRequestDraft();
    }

    public static Icon gizmo() {
        return TablerIconsG.gizmo();
    }

    public static Icon glass() {
        return TablerIconsG.glass();
    }

    public static Icon glassChampagne() {
        return TablerIconsG.glassChampagne();
    }

    public static Icon glassCocktail() {
        return TablerIconsG.glassCocktail();
    }

    public static Icon glassFull() {
        return TablerIconsG.glassFull();
    }

    public static Icon glassGin() {
        return TablerIconsG.glassGin();
    }

    public static Icon glassOff() {
        return TablerIconsG.glassOff();
    }

    public static Icon globe() {
        return TablerIconsG.globe();
    }

    public static Icon globeOff() {
        return TablerIconsG.globeOff();
    }

    public static Icon goGame() {
        return TablerIconsG.goGame();
    }

    public static Icon golf() {
        return TablerIconsG.golf();
    }

    public static Icon golfOff() {
        return TablerIconsG.golfOff();
    }

    public static Icon gps() {
        return TablerIconsG.gps();
    }

    public static Icon gradienter() {
        return TablerIconsG.gradienter();
    }

    public static Icon grain() {
        return TablerIconsG.grain();
    }

    public static Icon grape() {
        return TablerIconsG.grape();
    }

    public static Icon graph() {
        return TablerIconsG.graph();
    }

    public static Icon graphOff() {
        return TablerIconsG.graphOff();
    }

    public static Icon grave() {
        return TablerIconsG.grave();
    }

    public static Icon graveN2() {
        return TablerIconsG.graveN2();
    }

    public static Icon grid3x3() {
        return TablerIconsG.grid3x3();
    }

    public static Icon grid4x4() {
        return TablerIconsG.grid4x4();
    }

    public static Icon gridDots() {
        return TablerIconsG.gridDots();
    }

    public static Icon gridGoldenratio() {
        return TablerIconsG.gridGoldenratio();
    }

    public static Icon gridPattern() {
        return TablerIconsG.gridPattern();
    }

    public static Icon gridScan() {
        return TablerIconsG.gridScan();
    }

    public static Icon grill() {
        return TablerIconsG.grill();
    }

    public static Icon grillFork() {
        return TablerIconsG.grillFork();
    }

    public static Icon grillOff() {
        return TablerIconsG.grillOff();
    }

    public static Icon grillSpatula() {
        return TablerIconsG.grillSpatula();
    }

    public static Icon gripHorizontal() {
        return TablerIconsG.gripHorizontal();
    }

    public static Icon gripVertical() {
        return TablerIconsG.gripVertical();
    }

    public static Icon growth() {
        return TablerIconsG.growth();
    }

    public static Icon guitarPick() {
        return TablerIconsG.guitarPick();
    }

    public static Icon gymnastics() {
        return TablerIconsG.gymnastics();
    }

    public static Icon hN1() {
        return TablerIconsH1.hN1();
    }

    public static Icon hN2() {
        return TablerIconsH1.hN2();
    }

    public static Icon hN3() {
        return TablerIconsH1.hN3();
    }

    public static Icon hN4() {
        return TablerIconsH1.hN4();
    }

    public static Icon hN5() {
        return TablerIconsH1.hN5();
    }

    public static Icon hN6() {
        return TablerIconsH1.hN6();
    }

    public static Icon hammer() {
        return TablerIconsH1.hammer();
    }

    public static Icon hammerDrill() {
        return TablerIconsH1.hammerDrill();
    }

    public static Icon hammerOff() {
        return TablerIconsH1.hammerOff();
    }

    public static Icon handClick() {
        return TablerIconsH1.handClick();
    }

    public static Icon handClickOff() {
        return TablerIconsH1.handClickOff();
    }

    public static Icon handFinger() {
        return TablerIconsH1.handFinger();
    }

    public static Icon handFingerDown() {
        return TablerIconsH1.handFingerDown();
    }

    public static Icon handFingerLeft() {
        return TablerIconsH1.handFingerLeft();
    }

    public static Icon handFingerOff() {
        return TablerIconsH1.handFingerOff();
    }

    public static Icon handFingerRight() {
        return TablerIconsH1.handFingerRight();
    }

    public static Icon handGrab() {
        return TablerIconsH1.handGrab();
    }

    public static Icon handLittleFinger() {
        return TablerIconsH1.handLittleFinger();
    }

    public static Icon handLoveYou() {
        return TablerIconsH1.handLoveYou();
    }

    public static Icon handMiddleFinger() {
        return TablerIconsH1.handMiddleFinger();
    }

    public static Icon handMove() {
        return TablerIconsH1.handMove();
    }

    public static Icon handOff() {
        return TablerIconsH1.handOff();
    }

    public static Icon handRingFinger() {
        return TablerIconsH1.handRingFinger();
    }

    public static Icon handSanitizer() {
        return TablerIconsH1.handSanitizer();
    }

    public static Icon handStop() {
        return TablerIconsH1.handStop();
    }

    public static Icon handThreeFingers() {
        return TablerIconsH1.handThreeFingers();
    }

    public static Icon handTwoFingers() {
        return TablerIconsH1.handTwoFingers();
    }

    public static Icon hanger() {
        return TablerIconsH1.hanger();
    }

    public static Icon hangerN2() {
        return TablerIconsH1.hangerN2();
    }

    public static Icon hangerOff() {
        return TablerIconsH1.hangerOff();
    }

    public static Icon hash() {
        return TablerIconsH1.hash();
    }

    public static Icon haze() {
        return TablerIconsH1.haze();
    }

    public static Icon hazeMoon() {
        return TablerIconsH1.hazeMoon();
    }

    public static Icon hdr() {
        return TablerIconsH1.hdr();
    }

    public static Icon heading() {
        return TablerIconsH1.heading();
    }

    public static Icon headingOff() {
        return TablerIconsH1.headingOff();
    }

    public static Icon headphones() {
        return TablerIconsH1.headphones();
    }

    public static Icon headphonesOff() {
        return TablerIconsH1.headphonesOff();
    }

    public static Icon headset() {
        return TablerIconsH1.headset();
    }

    public static Icon headsetOff() {
        return TablerIconsH1.headsetOff();
    }

    public static Icon healthRecognition() {
        return TablerIconsH1.healthRecognition();
    }

    public static Icon heart() {
        return TablerIconsH1.heart();
    }

    public static Icon heartBitcoin() {
        return TablerIconsH1.heartBitcoin();
    }

    public static Icon heartBolt() {
        return TablerIconsH1.heartBolt();
    }

    public static Icon heartBroken() {
        return TablerIconsH1.heartBroken();
    }

    public static Icon heartCancel() {
        return TablerIconsH1.heartCancel();
    }

    public static Icon heartCheck() {
        return TablerIconsH1.heartCheck();
    }

    public static Icon heartCode() {
        return TablerIconsH1.heartCode();
    }

    public static Icon heartCog() {
        return TablerIconsH1.heartCog();
    }

    public static Icon heartDiscount() {
        return TablerIconsH1.heartDiscount();
    }

    public static Icon heartDollar() {
        return TablerIconsH1.heartDollar();
    }

    public static Icon heartDown() {
        return TablerIconsH1.heartDown();
    }

    public static Icon heartExclamation() {
        return TablerIconsH1.heartExclamation();
    }

    public static Icon heartHandshake() {
        return TablerIconsH1.heartHandshake();
    }

    public static Icon heartMinus() {
        return TablerIconsH1.heartMinus();
    }

    public static Icon heartOff() {
        return TablerIconsH1.heartOff();
    }

    public static Icon heartPause() {
        return TablerIconsH1.heartPause();
    }

    public static Icon heartPin() {
        return TablerIconsH1.heartPin();
    }

    public static Icon heartPlus() {
        return TablerIconsH1.heartPlus();
    }

    public static Icon heartQuestion() {
        return TablerIconsH1.heartQuestion();
    }

    public static Icon heartRateMonitor() {
        return TablerIconsH1.heartRateMonitor();
    }

    public static Icon heartSearch() {
        return TablerIconsH1.heartSearch();
    }

    public static Icon heartShare() {
        return TablerIconsH1.heartShare();
    }

    public static Icon heartSpark() {
        return TablerIconsH1.heartSpark();
    }

    public static Icon heartStar() {
        return TablerIconsH1.heartStar();
    }

    public static Icon heartUp() {
        return TablerIconsH1.heartUp();
    }

    public static Icon heartX() {
        return TablerIconsH1.heartX();
    }

    public static Icon heartbeat() {
        return TablerIconsH1.heartbeat();
    }

    public static Icon hearts() {
        return TablerIconsH1.hearts();
    }

    public static Icon heartsOff() {
        return TablerIconsH1.heartsOff();
    }

    public static Icon helicopter() {
        return TablerIconsH1.helicopter();
    }

    public static Icon helicopterLanding() {
        return TablerIconsH1.helicopterLanding();
    }

    public static Icon helmet() {
        return TablerIconsH1.helmet();
    }

    public static Icon helmetOff() {
        return TablerIconsH1.helmetOff();
    }

    public static Icon help() {
        return TablerIconsH1.help();
    }

    public static Icon helpCircle() {
        return TablerIconsH1.helpCircle();
    }

    public static Icon helpHexagon() {
        return TablerIconsH1.helpHexagon();
    }

    public static Icon helpOctagon() {
        return TablerIconsH1.helpOctagon();
    }

    public static Icon helpOff() {
        return TablerIconsH1.helpOff();
    }

    public static Icon helpSmall() {
        return TablerIconsH1.helpSmall();
    }

    public static Icon helpSquare() {
        return TablerIconsH1.helpSquare();
    }

    public static Icon helpSquareRounded() {
        return TablerIconsH1.helpSquareRounded();
    }

    public static Icon helpTriangle() {
        return TablerIconsH1.helpTriangle();
    }

    public static Icon hemisphere() {
        return TablerIconsH1.hemisphere();
    }

    public static Icon hemisphereOff() {
        return TablerIconsH1.hemisphereOff();
    }

    public static Icon hemispherePlus() {
        return TablerIconsH1.hemispherePlus();
    }

    public static Icon hexagon() {
        return TablerIconsH1.hexagon();
    }

    public static Icon hexagon3d() {
        return TablerIconsH1.hexagon3d();
    }

    public static Icon hexagonAsterisk() {
        return TablerIconsH1.hexagonAsterisk();
    }

    public static Icon hexagonLetterA() {
        return TablerIconsH1.hexagonLetterA();
    }

    public static Icon hexagonLetterB() {
        return TablerIconsH1.hexagonLetterB();
    }

    public static Icon hexagonLetterC() {
        return TablerIconsH1.hexagonLetterC();
    }

    public static Icon hexagonLetterD() {
        return TablerIconsH1.hexagonLetterD();
    }

    public static Icon hexagonLetterE() {
        return TablerIconsH1.hexagonLetterE();
    }

    public static Icon hexagonLetterF() {
        return TablerIconsH1.hexagonLetterF();
    }

    public static Icon hexagonLetterG() {
        return TablerIconsH1.hexagonLetterG();
    }

    public static Icon hexagonLetterH() {
        return TablerIconsH1.hexagonLetterH();
    }

    public static Icon hexagonLetterI() {
        return TablerIconsH1.hexagonLetterI();
    }

    public static Icon hexagonLetterJ() {
        return TablerIconsH1.hexagonLetterJ();
    }

    public static Icon hexagonLetterK() {
        return TablerIconsH1.hexagonLetterK();
    }

    public static Icon hexagonLetterL() {
        return TablerIconsH1.hexagonLetterL();
    }

    public static Icon hexagonLetterM() {
        return TablerIconsH1.hexagonLetterM();
    }

    public static Icon hexagonLetterN() {
        return TablerIconsH1.hexagonLetterN();
    }

    public static Icon hexagonLetterO() {
        return TablerIconsH1.hexagonLetterO();
    }

    public static Icon hexagonLetterP() {
        return TablerIconsH1.hexagonLetterP();
    }

    public static Icon hexagonLetterQ() {
        return TablerIconsH1.hexagonLetterQ();
    }

    public static Icon hexagonLetterR() {
        return TablerIconsH1.hexagonLetterR();
    }

    public static Icon hexagonLetterS() {
        return TablerIconsH1.hexagonLetterS();
    }

    public static Icon hexagonLetterT() {
        return TablerIconsH1.hexagonLetterT();
    }

    public static Icon hexagonLetterU() {
        return TablerIconsH1.hexagonLetterU();
    }

    public static Icon hexagonLetterV() {
        return TablerIconsH1.hexagonLetterV();
    }

    public static Icon hexagonLetterW() {
        return TablerIconsH1.hexagonLetterW();
    }

    public static Icon hexagonLetterX() {
        return TablerIconsH1.hexagonLetterX();
    }

    public static Icon hexagonLetterY() {
        return TablerIconsH1.hexagonLetterY();
    }

    public static Icon hexagonLetterZ() {
        return TablerIconsH1.hexagonLetterZ();
    }

    public static Icon hexagonMinus() {
        return TablerIconsH1.hexagonMinus();
    }

    public static Icon hexagonMinusN2() {
        return TablerIconsH1.hexagonMinusN2();
    }

    public static Icon hexagonNumberN0() {
        return TablerIconsH1.hexagonNumberN0();
    }

    public static Icon hexagonNumberN1() {
        return TablerIconsH1.hexagonNumberN1();
    }

    public static Icon hexagonNumberN2() {
        return TablerIconsH1.hexagonNumberN2();
    }

    public static Icon hexagonNumberN3() {
        return TablerIconsH1.hexagonNumberN3();
    }

    public static Icon hexagonNumberN4() {
        return TablerIconsH1.hexagonNumberN4();
    }

    public static Icon hexagonNumberN5() {
        return TablerIconsH1.hexagonNumberN5();
    }

    public static Icon hexagonNumberN6() {
        return TablerIconsH1.hexagonNumberN6();
    }

    public static Icon hexagonNumberN7() {
        return TablerIconsH1.hexagonNumberN7();
    }

    public static Icon hexagonNumberN8() {
        return TablerIconsH1.hexagonNumberN8();
    }

    public static Icon hexagonNumberN9() {
        return TablerIconsH1.hexagonNumberN9();
    }

    public static Icon hexagonOff() {
        return TablerIconsH1.hexagonOff();
    }

    public static Icon hexagonPlus() {
        return TablerIconsH1.hexagonPlus();
    }

    public static Icon hexagonPlusN2() {
        return TablerIconsH1.hexagonPlusN2();
    }

    public static Icon hexagonalPrism() {
        return TablerIconsH1.hexagonalPrism();
    }

    public static Icon hexagonalPrismOff() {
        return TablerIconsH1.hexagonalPrismOff();
    }

    public static Icon hexagonalPrismPlus() {
        return TablerIconsH1.hexagonalPrismPlus();
    }

    public static Icon hexagonalPyramid() {
        return TablerIconsH1.hexagonalPyramid();
    }

    public static Icon hexagonalPyramidOff() {
        return TablerIconsH1.hexagonalPyramidOff();
    }

    public static Icon hexagonalPyramidPlus() {
        return TablerIconsH1.hexagonalPyramidPlus();
    }

    public static Icon hexagons() {
        return TablerIconsH1.hexagons();
    }

    public static Icon hexagonsOff() {
        return TablerIconsH1.hexagonsOff();
    }

    public static Icon hierarchy() {
        return TablerIconsH1.hierarchy();
    }

    public static Icon hierarchyN2() {
        return TablerIconsH1.hierarchyN2();
    }

    public static Icon hierarchyN3() {
        return TablerIconsH1.hierarchyN3();
    }

    public static Icon hierarchyOff() {
        return TablerIconsH1.hierarchyOff();
    }

    public static Icon highlight() {
        return TablerIconsH1.highlight();
    }

    public static Icon highlightOff() {
        return TablerIconsH1.highlightOff();
    }

    public static Icon history() {
        return TablerIconsH1.history();
    }

    public static Icon historyOff() {
        return TablerIconsH1.historyOff();
    }

    public static Icon historyToggle() {
        return TablerIconsH1.historyToggle();
    }

    public static Icon home() {
        return TablerIconsH1.home();
    }

    public static Icon homeN2() {
        return TablerIconsH1.homeN2();
    }

    public static Icon homeBitcoin() {
        return TablerIconsH1.homeBitcoin();
    }

    public static Icon homeBolt() {
        return TablerIconsH1.homeBolt();
    }

    public static Icon homeCancel() {
        return TablerIconsH1.homeCancel();
    }

    public static Icon homeCheck() {
        return TablerIconsH1.homeCheck();
    }

    public static Icon homeCog() {
        return TablerIconsH1.homeCog();
    }

    public static Icon homeDollar() {
        return TablerIconsH1.homeDollar();
    }

    public static Icon homeDot() {
        return TablerIconsH1.homeDot();
    }

    public static Icon homeDown() {
        return TablerIconsH1.homeDown();
    }

    public static Icon homeEco() {
        return TablerIconsH1.homeEco();
    }

    public static Icon homeEdit() {
        return TablerIconsH1.homeEdit();
    }

    public static Icon homeExclamation() {
        return TablerIconsH1.homeExclamation();
    }

    public static Icon homeHand() {
        return TablerIconsH1.homeHand();
    }

    public static Icon homeHeart() {
        return TablerIconsH1.homeHeart();
    }

    public static Icon homeInfinity() {
        return TablerIconsH1.homeInfinity();
    }

    public static Icon homeLink() {
        return TablerIconsH1.homeLink();
    }

    public static Icon homeLock() {
        return TablerIconsH1.homeLock();
    }

    public static Icon homeMinus() {
        return TablerIconsH1.homeMinus();
    }

    public static Icon homeMove() {
        return TablerIconsH1.homeMove();
    }

    public static Icon homeOff() {
        return TablerIconsH1.homeOff();
    }

    public static Icon homePlus() {
        return TablerIconsH1.homePlus();
    }

    public static Icon homeQuestion() {
        return TablerIconsH1.homeQuestion();
    }

    public static Icon homeRibbon() {
        return TablerIconsH1.homeRibbon();
    }

    public static Icon homeSearch() {
        return TablerIconsH1.homeSearch();
    }

    public static Icon homeShare() {
        return TablerIconsH1.homeShare();
    }

    public static Icon homeShield() {
        return TablerIconsH1.homeShield();
    }

    public static Icon homeSignal() {
        return TablerIconsH1.homeSignal();
    }

    public static Icon homeSpark() {
        return TablerIconsH1.homeSpark();
    }

    public static Icon homeStar() {
        return TablerIconsH1.homeStar();
    }

    public static Icon homeStats() {
        return TablerIconsH1.homeStats();
    }

    public static Icon homeUp() {
        return TablerIconsH1.homeUp();
    }

    public static Icon homeX() {
        return TablerIconsH1.homeX();
    }

    public static Icon horse() {
        return TablerIconsH2.horse();
    }

    public static Icon horseToy() {
        return TablerIconsH2.horseToy();
    }

    public static Icon horseshoe() {
        return TablerIconsH2.horseshoe();
    }

    public static Icon hospital() {
        return TablerIconsH2.hospital();
    }

    public static Icon hospitalCircle() {
        return TablerIconsH2.hospitalCircle();
    }

    public static Icon hotelService() {
        return TablerIconsH2.hotelService();
    }

    public static Icon hourglass() {
        return TablerIconsH2.hourglass();
    }

    public static Icon hourglassEmpty() {
        return TablerIconsH2.hourglassEmpty();
    }

    public static Icon hourglassHigh() {
        return TablerIconsH2.hourglassHigh();
    }

    public static Icon hourglassLow() {
        return TablerIconsH2.hourglassLow();
    }

    public static Icon hourglassOff() {
        return TablerIconsH2.hourglassOff();
    }

    public static Icon hoursN12() {
        return TablerIconsH2.hoursN12();
    }

    public static Icon hoursN24() {
        return TablerIconsH2.hoursN24();
    }

    public static Icon html() {
        return TablerIconsH2.html();
    }

    public static Icon httpConnect() {
        return TablerIconsH2.httpConnect();
    }

    public static Icon httpConnectOff() {
        return TablerIconsH2.httpConnectOff();
    }

    public static Icon httpDelete() {
        return TablerIconsH2.httpDelete();
    }

    public static Icon httpDeleteOff() {
        return TablerIconsH2.httpDeleteOff();
    }

    public static Icon httpGet() {
        return TablerIconsH2.httpGet();
    }

    public static Icon httpGetOff() {
        return TablerIconsH2.httpGetOff();
    }

    public static Icon httpHead() {
        return TablerIconsH2.httpHead();
    }

    public static Icon httpHeadOff() {
        return TablerIconsH2.httpHeadOff();
    }

    public static Icon httpOptions() {
        return TablerIconsH2.httpOptions();
    }

    public static Icon httpOptionsOff() {
        return TablerIconsH2.httpOptionsOff();
    }

    public static Icon httpPatch() {
        return TablerIconsH2.httpPatch();
    }

    public static Icon httpPatchOff() {
        return TablerIconsH2.httpPatchOff();
    }

    public static Icon httpPost() {
        return TablerIconsH2.httpPost();
    }

    public static Icon httpPostOff() {
        return TablerIconsH2.httpPostOff();
    }

    public static Icon httpPut() {
        return TablerIconsH2.httpPut();
    }

    public static Icon httpPutOff() {
        return TablerIconsH2.httpPutOff();
    }

    public static Icon httpQue() {
        return TablerIconsH2.httpQue();
    }

    public static Icon httpQueOff() {
        return TablerIconsH2.httpQueOff();
    }

    public static Icon httpTrace() {
        return TablerIconsH2.httpTrace();
    }

    public static Icon httpTraceOff() {
        return TablerIconsH2.httpTraceOff();
    }

    public static Icon hulaHoop() {
        return TablerIconsH2.hulaHoop();
    }

    public static Icon iceCream() {
        return TablerIconsI.iceCream();
    }

    public static Icon iceCreamN2() {
        return TablerIconsI.iceCreamN2();
    }

    public static Icon iceCreamOff() {
        return TablerIconsI.iceCreamOff();
    }

    public static Icon iceSkating() {
        return TablerIconsI.iceSkating();
    }

    public static Icon iceberg() {
        return TablerIconsI.iceberg();
    }

    public static Icon icons() {
        return TablerIconsI.icons();
    }

    public static Icon iconsOff() {
        return TablerIconsI.iconsOff();
    }

    public static Icon id() {
        return TablerIconsI.id();
    }

    public static Icon idBadge() {
        return TablerIconsI.idBadge();
    }

    public static Icon idBadgeN2() {
        return TablerIconsI.idBadgeN2();
    }

    public static Icon idBadgeOff() {
        return TablerIconsI.idBadgeOff();
    }

    public static Icon idOff() {
        return TablerIconsI.idOff();
    }

    public static Icon ikosaedr() {
        return TablerIconsI.ikosaedr();
    }

    public static Icon imageGeneration() {
        return TablerIconsI.imageGeneration();
    }

    public static Icon imageInPicture() {
        return TablerIconsI.imageInPicture();
    }

    public static Icon inbox() {
        return TablerIconsI.inbox();
    }

    public static Icon inboxOff() {
        return TablerIconsI.inboxOff();
    }

    public static Icon indentDecrease() {
        return TablerIconsI.indentDecrease();
    }

    public static Icon indentIncrease() {
        return TablerIconsI.indentIncrease();
    }

    public static Icon infinity() {
        return TablerIconsI.infinity();
    }

    public static Icon infinityN2() {
        return TablerIconsI.infinityN2();
    }

    public static Icon infinityOff() {
        return TablerIconsI.infinityOff();
    }

    public static Icon infoCircle() {
        return TablerIconsI.infoCircle();
    }

    public static Icon infoHexagon() {
        return TablerIconsI.infoHexagon();
    }

    public static Icon infoOctagon() {
        return TablerIconsI.infoOctagon();
    }

    public static Icon infoSmall() {
        return TablerIconsI.infoSmall();
    }

    public static Icon infoSquare() {
        return TablerIconsI.infoSquare();
    }

    public static Icon infoSquareRounded() {
        return TablerIconsI.infoSquareRounded();
    }

    public static Icon infoTriangle() {
        return TablerIconsI.infoTriangle();
    }

    public static Icon innerShadowBottom() {
        return TablerIconsI.innerShadowBottom();
    }

    public static Icon innerShadowBottomLeft() {
        return TablerIconsI.innerShadowBottomLeft();
    }

    public static Icon innerShadowBottomRight() {
        return TablerIconsI.innerShadowBottomRight();
    }

    public static Icon innerShadowLeft() {
        return TablerIconsI.innerShadowLeft();
    }

    public static Icon innerShadowRight() {
        return TablerIconsI.innerShadowRight();
    }

    public static Icon innerShadowTop() {
        return TablerIconsI.innerShadowTop();
    }

    public static Icon innerShadowTopLeft() {
        return TablerIconsI.innerShadowTopLeft();
    }

    public static Icon innerShadowTopRight() {
        return TablerIconsI.innerShadowTopRight();
    }

    public static Icon inputAi() {
        return TablerIconsI.inputAi();
    }

    public static Icon inputCheck() {
        return TablerIconsI.inputCheck();
    }

    public static Icon inputSearch() {
        return TablerIconsI.inputSearch();
    }

    public static Icon inputSpark() {
        return TablerIconsI.inputSpark();
    }

    public static Icon inputX() {
        return TablerIconsI.inputX();
    }

    public static Icon invoice() {
        return TablerIconsI.invoice();
    }

    public static Icon ironing() {
        return TablerIconsI.ironing();
    }

    public static Icon ironingN1() {
        return TablerIconsI.ironingN1();
    }

    public static Icon ironingN2() {
        return TablerIconsI.ironingN2();
    }

    public static Icon ironingN3() {
        return TablerIconsI.ironingN3();
    }

    public static Icon ironingOff() {
        return TablerIconsI.ironingOff();
    }

    public static Icon ironingSteam() {
        return TablerIconsI.ironingSteam();
    }

    public static Icon ironingSteamOff() {
        return TablerIconsI.ironingSteamOff();
    }

    public static Icon irregularPolyhedron() {
        return TablerIconsI.irregularPolyhedron();
    }

    public static Icon irregularPolyhedronOff() {
        return TablerIconsI.irregularPolyhedronOff();
    }

    public static Icon irregularPolyhedronPlus() {
        return TablerIconsI.irregularPolyhedronPlus();
    }

    public static Icon italic() {
        return TablerIconsI.italic();
    }

    public static Icon jacket() {
        return TablerIconsJ.jacket();
    }

    public static Icon jetpack() {
        return TablerIconsJ.jetpack();
    }

    public static Icon jetski() {
        return TablerIconsJ.jetski();
    }

    public static Icon jewishStar() {
        return TablerIconsJ.jewishStar();
    }

    public static Icon joinBevel() {
        return TablerIconsJ.joinBevel();
    }

    public static Icon joinRound() {
        return TablerIconsJ.joinRound();
    }

    public static Icon joinStraight() {
        return TablerIconsJ.joinStraight();
    }

    public static Icon joker() {
        return TablerIconsJ.joker();
    }

    public static Icon jpg() {
        return TablerIconsJ.jpg();
    }

    public static Icon json() {
        return TablerIconsJ.json();
    }

    public static Icon jumpRope() {
        return TablerIconsJ.jumpRope();
    }

    public static Icon karate() {
        return TablerIconsK.karate();
    }

    public static Icon kayak() {
        return TablerIconsK.kayak();
    }

    public static Icon kerning() {
        return TablerIconsK.kerning();
    }

    public static Icon key() {
        return TablerIconsK.key();
    }

    public static Icon keyOff() {
        return TablerIconsK.keyOff();
    }

    public static Icon keyboard() {
        return TablerIconsK.keyboard();
    }

    public static Icon keyboardHide() {
        return TablerIconsK.keyboardHide();
    }

    public static Icon keyboardOff() {
        return TablerIconsK.keyboardOff();
    }

    public static Icon keyboardShow() {
        return TablerIconsK.keyboardShow();
    }

    public static Icon keyframe() {
        return TablerIconsK.keyframe();
    }

    public static Icon keyframeAlignCenter() {
        return TablerIconsK.keyframeAlignCenter();
    }

    public static Icon keyframeAlignHorizontal() {
        return TablerIconsK.keyframeAlignHorizontal();
    }

    public static Icon keyframeAlignVertical() {
        return TablerIconsK.keyframeAlignVertical();
    }

    public static Icon keyframes() {
        return TablerIconsK.keyframes();
    }

    public static Icon label() {
        return TablerIconsL1.label();
    }

    public static Icon labelImportant() {
        return TablerIconsL1.labelImportant();
    }

    public static Icon labelOff() {
        return TablerIconsL1.labelOff();
    }

    public static Icon ladder() {
        return TablerIconsL1.ladder();
    }

    public static Icon ladderOff() {
        return TablerIconsL1.ladderOff();
    }

    public static Icon ladle() {
        return TablerIconsL1.ladle();
    }

    public static Icon lambda() {
        return TablerIconsL1.lambda();
    }

    public static Icon lamp() {
        return TablerIconsL1.lamp();
    }

    public static Icon lampN2() {
        return TablerIconsL1.lampN2();
    }

    public static Icon lampOff() {
        return TablerIconsL1.lampOff();
    }

    public static Icon lane() {
        return TablerIconsL1.lane();
    }

    public static Icon language() {
        return TablerIconsL1.language();
    }

    public static Icon languageHiragana() {
        return TablerIconsL1.languageHiragana();
    }

    public static Icon languageKatakana() {
        return TablerIconsL1.languageKatakana();
    }

    public static Icon languageOff() {
        return TablerIconsL1.languageOff();
    }

    public static Icon lasso() {
        return TablerIconsL1.lasso();
    }

    public static Icon lassoOff() {
        return TablerIconsL1.lassoOff();
    }

    public static Icon lassoPolygon() {
        return TablerIconsL1.lassoPolygon();
    }

    public static Icon laurelWreath() {
        return TablerIconsL1.laurelWreath();
    }

    public static Icon laurelWreathN1() {
        return TablerIconsL1.laurelWreathN1();
    }

    public static Icon laurelWreathN2() {
        return TablerIconsL1.laurelWreathN2();
    }

    public static Icon laurelWreathN3() {
        return TablerIconsL1.laurelWreathN3();
    }

    public static Icon lawnMower() {
        return TablerIconsL1.lawnMower();
    }

    public static Icon layersDifference() {
        return TablerIconsL1.layersDifference();
    }

    public static Icon layersIntersect() {
        return TablerIconsL1.layersIntersect();
    }

    public static Icon layersIntersectN2() {
        return TablerIconsL1.layersIntersectN2();
    }

    public static Icon layersLinked() {
        return TablerIconsL1.layersLinked();
    }

    public static Icon layersOff() {
        return TablerIconsL1.layersOff();
    }

    public static Icon layersSelected() {
        return TablerIconsL1.layersSelected();
    }

    public static Icon layersSelectedBottom() {
        return TablerIconsL1.layersSelectedBottom();
    }

    public static Icon layersSubtract() {
        return TablerIconsL1.layersSubtract();
    }

    public static Icon layersUnion() {
        return TablerIconsL1.layersUnion();
    }

    public static Icon layout() {
        return TablerIconsL1.layout();
    }

    public static Icon layoutN2() {
        return TablerIconsL1.layoutN2();
    }

    public static Icon layoutAlignBottom() {
        return TablerIconsL1.layoutAlignBottom();
    }

    public static Icon layoutAlignCenter() {
        return TablerIconsL1.layoutAlignCenter();
    }

    public static Icon layoutAlignLeft() {
        return TablerIconsL1.layoutAlignLeft();
    }

    public static Icon layoutAlignMiddle() {
        return TablerIconsL1.layoutAlignMiddle();
    }

    public static Icon layoutAlignRight() {
        return TablerIconsL1.layoutAlignRight();
    }

    public static Icon layoutAlignTop() {
        return TablerIconsL1.layoutAlignTop();
    }

    public static Icon layoutBoard() {
        return TablerIconsL1.layoutBoard();
    }

    public static Icon layoutBoardSplit() {
        return TablerIconsL1.layoutBoardSplit();
    }

    public static Icon layoutBottombar() {
        return TablerIconsL1.layoutBottombar();
    }

    public static Icon layoutBottombarCollapse() {
        return TablerIconsL1.layoutBottombarCollapse();
    }

    public static Icon layoutBottombarExpand() {
        return TablerIconsL1.layoutBottombarExpand();
    }

    public static Icon layoutBottombarInactive() {
        return TablerIconsL1.layoutBottombarInactive();
    }

    public static Icon layoutCards() {
        return TablerIconsL1.layoutCards();
    }

    public static Icon layoutCollage() {
        return TablerIconsL1.layoutCollage();
    }

    public static Icon layoutColumns() {
        return TablerIconsL1.layoutColumns();
    }

    public static Icon layoutDashboard() {
        return TablerIconsL1.layoutDashboard();
    }

    public static Icon layoutDistributeHorizontal() {
        return TablerIconsL1.layoutDistributeHorizontal();
    }

    public static Icon layoutDistributeVertical() {
        return TablerIconsL1.layoutDistributeVertical();
    }

    public static Icon layoutGrid() {
        return TablerIconsL1.layoutGrid();
    }

    public static Icon layoutGridAdd() {
        return TablerIconsL1.layoutGridAdd();
    }

    public static Icon layoutGridRemove() {
        return TablerIconsL1.layoutGridRemove();
    }

    public static Icon layoutKanban() {
        return TablerIconsL1.layoutKanban();
    }

    public static Icon layoutList() {
        return TablerIconsL1.layoutList();
    }

    public static Icon layoutNavbar() {
        return TablerIconsL1.layoutNavbar();
    }

    public static Icon layoutNavbarCollapse() {
        return TablerIconsL1.layoutNavbarCollapse();
    }

    public static Icon layoutNavbarExpand() {
        return TablerIconsL1.layoutNavbarExpand();
    }

    public static Icon layoutNavbarInactive() {
        return TablerIconsL1.layoutNavbarInactive();
    }

    public static Icon layoutOff() {
        return TablerIconsL1.layoutOff();
    }

    public static Icon layoutRows() {
        return TablerIconsL1.layoutRows();
    }

    public static Icon layoutSidebar() {
        return TablerIconsL1.layoutSidebar();
    }

    public static Icon layoutSidebarInactive() {
        return TablerIconsL1.layoutSidebarInactive();
    }

    public static Icon layoutSidebarLeftCollapse() {
        return TablerIconsL1.layoutSidebarLeftCollapse();
    }

    public static Icon layoutSidebarLeftExpand() {
        return TablerIconsL1.layoutSidebarLeftExpand();
    }

    public static Icon layoutSidebarRight() {
        return TablerIconsL1.layoutSidebarRight();
    }

    public static Icon layoutSidebarRightCollapse() {
        return TablerIconsL1.layoutSidebarRightCollapse();
    }

    public static Icon layoutSidebarRightExpand() {
        return TablerIconsL1.layoutSidebarRightExpand();
    }

    public static Icon layoutSidebarRightInactive() {
        return TablerIconsL1.layoutSidebarRightInactive();
    }

    public static Icon leaf() {
        return TablerIconsL1.leaf();
    }

    public static Icon leafN2() {
        return TablerIconsL1.leafN2();
    }

    public static Icon leafMaple() {
        return TablerIconsL1.leafMaple();
    }

    public static Icon leafOff() {
        return TablerIconsL1.leafOff();
    }

    public static Icon lego() {
        return TablerIconsL1.lego();
    }

    public static Icon legoOff() {
        return TablerIconsL1.legoOff();
    }

    public static Icon lemon() {
        return TablerIconsL1.lemon();
    }

    public static Icon lemonN2() {
        return TablerIconsL1.lemonN2();
    }

    public static Icon letterA() {
        return TablerIconsL1.letterA();
    }

    public static Icon letterASmall() {
        return TablerIconsL1.letterASmall();
    }

    public static Icon letterB() {
        return TablerIconsL1.letterB();
    }

    public static Icon letterBSmall() {
        return TablerIconsL1.letterBSmall();
    }

    public static Icon letterC() {
        return TablerIconsL1.letterC();
    }

    public static Icon letterCSmall() {
        return TablerIconsL1.letterCSmall();
    }

    public static Icon letterCase() {
        return TablerIconsL1.letterCase();
    }

    public static Icon letterCaseLower() {
        return TablerIconsL1.letterCaseLower();
    }

    public static Icon letterCaseToggle() {
        return TablerIconsL1.letterCaseToggle();
    }

    public static Icon letterCaseUpper() {
        return TablerIconsL1.letterCaseUpper();
    }

    public static Icon letterD() {
        return TablerIconsL1.letterD();
    }

    public static Icon letterDSmall() {
        return TablerIconsL1.letterDSmall();
    }

    public static Icon letterE() {
        return TablerIconsL1.letterE();
    }

    public static Icon letterESmall() {
        return TablerIconsL1.letterESmall();
    }

    public static Icon letterF() {
        return TablerIconsL1.letterF();
    }

    public static Icon letterFSmall() {
        return TablerIconsL1.letterFSmall();
    }

    public static Icon letterG() {
        return TablerIconsL1.letterG();
    }

    public static Icon letterGSmall() {
        return TablerIconsL1.letterGSmall();
    }

    public static Icon letterH() {
        return TablerIconsL1.letterH();
    }

    public static Icon letterHSmall() {
        return TablerIconsL1.letterHSmall();
    }

    public static Icon letterI() {
        return TablerIconsL1.letterI();
    }

    public static Icon letterISmall() {
        return TablerIconsL1.letterISmall();
    }

    public static Icon letterJ() {
        return TablerIconsL1.letterJ();
    }

    public static Icon letterJSmall() {
        return TablerIconsL1.letterJSmall();
    }

    public static Icon letterK() {
        return TablerIconsL1.letterK();
    }

    public static Icon letterKSmall() {
        return TablerIconsL1.letterKSmall();
    }

    public static Icon letterL() {
        return TablerIconsL1.letterL();
    }

    public static Icon letterLSmall() {
        return TablerIconsL1.letterLSmall();
    }

    public static Icon letterM() {
        return TablerIconsL1.letterM();
    }

    public static Icon letterMSmall() {
        return TablerIconsL1.letterMSmall();
    }

    public static Icon letterN() {
        return TablerIconsL1.letterN();
    }

    public static Icon letterNSmall() {
        return TablerIconsL1.letterNSmall();
    }

    public static Icon letterO() {
        return TablerIconsL1.letterO();
    }

    public static Icon letterOSmall() {
        return TablerIconsL1.letterOSmall();
    }

    public static Icon letterP() {
        return TablerIconsL1.letterP();
    }

    public static Icon letterPSmall() {
        return TablerIconsL1.letterPSmall();
    }

    public static Icon letterQ() {
        return TablerIconsL1.letterQ();
    }

    public static Icon letterQSmall() {
        return TablerIconsL1.letterQSmall();
    }

    public static Icon letterR() {
        return TablerIconsL1.letterR();
    }

    public static Icon letterRSmall() {
        return TablerIconsL1.letterRSmall();
    }

    public static Icon letterS() {
        return TablerIconsL1.letterS();
    }

    public static Icon letterSSmall() {
        return TablerIconsL1.letterSSmall();
    }

    public static Icon letterSpacing() {
        return TablerIconsL1.letterSpacing();
    }

    public static Icon letterT() {
        return TablerIconsL1.letterT();
    }

    public static Icon letterTSmall() {
        return TablerIconsL1.letterTSmall();
    }

    public static Icon letterU() {
        return TablerIconsL1.letterU();
    }

    public static Icon letterUSmall() {
        return TablerIconsL1.letterUSmall();
    }

    public static Icon letterV() {
        return TablerIconsL1.letterV();
    }

    public static Icon letterVSmall() {
        return TablerIconsL1.letterVSmall();
    }

    public static Icon letterW() {
        return TablerIconsL1.letterW();
    }

    public static Icon letterWSmall() {
        return TablerIconsL1.letterWSmall();
    }

    public static Icon letterX() {
        return TablerIconsL1.letterX();
    }

    public static Icon letterXSmall() {
        return TablerIconsL1.letterXSmall();
    }

    public static Icon letterY() {
        return TablerIconsL1.letterY();
    }

    public static Icon letterYSmall() {
        return TablerIconsL1.letterYSmall();
    }

    public static Icon letterZ() {
        return TablerIconsL1.letterZ();
    }

    public static Icon letterZSmall() {
        return TablerIconsL1.letterZSmall();
    }

    public static Icon library() {
        return TablerIconsL1.library();
    }

    public static Icon libraryMinus() {
        return TablerIconsL1.libraryMinus();
    }

    public static Icon libraryPhoto() {
        return TablerIconsL1.libraryPhoto();
    }

    public static Icon libraryPlus() {
        return TablerIconsL1.libraryPlus();
    }

    public static Icon license() {
        return TablerIconsL1.license();
    }

    public static Icon licenseOff() {
        return TablerIconsL1.licenseOff();
    }

    public static Icon lifebuoy() {
        return TablerIconsL1.lifebuoy();
    }

    public static Icon lifebuoyOff() {
        return TablerIconsL1.lifebuoyOff();
    }

    public static Icon lighter() {
        return TablerIconsL1.lighter();
    }

    public static Icon line() {
        return TablerIconsL1.line();
    }

    public static Icon lineDashed() {
        return TablerIconsL1.lineDashed();
    }

    public static Icon lineDotted() {
        return TablerIconsL1.lineDotted();
    }

    public static Icon lineHeight() {
        return TablerIconsL1.lineHeight();
    }

    public static Icon lineScan() {
        return TablerIconsL1.lineScan();
    }

    public static Icon link() {
        return TablerIconsL1.link();
    }

    public static Icon linkMinus() {
        return TablerIconsL1.linkMinus();
    }

    public static Icon linkOff() {
        return TablerIconsL1.linkOff();
    }

    public static Icon linkPlus() {
        return TablerIconsL1.linkPlus();
    }

    public static Icon list() {
        return TablerIconsL1.list();
    }

    public static Icon listCheck() {
        return TablerIconsL1.listCheck();
    }

    public static Icon listDetails() {
        return TablerIconsL1.listDetails();
    }

    public static Icon listLetters() {
        return TablerIconsL1.listLetters();
    }

    public static Icon listNumbers() {
        return TablerIconsL1.listNumbers();
    }

    public static Icon listSearch() {
        return TablerIconsL1.listSearch();
    }

    public static Icon listTree() {
        return TablerIconsL1.listTree();
    }

    public static Icon livePhoto() {
        return TablerIconsL1.livePhoto();
    }

    public static Icon livePhotoOff() {
        return TablerIconsL1.livePhotoOff();
    }

    public static Icon liveView() {
        return TablerIconsL1.liveView();
    }

    public static Icon loadBalancer() {
        return TablerIconsL1.loadBalancer();
    }

    public static Icon loader() {
        return TablerIconsL1.loader();
    }

    public static Icon loaderN2() {
        return TablerIconsL1.loaderN2();
    }

    public static Icon loaderN3() {
        return TablerIconsL1.loaderN3();
    }

    public static Icon loaderN4() {
        return TablerIconsL1.loaderN4();
    }

    public static Icon loaderQuarter() {
        return TablerIconsL1.loaderQuarter();
    }

    public static Icon location() {
        return TablerIconsL1.location();
    }

    public static Icon locationBolt() {
        return TablerIconsL1.locationBolt();
    }

    public static Icon locationBroken() {
        return TablerIconsL1.locationBroken();
    }

    public static Icon locationCancel() {
        return TablerIconsL1.locationCancel();
    }

    public static Icon locationCheck() {
        return TablerIconsL1.locationCheck();
    }

    public static Icon locationCode() {
        return TablerIconsL1.locationCode();
    }

    public static Icon locationCog() {
        return TablerIconsL1.locationCog();
    }

    public static Icon locationDiscount() {
        return TablerIconsL1.locationDiscount();
    }

    public static Icon locationDollar() {
        return TablerIconsL1.locationDollar();
    }

    public static Icon locationDown() {
        return TablerIconsL1.locationDown();
    }

    public static Icon locationExclamation() {
        return TablerIconsL2.locationExclamation();
    }

    public static Icon locationHeart() {
        return TablerIconsL2.locationHeart();
    }

    public static Icon locationMinus() {
        return TablerIconsL2.locationMinus();
    }

    public static Icon locationOff() {
        return TablerIconsL2.locationOff();
    }

    public static Icon locationPause() {
        return TablerIconsL2.locationPause();
    }

    public static Icon locationPin() {
        return TablerIconsL2.locationPin();
    }

    public static Icon locationPlus() {
        return TablerIconsL2.locationPlus();
    }

    public static Icon locationQuestion() {
        return TablerIconsL2.locationQuestion();
    }

    public static Icon locationSearch() {
        return TablerIconsL2.locationSearch();
    }

    public static Icon locationShare() {
        return TablerIconsL2.locationShare();
    }

    public static Icon locationStar() {
        return TablerIconsL2.locationStar();
    }

    public static Icon locationUp() {
        return TablerIconsL2.locationUp();
    }

    public static Icon locationX() {
        return TablerIconsL2.locationX();
    }

    public static Icon lock() {
        return TablerIconsL2.lock();
    }

    public static Icon lockAccess() {
        return TablerIconsL2.lockAccess();
    }

    public static Icon lockAccessOff() {
        return TablerIconsL2.lockAccessOff();
    }

    public static Icon lockBitcoin() {
        return TablerIconsL2.lockBitcoin();
    }

    public static Icon lockBolt() {
        return TablerIconsL2.lockBolt();
    }

    public static Icon lockCancel() {
        return TablerIconsL2.lockCancel();
    }

    public static Icon lockCheck() {
        return TablerIconsL2.lockCheck();
    }

    public static Icon lockCode() {
        return TablerIconsL2.lockCode();
    }

    public static Icon lockCog() {
        return TablerIconsL2.lockCog();
    }

    public static Icon lockDollar() {
        return TablerIconsL2.lockDollar();
    }

    public static Icon lockDown() {
        return TablerIconsL2.lockDown();
    }

    public static Icon lockExclamation() {
        return TablerIconsL2.lockExclamation();
    }

    public static Icon lockHeart() {
        return TablerIconsL2.lockHeart();
    }

    public static Icon lockMinus() {
        return TablerIconsL2.lockMinus();
    }

    public static Icon lockOff() {
        return TablerIconsL2.lockOff();
    }

    public static Icon lockOpen() {
        return TablerIconsL2.lockOpen();
    }

    public static Icon lockOpenN2() {
        return TablerIconsL2.lockOpenN2();
    }

    public static Icon lockOpenOff() {
        return TablerIconsL2.lockOpenOff();
    }

    public static Icon lockPassword() {
        return TablerIconsL2.lockPassword();
    }

    public static Icon lockPause() {
        return TablerIconsL2.lockPause();
    }

    public static Icon lockPin() {
        return TablerIconsL2.lockPin();
    }

    public static Icon lockPlus() {
        return TablerIconsL2.lockPlus();
    }

    public static Icon lockQuestion() {
        return TablerIconsL2.lockQuestion();
    }

    public static Icon lockSearch() {
        return TablerIconsL2.lockSearch();
    }

    public static Icon lockShare() {
        return TablerIconsL2.lockShare();
    }

    public static Icon lockSquare() {
        return TablerIconsL2.lockSquare();
    }

    public static Icon lockSquareRounded() {
        return TablerIconsL2.lockSquareRounded();
    }

    public static Icon lockStar() {
        return TablerIconsL2.lockStar();
    }

    public static Icon lockUp() {
        return TablerIconsL2.lockUp();
    }

    public static Icon lockX() {
        return TablerIconsL2.lockX();
    }

    public static Icon logicAnd() {
        return TablerIconsL2.logicAnd();
    }

    public static Icon logicBuffer() {
        return TablerIconsL2.logicBuffer();
    }

    public static Icon logicNand() {
        return TablerIconsL2.logicNand();
    }

    public static Icon logicNor() {
        return TablerIconsL2.logicNor();
    }

    public static Icon logicNot() {
        return TablerIconsL2.logicNot();
    }

    public static Icon logicOr() {
        return TablerIconsL2.logicOr();
    }

    public static Icon logicXnor() {
        return TablerIconsL2.logicXnor();
    }

    public static Icon logicXor() {
        return TablerIconsL2.logicXor();
    }

    public static Icon login() {
        return TablerIconsL2.login();
    }

    public static Icon loginN2() {
        return TablerIconsL2.loginN2();
    }

    public static Icon logout() {
        return TablerIconsL2.logout();
    }

    public static Icon logoutN2() {
        return TablerIconsL2.logoutN2();
    }

    public static Icon logs() {
        return TablerIconsL2.logs();
    }

    public static Icon lollipop() {
        return TablerIconsL2.lollipop();
    }

    public static Icon lollipopOff() {
        return TablerIconsL2.lollipopOff();
    }

    public static Icon luggage() {
        return TablerIconsL2.luggage();
    }

    public static Icon luggageOff() {
        return TablerIconsL2.luggageOff();
    }

    public static Icon lungs() {
        return TablerIconsL2.lungs();
    }

    public static Icon lungsOff() {
        return TablerIconsL2.lungsOff();
    }

    public static Icon macro() {
        return TablerIconsM1.macro();
    }

    public static Icon macroOff() {
        return TablerIconsM1.macroOff();
    }

    public static Icon magnet() {
        return TablerIconsM1.magnet();
    }

    public static Icon magnetOff() {
        return TablerIconsM1.magnetOff();
    }

    public static Icon magnetic() {
        return TablerIconsM1.magnetic();
    }

    public static Icon mail() {
        return TablerIconsM1.mail();
    }

    public static Icon mailAi() {
        return TablerIconsM1.mailAi();
    }

    public static Icon mailBitcoin() {
        return TablerIconsM1.mailBitcoin();
    }

    public static Icon mailBolt() {
        return TablerIconsM1.mailBolt();
    }

    public static Icon mailCancel() {
        return TablerIconsM1.mailCancel();
    }

    public static Icon mailCheck() {
        return TablerIconsM1.mailCheck();
    }

    public static Icon mailCode() {
        return TablerIconsM1.mailCode();
    }

    public static Icon mailCog() {
        return TablerIconsM1.mailCog();
    }

    public static Icon mailDollar() {
        return TablerIconsM1.mailDollar();
    }

    public static Icon mailDown() {
        return TablerIconsM1.mailDown();
    }

    public static Icon mailExclamation() {
        return TablerIconsM1.mailExclamation();
    }

    public static Icon mailFast() {
        return TablerIconsM1.mailFast();
    }

    public static Icon mailForward() {
        return TablerIconsM1.mailForward();
    }

    public static Icon mailHeart() {
        return TablerIconsM1.mailHeart();
    }

    public static Icon mailMinus() {
        return TablerIconsM1.mailMinus();
    }

    public static Icon mailOff() {
        return TablerIconsM1.mailOff();
    }

    public static Icon mailOpened() {
        return TablerIconsM1.mailOpened();
    }

    public static Icon mailPause() {
        return TablerIconsM1.mailPause();
    }

    public static Icon mailPin() {
        return TablerIconsM1.mailPin();
    }

    public static Icon mailPlus() {
        return TablerIconsM1.mailPlus();
    }

    public static Icon mailQuestion() {
        return TablerIconsM1.mailQuestion();
    }

    public static Icon mailSearch() {
        return TablerIconsM1.mailSearch();
    }

    public static Icon mailShare() {
        return TablerIconsM1.mailShare();
    }

    public static Icon mailSpark() {
        return TablerIconsM1.mailSpark();
    }

    public static Icon mailStar() {
        return TablerIconsM1.mailStar();
    }

    public static Icon mailUp() {
        return TablerIconsM1.mailUp();
    }

    public static Icon mailX() {
        return TablerIconsM1.mailX();
    }

    public static Icon mailbox() {
        return TablerIconsM1.mailbox();
    }

    public static Icon mailboxOff() {
        return TablerIconsM1.mailboxOff();
    }

    public static Icon man() {
        return TablerIconsM1.man();
    }

    public static Icon manualGearbox() {
        return TablerIconsM1.manualGearbox();
    }

    public static Icon map() {
        return TablerIconsM1.map();
    }

    public static Icon mapN2() {
        return TablerIconsM1.mapN2();
    }

    public static Icon mapBolt() {
        return TablerIconsM1.mapBolt();
    }

    public static Icon mapCancel() {
        return TablerIconsM1.mapCancel();
    }

    public static Icon mapCheck() {
        return TablerIconsM1.mapCheck();
    }

    public static Icon mapCode() {
        return TablerIconsM1.mapCode();
    }

    public static Icon mapCog() {
        return TablerIconsM1.mapCog();
    }

    public static Icon mapDiscount() {
        return TablerIconsM1.mapDiscount();
    }

    public static Icon mapDollar() {
        return TablerIconsM1.mapDollar();
    }

    public static Icon mapDown() {
        return TablerIconsM1.mapDown();
    }

    public static Icon mapEast() {
        return TablerIconsM1.mapEast();
    }

    public static Icon mapExclamation() {
        return TablerIconsM1.mapExclamation();
    }

    public static Icon mapHeart() {
        return TablerIconsM1.mapHeart();
    }

    public static Icon mapLock() {
        return TablerIconsM1.mapLock();
    }

    public static Icon mapMinus() {
        return TablerIconsM1.mapMinus();
    }

    public static Icon mapNorth() {
        return TablerIconsM1.mapNorth();
    }

    public static Icon mapOff() {
        return TablerIconsM1.mapOff();
    }

    public static Icon mapPause() {
        return TablerIconsM1.mapPause();
    }

    public static Icon mapPin() {
        return TablerIconsM1.mapPin();
    }

    public static Icon mapPinN2() {
        return TablerIconsM1.mapPinN2();
    }

    public static Icon mapPinBolt() {
        return TablerIconsM1.mapPinBolt();
    }

    public static Icon mapPinCancel() {
        return TablerIconsM1.mapPinCancel();
    }

    public static Icon mapPinCheck() {
        return TablerIconsM1.mapPinCheck();
    }

    public static Icon mapPinCode() {
        return TablerIconsM1.mapPinCode();
    }

    public static Icon mapPinCog() {
        return TablerIconsM1.mapPinCog();
    }

    public static Icon mapPinDollar() {
        return TablerIconsM1.mapPinDollar();
    }

    public static Icon mapPinDown() {
        return TablerIconsM1.mapPinDown();
    }

    public static Icon mapPinExclamation() {
        return TablerIconsM1.mapPinExclamation();
    }

    public static Icon mapPinHeart() {
        return TablerIconsM1.mapPinHeart();
    }

    public static Icon mapPinMinus() {
        return TablerIconsM1.mapPinMinus();
    }

    public static Icon mapPinOff() {
        return TablerIconsM1.mapPinOff();
    }

    public static Icon mapPinPause() {
        return TablerIconsM1.mapPinPause();
    }

    public static Icon mapPinPin() {
        return TablerIconsM1.mapPinPin();
    }

    public static Icon mapPinPlus() {
        return TablerIconsM1.mapPinPlus();
    }

    public static Icon mapPinQuestion() {
        return TablerIconsM1.mapPinQuestion();
    }

    public static Icon mapPinSearch() {
        return TablerIconsM1.mapPinSearch();
    }

    public static Icon mapPinShare() {
        return TablerIconsM1.mapPinShare();
    }

    public static Icon mapPinStar() {
        return TablerIconsM1.mapPinStar();
    }

    public static Icon mapPinUp() {
        return TablerIconsM1.mapPinUp();
    }

    public static Icon mapPinX() {
        return TablerIconsM1.mapPinX();
    }

    public static Icon mapPins() {
        return TablerIconsM1.mapPins();
    }

    public static Icon mapPlus() {
        return TablerIconsM1.mapPlus();
    }

    public static Icon mapQuestion() {
        return TablerIconsM1.mapQuestion();
    }

    public static Icon mapRoute() {
        return TablerIconsM1.mapRoute();
    }

    public static Icon mapSearch() {
        return TablerIconsM1.mapSearch();
    }

    public static Icon mapShare() {
        return TablerIconsM1.mapShare();
    }

    public static Icon mapShield() {
        return TablerIconsM1.mapShield();
    }

    public static Icon mapSouth() {
        return TablerIconsM1.mapSouth();
    }

    public static Icon mapStar() {
        return TablerIconsM1.mapStar();
    }

    public static Icon mapUp() {
        return TablerIconsM1.mapUp();
    }

    public static Icon mapWest() {
        return TablerIconsM1.mapWest();
    }

    public static Icon mapX() {
        return TablerIconsM1.mapX();
    }

    public static Icon markdown() {
        return TablerIconsM1.markdown();
    }

    public static Icon markdownOff() {
        return TablerIconsM1.markdownOff();
    }

    public static Icon marquee() {
        return TablerIconsM1.marquee();
    }

    public static Icon marqueeN2() {
        return TablerIconsM1.marqueeN2();
    }

    public static Icon marqueeOff() {
        return TablerIconsM1.marqueeOff();
    }

    public static Icon mars() {
        return TablerIconsM1.mars();
    }

    public static Icon mask() {
        return TablerIconsM1.mask();
    }

    public static Icon maskOff() {
        return TablerIconsM1.maskOff();
    }

    public static Icon masksTheater() {
        return TablerIconsM1.masksTheater();
    }

    public static Icon masksTheaterOff() {
        return TablerIconsM1.masksTheaterOff();
    }

    public static Icon massage() {
        return TablerIconsM1.massage();
    }

    public static Icon matchstick() {
        return TablerIconsM1.matchstick();
    }

    public static Icon math() {
        return TablerIconsM1.math();
    }

    public static Icon mathN1DivideN2() {
        return TablerIconsM1.mathN1DivideN2();
    }

    public static Icon mathN1DivideN3() {
        return TablerIconsM1.mathN1DivideN3();
    }

    public static Icon mathAvg() {
        return TablerIconsM1.mathAvg();
    }

    public static Icon mathCos() {
        return TablerIconsM1.mathCos();
    }

    public static Icon mathCtg() {
        return TablerIconsM1.mathCtg();
    }

    public static Icon mathEqualGreater() {
        return TablerIconsM1.mathEqualGreater();
    }

    public static Icon mathEqualLower() {
        return TablerIconsM1.mathEqualLower();
    }

    public static Icon mathFunction() {
        return TablerIconsM1.mathFunction();
    }

    public static Icon mathFunctionOff() {
        return TablerIconsM1.mathFunctionOff();
    }

    public static Icon mathFunctionY() {
        return TablerIconsM1.mathFunctionY();
    }

    public static Icon mathGreater() {
        return TablerIconsM1.mathGreater();
    }

    public static Icon mathIntegral() {
        return TablerIconsM1.mathIntegral();
    }

    public static Icon mathIntegralX() {
        return TablerIconsM1.mathIntegralX();
    }

    public static Icon mathIntegrals() {
        return TablerIconsM1.mathIntegrals();
    }

    public static Icon mathLower() {
        return TablerIconsM1.mathLower();
    }

    public static Icon mathMax() {
        return TablerIconsM1.mathMax();
    }

    public static Icon mathMaxMin() {
        return TablerIconsM1.mathMaxMin();
    }

    public static Icon mathMin() {
        return TablerIconsM1.mathMin();
    }

    public static Icon mathNot() {
        return TablerIconsM1.mathNot();
    }

    public static Icon mathOff() {
        return TablerIconsM1.mathOff();
    }

    public static Icon mathPi() {
        return TablerIconsM1.mathPi();
    }

    public static Icon mathPiDivideN2() {
        return TablerIconsM1.mathPiDivideN2();
    }

    public static Icon mathSec() {
        return TablerIconsM1.mathSec();
    }

    public static Icon mathSin() {
        return TablerIconsM1.mathSin();
    }

    public static Icon mathSymbols() {
        return TablerIconsM1.mathSymbols();
    }

    public static Icon mathTg() {
        return TablerIconsM1.mathTg();
    }

    public static Icon mathXDivideN2() {
        return TablerIconsM1.mathXDivideN2();
    }

    public static Icon mathXDivideY() {
        return TablerIconsM1.mathXDivideY();
    }

    public static Icon mathXDivideYN2() {
        return TablerIconsM1.mathXDivideYN2();
    }

    public static Icon mathXFloorDivideY() {
        return TablerIconsM1.mathXFloorDivideY();
    }

    public static Icon mathXMinusX() {
        return TablerIconsM1.mathXMinusX();
    }

    public static Icon mathXMinusY() {
        return TablerIconsM1.mathXMinusY();
    }

    public static Icon mathXPlusX() {
        return TablerIconsM1.mathXPlusX();
    }

    public static Icon mathXPlusY() {
        return TablerIconsM1.mathXPlusY();
    }

    public static Icon mathXy() {
        return TablerIconsM1.mathXy();
    }

    public static Icon mathYMinusY() {
        return TablerIconsM1.mathYMinusY();
    }

    public static Icon mathYPlusY() {
        return TablerIconsM1.mathYPlusY();
    }

    public static Icon matrix() {
        return TablerIconsM1.matrix();
    }

    public static Icon maximize() {
        return TablerIconsM1.maximize();
    }

    public static Icon maximizeOff() {
        return TablerIconsM1.maximizeOff();
    }

    public static Icon meat() {
        return TablerIconsM1.meat();
    }

    public static Icon meatOff() {
        return TablerIconsM1.meatOff();
    }

    public static Icon medal() {
        return TablerIconsM1.medal();
    }

    public static Icon medalN2() {
        return TablerIconsM1.medalN2();
    }

    public static Icon medicalCross() {
        return TablerIconsM1.medicalCross();
    }

    public static Icon medicalCrossCircle() {
        return TablerIconsM1.medicalCrossCircle();
    }

    public static Icon medicalCrossOff() {
        return TablerIconsM1.medicalCrossOff();
    }

    public static Icon medicineSyrup() {
        return TablerIconsM1.medicineSyrup();
    }

    public static Icon meeple() {
        return TablerIconsM1.meeple();
    }

    public static Icon melon() {
        return TablerIconsM1.melon();
    }

    public static Icon menorah() {
        return TablerIconsM1.menorah();
    }

    public static Icon menu() {
        return TablerIconsM1.menu();
    }

    public static Icon menuN2() {
        return TablerIconsM1.menuN2();
    }

    public static Icon menuN3() {
        return TablerIconsM1.menuN3();
    }

    public static Icon menuN4() {
        return TablerIconsM1.menuN4();
    }

    public static Icon menuDeep() {
        return TablerIconsM1.menuDeep();
    }

    public static Icon menuOrder() {
        return TablerIconsM1.menuOrder();
    }

    public static Icon mesh() {
        return TablerIconsM1.mesh();
    }

    public static Icon message() {
        return TablerIconsM1.message();
    }

    public static Icon messageN2() {
        return TablerIconsM1.messageN2();
    }

    public static Icon messageN2Bolt() {
        return TablerIconsM1.messageN2Bolt();
    }

    public static Icon messageN2Cancel() {
        return TablerIconsM1.messageN2Cancel();
    }

    public static Icon messageN2Check() {
        return TablerIconsM1.messageN2Check();
    }

    public static Icon messageN2Code() {
        return TablerIconsM1.messageN2Code();
    }

    public static Icon messageN2Cog() {
        return TablerIconsM1.messageN2Cog();
    }

    public static Icon messageN2Dollar() {
        return TablerIconsM1.messageN2Dollar();
    }

    public static Icon messageN2Down() {
        return TablerIconsM1.messageN2Down();
    }

    public static Icon messageN2Exclamation() {
        return TablerIconsM1.messageN2Exclamation();
    }

    public static Icon messageN2Heart() {
        return TablerIconsM1.messageN2Heart();
    }

    public static Icon messageN2Minus() {
        return TablerIconsM1.messageN2Minus();
    }

    public static Icon messageN2Off() {
        return TablerIconsM1.messageN2Off();
    }

    public static Icon messageN2Pause() {
        return TablerIconsM1.messageN2Pause();
    }

    public static Icon messageN2Pin() {
        return TablerIconsM1.messageN2Pin();
    }

    public static Icon messageN2Plus() {
        return TablerIconsM1.messageN2Plus();
    }

    public static Icon messageN2Question() {
        return TablerIconsM1.messageN2Question();
    }

    public static Icon messageN2Search() {
        return TablerIconsM1.messageN2Search();
    }

    public static Icon messageN2Share() {
        return TablerIconsM1.messageN2Share();
    }

    public static Icon messageN2Star() {
        return TablerIconsM1.messageN2Star();
    }

    public static Icon messageN2Up() {
        return TablerIconsM1.messageN2Up();
    }

    public static Icon messageN2X() {
        return TablerIconsM2.messageN2X();
    }

    public static Icon messageBolt() {
        return TablerIconsM2.messageBolt();
    }

    public static Icon messageCancel() {
        return TablerIconsM2.messageCancel();
    }

    public static Icon messageChatbot() {
        return TablerIconsM2.messageChatbot();
    }

    public static Icon messageCheck() {
        return TablerIconsM2.messageCheck();
    }

    public static Icon messageCircle() {
        return TablerIconsM2.messageCircle();
    }

    public static Icon messageCircleBolt() {
        return TablerIconsM2.messageCircleBolt();
    }

    public static Icon messageCircleCancel() {
        return TablerIconsM2.messageCircleCancel();
    }

    public static Icon messageCircleCheck() {
        return TablerIconsM2.messageCircleCheck();
    }

    public static Icon messageCircleCode() {
        return TablerIconsM2.messageCircleCode();
    }

    public static Icon messageCircleCog() {
        return TablerIconsM2.messageCircleCog();
    }

    public static Icon messageCircleDollar() {
        return TablerIconsM2.messageCircleDollar();
    }

    public static Icon messageCircleDown() {
        return TablerIconsM2.messageCircleDown();
    }

    public static Icon messageCircleExclamation() {
        return TablerIconsM2.messageCircleExclamation();
    }

    public static Icon messageCircleHeart() {
        return TablerIconsM2.messageCircleHeart();
    }

    public static Icon messageCircleMinus() {
        return TablerIconsM2.messageCircleMinus();
    }

    public static Icon messageCircleOff() {
        return TablerIconsM2.messageCircleOff();
    }

    public static Icon messageCirclePause() {
        return TablerIconsM2.messageCirclePause();
    }

    public static Icon messageCirclePin() {
        return TablerIconsM2.messageCirclePin();
    }

    public static Icon messageCirclePlus() {
        return TablerIconsM2.messageCirclePlus();
    }

    public static Icon messageCircleQuestion() {
        return TablerIconsM2.messageCircleQuestion();
    }

    public static Icon messageCircleSearch() {
        return TablerIconsM2.messageCircleSearch();
    }

    public static Icon messageCircleShare() {
        return TablerIconsM2.messageCircleShare();
    }

    public static Icon messageCircleStar() {
        return TablerIconsM2.messageCircleStar();
    }

    public static Icon messageCircleUp() {
        return TablerIconsM2.messageCircleUp();
    }

    public static Icon messageCircleUser() {
        return TablerIconsM2.messageCircleUser();
    }

    public static Icon messageCircleX() {
        return TablerIconsM2.messageCircleX();
    }

    public static Icon messageCode() {
        return TablerIconsM2.messageCode();
    }

    public static Icon messageCog() {
        return TablerIconsM2.messageCog();
    }

    public static Icon messageDollar() {
        return TablerIconsM2.messageDollar();
    }

    public static Icon messageDots() {
        return TablerIconsM2.messageDots();
    }

    public static Icon messageDown() {
        return TablerIconsM2.messageDown();
    }

    public static Icon messageExclamation() {
        return TablerIconsM2.messageExclamation();
    }

    public static Icon messageForward() {
        return TablerIconsM2.messageForward();
    }

    public static Icon messageHeart() {
        return TablerIconsM2.messageHeart();
    }

    public static Icon messageLanguage() {
        return TablerIconsM2.messageLanguage();
    }

    public static Icon messageMinus() {
        return TablerIconsM2.messageMinus();
    }

    public static Icon messageOff() {
        return TablerIconsM2.messageOff();
    }

    public static Icon messagePause() {
        return TablerIconsM2.messagePause();
    }

    public static Icon messagePin() {
        return TablerIconsM2.messagePin();
    }

    public static Icon messagePlus() {
        return TablerIconsM2.messagePlus();
    }

    public static Icon messageQuestion() {
        return TablerIconsM2.messageQuestion();
    }

    public static Icon messageReply() {
        return TablerIconsM2.messageReply();
    }

    public static Icon messageReport() {
        return TablerIconsM2.messageReport();
    }

    public static Icon messageSearch() {
        return TablerIconsM2.messageSearch();
    }

    public static Icon messageShare() {
        return TablerIconsM2.messageShare();
    }

    public static Icon messageStar() {
        return TablerIconsM2.messageStar();
    }

    public static Icon messageUp() {
        return TablerIconsM2.messageUp();
    }

    public static Icon messageUser() {
        return TablerIconsM2.messageUser();
    }

    public static Icon messageX() {
        return TablerIconsM2.messageX();
    }

    public static Icon messages() {
        return TablerIconsM2.messages();
    }

    public static Icon messagesOff() {
        return TablerIconsM2.messagesOff();
    }

    public static Icon meteor() {
        return TablerIconsM2.meteor();
    }

    public static Icon meteorOff() {
        return TablerIconsM2.meteorOff();
    }

    public static Icon meterCube() {
        return TablerIconsM2.meterCube();
    }

    public static Icon meterSquare() {
        return TablerIconsM2.meterSquare();
    }

    public static Icon metronome() {
        return TablerIconsM2.metronome();
    }

    public static Icon michelinBibGourmand() {
        return TablerIconsM2.michelinBibGourmand();
    }

    public static Icon michelinStar() {
        return TablerIconsM2.michelinStar();
    }

    public static Icon michelinStarGreen() {
        return TablerIconsM2.michelinStarGreen();
    }

    public static Icon mickey() {
        return TablerIconsM2.mickey();
    }

    public static Icon microfrontends() {
        return TablerIconsM2.microfrontends();
    }

    public static Icon microphone() {
        return TablerIconsM2.microphone();
    }

    public static Icon microphoneN2() {
        return TablerIconsM2.microphoneN2();
    }

    public static Icon microphoneN2Off() {
        return TablerIconsM2.microphoneN2Off();
    }

    public static Icon microphoneOff() {
        return TablerIconsM2.microphoneOff();
    }

    public static Icon microscope() {
        return TablerIconsM2.microscope();
    }

    public static Icon microscopeOff() {
        return TablerIconsM2.microscopeOff();
    }

    public static Icon microwave() {
        return TablerIconsM2.microwave();
    }

    public static Icon microwaveOff() {
        return TablerIconsM2.microwaveOff();
    }

    public static Icon middleware() {
        return TablerIconsM2.middleware();
    }

    public static Icon militaryAward() {
        return TablerIconsM2.militaryAward();
    }

    public static Icon militaryRank() {
        return TablerIconsM2.militaryRank();
    }

    public static Icon milk() {
        return TablerIconsM2.milk();
    }

    public static Icon milkOff() {
        return TablerIconsM2.milkOff();
    }

    public static Icon milkshake() {
        return TablerIconsM2.milkshake();
    }

    public static Icon minimize() {
        return TablerIconsM2.minimize();
    }

    public static Icon minus() {
        return TablerIconsM2.minus();
    }

    public static Icon minusVertical() {
        return TablerIconsM2.minusVertical();
    }

    public static Icon mist() {
        return TablerIconsM2.mist();
    }

    public static Icon mistOff() {
        return TablerIconsM2.mistOff();
    }

    public static Icon mobiledata() {
        return TablerIconsM2.mobiledata();
    }

    public static Icon mobiledataOff() {
        return TablerIconsM2.mobiledataOff();
    }

    public static Icon moneybag() {
        return TablerIconsM2.moneybag();
    }

    public static Icon moneybagEdit() {
        return TablerIconsM2.moneybagEdit();
    }

    public static Icon moneybagHeart() {
        return TablerIconsM2.moneybagHeart();
    }

    public static Icon moneybagMinus() {
        return TablerIconsM2.moneybagMinus();
    }

    public static Icon moneybagMove() {
        return TablerIconsM2.moneybagMove();
    }

    public static Icon moneybagMoveBack() {
        return TablerIconsM2.moneybagMoveBack();
    }

    public static Icon moneybagPlus() {
        return TablerIconsM2.moneybagPlus();
    }

    public static Icon monkeybar() {
        return TablerIconsM2.monkeybar();
    }

    public static Icon moodAngry() {
        return TablerIconsM2.moodAngry();
    }

    public static Icon moodAnnoyed() {
        return TablerIconsM2.moodAnnoyed();
    }

    public static Icon moodAnnoyedN2() {
        return TablerIconsM2.moodAnnoyedN2();
    }

    public static Icon moodBitcoin() {
        return TablerIconsM2.moodBitcoin();
    }

    public static Icon moodBoy() {
        return TablerIconsM2.moodBoy();
    }

    public static Icon moodCheck() {
        return TablerIconsM2.moodCheck();
    }

    public static Icon moodCog() {
        return TablerIconsM2.moodCog();
    }

    public static Icon moodConfuzed() {
        return TablerIconsM2.moodConfuzed();
    }

    public static Icon moodCrazyHappy() {
        return TablerIconsM2.moodCrazyHappy();
    }

    public static Icon moodCry() {
        return TablerIconsM2.moodCry();
    }

    public static Icon moodDollar() {
        return TablerIconsM2.moodDollar();
    }

    public static Icon moodEdit() {
        return TablerIconsM2.moodEdit();
    }

    public static Icon moodEmpty() {
        return TablerIconsM2.moodEmpty();
    }

    public static Icon moodHappy() {
        return TablerIconsM2.moodHappy();
    }

    public static Icon moodHeart() {
        return TablerIconsM2.moodHeart();
    }

    public static Icon moodKid() {
        return TablerIconsM2.moodKid();
    }

    public static Icon moodLookDown() {
        return TablerIconsM2.moodLookDown();
    }

    public static Icon moodLookLeft() {
        return TablerIconsM2.moodLookLeft();
    }

    public static Icon moodLookRight() {
        return TablerIconsM2.moodLookRight();
    }

    public static Icon moodLookUp() {
        return TablerIconsM2.moodLookUp();
    }

    public static Icon moodMinus() {
        return TablerIconsM2.moodMinus();
    }

    public static Icon moodNerd() {
        return TablerIconsM2.moodNerd();
    }

    public static Icon moodNervous() {
        return TablerIconsM2.moodNervous();
    }

    public static Icon moodNeutral() {
        return TablerIconsM2.moodNeutral();
    }

    public static Icon moodOff() {
        return TablerIconsM2.moodOff();
    }

    public static Icon moodPin() {
        return TablerIconsM2.moodPin();
    }

    public static Icon moodPlus() {
        return TablerIconsM2.moodPlus();
    }

    public static Icon moodPuzzled() {
        return TablerIconsM2.moodPuzzled();
    }

    public static Icon moodSad() {
        return TablerIconsM2.moodSad();
    }

    public static Icon moodSadN2() {
        return TablerIconsM2.moodSadN2();
    }

    public static Icon moodSadDizzy() {
        return TablerIconsM2.moodSadDizzy();
    }

    public static Icon moodSadSquint() {
        return TablerIconsM2.moodSadSquint();
    }

    public static Icon moodSearch() {
        return TablerIconsM2.moodSearch();
    }

    public static Icon moodShare() {
        return TablerIconsM2.moodShare();
    }

    public static Icon moodSick() {
        return TablerIconsM2.moodSick();
    }

    public static Icon moodSilence() {
        return TablerIconsM2.moodSilence();
    }

    public static Icon moodSing() {
        return TablerIconsM2.moodSing();
    }

    public static Icon moodSmile() {
        return TablerIconsM2.moodSmile();
    }

    public static Icon moodSmileBeam() {
        return TablerIconsM2.moodSmileBeam();
    }

    public static Icon moodSmileDizzy() {
        return TablerIconsM2.moodSmileDizzy();
    }

    public static Icon moodSpark() {
        return TablerIconsM2.moodSpark();
    }

    public static Icon moodSurprised() {
        return TablerIconsM2.moodSurprised();
    }

    public static Icon moodTongue() {
        return TablerIconsM2.moodTongue();
    }

    public static Icon moodTongueWink() {
        return TablerIconsM2.moodTongueWink();
    }

    public static Icon moodTongueWinkN2() {
        return TablerIconsM2.moodTongueWinkN2();
    }

    public static Icon moodUnamused() {
        return TablerIconsM2.moodUnamused();
    }

    public static Icon moodUp() {
        return TablerIconsM2.moodUp();
    }

    public static Icon moodWink() {
        return TablerIconsM2.moodWink();
    }

    public static Icon moodWinkN2() {
        return TablerIconsM2.moodWinkN2();
    }

    public static Icon moodWrrr() {
        return TablerIconsM2.moodWrrr();
    }

    public static Icon moodX() {
        return TablerIconsM2.moodX();
    }

    public static Icon moodXd() {
        return TablerIconsM2.moodXd();
    }

    public static Icon moon() {
        return TablerIconsM2.moon();
    }

    public static Icon moonN2() {
        return TablerIconsM2.moonN2();
    }

    public static Icon moonOff() {
        return TablerIconsM2.moonOff();
    }

    public static Icon moonStars() {
        return TablerIconsM2.moonStars();
    }

    public static Icon moped() {
        return TablerIconsM2.moped();
    }

    public static Icon mosque() {
        return TablerIconsM2.mosque();
    }

    public static Icon motorbike() {
        return TablerIconsM2.motorbike();
    }

    public static Icon mountain() {
        return TablerIconsM2.mountain();
    }

    public static Icon mountainOff() {
        return TablerIconsM2.mountainOff();
    }

    public static Icon mouse() {
        return TablerIconsM2.mouse();
    }

    public static Icon mouseN2() {
        return TablerIconsM2.mouseN2();
    }

    public static Icon mouseOff() {
        return TablerIconsM2.mouseOff();
    }

    public static Icon moustache() {
        return TablerIconsM2.moustache();
    }

    public static Icon movie() {
        return TablerIconsM2.movie();
    }

    public static Icon movieOff() {
        return TablerIconsM2.movieOff();
    }

    public static Icon mug() {
        return TablerIconsM2.mug();
    }

    public static Icon mugOff() {
        return TablerIconsM2.mugOff();
    }

    public static Icon multiplierN05x() {
        return TablerIconsM2.multiplierN05x();
    }

    public static Icon multiplierN15x() {
        return TablerIconsM2.multiplierN15x();
    }

    public static Icon multiplier1x() {
        return TablerIconsM2.multiplier1x();
    }

    public static Icon multiplier2x() {
        return TablerIconsM2.multiplier2x();
    }

    public static Icon mushroom() {
        return TablerIconsM2.mushroom();
    }

    public static Icon mushroomOff() {
        return TablerIconsM2.mushroomOff();
    }

    public static Icon music() {
        return TablerIconsM2.music();
    }

    public static Icon musicBolt() {
        return TablerIconsM2.musicBolt();
    }

    public static Icon musicCancel() {
        return TablerIconsM2.musicCancel();
    }

    public static Icon musicCheck() {
        return TablerIconsM2.musicCheck();
    }

    public static Icon musicCode() {
        return TablerIconsM2.musicCode();
    }

    public static Icon musicCog() {
        return TablerIconsM2.musicCog();
    }

    public static Icon musicDiscount() {
        return TablerIconsM2.musicDiscount();
    }

    public static Icon musicDollar() {
        return TablerIconsM2.musicDollar();
    }

    public static Icon musicDown() {
        return TablerIconsM2.musicDown();
    }

    public static Icon musicExclamation() {
        return TablerIconsM2.musicExclamation();
    }

    public static Icon musicHeart() {
        return TablerIconsM2.musicHeart();
    }

    public static Icon musicMinus() {
        return TablerIconsM2.musicMinus();
    }

    public static Icon musicOff() {
        return TablerIconsM2.musicOff();
    }

    public static Icon musicPause() {
        return TablerIconsM2.musicPause();
    }

    public static Icon musicPin() {
        return TablerIconsM3.musicPin();
    }

    public static Icon musicPlus() {
        return TablerIconsM3.musicPlus();
    }

    public static Icon musicQuestion() {
        return TablerIconsM3.musicQuestion();
    }

    public static Icon musicSearch() {
        return TablerIconsM3.musicSearch();
    }

    public static Icon musicShare() {
        return TablerIconsM3.musicShare();
    }

    public static Icon musicStar() {
        return TablerIconsM3.musicStar();
    }

    public static Icon musicUp() {
        return TablerIconsM3.musicUp();
    }

    public static Icon musicX() {
        return TablerIconsM3.musicX();
    }

    public static Icon navigation() {
        return TablerIconsN.navigation();
    }

    public static Icon navigationBolt() {
        return TablerIconsN.navigationBolt();
    }

    public static Icon navigationCancel() {
        return TablerIconsN.navigationCancel();
    }

    public static Icon navigationCheck() {
        return TablerIconsN.navigationCheck();
    }

    public static Icon navigationCode() {
        return TablerIconsN.navigationCode();
    }

    public static Icon navigationCog() {
        return TablerIconsN.navigationCog();
    }

    public static Icon navigationDiscount() {
        return TablerIconsN.navigationDiscount();
    }

    public static Icon navigationDollar() {
        return TablerIconsN.navigationDollar();
    }

    public static Icon navigationDown() {
        return TablerIconsN.navigationDown();
    }

    public static Icon navigationEast() {
        return TablerIconsN.navigationEast();
    }

    public static Icon navigationExclamation() {
        return TablerIconsN.navigationExclamation();
    }

    public static Icon navigationHeart() {
        return TablerIconsN.navigationHeart();
    }

    public static Icon navigationMinus() {
        return TablerIconsN.navigationMinus();
    }

    public static Icon navigationNorth() {
        return TablerIconsN.navigationNorth();
    }

    public static Icon navigationOff() {
        return TablerIconsN.navigationOff();
    }

    public static Icon navigationPause() {
        return TablerIconsN.navigationPause();
    }

    public static Icon navigationPin() {
        return TablerIconsN.navigationPin();
    }

    public static Icon navigationPlus() {
        return TablerIconsN.navigationPlus();
    }

    public static Icon navigationQuestion() {
        return TablerIconsN.navigationQuestion();
    }

    public static Icon navigationSearch() {
        return TablerIconsN.navigationSearch();
    }

    public static Icon navigationShare() {
        return TablerIconsN.navigationShare();
    }

    public static Icon navigationSouth() {
        return TablerIconsN.navigationSouth();
    }

    public static Icon navigationStar() {
        return TablerIconsN.navigationStar();
    }

    public static Icon navigationTop() {
        return TablerIconsN.navigationTop();
    }

    public static Icon navigationUp() {
        return TablerIconsN.navigationUp();
    }

    public static Icon navigationWest() {
        return TablerIconsN.navigationWest();
    }

    public static Icon navigationX() {
        return TablerIconsN.navigationX();
    }

    public static Icon needle() {
        return TablerIconsN.needle();
    }

    public static Icon needleThread() {
        return TablerIconsN.needleThread();
    }

    public static Icon network() {
        return TablerIconsN.network();
    }

    public static Icon networkOff() {
        return TablerIconsN.networkOff();
    }

    public static Icon newSection() {
        return TablerIconsN.newSection();
    }

    public static Icon news() {
        return TablerIconsN.news();
    }

    public static Icon newsOff() {
        return TablerIconsN.newsOff();
    }

    public static Icon nfc() {
        return TablerIconsN.nfc();
    }

    public static Icon nfcOff() {
        return TablerIconsN.nfcOff();
    }

    public static Icon noCopyright() {
        return TablerIconsN.noCopyright();
    }

    public static Icon noCreativeCommons() {
        return TablerIconsN.noCreativeCommons();
    }

    public static Icon noDerivatives() {
        return TablerIconsN.noDerivatives();
    }

    public static Icon noiseReduction() {
        return TablerIconsN.noiseReduction();
    }

    public static Icon northStar() {
        return TablerIconsN.northStar();
    }

    public static Icon notdef() {
        return TablerIconsN.notdef();
    }

    public static Icon note() {
        return TablerIconsN.note();
    }

    public static Icon noteOff() {
        return TablerIconsN.noteOff();
    }

    public static Icon notebook() {
        return TablerIconsN.notebook();
    }

    public static Icon notebookOff() {
        return TablerIconsN.notebookOff();
    }

    public static Icon notes() {
        return TablerIconsN.notes();
    }

    public static Icon notesOff() {
        return TablerIconsN.notesOff();
    }

    public static Icon notification() {
        return TablerIconsN.notification();
    }

    public static Icon notificationOff() {
        return TablerIconsN.notificationOff();
    }

    public static Icon number() {
        return TablerIconsN.number();
    }

    public static Icon numberN0() {
        return TablerIconsN.numberN0();
    }

    public static Icon numberN0Small() {
        return TablerIconsN.numberN0Small();
    }

    public static Icon numberN1() {
        return TablerIconsN.numberN1();
    }

    public static Icon numberN1Small() {
        return TablerIconsN.numberN1Small();
    }

    public static Icon numberN10() {
        return TablerIconsN.numberN10();
    }

    public static Icon numberN10Small() {
        return TablerIconsN.numberN10Small();
    }

    public static Icon numberN100Small() {
        return TablerIconsN.numberN100Small();
    }

    public static Icon numberN11() {
        return TablerIconsN.numberN11();
    }

    public static Icon numberN11Small() {
        return TablerIconsN.numberN11Small();
    }

    public static Icon numberN12Small() {
        return TablerIconsN.numberN12Small();
    }

    public static Icon numberN123() {
        return TablerIconsN.numberN123();
    }

    public static Icon numberN13Small() {
        return TablerIconsN.numberN13Small();
    }

    public static Icon numberN14Small() {
        return TablerIconsN.numberN14Small();
    }

    public static Icon numberN15Small() {
        return TablerIconsN.numberN15Small();
    }

    public static Icon numberN16Small() {
        return TablerIconsN.numberN16Small();
    }

    public static Icon numberN17Small() {
        return TablerIconsN.numberN17Small();
    }

    public static Icon numberN18Small() {
        return TablerIconsN.numberN18Small();
    }

    public static Icon numberN19Small() {
        return TablerIconsN.numberN19Small();
    }

    public static Icon numberN2() {
        return TablerIconsN.numberN2();
    }

    public static Icon numberN2Small() {
        return TablerIconsN.numberN2Small();
    }

    public static Icon numberN20Small() {
        return TablerIconsN.numberN20Small();
    }

    public static Icon numberN21Small() {
        return TablerIconsN.numberN21Small();
    }

    public static Icon numberN22Small() {
        return TablerIconsN.numberN22Small();
    }

    public static Icon numberN23Small() {
        return TablerIconsN.numberN23Small();
    }

    public static Icon numberN24Small() {
        return TablerIconsN.numberN24Small();
    }

    public static Icon numberN25Small() {
        return TablerIconsN.numberN25Small();
    }

    public static Icon numberN26Small() {
        return TablerIconsN.numberN26Small();
    }

    public static Icon numberN27Small() {
        return TablerIconsN.numberN27Small();
    }

    public static Icon numberN28Small() {
        return TablerIconsN.numberN28Small();
    }

    public static Icon numberN29Small() {
        return TablerIconsN.numberN29Small();
    }

    public static Icon numberN3() {
        return TablerIconsN.numberN3();
    }

    public static Icon numberN3Small() {
        return TablerIconsN.numberN3Small();
    }

    public static Icon numberN30Small() {
        return TablerIconsN.numberN30Small();
    }

    public static Icon numberN31Small() {
        return TablerIconsN.numberN31Small();
    }

    public static Icon numberN32Small() {
        return TablerIconsN.numberN32Small();
    }

    public static Icon numberN33Small() {
        return TablerIconsN.numberN33Small();
    }

    public static Icon numberN34Small() {
        return TablerIconsN.numberN34Small();
    }

    public static Icon numberN35Small() {
        return TablerIconsN.numberN35Small();
    }

    public static Icon numberN36Small() {
        return TablerIconsN.numberN36Small();
    }

    public static Icon numberN37Small() {
        return TablerIconsN.numberN37Small();
    }

    public static Icon numberN38Small() {
        return TablerIconsN.numberN38Small();
    }

    public static Icon numberN39Small() {
        return TablerIconsN.numberN39Small();
    }

    public static Icon numberN4() {
        return TablerIconsN.numberN4();
    }

    public static Icon numberN4Small() {
        return TablerIconsN.numberN4Small();
    }

    public static Icon numberN40Small() {
        return TablerIconsN.numberN40Small();
    }

    public static Icon numberN41Small() {
        return TablerIconsN.numberN41Small();
    }

    public static Icon numberN42Small() {
        return TablerIconsN.numberN42Small();
    }

    public static Icon numberN43Small() {
        return TablerIconsN.numberN43Small();
    }

    public static Icon numberN44Small() {
        return TablerIconsN.numberN44Small();
    }

    public static Icon numberN45Small() {
        return TablerIconsN.numberN45Small();
    }

    public static Icon numberN46Small() {
        return TablerIconsN.numberN46Small();
    }

    public static Icon numberN47Small() {
        return TablerIconsN.numberN47Small();
    }

    public static Icon numberN48Small() {
        return TablerIconsN.numberN48Small();
    }

    public static Icon numberN49Small() {
        return TablerIconsN.numberN49Small();
    }

    public static Icon numberN5() {
        return TablerIconsN.numberN5();
    }

    public static Icon numberN5Small() {
        return TablerIconsN.numberN5Small();
    }

    public static Icon numberN50Small() {
        return TablerIconsN.numberN50Small();
    }

    public static Icon numberN51Small() {
        return TablerIconsN.numberN51Small();
    }

    public static Icon numberN52Small() {
        return TablerIconsN.numberN52Small();
    }

    public static Icon numberN53Small() {
        return TablerIconsN.numberN53Small();
    }

    public static Icon numberN54Small() {
        return TablerIconsN.numberN54Small();
    }

    public static Icon numberN55Small() {
        return TablerIconsN.numberN55Small();
    }

    public static Icon numberN56Small() {
        return TablerIconsN.numberN56Small();
    }

    public static Icon numberN57Small() {
        return TablerIconsN.numberN57Small();
    }

    public static Icon numberN58Small() {
        return TablerIconsN.numberN58Small();
    }

    public static Icon numberN59Small() {
        return TablerIconsN.numberN59Small();
    }

    public static Icon numberN6() {
        return TablerIconsN.numberN6();
    }

    public static Icon numberN6Small() {
        return TablerIconsN.numberN6Small();
    }

    public static Icon numberN60Small() {
        return TablerIconsN.numberN60Small();
    }

    public static Icon numberN61Small() {
        return TablerIconsN.numberN61Small();
    }

    public static Icon numberN62Small() {
        return TablerIconsN.numberN62Small();
    }

    public static Icon numberN63Small() {
        return TablerIconsN.numberN63Small();
    }

    public static Icon numberN64Small() {
        return TablerIconsN.numberN64Small();
    }

    public static Icon numberN65Small() {
        return TablerIconsN.numberN65Small();
    }

    public static Icon numberN66Small() {
        return TablerIconsN.numberN66Small();
    }

    public static Icon numberN67Small() {
        return TablerIconsN.numberN67Small();
    }

    public static Icon numberN68Small() {
        return TablerIconsN.numberN68Small();
    }

    public static Icon numberN69Small() {
        return TablerIconsN.numberN69Small();
    }

    public static Icon numberN7() {
        return TablerIconsN.numberN7();
    }

    public static Icon numberN7Small() {
        return TablerIconsN.numberN7Small();
    }

    public static Icon numberN70Small() {
        return TablerIconsN.numberN70Small();
    }

    public static Icon numberN71Small() {
        return TablerIconsN.numberN71Small();
    }

    public static Icon numberN72Small() {
        return TablerIconsN.numberN72Small();
    }

    public static Icon numberN73Small() {
        return TablerIconsN.numberN73Small();
    }

    public static Icon numberN74Small() {
        return TablerIconsN.numberN74Small();
    }

    public static Icon numberN75Small() {
        return TablerIconsN.numberN75Small();
    }

    public static Icon numberN76Small() {
        return TablerIconsN.numberN76Small();
    }

    public static Icon numberN77Small() {
        return TablerIconsN.numberN77Small();
    }

    public static Icon numberN78Small() {
        return TablerIconsN.numberN78Small();
    }

    public static Icon numberN79Small() {
        return TablerIconsN.numberN79Small();
    }

    public static Icon numberN8() {
        return TablerIconsN.numberN8();
    }

    public static Icon numberN8Small() {
        return TablerIconsN.numberN8Small();
    }

    public static Icon numberN80Small() {
        return TablerIconsN.numberN80Small();
    }

    public static Icon numberN81Small() {
        return TablerIconsN.numberN81Small();
    }

    public static Icon numberN82Small() {
        return TablerIconsN.numberN82Small();
    }

    public static Icon numberN83Small() {
        return TablerIconsN.numberN83Small();
    }

    public static Icon numberN84Small() {
        return TablerIconsN.numberN84Small();
    }

    public static Icon numberN85Small() {
        return TablerIconsN.numberN85Small();
    }

    public static Icon numberN86Small() {
        return TablerIconsN.numberN86Small();
    }

    public static Icon numberN87Small() {
        return TablerIconsN.numberN87Small();
    }

    public static Icon numberN88Small() {
        return TablerIconsN.numberN88Small();
    }

    public static Icon numberN89Small() {
        return TablerIconsN.numberN89Small();
    }

    public static Icon numberN9() {
        return TablerIconsN.numberN9();
    }

    public static Icon numberN9Small() {
        return TablerIconsN.numberN9Small();
    }

    public static Icon numberN90Small() {
        return TablerIconsN.numberN90Small();
    }

    public static Icon numberN91Small() {
        return TablerIconsN.numberN91Small();
    }

    public static Icon numberN92Small() {
        return TablerIconsN.numberN92Small();
    }

    public static Icon numberN93Small() {
        return TablerIconsN.numberN93Small();
    }

    public static Icon numberN94Small() {
        return TablerIconsN.numberN94Small();
    }

    public static Icon numberN95Small() {
        return TablerIconsN.numberN95Small();
    }

    public static Icon numberN96Small() {
        return TablerIconsN.numberN96Small();
    }

    public static Icon numberN97Small() {
        return TablerIconsN.numberN97Small();
    }

    public static Icon numberN98Small() {
        return TablerIconsN.numberN98Small();
    }

    public static Icon numberN99Small() {
        return TablerIconsN.numberN99Small();
    }

    public static Icon numbers() {
        return TablerIconsN.numbers();
    }

    public static Icon nurse() {
        return TablerIconsN.nurse();
    }

    public static Icon nut() {
        return TablerIconsN.nut();
    }

    public static Icon objectScan() {
        return TablerIconsO.objectScan();
    }

    public static Icon octagon() {
        return TablerIconsO.octagon();
    }

    public static Icon octagonMinus() {
        return TablerIconsO.octagonMinus();
    }

    public static Icon octagonMinusN2() {
        return TablerIconsO.octagonMinusN2();
    }

    public static Icon octagonOff() {
        return TablerIconsO.octagonOff();
    }

    public static Icon octagonPlus() {
        return TablerIconsO.octagonPlus();
    }

    public static Icon octagonPlusN2() {
        return TablerIconsO.octagonPlusN2();
    }

    public static Icon octahedron() {
        return TablerIconsO.octahedron();
    }

    public static Icon octahedronOff() {
        return TablerIconsO.octahedronOff();
    }

    public static Icon octahedronPlus() {
        return TablerIconsO.octahedronPlus();
    }

    public static Icon old() {
        return TablerIconsO.old();
    }

    public static Icon olympicTorch() {
        return TablerIconsO.olympicTorch();
    }

    public static Icon olympics() {
        return TablerIconsO.olympics();
    }

    public static Icon olympicsOff() {
        return TablerIconsO.olympicsOff();
    }

    public static Icon om() {
        return TablerIconsO.om();
    }

    public static Icon omega() {
        return TablerIconsO.omega();
    }

    public static Icon option() {
        return TablerIconsO.option();
    }

    public static Icon outbound() {
        return TablerIconsO.outbound();
    }

    public static Icon outlet() {
        return TablerIconsO.outlet();
    }

    public static Icon oval() {
        return TablerIconsO.oval();
    }

    public static Icon ovalVertical() {
        return TablerIconsO.ovalVertical();
    }

    public static Icon overline() {
        return TablerIconsO.overline();
    }

    public static Icon packageIcon() {
        return TablerIconsP1.packageIcon();
    }

    public static Icon packageExport() {
        return TablerIconsP1.packageExport();
    }

    public static Icon packageImport() {
        return TablerIconsP1.packageImport();
    }

    public static Icon packageOff() {
        return TablerIconsP1.packageOff();
    }

    public static Icon packages() {
        return TablerIconsP1.packages();
    }

    public static Icon pacman() {
        return TablerIconsP1.pacman();
    }

    public static Icon pageBreak() {
        return TablerIconsP1.pageBreak();
    }

    public static Icon paint() {
        return TablerIconsP1.paint();
    }

    public static Icon paintOff() {
        return TablerIconsP1.paintOff();
    }

    public static Icon palette() {
        return TablerIconsP1.palette();
    }

    public static Icon paletteOff() {
        return TablerIconsP1.paletteOff();
    }

    public static Icon panoramaHorizontal() {
        return TablerIconsP1.panoramaHorizontal();
    }

    public static Icon panoramaHorizontalOff() {
        return TablerIconsP1.panoramaHorizontalOff();
    }

    public static Icon panoramaVertical() {
        return TablerIconsP1.panoramaVertical();
    }

    public static Icon panoramaVerticalOff() {
        return TablerIconsP1.panoramaVerticalOff();
    }

    public static Icon paperBag() {
        return TablerIconsP1.paperBag();
    }

    public static Icon paperBagOff() {
        return TablerIconsP1.paperBagOff();
    }

    public static Icon paperclip() {
        return TablerIconsP1.paperclip();
    }

    public static Icon parachute() {
        return TablerIconsP1.parachute();
    }

    public static Icon parachuteOff() {
        return TablerIconsP1.parachuteOff();
    }

    public static Icon parentheses() {
        return TablerIconsP1.parentheses();
    }

    public static Icon parenthesesOff() {
        return TablerIconsP1.parenthesesOff();
    }

    public static Icon parking() {
        return TablerIconsP1.parking();
    }

    public static Icon parkingCircle() {
        return TablerIconsP1.parkingCircle();
    }

    public static Icon parkingMeter() {
        return TablerIconsP1.parkingMeter();
    }

    public static Icon parkingOff() {
        return TablerIconsP1.parkingOff();
    }

    public static Icon password() {
        return TablerIconsP1.password();
    }

    public static Icon passwordFingerprint() {
        return TablerIconsP1.passwordFingerprint();
    }

    public static Icon passwordMobilePhone() {
        return TablerIconsP1.passwordMobilePhone();
    }

    public static Icon passwordUser() {
        return TablerIconsP1.passwordUser();
    }

    public static Icon paw() {
        return TablerIconsP1.paw();
    }

    public static Icon pawOff() {
        return TablerIconsP1.pawOff();
    }

    public static Icon paywall() {
        return TablerIconsP1.paywall();
    }

    public static Icon pdf() {
        return TablerIconsP1.pdf();
    }

    public static Icon peace() {
        return TablerIconsP1.peace();
    }

    public static Icon pencil() {
        return TablerIconsP1.pencil();
    }

    public static Icon pencilBolt() {
        return TablerIconsP1.pencilBolt();
    }

    public static Icon pencilCancel() {
        return TablerIconsP1.pencilCancel();
    }

    public static Icon pencilCheck() {
        return TablerIconsP1.pencilCheck();
    }

    public static Icon pencilCode() {
        return TablerIconsP1.pencilCode();
    }

    public static Icon pencilCog() {
        return TablerIconsP1.pencilCog();
    }

    public static Icon pencilDiscount() {
        return TablerIconsP1.pencilDiscount();
    }

    public static Icon pencilDollar() {
        return TablerIconsP1.pencilDollar();
    }

    public static Icon pencilDown() {
        return TablerIconsP1.pencilDown();
    }

    public static Icon pencilExclamation() {
        return TablerIconsP1.pencilExclamation();
    }

    public static Icon pencilHeart() {
        return TablerIconsP1.pencilHeart();
    }

    public static Icon pencilMinus() {
        return TablerIconsP1.pencilMinus();
    }

    public static Icon pencilOff() {
        return TablerIconsP1.pencilOff();
    }

    public static Icon pencilPause() {
        return TablerIconsP1.pencilPause();
    }

    public static Icon pencilPin() {
        return TablerIconsP1.pencilPin();
    }

    public static Icon pencilPlus() {
        return TablerIconsP1.pencilPlus();
    }

    public static Icon pencilQuestion() {
        return TablerIconsP1.pencilQuestion();
    }

    public static Icon pencilSearch() {
        return TablerIconsP1.pencilSearch();
    }

    public static Icon pencilShare() {
        return TablerIconsP1.pencilShare();
    }

    public static Icon pencilStar() {
        return TablerIconsP1.pencilStar();
    }

    public static Icon pencilUp() {
        return TablerIconsP1.pencilUp();
    }

    public static Icon pencilX() {
        return TablerIconsP1.pencilX();
    }

    public static Icon pendulum() {
        return TablerIconsP1.pendulum();
    }

    public static Icon pennant() {
        return TablerIconsP1.pennant();
    }

    public static Icon pennantN2() {
        return TablerIconsP1.pennantN2();
    }

    public static Icon pennantOff() {
        return TablerIconsP1.pennantOff();
    }

    public static Icon pentagon() {
        return TablerIconsP1.pentagon();
    }

    public static Icon pentagonMinus() {
        return TablerIconsP1.pentagonMinus();
    }

    public static Icon pentagonNumberN0() {
        return TablerIconsP1.pentagonNumberN0();
    }

    public static Icon pentagonNumberN1() {
        return TablerIconsP1.pentagonNumberN1();
    }

    public static Icon pentagonNumberN2() {
        return TablerIconsP1.pentagonNumberN2();
    }

    public static Icon pentagonNumberN3() {
        return TablerIconsP1.pentagonNumberN3();
    }

    public static Icon pentagonNumberN4() {
        return TablerIconsP1.pentagonNumberN4();
    }

    public static Icon pentagonNumberN5() {
        return TablerIconsP1.pentagonNumberN5();
    }

    public static Icon pentagonNumberN6() {
        return TablerIconsP1.pentagonNumberN6();
    }

    public static Icon pentagonNumberN7() {
        return TablerIconsP1.pentagonNumberN7();
    }

    public static Icon pentagonNumberN8() {
        return TablerIconsP1.pentagonNumberN8();
    }

    public static Icon pentagonNumberN9() {
        return TablerIconsP1.pentagonNumberN9();
    }

    public static Icon pentagonOff() {
        return TablerIconsP1.pentagonOff();
    }

    public static Icon pentagonPlus() {
        return TablerIconsP1.pentagonPlus();
    }

    public static Icon pentagonX() {
        return TablerIconsP1.pentagonX();
    }

    public static Icon pentagram() {
        return TablerIconsP1.pentagram();
    }

    public static Icon pepper() {
        return TablerIconsP1.pepper();
    }

    public static Icon pepperOff() {
        return TablerIconsP1.pepperOff();
    }

    public static Icon percentage() {
        return TablerIconsP1.percentage();
    }

    public static Icon percentageN0() {
        return TablerIconsP1.percentageN0();
    }

    public static Icon percentageN10() {
        return TablerIconsP1.percentageN10();
    }

    public static Icon percentageN100() {
        return TablerIconsP1.percentageN100();
    }

    public static Icon percentageN20() {
        return TablerIconsP1.percentageN20();
    }

    public static Icon percentageN25() {
        return TablerIconsP1.percentageN25();
    }

    public static Icon percentageN30() {
        return TablerIconsP1.percentageN30();
    }

    public static Icon percentageN33() {
        return TablerIconsP1.percentageN33();
    }

    public static Icon percentageN40() {
        return TablerIconsP1.percentageN40();
    }

    public static Icon percentageN50() {
        return TablerIconsP1.percentageN50();
    }

    public static Icon percentageN60() {
        return TablerIconsP1.percentageN60();
    }

    public static Icon percentageN66() {
        return TablerIconsP1.percentageN66();
    }

    public static Icon percentageN70() {
        return TablerIconsP1.percentageN70();
    }

    public static Icon percentageN75() {
        return TablerIconsP1.percentageN75();
    }

    public static Icon percentageN80() {
        return TablerIconsP1.percentageN80();
    }

    public static Icon percentageN90() {
        return TablerIconsP1.percentageN90();
    }

    public static Icon perfume() {
        return TablerIconsP1.perfume();
    }

    public static Icon perspective() {
        return TablerIconsP1.perspective();
    }

    public static Icon perspectiveOff() {
        return TablerIconsP1.perspectiveOff();
    }

    public static Icon phone() {
        return TablerIconsP1.phone();
    }

    public static Icon phoneCall() {
        return TablerIconsP1.phoneCall();
    }

    public static Icon phoneCalling() {
        return TablerIconsP1.phoneCalling();
    }

    public static Icon phoneCheck() {
        return TablerIconsP1.phoneCheck();
    }

    public static Icon phoneDone() {
        return TablerIconsP1.phoneDone();
    }

    public static Icon phoneEnd() {
        return TablerIconsP1.phoneEnd();
    }

    public static Icon phoneIncoming() {
        return TablerIconsP1.phoneIncoming();
    }

    public static Icon phoneOff() {
        return TablerIconsP1.phoneOff();
    }

    public static Icon phoneOutgoing() {
        return TablerIconsP1.phoneOutgoing();
    }

    public static Icon phonePause() {
        return TablerIconsP1.phonePause();
    }

    public static Icon phonePlus() {
        return TablerIconsP1.phonePlus();
    }

    public static Icon phoneRinging() {
        return TablerIconsP1.phoneRinging();
    }

    public static Icon phoneSpark() {
        return TablerIconsP1.phoneSpark();
    }

    public static Icon phoneX() {
        return TablerIconsP1.phoneX();
    }

    public static Icon photo() {
        return TablerIconsP1.photo();
    }

    public static Icon photoAi() {
        return TablerIconsP1.photoAi();
    }

    public static Icon photoAlt() {
        return TablerIconsP1.photoAlt();
    }

    public static Icon photoBitcoin() {
        return TablerIconsP1.photoBitcoin();
    }

    public static Icon photoBolt() {
        return TablerIconsP1.photoBolt();
    }

    public static Icon photoCancel() {
        return TablerIconsP1.photoCancel();
    }

    public static Icon photoCheck() {
        return TablerIconsP1.photoCheck();
    }

    public static Icon photoCircle() {
        return TablerIconsP1.photoCircle();
    }

    public static Icon photoCircleMinus() {
        return TablerIconsP1.photoCircleMinus();
    }

    public static Icon photoCirclePlus() {
        return TablerIconsP1.photoCirclePlus();
    }

    public static Icon photoCode() {
        return TablerIconsP1.photoCode();
    }

    public static Icon photoCog() {
        return TablerIconsP1.photoCog();
    }

    public static Icon photoDollar() {
        return TablerIconsP1.photoDollar();
    }

    public static Icon photoDown() {
        return TablerIconsP1.photoDown();
    }

    public static Icon photoEdit() {
        return TablerIconsP1.photoEdit();
    }

    public static Icon photoExclamation() {
        return TablerIconsP1.photoExclamation();
    }

    public static Icon photoHeart() {
        return TablerIconsP1.photoHeart();
    }

    public static Icon photoHexagon() {
        return TablerIconsP1.photoHexagon();
    }

    public static Icon photoMinus() {
        return TablerIconsP1.photoMinus();
    }

    public static Icon photoOff() {
        return TablerIconsP1.photoOff();
    }

    public static Icon photoPause() {
        return TablerIconsP1.photoPause();
    }

    public static Icon photoPentagon() {
        return TablerIconsP1.photoPentagon();
    }

    public static Icon photoPin() {
        return TablerIconsP1.photoPin();
    }

    public static Icon photoPlus() {
        return TablerIconsP1.photoPlus();
    }

    public static Icon photoQuestion() {
        return TablerIconsP1.photoQuestion();
    }

    public static Icon photoScan() {
        return TablerIconsP1.photoScan();
    }

    public static Icon photoSearch() {
        return TablerIconsP1.photoSearch();
    }

    public static Icon photoSensor() {
        return TablerIconsP1.photoSensor();
    }

    public static Icon photoSensorN2() {
        return TablerIconsP1.photoSensorN2();
    }

    public static Icon photoSensorN3() {
        return TablerIconsP1.photoSensorN3();
    }

    public static Icon photoShare() {
        return TablerIconsP1.photoShare();
    }

    public static Icon photoShield() {
        return TablerIconsP1.photoShield();
    }

    public static Icon photoSpark() {
        return TablerIconsP1.photoSpark();
    }

    public static Icon photoSquareRounded() {
        return TablerIconsP1.photoSquareRounded();
    }

    public static Icon photoStar() {
        return TablerIconsP1.photoStar();
    }

    public static Icon photoUp() {
        return TablerIconsP1.photoUp();
    }

    public static Icon photoVideo() {
        return TablerIconsP1.photoVideo();
    }

    public static Icon photoX() {
        return TablerIconsP1.photoX();
    }

    public static Icon physotherapist() {
        return TablerIconsP1.physotherapist();
    }

    public static Icon piano() {
        return TablerIconsP1.piano();
    }

    public static Icon pick() {
        return TablerIconsP1.pick();
    }

    public static Icon picnicTable() {
        return TablerIconsP1.picnicTable();
    }

    public static Icon pictureInPicture() {
        return TablerIconsP1.pictureInPicture();
    }

    public static Icon pictureInPictureOff() {
        return TablerIconsP1.pictureInPictureOff();
    }

    public static Icon pictureInPictureOn() {
        return TablerIconsP1.pictureInPictureOn();
    }

    public static Icon pictureInPictureTop() {
        return TablerIconsP1.pictureInPictureTop();
    }

    public static Icon pig() {
        return TablerIconsP1.pig();
    }

    public static Icon pigMoney() {
        return TablerIconsP1.pigMoney();
    }

    public static Icon pigOff() {
        return TablerIconsP1.pigOff();
    }

    public static Icon pilcrow() {
        return TablerIconsP1.pilcrow();
    }

    public static Icon pilcrowLeft() {
        return TablerIconsP1.pilcrowLeft();
    }

    public static Icon pilcrowRight() {
        return TablerIconsP1.pilcrowRight();
    }

    public static Icon pill() {
        return TablerIconsP1.pill();
    }

    public static Icon pillOff() {
        return TablerIconsP1.pillOff();
    }

    public static Icon pillow() {
        return TablerIconsP1.pillow();
    }

    public static Icon pills() {
        return TablerIconsP1.pills();
    }

    public static Icon pin() {
        return TablerIconsP1.pin();
    }

    public static Icon pinEnd() {
        return TablerIconsP1.pinEnd();
    }

    public static Icon pinInvoke() {
        return TablerIconsP1.pinInvoke();
    }

    public static Icon pingPong() {
        return TablerIconsP1.pingPong();
    }

    public static Icon pinned() {
        return TablerIconsP1.pinned();
    }

    public static Icon pinnedOff() {
        return TablerIconsP1.pinnedOff();
    }

    public static Icon pipeline() {
        return TablerIconsP1.pipeline();
    }

    public static Icon pizza() {
        return TablerIconsP1.pizza();
    }

    public static Icon pizzaOff() {
        return TablerIconsP1.pizzaOff();
    }

    public static Icon placeholder() {
        return TablerIconsP1.placeholder();
    }

    public static Icon plane() {
        return TablerIconsP1.plane();
    }

    public static Icon planeArrival() {
        return TablerIconsP1.planeArrival();
    }

    public static Icon planeDeparture() {
        return TablerIconsP2.planeDeparture();
    }

    public static Icon planeInflight() {
        return TablerIconsP2.planeInflight();
    }

    public static Icon planeOff() {
        return TablerIconsP2.planeOff();
    }

    public static Icon planeTilt() {
        return TablerIconsP2.planeTilt();
    }

    public static Icon planet() {
        return TablerIconsP2.planet();
    }

    public static Icon planetOff() {
        return TablerIconsP2.planetOff();
    }

    public static Icon plant() {
        return TablerIconsP2.plant();
    }

    public static Icon plantN2() {
        return TablerIconsP2.plantN2();
    }

    public static Icon plantN2Off() {
        return TablerIconsP2.plantN2Off();
    }

    public static Icon plantOff() {
        return TablerIconsP2.plantOff();
    }

    public static Icon playBasketball() {
        return TablerIconsP2.playBasketball();
    }

    public static Icon playCard() {
        return TablerIconsP2.playCard();
    }

    public static Icon playCardN1() {
        return TablerIconsP2.playCardN1();
    }

    public static Icon playCardN10() {
        return TablerIconsP2.playCardN10();
    }

    public static Icon playCardN2() {
        return TablerIconsP2.playCardN2();
    }

    public static Icon playCardN3() {
        return TablerIconsP2.playCardN3();
    }

    public static Icon playCardN4() {
        return TablerIconsP2.playCardN4();
    }

    public static Icon playCardN5() {
        return TablerIconsP2.playCardN5();
    }

    public static Icon playCardN6() {
        return TablerIconsP2.playCardN6();
    }

    public static Icon playCardN7() {
        return TablerIconsP2.playCardN7();
    }

    public static Icon playCardN8() {
        return TablerIconsP2.playCardN8();
    }

    public static Icon playCardN9() {
        return TablerIconsP2.playCardN9();
    }

    public static Icon playCardA() {
        return TablerIconsP2.playCardA();
    }

    public static Icon playCardJ() {
        return TablerIconsP2.playCardJ();
    }

    public static Icon playCardK() {
        return TablerIconsP2.playCardK();
    }

    public static Icon playCardOff() {
        return TablerIconsP2.playCardOff();
    }

    public static Icon playCardQ() {
        return TablerIconsP2.playCardQ();
    }

    public static Icon playCardStar() {
        return TablerIconsP2.playCardStar();
    }

    public static Icon playFootball() {
        return TablerIconsP2.playFootball();
    }

    public static Icon playHandball() {
        return TablerIconsP2.playHandball();
    }

    public static Icon playVolleyball() {
        return TablerIconsP2.playVolleyball();
    }

    public static Icon playerEject() {
        return TablerIconsP2.playerEject();
    }

    public static Icon playerPause() {
        return TablerIconsP2.playerPause();
    }

    public static Icon playerPlay() {
        return TablerIconsP2.playerPlay();
    }

    public static Icon playerRecord() {
        return TablerIconsP2.playerRecord();
    }

    public static Icon playerSkipBack() {
        return TablerIconsP2.playerSkipBack();
    }

    public static Icon playerSkipForward() {
        return TablerIconsP2.playerSkipForward();
    }

    public static Icon playerStop() {
        return TablerIconsP2.playerStop();
    }

    public static Icon playerTrackNext() {
        return TablerIconsP2.playerTrackNext();
    }

    public static Icon playerTrackPrev() {
        return TablerIconsP2.playerTrackPrev();
    }

    public static Icon playlist() {
        return TablerIconsP2.playlist();
    }

    public static Icon playlistAdd() {
        return TablerIconsP2.playlistAdd();
    }

    public static Icon playlistOff() {
        return TablerIconsP2.playlistOff();
    }

    public static Icon playlistX() {
        return TablerIconsP2.playlistX();
    }

    public static Icon playstationCircle() {
        return TablerIconsP2.playstationCircle();
    }

    public static Icon playstationSquare() {
        return TablerIconsP2.playstationSquare();
    }

    public static Icon playstationTriangle() {
        return TablerIconsP2.playstationTriangle();
    }

    public static Icon playstationX() {
        return TablerIconsP2.playstationX();
    }

    public static Icon plug() {
        return TablerIconsP2.plug();
    }

    public static Icon plugConnected() {
        return TablerIconsP2.plugConnected();
    }

    public static Icon plugConnectedX() {
        return TablerIconsP2.plugConnectedX();
    }

    public static Icon plugOff() {
        return TablerIconsP2.plugOff();
    }

    public static Icon plugX() {
        return TablerIconsP2.plugX();
    }

    public static Icon plunger() {
        return TablerIconsP2.plunger();
    }

    public static Icon plus() {
        return TablerIconsP2.plus();
    }

    public static Icon plusEqual() {
        return TablerIconsP2.plusEqual();
    }

    public static Icon plusMinus() {
        return TablerIconsP2.plusMinus();
    }

    public static Icon png() {
        return TablerIconsP2.png();
    }

    public static Icon podium() {
        return TablerIconsP2.podium();
    }

    public static Icon podiumOff() {
        return TablerIconsP2.podiumOff();
    }

    public static Icon point() {
        return TablerIconsP2.point();
    }

    public static Icon pointOff() {
        return TablerIconsP2.pointOff();
    }

    public static Icon pointer() {
        return TablerIconsP2.pointer();
    }

    public static Icon pointerN2() {
        return TablerIconsP2.pointerN2();
    }

    public static Icon pointerBolt() {
        return TablerIconsP2.pointerBolt();
    }

    public static Icon pointerCancel() {
        return TablerIconsP2.pointerCancel();
    }

    public static Icon pointerCheck() {
        return TablerIconsP2.pointerCheck();
    }

    public static Icon pointerCode() {
        return TablerIconsP2.pointerCode();
    }

    public static Icon pointerCog() {
        return TablerIconsP2.pointerCog();
    }

    public static Icon pointerCollaboration() {
        return TablerIconsP2.pointerCollaboration();
    }

    public static Icon pointerCollaborationN2() {
        return TablerIconsP2.pointerCollaborationN2();
    }

    public static Icon pointerDollar() {
        return TablerIconsP2.pointerDollar();
    }

    public static Icon pointerDown() {
        return TablerIconsP2.pointerDown();
    }

    public static Icon pointerExclamation() {
        return TablerIconsP2.pointerExclamation();
    }

    public static Icon pointerHeart() {
        return TablerIconsP2.pointerHeart();
    }

    public static Icon pointerMinus() {
        return TablerIconsP2.pointerMinus();
    }

    public static Icon pointerOff() {
        return TablerIconsP2.pointerOff();
    }

    public static Icon pointerPause() {
        return TablerIconsP2.pointerPause();
    }

    public static Icon pointerPin() {
        return TablerIconsP2.pointerPin();
    }

    public static Icon pointerPlus() {
        return TablerIconsP2.pointerPlus();
    }

    public static Icon pointerQuestion() {
        return TablerIconsP2.pointerQuestion();
    }

    public static Icon pointerSearch() {
        return TablerIconsP2.pointerSearch();
    }

    public static Icon pointerShare() {
        return TablerIconsP2.pointerShare();
    }

    public static Icon pointerStar() {
        return TablerIconsP2.pointerStar();
    }

    public static Icon pointerUp() {
        return TablerIconsP2.pointerUp();
    }

    public static Icon pointerX() {
        return TablerIconsP2.pointerX();
    }

    public static Icon pokeball() {
        return TablerIconsP2.pokeball();
    }

    public static Icon pokeballOff() {
        return TablerIconsP2.pokeballOff();
    }

    public static Icon pokerChip() {
        return TablerIconsP2.pokerChip();
    }

    public static Icon polaroid() {
        return TablerIconsP2.polaroid();
    }

    public static Icon polygon() {
        return TablerIconsP2.polygon();
    }

    public static Icon polygonOff() {
        return TablerIconsP2.polygonOff();
    }

    public static Icon poo() {
        return TablerIconsP2.poo();
    }

    public static Icon pool() {
        return TablerIconsP2.pool();
    }

    public static Icon poolOff() {
        return TablerIconsP2.poolOff();
    }

    public static Icon power() {
        return TablerIconsP2.power();
    }

    public static Icon pray() {
        return TablerIconsP2.pray();
    }

    public static Icon premiumRights() {
        return TablerIconsP2.premiumRights();
    }

    public static Icon prescription() {
        return TablerIconsP2.prescription();
    }

    public static Icon presentation() {
        return TablerIconsP2.presentation();
    }

    public static Icon presentationAnalytics() {
        return TablerIconsP2.presentationAnalytics();
    }

    public static Icon presentationOff() {
        return TablerIconsP2.presentationOff();
    }

    public static Icon printer() {
        return TablerIconsP2.printer();
    }

    public static Icon printerOff() {
        return TablerIconsP2.printerOff();
    }

    public static Icon prism() {
        return TablerIconsP2.prism();
    }

    public static Icon prismLight() {
        return TablerIconsP2.prismLight();
    }

    public static Icon prismOff() {
        return TablerIconsP2.prismOff();
    }

    public static Icon prismPlus() {
        return TablerIconsP2.prismPlus();
    }

    public static Icon prison() {
        return TablerIconsP2.prison();
    }

    public static Icon progress() {
        return TablerIconsP2.progress();
    }

    public static Icon progressAlert() {
        return TablerIconsP2.progressAlert();
    }

    public static Icon progressBolt() {
        return TablerIconsP2.progressBolt();
    }

    public static Icon progressCheck() {
        return TablerIconsP2.progressCheck();
    }

    public static Icon progressDown() {
        return TablerIconsP2.progressDown();
    }

    public static Icon progressHelp() {
        return TablerIconsP2.progressHelp();
    }

    public static Icon progressX() {
        return TablerIconsP2.progressX();
    }

    public static Icon prompt() {
        return TablerIconsP2.prompt();
    }

    public static Icon prong() {
        return TablerIconsP2.prong();
    }

    public static Icon propeller() {
        return TablerIconsP2.propeller();
    }

    public static Icon propellerOff() {
        return TablerIconsP2.propellerOff();
    }

    public static Icon protocol() {
        return TablerIconsP2.protocol();
    }

    public static Icon pumpkinScary() {
        return TablerIconsP2.pumpkinScary();
    }

    public static Icon puzzle() {
        return TablerIconsP2.puzzle();
    }

    public static Icon puzzleN2() {
        return TablerIconsP2.puzzleN2();
    }

    public static Icon puzzleOff() {
        return TablerIconsP2.puzzleOff();
    }

    public static Icon pyramid() {
        return TablerIconsP2.pyramid();
    }

    public static Icon pyramidOff() {
        return TablerIconsP2.pyramidOff();
    }

    public static Icon pyramidPlus() {
        return TablerIconsP2.pyramidPlus();
    }

    public static Icon qrcode() {
        return TablerIconsQ.qrcode();
    }

    public static Icon qrcodeOff() {
        return TablerIconsQ.qrcodeOff();
    }

    public static Icon questionMark() {
        return TablerIconsQ.questionMark();
    }

    public static Icon queuePopIn() {
        return TablerIconsQ.queuePopIn();
    }

    public static Icon queuePopOut() {
        return TablerIconsQ.queuePopOut();
    }

    public static Icon quote() {
        return TablerIconsQ.quote();
    }

    public static Icon quoteOff() {
        return TablerIconsQ.quoteOff();
    }

    public static Icon quoteOpen() {
        return TablerIconsQ.quoteOpen();
    }

    public static Icon quotes() {
        return TablerIconsQ.quotes();
    }

    public static Icon radar() {
        return TablerIconsR.radar();
    }

    public static Icon radarN2() {
        return TablerIconsR.radarN2();
    }

    public static Icon radarOff() {
        return TablerIconsR.radarOff();
    }

    public static Icon radio() {
        return TablerIconsR.radio();
    }

    public static Icon radioOff() {
        return TablerIconsR.radioOff();
    }

    public static Icon radioactive() {
        return TablerIconsR.radioactive();
    }

    public static Icon radioactiveOff() {
        return TablerIconsR.radioactiveOff();
    }

    public static Icon radiusBottomLeft() {
        return TablerIconsR.radiusBottomLeft();
    }

    public static Icon radiusBottomRight() {
        return TablerIconsR.radiusBottomRight();
    }

    public static Icon radiusTopLeft() {
        return TablerIconsR.radiusTopLeft();
    }

    public static Icon radiusTopRight() {
        return TablerIconsR.radiusTopRight();
    }

    public static Icon rainbow() {
        return TablerIconsR.rainbow();
    }

    public static Icon rainbowOff() {
        return TablerIconsR.rainbowOff();
    }

    public static Icon ratingN12Plus() {
        return TablerIconsR.ratingN12Plus();
    }

    public static Icon ratingN14Plus() {
        return TablerIconsR.ratingN14Plus();
    }

    public static Icon ratingN16Plus() {
        return TablerIconsR.ratingN16Plus();
    }

    public static Icon ratingN18Plus() {
        return TablerIconsR.ratingN18Plus();
    }

    public static Icon ratingN21Plus() {
        return TablerIconsR.ratingN21Plus();
    }

    public static Icon razor() {
        return TablerIconsR.razor();
    }

    public static Icon razorElectric() {
        return TablerIconsR.razorElectric();
    }

    public static Icon receipt() {
        return TablerIconsR.receipt();
    }

    public static Icon receiptN2() {
        return TablerIconsR.receiptN2();
    }

    public static Icon receiptBitcoin() {
        return TablerIconsR.receiptBitcoin();
    }

    public static Icon receiptDollar() {
        return TablerIconsR.receiptDollar();
    }

    public static Icon receiptEuro() {
        return TablerIconsR.receiptEuro();
    }

    public static Icon receiptOff() {
        return TablerIconsR.receiptOff();
    }

    public static Icon receiptPound() {
        return TablerIconsR.receiptPound();
    }

    public static Icon receiptRefund() {
        return TablerIconsR.receiptRefund();
    }

    public static Icon receiptRupee() {
        return TablerIconsR.receiptRupee();
    }

    public static Icon receiptTax() {
        return TablerIconsR.receiptTax();
    }

    public static Icon receiptYen() {
        return TablerIconsR.receiptYen();
    }

    public static Icon receiptYuan() {
        return TablerIconsR.receiptYuan();
    }

    public static Icon recharging() {
        return TablerIconsR.recharging();
    }

    public static Icon recordMail() {
        return TablerIconsR.recordMail();
    }

    public static Icon recordMailOff() {
        return TablerIconsR.recordMailOff();
    }

    public static Icon rectangle() {
        return TablerIconsR.rectangle();
    }

    public static Icon rectangleRoundedBottom() {
        return TablerIconsR.rectangleRoundedBottom();
    }

    public static Icon rectangleRoundedTop() {
        return TablerIconsR.rectangleRoundedTop();
    }

    public static Icon rectangleVertical() {
        return TablerIconsR.rectangleVertical();
    }

    public static Icon rectangularPrism() {
        return TablerIconsR.rectangularPrism();
    }

    public static Icon rectangularPrismOff() {
        return TablerIconsR.rectangularPrismOff();
    }

    public static Icon rectangularPrismPlus() {
        return TablerIconsR.rectangularPrismPlus();
    }

    public static Icon recycle() {
        return TablerIconsR.recycle();
    }

    public static Icon recycleOff() {
        return TablerIconsR.recycleOff();
    }

    public static Icon refresh() {
        return TablerIconsR.refresh();
    }

    public static Icon refreshAlert() {
        return TablerIconsR.refreshAlert();
    }

    public static Icon refreshDot() {
        return TablerIconsR.refreshDot();
    }

    public static Icon refreshOff() {
        return TablerIconsR.refreshOff();
    }

    public static Icon regex() {
        return TablerIconsR.regex();
    }

    public static Icon regexOff() {
        return TablerIconsR.regexOff();
    }

    public static Icon registered() {
        return TablerIconsR.registered();
    }

    public static Icon relationManyToMany() {
        return TablerIconsR.relationManyToMany();
    }

    public static Icon relationOneToMany() {
        return TablerIconsR.relationOneToMany();
    }

    public static Icon relationOneToOne() {
        return TablerIconsR.relationOneToOne();
    }

    public static Icon reload() {
        return TablerIconsR.reload();
    }

    public static Icon reorder() {
        return TablerIconsR.reorder();
    }

    public static Icon repeat() {
        return TablerIconsR.repeat();
    }

    public static Icon repeatOff() {
        return TablerIconsR.repeatOff();
    }

    public static Icon repeatOnce() {
        return TablerIconsR.repeatOnce();
    }

    public static Icon replace() {
        return TablerIconsR.replace();
    }

    public static Icon replaceOff() {
        return TablerIconsR.replaceOff();
    }

    public static Icon replaceUser() {
        return TablerIconsR.replaceUser();
    }

    public static Icon report() {
        return TablerIconsR.report();
    }

    public static Icon reportAnalytics() {
        return TablerIconsR.reportAnalytics();
    }

    public static Icon reportMedical() {
        return TablerIconsR.reportMedical();
    }

    public static Icon reportMoney() {
        return TablerIconsR.reportMoney();
    }

    public static Icon reportOff() {
        return TablerIconsR.reportOff();
    }

    public static Icon reportSearch() {
        return TablerIconsR.reportSearch();
    }

    public static Icon reservedLine() {
        return TablerIconsR.reservedLine();
    }

    public static Icon resize() {
        return TablerIconsR.resize();
    }

    public static Icon restore() {
        return TablerIconsR.restore();
    }

    public static Icon rewindBackwardN10() {
        return TablerIconsR.rewindBackwardN10();
    }

    public static Icon rewindBackwardN15() {
        return TablerIconsR.rewindBackwardN15();
    }

    public static Icon rewindBackwardN20() {
        return TablerIconsR.rewindBackwardN20();
    }

    public static Icon rewindBackwardN30() {
        return TablerIconsR.rewindBackwardN30();
    }

    public static Icon rewindBackwardN40() {
        return TablerIconsR.rewindBackwardN40();
    }

    public static Icon rewindBackwardN5() {
        return TablerIconsR.rewindBackwardN5();
    }

    public static Icon rewindBackwardN50() {
        return TablerIconsR.rewindBackwardN50();
    }

    public static Icon rewindBackwardN60() {
        return TablerIconsR.rewindBackwardN60();
    }

    public static Icon rewindForwardN10() {
        return TablerIconsR.rewindForwardN10();
    }

    public static Icon rewindForwardN15() {
        return TablerIconsR.rewindForwardN15();
    }

    public static Icon rewindForwardN20() {
        return TablerIconsR.rewindForwardN20();
    }

    public static Icon rewindForwardN30() {
        return TablerIconsR.rewindForwardN30();
    }

    public static Icon rewindForwardN40() {
        return TablerIconsR.rewindForwardN40();
    }

    public static Icon rewindForwardN5() {
        return TablerIconsR.rewindForwardN5();
    }

    public static Icon rewindForwardN50() {
        return TablerIconsR.rewindForwardN50();
    }

    public static Icon rewindForwardN60() {
        return TablerIconsR.rewindForwardN60();
    }

    public static Icon ribbonHealth() {
        return TablerIconsR.ribbonHealth();
    }

    public static Icon rings() {
        return TablerIconsR.rings();
    }

    public static Icon ripple() {
        return TablerIconsR.ripple();
    }

    public static Icon rippleDown() {
        return TablerIconsR.rippleDown();
    }

    public static Icon rippleOff() {
        return TablerIconsR.rippleOff();
    }

    public static Icon rippleUp() {
        return TablerIconsR.rippleUp();
    }

    public static Icon road() {
        return TablerIconsR.road();
    }

    public static Icon roadOff() {
        return TablerIconsR.roadOff();
    }

    public static Icon roadSign() {
        return TablerIconsR.roadSign();
    }

    public static Icon robot() {
        return TablerIconsR.robot();
    }

    public static Icon robotFace() {
        return TablerIconsR.robotFace();
    }

    public static Icon robotOff() {
        return TablerIconsR.robotOff();
    }

    public static Icon rocket() {
        return TablerIconsR.rocket();
    }

    public static Icon rocketOff() {
        return TablerIconsR.rocketOff();
    }

    public static Icon rollerSkating() {
        return TablerIconsR.rollerSkating();
    }

    public static Icon rollercoaster() {
        return TablerIconsR.rollercoaster();
    }

    public static Icon rollercoasterOff() {
        return TablerIconsR.rollercoasterOff();
    }

    public static Icon rosette() {
        return TablerIconsR.rosette();
    }

    public static Icon rosetteAsterisk() {
        return TablerIconsR.rosetteAsterisk();
    }

    public static Icon rosetteDiscount() {
        return TablerIconsR.rosetteDiscount();
    }

    public static Icon rosetteDiscountCheck() {
        return TablerIconsR.rosetteDiscountCheck();
    }

    public static Icon rosetteDiscountCheckOff() {
        return TablerIconsR.rosetteDiscountCheckOff();
    }

    public static Icon rosetteDiscountOff() {
        return TablerIconsR.rosetteDiscountOff();
    }

    public static Icon rosetteNumberN0() {
        return TablerIconsR.rosetteNumberN0();
    }

    public static Icon rosetteNumberN1() {
        return TablerIconsR.rosetteNumberN1();
    }

    public static Icon rosetteNumberN2() {
        return TablerIconsR.rosetteNumberN2();
    }

    public static Icon rosetteNumberN3() {
        return TablerIconsR.rosetteNumberN3();
    }

    public static Icon rosetteNumberN4() {
        return TablerIconsR.rosetteNumberN4();
    }

    public static Icon rosetteNumberN5() {
        return TablerIconsR.rosetteNumberN5();
    }

    public static Icon rosetteNumberN6() {
        return TablerIconsR.rosetteNumberN6();
    }

    public static Icon rosetteNumberN7() {
        return TablerIconsR.rosetteNumberN7();
    }

    public static Icon rosetteNumberN8() {
        return TablerIconsR.rosetteNumberN8();
    }

    public static Icon rosetteNumberN9() {
        return TablerIconsR.rosetteNumberN9();
    }

    public static Icon rotate() {
        return TablerIconsR.rotate();
    }

    public static Icon rotateN2() {
        return TablerIconsR.rotateN2();
    }

    public static Icon rotateN360() {
        return TablerIconsR.rotateN360();
    }

    public static Icon rotate3d() {
        return TablerIconsR.rotate3d();
    }

    public static Icon rotateClockwise() {
        return TablerIconsR.rotateClockwise();
    }

    public static Icon rotateClockwiseN2() {
        return TablerIconsR.rotateClockwiseN2();
    }

    public static Icon rotateDot() {
        return TablerIconsR.rotateDot();
    }

    public static Icon rotateRectangle() {
        return TablerIconsR.rotateRectangle();
    }

    public static Icon roulette() {
        return TablerIconsR.roulette();
    }

    public static Icon route() {
        return TablerIconsR.route();
    }

    public static Icon routeN2() {
        return TablerIconsR.routeN2();
    }

    public static Icon routeAltLeft() {
        return TablerIconsR.routeAltLeft();
    }

    public static Icon routeAltRight() {
        return TablerIconsR.routeAltRight();
    }

    public static Icon routeOff() {
        return TablerIconsR.routeOff();
    }

    public static Icon routeScan() {
        return TablerIconsR.routeScan();
    }

    public static Icon routeSquare() {
        return TablerIconsR.routeSquare();
    }

    public static Icon routeSquareN2() {
        return TablerIconsR.routeSquareN2();
    }

    public static Icon routeX() {
        return TablerIconsR.routeX();
    }

    public static Icon routeXN2() {
        return TablerIconsR.routeXN2();
    }

    public static Icon router() {
        return TablerIconsR.router();
    }

    public static Icon routerOff() {
        return TablerIconsR.routerOff();
    }

    public static Icon rowInsertBottom() {
        return TablerIconsR.rowInsertBottom();
    }

    public static Icon rowInsertTop() {
        return TablerIconsR.rowInsertTop();
    }

    public static Icon rowRemove() {
        return TablerIconsR.rowRemove();
    }

    public static Icon rss() {
        return TablerIconsR.rss();
    }

    public static Icon rubberStamp() {
        return TablerIconsR.rubberStamp();
    }

    public static Icon rubberStampOff() {
        return TablerIconsR.rubberStampOff();
    }

    public static Icon rugby() {
        return TablerIconsR.rugby();
    }

    public static Icon ruler() {
        return TablerIconsR.ruler();
    }

    public static Icon rulerN2() {
        return TablerIconsR.rulerN2();
    }

    public static Icon rulerN2Off() {
        return TablerIconsR.rulerN2Off();
    }

    public static Icon rulerN3() {
        return TablerIconsR.rulerN3();
    }

    public static Icon rulerMeasure() {
        return TablerIconsR.rulerMeasure();
    }

    public static Icon rulerMeasureN2() {
        return TablerIconsR.rulerMeasureN2();
    }

    public static Icon rulerOff() {
        return TablerIconsR.rulerOff();
    }

    public static Icon run() {
        return TablerIconsR.run();
    }

    public static Icon rvTruck() {
        return TablerIconsR.rvTruck();
    }

    public static Icon sTurnDown() {
        return TablerIconsS1.sTurnDown();
    }

    public static Icon sTurnLeft() {
        return TablerIconsS1.sTurnLeft();
    }

    public static Icon sTurnRight() {
        return TablerIconsS1.sTurnRight();
    }

    public static Icon sTurnUp() {
        return TablerIconsS1.sTurnUp();
    }

    public static Icon sailboat() {
        return TablerIconsS1.sailboat();
    }

    public static Icon sailboatN2() {
        return TablerIconsS1.sailboatN2();
    }

    public static Icon sailboatOff() {
        return TablerIconsS1.sailboatOff();
    }

    public static Icon salad() {
        return TablerIconsS1.salad();
    }

    public static Icon salt() {
        return TablerIconsS1.salt();
    }

    public static Icon sandbox() {
        return TablerIconsS1.sandbox();
    }

    public static Icon satellite() {
        return TablerIconsS1.satellite();
    }

    public static Icon satelliteOff() {
        return TablerIconsS1.satelliteOff();
    }

    public static Icon sausage() {
        return TablerIconsS1.sausage();
    }

    public static Icon scale() {
        return TablerIconsS1.scale();
    }

    public static Icon scaleOff() {
        return TablerIconsS1.scaleOff();
    }

    public static Icon scaleOutline() {
        return TablerIconsS1.scaleOutline();
    }

    public static Icon scaleOutlineOff() {
        return TablerIconsS1.scaleOutlineOff();
    }

    public static Icon scan() {
        return TablerIconsS1.scan();
    }

    public static Icon scanCube() {
        return TablerIconsS1.scanCube();
    }

    public static Icon scanEye() {
        return TablerIconsS1.scanEye();
    }

    public static Icon scanLetterA() {
        return TablerIconsS1.scanLetterA();
    }

    public static Icon scanLetterT() {
        return TablerIconsS1.scanLetterT();
    }

    public static Icon scanPosition() {
        return TablerIconsS1.scanPosition();
    }

    public static Icon scanTraces() {
        return TablerIconsS1.scanTraces();
    }

    public static Icon schema() {
        return TablerIconsS1.schema();
    }

    public static Icon schemaOff() {
        return TablerIconsS1.schemaOff();
    }

    public static Icon school() {
        return TablerIconsS1.school();
    }

    public static Icon schoolBell() {
        return TablerIconsS1.schoolBell();
    }

    public static Icon schoolOff() {
        return TablerIconsS1.schoolOff();
    }

    public static Icon scissors() {
        return TablerIconsS1.scissors();
    }

    public static Icon scissorsOff() {
        return TablerIconsS1.scissorsOff();
    }

    public static Icon scooter() {
        return TablerIconsS1.scooter();
    }

    public static Icon scooterElectric() {
        return TablerIconsS1.scooterElectric();
    }

    public static Icon scoreboard() {
        return TablerIconsS1.scoreboard();
    }

    public static Icon screenShare() {
        return TablerIconsS1.screenShare();
    }

    public static Icon screenShareOff() {
        return TablerIconsS1.screenShareOff();
    }

    public static Icon screenshot() {
        return TablerIconsS1.screenshot();
    }

    public static Icon scribble() {
        return TablerIconsS1.scribble();
    }

    public static Icon scribbleOff() {
        return TablerIconsS1.scribbleOff();
    }

    public static Icon script() {
        return TablerIconsS1.script();
    }

    public static Icon scriptMinus() {
        return TablerIconsS1.scriptMinus();
    }

    public static Icon scriptPlus() {
        return TablerIconsS1.scriptPlus();
    }

    public static Icon scriptX() {
        return TablerIconsS1.scriptX();
    }

    public static Icon scubaDiving() {
        return TablerIconsS1.scubaDiving();
    }

    public static Icon scubaDivingTank() {
        return TablerIconsS1.scubaDivingTank();
    }

    public static Icon scubaMask() {
        return TablerIconsS1.scubaMask();
    }

    public static Icon scubaMaskOff() {
        return TablerIconsS1.scubaMaskOff();
    }

    public static Icon sdk() {
        return TablerIconsS1.sdk();
    }

    public static Icon search() {
        return TablerIconsS1.search();
    }

    public static Icon searchOff() {
        return TablerIconsS1.searchOff();
    }

    public static Icon section() {
        return TablerIconsS1.section();
    }

    public static Icon sectionSign() {
        return TablerIconsS1.sectionSign();
    }

    public static Icon seedling() {
        return TablerIconsS1.seedling();
    }

    public static Icon seedlingOff() {
        return TablerIconsS1.seedlingOff();
    }

    public static Icon segway() {
        return TablerIconsS1.segway();
    }

    public static Icon select() {
        return TablerIconsS1.select();
    }

    public static Icon selectAll() {
        return TablerIconsS1.selectAll();
    }

    public static Icon selector() {
        return TablerIconsS1.selector();
    }

    public static Icon send() {
        return TablerIconsS1.send();
    }

    public static Icon sendN2() {
        return TablerIconsS1.sendN2();
    }

    public static Icon sendOff() {
        return TablerIconsS1.sendOff();
    }

    public static Icon seo() {
        return TablerIconsS1.seo();
    }

    public static Icon separator() {
        return TablerIconsS1.separator();
    }

    public static Icon separatorHorizontal() {
        return TablerIconsS1.separatorHorizontal();
    }

    public static Icon separatorVertical() {
        return TablerIconsS1.separatorVertical();
    }

    public static Icon server() {
        return TablerIconsS1.server();
    }

    public static Icon serverN2() {
        return TablerIconsS1.serverN2();
    }

    public static Icon serverBolt() {
        return TablerIconsS1.serverBolt();
    }

    public static Icon serverCog() {
        return TablerIconsS1.serverCog();
    }

    public static Icon serverOff() {
        return TablerIconsS1.serverOff();
    }

    public static Icon serverSpark() {
        return TablerIconsS1.serverSpark();
    }

    public static Icon serverless() {
        return TablerIconsS1.serverless();
    }

    public static Icon servicemark() {
        return TablerIconsS1.servicemark();
    }

    public static Icon settings() {
        return TablerIconsS1.settings();
    }

    public static Icon settingsN2() {
        return TablerIconsS1.settingsN2();
    }

    public static Icon settingsAi() {
        return TablerIconsS1.settingsAi();
    }

    public static Icon settingsAutomation() {
        return TablerIconsS1.settingsAutomation();
    }

    public static Icon settingsBolt() {
        return TablerIconsS1.settingsBolt();
    }

    public static Icon settingsCancel() {
        return TablerIconsS1.settingsCancel();
    }

    public static Icon settingsCheck() {
        return TablerIconsS1.settingsCheck();
    }

    public static Icon settingsCode() {
        return TablerIconsS1.settingsCode();
    }

    public static Icon settingsCog() {
        return TablerIconsS1.settingsCog();
    }

    public static Icon settingsDollar() {
        return TablerIconsS1.settingsDollar();
    }

    public static Icon settingsDown() {
        return TablerIconsS1.settingsDown();
    }

    public static Icon settingsExclamation() {
        return TablerIconsS1.settingsExclamation();
    }

    public static Icon settingsHeart() {
        return TablerIconsS1.settingsHeart();
    }

    public static Icon settingsMinus() {
        return TablerIconsS1.settingsMinus();
    }

    public static Icon settingsOff() {
        return TablerIconsS1.settingsOff();
    }

    public static Icon settingsPause() {
        return TablerIconsS1.settingsPause();
    }

    public static Icon settingsPin() {
        return TablerIconsS1.settingsPin();
    }

    public static Icon settingsPlus() {
        return TablerIconsS1.settingsPlus();
    }

    public static Icon settingsQuestion() {
        return TablerIconsS1.settingsQuestion();
    }

    public static Icon settingsSearch() {
        return TablerIconsS1.settingsSearch();
    }

    public static Icon settingsShare() {
        return TablerIconsS1.settingsShare();
    }

    public static Icon settingsSpark() {
        return TablerIconsS1.settingsSpark();
    }

    public static Icon settingsStar() {
        return TablerIconsS1.settingsStar();
    }

    public static Icon settingsUp() {
        return TablerIconsS1.settingsUp();
    }

    public static Icon settingsX() {
        return TablerIconsS1.settingsX();
    }

    public static Icon shadow() {
        return TablerIconsS1.shadow();
    }

    public static Icon shadowOff() {
        return TablerIconsS1.shadowOff();
    }

    public static Icon shape() {
        return TablerIconsS1.shape();
    }

    public static Icon shapeN2() {
        return TablerIconsS1.shapeN2();
    }

    public static Icon shapeN3() {
        return TablerIconsS1.shapeN3();
    }

    public static Icon shapeOff() {
        return TablerIconsS1.shapeOff();
    }

    public static Icon share() {
        return TablerIconsS1.share();
    }

    public static Icon shareN2() {
        return TablerIconsS1.shareN2();
    }

    public static Icon shareN3() {
        return TablerIconsS1.shareN3();
    }

    public static Icon shareOff() {
        return TablerIconsS1.shareOff();
    }

    public static Icon shareplay() {
        return TablerIconsS1.shareplay();
    }

    public static Icon shield() {
        return TablerIconsS1.shield();
    }

    public static Icon shieldBolt() {
        return TablerIconsS1.shieldBolt();
    }

    public static Icon shieldCancel() {
        return TablerIconsS1.shieldCancel();
    }

    public static Icon shieldCheck() {
        return TablerIconsS1.shieldCheck();
    }

    public static Icon shieldCheckered() {
        return TablerIconsS1.shieldCheckered();
    }

    public static Icon shieldChevron() {
        return TablerIconsS1.shieldChevron();
    }

    public static Icon shieldCode() {
        return TablerIconsS1.shieldCode();
    }

    public static Icon shieldCog() {
        return TablerIconsS1.shieldCog();
    }

    public static Icon shieldDollar() {
        return TablerIconsS1.shieldDollar();
    }

    public static Icon shieldDown() {
        return TablerIconsS1.shieldDown();
    }

    public static Icon shieldExclamation() {
        return TablerIconsS1.shieldExclamation();
    }

    public static Icon shieldHalf() {
        return TablerIconsS1.shieldHalf();
    }

    public static Icon shieldHeart() {
        return TablerIconsS1.shieldHeart();
    }

    public static Icon shieldLock() {
        return TablerIconsS1.shieldLock();
    }

    public static Icon shieldMinus() {
        return TablerIconsS1.shieldMinus();
    }

    public static Icon shieldOff() {
        return TablerIconsS1.shieldOff();
    }

    public static Icon shieldPause() {
        return TablerIconsS1.shieldPause();
    }

    public static Icon shieldPin() {
        return TablerIconsS1.shieldPin();
    }

    public static Icon shieldPlus() {
        return TablerIconsS1.shieldPlus();
    }

    public static Icon shieldQuestion() {
        return TablerIconsS1.shieldQuestion();
    }

    public static Icon shieldSearch() {
        return TablerIconsS1.shieldSearch();
    }

    public static Icon shieldShare() {
        return TablerIconsS1.shieldShare();
    }

    public static Icon shieldStar() {
        return TablerIconsS1.shieldStar();
    }

    public static Icon shieldUp() {
        return TablerIconsS1.shieldUp();
    }

    public static Icon shieldX() {
        return TablerIconsS1.shieldX();
    }

    public static Icon ship() {
        return TablerIconsS1.ship();
    }

    public static Icon shipOff() {
        return TablerIconsS1.shipOff();
    }

    public static Icon shirt() {
        return TablerIconsS1.shirt();
    }

    public static Icon shirtOff() {
        return TablerIconsS1.shirtOff();
    }

    public static Icon shirtSport() {
        return TablerIconsS1.shirtSport();
    }

    public static Icon shoe() {
        return TablerIconsS1.shoe();
    }

    public static Icon shoeOff() {
        return TablerIconsS1.shoeOff();
    }

    public static Icon shoppingBag() {
        return TablerIconsS1.shoppingBag();
    }

    public static Icon shoppingBagCheck() {
        return TablerIconsS1.shoppingBagCheck();
    }

    public static Icon shoppingBagDiscount() {
        return TablerIconsS1.shoppingBagDiscount();
    }

    public static Icon shoppingBagEdit() {
        return TablerIconsS1.shoppingBagEdit();
    }

    public static Icon shoppingBagExclamation() {
        return TablerIconsS1.shoppingBagExclamation();
    }

    public static Icon shoppingBagHeart() {
        return TablerIconsS1.shoppingBagHeart();
    }

    public static Icon shoppingBagMinus() {
        return TablerIconsS1.shoppingBagMinus();
    }

    public static Icon shoppingBagPlus() {
        return TablerIconsS1.shoppingBagPlus();
    }

    public static Icon shoppingBagSearch() {
        return TablerIconsS1.shoppingBagSearch();
    }

    public static Icon shoppingBagX() {
        return TablerIconsS1.shoppingBagX();
    }

    public static Icon shoppingCart() {
        return TablerIconsS1.shoppingCart();
    }

    public static Icon shoppingCartBolt() {
        return TablerIconsS1.shoppingCartBolt();
    }

    public static Icon shoppingCartCancel() {
        return TablerIconsS1.shoppingCartCancel();
    }

    public static Icon shoppingCartCheck() {
        return TablerIconsS1.shoppingCartCheck();
    }

    public static Icon shoppingCartCode() {
        return TablerIconsS1.shoppingCartCode();
    }

    public static Icon shoppingCartCog() {
        return TablerIconsS1.shoppingCartCog();
    }

    public static Icon shoppingCartCopy() {
        return TablerIconsS1.shoppingCartCopy();
    }

    public static Icon shoppingCartDiscount() {
        return TablerIconsS1.shoppingCartDiscount();
    }

    public static Icon shoppingCartDollar() {
        return TablerIconsS1.shoppingCartDollar();
    }

    public static Icon shoppingCartDown() {
        return TablerIconsS1.shoppingCartDown();
    }

    public static Icon shoppingCartExclamation() {
        return TablerIconsS1.shoppingCartExclamation();
    }

    public static Icon shoppingCartHeart() {
        return TablerIconsS1.shoppingCartHeart();
    }

    public static Icon shoppingCartMinus() {
        return TablerIconsS1.shoppingCartMinus();
    }

    public static Icon shoppingCartOff() {
        return TablerIconsS1.shoppingCartOff();
    }

    public static Icon shoppingCartPause() {
        return TablerIconsS1.shoppingCartPause();
    }

    public static Icon shoppingCartPin() {
        return TablerIconsS1.shoppingCartPin();
    }

    public static Icon shoppingCartPlus() {
        return TablerIconsS1.shoppingCartPlus();
    }

    public static Icon shoppingCartQuestion() {
        return TablerIconsS1.shoppingCartQuestion();
    }

    public static Icon shoppingCartSearch() {
        return TablerIconsS1.shoppingCartSearch();
    }

    public static Icon shoppingCartShare() {
        return TablerIconsS1.shoppingCartShare();
    }

    public static Icon shoppingCartStar() {
        return TablerIconsS1.shoppingCartStar();
    }

    public static Icon shoppingCartUp() {
        return TablerIconsS1.shoppingCartUp();
    }

    public static Icon shoppingCartX() {
        return TablerIconsS1.shoppingCartX();
    }

    public static Icon shovel() {
        return TablerIconsS1.shovel();
    }

    public static Icon shovelPitchforks() {
        return TablerIconsS1.shovelPitchforks();
    }

    public static Icon shredder() {
        return TablerIconsS1.shredder();
    }

    public static Icon signLeft() {
        return TablerIconsS1.signLeft();
    }

    public static Icon signRight() {
        return TablerIconsS1.signRight();
    }

    public static Icon signal2g() {
        return TablerIconsS1.signal2g();
    }

    public static Icon signal3g() {
        return TablerIconsS2.signal3g();
    }

    public static Icon signal4g() {
        return TablerIconsS2.signal4g();
    }

    public static Icon signal4gPlus() {
        return TablerIconsS2.signal4gPlus();
    }

    public static Icon signal5g() {
        return TablerIconsS2.signal5g();
    }

    public static Icon signal6g() {
        return TablerIconsS2.signal6g();
    }

    public static Icon signalE() {
        return TablerIconsS2.signalE();
    }

    public static Icon signalG() {
        return TablerIconsS2.signalG();
    }

    public static Icon signalH() {
        return TablerIconsS2.signalH();
    }

    public static Icon signalHPlus() {
        return TablerIconsS2.signalHPlus();
    }

    public static Icon signalLte() {
        return TablerIconsS2.signalLte();
    }

    public static Icon signature() {
        return TablerIconsS2.signature();
    }

    public static Icon signatureOff() {
        return TablerIconsS2.signatureOff();
    }

    public static Icon sitemap() {
        return TablerIconsS2.sitemap();
    }

    public static Icon sitemapOff() {
        return TablerIconsS2.sitemapOff();
    }

    public static Icon skateboard() {
        return TablerIconsS2.skateboard();
    }

    public static Icon skateboardOff() {
        return TablerIconsS2.skateboardOff();
    }

    public static Icon skateboarding() {
        return TablerIconsS2.skateboarding();
    }

    public static Icon sketching() {
        return TablerIconsS2.sketching();
    }

    public static Icon skewX() {
        return TablerIconsS2.skewX();
    }

    public static Icon skewY() {
        return TablerIconsS2.skewY();
    }

    public static Icon skiJumping() {
        return TablerIconsS2.skiJumping();
    }

    public static Icon skull() {
        return TablerIconsS2.skull();
    }

    public static Icon slash() {
        return TablerIconsS2.slash();
    }

    public static Icon slashes() {
        return TablerIconsS2.slashes();
    }

    public static Icon sleigh() {
        return TablerIconsS2.sleigh();
    }

    public static Icon slice() {
        return TablerIconsS2.slice();
    }

    public static Icon slideshow() {
        return TablerIconsS2.slideshow();
    }

    public static Icon smartHome() {
        return TablerIconsS2.smartHome();
    }

    public static Icon smartHomeOff() {
        return TablerIconsS2.smartHomeOff();
    }

    public static Icon smoking() {
        return TablerIconsS2.smoking();
    }

    public static Icon smokingNo() {
        return TablerIconsS2.smokingNo();
    }

    public static Icon snowboarding() {
        return TablerIconsS2.snowboarding();
    }

    public static Icon snowflake() {
        return TablerIconsS2.snowflake();
    }

    public static Icon snowflakeOff() {
        return TablerIconsS2.snowflakeOff();
    }

    public static Icon snowman() {
        return TablerIconsS2.snowman();
    }

    public static Icon soccerField() {
        return TablerIconsS2.soccerField();
    }

    public static Icon social() {
        return TablerIconsS2.social();
    }

    public static Icon socialOff() {
        return TablerIconsS2.socialOff();
    }

    public static Icon sock() {
        return TablerIconsS2.sock();
    }

    public static Icon sofa() {
        return TablerIconsS2.sofa();
    }

    public static Icon sofaOff() {
        return TablerIconsS2.sofaOff();
    }

    public static Icon solarElectricity() {
        return TablerIconsS2.solarElectricity();
    }

    public static Icon solarPanel() {
        return TablerIconsS2.solarPanel();
    }

    public static Icon solarPanelN2() {
        return TablerIconsS2.solarPanelN2();
    }

    public static Icon sortN0N9() {
        return TablerIconsS2.sortN0N9();
    }

    public static Icon sortN9N0() {
        return TablerIconsS2.sortN9N0();
    }

    public static Icon sortAZ() {
        return TablerIconsS2.sortAZ();
    }

    public static Icon sortAscending() {
        return TablerIconsS2.sortAscending();
    }

    public static Icon sortAscendingN2() {
        return TablerIconsS2.sortAscendingN2();
    }

    public static Icon sortAscendingLetters() {
        return TablerIconsS2.sortAscendingLetters();
    }

    public static Icon sortAscendingNumbers() {
        return TablerIconsS2.sortAscendingNumbers();
    }

    public static Icon sortAscendingShapes() {
        return TablerIconsS2.sortAscendingShapes();
    }

    public static Icon sortAscendingSmallBig() {
        return TablerIconsS2.sortAscendingSmallBig();
    }

    public static Icon sortDescending() {
        return TablerIconsS2.sortDescending();
    }

    public static Icon sortDescendingN2() {
        return TablerIconsS2.sortDescendingN2();
    }

    public static Icon sortDescendingLetters() {
        return TablerIconsS2.sortDescendingLetters();
    }

    public static Icon sortDescendingNumbers() {
        return TablerIconsS2.sortDescendingNumbers();
    }

    public static Icon sortDescendingShapes() {
        return TablerIconsS2.sortDescendingShapes();
    }

    public static Icon sortDescendingSmallBig() {
        return TablerIconsS2.sortDescendingSmallBig();
    }

    public static Icon sortZA() {
        return TablerIconsS2.sortZA();
    }

    public static Icon sos() {
        return TablerIconsS2.sos();
    }

    public static Icon soup() {
        return TablerIconsS2.soup();
    }

    public static Icon soupOff() {
        return TablerIconsS2.soupOff();
    }

    public static Icon sourceCode() {
        return TablerIconsS2.sourceCode();
    }

    public static Icon space() {
        return TablerIconsS2.space();
    }

    public static Icon spaceOff() {
        return TablerIconsS2.spaceOff();
    }

    public static Icon spaces() {
        return TablerIconsS2.spaces();
    }

    public static Icon spacingHorizontal() {
        return TablerIconsS2.spacingHorizontal();
    }

    public static Icon spacingVertical() {
        return TablerIconsS2.spacingVertical();
    }

    public static Icon spade() {
        return TablerIconsS2.spade();
    }

    public static Icon sparkle() {
        return TablerIconsS2.sparkle();
    }

    public static Icon sparkleN2() {
        return TablerIconsS2.sparkleN2();
    }

    public static Icon sparkleHighlight() {
        return TablerIconsS2.sparkleHighlight();
    }

    public static Icon sparkles() {
        return TablerIconsS2.sparkles();
    }

    public static Icon sparklesN2() {
        return TablerIconsS2.sparklesN2();
    }

    public static Icon speakerphone() {
        return TablerIconsS2.speakerphone();
    }

    public static Icon speedboat() {
        return TablerIconsS2.speedboat();
    }

    public static Icon sphere() {
        return TablerIconsS2.sphere();
    }

    public static Icon sphereN2() {
        return TablerIconsS2.sphereN2();
    }

    public static Icon sphereOff() {
        return TablerIconsS2.sphereOff();
    }

    public static Icon spherePlus() {
        return TablerIconsS2.spherePlus();
    }

    public static Icon spider() {
        return TablerIconsS2.spider();
    }

    public static Icon spiral() {
        return TablerIconsS2.spiral();
    }

    public static Icon spiralOff() {
        return TablerIconsS2.spiralOff();
    }

    public static Icon sportBillard() {
        return TablerIconsS2.sportBillard();
    }

    public static Icon spray() {
        return TablerIconsS2.spray();
    }

    public static Icon spy() {
        return TablerIconsS2.spy();
    }

    public static Icon spyOff() {
        return TablerIconsS2.spyOff();
    }

    public static Icon sql() {
        return TablerIconsS2.sql();
    }

    public static Icon square() {
        return TablerIconsS2.square();
    }

    public static Icon squareArrowDown() {
        return TablerIconsS2.squareArrowDown();
    }

    public static Icon squareArrowLeft() {
        return TablerIconsS2.squareArrowLeft();
    }

    public static Icon squareArrowRight() {
        return TablerIconsS2.squareArrowRight();
    }

    public static Icon squareArrowUp() {
        return TablerIconsS2.squareArrowUp();
    }

    public static Icon squareAsterisk() {
        return TablerIconsS2.squareAsterisk();
    }

    public static Icon squareCheck() {
        return TablerIconsS2.squareCheck();
    }

    public static Icon squareChevronDown() {
        return TablerIconsS2.squareChevronDown();
    }

    public static Icon squareChevronLeft() {
        return TablerIconsS2.squareChevronLeft();
    }

    public static Icon squareChevronRight() {
        return TablerIconsS2.squareChevronRight();
    }

    public static Icon squareChevronUp() {
        return TablerIconsS2.squareChevronUp();
    }

    public static Icon squareChevronsDown() {
        return TablerIconsS2.squareChevronsDown();
    }

    public static Icon squareChevronsLeft() {
        return TablerIconsS2.squareChevronsLeft();
    }

    public static Icon squareChevronsRight() {
        return TablerIconsS2.squareChevronsRight();
    }

    public static Icon squareChevronsUp() {
        return TablerIconsS2.squareChevronsUp();
    }

    public static Icon squareDashed() {
        return TablerIconsS2.squareDashed();
    }

    public static Icon squareDot() {
        return TablerIconsS2.squareDot();
    }

    public static Icon squareF0() {
        return TablerIconsS2.squareF0();
    }

    public static Icon squareF1() {
        return TablerIconsS2.squareF1();
    }

    public static Icon squareF2() {
        return TablerIconsS2.squareF2();
    }

    public static Icon squareF3() {
        return TablerIconsS2.squareF3();
    }

    public static Icon squareF4() {
        return TablerIconsS2.squareF4();
    }

    public static Icon squareF5() {
        return TablerIconsS2.squareF5();
    }

    public static Icon squareF6() {
        return TablerIconsS2.squareF6();
    }

    public static Icon squareF7() {
        return TablerIconsS2.squareF7();
    }

    public static Icon squareF8() {
        return TablerIconsS2.squareF8();
    }

    public static Icon squareF9() {
        return TablerIconsS2.squareF9();
    }

    public static Icon squareForbid() {
        return TablerIconsS2.squareForbid();
    }

    public static Icon squareForbidN2() {
        return TablerIconsS2.squareForbidN2();
    }

    public static Icon squareHalf() {
        return TablerIconsS2.squareHalf();
    }

    public static Icon squareKey() {
        return TablerIconsS2.squareKey();
    }

    public static Icon squareLetterA() {
        return TablerIconsS2.squareLetterA();
    }

    public static Icon squareLetterB() {
        return TablerIconsS2.squareLetterB();
    }

    public static Icon squareLetterC() {
        return TablerIconsS2.squareLetterC();
    }

    public static Icon squareLetterD() {
        return TablerIconsS2.squareLetterD();
    }

    public static Icon squareLetterE() {
        return TablerIconsS2.squareLetterE();
    }

    public static Icon squareLetterF() {
        return TablerIconsS2.squareLetterF();
    }

    public static Icon squareLetterG() {
        return TablerIconsS2.squareLetterG();
    }

    public static Icon squareLetterH() {
        return TablerIconsS2.squareLetterH();
    }

    public static Icon squareLetterI() {
        return TablerIconsS2.squareLetterI();
    }

    public static Icon squareLetterJ() {
        return TablerIconsS2.squareLetterJ();
    }

    public static Icon squareLetterK() {
        return TablerIconsS2.squareLetterK();
    }

    public static Icon squareLetterL() {
        return TablerIconsS2.squareLetterL();
    }

    public static Icon squareLetterM() {
        return TablerIconsS2.squareLetterM();
    }

    public static Icon squareLetterN() {
        return TablerIconsS2.squareLetterN();
    }

    public static Icon squareLetterO() {
        return TablerIconsS2.squareLetterO();
    }

    public static Icon squareLetterP() {
        return TablerIconsS2.squareLetterP();
    }

    public static Icon squareLetterQ() {
        return TablerIconsS2.squareLetterQ();
    }

    public static Icon squareLetterR() {
        return TablerIconsS2.squareLetterR();
    }

    public static Icon squareLetterS() {
        return TablerIconsS2.squareLetterS();
    }

    public static Icon squareLetterT() {
        return TablerIconsS2.squareLetterT();
    }

    public static Icon squareLetterU() {
        return TablerIconsS2.squareLetterU();
    }

    public static Icon squareLetterV() {
        return TablerIconsS2.squareLetterV();
    }

    public static Icon squareLetterW() {
        return TablerIconsS2.squareLetterW();
    }

    public static Icon squareLetterX() {
        return TablerIconsS2.squareLetterX();
    }

    public static Icon squareLetterY() {
        return TablerIconsS2.squareLetterY();
    }

    public static Icon squareLetterZ() {
        return TablerIconsS2.squareLetterZ();
    }

    public static Icon squareMinus() {
        return TablerIconsS2.squareMinus();
    }

    public static Icon squareMinusN2() {
        return TablerIconsS2.squareMinusN2();
    }

    public static Icon squareNumberN0() {
        return TablerIconsS2.squareNumberN0();
    }

    public static Icon squareNumberN1() {
        return TablerIconsS2.squareNumberN1();
    }

    public static Icon squareNumberN2() {
        return TablerIconsS2.squareNumberN2();
    }

    public static Icon squareNumberN3() {
        return TablerIconsS2.squareNumberN3();
    }

    public static Icon squareNumberN4() {
        return TablerIconsS2.squareNumberN4();
    }

    public static Icon squareNumberN5() {
        return TablerIconsS2.squareNumberN5();
    }

    public static Icon squareNumberN6() {
        return TablerIconsS2.squareNumberN6();
    }

    public static Icon squareNumberN7() {
        return TablerIconsS2.squareNumberN7();
    }

    public static Icon squareNumberN8() {
        return TablerIconsS2.squareNumberN8();
    }

    public static Icon squareNumberN9() {
        return TablerIconsS2.squareNumberN9();
    }

    public static Icon squareOff() {
        return TablerIconsS2.squareOff();
    }

    public static Icon squarePercentage() {
        return TablerIconsS2.squarePercentage();
    }

    public static Icon squarePlus() {
        return TablerIconsS2.squarePlus();
    }

    public static Icon squarePlusN2() {
        return TablerIconsS2.squarePlusN2();
    }

    public static Icon squareRoot() {
        return TablerIconsS2.squareRoot();
    }

    public static Icon squareRootN2() {
        return TablerIconsS2.squareRootN2();
    }

    public static Icon squareRotated() {
        return TablerIconsS2.squareRotated();
    }

    public static Icon squareRotatedAsterisk() {
        return TablerIconsS2.squareRotatedAsterisk();
    }

    public static Icon squareRotatedForbid() {
        return TablerIconsS2.squareRotatedForbid();
    }

    public static Icon squareRotatedForbidN2() {
        return TablerIconsS2.squareRotatedForbidN2();
    }

    public static Icon squareRotatedOff() {
        return TablerIconsS2.squareRotatedOff();
    }

    public static Icon squareRounded() {
        return TablerIconsS2.squareRounded();
    }

    public static Icon squareRoundedArrowDown() {
        return TablerIconsS2.squareRoundedArrowDown();
    }

    public static Icon squareRoundedArrowLeft() {
        return TablerIconsS2.squareRoundedArrowLeft();
    }

    public static Icon squareRoundedArrowRight() {
        return TablerIconsS2.squareRoundedArrowRight();
    }

    public static Icon squareRoundedArrowUp() {
        return TablerIconsS2.squareRoundedArrowUp();
    }

    public static Icon squareRoundedCheck() {
        return TablerIconsS2.squareRoundedCheck();
    }

    public static Icon squareRoundedChevronDown() {
        return TablerIconsS2.squareRoundedChevronDown();
    }

    public static Icon squareRoundedChevronLeft() {
        return TablerIconsS2.squareRoundedChevronLeft();
    }

    public static Icon squareRoundedChevronRight() {
        return TablerIconsS2.squareRoundedChevronRight();
    }

    public static Icon squareRoundedChevronUp() {
        return TablerIconsS2.squareRoundedChevronUp();
    }

    public static Icon squareRoundedChevronsDown() {
        return TablerIconsS2.squareRoundedChevronsDown();
    }

    public static Icon squareRoundedChevronsLeft() {
        return TablerIconsS3.squareRoundedChevronsLeft();
    }

    public static Icon squareRoundedChevronsRight() {
        return TablerIconsS3.squareRoundedChevronsRight();
    }

    public static Icon squareRoundedChevronsUp() {
        return TablerIconsS3.squareRoundedChevronsUp();
    }

    public static Icon squareRoundedLetterA() {
        return TablerIconsS3.squareRoundedLetterA();
    }

    public static Icon squareRoundedLetterB() {
        return TablerIconsS3.squareRoundedLetterB();
    }

    public static Icon squareRoundedLetterC() {
        return TablerIconsS3.squareRoundedLetterC();
    }

    public static Icon squareRoundedLetterD() {
        return TablerIconsS3.squareRoundedLetterD();
    }

    public static Icon squareRoundedLetterE() {
        return TablerIconsS3.squareRoundedLetterE();
    }

    public static Icon squareRoundedLetterF() {
        return TablerIconsS3.squareRoundedLetterF();
    }

    public static Icon squareRoundedLetterG() {
        return TablerIconsS3.squareRoundedLetterG();
    }

    public static Icon squareRoundedLetterH() {
        return TablerIconsS3.squareRoundedLetterH();
    }

    public static Icon squareRoundedLetterI() {
        return TablerIconsS3.squareRoundedLetterI();
    }

    public static Icon squareRoundedLetterJ() {
        return TablerIconsS3.squareRoundedLetterJ();
    }

    public static Icon squareRoundedLetterK() {
        return TablerIconsS3.squareRoundedLetterK();
    }

    public static Icon squareRoundedLetterL() {
        return TablerIconsS3.squareRoundedLetterL();
    }

    public static Icon squareRoundedLetterM() {
        return TablerIconsS3.squareRoundedLetterM();
    }

    public static Icon squareRoundedLetterN() {
        return TablerIconsS3.squareRoundedLetterN();
    }

    public static Icon squareRoundedLetterO() {
        return TablerIconsS3.squareRoundedLetterO();
    }

    public static Icon squareRoundedLetterP() {
        return TablerIconsS3.squareRoundedLetterP();
    }

    public static Icon squareRoundedLetterQ() {
        return TablerIconsS3.squareRoundedLetterQ();
    }

    public static Icon squareRoundedLetterR() {
        return TablerIconsS3.squareRoundedLetterR();
    }

    public static Icon squareRoundedLetterS() {
        return TablerIconsS3.squareRoundedLetterS();
    }

    public static Icon squareRoundedLetterT() {
        return TablerIconsS3.squareRoundedLetterT();
    }

    public static Icon squareRoundedLetterU() {
        return TablerIconsS3.squareRoundedLetterU();
    }

    public static Icon squareRoundedLetterV() {
        return TablerIconsS3.squareRoundedLetterV();
    }

    public static Icon squareRoundedLetterW() {
        return TablerIconsS3.squareRoundedLetterW();
    }

    public static Icon squareRoundedLetterX() {
        return TablerIconsS3.squareRoundedLetterX();
    }

    public static Icon squareRoundedLetterY() {
        return TablerIconsS3.squareRoundedLetterY();
    }

    public static Icon squareRoundedLetterZ() {
        return TablerIconsS3.squareRoundedLetterZ();
    }

    public static Icon squareRoundedMinus() {
        return TablerIconsS3.squareRoundedMinus();
    }

    public static Icon squareRoundedMinusN2() {
        return TablerIconsS3.squareRoundedMinusN2();
    }

    public static Icon squareRoundedNumberN0() {
        return TablerIconsS3.squareRoundedNumberN0();
    }

    public static Icon squareRoundedNumberN1() {
        return TablerIconsS3.squareRoundedNumberN1();
    }

    public static Icon squareRoundedNumberN2() {
        return TablerIconsS3.squareRoundedNumberN2();
    }

    public static Icon squareRoundedNumberN3() {
        return TablerIconsS3.squareRoundedNumberN3();
    }

    public static Icon squareRoundedNumberN4() {
        return TablerIconsS3.squareRoundedNumberN4();
    }

    public static Icon squareRoundedNumberN5() {
        return TablerIconsS3.squareRoundedNumberN5();
    }

    public static Icon squareRoundedNumberN6() {
        return TablerIconsS3.squareRoundedNumberN6();
    }

    public static Icon squareRoundedNumberN7() {
        return TablerIconsS3.squareRoundedNumberN7();
    }

    public static Icon squareRoundedNumberN8() {
        return TablerIconsS3.squareRoundedNumberN8();
    }

    public static Icon squareRoundedNumberN9() {
        return TablerIconsS3.squareRoundedNumberN9();
    }

    public static Icon squareRoundedPercentage() {
        return TablerIconsS3.squareRoundedPercentage();
    }

    public static Icon squareRoundedPlus() {
        return TablerIconsS3.squareRoundedPlus();
    }

    public static Icon squareRoundedPlusN2() {
        return TablerIconsS3.squareRoundedPlusN2();
    }

    public static Icon squareRoundedX() {
        return TablerIconsS3.squareRoundedX();
    }

    public static Icon squareToggle() {
        return TablerIconsS3.squareToggle();
    }

    public static Icon squareToggleHorizontal() {
        return TablerIconsS3.squareToggleHorizontal();
    }

    public static Icon squareX() {
        return TablerIconsS3.squareX();
    }

    public static Icon squares() {
        return TablerIconsS3.squares();
    }

    public static Icon squaresDiagonal() {
        return TablerIconsS3.squaresDiagonal();
    }

    public static Icon squaresSelected() {
        return TablerIconsS3.squaresSelected();
    }

    public static Icon stack() {
        return TablerIconsS3.stack();
    }

    public static Icon stackN2() {
        return TablerIconsS3.stackN2();
    }

    public static Icon stackN3() {
        return TablerIconsS3.stackN3();
    }

    public static Icon stackBack() {
        return TablerIconsS3.stackBack();
    }

    public static Icon stackBackward() {
        return TablerIconsS3.stackBackward();
    }

    public static Icon stackForward() {
        return TablerIconsS3.stackForward();
    }

    public static Icon stackFront() {
        return TablerIconsS3.stackFront();
    }

    public static Icon stackMiddle() {
        return TablerIconsS3.stackMiddle();
    }

    public static Icon stackPop() {
        return TablerIconsS3.stackPop();
    }

    public static Icon stackPush() {
        return TablerIconsS3.stackPush();
    }

    public static Icon stairs() {
        return TablerIconsS3.stairs();
    }

    public static Icon stairsDown() {
        return TablerIconsS3.stairsDown();
    }

    public static Icon stairsUp() {
        return TablerIconsS3.stairsUp();
    }

    public static Icon star() {
        return TablerIconsS3.star();
    }

    public static Icon starHalf() {
        return TablerIconsS3.starHalf();
    }

    public static Icon starOff() {
        return TablerIconsS3.starOff();
    }

    public static Icon stars() {
        return TablerIconsS3.stars();
    }

    public static Icon starsOff() {
        return TablerIconsS3.starsOff();
    }

    public static Icon statusChange() {
        return TablerIconsS3.statusChange();
    }

    public static Icon steam() {
        return TablerIconsS3.steam();
    }

    public static Icon steeringWheel() {
        return TablerIconsS3.steeringWheel();
    }

    public static Icon steeringWheelOff() {
        return TablerIconsS3.steeringWheelOff();
    }

    public static Icon stepInto() {
        return TablerIconsS3.stepInto();
    }

    public static Icon stepOut() {
        return TablerIconsS3.stepOut();
    }

    public static Icon stereoGlasses() {
        return TablerIconsS3.stereoGlasses();
    }

    public static Icon stethoscope() {
        return TablerIconsS3.stethoscope();
    }

    public static Icon stethoscopeOff() {
        return TablerIconsS3.stethoscopeOff();
    }

    public static Icon sticker() {
        return TablerIconsS3.sticker();
    }

    public static Icon stickerN2() {
        return TablerIconsS3.stickerN2();
    }

    public static Icon stopwatch() {
        return TablerIconsS3.stopwatch();
    }

    public static Icon storm() {
        return TablerIconsS3.storm();
    }

    public static Icon stormOff() {
        return TablerIconsS3.stormOff();
    }

    public static Icon stretching() {
        return TablerIconsS3.stretching();
    }

    public static Icon stretchingN2() {
        return TablerIconsS3.stretchingN2();
    }

    public static Icon strikethrough() {
        return TablerIconsS3.strikethrough();
    }

    public static Icon strokeCurved() {
        return TablerIconsS3.strokeCurved();
    }

    public static Icon strokeDynamic() {
        return TablerIconsS3.strokeDynamic();
    }

    public static Icon strokeStraight() {
        return TablerIconsS3.strokeStraight();
    }

    public static Icon submarine() {
        return TablerIconsS3.submarine();
    }

    public static Icon subscript() {
        return TablerIconsS3.subscript();
    }

    public static Icon subtask() {
        return TablerIconsS3.subtask();
    }

    public static Icon subtitles() {
        return TablerIconsS3.subtitles();
    }

    public static Icon subtitlesAi() {
        return TablerIconsS3.subtitlesAi();
    }

    public static Icon subtitlesEdit() {
        return TablerIconsS3.subtitlesEdit();
    }

    public static Icon subtitlesOff() {
        return TablerIconsS3.subtitlesOff();
    }

    public static Icon sum() {
        return TablerIconsS3.sum();
    }

    public static Icon sumOff() {
        return TablerIconsS3.sumOff();
    }

    public static Icon sun() {
        return TablerIconsS3.sun();
    }

    public static Icon sunElectricity() {
        return TablerIconsS3.sunElectricity();
    }

    public static Icon sunHigh() {
        return TablerIconsS3.sunHigh();
    }

    public static Icon sunLow() {
        return TablerIconsS3.sunLow();
    }

    public static Icon sunMoon() {
        return TablerIconsS3.sunMoon();
    }

    public static Icon sunOff() {
        return TablerIconsS3.sunOff();
    }

    public static Icon sunWind() {
        return TablerIconsS3.sunWind();
    }

    public static Icon sunglasses() {
        return TablerIconsS3.sunglasses();
    }

    public static Icon sunrise() {
        return TablerIconsS3.sunrise();
    }

    public static Icon sunset() {
        return TablerIconsS3.sunset();
    }

    public static Icon sunsetN2() {
        return TablerIconsS3.sunsetN2();
    }

    public static Icon superscript() {
        return TablerIconsS3.superscript();
    }

    public static Icon svg() {
        return TablerIconsS3.svg();
    }

    public static Icon swimming() {
        return TablerIconsS3.swimming();
    }

    public static Icon swipe() {
        return TablerIconsS3.swipe();
    }

    public static Icon swipeDown() {
        return TablerIconsS3.swipeDown();
    }

    public static Icon swipeLeft() {
        return TablerIconsS3.swipeLeft();
    }

    public static Icon swipeRight() {
        return TablerIconsS3.swipeRight();
    }

    public static Icon swipeUp() {
        return TablerIconsS3.swipeUp();
    }

    public static Icon switchIcon() {
        return TablerIconsS3.switchIcon();
    }

    public static Icon switchN2() {
        return TablerIconsS3.switchN2();
    }

    public static Icon switchN3() {
        return TablerIconsS3.switchN3();
    }

    public static Icon switchHorizontal() {
        return TablerIconsS3.switchHorizontal();
    }

    public static Icon switchVertical() {
        return TablerIconsS3.switchVertical();
    }

    public static Icon sword() {
        return TablerIconsS3.sword();
    }

    public static Icon swordOff() {
        return TablerIconsS3.swordOff();
    }

    public static Icon swords() {
        return TablerIconsS3.swords();
    }

    public static Icon table() {
        return TablerIconsT1.table();
    }

    public static Icon tableAlias() {
        return TablerIconsT1.tableAlias();
    }

    public static Icon tableColumn() {
        return TablerIconsT1.tableColumn();
    }

    public static Icon tableDashed() {
        return TablerIconsT1.tableDashed();
    }

    public static Icon tableDown() {
        return TablerIconsT1.tableDown();
    }

    public static Icon tableExport() {
        return TablerIconsT1.tableExport();
    }

    public static Icon tableHeart() {
        return TablerIconsT1.tableHeart();
    }

    public static Icon tableImport() {
        return TablerIconsT1.tableImport();
    }

    public static Icon tableMinus() {
        return TablerIconsT1.tableMinus();
    }

    public static Icon tableOff() {
        return TablerIconsT1.tableOff();
    }

    public static Icon tableOptions() {
        return TablerIconsT1.tableOptions();
    }

    public static Icon tablePlus() {
        return TablerIconsT1.tablePlus();
    }

    public static Icon tableRow() {
        return TablerIconsT1.tableRow();
    }

    public static Icon tableShare() {
        return TablerIconsT1.tableShare();
    }

    public static Icon tableShortcut() {
        return TablerIconsT1.tableShortcut();
    }

    public static Icon tableSpark() {
        return TablerIconsT1.tableSpark();
    }

    public static Icon tag() {
        return TablerIconsT1.tag();
    }

    public static Icon tagMinus() {
        return TablerIconsT1.tagMinus();
    }

    public static Icon tagOff() {
        return TablerIconsT1.tagOff();
    }

    public static Icon tagPlus() {
        return TablerIconsT1.tagPlus();
    }

    public static Icon tagStarred() {
        return TablerIconsT1.tagStarred();
    }

    public static Icon tags() {
        return TablerIconsT1.tags();
    }

    public static Icon tagsOff() {
        return TablerIconsT1.tagsOff();
    }

    public static Icon taiwanDollar() {
        return TablerIconsT1.taiwanDollar();
    }

    public static Icon tallymarkN1() {
        return TablerIconsT1.tallymarkN1();
    }

    public static Icon tallymarkN2() {
        return TablerIconsT1.tallymarkN2();
    }

    public static Icon tallymarkN3() {
        return TablerIconsT1.tallymarkN3();
    }

    public static Icon tallymarkN4() {
        return TablerIconsT1.tallymarkN4();
    }

    public static Icon tallymarks() {
        return TablerIconsT1.tallymarks();
    }

    public static Icon tank() {
        return TablerIconsT1.tank();
    }

    public static Icon target() {
        return TablerIconsT1.target();
    }

    public static Icon targetN2() {
        return TablerIconsT1.targetN2();
    }

    public static Icon targetArrow() {
        return TablerIconsT1.targetArrow();
    }

    public static Icon targetOff() {
        return TablerIconsT1.targetOff();
    }

    public static Icon tax() {
        return TablerIconsT1.tax();
    }

    public static Icon taxEuro() {
        return TablerIconsT1.taxEuro();
    }

    public static Icon taxPound() {
        return TablerIconsT1.taxPound();
    }

    public static Icon teapot() {
        return TablerIconsT1.teapot();
    }

    public static Icon telescope() {
        return TablerIconsT1.telescope();
    }

    public static Icon telescopeOff() {
        return TablerIconsT1.telescopeOff();
    }

    public static Icon temperature() {
        return TablerIconsT1.temperature();
    }

    public static Icon temperatureCelsius() {
        return TablerIconsT1.temperatureCelsius();
    }

    public static Icon temperatureFahrenheit() {
        return TablerIconsT1.temperatureFahrenheit();
    }

    public static Icon temperatureMinus() {
        return TablerIconsT1.temperatureMinus();
    }

    public static Icon temperatureOff() {
        return TablerIconsT1.temperatureOff();
    }

    public static Icon temperaturePlus() {
        return TablerIconsT1.temperaturePlus();
    }

    public static Icon temperatureSnow() {
        return TablerIconsT1.temperatureSnow();
    }

    public static Icon temperatureSun() {
        return TablerIconsT1.temperatureSun();
    }

    public static Icon template() {
        return TablerIconsT1.template();
    }

    public static Icon templateOff() {
        return TablerIconsT1.templateOff();
    }

    public static Icon tent() {
        return TablerIconsT1.tent();
    }

    public static Icon tentOff() {
        return TablerIconsT1.tentOff();
    }

    public static Icon terminal() {
        return TablerIconsT1.terminal();
    }

    public static Icon terminalN2() {
        return TablerIconsT1.terminalN2();
    }

    public static Icon testPipe() {
        return TablerIconsT1.testPipe();
    }

    public static Icon testPipeN2() {
        return TablerIconsT1.testPipeN2();
    }

    public static Icon testPipeOff() {
        return TablerIconsT1.testPipeOff();
    }

    public static Icon tex() {
        return TablerIconsT1.tex();
    }

    public static Icon textCaption() {
        return TablerIconsT1.textCaption();
    }

    public static Icon textColor() {
        return TablerIconsT1.textColor();
    }

    public static Icon textDecrease() {
        return TablerIconsT1.textDecrease();
    }

    public static Icon textDirectionLtr() {
        return TablerIconsT1.textDirectionLtr();
    }

    public static Icon textDirectionRtl() {
        return TablerIconsT1.textDirectionRtl();
    }

    public static Icon textGrammar() {
        return TablerIconsT1.textGrammar();
    }

    public static Icon textIncrease() {
        return TablerIconsT1.textIncrease();
    }

    public static Icon textOrientation() {
        return TablerIconsT1.textOrientation();
    }

    public static Icon textPlus() {
        return TablerIconsT1.textPlus();
    }

    public static Icon textRecognition() {
        return TablerIconsT1.textRecognition();
    }

    public static Icon textResize() {
        return TablerIconsT1.textResize();
    }

    public static Icon textScanN2() {
        return TablerIconsT1.textScanN2();
    }

    public static Icon textScanAi() {
        return TablerIconsT1.textScanAi();
    }

    public static Icon textSize() {
        return TablerIconsT1.textSize();
    }

    public static Icon textSpellcheck() {
        return TablerIconsT1.textSpellcheck();
    }

    public static Icon textWrap() {
        return TablerIconsT1.textWrap();
    }

    public static Icon textWrapColumn() {
        return TablerIconsT1.textWrapColumn();
    }

    public static Icon textWrapDisabled() {
        return TablerIconsT1.textWrapDisabled();
    }

    public static Icon texture() {
        return TablerIconsT1.texture();
    }

    public static Icon theater() {
        return TablerIconsT1.theater();
    }

    public static Icon thermometer() {
        return TablerIconsT1.thermometer();
    }

    public static Icon thumbDown() {
        return TablerIconsT1.thumbDown();
    }

    public static Icon thumbDownOff() {
        return TablerIconsT1.thumbDownOff();
    }

    public static Icon thumbUp() {
        return TablerIconsT1.thumbUp();
    }

    public static Icon thumbUpOff() {
        return TablerIconsT1.thumbUpOff();
    }

    public static Icon ticTac() {
        return TablerIconsT1.ticTac();
    }

    public static Icon ticket() {
        return TablerIconsT1.ticket();
    }

    public static Icon ticketOff() {
        return TablerIconsT1.ticketOff();
    }

    public static Icon tie() {
        return TablerIconsT1.tie();
    }

    public static Icon tilde() {
        return TablerIconsT1.tilde();
    }

    public static Icon tiltShift() {
        return TablerIconsT1.tiltShift();
    }

    public static Icon tiltShiftOff() {
        return TablerIconsT1.tiltShiftOff();
    }

    public static Icon timeDurationN0() {
        return TablerIconsT1.timeDurationN0();
    }

    public static Icon timeDurationN10() {
        return TablerIconsT1.timeDurationN10();
    }

    public static Icon timeDurationN15() {
        return TablerIconsT1.timeDurationN15();
    }

    public static Icon timeDurationN30() {
        return TablerIconsT1.timeDurationN30();
    }

    public static Icon timeDurationN45() {
        return TablerIconsT1.timeDurationN45();
    }

    public static Icon timeDurationN5() {
        return TablerIconsT1.timeDurationN5();
    }

    public static Icon timeDurationN60() {
        return TablerIconsT1.timeDurationN60();
    }

    public static Icon timeDurationN90() {
        return TablerIconsT1.timeDurationN90();
    }

    public static Icon timeDurationOff() {
        return TablerIconsT1.timeDurationOff();
    }

    public static Icon timeline() {
        return TablerIconsT1.timeline();
    }

    public static Icon timelineEvent() {
        return TablerIconsT1.timelineEvent();
    }

    public static Icon timelineEventExclamation() {
        return TablerIconsT1.timelineEventExclamation();
    }

    public static Icon timelineEventMinus() {
        return TablerIconsT1.timelineEventMinus();
    }

    public static Icon timelineEventPlus() {
        return TablerIconsT1.timelineEventPlus();
    }

    public static Icon timelineEventText() {
        return TablerIconsT1.timelineEventText();
    }

    public static Icon timelineEventX() {
        return TablerIconsT1.timelineEventX();
    }

    public static Icon timezone() {
        return TablerIconsT1.timezone();
    }

    public static Icon tipJar() {
        return TablerIconsT1.tipJar();
    }

    public static Icon tipJarEuro() {
        return TablerIconsT1.tipJarEuro();
    }

    public static Icon tipJarPound() {
        return TablerIconsT1.tipJarPound();
    }

    public static Icon tir() {
        return TablerIconsT1.tir();
    }

    public static Icon toggleLeft() {
        return TablerIconsT1.toggleLeft();
    }

    public static Icon toggleRight() {
        return TablerIconsT1.toggleRight();
    }

    public static Icon toiletPaper() {
        return TablerIconsT1.toiletPaper();
    }

    public static Icon toiletPaperOff() {
        return TablerIconsT1.toiletPaperOff();
    }

    public static Icon toml() {
        return TablerIconsT1.toml();
    }

    public static Icon tool() {
        return TablerIconsT1.tool();
    }

    public static Icon tools() {
        return TablerIconsT1.tools();
    }

    public static Icon toolsKitchen() {
        return TablerIconsT1.toolsKitchen();
    }

    public static Icon toolsKitchenN2() {
        return TablerIconsT1.toolsKitchenN2();
    }

    public static Icon toolsKitchenN2Off() {
        return TablerIconsT1.toolsKitchenN2Off();
    }

    public static Icon toolsKitchenN3() {
        return TablerIconsT1.toolsKitchenN3();
    }

    public static Icon toolsKitchenOff() {
        return TablerIconsT1.toolsKitchenOff();
    }

    public static Icon toolsOff() {
        return TablerIconsT1.toolsOff();
    }

    public static Icon tooltip() {
        return TablerIconsT1.tooltip();
    }

    public static Icon topologyBus() {
        return TablerIconsT1.topologyBus();
    }

    public static Icon topologyComplex() {
        return TablerIconsT1.topologyComplex();
    }

    public static Icon topologyFull() {
        return TablerIconsT1.topologyFull();
    }

    public static Icon topologyFullHierarchy() {
        return TablerIconsT1.topologyFullHierarchy();
    }

    public static Icon topologyRing() {
        return TablerIconsT1.topologyRing();
    }

    public static Icon topologyRingN2() {
        return TablerIconsT1.topologyRingN2();
    }

    public static Icon topologyRingN3() {
        return TablerIconsT1.topologyRingN3();
    }

    public static Icon topologyStar() {
        return TablerIconsT1.topologyStar();
    }

    public static Icon topologyStarN2() {
        return TablerIconsT1.topologyStarN2();
    }

    public static Icon topologyStarN3() {
        return TablerIconsT1.topologyStarN3();
    }

    public static Icon topologyStarRing() {
        return TablerIconsT1.topologyStarRing();
    }

    public static Icon topologyStarRingN2() {
        return TablerIconsT1.topologyStarRingN2();
    }

    public static Icon topologyStarRingN3() {
        return TablerIconsT1.topologyStarRingN3();
    }

    public static Icon torii() {
        return TablerIconsT1.torii();
    }

    public static Icon tornado() {
        return TablerIconsT1.tornado();
    }

    public static Icon tournament() {
        return TablerIconsT1.tournament();
    }

    public static Icon tower() {
        return TablerIconsT1.tower();
    }

    public static Icon towerOff() {
        return TablerIconsT1.towerOff();
    }

    public static Icon track() {
        return TablerIconsT1.track();
    }

    public static Icon tractor() {
        return TablerIconsT1.tractor();
    }

    public static Icon trademark() {
        return TablerIconsT1.trademark();
    }

    public static Icon trafficCone() {
        return TablerIconsT1.trafficCone();
    }

    public static Icon trafficConeOff() {
        return TablerIconsT1.trafficConeOff();
    }

    public static Icon trafficLights() {
        return TablerIconsT1.trafficLights();
    }

    public static Icon trafficLightsOff() {
        return TablerIconsT1.trafficLightsOff();
    }

    public static Icon train() {
        return TablerIconsT1.train();
    }

    public static Icon transactionBitcoin() {
        return TablerIconsT1.transactionBitcoin();
    }

    public static Icon transactionDollar() {
        return TablerIconsT1.transactionDollar();
    }

    public static Icon transactionEuro() {
        return TablerIconsT1.transactionEuro();
    }

    public static Icon transactionPound() {
        return TablerIconsT1.transactionPound();
    }

    public static Icon transactionRupee() {
        return TablerIconsT1.transactionRupee();
    }

    public static Icon transactionYen() {
        return TablerIconsT1.transactionYen();
    }

    public static Icon transactionYuan() {
        return TablerIconsT1.transactionYuan();
    }

    public static Icon transfer() {
        return TablerIconsT1.transfer();
    }

    public static Icon transferIn() {
        return TablerIconsT1.transferIn();
    }

    public static Icon transferOut() {
        return TablerIconsT1.transferOut();
    }

    public static Icon transferVertical() {
        return TablerIconsT1.transferVertical();
    }

    public static Icon transform() {
        return TablerIconsT1.transform();
    }

    public static Icon transformPoint() {
        return TablerIconsT1.transformPoint();
    }

    public static Icon transformPointBottomLeft() {
        return TablerIconsT1.transformPointBottomLeft();
    }

    public static Icon transformPointBottomRight() {
        return TablerIconsT1.transformPointBottomRight();
    }

    public static Icon transformPointTopLeft() {
        return TablerIconsT1.transformPointTopLeft();
    }

    public static Icon transformPointTopRight() {
        return TablerIconsT1.transformPointTopRight();
    }

    public static Icon transitionBottom() {
        return TablerIconsT1.transitionBottom();
    }

    public static Icon transitionLeft() {
        return TablerIconsT1.transitionLeft();
    }

    public static Icon transitionRight() {
        return TablerIconsT1.transitionRight();
    }

    public static Icon transitionTop() {
        return TablerIconsT1.transitionTop();
    }

    public static Icon trash() {
        return TablerIconsT1.trash();
    }

    public static Icon trashOff() {
        return TablerIconsT1.trashOff();
    }

    public static Icon trashX() {
        return TablerIconsT1.trashX();
    }

    public static Icon treadmill() {
        return TablerIconsT1.treadmill();
    }

    public static Icon tree() {
        return TablerIconsT1.tree();
    }

    public static Icon trees() {
        return TablerIconsT1.trees();
    }

    public static Icon trekking() {
        return TablerIconsT1.trekking();
    }

    public static Icon trendingDown() {
        return TablerIconsT1.trendingDown();
    }

    public static Icon trendingDownN2() {
        return TablerIconsT2.trendingDownN2();
    }

    public static Icon trendingDownN3() {
        return TablerIconsT2.trendingDownN3();
    }

    public static Icon trendingUp() {
        return TablerIconsT2.trendingUp();
    }

    public static Icon trendingUpN2() {
        return TablerIconsT2.trendingUpN2();
    }

    public static Icon trendingUpN3() {
        return TablerIconsT2.trendingUpN3();
    }

    public static Icon trendingUpDown() {
        return TablerIconsT2.trendingUpDown();
    }

    public static Icon triangle() {
        return TablerIconsT2.triangle();
    }

    public static Icon triangleInverted() {
        return TablerIconsT2.triangleInverted();
    }

    public static Icon triangleMinus() {
        return TablerIconsT2.triangleMinus();
    }

    public static Icon triangleMinusN2() {
        return TablerIconsT2.triangleMinusN2();
    }

    public static Icon triangleOff() {
        return TablerIconsT2.triangleOff();
    }

    public static Icon trianglePlus() {
        return TablerIconsT2.trianglePlus();
    }

    public static Icon trianglePlusN2() {
        return TablerIconsT2.trianglePlusN2();
    }

    public static Icon triangleSquareCircle() {
        return TablerIconsT2.triangleSquareCircle();
    }

    public static Icon triangles() {
        return TablerIconsT2.triangles();
    }

    public static Icon trident() {
        return TablerIconsT2.trident();
    }

    public static Icon trolley() {
        return TablerIconsT2.trolley();
    }

    public static Icon trophy() {
        return TablerIconsT2.trophy();
    }

    public static Icon trophyOff() {
        return TablerIconsT2.trophyOff();
    }

    public static Icon trowel() {
        return TablerIconsT2.trowel();
    }

    public static Icon truck() {
        return TablerIconsT2.truck();
    }

    public static Icon truckDelivery() {
        return TablerIconsT2.truckDelivery();
    }

    public static Icon truckLoading() {
        return TablerIconsT2.truckLoading();
    }

    public static Icon truckOff() {
        return TablerIconsT2.truckOff();
    }

    public static Icon truckReturn() {
        return TablerIconsT2.truckReturn();
    }

    public static Icon txt() {
        return TablerIconsT2.txt();
    }

    public static Icon typeface() {
        return TablerIconsT2.typeface();
    }

    public static Icon typography() {
        return TablerIconsT2.typography();
    }

    public static Icon typographyOff() {
        return TablerIconsT2.typographyOff();
    }

    public static Icon uTurnLeft() {
        return TablerIconsU.uTurnLeft();
    }

    public static Icon uTurnRight() {
        return TablerIconsU.uTurnRight();
    }

    public static Icon ufo() {
        return TablerIconsU.ufo();
    }

    public static Icon ufoOff() {
        return TablerIconsU.ufoOff();
    }

    public static Icon uhd() {
        return TablerIconsU.uhd();
    }

    public static Icon umbrella() {
        return TablerIconsU.umbrella();
    }

    public static Icon umbrellaN2() {
        return TablerIconsU.umbrellaN2();
    }

    public static Icon umbrellaClosed() {
        return TablerIconsU.umbrellaClosed();
    }

    public static Icon umbrellaClosedN2() {
        return TablerIconsU.umbrellaClosedN2();
    }

    public static Icon umbrellaOff() {
        return TablerIconsU.umbrellaOff();
    }

    public static Icon underline() {
        return TablerIconsU.underline();
    }

    public static Icon unicycle() {
        return TablerIconsU.unicycle();
    }

    public static Icon universe() {
        return TablerIconsU.universe();
    }

    public static Icon unlink() {
        return TablerIconsU.unlink();
    }

    public static Icon upload() {
        return TablerIconsU.upload();
    }

    public static Icon urgent() {
        return TablerIconsU.urgent();
    }

    public static Icon usb() {
        return TablerIconsU.usb();
    }

    public static Icon user() {
        return TablerIconsU.user();
    }

    public static Icon userBitcoin() {
        return TablerIconsU.userBitcoin();
    }

    public static Icon userBolt() {
        return TablerIconsU.userBolt();
    }

    public static Icon userCancel() {
        return TablerIconsU.userCancel();
    }

    public static Icon userCheck() {
        return TablerIconsU.userCheck();
    }

    public static Icon userCircle() {
        return TablerIconsU.userCircle();
    }

    public static Icon userCode() {
        return TablerIconsU.userCode();
    }

    public static Icon userCog() {
        return TablerIconsU.userCog();
    }

    public static Icon userDollar() {
        return TablerIconsU.userDollar();
    }

    public static Icon userDown() {
        return TablerIconsU.userDown();
    }

    public static Icon userEdit() {
        return TablerIconsU.userEdit();
    }

    public static Icon userExclamation() {
        return TablerIconsU.userExclamation();
    }

    public static Icon userHeart() {
        return TablerIconsU.userHeart();
    }

    public static Icon userHexagon() {
        return TablerIconsU.userHexagon();
    }

    public static Icon userKey() {
        return TablerIconsU.userKey();
    }

    public static Icon userMinus() {
        return TablerIconsU.userMinus();
    }

    public static Icon userOff() {
        return TablerIconsU.userOff();
    }

    public static Icon userPause() {
        return TablerIconsU.userPause();
    }

    public static Icon userPentagon() {
        return TablerIconsU.userPentagon();
    }

    public static Icon userPin() {
        return TablerIconsU.userPin();
    }

    public static Icon userPlus() {
        return TablerIconsU.userPlus();
    }

    public static Icon userQuestion() {
        return TablerIconsU.userQuestion();
    }

    public static Icon userScan() {
        return TablerIconsU.userScan();
    }

    public static Icon userScreen() {
        return TablerIconsU.userScreen();
    }

    public static Icon userSearch() {
        return TablerIconsU.userSearch();
    }

    public static Icon userShare() {
        return TablerIconsU.userShare();
    }

    public static Icon userShield() {
        return TablerIconsU.userShield();
    }

    public static Icon userSquare() {
        return TablerIconsU.userSquare();
    }

    public static Icon userSquareRounded() {
        return TablerIconsU.userSquareRounded();
    }

    public static Icon userStar() {
        return TablerIconsU.userStar();
    }

    public static Icon userUp() {
        return TablerIconsU.userUp();
    }

    public static Icon userX() {
        return TablerIconsU.userX();
    }

    public static Icon users() {
        return TablerIconsU.users();
    }

    public static Icon usersGroup() {
        return TablerIconsU.usersGroup();
    }

    public static Icon usersMinus() {
        return TablerIconsU.usersMinus();
    }

    public static Icon usersPlus() {
        return TablerIconsU.usersPlus();
    }

    public static Icon uvIndex() {
        return TablerIconsU.uvIndex();
    }

    public static Icon uxCircle() {
        return TablerIconsU.uxCircle();
    }

    public static Icon vaccine() {
        return TablerIconsV.vaccine();
    }

    public static Icon vaccineBottle() {
        return TablerIconsV.vaccineBottle();
    }

    public static Icon vaccineBottleOff() {
        return TablerIconsV.vaccineBottleOff();
    }

    public static Icon vaccineOff() {
        return TablerIconsV.vaccineOff();
    }

    public static Icon vacuumCleaner() {
        return TablerIconsV.vacuumCleaner();
    }

    public static Icon variable() {
        return TablerIconsV.variable();
    }

    public static Icon variableMinus() {
        return TablerIconsV.variableMinus();
    }

    public static Icon variableOff() {
        return TablerIconsV.variableOff();
    }

    public static Icon variablePlus() {
        return TablerIconsV.variablePlus();
    }

    public static Icon vector() {
        return TablerIconsV.vector();
    }

    public static Icon vectorBezier() {
        return TablerIconsV.vectorBezier();
    }

    public static Icon vectorBezierN2() {
        return TablerIconsV.vectorBezierN2();
    }

    public static Icon vectorBezierArc() {
        return TablerIconsV.vectorBezierArc();
    }

    public static Icon vectorBezierCircle() {
        return TablerIconsV.vectorBezierCircle();
    }

    public static Icon vectorOff() {
        return TablerIconsV.vectorOff();
    }

    public static Icon vectorSpline() {
        return TablerIconsV.vectorSpline();
    }

    public static Icon vectorTriangle() {
        return TablerIconsV.vectorTriangle();
    }

    public static Icon vectorTriangleOff() {
        return TablerIconsV.vectorTriangleOff();
    }

    public static Icon venus() {
        return TablerIconsV.venus();
    }

    public static Icon versions() {
        return TablerIconsV.versions();
    }

    public static Icon versionsOff() {
        return TablerIconsV.versionsOff();
    }

    public static Icon video() {
        return TablerIconsV.video();
    }

    public static Icon videoMinus() {
        return TablerIconsV.videoMinus();
    }

    public static Icon videoOff() {
        return TablerIconsV.videoOff();
    }

    public static Icon videoPlus() {
        return TablerIconsV.videoPlus();
    }

    public static Icon viewN360() {
        return TablerIconsV.viewN360();
    }

    public static Icon viewN360Arrow() {
        return TablerIconsV.viewN360Arrow();
    }

    public static Icon viewN360Number() {
        return TablerIconsV.viewN360Number();
    }

    public static Icon viewN360Off() {
        return TablerIconsV.viewN360Off();
    }

    public static Icon viewfinder() {
        return TablerIconsV.viewfinder();
    }

    public static Icon viewfinderOff() {
        return TablerIconsV.viewfinderOff();
    }

    public static Icon viewportNarrow() {
        return TablerIconsV.viewportNarrow();
    }

    public static Icon viewportShort() {
        return TablerIconsV.viewportShort();
    }

    public static Icon viewportTall() {
        return TablerIconsV.viewportTall();
    }

    public static Icon viewportWide() {
        return TablerIconsV.viewportWide();
    }

    public static Icon vignette() {
        return TablerIconsV.vignette();
    }

    public static Icon vinyl() {
        return TablerIconsV.vinyl();
    }

    public static Icon vip() {
        return TablerIconsV.vip();
    }

    public static Icon vipN2() {
        return TablerIconsV.vipN2();
    }

    public static Icon vipOff() {
        return TablerIconsV.vipOff();
    }

    public static Icon virus() {
        return TablerIconsV.virus();
    }

    public static Icon virusOff() {
        return TablerIconsV.virusOff();
    }

    public static Icon virusSearch() {
        return TablerIconsV.virusSearch();
    }

    public static Icon vocabulary() {
        return TablerIconsV.vocabulary();
    }

    public static Icon vocabularyOff() {
        return TablerIconsV.vocabularyOff();
    }

    public static Icon volcano() {
        return TablerIconsV.volcano();
    }

    public static Icon volume() {
        return TablerIconsV.volume();
    }

    public static Icon volumeN2() {
        return TablerIconsV.volumeN2();
    }

    public static Icon volumeN3() {
        return TablerIconsV.volumeN3();
    }

    public static Icon volumeN4() {
        return TablerIconsV.volumeN4();
    }

    public static Icon volumeOff() {
        return TablerIconsV.volumeOff();
    }

    public static Icon vs() {
        return TablerIconsV.vs();
    }

    public static Icon walk() {
        return TablerIconsW.walk();
    }

    public static Icon wall() {
        return TablerIconsW.wall();
    }

    public static Icon wallOff() {
        return TablerIconsW.wallOff();
    }

    public static Icon wallet() {
        return TablerIconsW.wallet();
    }

    public static Icon walletOff() {
        return TablerIconsW.walletOff();
    }

    public static Icon wallpaper() {
        return TablerIconsW.wallpaper();
    }

    public static Icon wallpaperOff() {
        return TablerIconsW.wallpaperOff();
    }

    public static Icon wand() {
        return TablerIconsW.wand();
    }

    public static Icon wandOff() {
        return TablerIconsW.wandOff();
    }

    public static Icon wash() {
        return TablerIconsW.wash();
    }

    public static Icon washDry() {
        return TablerIconsW.washDry();
    }

    public static Icon washDryN1() {
        return TablerIconsW.washDryN1();
    }

    public static Icon washDryN2() {
        return TablerIconsW.washDryN2();
    }

    public static Icon washDryN3() {
        return TablerIconsW.washDryN3();
    }

    public static Icon washDryA() {
        return TablerIconsW.washDryA();
    }

    public static Icon washDryDip() {
        return TablerIconsW.washDryDip();
    }

    public static Icon washDryF() {
        return TablerIconsW.washDryF();
    }

    public static Icon washDryFlat() {
        return TablerIconsW.washDryFlat();
    }

    public static Icon washDryHang() {
        return TablerIconsW.washDryHang();
    }

    public static Icon washDryOff() {
        return TablerIconsW.washDryOff();
    }

    public static Icon washDryP() {
        return TablerIconsW.washDryP();
    }

    public static Icon washDryShade() {
        return TablerIconsW.washDryShade();
    }

    public static Icon washDryW() {
        return TablerIconsW.washDryW();
    }

    public static Icon washDryclean() {
        return TablerIconsW.washDryclean();
    }

    public static Icon washDrycleanOff() {
        return TablerIconsW.washDrycleanOff();
    }

    public static Icon washEco() {
        return TablerIconsW.washEco();
    }

    public static Icon washGentle() {
        return TablerIconsW.washGentle();
    }

    public static Icon washHand() {
        return TablerIconsW.washHand();
    }

    public static Icon washMachine() {
        return TablerIconsW.washMachine();
    }

    public static Icon washOff() {
        return TablerIconsW.washOff();
    }

    public static Icon washPress() {
        return TablerIconsW.washPress();
    }

    public static Icon washTemperatureN1() {
        return TablerIconsW.washTemperatureN1();
    }

    public static Icon washTemperatureN2() {
        return TablerIconsW.washTemperatureN2();
    }

    public static Icon washTemperatureN3() {
        return TablerIconsW.washTemperatureN3();
    }

    public static Icon washTemperatureN4() {
        return TablerIconsW.washTemperatureN4();
    }

    public static Icon washTemperatureN5() {
        return TablerIconsW.washTemperatureN5();
    }

    public static Icon washTemperatureN6() {
        return TablerIconsW.washTemperatureN6();
    }

    public static Icon washTumbleDry() {
        return TablerIconsW.washTumbleDry();
    }

    public static Icon washTumbleOff() {
        return TablerIconsW.washTumbleOff();
    }

    public static Icon waterpolo() {
        return TablerIconsW.waterpolo();
    }

    public static Icon waveSawTool() {
        return TablerIconsW.waveSawTool();
    }

    public static Icon waveSine() {
        return TablerIconsW.waveSine();
    }

    public static Icon waveSquare() {
        return TablerIconsW.waveSquare();
    }

    public static Icon wavesElectricity() {
        return TablerIconsW.wavesElectricity();
    }

    public static Icon webhook() {
        return TablerIconsW.webhook();
    }

    public static Icon webhookOff() {
        return TablerIconsW.webhookOff();
    }

    public static Icon weight() {
        return TablerIconsW.weight();
    }

    public static Icon wheat() {
        return TablerIconsW.wheat();
    }

    public static Icon wheatOff() {
        return TablerIconsW.wheatOff();
    }

    public static Icon wheel() {
        return TablerIconsW.wheel();
    }

    public static Icon wheelchair() {
        return TablerIconsW.wheelchair();
    }

    public static Icon wheelchairOff() {
        return TablerIconsW.wheelchairOff();
    }

    public static Icon whirl() {
        return TablerIconsW.whirl();
    }

    public static Icon whisk() {
        return TablerIconsW.whisk();
    }

    public static Icon wifi() {
        return TablerIconsW.wifi();
    }

    public static Icon wifiN0() {
        return TablerIconsW.wifiN0();
    }

    public static Icon wifiN1() {
        return TablerIconsW.wifiN1();
    }

    public static Icon wifiN2() {
        return TablerIconsW.wifiN2();
    }

    public static Icon wifiOff() {
        return TablerIconsW.wifiOff();
    }

    public static Icon wind() {
        return TablerIconsW.wind();
    }

    public static Icon windElectricity() {
        return TablerIconsW.windElectricity();
    }

    public static Icon windOff() {
        return TablerIconsW.windOff();
    }

    public static Icon windmill() {
        return TablerIconsW.windmill();
    }

    public static Icon windmillOff() {
        return TablerIconsW.windmillOff();
    }

    public static Icon window() {
        return TablerIconsW.window();
    }

    public static Icon windowMaximize() {
        return TablerIconsW.windowMaximize();
    }

    public static Icon windowMinimize() {
        return TablerIconsW.windowMinimize();
    }

    public static Icon windowOff() {
        return TablerIconsW.windowOff();
    }

    public static Icon windsock() {
        return TablerIconsW.windsock();
    }

    public static Icon wiper() {
        return TablerIconsW.wiper();
    }

    public static Icon wiperWash() {
        return TablerIconsW.wiperWash();
    }

    public static Icon woman() {
        return TablerIconsW.woman();
    }

    public static Icon wood() {
        return TablerIconsW.wood();
    }

    public static Icon world() {
        return TablerIconsW.world();
    }

    public static Icon worldBolt() {
        return TablerIconsW.worldBolt();
    }

    public static Icon worldCancel() {
        return TablerIconsW.worldCancel();
    }

    public static Icon worldCheck() {
        return TablerIconsW.worldCheck();
    }

    public static Icon worldCode() {
        return TablerIconsW.worldCode();
    }

    public static Icon worldCog() {
        return TablerIconsW.worldCog();
    }

    public static Icon worldDollar() {
        return TablerIconsW.worldDollar();
    }

    public static Icon worldDown() {
        return TablerIconsW.worldDown();
    }

    public static Icon worldDownload() {
        return TablerIconsW.worldDownload();
    }

    public static Icon worldExclamation() {
        return TablerIconsW.worldExclamation();
    }

    public static Icon worldHeart() {
        return TablerIconsW.worldHeart();
    }

    public static Icon worldLatitude() {
        return TablerIconsW.worldLatitude();
    }

    public static Icon worldLongitude() {
        return TablerIconsW.worldLongitude();
    }

    public static Icon worldMap() {
        return TablerIconsW.worldMap();
    }

    public static Icon worldMinus() {
        return TablerIconsW.worldMinus();
    }

    public static Icon worldOff() {
        return TablerIconsW.worldOff();
    }

    public static Icon worldPause() {
        return TablerIconsW.worldPause();
    }

    public static Icon worldPin() {
        return TablerIconsW.worldPin();
    }

    public static Icon worldPlus() {
        return TablerIconsW.worldPlus();
    }

    public static Icon worldQuestion() {
        return TablerIconsW.worldQuestion();
    }

    public static Icon worldSearch() {
        return TablerIconsW.worldSearch();
    }

    public static Icon worldShare() {
        return TablerIconsW.worldShare();
    }

    public static Icon worldStar() {
        return TablerIconsW.worldStar();
    }

    public static Icon worldUp() {
        return TablerIconsW.worldUp();
    }

    public static Icon worldUpload() {
        return TablerIconsW.worldUpload();
    }

    public static Icon worldWww() {
        return TablerIconsW.worldWww();
    }

    public static Icon worldX() {
        return TablerIconsW.worldX();
    }

    public static Icon wreckingBall() {
        return TablerIconsW.wreckingBall();
    }

    public static Icon writing() {
        return TablerIconsW.writing();
    }

    public static Icon writingOff() {
        return TablerIconsW.writingOff();
    }

    public static Icon writingSign() {
        return TablerIconsW.writingSign();
    }

    public static Icon writingSignOff() {
        return TablerIconsW.writingSignOff();
    }

    public static Icon x() {
        return TablerIconsX.x();
    }

    public static Icon xMark() {
        return TablerIconsX.xMark();
    }

    public static Icon xPowerY() {
        return TablerIconsX.xPowerY();
    }

    public static Icon xboxA() {
        return TablerIconsX.xboxA();
    }

    public static Icon xboxB() {
        return TablerIconsX.xboxB();
    }

    public static Icon xboxX() {
        return TablerIconsX.xboxX();
    }

    public static Icon xboxY() {
        return TablerIconsX.xboxY();
    }

    public static Icon xd() {
        return TablerIconsX.xd();
    }

    public static Icon xxx() {
        return TablerIconsX.xxx();
    }

    public static Icon yinYang() {
        return TablerIconsY.yinYang();
    }

    public static Icon yoga() {
        return TablerIconsY.yoga();
    }

    public static Icon zeppelin() {
        return TablerIconsZ.zeppelin();
    }

    public static Icon zeppelinOff() {
        return TablerIconsZ.zeppelinOff();
    }

    public static Icon zeroConfig() {
        return TablerIconsZ.zeroConfig();
    }

    public static Icon zip() {
        return TablerIconsZ.zip();
    }

    public static Icon zodiacAquarius() {
        return TablerIconsZ.zodiacAquarius();
    }

    public static Icon zodiacAries() {
        return TablerIconsZ.zodiacAries();
    }

    public static Icon zodiacCancer() {
        return TablerIconsZ.zodiacCancer();
    }

    public static Icon zodiacCapricorn() {
        return TablerIconsZ.zodiacCapricorn();
    }

    public static Icon zodiacGemini() {
        return TablerIconsZ.zodiacGemini();
    }

    public static Icon zodiacLeo() {
        return TablerIconsZ.zodiacLeo();
    }

    public static Icon zodiacLibra() {
        return TablerIconsZ.zodiacLibra();
    }

    public static Icon zodiacPisces() {
        return TablerIconsZ.zodiacPisces();
    }

    public static Icon zodiacSagittarius() {
        return TablerIconsZ.zodiacSagittarius();
    }

    public static Icon zodiacScorpio() {
        return TablerIconsZ.zodiacScorpio();
    }

    public static Icon zodiacTaurus() {
        return TablerIconsZ.zodiacTaurus();
    }

    public static Icon zodiacVirgo() {
        return TablerIconsZ.zodiacVirgo();
    }

    public static Icon zoom() {
        return TablerIconsZ.zoom();
    }

    public static Icon zoomCancel() {
        return TablerIconsZ.zoomCancel();
    }

    public static Icon zoomCheck() {
        return TablerIconsZ.zoomCheck();
    }

    public static Icon zoomCode() {
        return TablerIconsZ.zoomCode();
    }

    public static Icon zoomExclamation() {
        return TablerIconsZ.zoomExclamation();
    }

    public static Icon zoomIn() {
        return TablerIconsZ.zoomIn();
    }

    public static Icon zoomInArea() {
        return TablerIconsZ.zoomInArea();
    }

    public static Icon zoomMoney() {
        return TablerIconsZ.zoomMoney();
    }

    public static Icon zoomOut() {
        return TablerIconsZ.zoomOut();
    }

    public static Icon zoomOutArea() {
        return TablerIconsZ.zoomOutArea();
    }

    public static Icon zoomPan() {
        return TablerIconsZ.zoomPan();
    }

    public static Icon zoomQuestion() {
        return TablerIconsZ.zoomQuestion();
    }

    public static Icon zoomReplace() {
        return TablerIconsZ.zoomReplace();
    }

    public static Icon zoomReset() {
        return TablerIconsZ.zoomReset();
    }

    public static Icon zoomScan() {
        return TablerIconsZ.zoomScan();
    }

    public static Icon zzz() {
        return TablerIconsZ.zzz();
    }

    public static Icon zzzOff() {
        return TablerIconsZ.zzzOff();
    }
}
