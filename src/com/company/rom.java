package com.company;

public class rom {

    public static String rom(int arab){
        String bb="";
        //definieren von "Countern" für je 1000er, 100er, 10er und 1er
        int M=0; //M: 1000
                 //D: 500
        int C=0; //C: 100
                 //L: 50
        int X=0; //X: 10
                 //V: 5
        int I=0; //I: 1

        if (arab>3999){return "zu groß";}               // verstehe das Internet immer noch so
       else{
    while (arab>=1000) {                                //1000er zählen
       arab=arab-1000;
       M++;
     }
    for (int j=1;j<=M;j++){
        bb=bb+"M";                                      //M setzten pro 1000
    }
    }

    while (arab>=100) {                                 //100er zählen
         arab=arab-100;
         C++;
            }
        if (C==9){bb=bb+"CM";}                          // CM Hart definieren
        else if(C>=5){                                  //für 500 D setzten dann "C"s setzten pro restliche 100er
            bb=bb+"D";
            C-=5;
            for (int j=1;j<=C;j++){
                bb=bb+"C";
            }
        }
        else if(C==4){bb=bb+"CD";}                      //CD hart definieren
        else{
            for (int j=1;j<=C;j++){                     //"C"s setzten pro 100
                    bb=bb+"C";
                }
            }
    while (arab>=10) {                                  // 10er zählen
        arab = arab - 10;
        X++;
    }
        if (X==9){bb=bb+"XC";}                          //XC Hart definieren
        else if (X>=5){                                 //für 50 L setzten dann "C"s setzten pro restliche 10er
            bb=bb+"L";
            X-=5;
            for (int j=1;j<=X;j++){
                bb=bb+"X";
            }
        }
        else if(X==4){bb=bb+"XL";}                      //XL hart definieren
        else{
            for (int j=1;j<=X;j++){
                bb=bb+"X";                              //"X"s setzten pro 10
            }
        }

    while (arab>=1) {                                   // 1er zählen
     arab=arab-1;
     I++;}
        if(I==9){bb=bb+"IX";}                           // IX hart definieren
        else if(I>=5){                                  //für 5 V setzten dann "I"s setzten pro restliche 1er
            bb=bb+"V";
            I-=5;
            for (int j=1;j<=I;j++){
                bb=bb+"I";
            }
        }
        else if (I==4){bb=bb+"IV";}                     // IV hart definieren
        else{
            for (int j=1;j<=I;j++){
              bb=bb+"I";                                // "I"s setzten ro 1er
            }
        }

       return bb;
    }}