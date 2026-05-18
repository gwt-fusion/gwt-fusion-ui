package org.gwtfusion.ui.component.feedback;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.gwtfusion.ui.component.emptystate.EmptyState;
import org.gwtfusion.ui.component.progress.Progress;
import org.gwtfusion.ui.component.skeleton.Skeleton;
import org.gwtfusion.ui.component.spinner.Spinner;
import org.gwtfusion.ui.component.spinner.SpinnerSize;
import org.gwtfusion.ui.component.status.StatusIndicator;
import org.gwtfusion.ui.component.status.StatusIndicatorVariant;
import org.gwtfusion.ui.component.toast.Toast;
import org.gwtfusion.ui.component.toast.ToastManager;
import org.gwtfusion.ui.component.toast.ToastStyle;
import org.gwtfusion.ui.component.toast.ToastVariant;
import org.junit.jupiter.api.Test;

class FeedbackComponentsTest {
    @Test
    void feedbackComponentsExposeStableRootClasses() {
        assertTrue(Progress.ROOT_CLASSES.contains("overflow-hidden"));
        assertTrue(Progress.INDICATOR_CLASSES.contains("transition-all"));
        assertTrue(Skeleton.BASE_CLASSES.contains("animate-pulse"));
        assertTrue(Spinner.BASE_CLASSES.contains("animate-spin"));
        assertTrue(EmptyState.ROOT_CLASSES.contains("border-dashed"));
        assertTrue(StatusIndicator.BASE_CLASSES.contains("inline-flex"));
        assertTrue(Toast.BASE_CLASSES.contains("pointer-events-auto"));
        assertTrue(ToastManager.VIEWPORT_CLASSES.contains("fixed"));
    }

    @Test
    void feedbackVariantsExposeTailwindClasses() {
        assertTrue(SpinnerSize.SM.classes().contains("h-4"));
        assertTrue(SpinnerSize.LG.classes().contains("h-8"));
        assertEquals("bg-green-500", StatusIndicatorVariant.SUCCESS.dotClass());
        assertTrue(StatusIndicatorVariant.ERROR.textClass().contains("text-destructive"));
        assertTrue(ToastVariant.SUCCESS.classes().contains("bg-green-50"));
        assertTrue(ToastVariant.ERROR.classes().contains("bg-destructive"));
        assertTrue(ToastStyle.SONNER.classes().contains("rounded-xl"));
    }
}
