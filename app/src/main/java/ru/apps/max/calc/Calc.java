package ru.apps.max.calc;

public class Calc {

    private boolean[] bl;
    private String s1,s2;
    private String[] strNumber;
    private float a, b, c;
    private int r, line, countOp;
    private int[] countNumb;
    private char op;
    private float[] number;
    private char[] chOp, ch1, ch2;
    private char[][] chStr;

    public String CalcStr(String str){

        c = 0;
        r = 0;
        countOp = 0;
        line = str.length();
        bl = new boolean[line];
        countNumb = new int[line];
        for(int i=0;i<line;i++)
        {
            if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/' ) {
                bl[i] = true;
                countOp++;
                countNumb[r++] = i;
            }
            else
                bl[i] = false;
        }
        chOp = new char[countOp];
        for(int i =0;i<countOp;i++)
                chOp[i] = str.charAt(countNumb[i]);
        number = new float[countOp+1];
        strNumber =new String[countOp+1];
        chStr = new char[countOp+1][line];
        for(int i=0;i<=countOp;i++){
            if(i == 0)
                str.getChars(0, countNumb[i],chStr[i],0);
            else if(i == countOp)
                str.getChars(countNumb[i-1]+1,line,chStr[i],0);
            else
                str.getChars(countNumb[i-1]+1,countNumb[i],chStr[i],0);
        }
        strNumber[0] = String.valueOf(chStr[2]);
/*
        ch1 = new char[line];
        ch2 = new char[line];
        op = ' ';
        chStr = str.toCharArray();
        for (int i = 0; i < line; i++)
            bl[i] = true;
        for (int i = 0; i < line; i++) {
            switch (chStr[i]) {
                case '+':
                    bl[i] = false;
                    op = chStr[i];
                    i = line;
                    break;
                case '-':
                    bl[i] = false;
                    op = chStr[i];
                    i = line;
                    break;
                case '*':
                    bl[i] = false;
                    op = chStr[i];
                    i = line;
                    break;
                case '/':
                    bl[i] = false;
                    op = chStr[i];
                    i = line;
                    break;
            }
            r++;
        }
        for (int i = 0; i < line; i++) {
            if (bl[i]) {
                if (i < r)
                    ch1[i] = chStr[i];
                else if (i > r || i == r)
                    ch2[i - r] = chStr[i];
            }

        }
        s1 = String.valueOf(ch1);
        s2 = String.valueOf(ch2);
        a = Float.parseFloat(s1);
        b = Float.parseFloat(s2);
        switch (op) {
            case '+':
                c = a + b;
                break;
            case '-':
                c = a - b;
                break;
            case '*':
                c = a * b;
                break;
            case '/':
                c = a / b;
                break;
        }
        */
        return strNumber[0];
    }
}
