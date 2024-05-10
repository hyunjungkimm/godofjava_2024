package chapter05;

public class OperatorConditionTriple {
    public static void main(String[] args) {
        OperatorConditionTriple operatorConditionTriple = new OperatorConditionTriple();
        operatorConditionTriple.doBlindDate(30);
        operatorConditionTriple.doBlindDate(80);
    }

    public boolean doBlindDate(int point) {
        boolean doBlindDateFlag = false;
        doBlindDateFlag = (point >= 80) ? true : false;
        System.out.println(point + " : " + doBlindDateFlag);
        return doBlindDateFlag;
    }
}
