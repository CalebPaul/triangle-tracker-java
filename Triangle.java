class Triangle {
  public int mSide1;
  public int mSide2;
  public int mSide3;
  public boolean mType;

public Triangle(int sideOne, int sideTwo, int sideThree){
  mSide1 = sideOne;
  mSide2 = sideTwo;
  mSide3 = sideThree;
}

  public boolean notTriangle(){
    if ((mSide1 + mSide2 <= mSide3) ||
            (mSide1 + mSide3 <= mSide2) ||
            (mSide2 + mSide3 <= mSide1)) {
    return true;
  } return false;
}
  public boolean equilateral(){
    if ((mSide1 == mSide2) && (mSide1 == mSide3)){
    return true;
  } return false;
}
  public boolean isosceles(){
    if ((mSide1 == mSide2) || (mSide1 == mSide2) || (mSide2 == mSide3)){
    return true;
  } return false;
}
  public boolean scalene(){
    if ((mSide1 != mSide2) && (mSide1 != mSide2) && (mSide2 != mSide3)){
    return true;
  } return false;
}
}
