package view.output.util;

import type.ExceptionType;

public class FeatureChoiceExceptionView {
    public static void printInvalidFeatureChoiceException() {
        System.out.println();
        System.out.println(ExceptionType.INVALID_FEATURE_CHOICE.getException());
    }

    public static boolean printInvalidChoiceException() {
        System.out.println();
        System.out.println(ExceptionType.INVALID_FEATURE_CHOICE.getException());
        return false;
    }
}
