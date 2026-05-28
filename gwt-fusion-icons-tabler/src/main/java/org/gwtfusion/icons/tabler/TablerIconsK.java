package org.gwtfusion.icons.tabler;

import org.gwtfusion.ui.component.icon.Icon;

final class TablerIconsK {
    private static final String[] NAMES = {"karate", "kayak", "kerning", "key", "key-off", "keyboard", "keyboard-hide", "keyboard-off", "keyboard-show", "keyframe", "keyframe-align-center", "keyframe-align-horizontal", "keyframe-align-vertical", "keyframes"};

    private TablerIconsK() {
    }

    static String[] names() {
        return NAMES;
    }

    static Icon icon(String name) {
        if ("karate".equals(name)) {
            return karate();
        }
        if ("kayak".equals(name)) {
            return kayak();
        }
        if ("kerning".equals(name)) {
            return kerning();
        }
        if ("key".equals(name)) {
            return key();
        }
        if ("key-off".equals(name)) {
            return keyOff();
        }
        if ("keyboard".equals(name)) {
            return keyboard();
        }
        if ("keyboard-hide".equals(name)) {
            return keyboardHide();
        }
        if ("keyboard-off".equals(name)) {
            return keyboardOff();
        }
        if ("keyboard-show".equals(name)) {
            return keyboardShow();
        }
        if ("keyframe".equals(name)) {
            return keyframe();
        }
        if ("keyframe-align-center".equals(name)) {
            return keyframeAlignCenter();
        }
        if ("keyframe-align-horizontal".equals(name)) {
            return keyframeAlignHorizontal();
        }
        if ("keyframe-align-vertical".equals(name)) {
            return keyframeAlignVertical();
        }
        if ("keyframes".equals(name)) {
            return keyframes();
        }
        return null;
    }

    static Icon karate() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M3 9l4.5 1l3 2.5")
                .element("path", "d", "M13 21v-8l3 -5.5")
                .element("path", "d", "M8 4.5l4 2l4 1l4 3.5l-2 3.5")
                .element("path", "d", "M15.007 5a2 2 0 1 0 4 0a2 2 0 1 0 -4 0");
    }

    static Icon kayak() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M6.414 6.414a2 2 0 0 0 0 -2.828l-1.414 -1.414l-2.828 2.828l1.414 1.414a2 2 0 0 0 2.828 0")
                .element("path", "d", "M17.586 17.586a2 2 0 0 0 0 2.828l1.414 1.414l2.828 -2.828l-1.414 -1.414a2 2 0 0 0 -2.828 0")
                .element("path", "d", "M6.5 6.5l11 11")
                .element("path", "d", "M22 2.5c-9.983 2.601 -17.627 7.952 -20 19.5c9.983 -2.601 17.627 -7.952 20 -19.5")
                .element("path", "d", "M6.5 12.5l5 5")
                .element("path", "d", "M12.5 6.5l5 5");
    }

    static Icon kerning() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M16 15v-3.5a2.5 2.5 0 1 1 5 0v3.5m0 -2h-5")
                .element("path", "d", "M3 9l3 6l3 -6")
                .element("path", "d", "M9 20l6 -16");
    }

    static Icon key() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M16.555 3.843l3.602 3.602a2.877 2.877 0 0 1 0 4.069l-2.643 2.643a2.877 2.877 0 0 1 -4.069 0l-.301 -.301l-6.558 6.558a2 2 0 0 1 -1.239 .578l-.175 .008h-1.172a1 1 0 0 1 -.993 -.883l-.007 -.117v-1.172a2 2 0 0 1 .467 -1.284l.119 -.13l.414 -.414h2v-2h2v-2l2.144 -2.144l-.301 -.301a2.877 2.877 0 0 1 0 -4.069l2.643 -2.643a2.877 2.877 0 0 1 4.069 0")
                .element("path", "d", "M15 9h.01");
    }

    static Icon keyOff() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M10.17 6.159l2.316 -2.316a2.877 2.877 0 0 1 4.069 0l3.602 3.602a2.877 2.877 0 0 1 0 4.069l-2.33 2.33")
                .element("path", "d", "M14.931 14.948a2.863 2.863 0 0 1 -1.486 -.79l-.301 -.302l-6.558 6.558a2 2 0 0 1 -1.239 .578l-.175 .008h-1.172a1 1 0 0 1 -.993 -.883l-.007 -.117v-1.172a2 2 0 0 1 .467 -1.284l.119 -.13l.414 -.414h2v-2h2v-2l2.144 -2.144l-.301 -.301a2.863 2.863 0 0 1 -.794 -1.504")
                .element("path", "d", "M15 9h.01")
                .element("path", "d", "M3 3l18 18");
    }

    static Icon keyboard() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M2 8a2 2 0 0 1 2 -2h16a2 2 0 0 1 2 2v8a2 2 0 0 1 -2 2h-16a2 2 0 0 1 -2 -2l0 -8")
                .element("path", "d", "M6 10l0 .01")
                .element("path", "d", "M10 10l0 .01")
                .element("path", "d", "M14 10l0 .01")
                .element("path", "d", "M18 10l0 .01")
                .element("path", "d", "M6 14l0 .01")
                .element("path", "d", "M18 14l0 .01")
                .element("path", "d", "M10 14l4 .01");
    }

    static Icon keyboardHide() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M2 5a2 2 0 0 1 2 -2h16a2 2 0 0 1 2 2v8a2 2 0 0 1 -2 2h-16a2 2 0 0 1 -2 -2l0 -8")
                .element("path", "d", "M6 7l0 .01")
                .element("path", "d", "M10 7l0 .01")
                .element("path", "d", "M14 7l0 .01")
                .element("path", "d", "M18 7l0 .01")
                .element("path", "d", "M6 11l0 .01")
                .element("path", "d", "M18 11l0 .01")
                .element("path", "d", "M10 11l4 0")
                .element("path", "d", "M10 21l2 -2l2 2");
    }

    static Icon keyboardOff() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M18 18h-14a2 2 0 0 1 -2 -2v-8a2 2 0 0 1 2 -2h2m4 0h10a2 2 0 0 1 2 2v8c0 .554 -.226 1.056 -.59 1.418")
                .element("path", "d", "M6 10l0 .01")
                .element("path", "d", "M10 10l0 .01")
                .element("path", "d", "M14 10l0 .01")
                .element("path", "d", "M18 10l0 .01")
                .element("path", "d", "M6 14l0 .01")
                .element("path", "d", "M18 14l0 .01")
                .element("path", "d", "M10 14l4 0")
                .element("path", "d", "M3 3l18 18");
    }

    static Icon keyboardShow() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M2 5a2 2 0 0 1 2 -2h16a2 2 0 0 1 2 2v8a2 2 0 0 1 -2 2h-16a2 2 0 0 1 -2 -2l0 -8")
                .element("path", "d", "M6 7l0 .01")
                .element("path", "d", "M10 7l0 .01")
                .element("path", "d", "M14 7l0 .01")
                .element("path", "d", "M18 7l0 .01")
                .element("path", "d", "M6 11l0 .01")
                .element("path", "d", "M18 11l0 .01")
                .element("path", "d", "M10 11l4 0")
                .element("path", "d", "M10 19l2 2l2 -2");
    }

    static Icon keyframe() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M13.225 18.412a1.595 1.595 0 0 1 -1.225 .588c-.468 0 -.914 -.214 -1.225 -.588l-4.361 -5.248a1.844 1.844 0 0 1 0 -2.328l4.361 -5.248a1.595 1.595 0 0 1 1.225 -.588c.468 0 .914 .214 1.225 .588l4.361 5.248a1.844 1.844 0 0 1 0 2.328l-4.361 5.248");
    }

    static Icon keyframeAlignCenter() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M12 20v2")
                .element("path", "d", "M12.816 16.58c-.207 .267 -.504 .42 -.816 .42c-.312 0 -.61 -.153 -.816 -.42l-2.908 -3.748a1.39 1.39 0 0 1 0 -1.664l2.908 -3.748c.207 -.267 .504 -.42 .816 -.42c.312 0 .61 .153 .816 .42l2.908 3.748a1.39 1.39 0 0 1 0 1.664l-2.908 3.748")
                .element("path", "d", "M12 2v2")
                .element("path", "d", "M3 12h2")
                .element("path", "d", "M19 12h2");
    }

    static Icon keyframeAlignHorizontal() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M12.816 16.58c-.207 .267 -.504 .42 -.816 .42c-.312 0 -.61 -.153 -.816 -.42l-2.908 -3.748a1.39 1.39 0 0 1 0 -1.664l2.908 -3.748c.207 -.267 .504 -.42 .816 -.42c.312 0 .61 .153 .816 .42l2.908 3.748a1.39 1.39 0 0 1 0 1.664l-2.908 3.748")
                .element("path", "d", "M3 12h2")
                .element("path", "d", "M19 12h2");
    }

    static Icon keyframeAlignVertical() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M12 2v2")
                .element("path", "d", "M12.816 16.58c-.207 .267 -.504 .42 -.816 .42c-.312 0 -.61 -.153 -.816 -.42l-2.908 -3.748a1.39 1.39 0 0 1 0 -1.664l2.908 -3.748c.207 -.267 .504 -.42 .816 -.42c.312 0 .61 .153 .816 .42l2.908 3.748a1.39 1.39 0 0 1 0 1.664l-2.908 3.748")
                .element("path", "d", "M12 20v2");
    }

    static Icon keyframes() {
        return Icon.create()
                .element("path", "stroke", "none", "d", "M0 0h24v24H0z", "fill", "none")
                .element("path", "d", "M9.225 18.412a1.595 1.595 0 0 1 -1.225 .588c-.468 0 -.914 -.214 -1.225 -.588l-4.361 -5.248a1.844 1.844 0 0 1 0 -2.328l4.361 -5.248a1.595 1.595 0 0 1 1.225 -.588c.468 0 .914 .214 1.225 .588l4.361 5.248a1.844 1.844 0 0 1 0 2.328l-4.361 5.248")
                .element("path", "d", "M17 5l4.586 5.836a1.844 1.844 0 0 1 0 2.328l-4.586 5.836")
                .element("path", "d", "M13 5l4.586 5.836a1.844 1.844 0 0 1 0 2.328l-4.586 5.836");
    }
}
