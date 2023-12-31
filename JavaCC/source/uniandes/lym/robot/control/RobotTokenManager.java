/* RobotTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. RobotTokenManager.java */
package uniandes.lym.robot.control;
import uniandes.lym.robot.kernel.*;
import uniandes.lym.robot.view.Console;
import java.util.*;
import java.util.Arrays;
import java.awt.Point;

/** Token Manager. */
@SuppressWarnings ("unused")
public class RobotTokenManager implements RobotConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x20010000L) != 0L)
         {
            jjmatchedKind = 41;
            return 3;
         }
         if ((active0 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 41;
            return 27;
         }
         if ((active0 & 0x8200L) != 0L)
         {
            jjmatchedKind = 41;
            return 22;
         }
         if ((active0 & 0x5f52307ce0L) != 0L)
         {
            jjmatchedKind = 41;
            return 36;
         }
         if ((active0 & 0x81000000L) != 0L)
         {
            jjmatchedKind = 41;
            return 19;
         }
         if ((active0 & 0x400000L) != 0L)
         {
            jjmatchedKind = 41;
            return 14;
         }
         if ((active0 & 0x2000000000L) != 0L)
         {
            jjmatchedKind = 41;
            return 31;
         }
         if ((active0 & 0x800100L) != 0L)
         {
            jjmatchedKind = 41;
            return 11;
         }
         return -1;
      case 1:
         if ((active0 & 0x80000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 1;
            return 18;
         }
         if ((active0 & 0x800200000L) != 0L)
            return 36;
         if ((active0 & 0x575bd07de0L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 1;
            return 36;
         }
         if ((active0 & 0x2000000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 1;
            return 30;
         }
         if ((active0 & 0x20010000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 1;
            return 2;
         }
         if ((active0 & 0x8200L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 1;
            return 21;
         }
         return -1;
      case 2:
         if ((active0 & 0x1530012000L) != 0L)
            return 36;
         if ((active0 & 0x80000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 2;
            return 17;
         }
         if ((active0 & 0x624bd0dfe0L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 2;
            return 36;
         }
         return -1;
      case 3:
         if ((active0 & 0x240405f80L) != 0L)
            return 36;
         if ((active0 & 0x600b908060L) != 0L)
         {
            if (jjmatchedPos != 3)
            {
               jjmatchedKind = 41;
               jjmatchedPos = 3;
            }
            return 36;
         }
         if ((active0 & 0x80000000L) != 0L)
         {
            if (jjmatchedPos != 3)
            {
               jjmatchedKind = 41;
               jjmatchedPos = 3;
            }
            return 37;
         }
         return -1;
      case 4:
         if ((active0 & 0x4002808000L) != 0L)
            return 36;
         if ((active0 & 0x2009100860L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 4;
            return 36;
         }
         if ((active0 & 0x80000000L) != 0L)
         {
            jjmatchedKind = 18;
            jjmatchedPos = 4;
            return 36;
         }
         return -1;
      case 5:
         if ((active0 & 0x80000000L) != 0L)
         {
            if (jjmatchedPos < 4)
            {
               jjmatchedKind = 18;
               jjmatchedPos = 4;
            }
            return -1;
         }
         if ((active0 & 0x9100820L) != 0L)
            return 36;
         if ((active0 & 0x2000000040L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 5;
            return 36;
         }
         return -1;
      case 6:
         if ((active0 & 0x80000000L) != 0L)
         {
            if (jjmatchedPos < 4)
            {
               jjmatchedKind = 18;
               jjmatchedPos = 4;
            }
            return -1;
         }
         if ((active0 & 0x40L) != 0L)
            return 36;
         if ((active0 & 0x2000000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 6;
            return 36;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 40:
         jjmatchedKind = 46;
         return jjMoveStringLiteralDfa1_0(0x2000000000000L);
      case 41:
         return jjStopAtPos(0, 47);
      case 44:
         return jjStopAtPos(0, 48);
      case 58:
         return jjStopAtPos(0, 50);
      case 59:
         return jjStopAtPos(0, 45);
      case 61:
         return jjStopAtPos(0, 26);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x4010000000L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x1060L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa1_0(0x800006000L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa1_0(0x1000000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 74:
      case 106:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa1_0(0x8200L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa1_0(0x20010000L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x700000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x81000000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x2000c00L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa1_0(0x800100L);
      case 123:
         return jjStopAtPos(0, 43);
      case 125:
         return jjStopAtPos(0, 44);
      default :
         return jjMoveNfa_0(4, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 41:
         if ((active0 & 0x2000000000000L) != 0L)
            return jjStopAtPos(1, 49);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x2018000100L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x100a260L);
      case 70:
      case 102:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(1, 21, 36);
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000800000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x282000000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      case 79:
      case 111:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(1, 35, 36);
         return jjMoveStringLiteralDfa2_0(active0, 0x1460010000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x105000L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000c80L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x4200L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x208000000L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x60L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000800000L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000100L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000080L);
      case 78:
      case 110:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(2, 28, 36);
         break;
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x101000L);
      case 80:
      case 112:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(2, 16, 36);
         else if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(2, 34, 36);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 36, 36);
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0xc00L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 84:
      case 116:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(2, 13, 36);
         else if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(2, 29, 36);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(2, 32, 36);
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 66:
      case 98:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(3, 14, 36);
         break;
      case 69:
      case 101:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(3, 22, 36);
         else if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(3, 30, 36);
         return jjMoveStringLiteralDfa4_0(active0, 0x3000000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 72:
      case 104:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000L);
      case 75:
      case 107:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(3, 8, 36);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(3, 33, 36);
         break;
      case 76:
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000800000L);
      case 78:
      case 110:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 80:
      case 112:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(3, 7, 36);
         else if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(3, 9, 36);
         else if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(3, 12, 36);
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000040L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa4_0(active0, 0x20L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000020L);
      case 69:
      case 101:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(4, 23, 36);
         break;
      case 78:
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x8100000L);
      case 79:
      case 111:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(4, 15, 36);
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x40L);
      case 83:
      case 115:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(4, 25, 36);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 38, 36);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000800L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 40:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000000L);
      case 68:
      case 100:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(5, 20, 36);
         break;
      case 71:
      case 103:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(5, 27, 36);
         break;
      case 79:
      case 111:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(5, 11, 36);
         return jjMoveStringLiteralDfa6_0(active0, 0x2000000040L);
      case 82:
      case 114:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(5, 5, 36);
         break;
      case 84:
      case 116:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(5, 24, 36);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 41:
         if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(6, 31);
         break;
      case 67:
      case 99:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(6, 6, 36);
         break;
      case 78:
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x2000000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 83:
      case 115:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 37, 36);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 36;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 14:
               case 35:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  { jjCheckNAddTwoStates(34, 35); }
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  { jjCheckNAddTwoStates(34, 35); }
                  break;
               case 31:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  { jjCheckNAddTwoStates(34, 35); }
                  break;
               case 19:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  { jjCheckNAddTwoStates(34, 35); }
                  break;
               case 27:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  { jjCheckNAddTwoStates(34, 35); }
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  { jjCheckNAddTwoStates(34, 35); }
                  break;
               case 21:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  { jjCheckNAddTwoStates(34, 35); }
                  break;
               case 4:
               case 33:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 39)
                     kind = 39;
                  { jjCheckNAdd(33); }
                  break;
               case 17:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  { jjCheckNAddTwoStates(34, 35); }
                  break;
               case 30:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  { jjCheckNAddTwoStates(34, 35); }
                  break;
               case 36:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  { jjCheckNAddTwoStates(34, 35); }
                  break;
               case 11:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  { jjCheckNAddTwoStates(34, 35); }
                  break;
               case 22:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  { jjCheckNAddTwoStates(34, 35); }
                  break;
               case 18:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  { jjCheckNAddTwoStates(34, 35); }
                  break;
               case 37:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  { jjCheckNAddTwoStates(34, 35); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 14:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     { jjCheckNAddTwoStates(34, 35); }
                  }
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 2:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     { jjCheckNAddTwoStates(34, 35); }
                  }
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 31:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     { jjCheckNAddTwoStates(34, 35); }
                  }
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 30;
                  break;
               case 19:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     { jjCheckNAddTwoStates(34, 35); }
                  }
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 27:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     { jjCheckNAddTwoStates(34, 35); }
                  }
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 3:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     { jjCheckNAddTwoStates(34, 35); }
                  }
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 21:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     { jjCheckNAddTwoStates(34, 35); }
                  }
                  if ((0x4000000040L & l) != 0L)
                     { jjCheckNAdd(16); }
                  break;
               case 4:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     { jjCheckNAddTwoStates(34, 35); }
                  }
                  if ((0x400000004L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 31;
                  else if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 27;
                  else if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 22;
                  else if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 19;
                  else if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 14;
                  else if ((0x80000000800000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 11;
                  else if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  else if ((0x400000004000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 17:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     { jjCheckNAddTwoStates(34, 35); }
                  }
                  if ((0x10000000100L & l) != 0L)
                     { jjCheckNAdd(16); }
                  break;
               case 30:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     { jjCheckNAddTwoStates(34, 35); }
                  }
                  if ((0x800000008L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 36:
               case 34:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 41)
                     kind = 41;
                  { jjCheckNAddTwoStates(34, 35); }
                  break;
               case 11:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     { jjCheckNAddTwoStates(34, 35); }
                  }
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 22:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     { jjCheckNAddTwoStates(34, 35); }
                  }
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 18:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     { jjCheckNAddTwoStates(34, 35); }
                  }
                  if ((0x8000000080L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 37:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 41)
                        kind = 41;
                     { jjCheckNAddTwoStates(34, 35); }
                  }
                  if ((0x10000000100000L & l) != 0L)
                  {
                     if (kind > 18)
                        kind = 18;
                  }
                  break;
               case 0:
                  if ((0x10000000100L & l) != 0L && kind > 17)
                     kind = 17;
                  break;
               case 1:
               case 5:
                  if ((0x10000000100000L & l) != 0L)
                     { jjCheckNAdd(0); }
                  break;
               case 6:
                  if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if ((0x8000000080000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if ((0x10000000100000L & l) != 0L && kind > 17)
                     kind = 17;
                  break;
               case 10:
               case 13:
                  if ((0x8000000080000L & l) != 0L)
                     { jjCheckNAdd(9); }
                  break;
               case 12:
                  if ((0x80000000800000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 15:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 16:
                  if ((0x10000000100000L & l) != 0L && kind > 18)
                     kind = 18;
                  break;
               case 20:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 23:
                  if ((0x100000001000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 24:
                  if ((0x10000000100000L & l) != 0L && kind > 19)
                     kind = 19;
                  break;
               case 25:
                  if ((0x400000004000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 26:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 28:
                  if ((0x4000000040L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 29:
                  if ((0x80000000800L & l) != 0L && kind > 19)
                     kind = 19;
                  break;
               case 32:
                  if ((0x400000004L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 31;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 36 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, "\75", 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, "\173", "\175", "\73", "\50", "\51", "\54", "\50\51", "\72", };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {0
};

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

    /** Constructor. */
    public RobotTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public RobotTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 36; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, 
};
static final long[] jjtoToken = {
   0x7faffffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static final long[] jjtoSpecial = {
   0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[36];
    private final int[] jjstateSet = new int[2 * 36];
    private final StringBuilder jjimage = new StringBuilder();
    private StringBuilder image = jjimage;
    private int jjimageLen;
    private int lengthOfMatch;
    protected int curChar;
}
