package org.gwtfusion.icons.heroicons;

import org.gwtfusion.ui.component.icon.Icon;
import org.gwtfusion.ui.component.icon.IconProvider;

public final class HeroIcons {
    public static final int OUTLINE_COUNT = 324;
    public static final int SOLID_COUNT = 324;
    public static final int MINI_COUNT = 324;
    public static final int MICRO_COUNT = 316;
    public static final int COUNT = OUTLINE_COUNT;

    private HeroIcons() {
    }

    public static IconProvider provider() {
        return provider(HeroIconStyle.OUTLINE);
    }

    public static IconProvider provider(HeroIconStyle style) {
        return new HeroIconProvider(style);
    }

    public static String[] names() {
        return names(HeroIconStyle.OUTLINE);
    }

    public static String[] names(HeroIconStyle style) {
        switch (normalize(style)) {
            case SOLID:
                return HeroIconsSolid.names();
            case MINI:
                return HeroIconsMini.names();
            case MICRO:
                return HeroIconsMicro.names();
            case OUTLINE:
            default:
                return HeroIconsOutline.names();
        }
    }

    public static Icon icon(String name) {
        return icon(name, HeroIconStyle.OUTLINE);
    }

    public static Icon icon(String name, HeroIconStyle style) {
        if (name == null || name.isEmpty()) {
            return null;
        }
        switch (normalize(style)) {
            case SOLID:
                return HeroIconsSolid.icon(name);
            case MINI:
                return HeroIconsMini.icon(name);
            case MICRO:
                return HeroIconsMicro.icon(name);
            case OUTLINE:
            default:
                return HeroIconsOutline.icon(name);
        }
    }

    static int count(HeroIconStyle style) {
        switch (normalize(style)) {
            case SOLID:
                return SOLID_COUNT;
            case MINI:
                return MINI_COUNT;
            case MICRO:
                return MICRO_COUNT;
            case OUTLINE:
            default:
                return OUTLINE_COUNT;
        }
    }

    static HeroIconStyle normalize(HeroIconStyle style) {
        return style == null ? HeroIconStyle.OUTLINE : style;
    }

    public static Icon academicCap() {
        return academicCap(HeroIconStyle.OUTLINE);
    }

    public static Icon academicCap(HeroIconStyle style) {
        return icon("academic-cap", style);
    }

    public static Icon adjustmentsHorizontal() {
        return adjustmentsHorizontal(HeroIconStyle.OUTLINE);
    }

    public static Icon adjustmentsHorizontal(HeroIconStyle style) {
        return icon("adjustments-horizontal", style);
    }

    public static Icon adjustmentsVertical() {
        return adjustmentsVertical(HeroIconStyle.OUTLINE);
    }

    public static Icon adjustmentsVertical(HeroIconStyle style) {
        return icon("adjustments-vertical", style);
    }

    public static Icon archiveBox() {
        return archiveBox(HeroIconStyle.OUTLINE);
    }

    public static Icon archiveBox(HeroIconStyle style) {
        return icon("archive-box", style);
    }

    public static Icon archiveBoxArrowDown() {
        return archiveBoxArrowDown(HeroIconStyle.OUTLINE);
    }

    public static Icon archiveBoxArrowDown(HeroIconStyle style) {
        return icon("archive-box-arrow-down", style);
    }

    public static Icon archiveBoxXMark() {
        return archiveBoxXMark(HeroIconStyle.OUTLINE);
    }

    public static Icon archiveBoxXMark(HeroIconStyle style) {
        return icon("archive-box-x-mark", style);
    }

    public static Icon arrowDown() {
        return arrowDown(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowDown(HeroIconStyle style) {
        return icon("arrow-down", style);
    }

    public static Icon arrowDownCircle() {
        return arrowDownCircle(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowDownCircle(HeroIconStyle style) {
        return icon("arrow-down-circle", style);
    }

    public static Icon arrowDownLeft() {
        return arrowDownLeft(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowDownLeft(HeroIconStyle style) {
        return icon("arrow-down-left", style);
    }

    public static Icon arrowDownOnSquare() {
        return arrowDownOnSquare(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowDownOnSquare(HeroIconStyle style) {
        return icon("arrow-down-on-square", style);
    }

    public static Icon arrowDownOnSquareStack() {
        return arrowDownOnSquareStack(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowDownOnSquareStack(HeroIconStyle style) {
        return icon("arrow-down-on-square-stack", style);
    }

    public static Icon arrowDownRight() {
        return arrowDownRight(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowDownRight(HeroIconStyle style) {
        return icon("arrow-down-right", style);
    }

    public static Icon arrowDownTray() {
        return arrowDownTray(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowDownTray(HeroIconStyle style) {
        return icon("arrow-down-tray", style);
    }

    public static Icon arrowLeft() {
        return arrowLeft(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowLeft(HeroIconStyle style) {
        return icon("arrow-left", style);
    }

    public static Icon arrowLeftCircle() {
        return arrowLeftCircle(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowLeftCircle(HeroIconStyle style) {
        return icon("arrow-left-circle", style);
    }

    public static Icon arrowLeftEndOnRectangle() {
        return arrowLeftEndOnRectangle(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowLeftEndOnRectangle(HeroIconStyle style) {
        return icon("arrow-left-end-on-rectangle", style);
    }

    public static Icon arrowLeftOnRectangle() {
        return arrowLeftOnRectangle(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowLeftOnRectangle(HeroIconStyle style) {
        return icon("arrow-left-on-rectangle", style);
    }

    public static Icon arrowLeftStartOnRectangle() {
        return arrowLeftStartOnRectangle(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowLeftStartOnRectangle(HeroIconStyle style) {
        return icon("arrow-left-start-on-rectangle", style);
    }

    public static Icon arrowLongDown() {
        return arrowLongDown(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowLongDown(HeroIconStyle style) {
        return icon("arrow-long-down", style);
    }

    public static Icon arrowLongLeft() {
        return arrowLongLeft(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowLongLeft(HeroIconStyle style) {
        return icon("arrow-long-left", style);
    }

    public static Icon arrowLongRight() {
        return arrowLongRight(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowLongRight(HeroIconStyle style) {
        return icon("arrow-long-right", style);
    }

    public static Icon arrowLongUp() {
        return arrowLongUp(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowLongUp(HeroIconStyle style) {
        return icon("arrow-long-up", style);
    }

    public static Icon arrowPath() {
        return arrowPath(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowPath(HeroIconStyle style) {
        return icon("arrow-path", style);
    }

    public static Icon arrowPathRoundedSquare() {
        return arrowPathRoundedSquare(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowPathRoundedSquare(HeroIconStyle style) {
        return icon("arrow-path-rounded-square", style);
    }

    public static Icon arrowRight() {
        return arrowRight(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowRight(HeroIconStyle style) {
        return icon("arrow-right", style);
    }

    public static Icon arrowRightCircle() {
        return arrowRightCircle(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowRightCircle(HeroIconStyle style) {
        return icon("arrow-right-circle", style);
    }

    public static Icon arrowRightEndOnRectangle() {
        return arrowRightEndOnRectangle(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowRightEndOnRectangle(HeroIconStyle style) {
        return icon("arrow-right-end-on-rectangle", style);
    }

    public static Icon arrowRightOnRectangle() {
        return arrowRightOnRectangle(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowRightOnRectangle(HeroIconStyle style) {
        return icon("arrow-right-on-rectangle", style);
    }

    public static Icon arrowRightStartOnRectangle() {
        return arrowRightStartOnRectangle(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowRightStartOnRectangle(HeroIconStyle style) {
        return icon("arrow-right-start-on-rectangle", style);
    }

    public static Icon arrowSmallDown() {
        return arrowSmallDown(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowSmallDown(HeroIconStyle style) {
        return icon("arrow-small-down", style);
    }

    public static Icon arrowSmallLeft() {
        return arrowSmallLeft(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowSmallLeft(HeroIconStyle style) {
        return icon("arrow-small-left", style);
    }

    public static Icon arrowSmallRight() {
        return arrowSmallRight(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowSmallRight(HeroIconStyle style) {
        return icon("arrow-small-right", style);
    }

    public static Icon arrowSmallUp() {
        return arrowSmallUp(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowSmallUp(HeroIconStyle style) {
        return icon("arrow-small-up", style);
    }

    public static Icon arrowTopRightOnSquare() {
        return arrowTopRightOnSquare(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowTopRightOnSquare(HeroIconStyle style) {
        return icon("arrow-top-right-on-square", style);
    }

    public static Icon arrowTrendingDown() {
        return arrowTrendingDown(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowTrendingDown(HeroIconStyle style) {
        return icon("arrow-trending-down", style);
    }

    public static Icon arrowTrendingUp() {
        return arrowTrendingUp(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowTrendingUp(HeroIconStyle style) {
        return icon("arrow-trending-up", style);
    }

    public static Icon arrowTurnDownLeft() {
        return arrowTurnDownLeft(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowTurnDownLeft(HeroIconStyle style) {
        return icon("arrow-turn-down-left", style);
    }

    public static Icon arrowTurnDownRight() {
        return arrowTurnDownRight(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowTurnDownRight(HeroIconStyle style) {
        return icon("arrow-turn-down-right", style);
    }

    public static Icon arrowTurnLeftDown() {
        return arrowTurnLeftDown(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowTurnLeftDown(HeroIconStyle style) {
        return icon("arrow-turn-left-down", style);
    }

    public static Icon arrowTurnLeftUp() {
        return arrowTurnLeftUp(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowTurnLeftUp(HeroIconStyle style) {
        return icon("arrow-turn-left-up", style);
    }

    public static Icon arrowTurnRightDown() {
        return arrowTurnRightDown(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowTurnRightDown(HeroIconStyle style) {
        return icon("arrow-turn-right-down", style);
    }

    public static Icon arrowTurnRightUp() {
        return arrowTurnRightUp(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowTurnRightUp(HeroIconStyle style) {
        return icon("arrow-turn-right-up", style);
    }

    public static Icon arrowTurnUpLeft() {
        return arrowTurnUpLeft(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowTurnUpLeft(HeroIconStyle style) {
        return icon("arrow-turn-up-left", style);
    }

    public static Icon arrowTurnUpRight() {
        return arrowTurnUpRight(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowTurnUpRight(HeroIconStyle style) {
        return icon("arrow-turn-up-right", style);
    }

    public static Icon arrowUp() {
        return arrowUp(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowUp(HeroIconStyle style) {
        return icon("arrow-up", style);
    }

    public static Icon arrowUpCircle() {
        return arrowUpCircle(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowUpCircle(HeroIconStyle style) {
        return icon("arrow-up-circle", style);
    }

    public static Icon arrowUpLeft() {
        return arrowUpLeft(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowUpLeft(HeroIconStyle style) {
        return icon("arrow-up-left", style);
    }

    public static Icon arrowUpOnSquare() {
        return arrowUpOnSquare(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowUpOnSquare(HeroIconStyle style) {
        return icon("arrow-up-on-square", style);
    }

    public static Icon arrowUpOnSquareStack() {
        return arrowUpOnSquareStack(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowUpOnSquareStack(HeroIconStyle style) {
        return icon("arrow-up-on-square-stack", style);
    }

    public static Icon arrowUpRight() {
        return arrowUpRight(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowUpRight(HeroIconStyle style) {
        return icon("arrow-up-right", style);
    }

    public static Icon arrowUpTray() {
        return arrowUpTray(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowUpTray(HeroIconStyle style) {
        return icon("arrow-up-tray", style);
    }

    public static Icon arrowUturnDown() {
        return arrowUturnDown(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowUturnDown(HeroIconStyle style) {
        return icon("arrow-uturn-down", style);
    }

    public static Icon arrowUturnLeft() {
        return arrowUturnLeft(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowUturnLeft(HeroIconStyle style) {
        return icon("arrow-uturn-left", style);
    }

    public static Icon arrowUturnRight() {
        return arrowUturnRight(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowUturnRight(HeroIconStyle style) {
        return icon("arrow-uturn-right", style);
    }

    public static Icon arrowUturnUp() {
        return arrowUturnUp(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowUturnUp(HeroIconStyle style) {
        return icon("arrow-uturn-up", style);
    }

    public static Icon arrowsPointingIn() {
        return arrowsPointingIn(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowsPointingIn(HeroIconStyle style) {
        return icon("arrows-pointing-in", style);
    }

    public static Icon arrowsPointingOut() {
        return arrowsPointingOut(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowsPointingOut(HeroIconStyle style) {
        return icon("arrows-pointing-out", style);
    }

    public static Icon arrowsRightLeft() {
        return arrowsRightLeft(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowsRightLeft(HeroIconStyle style) {
        return icon("arrows-right-left", style);
    }

    public static Icon arrowsUpDown() {
        return arrowsUpDown(HeroIconStyle.OUTLINE);
    }

    public static Icon arrowsUpDown(HeroIconStyle style) {
        return icon("arrows-up-down", style);
    }

    public static Icon atSymbol() {
        return atSymbol(HeroIconStyle.OUTLINE);
    }

    public static Icon atSymbol(HeroIconStyle style) {
        return icon("at-symbol", style);
    }

    public static Icon backspace() {
        return backspace(HeroIconStyle.OUTLINE);
    }

    public static Icon backspace(HeroIconStyle style) {
        return icon("backspace", style);
    }

    public static Icon backward() {
        return backward(HeroIconStyle.OUTLINE);
    }

    public static Icon backward(HeroIconStyle style) {
        return icon("backward", style);
    }

    public static Icon banknotes() {
        return banknotes(HeroIconStyle.OUTLINE);
    }

    public static Icon banknotes(HeroIconStyle style) {
        return icon("banknotes", style);
    }

    public static Icon barsN2() {
        return barsN2(HeroIconStyle.OUTLINE);
    }

    public static Icon barsN2(HeroIconStyle style) {
        return icon("bars-2", style);
    }

    public static Icon barsN3() {
        return barsN3(HeroIconStyle.OUTLINE);
    }

    public static Icon barsN3(HeroIconStyle style) {
        return icon("bars-3", style);
    }

    public static Icon barsN3BottomLeft() {
        return barsN3BottomLeft(HeroIconStyle.OUTLINE);
    }

    public static Icon barsN3BottomLeft(HeroIconStyle style) {
        return icon("bars-3-bottom-left", style);
    }

    public static Icon barsN3BottomRight() {
        return barsN3BottomRight(HeroIconStyle.OUTLINE);
    }

    public static Icon barsN3BottomRight(HeroIconStyle style) {
        return icon("bars-3-bottom-right", style);
    }

    public static Icon barsN3CenterLeft() {
        return barsN3CenterLeft(HeroIconStyle.OUTLINE);
    }

    public static Icon barsN3CenterLeft(HeroIconStyle style) {
        return icon("bars-3-center-left", style);
    }

    public static Icon barsN4() {
        return barsN4(HeroIconStyle.OUTLINE);
    }

    public static Icon barsN4(HeroIconStyle style) {
        return icon("bars-4", style);
    }

    public static Icon barsArrowDown() {
        return barsArrowDown(HeroIconStyle.OUTLINE);
    }

    public static Icon barsArrowDown(HeroIconStyle style) {
        return icon("bars-arrow-down", style);
    }

    public static Icon barsArrowUp() {
        return barsArrowUp(HeroIconStyle.OUTLINE);
    }

    public static Icon barsArrowUp(HeroIconStyle style) {
        return icon("bars-arrow-up", style);
    }

    public static Icon batteryN0() {
        return batteryN0(HeroIconStyle.OUTLINE);
    }

    public static Icon batteryN0(HeroIconStyle style) {
        return icon("battery-0", style);
    }

    public static Icon batteryN100() {
        return batteryN100(HeroIconStyle.OUTLINE);
    }

    public static Icon batteryN100(HeroIconStyle style) {
        return icon("battery-100", style);
    }

    public static Icon batteryN50() {
        return batteryN50(HeroIconStyle.OUTLINE);
    }

    public static Icon batteryN50(HeroIconStyle style) {
        return icon("battery-50", style);
    }

    public static Icon beaker() {
        return beaker(HeroIconStyle.OUTLINE);
    }

    public static Icon beaker(HeroIconStyle style) {
        return icon("beaker", style);
    }

    public static Icon bell() {
        return bell(HeroIconStyle.OUTLINE);
    }

    public static Icon bell(HeroIconStyle style) {
        return icon("bell", style);
    }

    public static Icon bellAlert() {
        return bellAlert(HeroIconStyle.OUTLINE);
    }

    public static Icon bellAlert(HeroIconStyle style) {
        return icon("bell-alert", style);
    }

    public static Icon bellSlash() {
        return bellSlash(HeroIconStyle.OUTLINE);
    }

    public static Icon bellSlash(HeroIconStyle style) {
        return icon("bell-slash", style);
    }

    public static Icon bellSnooze() {
        return bellSnooze(HeroIconStyle.OUTLINE);
    }

    public static Icon bellSnooze(HeroIconStyle style) {
        return icon("bell-snooze", style);
    }

    public static Icon bold() {
        return bold(HeroIconStyle.OUTLINE);
    }

    public static Icon bold(HeroIconStyle style) {
        return icon("bold", style);
    }

    public static Icon bolt() {
        return bolt(HeroIconStyle.OUTLINE);
    }

    public static Icon bolt(HeroIconStyle style) {
        return icon("bolt", style);
    }

    public static Icon boltSlash() {
        return boltSlash(HeroIconStyle.OUTLINE);
    }

    public static Icon boltSlash(HeroIconStyle style) {
        return icon("bolt-slash", style);
    }

    public static Icon bookOpen() {
        return bookOpen(HeroIconStyle.OUTLINE);
    }

    public static Icon bookOpen(HeroIconStyle style) {
        return icon("book-open", style);
    }

    public static Icon bookmark() {
        return bookmark(HeroIconStyle.OUTLINE);
    }

    public static Icon bookmark(HeroIconStyle style) {
        return icon("bookmark", style);
    }

    public static Icon bookmarkSlash() {
        return bookmarkSlash(HeroIconStyle.OUTLINE);
    }

    public static Icon bookmarkSlash(HeroIconStyle style) {
        return icon("bookmark-slash", style);
    }

    public static Icon bookmarkSquare() {
        return bookmarkSquare(HeroIconStyle.OUTLINE);
    }

    public static Icon bookmarkSquare(HeroIconStyle style) {
        return icon("bookmark-square", style);
    }

    public static Icon briefcase() {
        return briefcase(HeroIconStyle.OUTLINE);
    }

    public static Icon briefcase(HeroIconStyle style) {
        return icon("briefcase", style);
    }

    public static Icon bugAnt() {
        return bugAnt(HeroIconStyle.OUTLINE);
    }

    public static Icon bugAnt(HeroIconStyle style) {
        return icon("bug-ant", style);
    }

    public static Icon buildingLibrary() {
        return buildingLibrary(HeroIconStyle.OUTLINE);
    }

    public static Icon buildingLibrary(HeroIconStyle style) {
        return icon("building-library", style);
    }

    public static Icon buildingOffice() {
        return buildingOffice(HeroIconStyle.OUTLINE);
    }

    public static Icon buildingOffice(HeroIconStyle style) {
        return icon("building-office", style);
    }

    public static Icon buildingOfficeN2() {
        return buildingOfficeN2(HeroIconStyle.OUTLINE);
    }

    public static Icon buildingOfficeN2(HeroIconStyle style) {
        return icon("building-office-2", style);
    }

    public static Icon buildingStorefront() {
        return buildingStorefront(HeroIconStyle.OUTLINE);
    }

    public static Icon buildingStorefront(HeroIconStyle style) {
        return icon("building-storefront", style);
    }

    public static Icon cake() {
        return cake(HeroIconStyle.OUTLINE);
    }

    public static Icon cake(HeroIconStyle style) {
        return icon("cake", style);
    }

    public static Icon calculator() {
        return calculator(HeroIconStyle.OUTLINE);
    }

    public static Icon calculator(HeroIconStyle style) {
        return icon("calculator", style);
    }

    public static Icon calendar() {
        return calendar(HeroIconStyle.OUTLINE);
    }

    public static Icon calendar(HeroIconStyle style) {
        return icon("calendar", style);
    }

    public static Icon calendarDateRange() {
        return calendarDateRange(HeroIconStyle.OUTLINE);
    }

    public static Icon calendarDateRange(HeroIconStyle style) {
        return icon("calendar-date-range", style);
    }

    public static Icon calendarDays() {
        return calendarDays(HeroIconStyle.OUTLINE);
    }

    public static Icon calendarDays(HeroIconStyle style) {
        return icon("calendar-days", style);
    }

    public static Icon camera() {
        return camera(HeroIconStyle.OUTLINE);
    }

    public static Icon camera(HeroIconStyle style) {
        return icon("camera", style);
    }

    public static Icon chartBar() {
        return chartBar(HeroIconStyle.OUTLINE);
    }

    public static Icon chartBar(HeroIconStyle style) {
        return icon("chart-bar", style);
    }

    public static Icon chartBarSquare() {
        return chartBarSquare(HeroIconStyle.OUTLINE);
    }

    public static Icon chartBarSquare(HeroIconStyle style) {
        return icon("chart-bar-square", style);
    }

    public static Icon chartPie() {
        return chartPie(HeroIconStyle.OUTLINE);
    }

    public static Icon chartPie(HeroIconStyle style) {
        return icon("chart-pie", style);
    }

    public static Icon chatBubbleBottomCenter() {
        return chatBubbleBottomCenter(HeroIconStyle.OUTLINE);
    }

    public static Icon chatBubbleBottomCenter(HeroIconStyle style) {
        return icon("chat-bubble-bottom-center", style);
    }

    public static Icon chatBubbleBottomCenterText() {
        return chatBubbleBottomCenterText(HeroIconStyle.OUTLINE);
    }

    public static Icon chatBubbleBottomCenterText(HeroIconStyle style) {
        return icon("chat-bubble-bottom-center-text", style);
    }

    public static Icon chatBubbleLeft() {
        return chatBubbleLeft(HeroIconStyle.OUTLINE);
    }

    public static Icon chatBubbleLeft(HeroIconStyle style) {
        return icon("chat-bubble-left", style);
    }

    public static Icon chatBubbleLeftEllipsis() {
        return chatBubbleLeftEllipsis(HeroIconStyle.OUTLINE);
    }

    public static Icon chatBubbleLeftEllipsis(HeroIconStyle style) {
        return icon("chat-bubble-left-ellipsis", style);
    }

    public static Icon chatBubbleLeftRight() {
        return chatBubbleLeftRight(HeroIconStyle.OUTLINE);
    }

    public static Icon chatBubbleLeftRight(HeroIconStyle style) {
        return icon("chat-bubble-left-right", style);
    }

    public static Icon chatBubbleOvalLeft() {
        return chatBubbleOvalLeft(HeroIconStyle.OUTLINE);
    }

    public static Icon chatBubbleOvalLeft(HeroIconStyle style) {
        return icon("chat-bubble-oval-left", style);
    }

    public static Icon chatBubbleOvalLeftEllipsis() {
        return chatBubbleOvalLeftEllipsis(HeroIconStyle.OUTLINE);
    }

    public static Icon chatBubbleOvalLeftEllipsis(HeroIconStyle style) {
        return icon("chat-bubble-oval-left-ellipsis", style);
    }

    public static Icon check() {
        return check(HeroIconStyle.OUTLINE);
    }

    public static Icon check(HeroIconStyle style) {
        return icon("check", style);
    }

    public static Icon checkBadge() {
        return checkBadge(HeroIconStyle.OUTLINE);
    }

    public static Icon checkBadge(HeroIconStyle style) {
        return icon("check-badge", style);
    }

    public static Icon checkCircle() {
        return checkCircle(HeroIconStyle.OUTLINE);
    }

    public static Icon checkCircle(HeroIconStyle style) {
        return icon("check-circle", style);
    }

    public static Icon chevronDoubleDown() {
        return chevronDoubleDown(HeroIconStyle.OUTLINE);
    }

    public static Icon chevronDoubleDown(HeroIconStyle style) {
        return icon("chevron-double-down", style);
    }

    public static Icon chevronDoubleLeft() {
        return chevronDoubleLeft(HeroIconStyle.OUTLINE);
    }

    public static Icon chevronDoubleLeft(HeroIconStyle style) {
        return icon("chevron-double-left", style);
    }

    public static Icon chevronDoubleRight() {
        return chevronDoubleRight(HeroIconStyle.OUTLINE);
    }

    public static Icon chevronDoubleRight(HeroIconStyle style) {
        return icon("chevron-double-right", style);
    }

    public static Icon chevronDoubleUp() {
        return chevronDoubleUp(HeroIconStyle.OUTLINE);
    }

    public static Icon chevronDoubleUp(HeroIconStyle style) {
        return icon("chevron-double-up", style);
    }

    public static Icon chevronDown() {
        return chevronDown(HeroIconStyle.OUTLINE);
    }

    public static Icon chevronDown(HeroIconStyle style) {
        return icon("chevron-down", style);
    }

    public static Icon chevronLeft() {
        return chevronLeft(HeroIconStyle.OUTLINE);
    }

    public static Icon chevronLeft(HeroIconStyle style) {
        return icon("chevron-left", style);
    }

    public static Icon chevronRight() {
        return chevronRight(HeroIconStyle.OUTLINE);
    }

    public static Icon chevronRight(HeroIconStyle style) {
        return icon("chevron-right", style);
    }

    public static Icon chevronUp() {
        return chevronUp(HeroIconStyle.OUTLINE);
    }

    public static Icon chevronUp(HeroIconStyle style) {
        return icon("chevron-up", style);
    }

    public static Icon chevronUpDown() {
        return chevronUpDown(HeroIconStyle.OUTLINE);
    }

    public static Icon chevronUpDown(HeroIconStyle style) {
        return icon("chevron-up-down", style);
    }

    public static Icon circleStack() {
        return circleStack(HeroIconStyle.OUTLINE);
    }

    public static Icon circleStack(HeroIconStyle style) {
        return icon("circle-stack", style);
    }

    public static Icon clipboard() {
        return clipboard(HeroIconStyle.OUTLINE);
    }

    public static Icon clipboard(HeroIconStyle style) {
        return icon("clipboard", style);
    }

    public static Icon clipboardDocument() {
        return clipboardDocument(HeroIconStyle.OUTLINE);
    }

    public static Icon clipboardDocument(HeroIconStyle style) {
        return icon("clipboard-document", style);
    }

    public static Icon clipboardDocumentCheck() {
        return clipboardDocumentCheck(HeroIconStyle.OUTLINE);
    }

    public static Icon clipboardDocumentCheck(HeroIconStyle style) {
        return icon("clipboard-document-check", style);
    }

    public static Icon clipboardDocumentList() {
        return clipboardDocumentList(HeroIconStyle.OUTLINE);
    }

    public static Icon clipboardDocumentList(HeroIconStyle style) {
        return icon("clipboard-document-list", style);
    }

    public static Icon clock() {
        return clock(HeroIconStyle.OUTLINE);
    }

    public static Icon clock(HeroIconStyle style) {
        return icon("clock", style);
    }

    public static Icon cloud() {
        return cloud(HeroIconStyle.OUTLINE);
    }

    public static Icon cloud(HeroIconStyle style) {
        return icon("cloud", style);
    }

    public static Icon cloudArrowDown() {
        return cloudArrowDown(HeroIconStyle.OUTLINE);
    }

    public static Icon cloudArrowDown(HeroIconStyle style) {
        return icon("cloud-arrow-down", style);
    }

    public static Icon cloudArrowUp() {
        return cloudArrowUp(HeroIconStyle.OUTLINE);
    }

    public static Icon cloudArrowUp(HeroIconStyle style) {
        return icon("cloud-arrow-up", style);
    }

    public static Icon codeBracket() {
        return codeBracket(HeroIconStyle.OUTLINE);
    }

    public static Icon codeBracket(HeroIconStyle style) {
        return icon("code-bracket", style);
    }

    public static Icon codeBracketSquare() {
        return codeBracketSquare(HeroIconStyle.OUTLINE);
    }

    public static Icon codeBracketSquare(HeroIconStyle style) {
        return icon("code-bracket-square", style);
    }

    public static Icon cog() {
        return cog(HeroIconStyle.OUTLINE);
    }

    public static Icon cog(HeroIconStyle style) {
        return icon("cog", style);
    }

    public static Icon cogN6Tooth() {
        return cogN6Tooth(HeroIconStyle.OUTLINE);
    }

    public static Icon cogN6Tooth(HeroIconStyle style) {
        return icon("cog-6-tooth", style);
    }

    public static Icon cogN8Tooth() {
        return cogN8Tooth(HeroIconStyle.OUTLINE);
    }

    public static Icon cogN8Tooth(HeroIconStyle style) {
        return icon("cog-8-tooth", style);
    }

    public static Icon commandLine() {
        return commandLine(HeroIconStyle.OUTLINE);
    }

    public static Icon commandLine(HeroIconStyle style) {
        return icon("command-line", style);
    }

    public static Icon computerDesktop() {
        return computerDesktop(HeroIconStyle.OUTLINE);
    }

    public static Icon computerDesktop(HeroIconStyle style) {
        return icon("computer-desktop", style);
    }

    public static Icon cpuChip() {
        return cpuChip(HeroIconStyle.OUTLINE);
    }

    public static Icon cpuChip(HeroIconStyle style) {
        return icon("cpu-chip", style);
    }

    public static Icon creditCard() {
        return creditCard(HeroIconStyle.OUTLINE);
    }

    public static Icon creditCard(HeroIconStyle style) {
        return icon("credit-card", style);
    }

    public static Icon cube() {
        return cube(HeroIconStyle.OUTLINE);
    }

    public static Icon cube(HeroIconStyle style) {
        return icon("cube", style);
    }

    public static Icon cubeTransparent() {
        return cubeTransparent(HeroIconStyle.OUTLINE);
    }

    public static Icon cubeTransparent(HeroIconStyle style) {
        return icon("cube-transparent", style);
    }

    public static Icon currencyBangladeshi() {
        return currencyBangladeshi(HeroIconStyle.OUTLINE);
    }

    public static Icon currencyBangladeshi(HeroIconStyle style) {
        return icon("currency-bangladeshi", style);
    }

    public static Icon currencyDollar() {
        return currencyDollar(HeroIconStyle.OUTLINE);
    }

    public static Icon currencyDollar(HeroIconStyle style) {
        return icon("currency-dollar", style);
    }

    public static Icon currencyEuro() {
        return currencyEuro(HeroIconStyle.OUTLINE);
    }

    public static Icon currencyEuro(HeroIconStyle style) {
        return icon("currency-euro", style);
    }

    public static Icon currencyPound() {
        return currencyPound(HeroIconStyle.OUTLINE);
    }

    public static Icon currencyPound(HeroIconStyle style) {
        return icon("currency-pound", style);
    }

    public static Icon currencyRupee() {
        return currencyRupee(HeroIconStyle.OUTLINE);
    }

    public static Icon currencyRupee(HeroIconStyle style) {
        return icon("currency-rupee", style);
    }

    public static Icon currencyYen() {
        return currencyYen(HeroIconStyle.OUTLINE);
    }

    public static Icon currencyYen(HeroIconStyle style) {
        return icon("currency-yen", style);
    }

    public static Icon cursorArrowRays() {
        return cursorArrowRays(HeroIconStyle.OUTLINE);
    }

    public static Icon cursorArrowRays(HeroIconStyle style) {
        return icon("cursor-arrow-rays", style);
    }

    public static Icon cursorArrowRipple() {
        return cursorArrowRipple(HeroIconStyle.OUTLINE);
    }

    public static Icon cursorArrowRipple(HeroIconStyle style) {
        return icon("cursor-arrow-ripple", style);
    }

    public static Icon devicePhoneMobile() {
        return devicePhoneMobile(HeroIconStyle.OUTLINE);
    }

    public static Icon devicePhoneMobile(HeroIconStyle style) {
        return icon("device-phone-mobile", style);
    }

    public static Icon deviceTablet() {
        return deviceTablet(HeroIconStyle.OUTLINE);
    }

    public static Icon deviceTablet(HeroIconStyle style) {
        return icon("device-tablet", style);
    }

    public static Icon divide() {
        return divide(HeroIconStyle.OUTLINE);
    }

    public static Icon divide(HeroIconStyle style) {
        return icon("divide", style);
    }

    public static Icon document() {
        return document(HeroIconStyle.OUTLINE);
    }

    public static Icon document(HeroIconStyle style) {
        return icon("document", style);
    }

    public static Icon documentArrowDown() {
        return documentArrowDown(HeroIconStyle.OUTLINE);
    }

    public static Icon documentArrowDown(HeroIconStyle style) {
        return icon("document-arrow-down", style);
    }

    public static Icon documentArrowUp() {
        return documentArrowUp(HeroIconStyle.OUTLINE);
    }

    public static Icon documentArrowUp(HeroIconStyle style) {
        return icon("document-arrow-up", style);
    }

    public static Icon documentChartBar() {
        return documentChartBar(HeroIconStyle.OUTLINE);
    }

    public static Icon documentChartBar(HeroIconStyle style) {
        return icon("document-chart-bar", style);
    }

    public static Icon documentCheck() {
        return documentCheck(HeroIconStyle.OUTLINE);
    }

    public static Icon documentCheck(HeroIconStyle style) {
        return icon("document-check", style);
    }

    public static Icon documentCurrencyBangladeshi() {
        return documentCurrencyBangladeshi(HeroIconStyle.OUTLINE);
    }

    public static Icon documentCurrencyBangladeshi(HeroIconStyle style) {
        return icon("document-currency-bangladeshi", style);
    }

    public static Icon documentCurrencyDollar() {
        return documentCurrencyDollar(HeroIconStyle.OUTLINE);
    }

    public static Icon documentCurrencyDollar(HeroIconStyle style) {
        return icon("document-currency-dollar", style);
    }

    public static Icon documentCurrencyEuro() {
        return documentCurrencyEuro(HeroIconStyle.OUTLINE);
    }

    public static Icon documentCurrencyEuro(HeroIconStyle style) {
        return icon("document-currency-euro", style);
    }

    public static Icon documentCurrencyPound() {
        return documentCurrencyPound(HeroIconStyle.OUTLINE);
    }

    public static Icon documentCurrencyPound(HeroIconStyle style) {
        return icon("document-currency-pound", style);
    }

    public static Icon documentCurrencyRupee() {
        return documentCurrencyRupee(HeroIconStyle.OUTLINE);
    }

    public static Icon documentCurrencyRupee(HeroIconStyle style) {
        return icon("document-currency-rupee", style);
    }

    public static Icon documentCurrencyYen() {
        return documentCurrencyYen(HeroIconStyle.OUTLINE);
    }

    public static Icon documentCurrencyYen(HeroIconStyle style) {
        return icon("document-currency-yen", style);
    }

    public static Icon documentDuplicate() {
        return documentDuplicate(HeroIconStyle.OUTLINE);
    }

    public static Icon documentDuplicate(HeroIconStyle style) {
        return icon("document-duplicate", style);
    }

    public static Icon documentMagnifyingGlass() {
        return documentMagnifyingGlass(HeroIconStyle.OUTLINE);
    }

    public static Icon documentMagnifyingGlass(HeroIconStyle style) {
        return icon("document-magnifying-glass", style);
    }

    public static Icon documentMinus() {
        return documentMinus(HeroIconStyle.OUTLINE);
    }

    public static Icon documentMinus(HeroIconStyle style) {
        return icon("document-minus", style);
    }

    public static Icon documentPlus() {
        return documentPlus(HeroIconStyle.OUTLINE);
    }

    public static Icon documentPlus(HeroIconStyle style) {
        return icon("document-plus", style);
    }

    public static Icon documentText() {
        return documentText(HeroIconStyle.OUTLINE);
    }

    public static Icon documentText(HeroIconStyle style) {
        return icon("document-text", style);
    }

    public static Icon ellipsisHorizontal() {
        return ellipsisHorizontal(HeroIconStyle.OUTLINE);
    }

    public static Icon ellipsisHorizontal(HeroIconStyle style) {
        return icon("ellipsis-horizontal", style);
    }

    public static Icon ellipsisHorizontalCircle() {
        return ellipsisHorizontalCircle(HeroIconStyle.OUTLINE);
    }

    public static Icon ellipsisHorizontalCircle(HeroIconStyle style) {
        return icon("ellipsis-horizontal-circle", style);
    }

    public static Icon ellipsisVertical() {
        return ellipsisVertical(HeroIconStyle.OUTLINE);
    }

    public static Icon ellipsisVertical(HeroIconStyle style) {
        return icon("ellipsis-vertical", style);
    }

    public static Icon envelope() {
        return envelope(HeroIconStyle.OUTLINE);
    }

    public static Icon envelope(HeroIconStyle style) {
        return icon("envelope", style);
    }

    public static Icon envelopeOpen() {
        return envelopeOpen(HeroIconStyle.OUTLINE);
    }

    public static Icon envelopeOpen(HeroIconStyle style) {
        return icon("envelope-open", style);
    }

    public static Icon equals() {
        return equals(HeroIconStyle.OUTLINE);
    }

    public static Icon equals(HeroIconStyle style) {
        return icon("equals", style);
    }

    public static Icon exclamationCircle() {
        return exclamationCircle(HeroIconStyle.OUTLINE);
    }

    public static Icon exclamationCircle(HeroIconStyle style) {
        return icon("exclamation-circle", style);
    }

    public static Icon exclamationTriangle() {
        return exclamationTriangle(HeroIconStyle.OUTLINE);
    }

    public static Icon exclamationTriangle(HeroIconStyle style) {
        return icon("exclamation-triangle", style);
    }

    public static Icon eye() {
        return eye(HeroIconStyle.OUTLINE);
    }

    public static Icon eye(HeroIconStyle style) {
        return icon("eye", style);
    }

    public static Icon eyeDropper() {
        return eyeDropper(HeroIconStyle.OUTLINE);
    }

    public static Icon eyeDropper(HeroIconStyle style) {
        return icon("eye-dropper", style);
    }

    public static Icon eyeSlash() {
        return eyeSlash(HeroIconStyle.OUTLINE);
    }

    public static Icon eyeSlash(HeroIconStyle style) {
        return icon("eye-slash", style);
    }

    public static Icon faceFrown() {
        return faceFrown(HeroIconStyle.OUTLINE);
    }

    public static Icon faceFrown(HeroIconStyle style) {
        return icon("face-frown", style);
    }

    public static Icon faceSmile() {
        return faceSmile(HeroIconStyle.OUTLINE);
    }

    public static Icon faceSmile(HeroIconStyle style) {
        return icon("face-smile", style);
    }

    public static Icon film() {
        return film(HeroIconStyle.OUTLINE);
    }

    public static Icon film(HeroIconStyle style) {
        return icon("film", style);
    }

    public static Icon fingerPrint() {
        return fingerPrint(HeroIconStyle.OUTLINE);
    }

    public static Icon fingerPrint(HeroIconStyle style) {
        return icon("finger-print", style);
    }

    public static Icon fire() {
        return fire(HeroIconStyle.OUTLINE);
    }

    public static Icon fire(HeroIconStyle style) {
        return icon("fire", style);
    }

    public static Icon flag() {
        return flag(HeroIconStyle.OUTLINE);
    }

    public static Icon flag(HeroIconStyle style) {
        return icon("flag", style);
    }

    public static Icon folder() {
        return folder(HeroIconStyle.OUTLINE);
    }

    public static Icon folder(HeroIconStyle style) {
        return icon("folder", style);
    }

    public static Icon folderArrowDown() {
        return folderArrowDown(HeroIconStyle.OUTLINE);
    }

    public static Icon folderArrowDown(HeroIconStyle style) {
        return icon("folder-arrow-down", style);
    }

    public static Icon folderMinus() {
        return folderMinus(HeroIconStyle.OUTLINE);
    }

    public static Icon folderMinus(HeroIconStyle style) {
        return icon("folder-minus", style);
    }

    public static Icon folderOpen() {
        return folderOpen(HeroIconStyle.OUTLINE);
    }

    public static Icon folderOpen(HeroIconStyle style) {
        return icon("folder-open", style);
    }

    public static Icon folderPlus() {
        return folderPlus(HeroIconStyle.OUTLINE);
    }

    public static Icon folderPlus(HeroIconStyle style) {
        return icon("folder-plus", style);
    }

    public static Icon forward() {
        return forward(HeroIconStyle.OUTLINE);
    }

    public static Icon forward(HeroIconStyle style) {
        return icon("forward", style);
    }

    public static Icon funnel() {
        return funnel(HeroIconStyle.OUTLINE);
    }

    public static Icon funnel(HeroIconStyle style) {
        return icon("funnel", style);
    }

    public static Icon gif() {
        return gif(HeroIconStyle.OUTLINE);
    }

    public static Icon gif(HeroIconStyle style) {
        return icon("gif", style);
    }

    public static Icon gift() {
        return gift(HeroIconStyle.OUTLINE);
    }

    public static Icon gift(HeroIconStyle style) {
        return icon("gift", style);
    }

    public static Icon giftTop() {
        return giftTop(HeroIconStyle.OUTLINE);
    }

    public static Icon giftTop(HeroIconStyle style) {
        return icon("gift-top", style);
    }

    public static Icon globeAlt() {
        return globeAlt(HeroIconStyle.OUTLINE);
    }

    public static Icon globeAlt(HeroIconStyle style) {
        return icon("globe-alt", style);
    }

    public static Icon globeAmericas() {
        return globeAmericas(HeroIconStyle.OUTLINE);
    }

    public static Icon globeAmericas(HeroIconStyle style) {
        return icon("globe-americas", style);
    }

    public static Icon globeAsiaAustralia() {
        return globeAsiaAustralia(HeroIconStyle.OUTLINE);
    }

    public static Icon globeAsiaAustralia(HeroIconStyle style) {
        return icon("globe-asia-australia", style);
    }

    public static Icon globeEuropeAfrica() {
        return globeEuropeAfrica(HeroIconStyle.OUTLINE);
    }

    public static Icon globeEuropeAfrica(HeroIconStyle style) {
        return icon("globe-europe-africa", style);
    }

    public static Icon h1() {
        return h1(HeroIconStyle.OUTLINE);
    }

    public static Icon h1(HeroIconStyle style) {
        return icon("h1", style);
    }

    public static Icon h2() {
        return h2(HeroIconStyle.OUTLINE);
    }

    public static Icon h2(HeroIconStyle style) {
        return icon("h2", style);
    }

    public static Icon h3() {
        return h3(HeroIconStyle.OUTLINE);
    }

    public static Icon h3(HeroIconStyle style) {
        return icon("h3", style);
    }

    public static Icon handRaised() {
        return handRaised(HeroIconStyle.OUTLINE);
    }

    public static Icon handRaised(HeroIconStyle style) {
        return icon("hand-raised", style);
    }

    public static Icon handThumbDown() {
        return handThumbDown(HeroIconStyle.OUTLINE);
    }

    public static Icon handThumbDown(HeroIconStyle style) {
        return icon("hand-thumb-down", style);
    }

    public static Icon handThumbUp() {
        return handThumbUp(HeroIconStyle.OUTLINE);
    }

    public static Icon handThumbUp(HeroIconStyle style) {
        return icon("hand-thumb-up", style);
    }

    public static Icon hashtag() {
        return hashtag(HeroIconStyle.OUTLINE);
    }

    public static Icon hashtag(HeroIconStyle style) {
        return icon("hashtag", style);
    }

    public static Icon heart() {
        return heart(HeroIconStyle.OUTLINE);
    }

    public static Icon heart(HeroIconStyle style) {
        return icon("heart", style);
    }

    public static Icon home() {
        return home(HeroIconStyle.OUTLINE);
    }

    public static Icon home(HeroIconStyle style) {
        return icon("home", style);
    }

    public static Icon homeModern() {
        return homeModern(HeroIconStyle.OUTLINE);
    }

    public static Icon homeModern(HeroIconStyle style) {
        return icon("home-modern", style);
    }

    public static Icon identification() {
        return identification(HeroIconStyle.OUTLINE);
    }

    public static Icon identification(HeroIconStyle style) {
        return icon("identification", style);
    }

    public static Icon inbox() {
        return inbox(HeroIconStyle.OUTLINE);
    }

    public static Icon inbox(HeroIconStyle style) {
        return icon("inbox", style);
    }

    public static Icon inboxArrowDown() {
        return inboxArrowDown(HeroIconStyle.OUTLINE);
    }

    public static Icon inboxArrowDown(HeroIconStyle style) {
        return icon("inbox-arrow-down", style);
    }

    public static Icon inboxStack() {
        return inboxStack(HeroIconStyle.OUTLINE);
    }

    public static Icon inboxStack(HeroIconStyle style) {
        return icon("inbox-stack", style);
    }

    public static Icon informationCircle() {
        return informationCircle(HeroIconStyle.OUTLINE);
    }

    public static Icon informationCircle(HeroIconStyle style) {
        return icon("information-circle", style);
    }

    public static Icon italic() {
        return italic(HeroIconStyle.OUTLINE);
    }

    public static Icon italic(HeroIconStyle style) {
        return icon("italic", style);
    }

    public static Icon key() {
        return key(HeroIconStyle.OUTLINE);
    }

    public static Icon key(HeroIconStyle style) {
        return icon("key", style);
    }

    public static Icon language() {
        return language(HeroIconStyle.OUTLINE);
    }

    public static Icon language(HeroIconStyle style) {
        return icon("language", style);
    }

    public static Icon lifebuoy() {
        return lifebuoy(HeroIconStyle.OUTLINE);
    }

    public static Icon lifebuoy(HeroIconStyle style) {
        return icon("lifebuoy", style);
    }

    public static Icon lightBulb() {
        return lightBulb(HeroIconStyle.OUTLINE);
    }

    public static Icon lightBulb(HeroIconStyle style) {
        return icon("light-bulb", style);
    }

    public static Icon link() {
        return link(HeroIconStyle.OUTLINE);
    }

    public static Icon link(HeroIconStyle style) {
        return icon("link", style);
    }

    public static Icon linkSlash() {
        return linkSlash(HeroIconStyle.OUTLINE);
    }

    public static Icon linkSlash(HeroIconStyle style) {
        return icon("link-slash", style);
    }

    public static Icon listBullet() {
        return listBullet(HeroIconStyle.OUTLINE);
    }

    public static Icon listBullet(HeroIconStyle style) {
        return icon("list-bullet", style);
    }

    public static Icon lockClosed() {
        return lockClosed(HeroIconStyle.OUTLINE);
    }

    public static Icon lockClosed(HeroIconStyle style) {
        return icon("lock-closed", style);
    }

    public static Icon lockOpen() {
        return lockOpen(HeroIconStyle.OUTLINE);
    }

    public static Icon lockOpen(HeroIconStyle style) {
        return icon("lock-open", style);
    }

    public static Icon magnifyingGlass() {
        return magnifyingGlass(HeroIconStyle.OUTLINE);
    }

    public static Icon magnifyingGlass(HeroIconStyle style) {
        return icon("magnifying-glass", style);
    }

    public static Icon magnifyingGlassCircle() {
        return magnifyingGlassCircle(HeroIconStyle.OUTLINE);
    }

    public static Icon magnifyingGlassCircle(HeroIconStyle style) {
        return icon("magnifying-glass-circle", style);
    }

    public static Icon magnifyingGlassMinus() {
        return magnifyingGlassMinus(HeroIconStyle.OUTLINE);
    }

    public static Icon magnifyingGlassMinus(HeroIconStyle style) {
        return icon("magnifying-glass-minus", style);
    }

    public static Icon magnifyingGlassPlus() {
        return magnifyingGlassPlus(HeroIconStyle.OUTLINE);
    }

    public static Icon magnifyingGlassPlus(HeroIconStyle style) {
        return icon("magnifying-glass-plus", style);
    }

    public static Icon map() {
        return map(HeroIconStyle.OUTLINE);
    }

    public static Icon map(HeroIconStyle style) {
        return icon("map", style);
    }

    public static Icon mapPin() {
        return mapPin(HeroIconStyle.OUTLINE);
    }

    public static Icon mapPin(HeroIconStyle style) {
        return icon("map-pin", style);
    }

    public static Icon megaphone() {
        return megaphone(HeroIconStyle.OUTLINE);
    }

    public static Icon megaphone(HeroIconStyle style) {
        return icon("megaphone", style);
    }

    public static Icon microphone() {
        return microphone(HeroIconStyle.OUTLINE);
    }

    public static Icon microphone(HeroIconStyle style) {
        return icon("microphone", style);
    }

    public static Icon minus() {
        return minus(HeroIconStyle.OUTLINE);
    }

    public static Icon minus(HeroIconStyle style) {
        return icon("minus", style);
    }

    public static Icon minusCircle() {
        return minusCircle(HeroIconStyle.OUTLINE);
    }

    public static Icon minusCircle(HeroIconStyle style) {
        return icon("minus-circle", style);
    }

    public static Icon minusSmall() {
        return minusSmall(HeroIconStyle.OUTLINE);
    }

    public static Icon minusSmall(HeroIconStyle style) {
        return icon("minus-small", style);
    }

    public static Icon moon() {
        return moon(HeroIconStyle.OUTLINE);
    }

    public static Icon moon(HeroIconStyle style) {
        return icon("moon", style);
    }

    public static Icon musicalNote() {
        return musicalNote(HeroIconStyle.OUTLINE);
    }

    public static Icon musicalNote(HeroIconStyle style) {
        return icon("musical-note", style);
    }

    public static Icon newspaper() {
        return newspaper(HeroIconStyle.OUTLINE);
    }

    public static Icon newspaper(HeroIconStyle style) {
        return icon("newspaper", style);
    }

    public static Icon noSymbol() {
        return noSymbol(HeroIconStyle.OUTLINE);
    }

    public static Icon noSymbol(HeroIconStyle style) {
        return icon("no-symbol", style);
    }

    public static Icon numberedList() {
        return numberedList(HeroIconStyle.OUTLINE);
    }

    public static Icon numberedList(HeroIconStyle style) {
        return icon("numbered-list", style);
    }

    public static Icon paintBrush() {
        return paintBrush(HeroIconStyle.OUTLINE);
    }

    public static Icon paintBrush(HeroIconStyle style) {
        return icon("paint-brush", style);
    }

    public static Icon paperAirplane() {
        return paperAirplane(HeroIconStyle.OUTLINE);
    }

    public static Icon paperAirplane(HeroIconStyle style) {
        return icon("paper-airplane", style);
    }

    public static Icon paperClip() {
        return paperClip(HeroIconStyle.OUTLINE);
    }

    public static Icon paperClip(HeroIconStyle style) {
        return icon("paper-clip", style);
    }

    public static Icon pause() {
        return pause(HeroIconStyle.OUTLINE);
    }

    public static Icon pause(HeroIconStyle style) {
        return icon("pause", style);
    }

    public static Icon pauseCircle() {
        return pauseCircle(HeroIconStyle.OUTLINE);
    }

    public static Icon pauseCircle(HeroIconStyle style) {
        return icon("pause-circle", style);
    }

    public static Icon pencil() {
        return pencil(HeroIconStyle.OUTLINE);
    }

    public static Icon pencil(HeroIconStyle style) {
        return icon("pencil", style);
    }

    public static Icon pencilSquare() {
        return pencilSquare(HeroIconStyle.OUTLINE);
    }

    public static Icon pencilSquare(HeroIconStyle style) {
        return icon("pencil-square", style);
    }

    public static Icon percentBadge() {
        return percentBadge(HeroIconStyle.OUTLINE);
    }

    public static Icon percentBadge(HeroIconStyle style) {
        return icon("percent-badge", style);
    }

    public static Icon phone() {
        return phone(HeroIconStyle.OUTLINE);
    }

    public static Icon phone(HeroIconStyle style) {
        return icon("phone", style);
    }

    public static Icon phoneArrowDownLeft() {
        return phoneArrowDownLeft(HeroIconStyle.OUTLINE);
    }

    public static Icon phoneArrowDownLeft(HeroIconStyle style) {
        return icon("phone-arrow-down-left", style);
    }

    public static Icon phoneArrowUpRight() {
        return phoneArrowUpRight(HeroIconStyle.OUTLINE);
    }

    public static Icon phoneArrowUpRight(HeroIconStyle style) {
        return icon("phone-arrow-up-right", style);
    }

    public static Icon phoneXMark() {
        return phoneXMark(HeroIconStyle.OUTLINE);
    }

    public static Icon phoneXMark(HeroIconStyle style) {
        return icon("phone-x-mark", style);
    }

    public static Icon photo() {
        return photo(HeroIconStyle.OUTLINE);
    }

    public static Icon photo(HeroIconStyle style) {
        return icon("photo", style);
    }

    public static Icon play() {
        return play(HeroIconStyle.OUTLINE);
    }

    public static Icon play(HeroIconStyle style) {
        return icon("play", style);
    }

    public static Icon playCircle() {
        return playCircle(HeroIconStyle.OUTLINE);
    }

    public static Icon playCircle(HeroIconStyle style) {
        return icon("play-circle", style);
    }

    public static Icon playPause() {
        return playPause(HeroIconStyle.OUTLINE);
    }

    public static Icon playPause(HeroIconStyle style) {
        return icon("play-pause", style);
    }

    public static Icon plus() {
        return plus(HeroIconStyle.OUTLINE);
    }

    public static Icon plus(HeroIconStyle style) {
        return icon("plus", style);
    }

    public static Icon plusCircle() {
        return plusCircle(HeroIconStyle.OUTLINE);
    }

    public static Icon plusCircle(HeroIconStyle style) {
        return icon("plus-circle", style);
    }

    public static Icon plusSmall() {
        return plusSmall(HeroIconStyle.OUTLINE);
    }

    public static Icon plusSmall(HeroIconStyle style) {
        return icon("plus-small", style);
    }

    public static Icon power() {
        return power(HeroIconStyle.OUTLINE);
    }

    public static Icon power(HeroIconStyle style) {
        return icon("power", style);
    }

    public static Icon presentationChartBar() {
        return presentationChartBar(HeroIconStyle.OUTLINE);
    }

    public static Icon presentationChartBar(HeroIconStyle style) {
        return icon("presentation-chart-bar", style);
    }

    public static Icon presentationChartLine() {
        return presentationChartLine(HeroIconStyle.OUTLINE);
    }

    public static Icon presentationChartLine(HeroIconStyle style) {
        return icon("presentation-chart-line", style);
    }

    public static Icon printer() {
        return printer(HeroIconStyle.OUTLINE);
    }

    public static Icon printer(HeroIconStyle style) {
        return icon("printer", style);
    }

    public static Icon puzzlePiece() {
        return puzzlePiece(HeroIconStyle.OUTLINE);
    }

    public static Icon puzzlePiece(HeroIconStyle style) {
        return icon("puzzle-piece", style);
    }

    public static Icon qrCode() {
        return qrCode(HeroIconStyle.OUTLINE);
    }

    public static Icon qrCode(HeroIconStyle style) {
        return icon("qr-code", style);
    }

    public static Icon questionMarkCircle() {
        return questionMarkCircle(HeroIconStyle.OUTLINE);
    }

    public static Icon questionMarkCircle(HeroIconStyle style) {
        return icon("question-mark-circle", style);
    }

    public static Icon queueList() {
        return queueList(HeroIconStyle.OUTLINE);
    }

    public static Icon queueList(HeroIconStyle style) {
        return icon("queue-list", style);
    }

    public static Icon radio() {
        return radio(HeroIconStyle.OUTLINE);
    }

    public static Icon radio(HeroIconStyle style) {
        return icon("radio", style);
    }

    public static Icon receiptPercent() {
        return receiptPercent(HeroIconStyle.OUTLINE);
    }

    public static Icon receiptPercent(HeroIconStyle style) {
        return icon("receipt-percent", style);
    }

    public static Icon receiptRefund() {
        return receiptRefund(HeroIconStyle.OUTLINE);
    }

    public static Icon receiptRefund(HeroIconStyle style) {
        return icon("receipt-refund", style);
    }

    public static Icon rectangleGroup() {
        return rectangleGroup(HeroIconStyle.OUTLINE);
    }

    public static Icon rectangleGroup(HeroIconStyle style) {
        return icon("rectangle-group", style);
    }

    public static Icon rectangleStack() {
        return rectangleStack(HeroIconStyle.OUTLINE);
    }

    public static Icon rectangleStack(HeroIconStyle style) {
        return icon("rectangle-stack", style);
    }

    public static Icon rocketLaunch() {
        return rocketLaunch(HeroIconStyle.OUTLINE);
    }

    public static Icon rocketLaunch(HeroIconStyle style) {
        return icon("rocket-launch", style);
    }

    public static Icon rss() {
        return rss(HeroIconStyle.OUTLINE);
    }

    public static Icon rss(HeroIconStyle style) {
        return icon("rss", style);
    }

    public static Icon scale() {
        return scale(HeroIconStyle.OUTLINE);
    }

    public static Icon scale(HeroIconStyle style) {
        return icon("scale", style);
    }

    public static Icon scissors() {
        return scissors(HeroIconStyle.OUTLINE);
    }

    public static Icon scissors(HeroIconStyle style) {
        return icon("scissors", style);
    }

    public static Icon server() {
        return server(HeroIconStyle.OUTLINE);
    }

    public static Icon server(HeroIconStyle style) {
        return icon("server", style);
    }

    public static Icon serverStack() {
        return serverStack(HeroIconStyle.OUTLINE);
    }

    public static Icon serverStack(HeroIconStyle style) {
        return icon("server-stack", style);
    }

    public static Icon share() {
        return share(HeroIconStyle.OUTLINE);
    }

    public static Icon share(HeroIconStyle style) {
        return icon("share", style);
    }

    public static Icon shieldCheck() {
        return shieldCheck(HeroIconStyle.OUTLINE);
    }

    public static Icon shieldCheck(HeroIconStyle style) {
        return icon("shield-check", style);
    }

    public static Icon shieldExclamation() {
        return shieldExclamation(HeroIconStyle.OUTLINE);
    }

    public static Icon shieldExclamation(HeroIconStyle style) {
        return icon("shield-exclamation", style);
    }

    public static Icon shoppingBag() {
        return shoppingBag(HeroIconStyle.OUTLINE);
    }

    public static Icon shoppingBag(HeroIconStyle style) {
        return icon("shopping-bag", style);
    }

    public static Icon shoppingCart() {
        return shoppingCart(HeroIconStyle.OUTLINE);
    }

    public static Icon shoppingCart(HeroIconStyle style) {
        return icon("shopping-cart", style);
    }

    public static Icon signal() {
        return signal(HeroIconStyle.OUTLINE);
    }

    public static Icon signal(HeroIconStyle style) {
        return icon("signal", style);
    }

    public static Icon signalSlash() {
        return signalSlash(HeroIconStyle.OUTLINE);
    }

    public static Icon signalSlash(HeroIconStyle style) {
        return icon("signal-slash", style);
    }

    public static Icon slash() {
        return slash(HeroIconStyle.OUTLINE);
    }

    public static Icon slash(HeroIconStyle style) {
        return icon("slash", style);
    }

    public static Icon sparkles() {
        return sparkles(HeroIconStyle.OUTLINE);
    }

    public static Icon sparkles(HeroIconStyle style) {
        return icon("sparkles", style);
    }

    public static Icon speakerWave() {
        return speakerWave(HeroIconStyle.OUTLINE);
    }

    public static Icon speakerWave(HeroIconStyle style) {
        return icon("speaker-wave", style);
    }

    public static Icon speakerXMark() {
        return speakerXMark(HeroIconStyle.OUTLINE);
    }

    public static Icon speakerXMark(HeroIconStyle style) {
        return icon("speaker-x-mark", style);
    }

    public static Icon squareN2Stack() {
        return squareN2Stack(HeroIconStyle.OUTLINE);
    }

    public static Icon squareN2Stack(HeroIconStyle style) {
        return icon("square-2-stack", style);
    }

    public static Icon squareN3Stack3d() {
        return squareN3Stack3d(HeroIconStyle.OUTLINE);
    }

    public static Icon squareN3Stack3d(HeroIconStyle style) {
        return icon("square-3-stack-3d", style);
    }

    public static Icon squares2xN2() {
        return squares2xN2(HeroIconStyle.OUTLINE);
    }

    public static Icon squares2xN2(HeroIconStyle style) {
        return icon("squares-2x-2", style);
    }

    public static Icon squaresPlus() {
        return squaresPlus(HeroIconStyle.OUTLINE);
    }

    public static Icon squaresPlus(HeroIconStyle style) {
        return icon("squares-plus", style);
    }

    public static Icon star() {
        return star(HeroIconStyle.OUTLINE);
    }

    public static Icon star(HeroIconStyle style) {
        return icon("star", style);
    }

    public static Icon stop() {
        return stop(HeroIconStyle.OUTLINE);
    }

    public static Icon stop(HeroIconStyle style) {
        return icon("stop", style);
    }

    public static Icon stopCircle() {
        return stopCircle(HeroIconStyle.OUTLINE);
    }

    public static Icon stopCircle(HeroIconStyle style) {
        return icon("stop-circle", style);
    }

    public static Icon strikethrough() {
        return strikethrough(HeroIconStyle.OUTLINE);
    }

    public static Icon strikethrough(HeroIconStyle style) {
        return icon("strikethrough", style);
    }

    public static Icon sun() {
        return sun(HeroIconStyle.OUTLINE);
    }

    public static Icon sun(HeroIconStyle style) {
        return icon("sun", style);
    }

    public static Icon swatch() {
        return swatch(HeroIconStyle.OUTLINE);
    }

    public static Icon swatch(HeroIconStyle style) {
        return icon("swatch", style);
    }

    public static Icon tableCells() {
        return tableCells(HeroIconStyle.OUTLINE);
    }

    public static Icon tableCells(HeroIconStyle style) {
        return icon("table-cells", style);
    }

    public static Icon tag() {
        return tag(HeroIconStyle.OUTLINE);
    }

    public static Icon tag(HeroIconStyle style) {
        return icon("tag", style);
    }

    public static Icon ticket() {
        return ticket(HeroIconStyle.OUTLINE);
    }

    public static Icon ticket(HeroIconStyle style) {
        return icon("ticket", style);
    }

    public static Icon trash() {
        return trash(HeroIconStyle.OUTLINE);
    }

    public static Icon trash(HeroIconStyle style) {
        return icon("trash", style);
    }

    public static Icon trophy() {
        return trophy(HeroIconStyle.OUTLINE);
    }

    public static Icon trophy(HeroIconStyle style) {
        return icon("trophy", style);
    }

    public static Icon truck() {
        return truck(HeroIconStyle.OUTLINE);
    }

    public static Icon truck(HeroIconStyle style) {
        return icon("truck", style);
    }

    public static Icon tv() {
        return tv(HeroIconStyle.OUTLINE);
    }

    public static Icon tv(HeroIconStyle style) {
        return icon("tv", style);
    }

    public static Icon underline() {
        return underline(HeroIconStyle.OUTLINE);
    }

    public static Icon underline(HeroIconStyle style) {
        return icon("underline", style);
    }

    public static Icon user() {
        return user(HeroIconStyle.OUTLINE);
    }

    public static Icon user(HeroIconStyle style) {
        return icon("user", style);
    }

    public static Icon userCircle() {
        return userCircle(HeroIconStyle.OUTLINE);
    }

    public static Icon userCircle(HeroIconStyle style) {
        return icon("user-circle", style);
    }

    public static Icon userGroup() {
        return userGroup(HeroIconStyle.OUTLINE);
    }

    public static Icon userGroup(HeroIconStyle style) {
        return icon("user-group", style);
    }

    public static Icon userMinus() {
        return userMinus(HeroIconStyle.OUTLINE);
    }

    public static Icon userMinus(HeroIconStyle style) {
        return icon("user-minus", style);
    }

    public static Icon userPlus() {
        return userPlus(HeroIconStyle.OUTLINE);
    }

    public static Icon userPlus(HeroIconStyle style) {
        return icon("user-plus", style);
    }

    public static Icon users() {
        return users(HeroIconStyle.OUTLINE);
    }

    public static Icon users(HeroIconStyle style) {
        return icon("users", style);
    }

    public static Icon variable() {
        return variable(HeroIconStyle.OUTLINE);
    }

    public static Icon variable(HeroIconStyle style) {
        return icon("variable", style);
    }

    public static Icon videoCamera() {
        return videoCamera(HeroIconStyle.OUTLINE);
    }

    public static Icon videoCamera(HeroIconStyle style) {
        return icon("video-camera", style);
    }

    public static Icon videoCameraSlash() {
        return videoCameraSlash(HeroIconStyle.OUTLINE);
    }

    public static Icon videoCameraSlash(HeroIconStyle style) {
        return icon("video-camera-slash", style);
    }

    public static Icon viewColumns() {
        return viewColumns(HeroIconStyle.OUTLINE);
    }

    public static Icon viewColumns(HeroIconStyle style) {
        return icon("view-columns", style);
    }

    public static Icon viewfinderCircle() {
        return viewfinderCircle(HeroIconStyle.OUTLINE);
    }

    public static Icon viewfinderCircle(HeroIconStyle style) {
        return icon("viewfinder-circle", style);
    }

    public static Icon wallet() {
        return wallet(HeroIconStyle.OUTLINE);
    }

    public static Icon wallet(HeroIconStyle style) {
        return icon("wallet", style);
    }

    public static Icon wifi() {
        return wifi(HeroIconStyle.OUTLINE);
    }

    public static Icon wifi(HeroIconStyle style) {
        return icon("wifi", style);
    }

    public static Icon window() {
        return window(HeroIconStyle.OUTLINE);
    }

    public static Icon window(HeroIconStyle style) {
        return icon("window", style);
    }

    public static Icon wrench() {
        return wrench(HeroIconStyle.OUTLINE);
    }

    public static Icon wrench(HeroIconStyle style) {
        return icon("wrench", style);
    }

    public static Icon wrenchScrewdriver() {
        return wrenchScrewdriver(HeroIconStyle.OUTLINE);
    }

    public static Icon wrenchScrewdriver(HeroIconStyle style) {
        return icon("wrench-screwdriver", style);
    }

    public static Icon xCircle() {
        return xCircle(HeroIconStyle.OUTLINE);
    }

    public static Icon xCircle(HeroIconStyle style) {
        return icon("x-circle", style);
    }

    public static Icon xMark() {
        return xMark(HeroIconStyle.OUTLINE);
    }

    public static Icon xMark(HeroIconStyle style) {
        return icon("x-mark", style);
    }
}
