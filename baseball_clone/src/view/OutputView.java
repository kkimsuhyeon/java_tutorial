package view;

import type.ExceptionType;
import type.HintType;
import type.TextType;
import type.ValueType;

public class OutputView {

    public static void printStart(){
        System.out.println(TextType.START.getText());
    }

    public static String printInvalidLengthException(){
        return ExceptionType.INVALID_LENGTH.getException();
    }

    public static String printInvalidBoundaryException(){
        return ExceptionType.INVALID_BOUNDARY.getException();
    }

    public static String printInvalidDuplicateException(){
        return ExceptionType.INVALID_DUPLICATE.getException();
    }

    public static boolean printHint(int ball, int strike){ // 왜 boolean ??

        if((ball != ValueType.INITIAL_VALUE.getValue()) && (strike == ValueType.INITIAL_VALUE.getValue())){
            return printOnlyBall(ball);
        }

        if((ball == ValueType.INITIAL_VALUE.getValue()) && (strike != ValueType.INITIAL_VALUE.getValue())){
            if(strike == ValueType.ANSWER_VALUE.getValue()){
                return printAnswer();
            }
            return printOnlyStrike(strike);
        }

        if((ball == ValueType.INITIAL_VALUE.getValue()) && (strike == ValueType.INITIAL_VALUE.getValue())){
            return printNothing();
        }
        return printBallAndStrike(ball, strike);
    }

    public static boolean printOnlyBall(int ball){
        System.out.println(String.format("%d%s", ball, HintType.BALL.getHint()));
        return false;
    }

    public static boolean printOnlyStrike(int strike){
        System.out.println(String.format("%d%s", strike, HintType.STRIKE.getHint()));
        return false;
    }

    public static boolean printNothing(){
        System.out.println(HintType.NOTHING.getHint());
        return false;
    }

    public static boolean printBallAndStrike(int ball, int strike){
       System.out.println(String.format("%d%s %d%s", ball, HintType.BALL.getHint(), strike, HintType.STRIKE.getHint()));
        return false;
    }

    public static boolean printAnswer(){
        System.out.println(String.format("%d%s", ValueType.ANSWER_VALUE.getValue(), HintType.STRIKE.getHint()));
        System.out.println(String.format("%d%s", ValueType.ANSWER_VALUE.getValue(), TextType.ANSWER.getText()));
        System.out.println(TextType.RESTART_OR_FINISH.getText());
        return true;
    }




}
