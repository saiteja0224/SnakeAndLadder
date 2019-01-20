import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="sandl" height=800 width=1500>
*</applet>*/
public class sandl extends Applet implements 
ActionListener
{

Button btnGen;
int array[];
Panel btnpanel;
Color charColor[];
String msg1="Player1's Score";
String msg2="Player2's Score";
int player1_score=0,player2_score=0;
int turn=0;
String win=" ";
String win1=" ";
String win2=" ";
public void init()
{
Font f=new Font("SansSerif",Font.BOLD,12);
setFont(f);
setBackground(Color.white);
btnGen = new Button("ROLL THE DICE");	
btnGen.addActionListener(this);
setLayout(new BorderLayout());
btnpanel=new Panel();
btnpanel.add(btnGen);
add(btnpanel, BorderLayout.SOUTH);

//Array to store numbers
array = new int[] {0,0,0,0,0,0};

//Color for each  number
charColor=new Color[] {Color.red, Color.orange, Color.green, Color.pink, Color.blue, Color.black };
}
public void paint(Graphics g)
{
setBackground(Color.lightGray);
g.drawString(msg1,660,230);
g.drawString(msg2,660,260);
g.setColor(Color.blue);
g.fillRect(10,10,64,64);
g.setColor(Color.yellow);
g.fillRect(74,10,64,64);
g.setColor(Color.red);
g.fillRect(138,10,64,64);
g.setColor(Color.green);
g.fillRect(202,10,64,64);
g.setColor(Color.blue);
g.fillRect(266,10,64,64);
g.setColor(Color.yellow);
g.fillRect(330,10,64,64);
g.setColor(Color.red);
g.fillRect(394,10,64,64);
g.setColor(Color.green);
g.fillRect(458,10,64,64);
g.setColor(Color.blue);
g.fillRect(522,10,64,64);
g.setColor(Color.yellow);
g.fillRect(586,10,64,64);
g.setColor(Color.green);
g.fillRect(10,74,64,64);
g.setColor(Color.blue);
g.fillRect(74,74,64,64);
g.setColor(Color.yellow);
g.fillRect(138,74,64,64);
g.setColor(Color.red);
g.fillRect(202,74,64,64);
g.setColor(Color.green);
g.fillRect(266,74,64,64);
g.setColor(Color.blue);
g.fillRect(330,74,64,64);
g.setColor(Color.yellow);
g.fillRect(394,74,64,64);
g.setColor(Color.red);
g.fillRect(458,74,64,64);
g.setColor(Color.green);
g.fillRect(522,74,64,64);
g.setColor(Color.blue);
g.fillRect(586,74,64,64);
g.setColor(Color.red);
g.fillRect(10,138,64,64);
g.setColor(Color.green);
g.fillRect(74,138,64,64);
g.setColor(Color.blue);
g.fillRect(138,138,64,64);
g.setColor(Color.yellow);
g.fillRect(202,138,64,64);
g.setColor(Color.red);
g.fillRect(266,138,64,64);
g.setColor(Color.green);
g.fillRect(330,138,64,64);
g.setColor(Color.blue);
g.fillRect(394,138,64,64);
g.setColor(Color.yellow);
g.fillRect(458,138,64,64);
g.setColor(Color.red);
g.fillRect(522,138,64,64);
g.setColor(Color.green);
g.fillRect(586,138,64,64);
g.setColor(Color.yellow);
g.fillRect(10,202,64,64);
g.setColor(Color.red);
g.fillRect(74,202,64,64);
g.setColor(Color.green);
g.fillRect(138,202,64,64);
g.setColor(Color.blue);
g.fillRect(202,202,64,64);
g.setColor(Color.yellow);
g.fillRect(266,202,64,64);
g.setColor(Color.red);
g.fillRect(330,202,64,64);
g.setColor(Color.green);
g.fillRect(394,202,64,64);
g.setColor(Color.blue);
g.fillRect(458,202,64,64);
g.setColor(Color.yellow);
g.fillRect(522,202,64,64);
g.setColor(Color.red);
g.fillRect(586,202,64,64);
g.setColor(Color.blue);
g.fillRect(10,266,64,64);
g.setColor(Color.yellow);
g.fillRect(74,266,64,64);
g.setColor(Color.red);
g.fillRect(138,266,64,64);
g.setColor(Color.green);
g.fillRect(202,266,64,64);
g.setColor(Color.blue);
g.fillRect(266,266,64,64);
g.setColor(Color.yellow);
g.fillRect(330,266,64,64);
g.setColor(Color.red);
g.fillRect(394,266,64,64);
g.setColor(Color.green);
g.fillRect(458,266,64,64);
g.setColor(Color.blue);
g.fillRect(522,266,64,64);
g.setColor(Color.yellow);
g.fillRect(586,266,64,64);
g.setColor(Color.green);
g.fillRect(10,330,64,64);
g.setColor(Color.blue);
g.fillRect(74,330,64,64);
g.setColor(Color.yellow);
g.fillRect(138,330,64,64);
g.setColor(Color.red);
g.fillRect(202,330,64,64);
g.setColor(Color.green);
g.fillRect(266,330,64,64);
g.setColor(Color.blue);
g.fillRect(330,330,64,64);
g.setColor(Color.yellow);
g.fillRect(394,330,64,64);
g.setColor(Color.red);
g.fillRect(458,330,64,64);
g.setColor(Color.green);
g.fillRect(522,330,64,64);
g.setColor(Color.blue);
g.fillRect(586,330,64,64);
g.setColor(Color.red);
g.fillRect(10,394,64,64);
g.setColor(Color.green);
g.fillRect(74,394,64,64);
g.setColor(Color.blue);
g.fillRect(138,394,64,64);
g.setColor(Color.yellow);
g.fillRect(202,394,64,64);
g.setColor(Color.red);
g.fillRect(266,394,64,64);
g.setColor(Color.green);
g.fillRect(330,394,64,64);
g.setColor(Color.blue);
g.fillRect(394,394,64,64);
g.setColor(Color.yellow);
g.fillRect(458,394,64,64);
g.setColor(Color.red);
g.fillRect(522,394,64,64);
g.setColor(Color.green);
g.fillRect(586,394,64,64);
g.setColor(Color.yellow);
g.fillRect(10,458,64,64);
g.setColor(Color.red);
g.fillRect(74,458,64,64);
g.setColor(Color.green);
g.fillRect(138,458,64,64);
g.setColor(Color.blue);
g.fillRect(202,458,64,64);
g.setColor(Color.yellow);
g.fillRect(266,458,64,64);
g.setColor(Color.red);
g.fillRect(330,458,64,64);
g.setColor(Color.green);
g.fillRect(394,458,64,64);
g.setColor(Color.blue);
g.fillRect(458,458,64,64);
g.setColor(Color.yellow);
g.fillRect(522,458,64,64);
g.setColor(Color.red);
g.fillRect(586,458,64,64);
g.setColor(Color.blue);
g.fillRect(10,522,64,64);
g.setColor(Color.yellow);
g.fillRect(74,522,64,64);
g.setColor(Color.red);
g.fillRect(138,522,64,64);
g.setColor(Color.green);
g.fillRect(202,522,64,64);
g.setColor(Color.blue);
g.fillRect(266,522,64,64);
g.setColor(Color.yellow);
g.fillRect(330,522,64,64);
g.setColor(Color.red);
g.fillRect(394,522,64,64);
g.setColor(Color.green);
g.fillRect(458,522,64,64);
g.setColor(Color.blue);
g.fillRect(522,522,64,64);
g.setColor(Color.yellow);
g.fillRect(586,522,64,64);
g.setColor(Color.red);
g.fillRect(10,586,64,64);
g.setColor(Color.blue);
g.fillRect(74,586,64,64);
g.setColor(Color.yellow);
g.fillRect(138,586,64,64);
g.setColor(Color.red);
g.fillRect(202,586,64,64);
g.setColor(Color.green);
g.fillRect(266,586,64,64);
g.setColor(Color.blue);
g.fillRect(330,586,64,64);
g.setColor(Color.yellow);
g.fillRect(394,586,64,64);
g.setColor(Color.red);
g.fillRect(458,586,64,64);
g.setColor(Color.green);
g.fillRect(522,586,64,64);
g.setColor(Color.blue);
g.fillRect(586,586,64,64);
g.setColor(Color.darkGray);
g.drawString("100",20,28);
g.drawString("HOME",26,45);
g.drawString("99",84,28);
g.drawString("98",148,28);
g.drawString("97",212,28);
g.drawString("DANGER",214,45);
g.drawString("96",276,28);
g.drawString("95",340,28);
g.drawString("94",404,28);
g.drawString("93",468,28);
g.drawString("92",532,28);
g.drawString("91",596,28);
g.drawString("81",20,90);
g.drawString("82",84,90);
g.drawString("83",148,90);
g.drawString("84",212,90);
g.drawString("85",276,90);
g.drawString("86",340,90);
g.drawString("87",404,90);
g.drawString("88",468,90);
g.drawString("89",532,90);
g.drawString("90",596,90);
g.drawString("80",20,153);
g.drawString("79",84,153);
g.drawString("78",148,153);
g.drawString("77",212,153);
g.drawString("76",276,153);
g.drawString("75",340,153);
g.drawString("74",404,153);
g.drawString("73",468,153);
g.drawString("72",532,153);
g.drawString("71",596,153);
g.drawString("61",20,218);
g.drawString("62",84,218);
g.drawString("63",148,218);
g.drawString("64",212,218);
g.drawString("65",276,218);
g.drawString("66",340,218);
g.drawString("67",404,218);
g.drawString("68",468,218);
g.drawString("69",532,218);
g.drawString("70",596,218);
g.drawString("60",20,282);
g.drawString("59",84,282);
g.drawString("58",148,282);
g.drawString("57",212,282);
g.drawString("56",276,282);
g.drawString("55",340,282);
g.drawString("54",404,282);
g.drawString("53",468,282);
g.drawString("DANGER",466,302);
g.drawString("52",532,282);
g.drawString("51",596,282);
g.drawString("41",20,346);
g.drawString("42",84,346);
g.drawString("43",148,346);
g.drawString("44",212,346);
g.drawString("45",276,346);
g.drawString("46",340,346);
g.drawString("47",404,346);
g.drawString("48",468,346);
g.drawString("49",532,346);
g.drawString("50",596,346);
g.drawString("40",20,410);
g.drawString("39",84,410);
g.drawString("38",148,410);
g.drawString("37",212,410);
g.drawString("36",276,410);
g.drawString("35",340,410);
g.drawString("34",404,410);
g.drawString("33",468,410);
g.drawString("32",522,410);
g.drawString("31",586,410);
g.drawString("21",20,474);
g.drawString("22",84,474);
g.drawString("23",148,474);
g.drawString("24",212,474);
g.drawString("25",276,474);
g.drawString("26",340,474);
g.drawString("27",404,474);
g.drawString("28",468,474);
g.drawString("29",532,474);
g.drawString("30",596,474);
g.drawString("20",20,538);
g.drawString("19",84,538);
g.drawString("18",148,538);
g.drawString("17",212,538);
g.drawString("16",276,538);
g.drawString("15",340,538);
g.drawString("14",404,538);
g.drawString("13",468,538);
g.drawString("12",532,538);
g.drawString("11",596,538);
g.drawString("1 ",20,598);
g.drawString("START",24,620);
g.drawString("2",84,600);
g.drawString("3",148,600);
g.drawString("4",212,600);
g.drawString("5",276,600);
g.drawString("6",340,600);
g.drawString("7",404,600);
g.drawString("8",468,600);
g.drawString("9",532,600);
g.drawString("10",596,600);
g.setColor(Color.black);

//ladder at 81
g.drawLine(45,99,173,43);
g.drawLine(59,113,187,59);

//ladder middle part
g.drawLine(76,84,86,100);
g.drawLine(102,72,116,88);
g.drawLine(132,60,145,76);

//ladder at 17
g.drawLine(230,532,419,175);
g.drawLine(251,545,443,190);

//middle part
g.drawLine(258,482,280,490);
g.drawLine(278,442,300,450);
g.drawLine(298,402,322,410);
g.drawLine(318,362,346,370);
g.drawLine(340,322,366,330);
g.drawLine(360,282,386,290);
g.drawLine(380,242,408,250);

//ladder at 38
g.drawLine(148,402,95,321);
g.drawLine(113,305,177,403);

//middle part
g.drawLine(110,346,128,326);
g.drawLine(140,386,155,366);
g.drawArc(30, 40, 300, 300, 0, 75);
g.drawArc(30, 40, 300, 300, 0, -75);
g.drawArc(100,100,400,400,0,-75);
g.drawArc(305,486,160,130,190,-75);
Font f=new Font("SansSerif",Font.BOLD,30); 
g.setColor(Color.black);
g.setFont(f);     
g.drawString("SNAKES & LADDERS",880,480);

//Fonts for title
Font font = new Font("Verdana", Font.BOLD , 15);
g.setFont(font);
g.setColor(Color.orange);
g.drawString("CURRENT NUMBER ON THE DICE", 670, 30);

//lines to draw borders
g.drawLine(660,10,960 ,10);
g.drawLine(660,10,660,210);
g.drawLine(960,10,960,210);

//Fonts for numbers
Font font1 = new Font("Verdana", Font.BOLD , 19);
g.setFont(font1);

//Drawing numbers
for(int n=0;n<1;n++)
{
g.setColor(charColor[n]);
Integer I = new Integer(array[n]);
g.drawString(I.toString(),680,130);
}

//Drawing bottom border
g.setColor(Color.red);
g.drawLine(660,210,960,210);
g.drawString(" "+player1_score,760,230);
g.drawString(" "+player2_score,760,260);
g.drawString(" " +win,760,300);
g.drawString(" "+win1,760,330);
g.drawString(" "+win2,760,360);
}

public void actionPerformed(ActionEvent ev)
{
int n=1;
turn++;

//initialize rnd with current system time
Random rnd = new Random();

//generate the first number
int i = Math.abs(rnd.nextInt() % 7);

//If number is 0 keep generate numbers until it is not 0; 
while(i==0)
i = Math.abs(rnd.nextInt() % 7);

//add number to array
array[0]= i;
current_score(i,turn);
repaint();
}
public void current_score(int i,int turn)
{
//player1
if (turn%2!=0 && (player1_score+i)<=100 && win!="GAME OVER")
{
//to enter the board
if(i==6&& player1_score==0)
player1_score=player1_score+i;
else if(i<=6 && player1_score>0)
player1_score=player1_score+i;

if(player1_score==17)
player1_score=player1_score+57;
if (player1_score==38)
player1_score=player1_score+21;
if (player1_score==81)
player1_score=player1_score+16;
if (player1_score==53)
player1_score=player1_score-37;
if (player1_score==97)
player1_score=player1_score-53;
}

//player2
else if(turn%2==0 &&(player2_score+i)<=100 && win!="GAME OVER") 
{
//to enter the board
if(i==6&& player2_score==0)
player2_score=player2_score+i;
else if(i<=6 && player2_score>0)
player2_score=player2_score+i;
if(player2_score==17)
player2_score=player2_score+57;
if (player2_score==38)
player2_score=player2_score+21;
if (player2_score==81)
player2_score=player2_score+16;
if (player2_score==53)
player2_score=player2_score-37;
if (player2_score==97)
player2_score=player2_score-53;

//snakes_ladders(player2_score);
}
if(player1_score==100||player2_score==100)
{ 
win="GAME OVER";

if(player1_score==100)
win1=" CONGRATULATIONS!!!!!!!          PLAYER1 WINS";
else
win2="  CONGRATULATIONS!!!!!!          PLAYER2 WINS";
}
}
}


