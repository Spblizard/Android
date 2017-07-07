//package ru.apps.max.calc;

public class Calc {
    private String s;
    private String[] strNumber;
    private int r, line, countOp;
    private int[] countNumb;
    private float[] number;
    private char[] chOp;
    private char[][] chStr;
    private int checkNumb;
    private boolean bl,mtr;

    public String CalcStr(String str){
        r = 0;
	bl = true;
	mtr = false;
        countOp = 0;
        line = str.length();
        countNumb = new int[line];
        for(int i=0;i<line;i++)
        {
            if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/' ) {
                countOp++;
                countNumb[r++] = i;
            }
        }
	chOp = new char[countOp+1];
        for(int i =0;i<countOp;i++)
                chOp[i] = str.charAt(countNumb[i]);
        number = new float[countOp+2];
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
        for(int i=0;i<=countOp;i++)
            strNumber[i] = String.valueOf(chStr[i]);
        for(int i=0;i<=countOp;i++)
            number[i] = Float.parseFloat(strNumber[i]);
        while(bl){
		for(int i=0;i<=countOp;i++){
			if(chOp[i] == '-'){
				number[i+1] = number[i+1]*(-1);
				mtr = true;
		}
		}
            for(int i=0;i<=countOp;i++){
                if(chOp[i] == '*') {
                    number[i] = number[i] * number[i + 1];
                    checkNumb = i;
		    Resize();
                }
            }
            for(int i=0;i<=countOp;i++){
                if(chOp[i] == '/'){
                    number[i] = number[i] / number[i + 1];
                    checkNumb = i;
		    Resize();
                }
            }
            for(int i=0;i<=countOp;i++){
                if(chOp[i] == '+'){
                    number[i] = number[i] + number[i + 1];
                    checkNumb = i;
		    Resize();
                }
            }
            for(int i=0;i<=countOp;i++){
                if(chOp[i] == '-'){
			if(mtr)
				number[i] = number[i] + number[i + 1];
			else
                    		number[i] = number[i] - number[i + 1];
                    checkNumb = i;
		    Resize();
                }
            }
        }
        s = String.valueOf(number[0]);
        return s;
    }
    private void Resize() {
	    if(countOp == 1){
		    countOp--;
    		    bl = false;
	    }
	    else if(countOp > 1){
       	 	for (int i = checkNumb; i <= countOp; i++) {
            			number[i + 1] = number[i + 2];
            		chOp[i] = chOp[i + 1];
            		countOp--;
		}
	    }
	    else
		    bl = false;
    }
}
