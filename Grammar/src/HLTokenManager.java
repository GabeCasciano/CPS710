/* Generated By:JavaCC: Do not edit this line. HLTokenManager.java */

/** Token Manager. */
public class HLTokenManager implements HLConstants
{
    public static int commentdepth = 0;

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0, long active1)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0xffffffe0000000L) != 0L)
         {
            jjmatchedKind = 59;
            return 2;
         }
         if ((active0 & 0x100L) != 0L || (active1 & 0x200L) != 0L)
            return 3;
         return -1;
      case 1:
         if ((active0 & 0x2010c420000000L) != 0L)
            return 2;
         if ((active0 & 0xdfef3bc0000000L) != 0L)
         {
            jjmatchedKind = 59;
            jjmatchedPos = 1;
            return 2;
         }
         return -1;
      case 2:
         if ((active0 & 0xe0d0900000000L) != 0L)
            return 2;
         if ((active0 & 0xd1e232c0000000L) != 0L)
         {
            jjmatchedKind = 59;
            jjmatchedPos = 2;
            return 2;
         }
         return -1;
      case 3:
         if ((active0 & 0x500210c0000000L) != 0L)
            return 2;
         if ((active0 & 0x81e02200000000L) != 0L)
         {
            jjmatchedKind = 59;
            jjmatchedPos = 3;
            return 2;
         }
         return -1;
      case 4:
         if ((active0 & 0x80c00200000000L) != 0L)
            return 2;
         if ((active0 & 0x1202000000000L) != 0L)
         {
            if (jjmatchedPos != 4)
            {
               jjmatchedKind = 59;
               jjmatchedPos = 4;
            }
            return 2;
         }
         return -1;
      case 5:
         if ((active0 & 0x1000000000000L) != 0L)
            return 2;
         if ((active0 & 0xa02000000000L) != 0L)
         {
            jjmatchedKind = 59;
            jjmatchedPos = 5;
            return 2;
         }
         return -1;
      case 6:
         if ((active0 & 0x800000000000L) != 0L)
            return 2;
         if ((active0 & 0x202000000000L) != 0L)
         {
            jjmatchedKind = 59;
            jjmatchedPos = 6;
            return 2;
         }
         return -1;
      case 7:
         if ((active0 & 0x2000000000L) != 0L)
            return 2;
         if ((active0 & 0x200000000000L) != 0L)
         {
            jjmatchedKind = 59;
            jjmatchedPos = 7;
            return 2;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0, long active1)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 22;
         return jjMoveStringLiteralDfa1_0(0x300000L, 0x0L);
      case 34:
         return jjStopAtPos(0, 60);
      case 37:
         return jjStopAtPos(0, 17);
      case 38:
         return jjStopAtPos(0, 5);
      case 40:
         return jjStopAtPos(0, 16);
      case 41:
         return jjStopAtPos(0, 27);
      case 42:
         return jjStopAtPos(0, 25);
      case 43:
         return jjStopAtPos(0, 24);
      case 44:
         return jjStopAtPos(0, 7);
      case 45:
         return jjStopAtPos(0, 18);
      case 47:
         jjmatchedKind = 8;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x200L);
      case 59:
         return jjStopAtPos(0, 28);
      case 60:
         jjmatchedKind = 14;
         return jjMoveStringLiteralDfa1_0(0x82000L, 0x0L);
      case 61:
         jjmatchedKind = 6;
         return jjMoveStringLiteralDfa1_0(0x1200L, 0x0L);
      case 62:
         jjmatchedKind = 11;
         return jjMoveStringLiteralDfa1_0(0x400L, 0x0L);
      case 68:
         return jjMoveStringLiteralDfa1_0(0x20000000L, 0x0L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x1c0000000L, 0x0L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x3e00000000L, 0x0L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x1c000000000L, 0x0L);
      case 78:
         return jjMoveStringLiteralDfa1_0(0x60000000000L, 0x0L);
      case 79:
         return jjMoveStringLiteralDfa1_0(0x180000000000L, 0x0L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0xe00000000000L, 0x0L);
      case 82:
         return jjMoveStringLiteralDfa1_0(0x1000000000000L, 0x0L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0xe000000000000L, 0x0L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x70000000000000L, 0x0L);
      case 87:
         return jjMoveStringLiteralDfa1_0(0x80000000000000L, 0x0L);
      case 123:
         return jjStopAtPos(0, 15);
      case 124:
         return jjStopAtPos(0, 23);
      case 125:
         return jjStopAtPos(0, 26);
      default :
         return jjMoveNfa_0(1, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0, long active1)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, active1);
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active1 & 0x200L) != 0L)
            return jjStopAtPos(1, 73);
         break;
      case 61:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(1, 9);
         else if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(1, 10);
         else if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(1, 13);
         else if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(1, 20);
         break;
      case 62:
         if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(1, 19);
         break;
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000000L, active1, 0L);
      case 66:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000000L, active1, 0L);
      case 68:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 44, 2);
         break;
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x3000000000000L, active1, 0L);
      case 70:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 38, 2);
         break;
      case 72:
         return jjMoveStringLiteralDfa2_0(active0, 0x90000000000000L, active1, 0L);
      case 73:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(1, 34, 2);
         break;
      case 76:
         return jjMoveStringLiteralDfa2_0(active0, 0xc0000000L, active1, 0L);
      case 78:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 39, 2);
         return jjMoveStringLiteralDfa2_0(active0, 0x100000000L, active1, 0L);
      case 79:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(1, 29, 2);
         else if ((active0 & 0x20000000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 53, 2);
         return jjMoveStringLiteralDfa2_0(active0, 0x800000000L, active1, 0L);
      case 82:
         return jjMoveStringLiteralDfa2_0(active0, 0x40e01000000000L, active1, 0L);
      case 83:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000000L, active1, 0L);
      case 84:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000000000L, active1, 0L);
      case 85:
         return jjMoveStringLiteralDfa2_0(active0, 0x4062000000000L, active1, 0L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x201000L, active1, 0L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0, active1);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(0, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, 0L);
      return 2;
   }
   switch(curChar)
   {
      case 65:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 40, 2);
         break;
      case 66:
         if ((active0 & 0x4000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 50, 2);
         break;
      case 68:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(2, 32, 2);
         break;
      case 69:
         return jjMoveStringLiteralDfa3_0(active0, 0x10200000000000L);
      case 73:
         return jjMoveStringLiteralDfa3_0(active0, 0x80c00040000000L);
      case 74:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 43, 2);
         break;
      case 76:
         return jjMoveStringLiteralDfa3_0(active0, 0x20200000000L);
      case 77:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 42, 2);
         break;
      case 78:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000L);
      case 79:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000000L);
      case 82:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(2, 35, 2);
         else if ((active0 & 0x8000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 51, 2);
         break;
      case 83:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000000L);
      case 84:
         if ((active0 & 0x2000000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 49, 2);
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000000000L);
      case 85:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000000000L);
      case 110:
         if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(2, 12);
         else if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(2, 21);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0, 0L);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, 0L);
      return 3;
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000000L);
      case 68:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000000L);
      case 69:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(3, 31, 2);
         else if ((active0 & 0x40000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 54, 2);
         break;
      case 70:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(3, 30, 2);
         break;
      case 76:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 41, 2);
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000000000L);
      case 77:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 36, 2);
         break;
      case 78:
         if ((active0 & 0x10000000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 52, 2);
         return jjMoveStringLiteralDfa4_0(active0, 0xc00000000000L);
      case 83:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000L);
      case 85:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, 0L);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, 0L);
      return 4;
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(4, 33, 2);
         else if ((active0 & 0x80000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 55, 2);
         break;
      case 73:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000000L);
      case 82:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000000000L);
      case 84:
         if ((active0 & 0x400000000000L) != 0L)
         {
            jjmatchedKind = 46;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x802000000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0, 0L);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0, 0L);
      return 5;
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa6_0(active0, 0x200000000000L);
      case 73:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000000000L);
      case 76:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000000000L);
      case 78:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 48, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0, 0L);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0, 0L);
      return 6;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa7_0(active0, 0x200000000000L);
      case 78:
         if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 47, 2);
         break;
      case 79:
         return jjMoveStringLiteralDfa7_0(active0, 0x2000000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0, 0L);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0, 0L);
      return 7;
   }
   switch(curChar)
   {
      case 78:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 37, 2);
         break;
      case 84:
         return jjMoveStringLiteralDfa8_0(active0, 0x200000000000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0, 0L);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0, 0L);
      return 8;
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 45, 2);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0, 0L);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 9;
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
               case 1:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 58)
                        kind = 58;
                     jjCheckNAdd(0);
                  }
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 58)
                     kind = 58;
                  jjCheckNAdd(0);
                  break;
               case 2:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 59)
                     kind = 59;
                  jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 3:
                  if (curChar == 47)
                     jjCheckNAddStates(0, 2);
                  break;
               case 4:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 5:
                  if ((0x2400L & l) != 0L && kind > 72)
                     kind = 72;
                  break;
               case 6:
                  if (curChar == 10 && kind > 72)
                     kind = 72;
                  break;
               case 7:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 3;
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
               case 1:
               case 2:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 59)
                     kind = 59;
                  jjCheckNAdd(2);
                  break;
               case 4:
                  jjAddStates(0, 2);
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
               case 4:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 2);
                  break;
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
      if ((i = jjnewStateCnt) == (startsAt = 9 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static private int jjMoveStringLiteralDfa0_3()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_3(0x4000L);
      case 47:
         return jjMoveStringLiteralDfa1_3(0x2000L);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa1_3(long active1)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active1 & 0x2000L) != 0L)
            return jjStopAtPos(1, 77);
         break;
      case 47:
         if ((active1 & 0x4000L) != 0L)
            return jjStopAtPos(1, 78);
         break;
      default :
         return 2;
   }
   return 2;
}
static private int jjMoveStringLiteralDfa0_2()
{
   switch(curChar)
   {
      case 42:
         return jjMoveStringLiteralDfa1_2(0x400L);
      case 47:
         return jjMoveStringLiteralDfa1_2(0x800L);
      default :
         return 1;
   }
}
static private int jjMoveStringLiteralDfa1_2(long active1)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 42:
         if ((active1 & 0x800L) != 0L)
            return jjStopAtPos(1, 75);
         break;
      case 47:
         if ((active1 & 0x400L) != 0L)
            return jjStopAtPos(1, 74);
         break;
      default :
         return 2;
   }
   return 2;
}
private static final int jjStopStringLiteralDfa_1(int pos, long active0, long active1)
{
   switch (pos)
   {
      default :
         return -1;
   }
}
private static final int jjStartNfa_1(int pos, long active0, long active1)
{
   return jjMoveNfa_1(jjStopStringLiteralDfa_1(pos, active0, active1), pos + 1);
}
static private int jjMoveStringLiteralDfa0_1()
{
   switch(curChar)
   {
      case 34:
         return jjStopAtPos(0, 65);
      case 92:
         return jjMoveStringLiteralDfa1_1(0xe000000000000000L, 0x1L);
      default :
         return jjMoveNfa_1(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_1(long active0, long active1)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_1(0, active0, active1);
      return 1;
   }
   switch(curChar)
   {
      case 34:
         if ((active0 & 0x4000000000000000L) != 0L)
            return jjStopAtPos(1, 62);
         break;
      case 92:
         if ((active0 & 0x2000000000000000L) != 0L)
            return jjStopAtPos(1, 61);
         break;
      case 110:
         if ((active1 & 0x1L) != 0L)
            return jjStopAtPos(1, 64);
         break;
      case 116:
         if ((active0 & 0x8000000000000000L) != 0L)
            return jjStopAtPos(1, 63);
         break;
      default :
         break;
   }
   return jjStartNfa_1(0, active0, active1);
}
static private int jjMoveNfa_1(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 6;
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
               case 0:
                  if ((0x20002f7a00000000L & l) != 0L)
                  {
                     if (kind > 68)
                        kind = 68;
                  }
                  else if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 66)
                        kind = 66;
                  }
                  else if ((0xd000d00100000000L & l) != 0L)
                  {
                     if (kind > 71)
                        kind = 71;
                  }
                  else if ((0xc00008000000000L & l) != 0L)
                  {
                     if (kind > 70)
                        kind = 70;
                  }
                  break;
               case 2:
                  if ((0x20002f7a00000000L & l) != 0L)
                     kind = 68;
                  break;
               case 4:
                  if ((0xc00008000000000L & l) != 0L)
                     kind = 70;
                  break;
               case 5:
                  if ((0xd000d00100000000L & l) != 0L)
                     kind = 71;
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
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 67)
                        kind = 67;
                  }
                  else if ((0x3800000028000000L & l) != 0L)
                  {
                     if (kind > 69)
                        kind = 69;
                  }
                  else if ((0x40000001c0000001L & l) != 0L)
                  {
                     if (kind > 68)
                        kind = 68;
                  }
                  break;
               case 1:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     kind = 67;
                  break;
               case 2:
                  if ((0x40000001c0000001L & l) != 0L)
                     kind = 68;
                  break;
               case 3:
                  if ((0x3800000028000000L & l) != 0L)
                     kind = 69;
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
      if ((i = jjnewStateCnt) == (startsAt = 6 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   4, 5, 7, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\46", "\75", "\54", "\57", "\75\75", "\76\75", 
"\76", "\75\151\156", "\74\75", "\74", "\173", "\50", "\45", "\55", "\74\76", 
"\41\75", "\41\151\156", "\41", "\174", "\53", "\52", "\175", "\51", "\73", "\104\117", 
"\105\114\111\106", "\105\114\123\105", "\105\116\104", "\106\101\114\123\105", "\106\111", 
"\106\117\122", "\106\122\117\115", "\106\125\116\103\124\111\117\116", "\111\106", 
"\111\116", "\111\123\101", "\116\125\114\114", "\116\125\115", "\117\102\112", 
"\117\104", "\120\122\105\104\111\103\101\124\105", "\120\122\111\116\124", 
"\120\122\111\116\124\114\116", "\122\105\124\125\122\116", "\123\105\124", "\123\125\102", "\123\124\122", 
"\124\110\105\116", "\124\117", "\124\122\125\105", "\127\110\111\114\105", null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
   "INSTRING",
   "INCOMMENT0",
   "INCOMMENT1",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, 2, 0, 
   3, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xcffffffffffffe1L, 0x2L, 
};
static final long[] jjtoSkip = {
   0x1eL, 0x500L, 
};
static final long[] jjtoSpecial = {
   0x0L, 0x500L, 
};
static final long[] jjtoMore = {
   0xf000000000000000L, 0xfafdL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[9];
static private final int[] jjstateSet = new int[18];
private static final StringBuilder jjimage = new StringBuilder();
private static StringBuilder image = jjimage;
private static int jjimageLen;
private static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public HLTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public HLTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 9; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 4 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
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

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   for (;;)
   {
     switch(curLexState)
     {
       case 0:
         try { input_stream.backup(0);
            while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
               curChar = input_stream.BeginToken();
         }
         catch (java.io.IOException e1) { continue EOFLoop; }
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_0();
         break;
       case 1:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_1();
         break;
       case 2:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_2();
         if (jjmatchedPos == 0 && jjmatchedKind > 76)
         {
            jjmatchedKind = 76;
         }
         break;
       case 3:
         jjmatchedKind = 0x7fffffff;
         jjmatchedPos = 0;
         curPos = jjMoveStringLiteralDfa0_3();
         if (jjmatchedPos == 0 && jjmatchedKind > 79)
         {
            jjmatchedKind = 79;
         }
         break;
     }
     if (jjmatchedKind != 0x7fffffff)
     {
        if (jjmatchedPos + 1 < curPos)
           input_stream.backup(curPos - jjmatchedPos - 1);
        if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           matchedToken = jjFillToken();
           matchedToken.specialToken = specialToken;
       if (jjnewLexState[jjmatchedKind] != -1)
         curLexState = jjnewLexState[jjmatchedKind];
           return matchedToken;
        }
        else if ((jjtoSkip[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
        {
           if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
           {
              matchedToken = jjFillToken();
              if (specialToken == null)
                 specialToken = matchedToken;
              else
              {
                 matchedToken.specialToken = specialToken;
                 specialToken = (specialToken.next = matchedToken);
              }
              SkipLexicalActions(matchedToken);
           }
           else
              SkipLexicalActions(null);
         if (jjnewLexState[jjmatchedKind] != -1)
           curLexState = jjnewLexState[jjmatchedKind];
           continue EOFLoop;
        }
        MoreLexicalActions();
      if (jjnewLexState[jjmatchedKind] != -1)
        curLexState = jjnewLexState[jjmatchedKind];
        curPos = 0;
        jjmatchedKind = 0x7fffffff;
        try {
           curChar = input_stream.readChar();
           continue;
        }
        catch (java.io.IOException e1) { }
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
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
static void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      case 75 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
              commentdepth++;
         break;
      case 77 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
              commentdepth++;
         break;
      case 78 :
         image.append(input_stream.GetSuffix(jjimageLen));
         jjimageLen = 0;
              commentdepth--; if (commentdepth==0) SwitchTo(INCOMMENT0);
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
